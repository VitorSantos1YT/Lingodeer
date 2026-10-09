package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iR = 0;
        PendingIntent pendingIntent = null;
        String strG = null;
        String strG2 = null;
        ArrayList arrayListI = null;
        String strG3 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    pendingIntent = (PendingIntent) SafeParcelReader.f(parcel, i11, PendingIntent.CREATOR);
                    break;
                case 2:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 4:
                    arrayListI = SafeParcelReader.i(parcel, i11);
                    break;
                case 5:
                    strG3 = SafeParcelReader.g(parcel, i11);
                    break;
                case 6:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new SaveAccountLinkingTokenRequest(pendingIntent, strG, strG2, arrayListI, strG3, iR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new SaveAccountLinkingTokenRequest[i11];
    }
}
