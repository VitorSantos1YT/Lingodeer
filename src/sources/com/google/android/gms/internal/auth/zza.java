package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f9422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9423b;

    public zza(IBinder iBinder, String str) {
        this.f9422a = iBinder;
        this.f9423b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9422a;
    }

    public final Parcel g() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f9423b);
        return parcelObtain;
    }

    public final void h(Parcel parcel, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f9422a.transact(i11, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
