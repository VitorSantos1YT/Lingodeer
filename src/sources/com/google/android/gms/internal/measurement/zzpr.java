package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpr extends zzadu implements zzafd {
    private static final zzpr zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = BuildConfig.VERSION_NAME;
    private zzaef zzg = zzafm.f11321e;

    static {
        zzpr zzprVar = new zzpr();
        zzl = zzprVar;
        zzadu.t(zzpr.class, zzprVar);
    }

    private zzpr() {
    }

    public static zzpr A(InputStream inputStream, zzadf zzadfVar) throws zzaeh {
        zzpr zzprVar = zzl;
        zzacv zzacvVarH = zzacv.h(inputStream, 4096);
        zzadu zzaduVarN = zzprVar.n();
        try {
            zzafp zzafpVarA = zzafl.f11317c.a(zzaduVarN.getClass());
            Object obj = zzacvVarH.f11231c;
            zzafpVarA.g(zzaduVarN, obj != null ? (zzacw) obj : new zzacw(zzacvVarH), zzadfVar);
            zzafpVarA.a(zzaduVarN);
            zzadu.w(zzaduVarN);
            return (zzpr) zzaduVarN;
        } catch (zzaeh e8) {
            if (e8.f11277a) {
                throw new zzaeh(e8.getMessage(), e8);
            }
            throw e8;
        } catch (zzafy e10) {
            throw e10.a();
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzaeh) {
                throw ((zzaeh) e11.getCause());
            }
            throw new zzaeh(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof zzaeh) {
                throw ((zzaeh) e12.getCause());
            }
            throw e12;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzaby.f11193a, "zzi", "zzk", "zzj"});
        }
        if (i12 == 3) {
            return new zzpr();
        }
        if (i12 == 4) {
            return new zzpq(zzl);
        }
        if (i12 == 5) {
            return zzl;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzm;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzpr.class) {
            try {
                zzadqVar = zzm;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzl);
                    zzm = zzadqVar;
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

    public final boolean z() {
        return this.zzf;
    }
}
