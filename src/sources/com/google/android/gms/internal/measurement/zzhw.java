package com.google.android.gms.internal.measurement;

import b7.e0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhw extends zzadu implements zzafd {
    private static final zzhw zzk;
    private static volatile zzafj zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = BuildConfig.VERSION_NAME;
    private String zzf = BuildConfig.VERSION_NAME;
    private zzaef zzj = zzafm.f11321e;

    static {
        zzhw zzhwVar = new zzhw();
        zzk = zzhwVar;
        zzadu.t(zzhw.class, zzhwVar);
    }

    private zzhw() {
    }

    public static zzhv K() {
        return (zzhv) zzk.p();
    }

    public final boolean A() {
        return (this.zzb & 2) != 0;
    }

    public final String B() {
        return this.zzf;
    }

    public final boolean C() {
        return (this.zzb & 4) != 0;
    }

    public final long D() {
        return this.zzg;
    }

    public final boolean E() {
        return (this.zzb & 8) != 0;
    }

    public final float F() {
        return this.zzh;
    }

    public final boolean G() {
        return (this.zzb & 16) != 0;
    }

    public final double H() {
        return this.zzi;
    }

    public final zzaef I() {
        return this.zzj;
    }

    public final int J() {
        return this.zzj.size();
    }

    public final /* synthetic */ void L(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void M(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void N() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void O(long j11) {
        this.zzb |= 4;
        this.zzg = j11;
    }

    public final /* synthetic */ void P() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    public final /* synthetic */ void Q(double d5) {
        this.zzb |= 16;
        this.zzi = d5;
    }

    public final /* synthetic */ void R() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void S(zzhw zzhwVar) {
        zzaef zzaefVar = this.zzj;
        if (!zzaefVar.zza()) {
            this.zzj = e0.g(zzaefVar);
        }
        this.zzj.add(zzhwVar);
    }

    public final void T(ArrayList arrayList) {
        zzaef zzaefVar = this.zzj;
        if (!zzaefVar.zza()) {
            this.zzj = e0.g(zzaefVar);
        }
        zzacb.j(arrayList, this.zzj);
    }

    public final void U() {
        this.zzj = zzafm.f11321e;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzhw.class});
        }
        if (i12 == 3) {
            return new zzhw();
        }
        if (i12 == 4) {
            return new zzhv(zzk);
        }
        if (i12 == 5) {
            return zzk;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzl;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzhw.class) {
            try {
                zzadqVar = zzl;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzk);
                    zzl = zzadqVar;
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

    public final String z() {
        return this.zze;
    }
}
