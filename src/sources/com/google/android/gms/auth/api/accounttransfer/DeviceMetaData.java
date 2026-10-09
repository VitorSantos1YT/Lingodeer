package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new zzy();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8358d;

    public DeviceMetaData(int i11, long j11, boolean z11, boolean z12) {
        this.f8355a = i11;
        this.f8356b = z11;
        this.f8357c = j11;
        this.f8358d = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8355a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f8356b ? 1 : 0);
        SafeParcelWriter.p(parcel, 3, 8);
        parcel.writeLong(this.f8357c);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f8358d ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
