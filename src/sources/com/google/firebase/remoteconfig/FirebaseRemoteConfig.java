package com.google.firebase.remoteconfig;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.f;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseRemoteConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseABTesting f20646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f20647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConfigCacheClient f20648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConfigCacheClient f20649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConfigCacheClient f20650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConfigFetchHandler f20651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConfigGetParameterHandler f20652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConfigSharedPrefsClient f20653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FirebaseInstallationsApi f20654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ConfigRealtimeHandler f20655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RolloutsStateSubscriptionsHandler f20656l;

    public FirebaseRemoteConfig(Context context, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigSharedPrefsClient configSharedPrefsClient, ConfigRealtimeHandler configRealtimeHandler, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        this.f20645a = context;
        this.f20654j = firebaseInstallationsApi;
        this.f20646b = firebaseABTesting;
        this.f20647c = executor;
        this.f20648d = configCacheClient;
        this.f20649e = configCacheClient2;
        this.f20650f = configCacheClient3;
        this.f20651g = configFetchHandler;
        this.f20652h = configGetParameterHandler;
        this.f20653i = configSharedPrefsClient;
        this.f20655k = configRealtimeHandler;
        this.f20656l = rolloutsStateSubscriptionsHandler;
    }

    public static FirebaseRemoteConfig d() {
        return ((RemoteConfigComponent) FirebaseApp.e().c(RemoteConfigComponent.class)).b();
    }

    public static ArrayList h(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final Task a() {
        ConfigFetchHandler configFetchHandler = this.f20651g;
        long j11 = configFetchHandler.f20718h.f20763a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.f20709j);
        HashMap map = new HashMap(configFetchHandler.f20719i);
        map.put("X-Firebase-RC-Fetch-Type", ConfigFetchHandler.FetchType.BASE.a() + "/1");
        return configFetchHandler.f20716f.b().continueWithTask(configFetchHandler.f20713c, new f(configFetchHandler, j11, map)).onSuccessTask(FirebaseExecutors.a(), new a(0));
    }

    public final boolean b(String str) {
        Pattern pattern = ConfigGetParameterHandler.f20732f;
        Pattern pattern2 = ConfigGetParameterHandler.f20731e;
        ConfigGetParameterHandler configGetParameterHandler = this.f20652h;
        ConfigCacheClient configCacheClient = configGetParameterHandler.f20735c;
        String strB = ConfigGetParameterHandler.b(configCacheClient, str);
        if (strB != null) {
            if (pattern2.matcher(strB).matches()) {
                configGetParameterHandler.a(str, configCacheClient.c());
                return true;
            }
            if (pattern.matcher(strB).matches()) {
                configGetParameterHandler.a(str, configCacheClient.c());
                return false;
            }
        }
        String strB2 = ConfigGetParameterHandler.b(configGetParameterHandler.f20736d, str);
        if (strB2 != null) {
            if (pattern2.matcher(strB2).matches()) {
                return true;
            }
            pattern.matcher(strB2).matches();
        }
        return false;
    }

    public final FirebaseRemoteConfigInfoImpl c() {
        FirebaseRemoteConfigInfoImpl firebaseRemoteConfigInfoImpl;
        ConfigSharedPrefsClient configSharedPrefsClient = this.f20653i;
        synchronized (configSharedPrefsClient.f20764b) {
            try {
                configSharedPrefsClient.f20763a.getLong("last_fetch_time_in_millis", -1L);
                int i11 = configSharedPrefsClient.f20763a.getInt("last_fetch_status", 0);
                FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
                long j11 = configSharedPrefsClient.f20763a.getLong("fetch_timeout_in_seconds", 60L);
                if (j11 < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j11)));
                }
                builder.f20660a = j11;
                builder.a(configSharedPrefsClient.f20763a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.f20709j));
                new FirebaseRemoteConfigInfoImpl.Builder(0);
                firebaseRemoteConfigInfoImpl = new FirebaseRemoteConfigInfoImpl(i11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return firebaseRemoteConfigInfoImpl;
    }

    public final long e(String str) {
        Long lValueOf;
        ConfigGetParameterHandler configGetParameterHandler = this.f20652h;
        ConfigCacheClient configCacheClient = configGetParameterHandler.f20735c;
        ConfigContainer configContainerC = configCacheClient.c();
        Long lValueOf2 = null;
        if (configContainerC == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(configContainerC.f20697b.getLong(str));
            } catch (JSONException unused) {
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            configGetParameterHandler.a(str, configCacheClient.c());
            return lValueOf.longValue();
        }
        ConfigContainer configContainerC2 = configGetParameterHandler.f20736d.c();
        if (configContainerC2 != null) {
            try {
                lValueOf2 = Long.valueOf(configContainerC2.f20697b.getLong(str));
            } catch (JSONException unused2) {
            }
        }
        if (lValueOf2 != null) {
            return lValueOf2.longValue();
        }
        Pattern pattern = ConfigGetParameterHandler.f20731e;
        return 0L;
    }

    public final String f(String str) {
        ConfigGetParameterHandler configGetParameterHandler = this.f20652h;
        ConfigCacheClient configCacheClient = configGetParameterHandler.f20735c;
        String strB = ConfigGetParameterHandler.b(configCacheClient, str);
        if (strB != null) {
            configGetParameterHandler.a(str, configCacheClient.c());
            return strB;
        }
        String strB2 = ConfigGetParameterHandler.b(configGetParameterHandler.f20736d, str);
        return strB2 != null ? strB2 : com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
    }

    public final void g(boolean z11) {
        HttpURLConnection httpURLConnection;
        ConfigRealtimeHandler configRealtimeHandler = this.f20655k;
        synchronized (configRealtimeHandler) {
            ConfigRealtimeHttpClient configRealtimeHttpClient = configRealtimeHandler.f20738b;
            synchronized (configRealtimeHttpClient.f20758q) {
                try {
                    configRealtimeHttpClient.f20747e = z11;
                    if (Build.VERSION.SDK_INT >= 26 && z11 && (httpURLConnection = configRealtimeHttpClient.f20748f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z11) {
                synchronized (configRealtimeHandler) {
                    if (!configRealtimeHandler.f20737a.isEmpty()) {
                        configRealtimeHandler.f20738b.e(0L);
                    }
                }
            }
        }
    }
}
