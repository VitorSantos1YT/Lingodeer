package mw;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o2 extends lw.x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lw.d0 f42598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lw.d f42599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f42600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lw.e1 f42601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lw.r f42602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public lw.c f42603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public lw.f f42604j;

    public o2(lw.d0 d0Var, s2 s2Var, Executor executor, lw.e1 e1Var, lw.c cVar) {
        this.f42598d = d0Var;
        this.f42599e = s2Var;
        this.f42601g = e1Var;
        Executor executor2 = cVar.f40350b;
        executor = executor2 != null ? executor2 : executor;
        this.f42600f = executor;
        r.x2 x2VarB = lw.c.b(cVar);
        x2VarB.f48710b = executor;
        this.f42603i = new lw.c(x2VarB);
        this.f42602h = lw.r.b();
    }

    @Override // lw.k1, lw.f
    public final void a(String str, Throwable th2) {
        lw.f fVar = this.f42604j;
        if (fVar != null) {
            fVar.a(str, th2);
        }
    }

    @Override // lw.f
    public final void p(lw.y yVar, lw.c1 c1Var) {
        lw.c cVar = this.f42603i;
        lw.e1 e1Var = this.f42601g;
        Preconditions.k(e1Var, "method");
        Preconditions.k(cVar, "callOptions");
        ob.u uVarA = this.f42598d.a();
        lw.q1 q1Var = (lw.q1) uVarA.f44891b;
        if (!q1Var.f()) {
            this.f42600f.execute(new l0(this, yVar, k1.h(q1Var)));
            this.f42604j = y2.f42813i0;
            return;
        }
        e3 e3Var = (e3) uVarA.f44892c;
        c3 c3Var = (c3) e3Var.f42408b.get(e1Var.f40368b);
        if (c3Var == null) {
            c3Var = (c3) e3Var.f42409c.get(e1Var.f40369c);
        }
        if (c3Var == null) {
            c3Var = e3Var.f42407a;
        }
        if (c3Var != null) {
            this.f42603i = this.f42603i.c(c3.f42372g, c3Var);
        }
        lw.f fVarF = this.f42599e.f(e1Var, this.f42603i);
        this.f42604j = fVarF;
        fVarF.p(yVar, c1Var);
    }

    @Override // lw.k1
    public final lw.f r() {
        return this.f42604j;
    }
}
