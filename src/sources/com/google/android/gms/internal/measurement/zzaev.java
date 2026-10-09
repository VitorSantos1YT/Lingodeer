package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzaeu f11293a;

    public zzaev(zzagm zzagmVar, zzagm zzagmVar2, Object obj) {
        this.f11293a = new zzaeu(zzagmVar, zzagmVar2, obj);
    }

    public static void a(zzada zzadaVar, zzaeu zzaeuVar, Object obj, Object obj2) {
        zzadk.d(zzadaVar, zzaeuVar.f11290a, 1, obj);
        zzadk.d(zzadaVar, zzaeuVar.f11291b, 2, obj2);
    }

    public static int b(zzaeu zzaeuVar, Object obj, Object obj2) {
        return zzadk.e(zzaeuVar.f11290a, 1, obj) + zzadk.e(zzaeuVar.f11291b, 2, obj2);
    }
}
