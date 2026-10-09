package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzib extends zzfi implements zzgm {
    private static final zzib zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        zzib zzibVar = new zzib();
        zzb = zzibVar;
        zzfi.m(zzib.class, zzibVar);
    }

    private zzib() {
    }

    public static /* synthetic */ void q(zzib zzibVar, zzil zzilVar) {
        zzibVar.zzh = zzilVar.zza();
        zzibVar.zzd |= 2;
    }

    public static /* synthetic */ void r(zzib zzibVar, zzjf zzjfVar) {
        zzibVar.zzf = zzjfVar;
        zzibVar.zze = 4;
    }

    public static /* synthetic */ void s(zzib zzibVar, zzjv zzjvVar) {
        zzibVar.zzf = zzjvVar;
        zzibVar.zze = 3;
    }

    public static /* synthetic */ void t(zzib zzibVar, int i11) {
        zzibVar.zzg = i11 - 1;
        zzibVar.zzd |= 1;
    }

    public static zzhz u() {
        return (zzhz) zzb.g();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", zzhy.f12464a, zziz.class, zzjv.class, zzjf.class, "zzh", zzik.f12466a});
        }
        if (i12 == 3) {
            return new zzib();
        }
        if (i12 == 4) {
            return new zzhz(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }

    public final zzjf p() {
        return this.zze == 4 ? (zzjf) this.zzf : zzjf.q();
    }
}
