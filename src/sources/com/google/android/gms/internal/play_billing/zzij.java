package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzij extends zzfi implements zzgm {
    private static final zzij zzb;

    static {
        zzij zzijVar = new zzij();
        zzb = zzijVar;
        zzfi.m(zzij.class, zzijVar);
    }

    private zzij() {
    }

    public static zzij p() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\u0000", null);
        }
        if (i12 == 3) {
            return new zzij();
        }
        if (i12 == 4) {
            return new zzih(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }
}
