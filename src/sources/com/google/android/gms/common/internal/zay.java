package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zay> CREATOR = new zaz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f8995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConnectionResult f8996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8998e;

    public zay(int i11, IBinder iBinder, ConnectionResult connectionResult, boolean z11, boolean z12) {
        this.f8994a = i11;
        this.f8995b = iBinder;
        this.f8996c = connectionResult;
        this.f8997d = z11;
        this.f8998e = z12;
    }

    public final boolean equals(Object obj) {
        Object zztVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zay)) {
            return false;
        }
        zay zayVar = (zay) obj;
        if (!this.f8996c.equals(zayVar.f8996c)) {
            return false;
        }
        Object zztVar2 = null;
        IBinder iBinder = this.f8995b;
        if (iBinder == null) {
            zztVar = null;
        } else {
            int i11 = IAccountAccessor.Stub.f8931a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            zztVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        IBinder iBinder2 = zayVar.f8995b;
        if (iBinder2 != null) {
            int i12 = IAccountAccessor.Stub.f8931a;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            zztVar2 = iInterfaceQueryLocalInterface2 instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface2 : new zzt(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        return Objects.a(zztVar, zztVar2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8994a);
        SafeParcelWriter.f(parcel, 2, this.f8995b);
        SafeParcelWriter.j(parcel, 3, this.f8996c, i11, false);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f8997d ? 1 : 0);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f8998e ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
