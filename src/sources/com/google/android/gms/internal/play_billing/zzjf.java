package com.google.android.gms.internal.play_billing;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjf extends zzfi implements zzgm {
    private static final zzjf zzb;
    private int zzd;
    private zzfn zze = zzgt.f12422e;
    private String zzf = BuildConfig.VERSION_NAME;
    private boolean zzg;

    static {
        zzjf zzjfVar = new zzjf();
        zzb = zzjfVar;
        zzfi.m(zzjf.class, zzjfVar);
    }

    private zzjf() {
    }

    public static /* synthetic */ void p(zzjf zzjfVar, boolean z11) {
        zzjfVar.zzd |= 2;
        zzjfVar.zzg = z11;
    }

    public static zzjf q() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", zzjd.class, "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzjf();
        }
        if (i12 == 4) {
            return new zzja(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }
}
