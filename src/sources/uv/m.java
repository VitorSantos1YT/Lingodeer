package uv;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends Binder implements zv.b {
    @Override // zv.b
    public final void P(aw.p pVar) {
        aw.s.f3241a.a(pVar);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 >= 1 && i11 <= 16777215) {
            parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
        }
        if (i11 == 1598968902) {
            parcel2.writeString("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
            return true;
        }
        if (i11 != 1) {
            return super.onTransact(i11, parcel, parcel2, i12);
        }
        P(parcel.readInt() != 0 ? aw.p.CREATOR.createFromParcel(parcel) : null);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
