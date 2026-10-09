package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaim implements Parcelable.Creator<zzaij> {
    @Override // android.os.Parcelable.Creator
    public final zzaij createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        String strG8 = null;
        String strG9 = null;
        String strG10 = null;
        String strG11 = null;
        String strG12 = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        String strG13 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            String str = strG10;
            switch ((char) i11) {
                case 2:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    strG13 = SafeParcelReader.g(parcel, i11);
                    break;
                case 4:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 5:
                    strG3 = SafeParcelReader.g(parcel, i11);
                    break;
                case 6:
                    strG4 = SafeParcelReader.g(parcel, i11);
                    break;
                case 7:
                    strG5 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\b':
                    strG6 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\t':
                    strG7 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\n':
                    zM2 = SafeParcelReader.m(parcel, i11);
                    break;
                case 11:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case '\f':
                    strG8 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\r':
                    strG9 = SafeParcelReader.g(parcel, i11);
                    break;
                case 14:
                    strG10 = SafeParcelReader.g(parcel, i11);
                    continue;
                case 15:
                    strG12 = SafeParcelReader.g(parcel, i11);
                    break;
                case 16:
                    zM3 = SafeParcelReader.m(parcel, i11);
                    break;
                case 17:
                    strG11 = SafeParcelReader.g(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
            strG10 = str;
        }
        SafeParcelReader.l(parcel, iX);
        zzaij zzaijVar = new zzaij();
        zzaijVar.f10010a = strG;
        zzaijVar.f10011b = strG13;
        zzaijVar.f10012c = strG2;
        zzaijVar.f10013d = strG3;
        zzaijVar.f10014e = strG4;
        zzaijVar.f10015f = strG5;
        zzaijVar.f10016t = strG6;
        zzaijVar.H = strG7;
        zzaijVar.K = zM2;
        zzaijVar.L = zM;
        zzaijVar.M = strG8;
        zzaijVar.N = strG9;
        zzaijVar.O = strG10;
        zzaijVar.P = strG12;
        zzaijVar.Q = zM3;
        zzaijVar.R = strG11;
        return zzaijVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaij[] newArray(int i11) {
        return new zzaij[i11];
    }
}
