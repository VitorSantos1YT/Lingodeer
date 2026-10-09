package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.fido.zzbc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialType f9275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f9277c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class UnsupportedPubKeyCredDescriptorException extends Exception {
    }

    static {
        zzbc.h(2, com.google.android.gms.internal.fido.zzh.f9705a, com.google.android.gms.internal.fido.zzh.f9706b);
        CREATOR = new zzam();
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, ArrayList arrayList) {
        Preconditions.g(str);
        try {
            this.f9275a = PublicKeyCredentialType.a(str);
            Preconditions.g(bArr);
            this.f9276b = bArr;
            this.f9277c = arrayList;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        List list = publicKeyCredentialDescriptor.f9277c;
        if (!this.f9275a.equals(publicKeyCredentialDescriptor.f9275a) || !Arrays.equals(this.f9276b, publicKeyCredentialDescriptor.f9276b)) {
            return false;
        }
        List list2 = this.f9277c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9275a, Integer.valueOf(Arrays.hashCode(this.f9276b)), this.f9277c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 2, this.f9275a.toString(), false);
        SafeParcelWriter.c(parcel, 3, this.f9276b, false);
        SafeParcelWriter.o(parcel, 4, this.f9277c, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
