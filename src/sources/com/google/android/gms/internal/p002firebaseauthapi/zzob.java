package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzob<P> extends zzny<P> implements zzcs<P> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final zzwj a(zzaje zzajeVar) throws GeneralSecurityException {
        zzpx zzpxVarA = zzpx.a(this.f10797a, zzajeVar, this.f10798b, zzxl.RAW, null);
        zzou zzouVar = zzou.f10818b;
        zzcw zzcwVar = zzcw.f10287a;
        Object objA = zzouVar.a(zzpxVarA, zzcwVar);
        if (!(objA instanceof zzcp)) {
            throw new GeneralSecurityException("Key not private key");
        }
        zzpx zzpxVar = (zzpx) zzouVar.c(((zzcp) objA).zzc(), zzcwVar);
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
}
