package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f9022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Feature[] f9023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConnectionTelemetryConfiguration f9025d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.b(parcel, 1, this.f9022a);
        SafeParcelWriter.n(parcel, 2, this.f9023b, i11);
        int i12 = this.f9024c;
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(i12);
        SafeParcelWriter.j(parcel, 4, this.f9025d, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
