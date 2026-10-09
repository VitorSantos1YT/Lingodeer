package tf;

import android.content.ComponentName;
import android.os.RemoteException;
import java.util.concurrent.locks.ReentrantLock;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends v.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static qp.b f52151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static m4 f52152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f52153d = new ReentrantLock();

    @Override // v.c
    public final void a(ComponentName name, qp.b bVar) {
        kotlin.jvm.internal.m.f(name, "name");
        try {
            ((d.a) ((d.c) bVar.f47832b)).j();
        } catch (RemoteException unused) {
        }
        f52151b = bVar;
        jh.h.r();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        kotlin.jvm.internal.m.f(componentName, "componentName");
    }
}
