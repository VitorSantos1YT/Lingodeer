package v;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f53449a;

    public abstract void a(ComponentName componentName, qp.b bVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d.c cVar;
        if (this.f53449a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i11 = d.b.f22626a;
        if (iBinder == null) {
            cVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d.c)) {
                d.a aVar = new d.a();
                aVar.f22625a = iBinder;
                cVar = aVar;
            } else {
                cVar = (d.c) iInterfaceQueryLocalInterface;
            }
        }
        a(componentName, new qp.b(6, cVar, componentName));
    }
}
