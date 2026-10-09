package com.google.android.gms.internal.play_billing;

import android.os.Parcel;
import com.android.billingclient.api.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzas extends zzap implements zzau {
    @Override // com.google.android.gms.internal.play_billing.zzau
    public final void h0(String str, String str2, e0 e0Var) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        int i11 = zzar.f12240a;
        parcelG.writeStrongBinder(e0Var);
        try {
            this.f12238a.transact(1, parcelG, null, 1);
        } finally {
            parcelG.recycle();
        }
    }
}
