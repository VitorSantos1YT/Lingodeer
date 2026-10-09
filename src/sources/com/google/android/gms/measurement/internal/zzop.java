package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzop implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        while (true) {
            ArrayList arrayList = null;
            while (true) {
                if (parcel.dataPosition() >= iX) {
                    SafeParcelReader.l(parcel, iX);
                    return new zzoo(arrayList);
                }
                int i11 = parcel.readInt();
                if (((char) i11) != 1) {
                    SafeParcelReader.w(parcel, i11);
                } else {
                    int iV = SafeParcelReader.v(parcel, i11);
                    int iDataPosition = parcel.dataPosition();
                    if (iV == 0) {
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = parcel.readInt();
                    for (int i13 = 0; i13 < i12; i13++) {
                        arrayList2.add(Integer.valueOf(parcel.readInt()));
                    }
                    parcel.setDataPosition(iDataPosition + iV);
                    arrayList = arrayList2;
                }
            }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzoo[i11];
    }
}
