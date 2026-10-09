package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoo> CREATOR = new zzop();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13560a;

    public zzoo(ArrayList arrayList) {
        this.f13560a = arrayList;
    }

    public static zzoo D1(zzls... zzlsVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlsVarArr[0].zza()));
        return new zzoo(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        List list = this.f13560a;
        if (list != null) {
            int iQ2 = SafeParcelWriter.q(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i12 = 0; i12 < size; i12++) {
                parcel.writeInt(((Integer) list.get(i12)).intValue());
            }
            SafeParcelWriter.r(parcel, iQ2);
        }
        SafeParcelWriter.r(parcel, iQ);
    }
}
