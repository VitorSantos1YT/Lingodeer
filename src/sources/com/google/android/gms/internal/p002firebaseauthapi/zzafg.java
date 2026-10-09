package com.google.android.gms.internal.p002firebaseauthapi;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafg {
    public static void a(String str, zzaei zzaeiVar, zzafd zzafdVar, zzael zzaelVar, zzaem zzaemVar) {
        try {
            Preconditions.g(zzaeiVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzaeiVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzaemVar.a(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                c(httpURLConnection, zzafdVar, zzaelVar);
            } catch (Throwable th2) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (SocketTimeoutException unused) {
            zzafdVar.zza("TIMEOUT");
        } catch (IOException e8) {
            e = e8;
            zzafdVar.zza(e.getMessage());
        } catch (NullPointerException e10) {
            e = e10;
            zzafdVar.zza(e.getMessage());
        } catch (UnknownHostException unused2) {
            zzafdVar.zza("<<Network Error>>");
        } catch (JSONException e11) {
            e = e11;
            zzafdVar.zza(e.getMessage());
        }
    }

    public static void b(String str, zzafd zzafdVar, zzael zzaelVar, zzaem zzaemVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzaemVar.a(httpURLConnection);
            c(httpURLConnection, zzafdVar, zzaelVar);
        } catch (SocketTimeoutException unused) {
            zzafdVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzafdVar.zza("<<Network Error>>");
        } catch (IOException e8) {
            zzafdVar.zza(e8.getMessage());
        }
    }

    public static void c(HttpURLConnection httpURLConnection, zzafd zzafdVar, zzael zzaelVar) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                boolean z11 = false;
                InputStream inputStream = responseCode >= 200 && responseCode < 300 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb2.append(line);
                        }
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                bufferedReader.close();
                String string = sb2.toString();
                if (responseCode >= 200 && responseCode < 300) {
                    z11 = true;
                }
                if (z11) {
                    zzafdVar.a(zzaej.a(string, zzaelVar));
                } else {
                    zzafdVar.zza(zzaej.b(string));
                }
                httpURLConnection.disconnect();
            } catch (Throwable th4) {
                httpURLConnection.disconnect();
                throw th4;
            }
        } catch (zzabz e8) {
            e = e8;
            zzafdVar.zza(e.getMessage());
            httpURLConnection.disconnect();
        } catch (SocketTimeoutException unused) {
            zzafdVar.zza("TIMEOUT");
            httpURLConnection.disconnect();
        } catch (IOException e10) {
            e = e10;
            zzafdVar.zza(e.getMessage());
            httpURLConnection.disconnect();
        }
    }
}
