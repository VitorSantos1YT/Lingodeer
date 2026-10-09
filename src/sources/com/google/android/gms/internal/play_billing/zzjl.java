package com.google.android.gms.internal.play_billing;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjl extends zzfi implements zzgm {
    private static final zzjl zzb;
    private int zzd;
    private int zzf;
    private zzfn zze = zzgt.f12422e;
    private String zzg = BuildConfig.VERSION_NAME;

    static {
        zzjl zzjlVar = new zzjl();
        zzb = zzjlVar;
        zzfi.m(zzjl.class, zzjlVar);
    }

    private zzjl() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzjl();
        }
        if (i12 == 4) {
            return new zzjj(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }
}
