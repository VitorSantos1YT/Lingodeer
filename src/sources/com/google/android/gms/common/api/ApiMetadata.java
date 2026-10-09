package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiMetadata> CREATOR = zza.f8865a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ApiMetadata f8665d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplianceOptions f8666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8668c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ComplianceOptions f8669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8670b;
    }

    static {
        Builder builder = new Builder();
        ApiMetadata apiMetadata = new ApiMetadata(builder.f8669a, false);
        apiMetadata.f8668c = builder.f8670b;
        f8665d = apiMetadata;
        Builder builder2 = new Builder();
        builder2.f8670b = true;
        new ApiMetadata(builder2.f8669a, false).f8668c = builder2.f8670b;
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z11) {
        this.f8666a = complianceOptions;
        this.f8667b = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return Objects.a(this.f8666a, apiMetadata.f8666a) && this.f8668c == apiMetadata.f8668c && this.f8667b == apiMetadata.f8667b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8666a, Boolean.valueOf(this.f8668c), Boolean.valueOf(this.f8667b)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8666a);
        return p.u(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        if (this.f8668c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 1, this.f8666a, i11, false);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f8667b ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
