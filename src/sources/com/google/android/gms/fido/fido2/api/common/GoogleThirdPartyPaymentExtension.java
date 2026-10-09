package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new zzaf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9260a;

    public GoogleThirdPartyPaymentExtension(boolean z11) {
        this.f9260a = z11;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GoogleThirdPartyPaymentExtension) && this.f9260a == ((GoogleThirdPartyPaymentExtension) obj).f9260a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9260a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9260a ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
