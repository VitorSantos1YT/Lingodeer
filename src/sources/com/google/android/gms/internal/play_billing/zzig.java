package com.google.android.gms.internal.play_billing;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzig extends zzfi implements zzgm {
    private static final zzig zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = BuildConfig.VERSION_NAME;
    private String zzh = BuildConfig.VERSION_NAME;

    static {
        zzig zzigVar = new zzig();
        zzb = zzigVar;
        zzfi.m(zzig.class, zzigVar);
    }

    private zzig() {
    }

    public static /* synthetic */ void p(zzig zzigVar, String str) {
        zzigVar.zzd |= 8;
        zzigVar.zzh = str;
    }

    public static /* synthetic */ void q(zzig zzigVar, String str) {
        str.getClass();
        zzigVar.zzd |= 2;
        zzigVar.zzf = str;
    }

    public static /* synthetic */ void r(zzig zzigVar, int i11) {
        zzigVar.zzd |= 16;
        zzigVar.zzi = i11;
    }

    public static /* synthetic */ void s(zzig zzigVar, zzie zzieVar) {
        zzigVar.zzg = zzieVar.zza();
        zzigVar.zzd |= 4;
    }

    public static /* synthetic */ void t(zzig zzigVar, int i11) {
        zzigVar.zzd |= 1;
        zzigVar.zze = i11;
    }

    public static zzic u() {
        return (zzic) zzb.g();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", zzid.f12465a, "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new zzig();
        }
        if (i12 == 4) {
            return new zzic(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }
}
