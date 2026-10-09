package mw;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u2 extends lw.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42714b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2 f42716d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f42713a = new AtomicReference(y2.f42812h0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s2 f42715c = new s2(this);

    public u2(y2 y2Var, String str) {
        this.f42716d = y2Var;
        Preconditions.k(str, "authority");
        this.f42714b = str;
    }

    @Override // lw.d
    public final String e() {
        return this.f42714b;
    }

    @Override // lw.d
    public final lw.f f(lw.e1 e1Var, lw.c cVar) {
        y2 y2Var = this.f42716d;
        lw.t1 t1Var = y2Var.m;
        AtomicReference atomicReference = this.f42713a;
        Object obj = atomicReference.get();
        l2 l2Var = y2.f42812h0;
        if (obj != l2Var) {
            return g(e1Var, cVar);
        }
        t1Var.execute(new aj.i(this, 15));
        if (atomicReference.get() != l2Var) {
            return g(e1Var, cVar);
        }
        if (y2Var.G.get()) {
            return new k0(2);
        }
        t2 t2Var = new t2(this, lw.r.b(), e1Var, cVar);
        t1Var.execute(new i0(19, this, t2Var));
        return t2Var;
    }

    public final lw.f g(lw.e1 e1Var, lw.c cVar) {
        lw.d0 d0Var = (lw.d0) this.f42713a.get();
        s2 s2Var = this.f42715c;
        if (d0Var == null) {
            return s2Var.f(e1Var, cVar);
        }
        if (!(d0Var instanceof d3)) {
            return new o2(d0Var, s2Var, this.f42716d.f42823h, e1Var, cVar);
        }
        e3 e3Var = ((d3) d0Var).f42390b;
        c3 c3Var = (c3) e3Var.f42408b.get(e1Var.f40368b);
        if (c3Var == null) {
            c3Var = (c3) e3Var.f42409c.get(e1Var.f40369c);
        }
        if (c3Var == null) {
            c3Var = e3Var.f42407a;
        }
        if (c3Var != null) {
            cVar = cVar.c(c3.f42372g, c3Var);
        }
        return s2Var.f(e1Var, cVar);
    }

    public final void h(lw.d0 d0Var) {
        LinkedHashSet linkedHashSet;
        AtomicReference atomicReference = this.f42713a;
        lw.d0 d0Var2 = (lw.d0) atomicReference.get();
        atomicReference.set(d0Var);
        if (d0Var2 != y2.f42812h0 || (linkedHashSet = this.f42716d.B) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((t2) it.next()).u();
        }
    }
}
