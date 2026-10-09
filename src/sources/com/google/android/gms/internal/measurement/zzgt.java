package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgt extends zzadu implements zzafd {
    private static final zzgt zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private String zze = BuildConfig.VERSION_NAME;
    private String zzf = BuildConfig.VERSION_NAME;

    static {
        zzgt zzgtVar = new zzgt();
        zzg = zzgtVar;
        zzadu.t(zzgt.class, zzgtVar);
    }

    private zzgt() {
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzgt();
        }
        if (i12 == 4) {
            return new zzgs(zzg);
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
        synchronized (zzgt.class) {
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

    public final String y() {
        return this.zze;
    }

    public final String z() {
        return this.zzf;
    }
}
