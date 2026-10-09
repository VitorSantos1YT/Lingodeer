package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new zzj();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f9233e;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        Preconditions.g(bArr);
        this.f9229a = bArr;
        Preconditions.g(bArr2);
        this.f9230b = bArr2;
        Preconditions.g(bArr3);
        this.f9231c = bArr3;
        Preconditions.g(bArr4);
        this.f9232d = bArr4;
        this.f9233e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Arrays.equals(this.f9229a, authenticatorAssertionResponse.f9229a) && Arrays.equals(this.f9230b, authenticatorAssertionResponse.f9230b) && Arrays.equals(this.f9231c, authenticatorAssertionResponse.f9231c) && Arrays.equals(this.f9232d, authenticatorAssertionResponse.f9232d) && Arrays.equals(this.f9233e, authenticatorAssertionResponse.f9233e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f9229a)), Integer.valueOf(Arrays.hashCode(this.f9230b)), Integer.valueOf(Arrays.hashCode(this.f9231c)), Integer.valueOf(Arrays.hashCode(this.f9232d)), Integer.valueOf(Arrays.hashCode(this.f9233e))});
    }

    public final String toString() {
        com.google.android.gms.internal.fido.zzam zzamVarA = com.google.android.gms.internal.fido.zzan.a(this);
        zzch zzchVar = zzch.f9691a;
        byte[] bArr = this.f9229a;
        zzamVarA.b(zzchVar.c(bArr, bArr.length), "keyHandle");
        byte[] bArr2 = this.f9230b;
        zzamVarA.b(zzchVar.c(bArr2, bArr2.length), "clientDataJSON");
        byte[] bArr3 = this.f9231c;
        zzamVarA.b(zzchVar.c(bArr3, bArr3.length), "authenticatorData");
        byte[] bArr4 = this.f9232d;
        zzamVarA.b(zzchVar.c(bArr4, bArr4.length), "signature");
        byte[] bArr5 = this.f9233e;
        if (bArr5 != null) {
            zzamVarA.b(zzchVar.c(bArr5, bArr5.length), "userHandle");
        }
        return zzamVarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.c(parcel, 2, this.f9229a, false);
        SafeParcelWriter.c(parcel, 3, this.f9230b, false);
        SafeParcelWriter.c(parcel, 4, this.f9231c, false);
        SafeParcelWriter.c(parcel, 5, this.f9232d, false);
        SafeParcelWriter.c(parcel, 6, this.f9233e, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
