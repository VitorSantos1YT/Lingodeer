package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import defpackage.e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f12495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f12499e;

    public static boolean D1(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!D1(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i11 = 0; i11 < length; i11++) {
                            if (Objects.a(Array.get(obj, i11), Array.get(obj2, i11))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        return this.f12496b == activityRecognitionResult.f12496b && this.f12497c == activityRecognitionResult.f12497c && this.f12498d == activityRecognitionResult.f12498d && Objects.a(this.f12495a, activityRecognitionResult.f12495a) && D1(this.f12499e, activityRecognitionResult.f12499e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f12496b), Long.valueOf(this.f12497c), Integer.valueOf(this.f12498d), this.f12495a, this.f12499e});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12495a);
        long j11 = this.f12496b;
        long j12 = this.f12497c;
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 124);
        e.C(sb2, "ActivityRecognitionResult [probableActivities=", strValueOf, ", timeMillis=");
        sb2.append(j11);
        sb2.append(", elapsedRealtimeMillis=");
        sb2.append(j12);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.o(parcel, 1, this.f12495a, false);
        long j11 = this.f12496b;
        SafeParcelWriter.p(parcel, 2, 8);
        parcel.writeLong(j11);
        long j12 = this.f12497c;
        SafeParcelWriter.p(parcel, 3, 8);
        parcel.writeLong(j12);
        int i12 = this.f12498d;
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(i12);
        SafeParcelWriter.b(parcel, 5, this.f12499e);
        SafeParcelWriter.r(parcel, iQ);
    }
}
