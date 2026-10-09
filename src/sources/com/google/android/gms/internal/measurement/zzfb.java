package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfb extends zzadu implements zzafd {
    private static final zzfb zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = BuildConfig.VERSION_NAME;
    private String zzg = BuildConfig.VERSION_NAME;

    static {
        zzfb zzfbVar = new zzfb();
        zzi = zzfbVar;
        zzadu.t(zzfb.class, zzfbVar);
    }

    private zzfb() {
    }

    public static zzfa y() {
        return (zzfa) zzi.p();
    }

    public final /* synthetic */ void A() {
        this.zzb |= 2;
        this.zzf = true;
    }

    public final /* synthetic */ void B(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void C(long j11) {
        this.zzb |= 8;
        this.zzh = j11;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzfb();
        }
        if (i12 == 4) {
            return new zzfa(zzi);
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
        synchronized (zzfb.class) {
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

    public final /* synthetic */ void z(String str) {
        this.zzb |= 1;
        this.zze = str;
    }
}
