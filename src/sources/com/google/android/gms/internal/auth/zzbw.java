package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9455b;

    public zzbw() {
        this.f9454a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9454a);
        SafeParcelWriter.k(parcel, 2, this.f9455b, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    public zzbw(int i11, String str) {
        this.f9454a = i11;
        this.f9455b = str;
    }
}
