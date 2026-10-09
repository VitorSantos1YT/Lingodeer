package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfu extends zzadu implements zzafd {
    private static final zzfu zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzfu zzfuVar = new zzfu();
        zzh = zzfuVar;
        zzadu.t(zzfu.class, zzfuVar);
    }

    private zzfu() {
    }

    public final int A() {
        int i11;
        int i12 = this.zzg;
        if (i12 != 0) {
            i11 = 2;
            if (i12 != 1) {
                i11 = i12 != 2 ? 0 : 3;
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
            return new zzafn(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", zzfz.f11598a, "zzf", zzfx.f11597a, "zzg", zzgd.f11603a});
        }
        if (i12 == 3) {
            return new zzfu();
        }
        if (i12 == 4) {
            return new zzft(zzh);
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
        synchronized (zzfu.class) {
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

    public final int y() {
        int iA = zzga.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int z() {
        int i11;
        int i12 = this.zzf;
        if (i12 != 0) {
            i11 = 2;
            if (i12 != 1) {
                i11 = i12 != 2 ? 0 : 3;
            }
        } else {
            i11 = 1;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
