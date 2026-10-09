package cf;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        kotlin.jvm.internal.m.f(name, "name");
        kotlin.jvm.internal.m.f(service, "service");
        AtomicBoolean atomicBoolean = e.f6905a;
        Context contextA = re.s.a();
        q qVar = q.f6977a;
        Object objH = null;
        if (!qf.a.b(q.class)) {
            try {
                objH = q.f6977a.h(contextA, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{service});
            } catch (Throwable th2) {
                qf.a.a(q.class, th2);
            }
        }
        e.f6911g = objH;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.m.f(name, "name");
    }
}
