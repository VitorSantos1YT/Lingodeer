package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzala {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzaly f10141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile zzaly f10142b;

    public zzala(zzaly zzalyVar) {
        if (zzalyVar == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this.f10142b = zzalyVar;
        this.f10141a = zzalyVar.zzs();
    }

    public final zzaly a() {
        return this.f10142b == null ? this.f10141a : this.f10142b;
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
