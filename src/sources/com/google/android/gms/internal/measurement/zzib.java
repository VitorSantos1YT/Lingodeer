package com.google.android.gms.internal.measurement;

import b7.e0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzib extends zzadu implements zzafd {
    private static final zzib zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private zzaef zze = zzafm.f11321e;
    private String zzf = BuildConfig.VERSION_NAME;
    private String zzg = BuildConfig.VERSION_NAME;
    private int zzh;

    static {
        zzib zzibVar = new zzib();
        zzi = zzibVar;
        zzadu.t(zzib.class, zzibVar);
    }

    private zzib() {
    }

    public static zzhz F() {
        return (zzhz) zzi.p();
    }

    public static zzhz G(zzib zzibVar) {
        zzadp zzadpVarP = zzi.p();
        zzadpVarP.q(zzibVar);
        return (zzhz) zzadpVarP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzid A(int i11) {
        return (zzid) this.zze.get(i11);
    }

    public final boolean B() {
        return (this.zzb & 1) != 0;
    }

    public final String C() {
        return this.zzf;
    }

    public final boolean D() {
        return (this.zzb & 2) != 0;
    }

    public final String E() {
        return this.zzg;
    }

    public final /* synthetic */ void H(int i11, zzid zzidVar) {
        N();
        this.zze.set(i11, zzidVar);
    }

    public final /* synthetic */ void I(zzid zzidVar) {
        N();
        this.zze.add(zzidVar);
    }

    public final /* synthetic */ void J(ArrayList arrayList) {
        N();
        zzacb.j(arrayList, this.zze);
    }

    public final void K() {
        this.zze = zzafm.f11321e;
    }

    public final /* synthetic */ void L(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void M(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void N() {
        zzaef zzaefVar = this.zze;
        if (zzaefVar.zza()) {
            return;
        }
        this.zze = e0.g(zzaefVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", zzid.class, "zzf", "zzg", "zzh", zzia.f11609a});
        }
        if (i12 == 3) {
            return new zzib();
        }
        if (i12 == 4) {
            return new zzhz(zzi);
        }
        if (i12 == 5) {
            return zzi;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzj;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzib.class) {
            try {
                zzadqVar = zzj;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzi);
                    zzj = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }

    public final List y() {
        return this.zze;
    }

    public final int z() {
        return this.zze.size();
    }
}
