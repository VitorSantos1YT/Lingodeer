package mw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z3 extends lw.q0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lw.f f42875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public lw.y f42876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public lw.n f42877h = lw.n.IDLE;

    public z3(lw.f fVar) {
        this.f42875f = fVar;
    }

    @Override // lw.q0
    public final lw.q1 a(lw.n0 n0Var) {
        Boolean bool;
        List list = n0Var.f40422a;
        if (list.isEmpty()) {
            lw.q1 q1VarH = lw.q1.m.h("NameResolver returned no usable address. addrs=" + list + ", attrs=" + n0Var.f40423b);
            c(q1VarH);
            return q1VarH;
        }
        Object obj = n0Var.f40424c;
        if ((obj instanceof x3) && (bool = ((x3) obj).f42795a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        lw.y yVar = this.f42876g;
        if (yVar == null) {
            ob.m mVarB = lw.k0.b();
            mVarB.Q(list);
            lw.k0 k0VarH = mVarB.H();
            lw.f fVar = this.f42875f;
            lw.y yVarB = fVar.b(k0VarH);
            yVarB.p(new v3(this, yVarB));
            this.f42876g = yVarB;
            lw.n nVar = lw.n.CONNECTING;
            y3 y3Var = new y3(lw.m0.b(yVarB, null));
            this.f42877h = nVar;
            fVar.q(nVar, y3Var);
            yVarB.n();
        } else {
            yVar.q(list);
        }
        return lw.q1.f40434e;
    }

    @Override // lw.q0
    public final void c(lw.q1 q1Var) {
        lw.y yVar = this.f42876g;
        if (yVar != null) {
            yVar.o();
            this.f42876g = null;
        }
        lw.n nVar = lw.n.TRANSIENT_FAILURE;
        y3 y3Var = new y3(lw.m0.a(q1Var));
        this.f42877h = nVar;
        this.f42875f.q(nVar, y3Var);
    }

    @Override // lw.q0
    public final void e() {
        lw.y yVar = this.f42876g;
        if (yVar != null) {
            yVar.n();
        }
    }

    @Override // lw.q0
    public final void f() {
        lw.y yVar = this.f42876g;
        if (yVar != null) {
            yVar.o();
        }
    }
}
