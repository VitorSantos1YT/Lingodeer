package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfh extends zzadu implements zzafd {
    private static final zzfh zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private zzfr zze;
    private zzfl zzf;
    private boolean zzg;
    private String zzh = BuildConfig.VERSION_NAME;

    static {
        zzfh zzfhVar = new zzfh();
        zzi = zzfhVar;
        zzadu.t(zzfh.class, zzfhVar);
    }

    private zzfh() {
    }

    public static zzfh G() {
        return zzi;
    }

    public final boolean A() {
        return (this.zzb & 2) != 0;
    }

    public final zzfl B() {
        zzfl zzflVar = this.zzf;
        return zzflVar == null ? zzfl.H() : zzflVar;
    }

    public final boolean C() {
        return (this.zzb & 4) != 0;
    }

    public final boolean D() {
        return this.zzg;
    }

    public final boolean E() {
        return (this.zzb & 8) != 0;
    }

    public final String F() {
        return this.zzh;
    }

    public final /* synthetic */ void H(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzfh();
        }
        if (i12 == 4) {
            return new zzfg(zzi);
        }
        if (i12 == 5) {
            return zzi;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzj;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzfh.class) {
            try {
                zzadqVar = zzj;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzi);
                    zzj = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }

    public final boolean y() {
        return (this.zzb & 1) != 0;
    }

    public final zzfr z() {
        zzfr zzfrVar = this.zze;
        return zzfrVar == null ? zzfr.F() : zzfrVar;
    }
}
