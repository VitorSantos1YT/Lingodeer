package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new zaa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9074c;

    public FavaDiagnosticsEntity(int i11, int i12, String str) {
        this.f9072a = i11;
        this.f9073b = str;
        this.f9074c = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9072a);
        SafeParcelWriter.k(parcel, 2, this.f9073b, false);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f9074c);
        SafeParcelWriter.r(parcel, iQ);
    }
}
