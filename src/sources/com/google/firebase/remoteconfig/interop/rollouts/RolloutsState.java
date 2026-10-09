package com.google.firebase.remoteconfig.interop.rollouts;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class RolloutsState {
    public static RolloutsState a(HashSet hashSet) {
        return new AutoValue_RolloutsState(hashSet);
    }

    public abstract Set b();
}
