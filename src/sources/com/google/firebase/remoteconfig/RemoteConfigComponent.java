package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import b7.e0;
import bp.g4;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.google.firebase.remoteconfig.internal.Personalization;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import lt.AJC.PQgum;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RemoteConfigComponent implements FirebaseRemoteConfigInterop {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final DefaultClock f20662j = DefaultClock.f9117a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Random f20663k = new Random();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap f20664l = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f20666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f20667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseApp f20668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FirebaseInstallationsApi f20669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FirebaseABTesting f20670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Provider f20671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20672h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20665a = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f20673i = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class GlobalBackgroundListener implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AtomicReference f20674a = new AtomicReference();

        private GlobalBackgroundListener() {
        }

        public static void b(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = f20674a;
            if (atomicReference.get() == null) {
                GlobalBackgroundListener globalBackgroundListener = new GlobalBackgroundListener();
                while (!atomicReference.compareAndSet(null, globalBackgroundListener)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                BackgroundDetector.b(application);
                BackgroundDetector.f8715e.a(globalBackgroundListener);
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void a(boolean z11) {
            DefaultClock defaultClock = RemoteConfigComponent.f20662j;
            synchronized (RemoteConfigComponent.class) {
                Iterator it = RemoteConfigComponent.f20664l.values().iterator();
                while (it.hasNext()) {
                    ((FirebaseRemoteConfig) it.next()).g(z11);
                }
            }
        }
    }

    public RemoteConfigComponent(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider provider) {
        this.f20666b = context;
        this.f20667c = scheduledExecutorService;
        this.f20668d = firebaseApp;
        this.f20669e = firebaseInstallationsApi;
        this.f20670f = firebaseABTesting;
        this.f20671g = provider;
        firebaseApp.b();
        this.f20672h = firebaseApp.f17716c.f17732b;
        GlobalBackgroundListener.b(context);
        Tasks.call(scheduledExecutorService, new g4(this, 3));
    }

    @Override // com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop
    public final void a(RolloutsStateSubscriber rolloutsStateSubscriber) {
        RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = b().f20656l;
        rolloutsStateSubscriptionsHandler.f20787d.add(rolloutsStateSubscriber);
        Task taskB = rolloutsStateSubscriptionsHandler.f20784a.b();
        taskB.addOnSuccessListener(rolloutsStateSubscriptionsHandler.f20786c, new com.google.firebase.crashlytics.internal.concurrency.a(rolloutsStateSubscriptionsHandler, taskB, rolloutsStateSubscriber, 6));
    }

    public final synchronized FirebaseRemoteConfig c(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigSharedPrefsClient configSharedPrefsClient, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        if (!this.f20665a.containsKey("firebase")) {
            Context context = this.f20666b;
            firebaseApp.b();
            FirebaseABTesting firebaseABTesting2 = firebaseApp.f17715b.equals("[DEFAULT]") ? firebaseABTesting : null;
            Context context2 = this.f20666b;
            synchronized (this) {
                FirebaseRemoteConfig firebaseRemoteConfig = new FirebaseRemoteConfig(context, firebaseInstallationsApi, firebaseABTesting2, executor, configCacheClient, configCacheClient2, configCacheClient3, configFetchHandler, configGetParameterHandler, configSharedPrefsClient, new ConfigRealtimeHandler(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient2, context2, configSharedPrefsClient, this.f20667c), rolloutsStateSubscriptionsHandler);
                configCacheClient2.b();
                configCacheClient3.b();
                configCacheClient.b();
                this.f20665a.put("firebase", firebaseRemoteConfig);
                f20664l.put("firebase", firebaseRemoteConfig);
            }
        }
        return (FirebaseRemoteConfig) this.f20665a.get("firebase");
    }

    public final ConfigCacheClient d(String str) {
        ConfigStorageClient configStorageClient;
        ConfigCacheClient configCacheClient;
        String strH = ep.a.h("frc_", this.f20672h, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f20667c;
        Context context = this.f20666b;
        HashMap map = ConfigStorageClient.f20771c;
        synchronized (ConfigStorageClient.class) {
            try {
                HashMap map2 = ConfigStorageClient.f20771c;
                if (!map2.containsKey(strH)) {
                    map2.put(strH, new ConfigStorageClient(context, strH));
                }
                configStorageClient = (ConfigStorageClient) map2.get(strH);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        HashMap map3 = ConfigCacheClient.f20689d;
        synchronized (ConfigCacheClient.class) {
            try {
                String str2 = configStorageClient.f20773b;
                HashMap map4 = ConfigCacheClient.f20689d;
                if (!map4.containsKey(str2)) {
                    map4.put(str2, new ConfigCacheClient(scheduledExecutorService, configStorageClient));
                }
                configCacheClient = (ConfigCacheClient) map4.get(str2);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return configCacheClient;
    }

    public final synchronized ConfigFetchHandler e(ConfigCacheClient configCacheClient, ConfigSharedPrefsClient configSharedPrefsClient) {
        FirebaseInstallationsApi firebaseInstallationsApi;
        Provider bVar;
        ScheduledExecutorService scheduledExecutorService;
        DefaultClock defaultClock;
        Random random;
        String str;
        FirebaseApp firebaseApp;
        try {
            firebaseInstallationsApi = this.f20669e;
            FirebaseApp firebaseApp2 = this.f20668d;
            firebaseApp2.b();
            bVar = firebaseApp2.f17715b.equals("[DEFAULT]") ? this.f20671g : new com.google.firebase.components.b(2);
            scheduledExecutorService = this.f20667c;
            defaultClock = f20662j;
            random = f20663k;
            FirebaseApp firebaseApp3 = this.f20668d;
            firebaseApp3.b();
            str = firebaseApp3.f17716c.f17731a;
            firebaseApp = this.f20668d;
            firebaseApp.b();
        } catch (Throwable th2) {
            throw th2;
        }
        return new ConfigFetchHandler(firebaseInstallationsApi, bVar, scheduledExecutorService, defaultClock, random, configCacheClient, new ConfigFetchHttpClient(this.f20666b, firebaseApp.f17716c.f17732b, str, configSharedPrefsClient.f20763a.getLong("fetch_timeout_in_seconds", 60L), configSharedPrefsClient.f20763a.getLong("fetch_timeout_in_seconds", 60L)), configSharedPrefsClient, this.f20673i);
    }

    public final synchronized FirebaseRemoteConfig b() throws Throwable {
        try {
            try {
                ConfigCacheClient configCacheClientD = d("fetch");
                ConfigCacheClient configCacheClientD2 = d(PQgum.YlhloN);
                ConfigCacheClient configCacheClientD3 = d("defaults");
                ConfigSharedPrefsClient configSharedPrefsClient = new ConfigSharedPrefsClient(this.f20666b.getSharedPreferences("frc_" + this.f20672h + "_firebase_settings", 0));
                ConfigGetParameterHandler configGetParameterHandler = new ConfigGetParameterHandler(this.f20667c, configCacheClientD2, configCacheClientD3);
                FirebaseApp firebaseApp = this.f20668d;
                Provider provider = this.f20671g;
                firebaseApp.b();
                final Personalization personalization = firebaseApp.f17715b.equals("[DEFAULT]") ? new Personalization(provider) : null;
                if (personalization != null) {
                    BiConsumer biConsumer = new BiConsumer() { // from class: com.google.firebase.remoteconfig.b
                        @Override // com.google.android.gms.common.util.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            JSONObject jSONObjectOptJSONObject;
                            Personalization personalization2 = personalization;
                            String str = (String) obj;
                            ConfigContainer configContainer = (ConfigContainer) obj2;
                            AnalyticsConnector analyticsConnector = (AnalyticsConnector) personalization2.f20775a.get();
                            if (analyticsConnector == null) {
                                return;
                            }
                            JSONObject jSONObject = configContainer.f20700e;
                            if (jSONObject.length() < 1) {
                                return;
                            }
                            JSONObject jSONObject2 = configContainer.f20697b;
                            if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
                                String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                                if (strOptString.isEmpty()) {
                                    return;
                                }
                                synchronized (personalization2.f20776b) {
                                    try {
                                        if (strOptString.equals(personalization2.f20776b.get(str))) {
                                            return;
                                        }
                                        personalization2.f20776b.put(str, strOptString);
                                        Bundle bundleE = e0.e("arm_key", str);
                                        bundleE.putString("arm_value", jSONObject2.optString(str));
                                        bundleE.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                        bundleE.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                        bundleE.putString("group", jSONObjectOptJSONObject.optString("group"));
                                        analyticsConnector.d("fp", "personalization_assignment", bundleE);
                                        Bundle bundle = new Bundle();
                                        bundle.putString("_fpid", strOptString);
                                        analyticsConnector.d("fp", "_fpc", bundle);
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        }
                    };
                    synchronized (configGetParameterHandler.f20733a) {
                        configGetParameterHandler.f20733a.add(biConsumer);
                    }
                }
                RolloutsStateFactory rolloutsStateFactory = new RolloutsStateFactory();
                rolloutsStateFactory.f20782a = configCacheClientD2;
                rolloutsStateFactory.f20783b = configCacheClientD3;
                ScheduledExecutorService scheduledExecutorService = this.f20667c;
                RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = new RolloutsStateSubscriptionsHandler();
                rolloutsStateSubscriptionsHandler.f20787d = Collections.newSetFromMap(new ConcurrentHashMap());
                rolloutsStateSubscriptionsHandler.f20784a = configCacheClientD2;
                rolloutsStateSubscriptionsHandler.f20785b = rolloutsStateFactory;
                rolloutsStateSubscriptionsHandler.f20786c = scheduledExecutorService;
                return c(this.f20668d, this.f20669e, this.f20670f, this.f20667c, configCacheClientD, configCacheClientD2, configCacheClientD3, e(configCacheClientD, configSharedPrefsClient), configGetParameterHandler, configSharedPrefsClient, rolloutsStateSubscriptionsHandler);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
