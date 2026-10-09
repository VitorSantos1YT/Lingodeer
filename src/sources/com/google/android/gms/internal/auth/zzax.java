package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzax> CREATOR = new zzay();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9439a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9440b;

    public zzax(String str) {
        Preconditions.g(str);
        this.f9440b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9439a);
        SafeParcelWriter.k(parcel, 2, this.f9440b, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
