package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzag();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12619c;

    public zzaf(long j11, int i11, long j12) {
        this.f12617a = j11;
        this.f12618b = i11;
        this.f12619c = j12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 8);
        parcel.writeLong(this.f12617a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f12618b);
        SafeParcelWriter.p(parcel, 3, 8);
        parcel.writeLong(this.f12619c);
        SafeParcelWriter.r(parcel, iQ);
    }
}
