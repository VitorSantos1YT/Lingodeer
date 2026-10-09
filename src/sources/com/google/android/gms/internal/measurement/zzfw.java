package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.stats.RC.ualZoVVCQs;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfw extends zzadu implements zzafd {
    private static final zzfw zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzfw zzfwVar = new zzfw();
        zzg = zzfwVar;
        zzadu.t(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    public final int y() {
        int iA = zzga.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int z() {
        int iA = zzga.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            String str = ualZoVVCQs.GRQXG;
            zzadz zzadzVar = zzfz.f11598a;
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{str, "zze", zzadzVar, "zzf", zzadzVar});
        }
        if (i12 == 3) {
            return new zzfw();
        }
        if (i12 == 4) {
            return new zzfv(zzg);
        }
        if (i12 == 5) {
            return zzg;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzh;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzfw.class) {
            try {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }
}
