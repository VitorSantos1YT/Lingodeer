package w9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Binder implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f54819a;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f54819a = multiInstanceInvalidationService;
        attachInterface(this, f.G);
    }

    @Override // w9.f
    public final void M0(String[] tables, int i11) {
        kotlin.jvm.internal.m.f(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f54819a;
        synchronized (multiInstanceInvalidationService.f2688c) {
            try {
                String str = (String) multiInstanceInvalidationService.f2687b.get(Integer.valueOf(i11));
                if (str == null) {
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.f2688c.beginBroadcast();
                for (int i12 = 0; i12 < iBeginBroadcast; i12++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.f2688c.getBroadcastCookie(i12);
                        kotlin.jvm.internal.m.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.f2687b.get(num);
                        if (i11 != iIntValue && str.equals(str2)) {
                            try {
                                ((e) multiInstanceInvalidationService.f2688c.getBroadcastItem(i12)).I(tables);
                            } catch (RemoteException unused) {
                            }
                        }
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService.f2688c.finishBroadcast();
                        throw th2;
                    }
                }
                multiInstanceInvalidationService.f2688c.finishBroadcast();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        String str = f.G;
        if (i11 >= 1 && i11 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i11 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        e callback = null;
        e callback2 = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                M0(parcel.createStringArray(), parcel.readInt());
                return true;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(e.F);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) {
                    d dVar = new d();
                    dVar.f54787a = strongBinder;
                    callback2 = dVar;
                } else {
                    callback2 = (e) iInterfaceQueryLocalInterface;
                }
            }
            int i13 = parcel.readInt();
            kotlin.jvm.internal.m.f(callback2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f54819a;
            synchronized (multiInstanceInvalidationService.f2688c) {
                multiInstanceInvalidationService.f2688c.unregister(callback2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(e.F);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof e)) {
                d dVar2 = new d();
                dVar2.f54787a = strongBinder2;
                callback = dVar2;
            } else {
                callback = (e) iInterfaceQueryLocalInterface2;
            }
        }
        String string = parcel.readString();
        kotlin.jvm.internal.m.f(callback, "callback");
        int i14 = 0;
        if (string != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f54819a;
            synchronized (multiInstanceInvalidationService2.f2688c) {
                try {
                    int i15 = multiInstanceInvalidationService2.f2686a + 1;
                    multiInstanceInvalidationService2.f2686a = i15;
                    if (multiInstanceInvalidationService2.f2688c.register(callback, Integer.valueOf(i15))) {
                        multiInstanceInvalidationService2.f2687b.put(Integer.valueOf(i15), string);
                        i14 = i15;
                    } else {
                        multiInstanceInvalidationService2.f2686a--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i14);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
