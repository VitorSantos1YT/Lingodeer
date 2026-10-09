package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zznk extends zzadu implements zzafd {
    private static final zznk zzo;
    private static volatile zzafj zzp;
    private int zzb;
    private boolean zzf;
    private zzaef zzh;
    private zzaef zzi;
    private zzaeb zzj;
    private zznm zzk;
    private boolean zzl;
    private boolean zzm;
    private zznf zzn;
    private zzacr zze = zzacr.f11213b;
    private String zzg = BuildConfig.VERSION_NAME;

    static {
        zznk zznkVar = new zznk();
        zzo = zznkVar;
        zzadu.t(zznk.class, zznkVar);
    }

    private zznk() {
        zzafm zzafmVar = zzafm.f11321e;
        this.zzh = zzafmVar;
        this.zzi = zzafmVar;
        this.zzj = zzadv.f11269e;
    }

    public static zznk y() {
        return zzo;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzaby.f11193a, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i12 == 3) {
            return new zznk();
        }
        if (i12 == 4) {
            return new zznj(zzo);
        }
        if (i12 == 5) {
            return zzo;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzp;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zznk.class) {
            try {
                zzadqVar = zzp;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzo);
                    zzp = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }
}
