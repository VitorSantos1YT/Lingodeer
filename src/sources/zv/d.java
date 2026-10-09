package zv;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends Binder implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f59584a = 0;

    public d() {
        attachInterface(this, "com.liulishuo.filedownloader.i.IFileDownloadIPCService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 >= 1 && i11 <= 16777215) {
            parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
        }
        if (i11 == 1598968902) {
            parcel2.writeString("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
            return true;
        }
        b bVar = null;
        b bVar2 = null;
        switch (i11) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                        a aVar = new a();
                        aVar.f59582a = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (b) iInterfaceQueryLocalInterface;
                    }
                }
                K(bVar);
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof b)) {
                        a aVar2 = new a();
                        aVar2.f59582a = strongBinder2;
                        bVar2 = aVar2;
                    } else {
                        bVar2 = (b) iInterfaceQueryLocalInterface2;
                    }
                }
                a0(bVar2);
                return true;
            case 3:
                boolean zC0 = c0(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zC0 ? 1 : 0);
                return true;
            case 4:
                H0(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0 ? bw.b.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zE = e(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zE ? 1 : 0);
                return true;
            case 6:
                l();
                parcel2.writeNoException();
                return true;
            case 7:
                boolean zF0 = f0(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zF0 ? 1 : 0);
                return true;
            case 8:
                long jK0 = K0(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(jK0);
                return true;
            case 9:
                long jV0 = v0(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(jV0);
                return true;
            case 10:
                byte b3 = b(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeByte(b3);
                return true;
            case 11:
                boolean zI = i();
                parcel2.writeNoException();
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 12:
                c1(parcel.readInt(), (Notification) (parcel.readInt() != 0 ? Notification.CREATOR.createFromParcel(parcel) : null));
                return true;
            case 13:
                x0(parcel.readInt() != 0);
                return true;
            case 14:
                boolean zR0 = r0(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zR0 ? 1 : 0);
                return true;
            case 15:
                U();
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i11, parcel, parcel2, i12);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
