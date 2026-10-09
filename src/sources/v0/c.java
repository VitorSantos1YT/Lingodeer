package v0;

import java.util.List;
import nv.p;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f53452b = new c(r.f50854a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f53453a;

    public c(List list) {
        this.f53453a = list;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final String toString() {
        return p.q("TextContextMenuData(components=", x3.a.a(this.f53453a, "\n\t", null, 56), ')');
    }
}
