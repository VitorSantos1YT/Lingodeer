package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        boolean zM = false;
        String strG = null;
        ArrayList arrayListI = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        long jT = 0;
        long jT2 = 0;
        long jT3 = 0;
        float fP = 0.0f;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case 2:
                    jT = SafeParcelReader.t(parcel, i11);
                    break;
                case 3:
                case 7:
                case '\t':
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
                case 4:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 5:
                    iR3 = SafeParcelReader.r(parcel, i11);
                    break;
                case 6:
                    arrayListI = SafeParcelReader.i(parcel, i11);
                    break;
                case '\b':
                    jT2 = SafeParcelReader.t(parcel, i11);
                    break;
                case '\n':
                    strG3 = SafeParcelReader.g(parcel, i11);
                    break;
                case 11:
                    iR2 = SafeParcelReader.r(parcel, i11);
                    break;
                case '\f':
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\r':
                    strG4 = SafeParcelReader.g(parcel, i11);
                    break;
                case 14:
                    iR4 = SafeParcelReader.r(parcel, i11);
                    break;
                case 15:
                    fP = SafeParcelReader.p(parcel, i11);
                    break;
                case 16:
                    jT3 = SafeParcelReader.t(parcel, i11);
                    break;
                case 17:
                    strG5 = SafeParcelReader.g(parcel, i11);
                    break;
                case 18:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new WakeLockEvent(iR, jT, iR2, strG, iR3, arrayListI, strG2, jT2, iR4, strG3, strG4, fP, jT3, strG5, zM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new WakeLockEvent[i11];
    }
}
