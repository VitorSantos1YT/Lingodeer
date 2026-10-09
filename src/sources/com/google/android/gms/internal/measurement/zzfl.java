package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfl extends zzadu implements zzafd {
    private static final zzfl zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = BuildConfig.VERSION_NAME;
    private String zzh = BuildConfig.VERSION_NAME;
    private String zzi = BuildConfig.VERSION_NAME;

    static {
        zzfl zzflVar = new zzfl();
        zzj = zzflVar;
        zzadu.t(zzfl.class, zzflVar);
    }

    private zzfl() {
    }

    public static zzfl H() {
        return zzj;
    }

    public final boolean A() {
        return this.zzf;
    }

    public final boolean B() {
        return (this.zzb & 4) != 0;
    }

    public final String C() {
        return this.zzg;
    }

    public final boolean D() {
        return (this.zzb & 8) != 0;
    }

    public final String E() {
        return this.zzh;
    }

    public final boolean F() {
        return (this.zzb & 16) != 0;
    }

    public final String G() {
        return this.zzi;
    }

    public final int I() {
        int i11;
        int i12 = this.zze;
        if (i12 != 0) {
            i11 = 2;
            if (i12 != 1) {
                if (i12 != 2) {
                    i11 = 4;
                    if (i12 != 3) {
                        i11 = i12 != 4 ? 0 : 5;
                    }
                } else {
                    i11 = 3;
                }
            }
        } else {
            i11 = 1;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", zzfj.f11595a, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new zzfl();
        }
        if (i12 == 4) {
            return new zzfi(zzj);
        }
        if (i12 == 5) {
            return zzj;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzk;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzfl.class) {
            try {
                zzadqVar = zzk;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzj);
                    zzk = zzadqVar;
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

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
