package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.drawerlayout.widget.ktFt.FpIL;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzu[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        HashSet hashSet = new HashSet();
        int iR = 0;
        zzw zzwVar = null;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 != 1) {
                if (c11 != 2) {
                    if (c11 != 3) {
                        if (c11 != 4) {
                            if (c11 != 5) {
                                SafeParcelReader.w(parcel, i11);
                            } else {
                                strG3 = SafeParcelReader.g(parcel, i11);
                                hashSet.add(5);
                            }
                        } else {
                            strG2 = SafeParcelReader.g(parcel, i11);
                            hashSet.add(4);
                        }
                    } else {
                        strG = SafeParcelReader.g(parcel, i11);
                        hashSet.add(3);
                    }
                } else {
                    zzwVar = (zzw) SafeParcelReader.f(parcel, i11, zzw.CREATOR);
                    hashSet.add(2);
                }
            } else {
                iR = SafeParcelReader.r(parcel, i11);
                hashSet.add(1);
            }
        }
        if (parcel.dataPosition() == iX) {
            return new zzu(hashSet, iR, zzwVar, strG, strG2, strG3);
        }
        throw new SafeParcelReader.ParseException(p.j(iX, FpIL.iBeqkJiEVI), parcel);
    }
}
