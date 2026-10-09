package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RemoteMessageCreator implements Parcelable.Creator<RemoteMessage> {
    @Override // android.os.Parcelable.Creator
    public final RemoteMessage createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        Bundle bundleB = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            if (((char) i11) != 2) {
                SafeParcelReader.w(parcel, i11);
            } else {
                bundleB = SafeParcelReader.b(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new RemoteMessage(bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final RemoteMessage[] newArray(int i11) {
        return new RemoteMessage[i11];
    }
}
