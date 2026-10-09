package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zaa implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f9585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9586b;

    public zaa(IBinder iBinder, String str) {
        this.f9585a = iBinder;
        this.f9586b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9585a;
    }

    public final Parcel g() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f9586b);
        return parcelObtain;
    }

    public final void h(Parcel parcel) {
        try {
            this.f9585a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
