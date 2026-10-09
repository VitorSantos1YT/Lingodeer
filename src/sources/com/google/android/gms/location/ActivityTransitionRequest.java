package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.material.datepicker.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzo();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator f12505e = new zzn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f12508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12509d;

    public ActivityTransitionRequest(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        Preconditions.h(arrayList, "transitions can't be null");
        int i11 = 0;
        Preconditions.a("transitions can't be empty.", arrayList.size() > 0);
        TreeSet treeSet = new TreeSet(f12505e);
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ActivityTransition activityTransition = (ActivityTransition) obj;
            Preconditions.a(String.format("Found duplicated transition: %s.", activityTransition), treeSet.add(activityTransition));
        }
        this.f12506a = Collections.unmodifiableList(arrayList);
        this.f12507b = str;
        this.f12508c = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        this.f12509d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (Objects.a(this.f12506a, activityTransitionRequest.f12506a) && Objects.a(this.f12507b, activityTransitionRequest.f12507b) && Objects.a(this.f12509d, activityTransitionRequest.f12509d) && Objects.a(this.f12508c, activityTransitionRequest.f12508c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f12506a.hashCode() * 31;
        String str = this.f12507b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f12508c;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f12509d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12506a);
        String strValueOf2 = String.valueOf(this.f12508c);
        int length = strValueOf.length();
        String str = this.f12507b;
        int length2 = String.valueOf(str).length();
        int length3 = strValueOf2.length();
        String str2 = this.f12509d;
        StringBuilder sb2 = new StringBuilder(length + 79 + length2 + length3 + String.valueOf(str2).length());
        d.w(sb2, "ActivityTransitionRequest [mTransitions=", strValueOf, ", mTag='", str);
        d.w(sb2, "', mClients=", strValueOf2, ", mAttributionTag=", str2);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Preconditions.g(parcel);
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.o(parcel, 1, this.f12506a, false);
        SafeParcelWriter.k(parcel, 2, this.f12507b, false);
        SafeParcelWriter.o(parcel, 3, this.f12508c, false);
        SafeParcelWriter.k(parcel, 4, this.f12509d, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
