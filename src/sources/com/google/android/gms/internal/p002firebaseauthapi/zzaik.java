package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaik implements Parcelable.Creator<zzaih> {
    @Override // android.os.Parcelable.Creator
    public final zzaih createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        while (parcel.dataPosition() < iX) {
            SafeParcelReader.w(parcel, parcel.readInt());
        }
        SafeParcelReader.l(parcel, iX);
        return new zzaih();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaih[] newArray(int i11) {
        return new zzaih[i11];
    }
}
