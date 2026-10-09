package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zznf extends zzadu implements zzafd {
    private static final zznf zzf;
    private static volatile zzafj zzg;
    private int zzb;
    private boolean zze;

    static {
        zznf zznfVar = new zznf();
        zzf = zznfVar;
        zzadu.t(zznf.class, zznfVar);
    }

    private zznf() {
    }

    public static zznf z() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i12 == 3) {
            return new zznf();
        }
        if (i12 == 4) {
            return new zzne(zzf);
        }
        if (i12 == 5) {
            return zzf;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzg;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zznf.class) {
            try {
                zzadqVar = zzg;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzf);
                    zzg = zzadqVar;
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
}
