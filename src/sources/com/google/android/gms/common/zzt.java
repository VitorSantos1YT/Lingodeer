package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzk f9183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9185d;

    public zzt(String str, zzk zzkVar, boolean z11, boolean z12) {
        this.f9182a = str;
        this.f9183b = zzkVar;
        this.f9184c = z11;
        this.f9185d = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f9182a, false);
        zzk zzkVar = this.f9183b;
        if (zzkVar == null) {
            zzkVar = null;
        }
        SafeParcelWriter.f(parcel, 2, zzkVar);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f9184c ? 1 : 0);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f9185d ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }

    public zzt(String str, IBinder iBinder, boolean z11, boolean z12) {
        this.f9182a = str;
        zzk zzkVar = null;
        if (iBinder != null) {
            try {
                int i11 = com.google.android.gms.common.internal.zzw.f9045a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                IObjectWrapper iObjectWrapperZzd = (iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.zzx ? (com.google.android.gms.common.internal.zzx) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.zzv(iBinder, "com.google.android.gms.common.internal.ICertData")).zzd();
                byte[] bArr = iObjectWrapperZzd == null ? null : (byte[]) ObjectWrapper.j(iObjectWrapperZzd);
                if (bArr != null) {
                    zzkVar = new zzk(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.f9183b = zzkVar;
        this.f9184c = z11;
        this.f9185d = z12;
    }
}
