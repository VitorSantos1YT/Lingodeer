package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrf extends zznd implements zzoj {
    private static final zzrf zzb;
    private static volatile zzoq zzd;
    private int zze;
    private zznk zzf = zznd.zzB();
    private zznk zzg = zznd.zzB();
    private zzqn zzh;

    static {
        zzrf zzrfVar = new zzrf();
        zzb = zzrfVar;
        zznd.zzI(zzrf.class, zzrfVar);
    }

    private zzrf() {
    }

    public static /* synthetic */ void zzM(zzrf zzrfVar, zzrc zzrcVar) {
        zzrcVar.getClass();
        zznk zznkVar = zzrfVar.zzf;
        if (!zznkVar.zzc()) {
            zzrfVar.zzf = zznd.zzC(zznkVar);
        }
        zzrfVar.zzf.add(zzrcVar);
    }

    public static /* synthetic */ void zzN(zzrf zzrfVar, zzrr zzrrVar) {
        zzrrVar.getClass();
        zznk zznkVar = zzrfVar.zzg;
        if (!zznkVar.zzc()) {
            zzrfVar.zzg = zznd.zzC(zznkVar);
        }
        zzrfVar.zzg.add(zzrrVar);
    }

    public static zzrd zzi() {
        return (zzrd) zzb.zzq();
    }

    public static zzrf zzk(byte[] bArr) {
        return (zzrf) zznd.zzx(zzb, bArr);
    }

    public final int zzf() {
        return this.zzf.size();
    }

    public final int zzg() {
        return this.zzg.size();
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i11, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zznd.zzF(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zze", "zzf", zzrc.class, "zzg", zzrr.class, "zzh"});
        }
        if (i12 == 3) {
            return new zzrf();
        }
        zzre zzreVar = null;
        if (i12 == 4) {
            return new zzrd(zzreVar);
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
        synchronized (zzrf.class) {
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

    public final List zzl() {
        return this.zzf;
    }
}
