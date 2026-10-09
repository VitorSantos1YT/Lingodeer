package com.alibaba.sdk.android.oss.common.utils;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class HttpUtil {
    private static final String[] ENCODED_CHARACTERS_WITH_SLASHES = {"+", "*", "%7E", "%2F"};
    private static final String[] ENCODED_CHARACTERS_WITH_SLASHES_REPLACEMENTS = {"%20", "%2A", "~", "/"};
    private static final String[] ENCODED_CHARACTERS_WITHOUT_SLASHES = {"+", "*", "%7E"};
    private static final String[] ENCODED_CHARACTERS_WITHOUT_SLASHES_REPLACEMENTS = {"%20", "%2A", "~"};

    public static String paramToQueryString(Map<String, String> map, String str) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!z11) {
                sb2.append("&");
            }
            sb2.append(urlEncode(key, str));
            if (value != null) {
                sb2.append("=");
                sb2.append(urlEncode(value, str));
            }
            z11 = false;
        }
        return sb2.toString();
    }

    public static String urlEncode(String str, String str2) {
        if (str == null) {
            return BuildConfig.VERSION_NAME;
        }
        try {
            return URLEncoder.encode(str, str2).replace("+", "%20").replace("*", "%2A").replace("%7E", "~").replace("%2F", "/");
        } catch (Exception e8) {
            throw new IllegalArgumentException("failed to encode url!", e8);
        }
    }

    public static String urlEncode(String str, boolean z11) {
        if (str == null) {
            return BuildConfig.VERSION_NAME;
        }
        try {
            String strEncode = URLEncoder.encode(str, "utf-8");
            if (!z11) {
                return StringUtils.replaceEach(strEncode, ENCODED_CHARACTERS_WITHOUT_SLASHES, ENCODED_CHARACTERS_WITHOUT_SLASHES_REPLACEMENTS);
            }
            return StringUtils.replaceEach(strEncode, ENCODED_CHARACTERS_WITH_SLASHES, ENCODED_CHARACTERS_WITH_SLASHES_REPLACEMENTS);
        } catch (UnsupportedEncodingException e8) {
            throw new IllegalArgumentException("FailedToEncodeUri", e8);
        }
    }
}
