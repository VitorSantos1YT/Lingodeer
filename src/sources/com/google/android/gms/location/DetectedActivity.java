package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12513b;

    static {
        new zzq();
        CREATOR = new zzr();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f12512a == detectedActivity.f12512a && this.f12513b == detectedActivity.f12513b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12512a), Integer.valueOf(this.f12513b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Preconditions.g(parcel);
        int iQ = SafeParcelWriter.q(parcel, 20293);
        int i12 = this.f12512a;
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(i12);
        int i13 = this.f12513b;
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(i13);
        SafeParcelWriter.r(parcel, iQ);
    }

    public final String toString() {
        String string;
        int i11 = this.f12512a;
        if (i11 > 22 || i11 < 0) {
            i11 = 4;
        }
        if (i11 == 0) {
            string = "IN_VEHICLE";
        } else if (i11 == 1) {
            string = "ON_BICYCLE";
        } else if (i11 == 2) {
            string = "ON_FOOT";
        } else if (i11 == 3) {
            string = "STILL";
        } else if (i11 == 4) {
            string = "UNKNOWN";
        } else if (i11 == 5) {
            string = "TILTING";
        } else if (i11 == 7) {
            string = "WALKING";
        } else if (i11 == 8) {
            string = "RUNNING";
        } else if (i11 != 16) {
            string = i11 != 17 ? Integer.toString(i11) : "IN_RAIL_VEHICLE";
        } else {
            string = "IN_ROAD_VEHICLE";
        }
        int i12 = this.f12513b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 48);
        sb2.append(MzwEyWCkjXL.gnPRUhcLugSb);
        sb2.append(string);
        sb2.append(", confidence=");
        sb2.append(i12);
        sb2.append("]");
        return sb2.toString();
    }
}
