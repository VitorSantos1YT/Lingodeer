package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zzap implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f12238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12239b;

    public zzap(IBinder iBinder, String str) {
        this.f12238a = iBinder;
        this.f12239b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12238a;
    }

    public final Parcel g() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f12239b);
        return parcelObtain;
    }

    public final Parcel h(Parcel parcel, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f12238a.transact(i11, parcel, parcelObtain, 0);
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
}
