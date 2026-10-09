package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9436a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9438c;

    public zzav(String str, int i11) {
        Preconditions.g(str);
        this.f9437b = str;
        this.f9438c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9436a);
        SafeParcelWriter.k(parcel, 2, this.f9437b, false);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f9438c);
        SafeParcelWriter.r(parcel, iQ);
    }
}
