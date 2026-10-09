package com.google.android.gms.internal.measurement;

import b7.e0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfd extends zzadu implements zzafd {
    private static final zzfd zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private int zze;
    private zzaef zzf;
    private zzaef zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzfd zzfdVar = new zzfd();
        zzj = zzfdVar;
        zzadu.t(zzfd.class, zzfdVar);
    }

    private zzfd() {
        zzafm zzafmVar = zzafm.f11321e;
        this.zzf = zzafmVar;
        this.zzg = zzafmVar;
    }

    public final List A() {
        return this.zzf;
    }

    public final int B() {
        return this.zzf.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfn C(int i11) {
        return (zzfn) this.zzf.get(i11);
    }

    public final zzaef D() {
        return this.zzg;
    }

    public final int E() {
        return this.zzg.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzff F(int i11) {
        return (zzff) this.zzg.get(i11);
    }

    public final void G(int i11, zzfn zzfnVar) {
        zzaef zzaefVar = this.zzf;
        if (!zzaefVar.zza()) {
            this.zzf = e0.g(zzaefVar);
        }
        this.zzf.set(i11, zzfnVar);
    }

    public final void H(int i11, zzff zzffVar) {
        zzaef zzaefVar = this.zzg;
        if (!zzaefVar.zza()) {
            this.zzg = e0.g(zzaefVar);
        }
        this.zzg.set(i11, zzffVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", zzfn.class, "zzg", zzff.class, "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new zzfd();
        }
        if (i12 == 4) {
            return new zzfc(zzj);
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
        synchronized (zzfd.class) {
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

    public final int z() {
        return this.zze;
    }
}
