package com.alibaba.sdk.android.oss.common.utils;

import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.alibaba.sdk.android.oss.internal.RequestMessage;
import com.alibaba.sdk.android.oss.signer.ServiceSignature;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SignUtils {
    public static String buildCanonicalString(String str, String str2, RequestMessage requestMessage, String str3) {
        StringBuilder sbR = e.r(str, "\n");
        Map headers = requestMessage.getHeaders();
        TreeMap treeMap = new TreeMap();
        if (headers != null) {
            for (Map.Entry entry : headers.entrySet()) {
                if (entry.getKey() != null) {
                    String lowerCase = ((String) entry.getKey()).toLowerCase();
                    if (lowerCase.equals(HttpHeaders.CONTENT_TYPE.toLowerCase()) || lowerCase.equals(HttpHeaders.CONTENT_MD5.toLowerCase()) || lowerCase.equals(HttpHeaders.DATE.toLowerCase()) || lowerCase.startsWith(OSSHeaders.OSS_PREFIX)) {
                        treeMap.put(lowerCase, ((String) entry.getValue()).trim());
                    }
                }
            }
        }
        if (!treeMap.containsKey(HttpHeaders.CONTENT_TYPE.toLowerCase())) {
            treeMap.put(HttpHeaders.CONTENT_TYPE.toLowerCase(), BuildConfig.VERSION_NAME);
        }
        if (!treeMap.containsKey(HttpHeaders.CONTENT_MD5.toLowerCase())) {
            treeMap.put(HttpHeaders.CONTENT_MD5.toLowerCase(), BuildConfig.VERSION_NAME);
        }
        for (Map.Entry entry2 : treeMap.entrySet()) {
            String str4 = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (str4.startsWith(OSSHeaders.OSS_PREFIX)) {
                sbR.append(str4);
                sbR.append(':');
                sbR.append(value);
            } else {
                sbR.append(value);
            }
            sbR.append("\n");
        }
        sbR.append(buildCanonicalizedResource(str2, requestMessage.getParameters()));
        return sbR.toString();
    }

    public static String buildCanonicalizedResource(String str, Map<String, String> map) {
        OSSUtils.assertTrue(str.startsWith("/"), "Resource path should start with slash character");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (map != null) {
            String[] strArr = (String[]) map.keySet().toArray(new String[map.size()]);
            Arrays.sort(strArr);
            char c11 = '?';
            for (String str2 : strArr) {
                if (SignParameters.SIGNED_PARAMTERS.contains(str2)) {
                    sb2.append(c11);
                    sb2.append(str2);
                    String str3 = map.get(str2);
                    if (str3 != null && !str3.trim().isEmpty()) {
                        sb2.append("=");
                        sb2.append(str3);
                    }
                    c11 = '&';
                }
            }
        }
        return sb2.toString();
    }

    public static String buildSignature(String str, String str2, String str3, RequestMessage requestMessage) {
        return ServiceSignature.create().computeSignature(str, buildCanonicalString(str2, str3, requestMessage, null));
    }

    public static String composeRequestAuthorization(String str, String str2) {
        return e.n(SignParameters.AUTHORIZATION_PREFIX, str, ":", str2);
    }
}
