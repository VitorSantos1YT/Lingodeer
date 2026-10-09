package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzym implements zzbr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zznk f11024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zznk f11025b;

    static {
        zznn zznnVarA = zznk.a();
        zznnVarA.b(zzyq.zza, zzkf.zzc.f10624b);
        zznnVarA.b(zzyq.zzb, zzkf.zzc.f10625c);
        zznnVarA.b(zzyq.zzc, zzkf.zzc.f10626d);
        f11024a = zznnVarA.a();
        zznn zznnVarA2 = zznk.a();
        zznnVarA2.b(zzyt.zza, zzkf.zze.f10634c);
        zznnVarA2.b(zzyt.zzb, zzkf.zze.f10633b);
        zznnVarA2.b(zzyt.zzc, zzkf.zze.f10635d);
        f11025b = zznnVarA2.a();
    }

    public static final String a(zzkf.zzb zzbVar) throws GeneralSecurityException {
        if (zzbVar.equals(zzkf.zzb.f10618b)) {
            return "HmacSha1";
        }
        if (zzbVar.equals(zzkf.zzb.f10619c)) {
            return "HmacSha224";
        }
        if (zzbVar.equals(zzkf.zzb.f10620d)) {
            return "HmacSha256";
        }
        if (zzbVar.equals(zzkf.zzb.f10621e)) {
            return "HmacSha384";
        }
        if (zzbVar.equals(zzkf.zzb.f10622f)) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(String.valueOf(zzbVar)));
    }
}
