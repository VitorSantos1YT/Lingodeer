package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzik extends zzadu implements zzafd {
    private static final zzik zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private zzaee zzf = zzaeq.f11284e;

    static {
        zzik zzikVar = new zzik();
        zzg = zzikVar;
        zzadu.t(zzik.class, zzikVar);
    }

    private zzik() {
    }

    public static zzij D() {
        return (zzij) zzg.p();
    }

    public final List A() {
        return this.zzf;
    }

    public final int B() {
        return this.zzf.size();
    }

    public final long C(int i11) {
        return this.zzf.p(i11);
    }

    public final /* synthetic */ void E(int i11) {
        this.zzb |= 1;
        this.zze = i11;
    }

    public final void F(List list) {
        zzaee zzaeeVar = this.zzf;
        if (!zzaeeVar.zza()) {
            int size = zzaeeVar.size();
            this.zzf = zzaeeVar.zzg(size + size);
        }
        zzacb.j(list, this.zzf);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzik();
        }
        if (i12 == 4) {
            return new zzij(zzg);
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
        synchronized (zzik.class) {
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

    public final boolean y() {
        return (this.zzb & 1) != 0;
    }

    public final int z() {
        return this.zze;
    }
}
