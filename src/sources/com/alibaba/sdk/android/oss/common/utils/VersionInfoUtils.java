package com.alibaba.sdk.android.oss.common.utils;

import aj.uZCn.evRpcb;
import android.os.Build;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.alibaba.sdk.android.oss.common.OSSLog;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class VersionInfoUtils {
    private static String userAgent;

    public static String getUserAgent(String str) {
        if (OSSUtils.isEmptyString(userAgent)) {
            userAgent = "aliyun-sdk-android/" + getVersion() + getSystemInfo();
        }
        return OSSUtils.isEmptyString(str) ? userAgent : p.u(new StringBuilder(), userAgent, "/", str);
    }

    public static String getVersion() {
        return OSSConstants.SDK_VERSION;
    }

    private static String getSystemInfo() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(System.getProperty("os.name"));
        sb2.append("/Android " + Build.VERSION.RELEASE);
        sb2.append("/");
        sb2.append(HttpUtil.urlEncode(Build.MODEL, "utf-8") + ";" + HttpUtil.urlEncode(Build.ID, "utf-8"));
        sb2.append(")");
        String string = sb2.toString();
        OSSLog.logDebug(evRpcb.WFu + string);
        return OSSUtils.isEmptyString(string) ? System.getProperty("http.agent").replaceAll("[^\\p{ASCII}]", "?") : string;
    }
}
