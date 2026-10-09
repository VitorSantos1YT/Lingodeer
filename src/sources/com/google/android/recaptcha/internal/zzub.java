package com.google.android.recaptcha.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzub extends zznd implements zzoj {
    private static final zzub zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = BuildConfig.VERSION_NAME;
    private zzni zzg = zznd.zzy();
    private zznj zzh = zznd.zzA();
    private zztl zzi;

    static {
        zzub zzubVar = new zzub();
        zzb = zzubVar;
        zznd.zzI(zzub.class, zzubVar);
    }

    private zzub() {
    }

    public static zzub zzi(byte[] bArr) {
        return (zzub) zznd.zzx(zzb, bArr);
    }

    public final zztl zzf() {
        zztl zztlVar = this.zzi;
        return zztlVar == null ? zztl.zzg() : zztlVar;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i11, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zznd.zzF(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%\u0004ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new zzub();
        }
        zzug zzugVar = null;
        if (i12 == 4) {
            return new zzua(zzugVar);
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
        synchronized (zzub.class) {
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

    public final String zzj() {
        return this.zzf;
    }

    public final List zzk() {
        return this.zzh;
    }
}
