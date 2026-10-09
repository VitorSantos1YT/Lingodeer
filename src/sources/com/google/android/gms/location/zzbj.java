package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = new zzbk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12570c;

    public zzbj(String str, String str2, String str3) {
        this.f12570c = str;
        this.f12568a = str2;
        this.f12569b = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f12568a, false);
        SafeParcelWriter.k(parcel, 2, this.f12569b, false);
        SafeParcelWriter.k(parcel, 5, this.f12570c, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
