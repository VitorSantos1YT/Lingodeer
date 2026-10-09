package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjv extends zzfi implements zzgm {
    private static final zzjv zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        zzjv zzjvVar = new zzjv();
        zzb = zzjvVar;
        zzfi.m(zzjv.class, zzjvVar);
    }

    private zzjv() {
    }

    public static /* synthetic */ void p(zzjv zzjvVar, boolean z11) {
        zzjvVar.zzd |= 8;
        zzjvVar.zzh = z11;
    }

    public static /* synthetic */ void q(zzjv zzjvVar) {
        zzjvVar.zzd |= 16;
        zzjvVar.zzi = 0;
    }

    public static /* synthetic */ void r(zzjv zzjvVar, long j11) {
        zzjvVar.zzd |= 4;
        zzjvVar.zzg = j11;
    }

    public static /* synthetic */ void s(zzjv zzjvVar) {
        zzjvVar.zzd |= 2;
        zzjvVar.zzf = true;
    }

    public static zzjt t() {
        return (zzjt) zzb.g();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new zzjv();
        }
        if (i12 == 4) {
            return new zzjt(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }
}
