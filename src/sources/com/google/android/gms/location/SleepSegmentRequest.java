package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SleepSegmentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new zzbw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12557b;

    public SleepSegmentRequest(int i11, ArrayList arrayList) {
        this.f12556a = arrayList;
        this.f12557b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        return Objects.a(this.f12556a, sleepSegmentRequest.f12556a) && this.f12557b == sleepSegmentRequest.f12557b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12556a, Integer.valueOf(this.f12557b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Preconditions.g(parcel);
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.o(parcel, 1, this.f12556a, false);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f12557b);
        SafeParcelWriter.r(parcel, iQ);
    }
}
