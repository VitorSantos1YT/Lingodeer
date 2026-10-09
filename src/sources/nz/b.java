package nz;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends ry.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterator f44306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz.c f44307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f44308e;

    public b(Iterator source, fz.c cVar) {
        kotlin.jvm.internal.m.f(source, "source");
        this.f44306c = source;
        this.f44307d = cVar;
        this.f44308e = new HashSet();
    }

    @Override // ry.b
    public final void a() {
        Object next;
        do {
            Iterator it = this.f44306c;
            if (!it.hasNext()) {
                this.f50830a = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.f44308e.add(this.f44307d.invoke(next)));
        this.f50831b = next;
        this.f50830a = 1;
    }
}
