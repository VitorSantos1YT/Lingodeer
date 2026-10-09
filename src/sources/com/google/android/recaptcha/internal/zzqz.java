package com.google.android.recaptcha.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqz extends zznd implements zzoj {
    private static final zzqz zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzk;
    private String zzf = BuildConfig.VERSION_NAME;
    private String zzh = BuildConfig.VERSION_NAME;
    private String zzj = BuildConfig.VERSION_NAME;

    static {
        zzqz zzqzVar = new zzqz();
        zzb = zzqzVar;
        zznd.zzI(zzqz.class, zzqzVar);
    }

    private zzqz() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i11, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i12 == 3) {
            return new zzqz();
        }
        zzqy zzqyVar = null;
        if (i12 == 4) {
            return new zzqx(zzqyVar);
        }
        if (i12 == 5) {
            return zzb;
        }
        if (i12 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar != null) {
            return zzoqVar;
        }
        synchronized (zzqz.class) {
            try {
                zzmyVar = zzd;
                if (zzmyVar == null) {
                    zzmyVar = new zzmy(zzb);
                    zzd = zzmyVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzmyVar;
    }
}
