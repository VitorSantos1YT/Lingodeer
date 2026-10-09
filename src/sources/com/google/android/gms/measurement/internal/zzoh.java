package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new zzoi();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13547c;

    public zzoh(String str, long j11, int i11) {
        this.f13545a = str;
        this.f13546b = j11;
        this.f13547c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f13545a, false);
        SafeParcelWriter.p(parcel, 2, 8);
        parcel.writeLong(this.f13546b);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f13547c);
        SafeParcelWriter.r(parcel, iQ);
    }
}
