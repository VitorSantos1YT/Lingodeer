package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zzl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12501b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SupportedActivityTransition {
    }

    public ActivityTransition(int i11, int i12) {
        this.f12500a = i11;
        this.f12501b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f12500a == activityTransition.f12500a && this.f12501b == activityTransition.f12501b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12500a), Integer.valueOf(this.f12501b)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(75);
        sb2.append("ActivityTransition [mActivityType=");
        sb2.append(this.f12500a);
        sb2.append(", mTransitionType=");
        sb2.append(this.f12501b);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Preconditions.g(parcel);
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f12500a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f12501b);
        SafeParcelWriter.r(parcel, iQ);
    }
}
