package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zziu extends zzadu implements zzafd {
    private static final zziu zzk;
    private static volatile zzafj zzl;
    private int zzb;
    private long zze;
    private String zzf = BuildConfig.VERSION_NAME;
    private String zzg = BuildConfig.VERSION_NAME;
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        zziu zziuVar = new zziu();
        zzk = zziuVar;
        zzadu.t(zziu.class, zziuVar);
    }

    private zziu() {
    }

    public static zzit J() {
        return (zzit) zzk.p();
    }

    public final String A() {
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

    public final long E() {
        return this.zzh;
    }

    public final boolean F() {
        return (this.zzb & 16) != 0;
    }

    public final float G() {
        return this.zzi;
    }

    public final boolean H() {
        return (this.zzb & 32) != 0;
    }

    public final double I() {
        return this.zzj;
    }

    public final /* synthetic */ void K(long j11) {
        this.zzb |= 1;
        this.zze = j11;
    }

    public final /* synthetic */ void L(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void M(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void N() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    public final /* synthetic */ void O(long j11) {
        this.zzb |= 8;
        this.zzh = j11;
    }

    public final /* synthetic */ void P() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    public final /* synthetic */ void Q(double d5) {
        this.zzb |= 32;
        this.zzj = d5;
    }

    public final /* synthetic */ void R() {
        this.zzb &= -33;
        this.zzj = 0.0d;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i12 == 3) {
            return new zziu();
        }
        if (i12 == 4) {
            return new zzit(zzk);
        }
        if (i12 == 5) {
            return zzk;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzl;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zziu.class) {
            try {
                zzadqVar = zzl;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzk);
                    zzl = zzadqVar;
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

    public final long z() {
        return this.zze;
    }
}
