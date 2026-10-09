package gf;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f29183a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f29184b;

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName name) {
        m.f(name, "name");
        this.f29183a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder serviceBinder) {
        m.f(name, "name");
        m.f(serviceBinder, "serviceBinder");
        this.f29184b = serviceBinder;
        this.f29183a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        m.f(name, "name");
    }
}
