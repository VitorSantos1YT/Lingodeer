package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaki {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10116b;

    public zzaki(int i11, zzaly zzalyVar) {
        this.f10115a = zzalyVar;
        this.f10116b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaki)) {
            return false;
        }
        zzaki zzakiVar = (zzaki) obj;
        return this.f10115a == zzakiVar.f10115a && this.f10116b == zzakiVar.f10116b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f10115a) * 65535) + this.f10116b;
    }
}
