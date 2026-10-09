package com.google.android.recaptcha.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqn extends zznd implements zzoj {
    private static final zzqn zzb;
    private static volatile zzoq zzd;
    private zzle zze;
    private String zzf;
    private zzle zzg;
    private String zzh;
    private String zzi;
    private zzle zzj;
    private String zzk;
    private zzle zzl;

    static {
        zzqn zzqnVar = new zzqn();
        zzb = zzqnVar;
        zznd.zzI(zzqn.class, zzqnVar);
    }

    private zzqn() {
        zzle zzleVar = zzle.zzb;
        this.zze = zzleVar;
        this.zzf = BuildConfig.VERSION_NAME;
        this.zzg = zzleVar;
        this.zzh = BuildConfig.VERSION_NAME;
        this.zzi = BuildConfig.VERSION_NAME;
        this.zzj = zzleVar;
        this.zzk = BuildConfig.VERSION_NAME;
        this.zzl = zzleVar;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i11, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zznd.zzF(zzb, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006\n\u0007Ȉ\b\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i12 == 3) {
            return new zzqn();
        }
        zzqm zzqmVar = null;
        if (i12 == 4) {
            return new zzql(zzqmVar);
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
        synchronized (zzqn.class) {
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
