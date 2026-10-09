package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        ArrayList arrayListI = null;
        ArrayList arrayListI2 = null;
        ArrayList arrayListI3 = null;
        ArrayList arrayListI4 = null;
        ArrayList arrayListI5 = null;
        int iR = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case 2:
                    arrayListI = SafeParcelReader.i(parcel, i11);
                    break;
                case 3:
                    arrayListI2 = SafeParcelReader.i(parcel, i11);
                    break;
                case 4:
                    arrayListI3 = SafeParcelReader.i(parcel, i11);
                    break;
                case 5:
                    arrayListI4 = SafeParcelReader.i(parcel, i11);
                    break;
                case 6:
                    arrayListI5 = SafeParcelReader.i(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzs(iR, arrayListI, arrayListI2, arrayListI3, arrayListI4, arrayListI5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzs[i11];
    }
}
