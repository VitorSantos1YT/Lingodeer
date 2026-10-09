package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.internal.r;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConfigFetchHandler {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f20709j = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f20710k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseInstallationsApi f20711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f20713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Clock f20714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f20715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConfigCacheClient f20716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConfigFetchHttpClient f20717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConfigSharedPrefsClient f20718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f20719i;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FetchResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConfigContainer f20721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f20722c;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        @Retention(RetentionPolicy.SOURCE)
        public @interface Status {
        }

        public FetchResponse(int i11, ConfigContainer configContainer, String str) {
            this.f20720a = i11;
            this.f20721b = configContainer;
            this.f20722c = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        FetchType(String str) {
            this.value = str;
        }

        public final String a() {
            return this.value;
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigSharedPrefsClient configSharedPrefsClient, HashMap map) {
        this.f20711a = firebaseInstallationsApi;
        this.f20712b = provider;
        this.f20713c = executor;
        this.f20714d = clock;
        this.f20715e = random;
        this.f20716f = configCacheClient;
        this.f20717g = configFetchHttpClient;
        this.f20718h = configSharedPrefsClient;
        this.f20719i = map;
    }

    public final FetchResponse a(String str, String str2, Date date, HashMap map) throws FirebaseRemoteConfigFetchThrottledException, FirebaseRemoteConfigClientException, FirebaseRemoteConfigServerException {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.f20717g.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f20717g;
            HashMap mapD = d();
            String string = this.f20718h.f20763a.getString("last_fetch_etag", null);
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.f20712b.get();
            FetchResponse fetchResponseFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, analyticsConnector != null ? (Long) analyticsConnector.a(true).get("_fot") : null, date, this.f20718h.b());
            ConfigContainer configContainer = fetchResponseFetch.f20721b;
            if (configContainer != null) {
                ConfigSharedPrefsClient configSharedPrefsClient = this.f20718h;
                long j11 = configContainer.f20701f;
                synchronized (configSharedPrefsClient.f20764b) {
                    configSharedPrefsClient.f20763a.edit().putLong("last_template_version", j11).apply();
                }
            }
            String str4 = fetchResponseFetch.f20722c;
            if (str4 != null) {
                ConfigSharedPrefsClient configSharedPrefsClient2 = this.f20718h;
                synchronized (configSharedPrefsClient2.f20764b) {
                    configSharedPrefsClient2.f20763a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f20718h.d(0, ConfigSharedPrefsClient.f20762f);
            return fetchResponseFetch;
        } catch (FirebaseRemoteConfigServerException e8) {
            int i11 = e8.f20657a;
            ConfigSharedPrefsClient configSharedPrefsClient3 = this.f20718h;
            if (i11 == 429 || i11 == 502 || i11 == 503 || i11 == 504) {
                int i12 = configSharedPrefsClient3.a().f20767a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f20710k;
                long millis = timeUnit.toMillis(iArr[Math.min(i12, iArr.length) - 1]);
                configSharedPrefsClient3.d(i12, new Date(date.getTime() + (millis / 2) + ((long) this.f20715e.nextInt((int) millis))));
            }
            ConfigSharedPrefsClient.BackoffMetadata backoffMetadataA = configSharedPrefsClient3.a();
            int i13 = e8.f20657a;
            if (backoffMetadataA.f20767a > 1 || i13 == 429) {
                backoffMetadataA.f20768b.getTime();
                throw new FirebaseRemoteConfigFetchThrottledException("Fetch was throttled.");
            }
            if (i13 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i13 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i13 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i13 != 500) {
                    switch (i13) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new FirebaseRemoteConfigServerException(e8.f20657a, "Fetch failed: ".concat(str3), e8);
        }
    }

    public final Task b(Task task, long j11, HashMap map) {
        Task taskContinueWithTask;
        boolean zBefore;
        Date date = new Date(this.f20714d.a());
        boolean zIsSuccessful = task.isSuccessful();
        ConfigSharedPrefsClient configSharedPrefsClient = this.f20718h;
        if (zIsSuccessful) {
            Date date2 = new Date(configSharedPrefsClient.f20763a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(ConfigSharedPrefsClient.f20761e)) {
                zBefore = false;
            } else {
                zBefore = date.before(new Date(TimeUnit.SECONDS.toMillis(j11) + date2.getTime()));
            }
            if (zBefore) {
                return Tasks.forResult(new FetchResponse(2, null, null));
            }
        }
        Date date3 = configSharedPrefsClient.a().f20768b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f20713c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            taskContinueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(str));
        } else {
            FirebaseInstallationsApi firebaseInstallationsApi = this.f20711a;
            Task id2 = firebaseInstallationsApi.getId();
            Task taskA = firebaseInstallationsApi.a();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id2, taskA}).continueWithTask(executor, new r(this, id2, taskA, date, map));
        }
        return taskContinueWithTask.continueWithTask(executor, new e(5, this, date));
    }

    public final Task c(FetchType fetchType, int i11) {
        HashMap map = new HashMap(this.f20719i);
        map.put("X-Firebase-RC-Fetch-Type", fetchType.a() + "/" + i11);
        return this.f20716f.b().continueWithTask(this.f20713c, new e(4, this, map));
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.f20712b.get();
        if (analyticsConnector != null) {
            for (Map.Entry entry : analyticsConnector.a(false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
