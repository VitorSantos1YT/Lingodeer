package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new zzal();
    public final String H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AuthenticatorAttestationResponse f9264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AuthenticatorAssertionResponse f9265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AuthenticatorErrorResponse f9266f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AuthenticationExtensionsClientOutputs f9267t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {
    }

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z11 = true;
        if ((authenticatorAttestationResponse == null || authenticatorAssertionResponse != null || authenticatorErrorResponse != null) && ((authenticatorAttestationResponse != null || authenticatorAssertionResponse == null || authenticatorErrorResponse != null) && (authenticatorAttestationResponse != null || authenticatorAssertionResponse != null || authenticatorErrorResponse == null))) {
            z11 = false;
        }
        Preconditions.b(z11);
        this.f9261a = str;
        this.f9262b = str2;
        this.f9263c = bArr;
        this.f9264d = authenticatorAttestationResponse;
        this.f9265e = authenticatorAssertionResponse;
        this.f9266f = authenticatorErrorResponse;
        this.f9267t = authenticationExtensionsClientOutputs;
        this.H = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return Objects.a(this.f9261a, publicKeyCredential.f9261a) && Objects.a(this.f9262b, publicKeyCredential.f9262b) && Arrays.equals(this.f9263c, publicKeyCredential.f9263c) && Objects.a(this.f9264d, publicKeyCredential.f9264d) && Objects.a(this.f9265e, publicKeyCredential.f9265e) && Objects.a(this.f9266f, publicKeyCredential.f9266f) && Objects.a(this.f9267t, publicKeyCredential.f9267t) && Objects.a(this.H, publicKeyCredential.H);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9261a, this.f9262b, this.f9263c, this.f9265e, this.f9264d, this.f9266f, this.f9267t, this.H});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f9261a, false);
        SafeParcelWriter.k(parcel, 2, this.f9262b, false);
        SafeParcelWriter.c(parcel, 3, this.f9263c, false);
        SafeParcelWriter.j(parcel, 4, this.f9264d, i11, false);
        SafeParcelWriter.j(parcel, 5, this.f9265e, i11, false);
        SafeParcelWriter.j(parcel, 6, this.f9266f, i11, false);
        SafeParcelWriter.j(parcel, 7, this.f9267t, i11, false);
        SafeParcelWriter.k(parcel, 8, this.H, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
