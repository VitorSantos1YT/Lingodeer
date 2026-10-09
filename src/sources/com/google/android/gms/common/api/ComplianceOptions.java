package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8675d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
    }

    static {
        new Builder();
        new ComplianceOptions(-1, -1, 0, true);
        CREATOR = new zzc();
    }

    public ComplianceOptions(int i11, int i12, int i13, boolean z11) {
        this.f8672a = i11;
        this.f8673b = i12;
        this.f8674c = i13;
        this.f8675d = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.f8672a == complianceOptions.f8672a && this.f8673b == complianceOptions.f8673b && this.f8674c == complianceOptions.f8674c && this.f8675d == complianceOptions.f8675d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8672a), Integer.valueOf(this.f8673b), Integer.valueOf(this.f8674c), Boolean.valueOf(this.f8675d)});
    }

    public final String toString() {
        int i11 = this.f8672a;
        int length = String.valueOf(i11).length();
        int i12 = this.f8673b;
        int length2 = String.valueOf(i12).length();
        int i13 = this.f8674c;
        int length3 = String.valueOf(i13).length();
        boolean z11 = this.f8675d;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z11).length() + 1);
        c.t(i11, i12, "ComplianceOptions{callerProductId=", ", dataOwnerProductId=", sb2);
        sb2.append(", processingReason=");
        sb2.append(i13);
        sb2.append(", isUserData=");
        sb2.append(z11);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8672a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f8673b);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f8674c);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f8675d ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
