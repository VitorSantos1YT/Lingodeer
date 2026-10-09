package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzha extends zzadu implements zzafd {
    private static final zzha zzp;
    private static volatile zzafj zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private zzaew zzm;
    private zzaew zzn;
    private String zzo;

    static {
        zzha zzhaVar = new zzha();
        zzp = zzhaVar;
        zzadu.t(zzha.class, zzhaVar);
    }

    private zzha() {
        zzaew zzaewVar = zzaew.f11294b;
        this.zzm = zzaewVar;
        this.zzn = zzaewVar;
        this.zze = BuildConfig.VERSION_NAME;
        this.zzf = BuildConfig.VERSION_NAME;
        this.zzg = BuildConfig.VERSION_NAME;
        this.zzi = BuildConfig.VERSION_NAME;
        this.zzj = BuildConfig.VERSION_NAME;
        this.zzk = BuildConfig.VERSION_NAME;
        this.zzo = BuildConfig.VERSION_NAME;
    }

    public static zzgx d0() {
        return (zzgx) zzp.p();
    }

    public static zzha e0() {
        return zzp;
    }

    public final /* synthetic */ void A(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    public final /* synthetic */ void B() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    public final /* synthetic */ void D() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    public final /* synthetic */ void E(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }

    public final /* synthetic */ void F() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    public final /* synthetic */ void G(long j11) {
        this.zzb |= 128;
        this.zzl = j11;
    }

    public final zzaew H() {
        zzaew zzaewVar = this.zzm;
        if (!zzaewVar.f11295a) {
            this.zzm = zzaewVar.a();
        }
        return this.zzm;
    }

    public final zzaew I() {
        zzaew zzaewVar = this.zzn;
        if (!zzaewVar.f11295a) {
            this.zzn = zzaewVar.a();
        }
        return this.zzn;
    }

    public final /* synthetic */ void J(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    public final boolean L() {
        return (this.zzb & 1) != 0;
    }

    public final String M() {
        return this.zze;
    }

    public final boolean N() {
        return (this.zzb & 2) != 0;
    }

    public final String O() {
        return this.zzf;
    }

    public final boolean P() {
        return (this.zzb & 4) != 0;
    }

    public final String Q() {
        return this.zzg;
    }

    public final boolean R() {
        return (this.zzb & 8) != 0;
    }

    public final long S() {
        return this.zzh;
    }

    public final boolean T() {
        return (this.zzb & 16) != 0;
    }

    public final String U() {
        return this.zzi;
    }

    public final boolean V() {
        return (this.zzb & 32) != 0;
    }

    public final String W() {
        return this.zzj;
    }

    public final boolean X() {
        return (this.zzb & 64) != 0;
    }

    public final String Y() {
        return this.zzk;
    }

    public final boolean Z() {
        return (this.zzb & 128) != 0;
    }

    public final long a0() {
        return this.zzl;
    }

    public final boolean b0() {
        return (this.zzb & 256) != 0;
    }

    public final String c0() {
        return this.zzo;
    }

    public final /* synthetic */ void f0(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void g0() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    public final /* synthetic */ void h0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void i0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    public final /* synthetic */ void j0(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzgy.f11605a, "zzn", zzgz.f11606a, "zzo"});
        }
        if (i12 == 3) {
            return new zzha();
        }
        if (i12 == 4) {
            return new zzgx(zzp);
        }
        if (i12 == 5) {
            return zzp;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzq;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzha.class) {
            try {
                zzadqVar = zzq;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzp);
                    zzq = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }

    public final /* synthetic */ void y() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    public final /* synthetic */ void z(long j11) {
        this.zzb |= 8;
        this.zzh = j11;
    }
}
