package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.lingodeer.data.model.AchievementLevelType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConfigAutoFetch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f20677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpURLConnection f20678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConfigFetchHandler f20679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConfigCacheClient f20680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConfigUpdateListener f20681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f20682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Random f20683g = new Random();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DefaultClock f20684h = DefaultClock.f9117a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConfigSharedPrefsClient f20685i;

    public ConfigAutoFetch(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, LinkedHashSet linkedHashSet, ConfigUpdateListener configUpdateListener, ScheduledExecutorService scheduledExecutorService, ConfigSharedPrefsClient configSharedPrefsClient) {
        this.f20678b = httpURLConnection;
        this.f20679c = configFetchHandler;
        this.f20680d = configCacheClient;
        this.f20677a = linkedHashSet;
        this.f20681e = configUpdateListener;
        this.f20682f = scheduledExecutorService;
        this.f20685i = configSharedPrefsClient;
    }

    public final void a(final int i11, final long j11) {
        if (i11 == 0) {
            c(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template."));
            return;
        }
        this.f20682f.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigAutoFetch.1
            @Override // java.lang.Runnable
            public final void run() {
                final ConfigAutoFetch configAutoFetch = ConfigAutoFetch.this;
                int i12 = i11;
                final long j12 = j11;
                synchronized (configAutoFetch) {
                    final int i13 = i12 - 1;
                    final Task taskC = configAutoFetch.f20679c.c(ConfigFetchHandler.FetchType.REALTIME, 3 - i13);
                    final Task taskB = configAutoFetch.f20680d.b();
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskB}).continueWithTask(configAutoFetch.f20682f, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.a
                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task) throws JSONException {
                            Boolean boolValueOf;
                            ConfigAutoFetch configAutoFetch2 = configAutoFetch;
                            Task task2 = taskC;
                            Task task3 = taskB;
                            long j13 = j12;
                            int i14 = i13;
                            if (!task2.isSuccessful()) {
                                return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task2.getException()));
                            }
                            if (!task3.isSuccessful()) {
                                return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task3.getException()));
                            }
                            ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) task2.getResult();
                            ConfigContainer configContainerA = (ConfigContainer) task3.getResult();
                            ConfigContainer configContainer = fetchResponse.f20721b;
                            if (configContainer != null) {
                                boolValueOf = Boolean.valueOf(configContainer.f20701f >= j13);
                            } else {
                                boolValueOf = Boolean.valueOf(fetchResponse.f20720a == 1);
                            }
                            Object obj = null;
                            if (!boolValueOf.booleanValue()) {
                                configAutoFetch2.a(i14, j13);
                                return Tasks.forResult(null);
                            }
                            if (fetchResponse.f20721b == null) {
                                return Tasks.forResult(null);
                            }
                            if (configContainerA == null) {
                                Date date = ConfigContainer.f20695h;
                                configContainerA = new ConfigContainer.Builder(0).a();
                            }
                            ConfigContainer configContainer2 = fetchResponse.f20721b;
                            JSONObject jSONObject = configContainerA.f20700e;
                            JSONObject jSONObject2 = configContainer2.f20696a;
                            JSONObject jSONObject3 = configContainer2.f20697b;
                            JSONObject jSONObject4 = configContainer2.f20700e;
                            JSONObject jSONObject5 = ConfigContainer.a(new JSONObject(jSONObject2.toString())).f20697b;
                            HashMap mapC = configContainerA.c();
                            HashMap mapC2 = configContainer2.c();
                            HashMap mapB = configContainerA.b();
                            HashMap mapB2 = configContainer2.b();
                            HashSet hashSet = new HashSet();
                            JSONObject jSONObject6 = configContainerA.f20697b;
                            Iterator<String> itKeys = jSONObject6.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (jSONObject3.has(next)) {
                                    Object obj2 = obj;
                                    if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                                        hashSet.add(next);
                                    } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                                        hashSet.add(next);
                                    } else if ((jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) || mapC.containsKey(next) != mapC2.containsKey(next)) {
                                        hashSet.add(next);
                                    } else if ((mapC.containsKey(next) && mapC2.containsKey(next) && !((Map) mapC.get(next)).equals(mapC2.get(next))) || mapB.containsKey(next) != mapB2.containsKey(next)) {
                                        hashSet.add(next);
                                    } else if (mapB2.containsKey(next) && mapB.containsKey(next) && !((JSONObject) mapB2.get(next)).toString().equals(((JSONObject) mapB.get(next)).toString())) {
                                        hashSet.add(next);
                                    } else {
                                        jSONObject5.remove(next);
                                    }
                                    obj = obj2;
                                } else {
                                    hashSet.add(next);
                                }
                            }
                            Object obj3 = obj;
                            Iterator<String> itKeys2 = jSONObject5.keys();
                            while (itKeys2.hasNext()) {
                                hashSet.add(itKeys2.next());
                            }
                            if (hashSet.isEmpty()) {
                                return Tasks.forResult(obj3);
                            }
                            ConfigUpdate configUpdateA = ConfigUpdate.a(hashSet);
                            synchronized (configAutoFetch2) {
                                Iterator it = configAutoFetch2.f20677a.iterator();
                                while (it.hasNext()) {
                                    ((ConfigUpdateListener) it.next()).b(configUpdateA);
                                }
                            }
                            return Tasks.forResult(obj3);
                        }
                    });
                }
            }
        }, this.f20683g.nextInt(4), TimeUnit.SECONDS);
    }

    public final void b(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strM = BuildConfig.VERSION_NAME;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strM = e.m(strM, line);
            if (line.contains("}")) {
                int iIndexOf = strM.indexOf(123);
                int iLastIndexOf = strM.lastIndexOf(AchievementLevelType.DAY_STREAK_LV_7);
                strM = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? BuildConfig.VERSION_NAME : strM.substring(iIndexOf, iLastIndexOf + 1);
                if (strM.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strM);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            ((ConfigRealtimeHttpClient.AnonymousClass2) this.f20681e).a(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes."));
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = this.f20677a.isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j11 = this.f20679c.f20718h.f20763a.getLong("last_template_version", 0L);
                            long j12 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j12 > j11) {
                                a(3, j12);
                            }
                        }
                        if (jSONObject.has("retryIntervalSeconds")) {
                            d(jSONObject.getInt("retryIntervalSeconds"));
                        }
                        strM = BuildConfig.VERSION_NAME;
                    } catch (JSONException e8) {
                        c(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e8.getCause()));
                    }
                }
            }
        }
        bufferedReader.close();
    }

    public final synchronized void c(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f20677a.iterator();
        while (it.hasNext()) {
            ((ConfigUpdateListener) it.next()).a(firebaseRemoteConfigException);
        }
    }

    public final synchronized void d(int i11) {
        this.f20684h.getClass();
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (((long) i11) * 1000));
        ConfigSharedPrefsClient configSharedPrefsClient = this.f20685i;
        synchronized (configSharedPrefsClient.f20766d) {
            configSharedPrefsClient.f20763a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
