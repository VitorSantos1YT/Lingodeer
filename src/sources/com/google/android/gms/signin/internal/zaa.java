package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f13701c;

    public zaa() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f13700b == 0 ? Status.f8703e : Status.K;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f13699a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f13700b);
        SafeParcelWriter.j(parcel, 3, this.f13701c, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    public zaa(int i11, int i12, Intent intent) {
        this.f13699a = i11;
        this.f13700b = i12;
        this.f13701c = intent;
    }
}
