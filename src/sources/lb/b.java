package lb;

import j9.r;
import kotlin.jvm.internal.m;
import ob.p;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f39870a;

    public b(r tracker) {
        m.f(tracker, "tracker");
        this.f39870a = tracker;
    }

    @Override // lb.d
    public final uz.c a(fb.f constraints) {
        m.f(constraints, "constraints");
        return x0.g(new kb.e(this, (vy.d) null, 6));
    }

    @Override // lb.d
    public final boolean b(p pVar) {
        return c(pVar) && e(this.f39870a.c());
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
