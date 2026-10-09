package com.google.firebase.remoteconfig;

import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {
    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public final void a(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        e0.i(null, e0.a("Error listening for config updates.", firebaseRemoteConfigException));
        throw null;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public final void b(ConfigUpdate configUpdate) {
        throw null;
    }
}
