package r1;

import java.util.Iterator;
import nz.k;
import o1.e;
import q1.c;
import ry.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f48737d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f48738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f48740c;

    static {
        s1.b bVar = s1.b.f51280a;
        f48737d = new b(bVar, bVar, c.f47360c);
    }

    public b(Object obj, Object obj2, c cVar) {
        this.f48738a = obj;
        this.f48739b = obj2;
        this.f48740c = cVar;
    }

    @Override // ry.a
    public final int b() {
        c cVar = this.f48740c;
        cVar.getClass();
        return cVar.f47362b;
    }

    @Override // ry.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f48740c.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new k(this.f48738a, this.f48740c);
    }
}
