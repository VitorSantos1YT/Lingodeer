package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new zzi();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProtocolVersion f9349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9350c;

    public RegisterResponseData(String str, String str2, byte[] bArr) {
        this.f9348a = bArr;
        try {
            this.f9349b = ProtocolVersion.a(str);
            this.f9350c = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return Objects.a(this.f9349b, registerResponseData.f9349b) && Arrays.equals(this.f9348a, registerResponseData.f9348a) && Objects.a(this.f9350c, registerResponseData.f9350c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9349b, Integer.valueOf(Arrays.hashCode(this.f9348a)), this.f9350c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.c(parcel, 2, this.f9348a, false);
        SafeParcelWriter.k(parcel, 3, this.f9349b.toString(), false);
        SafeParcelWriter.k(parcel, 4, this.f9350c, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    public final String toString() {
        zzam zzamVarA = zzan.a(this);
        zzamVarA.b(this.f9349b, bjXGJ.vANuoaK);
        zzch zzchVar = zzch.f9691a;
        byte[] bArr = this.f9348a;
        zzamVarA.b(zzchVar.c(bArr, bArr.length), "registerData");
        String str = this.f9350c;
        if (str != null) {
            zzamVarA.b(str, "clientDataString");
        }
        return zzamVarA.toString();
    }
}
