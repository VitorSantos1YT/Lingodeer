package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f12511b;

    public ActivityTransitionResult(ArrayList arrayList, Bundle bundle) {
        this.f12511b = null;
        Preconditions.h(arrayList, "transitionEvents list can't be null.");
        if (!arrayList.isEmpty()) {
            for (int i11 = 1; i11 < arrayList.size(); i11++) {
                Preconditions.b(((ActivityTransitionEvent) arrayList.get(i11)).f12504c >= ((ActivityTransitionEvent) arrayList.get(i11 + (-1))).f12504c);
            }
        }
        this.f12510a = Collections.unmodifiableList(arrayList);
        this.f12511b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f12510a.equals(((ActivityTransitionResult) obj).f12510a);
    }

    public final int hashCode() {
        return this.f12510a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Preconditions.g(parcel);
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.o(parcel, 1, this.f12510a, false);
        SafeParcelWriter.b(parcel, 2, this.f12511b);
        SafeParcelWriter.r(parcel, iQ);
    }
}
