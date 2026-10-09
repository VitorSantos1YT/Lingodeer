package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new zzby();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12582d;

    public zzbx(int i11, int i12, int i13, int i14) {
        Preconditions.i("Start hour must be in range [0, 23].", i11 >= 0 && i11 <= 23);
        Preconditions.i("Start minute must be in range [0, 59].", i12 >= 0 && i12 <= 59);
        Preconditions.i("End hour must be in range [0, 23].", i13 >= 0 && i13 <= 23);
        Preconditions.i("End minute must be in range [0, 59].", i14 >= 0 && i14 <= 59);
        Preconditions.i("Parameters can't be all 0.", ((i11 + i12) + i13) + i14 > 0);
        this.f12579a = i11;
        this.f12580b = i12;
        this.f12581c = i13;
        this.f12582d = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbxVar = (zzbx) obj;
        return this.f12579a == zzbxVar.f12579a && this.f12580b == zzbxVar.f12580b && this.f12581c == zzbxVar.f12581c && this.f12582d == zzbxVar.f12582d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12579a), Integer.valueOf(this.f12580b), Integer.valueOf(this.f12581c), Integer.valueOf(this.f12582d)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(117);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(this.f12579a);
        sb2.append(", startMinute=");
        sb2.append(this.f12580b);
        c.t(this.f12581c, this.f12582d, ", endHour=", ", endMinute=", sb2);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Preconditions.g(parcel);
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f12579a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f12580b);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f12581c);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f12582d);
        SafeParcelWriter.r(parcel, iQ);
    }
}
