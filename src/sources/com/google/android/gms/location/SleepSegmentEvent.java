package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new zzbv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12555e;

    public SleepSegmentEvent(int i11, int i12, long j11, long j12, int i13) {
        Preconditions.a("endTimeMillis must be greater than or equal to startTimeMillis", j11 <= j12);
        this.f12551a = j11;
        this.f12552b = j12;
        this.f12553c = i11;
        this.f12554d = i12;
        this.f12555e = i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.f12551a == sleepSegmentEvent.f12551a && this.f12552b == sleepSegmentEvent.f12552b && this.f12553c == sleepSegmentEvent.f12553c && this.f12554d == sleepSegmentEvent.f12554d && this.f12555e == sleepSegmentEvent.f12555e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f12551a), Long.valueOf(this.f12552b), Integer.valueOf(this.f12553c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(84);
        sb2.append("startMillis=");
        sb2.append(this.f12551a);
        sb2.append(", endMillis=");
        sb2.append(this.f12552b);
        sb2.append(", status=");
        sb2.append(this.f12553c);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Preconditions.g(parcel);
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 8);
        parcel.writeLong(this.f12551a);
        SafeParcelWriter.p(parcel, 2, 8);
        parcel.writeLong(this.f12552b);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f12553c);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f12554d);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f12555e);
        SafeParcelWriter.r(parcel, iQ);
    }
}
