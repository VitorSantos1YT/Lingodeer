package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zaq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iR = -1;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        String strG = null;
        String strG2 = null;
        long jT = 0;
        long jT2 = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    iR2 = SafeParcelReader.r(parcel, i11);
                    break;
                case 2:
                    iR3 = SafeParcelReader.r(parcel, i11);
                    break;
                case 3:
                    iR4 = SafeParcelReader.r(parcel, i11);
                    break;
                case 4:
                    jT = SafeParcelReader.t(parcel, i11);
                    break;
                case 5:
                    jT2 = SafeParcelReader.t(parcel, i11);
                    break;
                case 6:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 7:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\b':
                    iR5 = SafeParcelReader.r(parcel, i11);
                    break;
                case '\t':
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new MethodInvocation(iR2, iR3, iR4, jT, jT2, strG, strG2, iR5, iR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new MethodInvocation[i11];
    }
}
