package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzqc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f10856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzv f10857b;

    public zzqc(Class cls, zzzv zzzvVar) {
        this.f10856a = cls;
        this.f10857b = zzzvVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqc)) {
            return false;
        }
        zzqc zzqcVar = (zzqc) obj;
        return zzqcVar.f10856a.equals(this.f10856a) && zzqcVar.f10857b.equals(this.f10857b);
    }

    public final int hashCode() {
        return Objects.hash(this.f10856a, this.f10857b);
    }

    public final String toString() {
        return a.D(this.f10856a.getSimpleName(), ", object identifier: ", String.valueOf(this.f10857b));
    }
}
