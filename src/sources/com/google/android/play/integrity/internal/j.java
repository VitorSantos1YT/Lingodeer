package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends b implements k {
    public j() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.b
    public final boolean a(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) c.a(parcel);
            c.b(parcel);
            e(bundle);
            return true;
        }
        if (i11 == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            Bundle bundle2 = (Bundle) c.a(parcel);
            c.b(parcel);
            c(bundle2);
            return true;
        }
        if (i11 == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            Bundle bundle3 = (Bundle) c.a(parcel);
            c.b(parcel);
            d(bundle3);
            return true;
        }
        if (i11 != 5) {
            return false;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        Bundle bundle4 = (Bundle) c.a(parcel);
        c.b(parcel);
        b(bundle4);
        return true;
    }
}
