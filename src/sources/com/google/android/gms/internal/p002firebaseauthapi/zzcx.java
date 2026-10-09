package com.google.android.gms.internal.p002firebaseauthapi;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzcx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10288a = 0;

    static {
        Charset.forName(Constants.ENCODING);
    }

    public static zzww a(zzwt zzwtVar) {
        zzww.zzb zzbVarX = zzww.x();
        int iB = zzwtVar.B();
        zzbVarX.i();
        ((zzww) zzbVarX.f10131b).zze = iB;
        for (zzwt.zza zzaVar : zzwtVar.E()) {
            zzww.zza.C0015zza c0015zzaZ = zzww.zza.z();
            String strD = zzaVar.A().D();
            c0015zzaZ.i();
            zzww.zza.y((zzww.zza) c0015zzaZ.f10131b, strD);
            zzwk zzwkVarB = zzaVar.B();
            c0015zzaZ.i();
            ((zzww.zza) c0015zzaZ.f10131b).zzf = zzwkVarB.zza();
            zzxl zzxlVarE = zzaVar.E();
            c0015zzaZ.i();
            ((zzww.zza) c0015zzaZ.f10131b).zzh = zzxlVarE.zza();
            int iV = zzaVar.v();
            c0015zzaZ.i();
            ((zzww.zza) c0015zzaZ.f10131b).zzg = iV;
            zzww.zza zzaVar2 = (zzww.zza) c0015zzaZ.g();
            zzbVarX.i();
            zzww.w((zzww) zzbVarX.f10131b, zzaVar2);
        }
        return (zzww) zzbVarX.g();
    }
}
