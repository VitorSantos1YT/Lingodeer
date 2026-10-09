package p7;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46318a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f46319b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k7.c f46320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k7.c f46321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f46322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y6.o0 f46323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g7.j f46324g;

    public a() {
        int i11 = 0;
        b0 b0Var = null;
        this.f46320c = new k7.c(new CopyOnWriteArrayList(), i11, b0Var);
        this.f46321d = new k7.c(new CopyOnWriteArrayList(), i11, b0Var);
    }

    public abstract z a(b0 b0Var, t7.g gVar, long j11);

    public final void b(c0 c0Var) {
        HashSet hashSet = this.f46319b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(c0Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        c();
    }

    public final void d(c0 c0Var) {
        this.f46322e.getClass();
        HashSet hashSet = this.f46319b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(c0Var);
        if (zIsEmpty) {
            e();
        }
    }

    public y6.o0 f() {
        return null;
    }

    public abstract y6.x g();

    public boolean h() {
        return true;
    }

    public abstract void i();

    public final void j(c0 c0Var, d7.q qVar, g7.j jVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f46322e;
        b7.a.d(looper == null || looper == looperMyLooper);
        this.f46324g = jVar;
        y6.o0 o0Var = this.f46323f;
        this.f46318a.add(c0Var);
        if (this.f46322e == null) {
            this.f46322e = looperMyLooper;
            this.f46319b.add(c0Var);
            k(qVar);
        } else if (o0Var != null) {
            d(c0Var);
            c0Var.a(this, o0Var);
        }
    }

    public abstract void k(d7.q qVar);

    public final void l(y6.o0 o0Var) {
        this.f46323f = o0Var;
        ArrayList arrayList = this.f46318a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((c0) obj).a(this, o0Var);
        }
    }

    public abstract void m(z zVar);

    public final void n(c0 c0Var) {
        ArrayList arrayList = this.f46318a;
        arrayList.remove(c0Var);
        if (!arrayList.isEmpty()) {
            b(c0Var);
            return;
        }
        this.f46322e = null;
        this.f46323f = null;
        this.f46324g = null;
        this.f46319b.clear();
        o();
    }

    public abstract void o();

    public final void p(k7.d dVar) {
        CopyOnWriteArrayList<k7.b> copyOnWriteArrayList = this.f46321d.f37958c;
        for (k7.b bVar : copyOnWriteArrayList) {
            if (bVar.f37955a == dVar) {
                copyOnWriteArrayList.remove(bVar);
            }
        }
    }

    public final void q(h0 h0Var) {
        CopyOnWriteArrayList<g0> copyOnWriteArrayList = this.f46320c.f37958c;
        for (g0 g0Var : copyOnWriteArrayList) {
            if (g0Var.f46386b == h0Var) {
                copyOnWriteArrayList.remove(g0Var);
            }
        }
    }

    public abstract void r(y6.x xVar);

    public void c() {
    }

    public void e() {
    }
}
