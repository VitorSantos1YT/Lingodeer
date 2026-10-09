package com.google.android.gms.internal.measurement;

import b7.e0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzff extends zzadu implements zzafd {
    private static final zzff zzm;
    private static volatile zzafj zzn;
    private int zzb;
    private int zze;
    private String zzf = BuildConfig.VERSION_NAME;
    private zzaef zzg = zzafm.f11321e;
    private boolean zzh;
    private zzfl zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        zzff zzffVar = new zzff();
        zzm = zzffVar;
        zzadu.t(zzff.class, zzffVar);
    }

    private zzff() {
    }

    public static zzfe K() {
        return (zzfe) zzm.p();
    }

    public final String A() {
        return this.zzf;
    }

    public final List B() {
        return this.zzg;
    }

    public final int C() {
        return this.zzg.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfh D(int i11) {
        return (zzfh) this.zzg.get(i11);
    }

    public final boolean E() {
        return (this.zzb & 8) != 0;
    }

    public final zzfl F() {
        zzfl zzflVar = this.zzi;
        return zzflVar == null ? zzfl.H() : zzflVar;
    }

    public final boolean G() {
        return this.zzj;
    }

    public final boolean H() {
        return this.zzk;
    }

    public final boolean I() {
        return (this.zzb & 64) != 0;
    }

    public final boolean J() {
        return this.zzl;
    }

    public final /* synthetic */ void L(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void M(int i11, zzfh zzfhVar) {
        zzaef zzaefVar = this.zzg;
        if (!zzaefVar.zza()) {
            this.zzg = e0.g(zzaefVar);
        }
        this.zzg.set(i11, zzfhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", zzfh.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i12 == 3) {
            return new zzff();
        }
        if (i12 == 4) {
            return new zzfe(zzm);
        }
        if (i12 == 5) {
            return zzm;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzn;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzff.class) {
            try {
                zzadqVar = zzn;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzm);
                    zzn = zzadqVar;
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
