package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String[] strArrH = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleB = null;
        int iR = 0;
        int iR2 = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                strArrH = SafeParcelReader.h(parcel, i11);
            } else if (c11 == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.j(parcel, i11, CursorWindow.CREATOR);
            } else if (c11 == 3) {
                iR2 = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 4) {
                bundleB = SafeParcelReader.b(parcel, i11);
            } else if (c11 != 1000) {
                SafeParcelReader.w(parcel, i11);
            } else {
                iR = SafeParcelReader.r(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        DataHolder dataHolder = new DataHolder(iR, strArrH, cursorWindowArr, iR2, bundleB);
        dataHolder.f8874c = new Bundle();
        int i12 = 0;
        while (true) {
            String[] strArr = dataHolder.f8873b;
            if (i12 >= strArr.length) {
                break;
            }
            dataHolder.f8874c.putInt(strArr[i12], i12);
            i12++;
        }
        CursorWindow[] cursorWindowArr2 = dataHolder.f8875d;
        dataHolder.f8878t = new int[cursorWindowArr2.length];
        int numRows = 0;
        for (int i13 = 0; i13 < cursorWindowArr2.length; i13++) {
            dataHolder.f8878t[i13] = numRows;
            numRows += cursorWindowArr2[i13].getNumRows() - (numRows - cursorWindowArr2[i13].getStartPosition());
        }
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new DataHolder[i11];
    }
}
