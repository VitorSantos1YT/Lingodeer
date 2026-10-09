package com.google.android.gms.internal.play_billing;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzip extends zzfi implements zzgm {
    private static final zzip zzb;
    private int zzd;
    private int zzf;
    private zzig zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = BuildConfig.VERSION_NAME;
    private zzfm zzg = zzfj.f12380e;
    private zzfn zzh = zzgt.f12422e;

    static {
        zzip zzipVar = new zzip();
        zzb = zzipVar;
        zzfi.m(zzip.class, zzipVar);
    }

    private zzip() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", zzin.f12467a, "zzg", zzik.f12466a, "zzh", zzjl.class, "zzi", "zzj", "zzk"});
        }
        if (i12 == 3) {
            return new zzip();
        }
        if (i12 == 4) {
            return new zzim(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }
}
