package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzk implements Parcelable.Creator<ActivityRecognitionResult> {
    @Override // android.os.Parcelable.Creator
    public final ActivityRecognitionResult createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        ArrayList arrayListK = null;
        boolean z11 = false;
        Bundle bundleB = null;
        long jT = 0;
        long jT2 = 0;
        int iR = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                arrayListK = SafeParcelReader.k(parcel, i11, DetectedActivity.CREATOR);
            } else if (c11 == 2) {
                jT = SafeParcelReader.t(parcel, i11);
            } else if (c11 == 3) {
                jT2 = SafeParcelReader.t(parcel, i11);
            } else if (c11 == 4) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 != 5) {
                SafeParcelReader.w(parcel, i11);
            } else {
                bundleB = SafeParcelReader.b(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult();
        Preconditions.a("Must have at least 1 detected activity", arrayListK != null && arrayListK.size() > 0);
        if (jT > 0 && jT2 > 0) {
            z11 = true;
        }
        Preconditions.a("Must set times", z11);
        activityRecognitionResult.f12495a = arrayListK;
        activityRecognitionResult.f12496b = jT;
        activityRecognitionResult.f12497c = jT2;
        activityRecognitionResult.f12498d = iR;
        activityRecognitionResult.f12499e = bundleB;
        return activityRecognitionResult;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityRecognitionResult[] newArray(int i11) {
        return new ActivityRecognitionResult[i11];
    }
}
