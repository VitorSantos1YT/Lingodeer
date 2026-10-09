package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpm implements Parcelable.Creator {
    public static void a(zzpl zzplVar, Parcel parcel) {
        int i11 = zzplVar.f13633a;
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(i11);
        SafeParcelWriter.k(parcel, 2, zzplVar.f13634b, false);
        long j11 = zzplVar.f13635c;
        SafeParcelWriter.p(parcel, 3, 8);
        parcel.writeLong(j11);
        SafeParcelWriter.i(parcel, 4, zzplVar.f13636d);
        SafeParcelWriter.k(parcel, 6, zzplVar.f13637e, false);
        SafeParcelWriter.k(parcel, 7, zzplVar.f13638f, false);
        SafeParcelWriter.e(parcel, 8, zzplVar.f13639t);
        SafeParcelWriter.r(parcel, iQ);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        Long lU = null;
        Float fValueOf = null;
        String strG2 = null;
        String strG3 = null;
        Double dO = null;
        long jT = 0;
        int iR = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case 2:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    jT = SafeParcelReader.t(parcel, i11);
                    break;
                case 4:
                    lU = SafeParcelReader.u(parcel, i11);
                    break;
                case 5:
                    int iV = SafeParcelReader.v(parcel, i11);
                    if (iV != 0) {
                        SafeParcelReader.z(parcel, iV, 4);
                        fValueOf = Float.valueOf(parcel.readFloat());
                    } else {
                        fValueOf = null;
                    }
                    break;
                case 6:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 7:
                    strG3 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\b':
                    dO = SafeParcelReader.o(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzpl(iR, strG, jT, lU, fValueOf, strG2, strG3, dO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzpl[i11];
    }
}
