package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzny<P> implements zzbw<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzwj.zza f10798b;

    public zzny(String str, zzwj.zza zzaVar) {
        this.f10797a = str;
        this.f10798b = zzaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbw
    public final zzwj b(zzaje zzajeVar) throws GeneralSecurityException {
        zzwn.zza zzaVarV = zzwn.v();
        zzaVarV.l(this.f10797a);
        zzaVarV.m(zzajeVar);
        zzaVarV.k(zzxl.RAW);
        zzwn zzwnVar = (zzwn) zzaVarV.g();
        zzpw zzpwVar = new zzpw(zzwnVar, zzqj.a(zzwnVar.E()));
        zzou zzouVar = zzou.f10818b;
        zzpx zzpxVar = (zzpx) zzouVar.c(zzon.f10809b.a(zzouVar.b(zzpwVar), null), zzcw.f10287a);
        zzwj.zzb zzbVarV = zzwj.v();
        String str = zzpxVar.f10845a;
        zzbVarV.i();
        zzwj.y((zzwj) zzbVarV.f10131b, str);
        zzaje zzajeVar2 = zzpxVar.f10847c;
        zzbVarV.i();
        zzwj.w((zzwj) zzbVarV.f10131b, zzajeVar2);
        zzwj.zza zzaVar = zzpxVar.f10848d;
        zzbVarV.i();
        ((zzwj) zzbVarV.f10131b).zzg = zzaVar.zza();
        return (zzwj) zzbVarV.g();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbw
    public final String zza() {
        return this.f10797a;
    }
}
