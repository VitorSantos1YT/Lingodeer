package com.google.android.gms.internal.play_billing;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjd extends zzfi implements zzgm {
    private static final zzjd zzb;
    private int zzd;
    private int zze;
    private String zzf = BuildConfig.VERSION_NAME;

    static {
        zzjd zzjdVar = new zzjd();
        zzb = zzjdVar;
        zzfi.m(zzjd.class, zzjdVar);
    }

    private zzjd() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzjc.f12474a, "zzf"});
        }
        if (i12 == 3) {
            return new zzjd();
        }
        if (i12 == 4) {
            return new zzjb(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }
}
