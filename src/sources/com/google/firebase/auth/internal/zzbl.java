package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbl> CREATOR = new zzbk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17972b;

    public zzbl(ArrayList arrayList, ArrayList arrayList2) {
        this.f17971a = arrayList == null ? new ArrayList() : arrayList;
        this.f17972b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.o(parcel, 1, this.f17971a, false);
        SafeParcelWriter.o(parcel, 2, this.f17972b, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
