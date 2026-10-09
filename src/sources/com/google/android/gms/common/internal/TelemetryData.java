package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new zaae();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f8956b;

    public TelemetryData(int i11, List list) {
        this.f8955a = i11;
        this.f8956b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8955a);
        SafeParcelWriter.o(parcel, 2, this.f8956b, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
