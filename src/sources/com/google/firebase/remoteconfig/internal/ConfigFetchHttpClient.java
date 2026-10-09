package com.google.firebase.remoteconfig.internal;

import a2.l;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import j$.util.DesugarTimeZone;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConfigFetchHttpClient {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f20723h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20730g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j11, long j12) {
        this.f20724a = context;
        this.f20725b = str;
        this.f20726c = str2;
        Matcher matcher = f20723h.matcher(str);
        this.f20727d = matcher.matches() ? matcher.group(1) : null;
        this.f20728e = "firebase";
        this.f20729f = j11;
        this.f20730g = j12;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i11 = bufferedReader.read();
            if (i11 == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) i11);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l9, Map map2) throws FirebaseRemoteConfigClientException {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.f20725b);
        Context context = this.f20724a;
        Locale locale = context.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        int i11 = Build.VERSION.SDK_INT;
        map3.put("languageCode", locale.toLanguageTag());
        map3.put("platformVersion", Integer.toString(i11));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put("appVersion", packageInfo.versionName);
                map3.put("appBuild", Long.toString(i11 >= 28 ? l.k(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", context.getPackageName());
        map3.put("sdkVersion", "23.1.0");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Objects.toString(map2.keySet());
        }
        if (l9 != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            map3.put("firstOpenTime", simpleDateFormat.format(l9));
        }
        return new JSONObject(map3);
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f20727d + "/namespaces/" + this.f20728e + ":fetch").openConnection();
        } catch (IOException e8) {
            throw new FirebaseRemoteConfigException(e8.getMessage());
        }
    }

    public ConfigFetchHandler.FetchResponse fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l9, Date date, Map<String, String> map3) {
        String strA;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        boolean z11;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f20729f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f20730g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f20726c);
        Context context = this.f20724a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrA = AndroidUtilsLight.a(context, context.getPackageName());
            if (bArrA == null) {
                context.getPackageName();
                strA = null;
            } else {
                strA = Hex.a(bArrA);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strA);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        try {
            try {
                d(httpURLConnection, a(str, str2, map, l9, map3).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField(HttpHeaders.ETAG);
                JSONObject jSONObjectC = c(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused2) {
                }
                try {
                    Date date2 = ConfigContainer.f20695h;
                    ConfigContainer.Builder builder = new ConfigContainer.Builder(0);
                    builder.f20704b = date;
                    try {
                        jSONObject = jSONObjectC.getJSONObject("entries");
                    } catch (JSONException unused3) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        try {
                            builder.f20703a = new JSONObject(jSONObject.toString());
                        } catch (JSONException unused4) {
                        }
                    }
                    try {
                        jSONArray = jSONObjectC.getJSONArray("experimentDescriptions");
                    } catch (JSONException unused5) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        try {
                            builder.f20705c = new JSONArray(jSONArray.toString());
                        } catch (JSONException unused6) {
                        }
                    }
                    try {
                        jSONObject2 = jSONObjectC.getJSONObject("personalizationMetadata");
                    } catch (JSONException unused7) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        try {
                            builder.f20706d = new JSONObject(jSONObject2.toString());
                        } catch (JSONException unused8) {
                        }
                    }
                    String string = jSONObjectC.has("templateVersion") ? jSONObjectC.getString("templateVersion") : null;
                    if (string != null) {
                        builder.f20707e = Long.parseLong(string);
                    }
                    try {
                        jSONArray2 = jSONObjectC.getJSONArray("rolloutMetadata");
                    } catch (JSONException unused9) {
                        jSONArray2 = null;
                    }
                    if (jSONArray2 != null) {
                        try {
                            builder.f20708f = new JSONArray(jSONArray2.toString());
                        } catch (JSONException unused10) {
                        }
                    }
                    ConfigContainer configContainerA = builder.a();
                    try {
                        z11 = !jSONObjectC.get("state").equals("NO_CHANGE");
                    } catch (JSONException unused11) {
                        z11 = true;
                    }
                    return !z11 ? new ConfigFetchHandler.FetchResponse(1, configContainerA, null) : new ConfigFetchHandler.FetchResponse(0, configContainerA, headerField);
                } catch (JSONException e8) {
                    throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e8);
                }
            } catch (Throwable th2) {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                    throw th2;
                } catch (IOException unused12) {
                    throw th2;
                }
            }
        } catch (IOException | JSONException e10) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e10);
        }
    }
}
