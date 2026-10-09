package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfr extends zzadu implements zzafd {
    private static final zzfr zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = BuildConfig.VERSION_NAME;
    private zzaef zzh = zzafm.f11321e;

    static {
        zzfr zzfrVar = new zzfr();
        zzi = zzfrVar;
        zzadu.t(zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    public static zzfr F() {
        return zzi;
    }

    public final String A() {
        return this.zzf;
    }

    public final boolean B() {
        return (this.zzb & 4) != 0;
    }

    public final boolean C() {
        return this.zzg;
    }

    public final zzaef D() {
        return this.zzh;
    }

    public final int E() {
        return this.zzh.size();
    }

    public final int G() {
        int i11;
        switch (this.zze) {
            case 0:
                i11 = 1;
                break;
            case 1:
                i11 = 2;
                break;
            case 2:
                i11 = 3;
                break;
            case 3:
                i11 = 4;
                break;
            case 4:
                i11 = 5;
                break;
            case 5:
                i11 = 6;
                break;
            case 6:
                i11 = 7;
                break;
            default:
                i11 = 0;
                break;
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
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", zzfp.f11596a, "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzfr();
        }
        if (i12 == 4) {
            return new zzfo(zzi);
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
        synchronized (zzfr.class) {
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

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
