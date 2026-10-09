package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        String strG2 = null;
        com.google.android.gms.common.server.converter.zaa zaaVar = null;
        int iR = 0;
        int iR2 = 0;
        boolean zM = false;
        int iR3 = 0;
        boolean zM2 = false;
        int iR4 = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case 2:
                    iR2 = SafeParcelReader.r(parcel, i11);
                    break;
                case 3:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 4:
                    iR3 = SafeParcelReader.r(parcel, i11);
                    break;
                case 5:
                    zM2 = SafeParcelReader.m(parcel, i11);
                    break;
                case 6:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 7:
                    iR4 = SafeParcelReader.r(parcel, i11);
                    break;
                case '\b':
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\t':
                    zaaVar = (com.google.android.gms.common.server.converter.zaa) SafeParcelReader.f(parcel, i11, com.google.android.gms.common.server.converter.zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new FastJsonResponse.Field(iR, iR2, zM, iR3, zM2, strG, iR4, strG2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new FastJsonResponse.Field[i11];
    }
}
