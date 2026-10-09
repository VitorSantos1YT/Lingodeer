package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zab> CREATOR = new zac();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8975e;

    public zab(int i11, int i12, long j11, String str, boolean z11) {
        this.f8971a = i11;
        this.f8972b = str;
        this.f8973c = j11;
        this.f8974d = i12;
        this.f8975e = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8971a);
        SafeParcelWriter.k(parcel, 2, this.f8972b, false);
        SafeParcelWriter.p(parcel, 3, 8);
        parcel.writeLong(this.f8973c);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f8974d);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f8975e ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
