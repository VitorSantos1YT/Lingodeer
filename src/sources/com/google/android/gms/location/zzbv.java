package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbv implements Parcelable.Creator<SleepSegmentEvent> {
    @Override // android.os.Parcelable.Creator
    public final SleepSegmentEvent createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        long jT = 0;
        long jT2 = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                jT = SafeParcelReader.t(parcel, i11);
            } else if (c11 == 2) {
                jT2 = SafeParcelReader.t(parcel, i11);
            } else if (c11 == 3) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 4) {
                iR2 = SafeParcelReader.r(parcel, i11);
            } else if (c11 != 5) {
                SafeParcelReader.w(parcel, i11);
            } else {
                iR3 = SafeParcelReader.r(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new SleepSegmentEvent(iR, iR2, jT, jT2, iR3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepSegmentEvent[] newArray(int i11) {
        return new SleepSegmentEvent[i11];
    }
}
