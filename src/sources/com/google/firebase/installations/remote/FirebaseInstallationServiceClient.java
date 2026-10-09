package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseInstallationServiceClient {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f20415d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f20416e = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RequestLimiter f20419c = new RequestLimiter();

    public FirebaseInstallationServiceClient(Context context, Provider provider) {
        this.f20417a = context;
        this.f20418b = provider;
    }

    public static URL c(String str) throws FirebaseInstallationsException {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e8) {
            throw new FirebaseInstallationsException(e8.getMessage());
        }
    }

    public static void d(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f20416e));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str)) {
            return;
        }
        new StringBuilder(", ").append(str);
    }

    public static long f(String str) {
        Preconditions.a("Invalid Expiration Timestamp.", f20415d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static InstallationResponse g(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f20416e));
        AutoValue_TokenResult.Builder builder = new AutoValue_TokenResult.Builder();
        builder.f20412b = 0L;
        builder.f20414d = (byte) (builder.f20414d | 1);
        AutoValue_InstallationResponse.Builder builder2 = new AutoValue_InstallationResponse.Builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                builder2.f20404a = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                builder2.f20405b = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                builder2.f20406c = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        builder.f20411a = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        builder.f20412b = f(jsonReader.nextString());
                        builder.f20414d = (byte) (builder.f20414d | 1);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                builder2.f20407d = builder.a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new AutoValue_InstallationResponse(builder2.f20404a, builder2.f20405b, builder2.f20406c, builder2.f20407d, InstallationResponse.ResponseCode.OK);
    }

    public static TokenResult h(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f20416e));
        AutoValue_TokenResult.Builder builder = new AutoValue_TokenResult.Builder();
        builder.f20412b = 0L;
        builder.f20414d = (byte) (builder.f20414d | 1);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                builder.f20411a = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                builder.f20412b = f(jsonReader.nextString());
                builder.f20414d = (byte) (builder.f20414d | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        builder.f20413c = TokenResult.ResponseCode.OK;
        return builder.a();
    }

    public static void i(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.1.0");
            k(httpURLConnection, jSONObject.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static void j(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.1.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            k(httpURLConnection, jSONObject2.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static void k(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final InstallationResponse a(String str, String str2, String str3, String str4, String str5) {
        RequestLimiter requestLimiter = this.f20419c;
        if (!requestLimiter.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlC = c("projects/" + str3 + "/installations");
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionE = e(urlC, str);
            try {
                try {
                    httpURLConnectionE.setRequestMethod("POST");
                    httpURLConnectionE.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionE.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    try {
                        i(httpURLConnectionE, str2, str4);
                        int responseCode = httpURLConnectionE.getResponseCode();
                        requestLimiter.b(responseCode);
                        if (responseCode < 200 || responseCode >= 300) {
                            z11 = false;
                        }
                        if (z11) {
                            InstallationResponse installationResponseG = g(httpURLConnectionE);
                            httpURLConnectionE.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            return installationResponseG;
                        }
                        d(httpURLConnectionE, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            AutoValue_InstallationResponse.Builder builder = new AutoValue_InstallationResponse.Builder();
                            AutoValue_InstallationResponse autoValue_InstallationResponse = new AutoValue_InstallationResponse(builder.f20404a, builder.f20405b, builder.f20406c, builder.f20407d, InstallationResponse.ResponseCode.BAD_CONFIG);
                            httpURLConnectionE.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            return autoValue_InstallationResponse;
                        }
                        httpURLConnectionE.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (IOException | AssertionError unused2) {
                }
            } catch (Throwable th2) {
                httpURLConnectionE.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
    }

    public final TokenResult b(String str, String str2, String str3, String str4) {
        TokenResult tokenResultH;
        RequestLimiter requestLimiter = this.f20419c;
        if (!requestLimiter.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlC = c("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i11 = 0; i11 <= 1; i11++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionE = e(urlC, str);
            try {
                try {
                    httpURLConnectionE.setRequestMethod("POST");
                    httpURLConnectionE.addRequestProperty(HttpHeaders.AUTHORIZATION, "FIS_v2 " + str4);
                    httpURLConnectionE.setDoOutput(true);
                    j(httpURLConnectionE);
                    int responseCode = httpURLConnectionE.getResponseCode();
                    requestLimiter.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        tokenResultH = h(httpURLConnectionE);
                    } else {
                        d(httpURLConnectionE, null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            AutoValue_TokenResult.Builder builder = new AutoValue_TokenResult.Builder();
                            builder.f20412b = 0L;
                            builder.f20414d = (byte) (1 | builder.f20414d);
                            builder.f20413c = TokenResult.ResponseCode.AUTH_ERROR;
                            tokenResultH = builder.a();
                        } else {
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                AutoValue_TokenResult.Builder builder2 = new AutoValue_TokenResult.Builder();
                                builder2.f20412b = 0L;
                                builder2.f20414d = (byte) (1 | builder2.f20414d);
                                builder2.f20413c = TokenResult.ResponseCode.BAD_CONFIG;
                                tokenResultH = builder2.a();
                            }
                            httpURLConnectionE.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    httpURLConnectionE.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return tokenResultH;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th2) {
                httpURLConnectionE.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final HttpURLConnection e(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
            httpURLConnection.addRequestProperty(HttpHeaders.CACHE_CONTROL, "no-cache");
            Context context = this.f20417a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            HeartBeatController heartBeatController = (HeartBeatController) this.f20418b.get();
            if (heartBeatController != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(heartBeatController.a()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            String strA = null;
            try {
                byte[] bArrA = AndroidUtilsLight.a(context, context.getPackageName());
                if (bArrA == null) {
                    context.getPackageName();
                } else {
                    strA = Hex.a(bArrA);
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                context.getPackageName();
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", strA);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused4) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
