package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConfigRealtimeHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f20737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConfigRealtimeHttpClient f20738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseInstallationsApi f20739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f20740d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ConfigUpdateListenerRegistrationInternal implements ConfigUpdateListenerRegistration {
    }

    public ConfigRealtimeHandler(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, ConfigSharedPrefsClient configSharedPrefsClient, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f20737a = linkedHashSet;
        this.f20738b = new ConfigRealtimeHttpClient(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, linkedHashSet, configSharedPrefsClient, scheduledExecutorService);
        this.f20739c = firebaseInstallationsApi;
        this.f20740d = scheduledExecutorService;
    }
}
