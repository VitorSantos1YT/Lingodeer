package kb;

import fb.l;
import kotlin.jvm.internal.m;
import ob.p;
import rz.e0;
import rz.y;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f38047a = 0;

    static {
        m.e(l.c("WorkConstraintsTracker"), "tagWithPrefix(\"WorkConstraintsTracker\")");
    }

    public static final z1 a(ed.c cVar, p pVar, y dispatcher, h listener) {
        m.f(cVar, "<this>");
        m.f(dispatcher, "dispatcher");
        m.f(listener, "listener");
        return e0.B(e0.c(dispatcher), null, null, new fr.c(cVar, pVar, listener, (vy.d) null, 26), 3);
    }
}
