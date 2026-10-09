package com.google.firebase.crashlytics.internal.network;

import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import dl.ExOZ.xItStCyvVEZ;
import ep.a;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class HttpGetRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f18867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f18868c = new HashMap();

    public HttpGetRequest(String str, HashMap map) {
        this.f18866a = str;
        this.f18867b = map;
    }

    public static String a(String str, HashMap map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), Constants.ENCODING) : BuildConfig.VERSION_NAME);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), Constants.ENCODING) : BuildConfig.VERSION_NAME);
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return a.D(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return e.m(str, string);
    }

    public final void c(String str, String str2) {
        this.f18868c.put(str, str2);
    }

    public final HttpResponse b() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        CrashlyticsWorkers.b();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL(a(this.f18866a, this.f18867b)).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod(xItStCyvVEZ.PfoL);
                for (Map.Entry entry : this.f18868c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, Constants.ENCODING));
                        char[] cArr = new char[OSSConstants.DEFAULT_BUFFER_SIZE];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int i11 = bufferedReader.read(cArr);
                            if (i11 == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, i11);
                        }
                        string = sb2.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new HttpResponse(responseCode, string);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }
}
