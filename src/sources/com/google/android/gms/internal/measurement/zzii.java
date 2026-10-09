package com.google.android.gms.internal.measurement;

import b7.e0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzii extends zzadu implements zzafd {
    private static final zzii zzh;
    private static volatile zzafj zzi;
    private zzaee zzb;
    private zzaee zze;
    private zzaef zzf;
    private zzaef zzg;

    static {
        zzii zziiVar = new zzii();
        zzh = zziiVar;
        zzadu.t(zzii.class, zziiVar);
    }

    private zzii() {
        zzaeq zzaeqVar = zzaeq.f11284e;
        this.zzb = zzaeqVar;
        this.zze = zzaeqVar;
        zzafm zzafmVar = zzafm.f11321e;
        this.zzf = zzafmVar;
        this.zzg = zzafmVar;
    }

    public static zzih G() {
        return (zzih) zzh.p();
    }

    public static zzii H() {
        return zzh;
    }

    public final List A() {
        return this.zze;
    }

    public final int B() {
        return this.zze.size();
    }

    public final zzaef C() {
        return this.zzf;
    }

    public final int D() {
        return this.zzf.size();
    }

    public final zzaef E() {
        return this.zzg;
    }

    public final int F() {
        return this.zzg.size();
    }

    public final void I(Iterable iterable) {
        zzaee zzaeeVar = this.zzb;
        if (!zzaeeVar.zza()) {
            int size = zzaeeVar.size();
            this.zzb = zzaeeVar.zzg(size + size);
        }
        zzacb.j(iterable, this.zzb);
    }

    public final void J() {
        this.zzb = zzaeq.f11284e;
    }

    public final void K(List list) {
        zzaee zzaeeVar = this.zze;
        if (!zzaeeVar.zza()) {
            int size = zzaeeVar.size();
            this.zze = zzaeeVar.zzg(size + size);
        }
        zzacb.j(list, this.zze);
    }

    public final void L() {
        this.zze = zzaeq.f11284e;
    }

    public final void M(ArrayList arrayList) {
        zzaef zzaefVar = this.zzf;
        if (!zzaefVar.zza()) {
            this.zzf = e0.g(zzaefVar);
        }
        zzacb.j(arrayList, this.zzf);
    }

    public final void N() {
        this.zzf = zzafm.f11321e;
    }

    public final void O(Iterable iterable) {
        zzaef zzaefVar = this.zzg;
        if (!zzaefVar.zza()) {
            this.zzg = e0.g(zzaefVar);
        }
        zzacb.j(iterable, this.zzg);
    }

    public final void P() {
        this.zzg = zzafm.f11321e;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", zzhq.class, "zzg", zzik.class});
        }
        if (i12 == 3) {
            return new zzii();
        }
        if (i12 == 4) {
            return new zzih(zzh);
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
        synchronized (zzii.class) {
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

    public final List y() {
        return this.zzb;
    }

    public final int z() {
        return this.zzb.size();
    }
}
