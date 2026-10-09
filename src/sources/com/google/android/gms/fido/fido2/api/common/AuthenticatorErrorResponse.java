package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new zzl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ErrorCode f9238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9240c;

    public AuthenticatorErrorResponse(int i11, int i12, String str) {
        try {
            this.f9238a = ErrorCode.b(i11);
            this.f9239b = str;
            this.f9240c = i12;
        } catch (ErrorCode.UnsupportedErrorCodeException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return Objects.a(this.f9238a, authenticatorErrorResponse.f9238a) && Objects.a(this.f9239b, authenticatorErrorResponse.f9239b) && Objects.a(Integer.valueOf(this.f9240c), Integer.valueOf(authenticatorErrorResponse.f9240c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9238a, this.f9239b, Integer.valueOf(this.f9240c)});
    }

    public final String toString() {
        com.google.android.gms.internal.fido.zzam zzamVarA = com.google.android.gms.internal.fido.zzan.a(this);
        zzamVarA.a(this.f9238a.a());
        String str = this.f9239b;
        if (str != null) {
            zzamVarA.b(str, "errorMessage");
        }
        return zzamVarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        int iA = this.f9238a.a();
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(iA);
        SafeParcelWriter.k(parcel, 3, this.f9239b, false);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f9240c);
        SafeParcelWriter.r(parcel, iQ);
    }
}
