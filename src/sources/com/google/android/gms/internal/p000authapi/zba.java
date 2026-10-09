package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zba implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f9384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9385b;

    public zba(IBinder iBinder, String str) {
        this.f9384a = iBinder;
        this.f9385b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9384a;
    }

    public final Parcel g() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f9385b);
        return parcelObtain;
    }

    public final void h(Parcel parcel, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f9384a.transact(i11, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
