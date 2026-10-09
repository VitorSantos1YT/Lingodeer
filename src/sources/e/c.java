package e;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Binder implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24631b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f24632a;

    public c(d dVar) {
        this.f24632a = dVar;
        attachInterface(this, b.f24630u);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        String str = b.f24630u;
        if (i11 >= 1 && i11 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i11 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i11 != 1) {
            return super.onTransact(i11, parcel, parcel2, i12);
        }
        this.f24632a.a(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
