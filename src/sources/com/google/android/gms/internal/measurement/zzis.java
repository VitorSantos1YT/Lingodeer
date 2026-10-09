package com.google.android.gms.internal.measurement;

import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzis extends zzadu implements zzafd {
    private static final zzis zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzis zzisVar = new zzis();
        zzh = zzisVar;
        zzadu.t(zzis.class, zzisVar);
    }

    private zzis() {
    }

    public static zzis A() {
        return zzh;
    }

    public static zzil z() {
        return (zzil) zzh.p();
    }

    public final /* synthetic */ void B(zzin zzinVar) {
        this.zzf = zzinVar.zza();
        this.zzb |= 2;
    }

    public final int C() {
        int i11;
        int i12 = this.zze;
        if (i12 != 0) {
            i11 = 2;
            if (i12 != 1) {
                if (i12 != 2) {
                    i11 = 4;
                    if (i12 != 3) {
                        i11 = i12 != 4 ? 0 : 5;
                    }
                } else {
                    i11 = 3;
                }
            }
        } else {
            i11 = 1;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[PHI: r3
      0x0017: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    public final int D() {
        int i11;
        int i12 = this.zzg;
        if (i12 != 0) {
            i11 = 2;
            if (i12 != 1) {
                int i13 = 3;
                if (i12 != 2) {
                    i11 = 4;
                    if (i12 != 3) {
                        i13 = 5;
                        if (i12 != 4) {
                            i11 = i12 != 5 ? 0 : 6;
                        } else {
                            i11 = i13;
                        }
                    }
                } else {
                    i11 = i13;
                }
            }
        } else {
            i11 = 1;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final /* synthetic */ void E(int i11) {
        this.zze = i11 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void F(int i11) {
        this.zzg = i11 - 1;
        this.zzb |= 4;
    }

    public final zzin y() {
        zzin zzinVarA = zzin.a(this.zzf);
        return zzinVarA == null ? zzin.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : zzinVarA;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i11) {
        zzafj zzadqVar;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzafn(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", OYAvlbfUyD.iRj, zziq.f11613a, "zzf", zzim.f11611a, "zzg", zzio.f11612a});
        }
        if (i12 == 3) {
            return new zzis();
        }
        if (i12 == 4) {
            return new zzil(zzh);
        }
        if (i12 == 5) {
            return zzh;
        }
        if (i12 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzi;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzis.class) {
            try {
                zzadqVar = zzi;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzh);
                    zzi = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }
}
