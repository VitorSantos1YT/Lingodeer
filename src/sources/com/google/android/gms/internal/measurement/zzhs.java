package com.google.android.gms.internal.measurement;

import b7.e0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhs extends zzadu implements zzafd {
    private static final zzhs zzm;
    private static volatile zzafj zzn;
    private int zzb;
    private zzaef zze = zzafm.f11321e;
    private String zzf = BuildConfig.VERSION_NAME;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        zzhs zzhsVar = new zzhs();
        zzm = zzhsVar;
        zzadu.t(zzhs.class, zzhsVar);
    }

    private zzhs() {
    }

    public static zzhr O() {
        return (zzhr) zzm.p();
    }

    public final List A() {
        return this.zze;
    }

    public final int B() {
        return this.zze.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzhw C(int i11) {
        return (zzhw) this.zze.get(i11);
    }

    public final String D() {
        return this.zzf;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final long F() {
        return this.zzg;
    }

    public final boolean G() {
        return (this.zzb & 4) != 0;
    }

    public final long H() {
        return this.zzh;
    }

    public final boolean I() {
        return (this.zzb & 8) != 0;
    }

    public final int J() {
        return this.zzi;
    }

    public final boolean K() {
        return (this.zzb & 32) != 0;
    }

    public final long L() {
        return this.zzk;
    }

    public final boolean M() {
        return (this.zzb & 64) != 0;
    }

    public final long N() {
        return this.zzl;
    }

    public final /* synthetic */ void P(int i11, zzhw zzhwVar) {
        z();
        this.zze.set(i11, zzhwVar);
    }

    public final /* synthetic */ void Q(zzhw zzhwVar) {
        zzhwVar.getClass();
        z();
        this.zze.add(zzhwVar);
    }

    public final /* synthetic */ void R(Iterable iterable) {
        z();
        zzacb.j(iterable, this.zze);
    }

    public final void S() {
        this.zze = zzafm.f11321e;
    }

    public final /* synthetic */ void T(int i11) {
        z();
        this.zze.remove(i11);
    }

    public final /* synthetic */ void U(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void V(long j11) {
        this.zzb |= 2;
        this.zzg = j11;
    }

    public final /* synthetic */ void W(long j11) {
        this.zzb |= 4;
        this.zzh = j11;
    }

    public final /* synthetic */ void X(long j11) {
        this.zzb |= 16;
        this.zzj = j11;
    }

    public final /* synthetic */ void Y(long j11) {
        this.zzb |= 32;
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
            return new zzafn(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", zzhw.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i12 == 3) {
            return new zzhs();
        }
        if (i12 == 4) {
            return new zzhr(zzm);
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
        synchronized (zzhs.class) {
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

    public final /* synthetic */ void y(long j11) {
        this.zzb |= 64;
        this.zzl = j11;
    }

    public final void z() {
        zzaef zzaefVar = this.zze;
        if (zzaefVar.zza()) {
            return;
        }
        this.zze = e0.g(zzaefVar);
    }
}
