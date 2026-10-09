package se;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Serializable {
    private static final long serialVersionUID = 20160629001L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f51617a;

    public x() {
        this.f51617a = new HashMap();
    }

    private final Object writeReplace() {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            return new w(this.f51617a);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public final void a(b bVar, List appEvents) {
        HashMap map = this.f51617a;
        if (qf.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.m.f(appEvents, "appEvents");
            if (!map.containsKey(bVar)) {
                map.put(bVar, ry.m.c1(appEvents));
                return;
            }
            List list = (List) map.get(bVar);
            if (list != null) {
                list.addAll(appEvents);
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public x(HashMap appEventMap) {
        kotlin.jvm.internal.m.f(appEventMap, "appEventMap");
        HashMap map = new HashMap();
        this.f51617a = map;
        map.putAll(appEventMap);
    }
}
