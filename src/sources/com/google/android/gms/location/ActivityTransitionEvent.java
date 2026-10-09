package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12504c;

    public ActivityTransitionEvent(long j11, int i11, int i12) {
        Parcelable.Creator<ActivityTransition> creator = ActivityTransition.CREATOR;
        boolean z11 = false;
        if (i12 >= 0 && i12 <= 1) {
            z11 = true;
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Transition type ");
        sb2.append(i12);
        sb2.append(" is not valid.");
        Preconditions.a(sb2.toString(), z11);
        this.f12502a = i11;
        this.f12503b = i12;
        this.f12504c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f12502a == activityTransitionEvent.f12502a && this.f12503b == activityTransitionEvent.f12503b && this.f12504c == activityTransitionEvent.f12504c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12502a), Integer.valueOf(this.f12503b), Long.valueOf(this.f12504c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder(24);
        sb3.append("ActivityType ");
        sb3.append(this.f12502a);
        sb2.append(sb3.toString());
        sb2.append(" ");
        StringBuilder sb4 = new StringBuilder(26);
        sb4.append("TransitionType ");
        sb4.append(this.f12503b);
        sb2.append(sb4.toString());
        sb2.append(" ");
        StringBuilder sb5 = new StringBuilder(41);
        sb5.append("ElapsedRealTimeNanos ");
        sb5.append(this.f12504c);
        sb2.append(sb5.toString());
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Preconditions.g(parcel);
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f12502a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f12503b);
        SafeParcelWriter.p(parcel, 3, 8);
        parcel.writeLong(this.f12504c);
        SafeParcelWriter.r(parcel, iQ);
    }
}
