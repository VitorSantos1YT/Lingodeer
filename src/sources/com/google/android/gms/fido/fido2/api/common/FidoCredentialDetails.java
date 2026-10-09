package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new zzy();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9258f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f9259t;

    public FidoCredentialDetails(String str, String str2, byte[] bArr, byte[] bArr2, boolean z11, boolean z12, long j11) {
        this.f9253a = str;
        this.f9254b = str2;
        this.f9255c = bArr;
        this.f9256d = bArr2;
        this.f9257e = z11;
        this.f9258f = z12;
        this.f9259t = j11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        return Objects.a(this.f9253a, fidoCredentialDetails.f9253a) && Objects.a(this.f9254b, fidoCredentialDetails.f9254b) && Arrays.equals(this.f9255c, fidoCredentialDetails.f9255c) && Arrays.equals(this.f9256d, fidoCredentialDetails.f9256d) && this.f9257e == fidoCredentialDetails.f9257e && this.f9258f == fidoCredentialDetails.f9258f && this.f9259t == fidoCredentialDetails.f9259t;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9253a, this.f9254b, this.f9255c, this.f9256d, Boolean.valueOf(this.f9257e), Boolean.valueOf(this.f9258f), Long.valueOf(this.f9259t)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f9253a, false);
        SafeParcelWriter.k(parcel, 2, this.f9254b, false);
        SafeParcelWriter.c(parcel, 3, this.f9255c, false);
        SafeParcelWriter.c(parcel, 4, this.f9256d, false);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f9257e ? 1 : 0);
        SafeParcelWriter.p(parcel, 6, 4);
        parcel.writeInt(this.f9258f ? 1 : 0);
        SafeParcelWriter.p(parcel, 7, 8);
        parcel.writeLong(this.f9259t);
        SafeParcelWriter.r(parcel, iQ);
    }
}
