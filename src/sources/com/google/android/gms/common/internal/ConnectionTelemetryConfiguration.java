package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new zzl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RootTelemetryConfiguration f8910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f8913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f8915f;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z11, boolean z12, int[] iArr, int i11, int[] iArr2) {
        this.f8910a = rootTelemetryConfiguration;
        this.f8911b = z11;
        this.f8912c = z12;
        this.f8913d = iArr;
        this.f8914e = i11;
        this.f8915f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 1, this.f8910a, i11, false);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f8911b ? 1 : 0);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f8912c ? 1 : 0);
        SafeParcelWriter.g(parcel, 4, this.f8913d);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f8914e);
        SafeParcelWriter.g(parcel, 6, this.f8915f);
        SafeParcelWriter.r(parcel, iQ);
    }
}
