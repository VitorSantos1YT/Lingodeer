package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new zae();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9082c;

    public zac(int i11, int i12, String str) {
        this.f9080a = i11;
        this.f9081b = str;
        this.f9082c = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9080a);
        SafeParcelWriter.k(parcel, 2, this.f9081b, false);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f9082c);
        SafeParcelWriter.r(parcel, iQ);
    }

    public zac(String str, int i11) {
        this.f9080a = 1;
        this.f9081b = str;
        this.f9082c = i11;
    }
}
