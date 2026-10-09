package com.google.firebase.appcheck.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.appcheck.FirebaseAppCheck;
import com.google.firebase.appcheck.internal.util.Clock;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NetworkClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f17829e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface AttestationTokenType {
    }

    public NetworkClient(FirebaseApp firebaseApp) {
        firebaseApp.b();
        Context context = firebaseApp.f17714a;
        firebaseApp.b();
        FirebaseOptions firebaseOptions = firebaseApp.f17716c;
        Provider provider = ((DefaultFirebaseAppCheck) ((FirebaseAppCheck) firebaseApp.c(FirebaseAppCheck.class))).f17807b;
        Preconditions.g(context);
        Preconditions.g(firebaseOptions);
        Preconditions.g(provider);
        this.f17825a = context;
        this.f17826b = firebaseOptions.f17731a;
        this.f17827c = firebaseOptions.f17732b;
        String str = firebaseOptions.f17737g;
        this.f17828d = str;
        if (str == null) {
            throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
        }
        this.f17829e = provider;
    }

    public final String a(URL url, byte[] bArr, RetryManager retryManager, boolean z11) {
        String str;
        Context context = this.f17825a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        boolean z12 = true;
        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            HeartBeatController heartBeatController = (HeartBeatController) this.f17829e.get();
            String strA = null;
            if (heartBeatController != null) {
                try {
                    str = (String) Tasks.await(heartBeatController.a());
                } catch (Exception unused) {
                    str = null;
                }
            } else {
                str = null;
            }
            if (str != null) {
                httpURLConnection.setRequestProperty("X-Firebase-Client", str);
            }
            httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
            try {
                byte[] bArrA = AndroidUtilsLight.a(context, context.getPackageName());
                if (bArrA == null) {
                    context.getPackageName();
                } else {
                    strA = Hex.a(bArrA);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                context.getPackageName();
            }
            httpURLConnection.setRequestProperty("X-Android-Cert", strA);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bArr.length);
            try {
                bufferedOutputStream.write(bArr, 0, bArr.length);
                bufferedOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = responseCode >= 200 && responseCode < 300 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                    httpURLConnection.disconnect();
                    throw th;
                }
                bufferedReader.close();
                String string = sb2.toString();
                if (responseCode < 200 || responseCode >= 300) {
                    z12 = false;
                }
                if (z12) {
                    if (z11) {
                        retryManager.f17831b = 0L;
                        retryManager.f17832c = -1L;
                    }
                    httpURLConnection.disconnect();
                    return string;
                }
                Clock.DefaultClock defaultClock = retryManager.f17830a;
                retryManager.f17831b++;
                if (responseCode == 400 || responseCode == 404) {
                    defaultClock.getClass();
                    retryManager.f17832c = System.currentTimeMillis() + 86400000;
                } else {
                    long jPow = (long) (Math.pow(2.0d, retryManager.f17831b * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d);
                    defaultClock.getClass();
                    retryManager.f17832c = Math.min(jPow, 14400000L) + System.currentTimeMillis();
                }
                JSONObject jSONObject = new JSONObject(new JSONObject(string).optString("error"));
                throw new FirebaseException("Error returned from API. code: " + jSONObject.optInt("code") + " body: " + jSONObject.optString("message"));
            } catch (Throwable th4) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            httpURLConnection.disconnect();
            throw th6;
        }
    }
}
