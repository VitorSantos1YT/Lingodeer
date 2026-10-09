package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzag();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8952e;

    public RootTelemetryConfiguration(int i11, int i12, int i13, boolean z11, boolean z12) {
        this.f8948a = i11;
        this.f8949b = z11;
        this.f8950c = z12;
        this.f8951d = i12;
        this.f8952e = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8948a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f8949b ? 1 : 0);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f8950c ? 1 : 0);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f8951d);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f8952e);
        SafeParcelWriter.r(parcel, iQ);
    }
}
