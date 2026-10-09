package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectionResult f13707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zay f13708c;

    public zak(int i11, ConnectionResult connectionResult, zay zayVar) {
        this.f13706a = i11;
        this.f13707b = connectionResult;
        this.f13708c = zayVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f13706a);
        SafeParcelWriter.j(parcel, 2, this.f13707b, i11, false);
        SafeParcelWriter.j(parcel, 3, this.f13708c, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
