package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        ArrayList arrayListK = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            if (((char) i11) != 2) {
                SafeParcelReader.w(parcel, i11);
            } else {
                arrayListK = SafeParcelReader.k(parcel, i11, zzjq.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzjs(arrayListK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzjs[i11];
    }
}
