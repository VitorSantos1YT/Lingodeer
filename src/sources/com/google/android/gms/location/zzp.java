package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzp implements Parcelable.Creator<ActivityTransitionResult> {
    @Override // android.os.Parcelable.Creator
    public final ActivityTransitionResult createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        ArrayList arrayListK = null;
        Bundle bundleB = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                arrayListK = SafeParcelReader.k(parcel, i11, ActivityTransitionEvent.CREATOR);
            } else if (c11 != 2) {
                SafeParcelReader.w(parcel, i11);
            } else {
                bundleB = SafeParcelReader.b(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new ActivityTransitionResult(arrayListK, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityTransitionResult[] newArray(int i11) {
        return new ActivityTransitionResult[i11];
    }
}
