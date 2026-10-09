package com.google.firebase.remoteconfig.interop.rollouts;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_RolloutsState extends RolloutsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f20806a;

    public AutoValue_RolloutsState(HashSet hashSet) {
        this.f20806a = hashSet;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsState
    public final Set b() {
        return this.f20806a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutsState) {
            return this.f20806a.equals(((RolloutsState) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f20806a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f20806a + "}";
    }
}
