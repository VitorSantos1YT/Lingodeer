package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        Integer numS = null;
        Double dO = null;
        Uri uri = null;
        ArrayList arrayListK = null;
        ArrayList arrayListK2 = null;
        ChannelIdValue channelIdValue = null;
        String strG = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 2:
                    numS = SafeParcelReader.s(parcel, i11);
                    break;
                case 3:
                    dO = SafeParcelReader.o(parcel, i11);
                    break;
                case 4:
                    uri = (Uri) SafeParcelReader.f(parcel, i11, Uri.CREATOR);
                    break;
                case 5:
                    arrayListK = SafeParcelReader.k(parcel, i11, RegisterRequest.CREATOR);
                    break;
                case 6:
                    arrayListK2 = SafeParcelReader.k(parcel, i11, RegisteredKey.CREATOR);
                    break;
                case 7:
                    channelIdValue = (ChannelIdValue) SafeParcelReader.f(parcel, i11, ChannelIdValue.CREATOR);
                    break;
                case '\b':
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new RegisterRequestParams(numS, dO, uri, arrayListK, arrayListK2, channelIdValue, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new RegisterRequestParams[i11];
    }
}
