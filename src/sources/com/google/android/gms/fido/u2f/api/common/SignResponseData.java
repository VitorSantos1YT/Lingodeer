package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator<SignResponseData> CREATOR = new zzl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9364d;

    public SignResponseData(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Preconditions.g(bArr);
        this.f9361a = bArr;
        Preconditions.g(str);
        this.f9362b = str;
        Preconditions.g(bArr2);
        this.f9363c = bArr2;
        Preconditions.g(bArr3);
        this.f9364d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.f9361a, signResponseData.f9361a) && Objects.a(this.f9362b, signResponseData.f9362b) && Arrays.equals(this.f9363c, signResponseData.f9363c) && Arrays.equals(this.f9364d, signResponseData.f9364d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f9361a)), this.f9362b, Integer.valueOf(Arrays.hashCode(this.f9363c)), Integer.valueOf(Arrays.hashCode(this.f9364d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.c(parcel, 2, this.f9361a, false);
        SafeParcelWriter.k(parcel, 3, this.f9362b, false);
        SafeParcelWriter.c(parcel, 4, this.f9363c, false);
        SafeParcelWriter.c(parcel, 5, this.f9364d, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    public final String toString() {
        zzam zzamVarA = zzan.a(this);
        zzch zzchVar = zzch.f9691a;
        byte[] bArr = this.f9361a;
        zzamVarA.b(zzchVar.c(bArr, bArr.length), SemtNwfPgIhi.zasopyZaUW);
        zzamVarA.b(this.f9362b, "clientDataString");
        byte[] bArr2 = this.f9363c;
        zzamVarA.b(zzchVar.c(bArr2, bArr2.length), "signatureData");
        byte[] bArr3 = this.f9364d;
        zzamVarA.b(zzchVar.c(bArr3, bArr3.length), "application");
        return zzamVarA.toString();
    }
}
