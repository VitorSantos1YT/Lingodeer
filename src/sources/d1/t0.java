package d1;

import s0.o1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements s0.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f22995a;

    public t0(z0 z0Var) {
        this.f22995a = z0Var;
    }

    @Override // s0.a1
    public final void a() {
        z0 z0Var = this.f22995a;
        z0Var.f23053r.setValue(null);
        z0Var.f23054s.setValue(null);
    }

    @Override // s0.a1
    public final void b(long j11) {
        o1 o1VarD;
        z0 z0Var = this.f22995a;
        long jA = g0.a(z0Var.k(true));
        s0.s0 s0Var = z0Var.f23040d;
        if (s0Var == null || (o1VarD = s0Var.d()) == null) {
            return;
        }
        long jE = o1VarD.e(jA);
        z0Var.f23050o = jE;
        z0Var.f23054s.setValue(new f2.b(jE));
        z0Var.f23052q = 0L;
        z0Var.f23053r.setValue(s0.g0.Cursor);
        z0Var.s(false);
    }

    @Override // s0.a1
    public final void c() {
        z0 z0Var = this.f22995a;
        z0Var.f23053r.setValue(null);
        z0Var.f23054s.setValue(null);
    }

    @Override // s0.a1
    public final void e(long j11) {
        o1 o1VarD;
        n2.a aVar;
        z0 z0Var = this.f22995a;
        z0Var.f23052q = f2.b.h(z0Var.f23052q, j11);
        s0.s0 s0Var = z0Var.f23040d;
        if (s0Var == null || (o1VarD = s0Var.d()) == null) {
            return;
        }
        z0Var.f23054s.setValue(new f2.b(f2.b.h(z0Var.f23050o, z0Var.f23052q)));
        o3.p pVar = z0Var.f23038b;
        f2.b bVarI = z0Var.i();
        kotlin.jvm.internal.m.c(bVarI);
        int iF = pVar.f(o1VarD.b(bVarI.f26570a, true));
        long jB = j3.t.b(iF, iF);
        if (j3.x0.b(jB, z0Var.m().f44705b)) {
            return;
        }
        s0.s0 s0Var2 = z0Var.f23040d;
        if ((s0Var2 == null || ((Boolean) s0Var2.f51181q.getValue()).booleanValue()) && (aVar = z0Var.f23047k) != null) {
            aVar.a(9);
        }
        z0Var.f23039c.invoke(z0.e(z0Var.m().f44704a, jB));
        z0Var.f23058w = new j3.x0(jB);
    }

    @Override // s0.a1
    public final void d() {
    }

    @Override // s0.a1
    public final void onCancel() {
    }
}
