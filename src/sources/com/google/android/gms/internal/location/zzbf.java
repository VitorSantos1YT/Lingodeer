package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final zzbe createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        int iR = 0;
        short s3 = 0;
        int iR2 = 0;
        double d5 = 0.0d;
        double d11 = 0.0d;
        float fP = 0.0f;
        long jT = 0;
        int iR3 = -1;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 2:
                    jT = SafeParcelReader.t(parcel, i11);
                    break;
                case 3:
                    SafeParcelReader.y(parcel, i11, 4);
                    s3 = (short) parcel.readInt();
                    break;
                case 4:
                    SafeParcelReader.y(parcel, i11, 8);
                    d5 = parcel.readDouble();
                    break;
                case 5:
                    SafeParcelReader.y(parcel, i11, 8);
                    d11 = parcel.readDouble();
                    break;
                case 6:
                    fP = SafeParcelReader.p(parcel, i11);
                    break;
                case 7:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case '\b':
                    iR2 = SafeParcelReader.r(parcel, i11);
                    break;
                case '\t':
                    iR3 = SafeParcelReader.r(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzbe(strG, iR, s3, d5, d11, fP, jT, iR2, iR3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int i11) {
        return new zzbe[i11];
    }
}
