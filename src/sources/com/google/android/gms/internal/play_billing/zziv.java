package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zziv extends zzfi implements zzgm {
    private static final zziv zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zziv zzivVar = new zziv();
        zzb = zzivVar;
        zzfi.m(zziv.class, zzivVar);
    }

    private zziv() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zziv();
        }
        if (i12 == 4) {
            return new zzit(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }
}
