package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmi extends zzadu implements zzafd {
    private static final zzmi zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = BuildConfig.VERSION_NAME;

    static {
        zzmi zzmiVar = new zzmi();
        zzh = zzmiVar;
        zzadu.t(zzmi.class, zzmiVar);
    }

    private zzmi() {
    }

    public static zzmh E() {
        return (zzmh) zzh.p();
    }

    public static zzmi F() {
        return zzh;
    }

    public final boolean A() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double B() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String C() {
        return this.zze == 4 ? (String) this.zzf : BuildConfig.VERSION_NAME;
    }

    public final zzacr D() {
        return this.zze == 5 ? (zzacr) this.zzf : zzacr.f11213b;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void H(long j11) {
        this.zze = 1;
        this.zzf = Long.valueOf(j11);
    }

    public final /* synthetic */ void I(boolean z11) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z11);
    }

    public final /* synthetic */ void J(double d5) {
        this.zze = 3;
        this.zzf = Double.valueOf(d5);
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    public final /* synthetic */ void L(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zze = 5;
        this.zzf = zzacrVar;
    }

    public final int M() {
        int i11 = this.zze;
        if (i11 == 0) {
            return 6;
        }
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    i12 = 4;
                    if (i11 != 4) {
                        i12 = 5;
                        if (i11 != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i12 == 3) {
            return new zzmi();
        }
        if (i12 == 4) {
            return new zzmh(zzh);
        }
        if (i12 == 5) {
            return zzh;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzi;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzmi.class) {
            try {
                zzadqVar = zzi;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzh);
                    zzi = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }

    public final String y() {
        return this.zzg;
    }

    public final long z() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }
}
