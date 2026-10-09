package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzba f11086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.location.zzbd f11087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f11088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.location.zzba f11089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzai f11090f;

    public zzbc(int i11, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        com.google.android.gms.location.zzbd zzbbVar;
        com.google.android.gms.location.zzba zzayVar;
        this.f11085a = i11;
        this.f11086b = zzbaVar;
        zzai zzagVar = null;
        if (iBinder == null) {
            zzbbVar = null;
        } else {
            int i12 = com.google.android.gms.location.zzbc.f12567a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            zzbbVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.location.zzbd ? (com.google.android.gms.location.zzbd) iInterfaceQueryLocalInterface : new com.google.android.gms.location.zzbb(iBinder, "com.google.android.gms.location.ILocationListener");
        }
        this.f11087c = zzbbVar;
        this.f11088d = pendingIntent;
        if (iBinder2 == null) {
            zzayVar = null;
        } else {
            int i13 = com.google.android.gms.location.zzaz.f12566a;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            zzayVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.location.zzba ? (com.google.android.gms.location.zzba) iInterfaceQueryLocalInterface2 : new com.google.android.gms.location.zzay(iBinder2, "com.google.android.gms.location.ILocationCallback");
        }
        this.f11089e = zzayVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface3 instanceof zzai ? (zzai) iInterfaceQueryLocalInterface3 : new zzag(iBinder3);
        }
        this.f11090f = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f11085a);
        SafeParcelWriter.j(parcel, 2, this.f11086b, i11, false);
        com.google.android.gms.location.zzbd zzbdVar = this.f11087c;
        SafeParcelWriter.f(parcel, 3, zzbdVar == null ? null : zzbdVar.asBinder());
        SafeParcelWriter.j(parcel, 4, this.f11088d, i11, false);
        com.google.android.gms.location.zzba zzbaVar = this.f11089e;
        SafeParcelWriter.f(parcel, 5, zzbaVar == null ? null : zzbaVar.asBinder());
        zzai zzaiVar = this.f11090f;
        SafeParcelWriter.f(parcel, 6, zzaiVar != null ? zzaiVar.asBinder() : null);
        SafeParcelWriter.r(parcel, iQ);
    }
}
