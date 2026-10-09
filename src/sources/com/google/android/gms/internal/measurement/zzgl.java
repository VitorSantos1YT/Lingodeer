package com.google.android.gms.internal.measurement;

import b7.e0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fa.EQx.nuRcCS;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgl extends zzadu implements zzafd {
    private static final zzgl zzw;
    private static volatile zzafj zzx;
    private int zzb;
    private long zze;
    private String zzf = BuildConfig.VERSION_NAME;
    private int zzg;
    private zzaef zzh;
    private zzaef zzi;
    private zzaef zzj;
    private String zzk;
    private boolean zzl;
    private zzaef zzm;
    private zzaef zzn;
    private String zzo;
    private String zzp;
    private zzgf zzq;
    private zzgp zzr;
    private zzgv zzs;
    private zzgr zzt;
    private zzgn zzu;
    private zzaeb zzv;

    static {
        zzgl zzglVar = new zzgl();
        zzw = zzglVar;
        zzadu.t(zzgl.class, zzglVar);
    }

    private zzgl() {
        zzafm zzafmVar = zzafm.f11321e;
        this.zzh = zzafmVar;
        this.zzi = zzafmVar;
        this.zzj = zzafmVar;
        this.zzk = BuildConfig.VERSION_NAME;
        this.zzm = zzafmVar;
        this.zzn = zzafmVar;
        this.zzo = BuildConfig.VERSION_NAME;
        this.zzp = BuildConfig.VERSION_NAME;
        this.zzv = zzadv.f11269e;
    }

    public static zzgk P() {
        return (zzgk) zzw.p();
    }

    public static zzgl Q() {
        return zzw;
    }

    public final boolean A() {
        return (this.zzb & 2) != 0;
    }

    public final String B() {
        return this.zzf;
    }

    public final zzaef C() {
        return this.zzh;
    }

    public final int D() {
        return this.zzi.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzgj E(int i11) {
        return (zzgj) this.zzi.get(i11);
    }

    public final List F() {
        return this.zzj;
    }

    public final zzaef G() {
        return this.zzm;
    }

    public final int H() {
        return this.zzm.size();
    }

    public final zzaef I() {
        return this.zzn;
    }

    public final String J() {
        return this.zzo;
    }

    public final boolean K() {
        return (this.zzb & 128) != 0;
    }

    public final zzgf L() {
        zzgf zzgfVar = this.zzq;
        return zzgfVar == null ? zzgf.E() : zzgfVar;
    }

    public final boolean M() {
        return (this.zzb & 512) != 0;
    }

    public final zzgv N() {
        zzgv zzgvVar = this.zzs;
        return zzgvVar == null ? zzgv.A() : zzgvVar;
    }

    public final zzaeb O() {
        return this.zzv;
    }

    public final void R(int i11, zzgj zzgjVar) {
        zzaef zzaefVar = this.zzi;
        if (!zzaefVar.zza()) {
            this.zzi = e0.g(zzaefVar);
        }
        this.zzi.set(i11, zzgjVar);
    }

    public final void S() {
        this.zzj = zzafm.f11321e;
    }

    public final void T() {
        this.zzm = zzafm.f11321e;
    }

    public final boolean y() {
        return (this.zzb & 1) != 0;
    }

    public final long z() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzgt.class, "zzi", zzgj.class, nuRcCS.iwlTXKyLixaVq, zzfd.class, "zzk", "zzl", "zzm", zzja.class, "zzn", zzgh.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i12 == 3) {
            return new zzgl();
        }
        if (i12 == 4) {
            return new zzgk(zzw);
        }
        if (i12 == 5) {
            return zzw;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzx;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzgl.class) {
            try {
                zzadqVar = zzx;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzw);
                    zzx = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }
}
