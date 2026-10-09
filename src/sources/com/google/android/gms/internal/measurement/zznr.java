package com.google.android.gms.internal.measurement;

import b7.e0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zznr extends zzadu implements zzafd {
    private static final zznr zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private zzaef zze = zzafm.f11321e;
    private String zzf = BuildConfig.VERSION_NAME;

    static {
        zznr zznrVar = new zznr();
        zzg = zznrVar;
        zzadu.t(zznr.class, zznrVar);
    }

    private zznr() {
    }

    public static zznr z() {
        return zzg;
    }

    public final void A(String str) {
        zzaef zzaefVar = this.zze;
        if (!zzaefVar.zza()) {
            this.zze = e0.g(zzaefVar);
        }
        this.zze.add(BuildConfig.VERSION_NAME);
    }

    public final /* synthetic */ void B(String str) {
        this.zzb |= 1;
        this.zzf = BuildConfig.VERSION_NAME;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zznr();
        }
        if (i12 == 4) {
            return new zznq(zzg);
        }
        if (i12 == 5) {
            return zzg;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzh;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zznr.class) {
            try {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
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
}
