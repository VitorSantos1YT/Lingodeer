package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzbe();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzbo[] f12522e;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f12518a == locationAvailability.f12518a && this.f12519b == locationAvailability.f12519b && this.f12520c == locationAvailability.f12520c && this.f12521d == locationAvailability.f12521d && Arrays.equals(this.f12522e, locationAvailability.f12522e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12521d), Integer.valueOf(this.f12518a), Integer.valueOf(this.f12519b), Long.valueOf(this.f12520c), this.f12522e});
    }

    public final String toString() {
        boolean z11 = this.f12521d < 1000;
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("LocationAvailability[isLocationAvailable: ");
        sb2.append(z11);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        int i12 = this.f12518a;
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(i12);
        int i13 = this.f12519b;
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(i13);
        long j11 = this.f12520c;
        SafeParcelWriter.p(parcel, 3, 8);
        parcel.writeLong(j11);
        int i14 = this.f12521d;
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(i14);
        SafeParcelWriter.n(parcel, 5, this.f12522e, i11);
        SafeParcelWriter.r(parcel, iQ);
    }
}
