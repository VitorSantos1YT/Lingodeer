package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new zzan();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialType f9278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final COSEAlgorithmIdentifier f9279b;

    public PublicKeyCredentialParameters(String str, int i11) {
        Preconditions.g(str);
        try {
            this.f9278a = PublicKeyCredentialType.a(str);
            try {
                this.f9279b = COSEAlgorithmIdentifier.a(i11);
            } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e8) {
                throw new IllegalArgumentException(e8);
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.f9278a.equals(publicKeyCredentialParameters.f9278a) && this.f9279b.equals(publicKeyCredentialParameters.f9279b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9278a, this.f9279b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 2, this.f9278a.toString(), false);
        SafeParcelWriter.h(parcel, 3, Integer.valueOf(this.f9279b.f9251a.a()));
        SafeParcelWriter.r(parcel, iQ);
    }
}
