package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zzk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f9237d;

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        Preconditions.g(bArr);
        this.f9234a = bArr;
        Preconditions.g(bArr2);
        this.f9235b = bArr2;
        Preconditions.g(bArr3);
        this.f9236c = bArr3;
        Preconditions.g(strArr);
        this.f9237d = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Arrays.equals(this.f9234a, authenticatorAttestationResponse.f9234a) && Arrays.equals(this.f9235b, authenticatorAttestationResponse.f9235b) && Arrays.equals(this.f9236c, authenticatorAttestationResponse.f9236c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f9234a)), Integer.valueOf(Arrays.hashCode(this.f9235b)), Integer.valueOf(Arrays.hashCode(this.f9236c))});
    }

    public final String toString() {
        com.google.android.gms.internal.fido.zzam zzamVarA = com.google.android.gms.internal.fido.zzan.a(this);
        zzch zzchVar = zzch.f9691a;
        byte[] bArr = this.f9234a;
        zzamVarA.b(zzchVar.c(bArr, bArr.length), "keyHandle");
        byte[] bArr2 = this.f9235b;
        zzamVarA.b(zzchVar.c(bArr2, bArr2.length), "clientDataJSON");
        byte[] bArr3 = this.f9236c;
        zzamVarA.b(zzchVar.c(bArr3, bArr3.length), "attestationObject");
        zzamVarA.b(Arrays.toString(this.f9237d), "transports");
        return zzamVarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.c(parcel, 2, this.f9234a, false);
        SafeParcelWriter.c(parcel, 3, this.f9235b, false);
        SafeParcelWriter.c(parcel, 4, this.f9236c, false);
        SafeParcelWriter.l(parcel, 5, this.f9237d);
        SafeParcelWriter.r(parcel, iQ);
    }
}
