package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zzbl implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f11471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11472b;

    public zzbl(IBinder iBinder, String str) {
        this.f11471a = iBinder;
        this.f11472b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11471a;
    }

    public final Parcel g(Parcel parcel, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f11471a.transact(i11, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e8) {
                parcelObtain.recycle();
                throw e8;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }

    public final Parcel h() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f11472b);
        return parcelObtain;
    }

    public final void h1(Parcel parcel) {
        try {
            this.f11471a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final void j(Parcel parcel, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f11471a.transact(i11, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
