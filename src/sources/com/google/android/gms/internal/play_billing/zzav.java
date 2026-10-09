package com.google.android.gms.internal.play_billing;

import android.os.Parcel;
import com.android.billingclient.api.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzav extends zzaq implements zzaw {
    public zzav() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzaq
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 != 1) {
            return false;
        }
        int i12 = parcel.readInt();
        zzar.b(parcel);
        ((e0) this).f7501a.a(Integer.valueOf(i12));
        return true;
    }
}
