package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbb implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final zzba createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        List listK = zzba.N;
        LocationRequest locationRequest = null;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        long jT = Long.MAX_VALUE;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 != 1) {
                switch (c11) {
                    case 5:
                        listK = SafeParcelReader.k(parcel, i11, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        strG = SafeParcelReader.g(parcel, i11);
                        break;
                    case 7:
                        zM = SafeParcelReader.m(parcel, i11);
                        break;
                    case '\b':
                        zM2 = SafeParcelReader.m(parcel, i11);
                        break;
                    case '\t':
                        zM3 = SafeParcelReader.m(parcel, i11);
                        break;
                    case '\n':
                        strG2 = SafeParcelReader.g(parcel, i11);
                        break;
                    case 11:
                        zM4 = SafeParcelReader.m(parcel, i11);
                        break;
                    case '\f':
                        zM5 = SafeParcelReader.m(parcel, i11);
                        break;
                    case '\r':
                        strG3 = SafeParcelReader.g(parcel, i11);
                        break;
                    case 14:
                        jT = SafeParcelReader.t(parcel, i11);
                        break;
                    default:
                        SafeParcelReader.w(parcel, i11);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.f(parcel, i11, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzba(locationRequest, listK, strG, zM, zM2, zM3, strG2, zM4, zM5, strG3, jT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i11) {
        return new zzba[i11];
    }
}
