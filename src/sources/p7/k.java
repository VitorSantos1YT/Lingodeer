package p7;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f46410h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f46411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d7.q f46412j;

    @Override // p7.a
    public final void c() {
        for (j jVar : this.f46410h.values()) {
            jVar.f46400a.b(jVar.f46401b);
        }
    }

    @Override // p7.a
    public final void e() {
        for (j jVar : this.f46410h.values()) {
            jVar.f46400a.d(jVar.f46401b);
        }
    }

    @Override // p7.a
    public void i() {
        Iterator it = this.f46410h.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).f46400a.i();
        }
    }

    @Override // p7.a
    public void o() {
        HashMap map = this.f46410h;
        for (j jVar : map.values()) {
            a aVar = jVar.f46400a;
            i iVar = jVar.f46402c;
            aVar.n(jVar.f46401b);
            aVar.q(iVar);
            aVar.p(iVar);
        }
        map.clear();
    }

    public abstract b0 s(Object obj, b0 b0Var);

    public abstract void v(Object obj, a aVar, y6.o0 o0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [p7.c0, p7.h] */
    public final void w(final Object obj, a aVar) {
        HashMap map = this.f46410h;
        b7.a.d(!map.containsKey(obj));
        ?? r9 = new c0() { // from class: p7.h
            @Override // p7.c0
            public final void a(a aVar2, y6.o0 o0Var) {
                this.f46391a.v(obj, aVar2, o0Var);
            }
        };
        i iVar = new i(this, obj);
        map.put(obj, new j(aVar, r9, iVar));
        Handler handler = this.f46411i;
        handler.getClass();
        aVar.getClass();
        k7.c cVar = aVar.f46320c;
        cVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = cVar.f37958c;
        g0 g0Var = new g0();
        g0Var.f46385a = handler;
        g0Var.f46386b = iVar;
        copyOnWriteArrayList.add(g0Var);
        this.f46411i.getClass();
        k7.c cVar2 = aVar.f46321d;
        cVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = cVar2.f37958c;
        k7.b bVar = new k7.b();
        bVar.f37955a = iVar;
        copyOnWriteArrayList2.add(bVar);
        d7.q qVar = this.f46412j;
        g7.j jVar = this.f46324g;
        b7.a.k(jVar);
        aVar.j(r9, qVar, jVar);
        if (this.f46319b.isEmpty()) {
            aVar.b(r9);
        }
    }

    public long t(long j11, Object obj) {
        return j11;
    }

    public int u(int i11, Object obj) {
        return i11;
    }
}
