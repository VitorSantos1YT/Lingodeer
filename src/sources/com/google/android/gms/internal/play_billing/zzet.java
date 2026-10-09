package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12364b;

    public zzet(int i11, zzgl zzglVar) {
        this.f12363a = zzglVar;
        this.f12364b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzet)) {
            return false;
        }
        zzet zzetVar = (zzet) obj;
        return this.f12363a == zzetVar.f12363a && this.f12364b == zzetVar.f12364b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f12363a) * 65535) + this.f12364b;
    }
}
