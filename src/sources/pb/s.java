package pb;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm.a f46757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f46758b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f46759c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f46760d = new Object();

    static {
        fb.l.c("WorkTimer");
    }

    public s(dm.a aVar) {
        this.f46757a = aVar;
    }

    public final void a(ob.j jVar) {
        synchronized (this.f46760d) {
            try {
                if (((r) this.f46758b.remove(jVar)) != null) {
                    fb.l lVarB = fb.l.b();
                    Objects.toString(jVar);
                    lVarB.getClass();
                    this.f46759c.remove(jVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
