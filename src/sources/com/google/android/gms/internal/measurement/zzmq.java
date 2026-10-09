package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmq extends zzadu implements zzafd {
    private static final zzmq zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private long zzh;
    private zzaew zzi = zzaew.f11294b;
    private String zze = BuildConfig.VERSION_NAME;
    private zzacr zzf = zzacr.f11213b;
    private String zzg = BuildConfig.VERSION_NAME;

    static {
        zzmq zzmqVar = new zzmq();
        zzj = zzmqVar;
        zzadu.t(zzmq.class, zzmqVar);
    }

    private zzmq() {
    }

    public static zzmq E(zzacv zzacvVar, zzadf zzadfVar) throws zzaeh {
        zzadu zzaduVarN = zzj.n();
        try {
            zzafp zzafpVarA = zzafl.f11317c.a(zzaduVarN.getClass());
            Object obj = zzacvVar.f11231c;
            zzafpVarA.g(zzaduVarN, obj != null ? (zzacw) obj : new zzacw(zzacvVar), zzadfVar);
            zzafpVarA.a(zzaduVarN);
            zzadu.w(zzaduVarN);
            return (zzmq) zzaduVarN;
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

    public static zzmq F() {
        return zzj;
    }

    public final String A() {
        return this.zzg;
    }

    public final long B() {
        return this.zzh;
    }

    public final int C() {
        return this.zzi.size();
    }

    public final Map D() {
        return Collections.unmodifiableMap(this.zzi);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzmp.f11736a});
        }
        if (i12 == 3) {
            return new zzmq();
        }
        if (i12 == 4) {
            return new zzmo(zzj);
        }
        if (i12 == 5) {
            return zzj;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzk;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzmq.class) {
            try {
                zzadqVar = zzk;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzj);
                    zzk = zzadqVar;
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

    public final zzacr z() {
        return this.zzf;
    }
}
