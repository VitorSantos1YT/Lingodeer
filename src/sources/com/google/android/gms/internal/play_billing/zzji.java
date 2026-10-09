package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzji extends zzfi implements zzgm {
    private static final zzji zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zzis zzg;
    private zziv zzh;

    static {
        zzji zzjiVar = new zzji();
        zzb = zzjiVar;
        zzfi.m(zzji.class, zzjiVar);
    }

    private zzji() {
    }

    public static /* synthetic */ void p(zzji zzjiVar, zzhx zzhxVar) {
        zzjiVar.zzf = zzhxVar;
        zzjiVar.zze = 2;
    }

    public static /* synthetic */ void q(zzji zzjiVar, zzib zzibVar) {
        zzjiVar.zzf = zzibVar;
        zzjiVar.zze = 3;
    }

    public static /* synthetic */ void r(zzji zzjiVar, zzij zzijVar) {
        zzijVar.getClass();
        zzjiVar.zzf = zzijVar;
        zzjiVar.zze = 7;
    }

    public static /* synthetic */ void s(zzji zzjiVar, zzis zzisVar) {
        zzisVar.getClass();
        zzjiVar.zzg = zzisVar;
        zzjiVar.zzd |= 1;
    }

    public static /* synthetic */ void t(zzji zzjiVar, zzjo zzjoVar) {
        zzjiVar.zzf = zzjoVar;
        zzjiVar.zze = 8;
    }

    public static /* synthetic */ void u(zzji zzjiVar, zzjs zzjsVar) {
        zzjiVar.zzf = zzjsVar;
        zzjiVar.zze = 4;
    }

    public static zzjg v() {
        return (zzjg) zzb.g();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzhx.class, zzib.class, zzjs.class, zzip.class, "zzh", zzij.class, zzjo.class});
        }
        if (i12 == 3) {
            return new zzji();
        }
        if (i12 == 4) {
            return new zzjg(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }
}
