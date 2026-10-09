package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new zzd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ErrorCode f9331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9332b;

    public ErrorResponseData(int i11, String str) {
        this.f9331a = ErrorCode.b(i11);
        this.f9332b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return Objects.a(this.f9331a, errorResponseData.f9331a) && Objects.a(this.f9332b, errorResponseData.f9332b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9331a, this.f9332b});
    }

    public final String toString() {
        zzam zzamVarA = zzan.a(this);
        zzamVarA.a(this.f9331a.a());
        String str = this.f9332b;
        if (str != null) {
            zzamVarA.b(str, "errorMessage");
        }
        return zzamVarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        int iA = this.f9331a.a();
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(iA);
        SafeParcelWriter.k(parcel, 3, this.f9332b, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
