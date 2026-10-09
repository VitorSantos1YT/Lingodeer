package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f16221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16222b;

    public a(IBinder iBinder, String str) {
        this.f16221a = iBinder;
        this.f16222b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16221a;
    }

    public final void g(Parcel parcel, int i11) {
        try {
            this.f16221a.transact(i11, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
