package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhe extends zzadu implements zzafd {
    private static final zzhe zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        zzhe zzheVar = new zzhe();
        zzl = zzheVar;
        zzadu.t(zzhe.class, zzheVar);
    }

    private zzhe() {
    }

    public static zzhd F() {
        return (zzhd) zzl.p();
    }

    public static zzhe G() {
        return zzl;
    }

    public final boolean A() {
        return this.zzg;
    }

    public final boolean B() {
        return this.zzh;
    }

    public final boolean C() {
        return this.zzi;
    }

    public final boolean D() {
        return this.zzj;
    }

    public final boolean E() {
        return this.zzk;
    }

    public final /* synthetic */ void H(boolean z11) {
        this.zzb |= 1;
        this.zze = z11;
    }

    public final /* synthetic */ void I(boolean z11) {
        this.zzb |= 2;
        this.zzf = z11;
    }

    public final /* synthetic */ void J(boolean z11) {
        this.zzb |= 4;
        this.zzg = z11;
    }

    public final /* synthetic */ void K(boolean z11) {
        this.zzb |= 8;
        this.zzh = z11;
    }

    public final /* synthetic */ void L(boolean z11) {
        this.zzb |= 16;
        this.zzi = z11;
    }

    public final /* synthetic */ void M(boolean z11) {
        this.zzb |= 32;
        this.zzj = z11;
    }

    public final /* synthetic */ void N(boolean z11) {
        this.zzb |= 64;
        this.zzk = z11;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i12 == 3) {
            return new zzhe();
        }
        if (i12 == 4) {
            return new zzhd(zzl);
        }
        if (i12 == 5) {
            return zzl;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzm;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzhe.class) {
            try {
                zzadqVar = zzm;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzl);
                    zzm = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }

    public final boolean y() {
        return this.zze;
    }

    public final boolean z() {
        return this.zzf;
    }
}
