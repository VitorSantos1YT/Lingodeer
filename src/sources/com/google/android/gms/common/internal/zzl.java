package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrE = null;
        int[] iArrE2 = null;
        boolean zM = false;
        boolean zM2 = false;
        int iR = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.f(parcel, i11, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 3:
                    zM2 = SafeParcelReader.m(parcel, i11);
                    break;
                case 4:
                    iArrE = SafeParcelReader.e(parcel, i11);
                    break;
                case 5:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case 6:
                    iArrE2 = SafeParcelReader.e(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zM, zM2, iArrE, iR, iArrE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new ConnectionTelemetryConfiguration[i11];
    }
}
