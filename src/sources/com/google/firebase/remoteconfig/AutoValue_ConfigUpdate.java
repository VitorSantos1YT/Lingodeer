package com.google.firebase.remoteconfig;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_ConfigUpdate extends ConfigUpdate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f20644a;

    public AutoValue_ConfigUpdate(HashSet hashSet) {
        this.f20644a = hashSet;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdate
    public final Set b() {
        return this.f20644a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigUpdate) {
            return this.f20644a.equals(((ConfigUpdate) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f20644a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f20644a + "}";
    }
}
