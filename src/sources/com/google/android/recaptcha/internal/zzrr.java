package com.google.android.recaptcha.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrr extends zznd implements zzoj {
    private static final zzrr zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private zzml zzj;
    private zzpj zzk;
    private int zzl;
    private zzqz zzm;
    private String zzh = BuildConfig.VERSION_NAME;
    private String zzi = BuildConfig.VERSION_NAME;
    private zznk zzn = zznd.zzB();

    static {
        zzrr zzrrVar = new zzrr();
        zzb = zzrrVar;
        zznd.zzI(zzrr.class, zzrrVar);
    }

    private zzrr() {
    }

    public static zzrr zzg() {
        return zzb;
    }

    public static zzrr zzi(byte[] bArr) {
        return (zzrr) zznd.zzx(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i11, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zznd.zzF(zzb, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005\f\u0007\u001b\b\f\tȈ\nȈ\u000bဉ\u0002", new Object[]{"zze", HOBXIlHxIkMBEA.awR, "zzj", "zzk", "zzl", "zzn", zzri.class, "zzg", "zzh", "zzi", "zzm"});
        }
        if (i12 == 3) {
            return new zzrr();
        }
        zzrq zzrqVar = null;
        if (i12 == 4) {
            return new zzrp(zzrqVar);
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
        synchronized (zzrr.class) {
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
