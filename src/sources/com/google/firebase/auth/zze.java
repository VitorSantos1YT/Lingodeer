package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p002firebaseauthapi.zzaij;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zze implements Parcelable.Creator<zzc> {
    @Override // android.os.Parcelable.Creator
    public final zzc createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        zzaij zzaijVar = null;
        String strG4 = null;
        String strG5 = null;
        String strG6 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 2:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    strG3 = SafeParcelReader.g(parcel, i11);
                    break;
                case 4:
                    zzaijVar = (zzaij) SafeParcelReader.f(parcel, i11, zzaij.CREATOR);
                    break;
                case 5:
                    strG4 = SafeParcelReader.g(parcel, i11);
                    break;
                case 6:
                    strG5 = SafeParcelReader.g(parcel, i11);
                    break;
                case 7:
                    strG6 = SafeParcelReader.g(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzc(strG, strG2, strG3, zzaijVar, strG4, strG5, strG6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzc[] newArray(int i11) {
        return new zzc[i11];
    }
}
