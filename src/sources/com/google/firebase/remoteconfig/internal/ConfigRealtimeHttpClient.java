package com.google.firebase.remoteconfig.internal;

import aj.uZCn.evRpcb;
import android.content.Context;
import android.content.pm.PackageManager;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConfigRealtimeHttpClient {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f20741r = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f20742s = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f20743a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20745c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HttpURLConnection f20748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f20749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConfigFetchHandler f20750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FirebaseApp f20751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FirebaseInstallationsApi f20752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ConfigCacheClient f20753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f20754l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConfigSharedPrefsClient f20757p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20744b = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Random f20755n = new Random();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final DefaultClock f20756o = DefaultClock.f9117a;
    public final String m = "firebase";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20746d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20747e = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f20758q = new Object();

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, LinkedHashSet linkedHashSet, ConfigSharedPrefsClient configSharedPrefsClient, ScheduledExecutorService scheduledExecutorService) {
        this.f20743a = linkedHashSet;
        this.f20749g = scheduledExecutorService;
        this.f20745c = Math.max(8 - configSharedPrefsClient.c().f20769a, 1);
        this.f20751i = firebaseApp;
        this.f20750h = configFetchHandler;
        this.f20752j = firebaseInstallationsApi;
        this.f20753k = configCacheClient;
        this.f20754l = context;
        this.f20757p = configSharedPrefsClient;
    }

    public static boolean d(int i11) {
        return i11 == 408 || i11 == 429 || i11 == 502 || i11 == 503 || i11 == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized boolean a() {
        return (this.f20743a.isEmpty() || this.f20744b || this.f20746d || this.f20747e) ? false : true;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f20748f;
        if (httpURLConnection != null && !this.f20747e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused2) {
            }
        }
    }

    public final String c(String str) {
        FirebaseApp firebaseApp = this.f20751i;
        firebaseApp.b();
        Matcher matcher = f20742s.matcher(firebaseApp.f17716c.f17732b);
        return ep.a.h("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j11) {
        try {
            if (a()) {
                int i11 = this.f20745c;
                if (i11 > 0) {
                    this.f20745c = i11 - 1;
                    this.f20749g.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zA;
                            ConfigRealtimeHttpClient configRealtimeHttpClient = ConfigRealtimeHttpClient.this;
                            synchronized (configRealtimeHttpClient) {
                                zA = configRealtimeHttpClient.a();
                                if (zA) {
                                    synchronized (configRealtimeHttpClient) {
                                        configRealtimeHttpClient.f20744b = true;
                                    }
                                }
                            }
                            if (zA) {
                                ConfigSharedPrefsClient.RealtimeBackoffMetadata realtimeBackoffMetadataC = configRealtimeHttpClient.f20757p.c();
                                configRealtimeHttpClient.f20756o.getClass();
                                if (new Date(System.currentTimeMillis()).before(realtimeBackoffMetadataC.f20770b)) {
                                    configRealtimeHttpClient.h();
                                    return;
                                }
                                FirebaseInstallationsApi firebaseInstallationsApi = configRealtimeHttpClient.f20752j;
                                Task taskA = firebaseInstallationsApi.a();
                                Task id2 = firebaseInstallationsApi.getId();
                                Task<TContinuationResult> taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskA, id2}).continueWithTask(configRealtimeHttpClient.f20749g, new com.google.firebase.crashlytics.internal.concurrency.a(configRealtimeHttpClient, taskA, id2, 2));
                                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskContinueWithTask}).continueWith(configRealtimeHttpClient.f20749g, new e(6, configRealtimeHttpClient, taskContinueWithTask));
                            }
                        }
                    }, j11, TimeUnit.MILLISECONDS);
                } else if (!this.f20747e) {
                    g(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again."));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f20743a.iterator();
        while (it.hasNext()) {
            ((ConfigUpdateListener) it.next()).a(firebaseRemoteConfigException);
        }
    }

    public final synchronized void h() {
        this.f20756o.getClass();
        e(Math.max(0L, this.f20757p.c().f20770b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final synchronized ConfigAutoFetch j(HttpURLConnection httpURLConnection) {
        return new ConfigAutoFetch(httpURLConnection, this.f20750h, this.f20753k, this.f20743a, new AnonymousClass2(), this.f20749g, this.f20757p);
    }

    public final void k(Date date) {
        ConfigSharedPrefsClient configSharedPrefsClient = this.f20757p;
        int i11 = configSharedPrefsClient.c().f20769a + 1;
        long millis = TimeUnit.MINUTES.toMillis(f20741r[(i11 < 8 ? i11 : 8) - 1]);
        configSharedPrefsClient.e(i11, new Date(date.getTime() + (millis / 2) + ((long) this.f20755n.nextInt((int) millis))));
    }

    public final void i(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        String strA;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        FirebaseApp firebaseApp = this.f20751i;
        firebaseApp.b();
        FirebaseOptions firebaseOptions = firebaseApp.f17716c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", firebaseOptions.f17731a);
        Context context = this.f20754l;
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
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        HashMap map = new HashMap();
        firebaseApp.b();
        Matcher matcher = f20742s.matcher(firebaseOptions.f17732b);
        map.put("project", matcher.matches() ? matcher.group(1) : null);
        map.put("namespace", this.m);
        map.put("lastKnownVersionNumber", Long.toString(this.f20750h.f20718h.f20763a.getLong("last_template_version", 0L)));
        firebaseApp.b();
        map.put("appId", firebaseOptions.f17732b);
        map.put("sdkVersion", "23.1.0");
        map.put(evRpcb.wEvaFT, str);
        byte[] bytes = new JSONObject(map).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 implements ConfigUpdateListener {
        public AnonymousClass2() {
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
        public final void a(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            ConfigRealtimeHttpClient configRealtimeHttpClient = ConfigRealtimeHttpClient.this;
            int[] iArr = ConfigRealtimeHttpClient.f20741r;
            synchronized (configRealtimeHttpClient) {
                configRealtimeHttpClient.f20746d = true;
            }
            ConfigRealtimeHttpClient.this.g(firebaseRemoteConfigException);
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
        public final void b(ConfigUpdate configUpdate) {
        }
    }
}
