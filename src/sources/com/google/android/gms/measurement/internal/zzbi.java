package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbi implements Parcelable.Creator {
    public static void a(zzbh zzbhVar, Parcel parcel, int i11) {
        String str = zzbhVar.f12702a;
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 2, str, false);
        SafeParcelWriter.j(parcel, 3, zzbhVar.f12703b, i11, false);
        SafeParcelWriter.k(parcel, 4, zzbhVar.f12704c, false);
        long j11 = zzbhVar.f12705d;
        SafeParcelWriter.p(parcel, 5, 8);
        parcel.writeLong(j11);
        long j12 = zzbhVar.f12706e;
        SafeParcelWriter.p(parcel, 6, 8);
        parcel.writeLong(j12);
        SafeParcelWriter.r(parcel, iQ);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        long jT = 0;
        long jT2 = 0;
        String strG = null;
        zzbf zzbfVar = null;
        String strG2 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 2) {
                strG = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 3) {
                zzbfVar = (zzbf) SafeParcelReader.f(parcel, i11, zzbf.CREATOR);
            } else if (c11 == 4) {
                strG2 = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 5) {
                jT = SafeParcelReader.t(parcel, i11);
            } else if (c11 != 6) {
                SafeParcelReader.w(parcel, i11);
            } else {
                jT2 = SafeParcelReader.t(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzbh(strG, zzbfVar, strG2, jT, jT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzbh[i11];
    }
}
