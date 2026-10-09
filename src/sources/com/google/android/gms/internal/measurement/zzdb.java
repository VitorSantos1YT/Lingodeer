package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new zzdc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f11500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11501e;

    public zzdb(long j11, long j12, boolean z11, Bundle bundle, String str) {
        this.f11497a = j11;
        this.f11498b = j12;
        this.f11499c = z11;
        this.f11500d = bundle;
        this.f11501e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 8);
        parcel.writeLong(this.f11497a);
        SafeParcelWriter.p(parcel, 2, 8);
        parcel.writeLong(this.f11498b);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f11499c ? 1 : 0);
        SafeParcelWriter.b(parcel, 7, this.f11500d);
        SafeParcelWriter.k(parcel, 8, this.f11501e, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
