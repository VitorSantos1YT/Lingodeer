package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzj f11119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.location.zzax f11120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzai f11121d;

    public zzl(int i11, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        com.google.android.gms.location.zzax zzavVar;
        this.f11118a = i11;
        this.f11119b = zzjVar;
        zzai zzagVar = null;
        if (iBinder == null) {
            zzavVar = null;
        } else {
            int i12 = com.google.android.gms.location.zzaw.f12565a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            zzavVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.location.zzax ? (com.google.android.gms.location.zzax) iInterfaceQueryLocalInterface : new com.google.android.gms.location.zzav(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
        }
        this.f11120c = zzavVar;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface2 instanceof zzai ? (zzai) iInterfaceQueryLocalInterface2 : new zzag(iBinder2);
        }
        this.f11121d = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f11118a);
        SafeParcelWriter.j(parcel, 2, this.f11119b, i11, false);
        com.google.android.gms.location.zzax zzaxVar = this.f11120c;
        SafeParcelWriter.f(parcel, 3, zzaxVar == null ? null : zzaxVar.asBinder());
        zzai zzaiVar = this.f11121d;
        SafeParcelWriter.f(parcel, 4, zzaiVar != null ? zzaiVar.asBinder() : null);
        SafeParcelWriter.r(parcel, iQ);
    }
}
