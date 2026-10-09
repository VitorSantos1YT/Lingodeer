package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p002firebaseauthapi.zzahd;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzag implements Parcelable.Creator<zzad> {
    @Override // android.os.Parcelable.Creator
    public final zzad createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        zzahd zzahdVar = null;
        String strG = null;
        String strG2 = null;
        ArrayList arrayListK = null;
        ArrayList arrayListI = null;
        String strG3 = null;
        Boolean boolN = null;
        zzaf zzafVar = null;
        com.google.firebase.auth.zzc zzcVar = null;
        zzbl zzblVar = null;
        ArrayList arrayListK2 = null;
        boolean zM = false;
        zzz zzzVar = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            ArrayList arrayList = arrayListK2;
            switch ((char) i11) {
                case 1:
                    zzahdVar = (zzahd) SafeParcelReader.f(parcel, i11, zzahd.CREATOR);
                    break;
                case 2:
                    zzzVar = (zzz) SafeParcelReader.f(parcel, i11, zzz.CREATOR);
                    break;
                case 3:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 4:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 5:
                    arrayListK = SafeParcelReader.k(parcel, i11, zzz.CREATOR);
                    break;
                case 6:
                    arrayListI = SafeParcelReader.i(parcel, i11);
                    break;
                case 7:
                    strG3 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\b':
                    boolN = SafeParcelReader.n(parcel, i11);
                    break;
                case '\t':
                    zzafVar = (zzaf) SafeParcelReader.f(parcel, i11, zzaf.CREATOR);
                    break;
                case '\n':
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 11:
                    zzcVar = (com.google.firebase.auth.zzc) SafeParcelReader.f(parcel, i11, com.google.firebase.auth.zzc.CREATOR);
                    break;
                case '\f':
                    zzblVar = (zzbl) SafeParcelReader.f(parcel, i11, zzbl.CREATOR);
                    break;
                case '\r':
                    arrayListK2 = SafeParcelReader.k(parcel, i11, com.google.firebase.auth.zzao.CREATOR);
                    continue;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
            arrayListK2 = arrayList;
        }
        SafeParcelReader.l(parcel, iX);
        zzad zzadVar = new zzad();
        zzadVar.f17933a = zzahdVar;
        zzadVar.f17934b = zzzVar;
        zzadVar.f17935c = strG;
        zzadVar.f17936d = strG2;
        zzadVar.f17937e = arrayListK;
        zzadVar.f17938f = arrayListI;
        zzadVar.f17939t = strG3;
        zzadVar.H = boolN;
        zzadVar.K = zzafVar;
        zzadVar.L = zM;
        zzadVar.M = zzcVar;
        zzadVar.N = zzblVar;
        zzadVar.O = arrayListK2;
        return zzadVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzad[] newArray(int i11) {
        return new zzad[i11];
    }
}
