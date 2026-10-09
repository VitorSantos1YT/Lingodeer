package nu;

import kotlin.jvm.internal.m;
import l1.k1;
import rz.b0;
import rz.e0;
import rz.g1;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu.b f44062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ou.c f44063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f44064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ou.e f44065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fz.a f44066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fz.a f44067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z1 f44068g;

    public e(pu.b state, ou.c hanziBean, b0 coroutineScope, ou.e eVar, fz.a aVar, fz.a onAnimEnd) {
        m.f(state, "state");
        m.f(hanziBean, "hanziBean");
        m.f(coroutineScope, "coroutineScope");
        m.f(onAnimEnd, "onAnimEnd");
        this.f44062a = state;
        this.f44063b = hanziBean;
        this.f44064c = coroutineScope;
        this.f44065d = eVar;
        this.f44066e = aVar;
        this.f44067f = onAnimEnd;
    }

    public static final void a(e eVar) {
        pu.b bVar = eVar.f44062a;
        b0 b0Var = eVar.f44064c;
        k1 k1Var = bVar.E;
        k1 k1Var2 = bVar.J;
        k1Var.setValue(Boolean.TRUE);
        vy.d dVar = null;
        if (eVar.f44065d.f46089k) {
            bVar.j(true);
            k1Var2.setValue(e0.B(b0Var, null, null, new ns.j(eVar, dVar, 1), 3));
            return;
        }
        bVar.j(false);
        g1 g1Var = (g1) k1Var2.getValue();
        if (g1Var != null) {
            g1Var.cancel(null);
        }
        k1Var2.setValue(e0.B(b0Var, null, null, new c(eVar, dVar, 0), 3));
        eVar.f44066e.invoke();
    }

    public static final void b(e eVar) {
        if (eVar.f44065d.f46087i && eVar.f44062a.c() == ou.f.Writer) {
            z1 z1Var = eVar.f44068g;
            vy.d dVar = null;
            if (z1Var != null) {
                z1Var.cancel(null);
            }
            eVar.f44068g = e0.B(eVar.f44064c, null, null, new a(eVar, dVar, 4), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void c() {
        pu.b bVar = this.f44062a;
        int iB = bVar.b();
        k1 k1Var = bVar.B;
        if (iB >= this.f44063b.f46072e.size()) {
            return;
        }
        g1 g1Var = (g1) k1Var.getValue();
        vy.d dVar = null;
        if (g1Var != null) {
            g1Var.cancel(null);
        }
        k1Var.setValue(e0.B(this.f44064c, null, null, new a(this, dVar, 1), 3));
    }

    public final void d(ou.f mode) {
        m.f(mode, "mode");
        e0.B(this.f44064c, null, null, new d(this, mode, null), 3);
    }

    public final void e() {
        z1 z1Var = this.f44068g;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        pu.b bVar = this.f44062a;
        g1 g1Var = (g1) bVar.B.getValue();
        if (g1Var != null) {
            g1Var.cancel(null);
        }
        k1 k1Var = bVar.f47175r;
        Boolean bool = Boolean.FALSE;
        k1Var.setValue(bool);
        bVar.C.setValue(bool);
    }
}
