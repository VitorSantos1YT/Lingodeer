package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbf implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final LocationRequest createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iR = 102;
        long jT = 3600000;
        long jT2 = 600000;
        boolean zM = false;
        long jT3 = 0;
        float fP = 0.0f;
        int iR2 = Integer.MAX_VALUE;
        long jT4 = Long.MAX_VALUE;
        boolean zM2 = false;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            boolean z11 = zM2;
            switch ((char) i11) {
                case 1:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case 2:
                    jT = SafeParcelReader.t(parcel, i11);
                    break;
                case 3:
                    jT2 = SafeParcelReader.t(parcel, i11);
                    break;
                case 4:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 5:
                    jT4 = SafeParcelReader.t(parcel, i11);
                    break;
                case 6:
                    iR2 = SafeParcelReader.r(parcel, i11);
                    break;
                case 7:
                    fP = SafeParcelReader.p(parcel, i11);
                    break;
                case '\b':
                    jT3 = SafeParcelReader.t(parcel, i11);
                    break;
                case '\t':
                    zM2 = SafeParcelReader.m(parcel, i11);
                    continue;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
            zM2 = z11;
        }
        SafeParcelReader.l(parcel, iX);
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.f12523a = iR;
        locationRequest.f12524b = jT;
        locationRequest.f12525c = jT2;
        locationRequest.f12526d = zM;
        locationRequest.f12527e = jT4;
        locationRequest.f12528f = iR2;
        locationRequest.f12529t = fP;
        locationRequest.H = jT3;
        locationRequest.K = zM2;
        return locationRequest;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i11) {
        return new LocationRequest[i11];
    }
}
