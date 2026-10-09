package com.google.android.recaptcha.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmc extends zznd implements zzoj {
    private static final zzmc zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = BuildConfig.VERSION_NAME;
    private int zzi;

    static {
        zzmc zzmcVar = new zzmc();
        zzb = zzmcVar;
        zznd.zzI(zzmc.class, zzmcVar);
    }

    private zzmc() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i11, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            zznh zznhVar = zzlp.zza;
            return new zzou(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"zze", "zzf", zznhVar, "zzg", zznhVar, aYZzTH.ZLsN, "zzi", zznhVar});
        }
        if (i12 == 3) {
            return new zzmc();
        }
        zzmh zzmhVar = null;
        if (i12 == 4) {
            return new zzmb(zzmhVar);
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
        synchronized (zzmc.class) {
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
