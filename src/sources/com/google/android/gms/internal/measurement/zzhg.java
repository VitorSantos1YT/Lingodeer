package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhg extends zzadu implements zzafd {
    private static final zzhg zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private int zze;
    private zzii zzf;
    private zzii zzg;
    private boolean zzh;

    static {
        zzhg zzhgVar = new zzhg();
        zzi = zzhgVar;
        zzadu.t(zzhg.class, zzhgVar);
    }

    private zzhg() {
    }

    public static zzhf F() {
        return (zzhf) zzi.p();
    }

    public final zzii A() {
        zzii zziiVar = this.zzf;
        return zziiVar == null ? zzii.H() : zziiVar;
    }

    public final boolean B() {
        return (this.zzb & 4) != 0;
    }

    public final zzii C() {
        zzii zziiVar = this.zzg;
        return zziiVar == null ? zzii.H() : zziiVar;
    }

    public final boolean D() {
        return (this.zzb & 8) != 0;
    }

    public final boolean E() {
        return this.zzh;
    }

    public final /* synthetic */ void G(int i11) {
        this.zzb |= 1;
        this.zze = i11;
    }

    public final /* synthetic */ void H(zzii zziiVar) {
        this.zzf = zziiVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void I(zzii zziiVar) {
        this.zzg = zziiVar;
        this.zzb |= 4;
    }

    public final /* synthetic */ void J(boolean z11) {
        this.zzb |= 8;
        this.zzh = z11;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzhg();
        }
        if (i12 == 4) {
            return new zzhf(zzi);
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
        synchronized (zzhg.class) {
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

    public final int z() {
        return this.zze;
    }
}
