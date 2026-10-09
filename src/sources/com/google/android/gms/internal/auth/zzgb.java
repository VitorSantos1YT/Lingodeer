package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzgb implements zzgi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzfx f9528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzgz f9529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzem f9530c;

    public zzgb(zzgz zzgzVar, zzem zzemVar, zzfx zzfxVar) {
        this.f9529b = zzgzVar;
        this.f9530c = zzemVar;
        this.f9528a = zzfxVar;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void a(Object obj) {
        this.f9529b.e(obj);
        this.f9530c.b(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean b(zzev zzevVar, zzev zzevVar2) {
        zzgz zzgzVar = this.f9529b;
        return zzgzVar.b(zzevVar).equals(zzgzVar.b(zzevVar2));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int c(zzev zzevVar) {
        return this.f9529b.b(zzevVar).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void d(Object obj, byte[] bArr, int i11, int i12, zzdt zzdtVar) {
        zzev zzevVar = (zzev) obj;
        if (zzevVar.zzc == zzha.f9561e) {
            zzevVar.zzc = zzha.a();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void e(Object obj, Object obj2) {
        Class cls = zzgk.f9541a;
        zzgz zzgzVar = this.f9529b;
        zzgzVar.f(obj, zzgzVar.c(zzgzVar.b(obj), zzgzVar.b(obj2)));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean f(Object obj) {
        this.f9530c.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final zzev zzd() {
        zzfx zzfxVar = this.f9528a;
        if (zzfxVar instanceof zzev) {
            return (zzev) ((zzev) zzfxVar).g(4);
        }
        zzet zzetVar = (zzet) ((zzev) zzfxVar).g(5);
        if (!zzetVar.f9498b.f()) {
            return zzetVar.f9498b;
        }
        zzev zzevVar = zzetVar.f9498b;
        zzevVar.getClass();
        zzgf.f9532c.a(zzevVar.getClass()).a(zzevVar);
        zzevVar.c();
        return zzetVar.f9498b;
    }
}
