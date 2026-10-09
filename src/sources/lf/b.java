package lf;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f39965a;

    public b(IBinder iBinder) {
        this.f39965a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f39965a;
    }

    public final String g() {
        Parcel parcelObtain = Parcel.obtain();
        kotlin.jvm.internal.m.e(parcelObtain, "obtain()");
        Parcel parcelObtain2 = Parcel.obtain();
        kotlin.jvm.internal.m.e(parcelObtain2, "obtain()");
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f39965a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final boolean h() {
        Parcel parcelObtain = Parcel.obtain();
        kotlin.jvm.internal.m.e(parcelObtain, "obtain()");
        Parcel parcelObtain2 = Parcel.obtain();
        kotlin.jvm.internal.m.e(parcelObtain2, "obtain()");
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            parcelObtain.writeInt(1);
            this.f39965a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
