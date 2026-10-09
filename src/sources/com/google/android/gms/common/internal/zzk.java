package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        Bundle bundleB = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iR = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                bundleB = SafeParcelReader.b(parcel, i11);
            } else if (c11 == 2) {
                featureArr = (Feature[]) SafeParcelReader.j(parcel, i11, Feature.CREATOR);
            } else if (c11 == 3) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 != 4) {
                SafeParcelReader.w(parcel, i11);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.f(parcel, i11, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        zzj zzjVar = new zzj();
        zzjVar.f9022a = bundleB;
        zzjVar.f9023b = featureArr;
        zzjVar.f9024c = iR;
        zzjVar.f9025d = connectionTelemetryConfiguration;
        return zzjVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzj[i11];
    }
}
