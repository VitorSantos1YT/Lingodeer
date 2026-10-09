package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzbn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12543f;

    public LocationSettingsStates(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f12538a = z11;
        this.f12539b = z12;
        this.f12540c = z13;
        this.f12541d = z14;
        this.f12542e = z15;
        this.f12543f = z16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f12538a ? 1 : 0);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f12539b ? 1 : 0);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f12540c ? 1 : 0);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f12541d ? 1 : 0);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f12542e ? 1 : 0);
        SafeParcelWriter.p(parcel, 6, 4);
        parcel.writeInt(this.f12543f ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
