package com.google.android.gms.internal.play_billing;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdn extends zzfi implements zzgm {
    private static final zzdn zzb;
    private int zzd;
    private String zze = BuildConfig.VERSION_NAME;

    static {
        zzdn zzdnVar = new zzdn();
        zzb = zzdnVar;
        zzfi.m(zzdn.class, zzdnVar);
    }

    private zzdn() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i12 == 3) {
            return new zzdn();
        }
        if (i12 == 4) {
            return new zzdm(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }
}
