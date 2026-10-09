package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzik implements zzfl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzfl f12466a = new zzik();

    private zzik() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfl
    public final boolean zza(int i11) {
        zzil zzilVar;
        if (i11 == 0) {
            zzilVar = zzil.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i11 == 1) {
            zzilVar = zzil.PURCHASES_UPDATED_ACTION;
        } else if (i11 != 2) {
            zzilVar = i11 != 3 ? null : zzil.ALTERNATIVE_BILLING_ACTION;
        } else {
            zzilVar = zzil.LOCAL_PURCHASES_UPDATED_ACTION;
        }
        return zzilVar != null;
    }
}
