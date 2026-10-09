package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringToIntConverter f9079b;

    public zaa(int i11, StringToIntConverter stringToIntConverter) {
        this.f9078a = i11;
        this.f9079b = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9078a);
        SafeParcelWriter.j(parcel, 2, this.f9079b, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f9078a = 1;
        this.f9079b = stringToIntConverter;
    }
}
