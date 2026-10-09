package f;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f26173b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.j f26174c;

    public x(boolean z11) {
        this.f26172a = z11;
    }

    public abstract void b();

    public void c(a backEvent) {
        kotlin.jvm.internal.m.f(backEvent, "backEvent");
    }

    public void d(a backEvent) {
        kotlin.jvm.internal.m.f(backEvent, "backEvent");
    }

    public final void e() {
        Iterator it = this.f26173b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).cancel();
        }
    }

    public void a() {
    }
}
