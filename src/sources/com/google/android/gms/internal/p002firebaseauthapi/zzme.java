package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzme {
    public static zzlz a(zzkk.zzb zzbVar) {
        if (zzbVar == zzkk.zzb.f10646c) {
            return new zzli(16);
        }
        if (zzbVar == zzkk.zzb.f10647d) {
            return new zzli(32);
        }
        if (zzbVar == zzkk.zzb.f10648e) {
            return new zzll();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static zzmc b(zzkk.zzf zzfVar) {
        if (zzfVar == zzkk.zzf.f10663f) {
            return new zzmx(new zzlw("HmacSha256"));
        }
        if (zzfVar == zzkk.zzf.f10660c) {
            return zzmk.b(zzyq.zza);
        }
        if (zzfVar == zzkk.zzf.f10661d) {
            return zzmk.b(zzyq.zzb);
        }
        if (zzfVar == zzkk.zzf.f10662e) {
            return zzmk.b(zzyq.zzc);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static zzmd c(zzkk.zzc zzcVar) {
        if (zzcVar == zzkk.zzc.f10649c) {
            return new zzlw("HmacSha256");
        }
        if (zzcVar == zzkk.zzc.f10650d) {
            return new zzlw("HmacSha384");
        }
        if (zzcVar == zzkk.zzc.f10651e) {
            return new zzlw("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
