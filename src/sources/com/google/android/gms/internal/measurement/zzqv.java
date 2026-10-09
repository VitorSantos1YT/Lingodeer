package com.google.android.gms.internal.measurement;

import b7.e0;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqv extends zzadu implements zzafd {
    private static final zzqv zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private long zzh;
    private String zze = BuildConfig.VERSION_NAME;
    private zzacr zzf = zzacr.f11213b;
    private String zzg = BuildConfig.VERSION_NAME;
    private zzaef zzi = zzafm.f11321e;

    static {
        zzqv zzqvVar = new zzqv();
        zzj = zzqvVar;
        zzadu.t(zzqv.class, zzqvVar);
    }

    private zzqv() {
    }

    public static zzqu E() {
        return (zzqu) zzj.p();
    }

    public static zzqv F() {
        return zzj;
    }

    public final String A() {
        return this.zzg;
    }

    public final long B() {
        return this.zzh;
    }

    public final zzaef C() {
        return this.zzi;
    }

    public final int D() {
        return this.zzi.size();
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void H(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zzb |= 2;
        this.zzf = zzacrVar;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void J(long j11) {
        this.zzb |= 8;
        this.zzh = j11;
    }

    public final void K(zzqx zzqxVar) {
        zzaef zzaefVar = this.zzi;
        if (!zzaefVar.zza()) {
            this.zzi = e0.g(zzaefVar);
        }
        this.zzi.add(zzqxVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzqx.class});
        }
        if (i12 == 3) {
            return new zzqv();
        }
        if (i12 == 4) {
            return new zzqu(zzj);
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
        synchronized (zzqv.class) {
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

    public final String y() {
        return this.zze;
    }

    public final zzacr z() {
        return this.zzf;
    }
}
