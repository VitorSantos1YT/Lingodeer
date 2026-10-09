package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjo extends zzfi implements zzgm {
    private static final zzjo zzb;
    private int zzd;
    private zzig zze;
    private long zzf;

    static {
        zzjo zzjoVar = new zzjo();
        zzb = zzjoVar;
        zzfi.m(zzjo.class, zzjoVar);
    }

    private zzjo() {
    }

    public static /* synthetic */ void p(zzjo zzjoVar, zzig zzigVar) {
        zzjoVar.zze = zzigVar;
        zzjoVar.zzd |= 1;
    }

    public static /* synthetic */ void q(zzjo zzjoVar, long j11) {
        zzjoVar.zzd |= 2;
        zzjoVar.zzf = j11;
    }

    public static zzjm r() {
        return (zzjm) zzb.g();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzjo();
        }
        if (i12 == 4) {
            return new zzjm(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }
}
