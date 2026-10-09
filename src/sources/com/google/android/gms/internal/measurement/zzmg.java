package com.google.android.gms.internal.measurement;

import b7.e0;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmg extends zzadu implements zzafd {
    private static final zzmg zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private String zze = BuildConfig.VERSION_NAME;
    private zzacr zzf = zzacr.f11213b;
    private String zzg = BuildConfig.VERSION_NAME;
    private zzaef zzh;
    private zzaef zzi;
    private boolean zzj;
    private long zzk;

    static {
        zzmg zzmgVar = new zzmg();
        zzl = zzmgVar;
        zzadu.t(zzmg.class, zzmgVar);
    }

    private zzmg() {
        zzafm zzafmVar = zzafm.f11321e;
        this.zzh = zzafmVar;
        this.zzi = zzafmVar;
    }

    public static zzmf E() {
        return (zzmf) zzl.p();
    }

    public final zzacr A() {
        return this.zzf;
    }

    public final String B() {
        return this.zzg;
    }

    public final zzaef C() {
        return this.zzh;
    }

    public final long D() {
        return this.zzk;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void G(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zzb |= 2;
        this.zzf = zzacrVar;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void I(zzmi zzmiVar) {
        zzaef zzaefVar = this.zzh;
        if (!zzaefVar.zza()) {
            this.zzh = e0.g(zzaefVar);
        }
        this.zzh.add(zzmiVar);
    }

    public final void J(String str) {
        str.getClass();
        zzaef zzaefVar = this.zzi;
        if (!zzaefVar.zza()) {
            this.zzi = e0.g(zzaefVar);
        }
        this.zzi.add(str);
    }

    public final /* synthetic */ void K(boolean z11) {
        this.zzb |= 8;
        this.zzj = z11;
    }

    public final /* synthetic */ void L(long j11) {
        this.zzb |= 16;
        this.zzk = j11;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", zzmi.class, "zzi", "zzj", "zzk"});
        }
        if (i12 == 3) {
            return new zzmg();
        }
        if (i12 == 4) {
            return new zzmf(zzl);
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
        synchronized (zzmg.class) {
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

    public final String y() {
        return this.zze;
    }

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
