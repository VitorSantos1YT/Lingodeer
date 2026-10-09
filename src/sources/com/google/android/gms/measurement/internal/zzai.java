package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        String strG2 = null;
        zzpl zzplVar = null;
        String strG3 = null;
        zzbh zzbhVar = null;
        zzbh zzbhVar2 = null;
        zzbh zzbhVar3 = null;
        long jT = 0;
        long jT2 = 0;
        long jT3 = 0;
        boolean zM = false;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 2:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 4:
                    zzplVar = (zzpl) SafeParcelReader.f(parcel, i11, zzpl.CREATOR);
                    break;
                case 5:
                    jT = SafeParcelReader.t(parcel, i11);
                    break;
                case 6:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 7:
                    strG3 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\b':
                    zzbhVar = (zzbh) SafeParcelReader.f(parcel, i11, zzbh.CREATOR);
                    break;
                case '\t':
                    jT2 = SafeParcelReader.t(parcel, i11);
                    break;
                case '\n':
                    zzbhVar2 = (zzbh) SafeParcelReader.f(parcel, i11, zzbh.CREATOR);
                    break;
                case 11:
                    jT3 = SafeParcelReader.t(parcel, i11);
                    break;
                case '\f':
                    zzbhVar3 = (zzbh) SafeParcelReader.f(parcel, i11, zzbh.CREATOR);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzah(strG, strG2, zzplVar, jT, zM, strG3, zzbhVar, jT2, zzbhVar2, jT3, zzbhVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzah[i11];
    }
}
