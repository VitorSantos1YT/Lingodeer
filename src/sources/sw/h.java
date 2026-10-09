package sw;

import com.google.common.base.Preconditions;
import lw.o0;
import lw.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f51849o = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f51850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f51851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public lw.y f51852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q0 f51853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public lw.y f51854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q0 f51855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public lw.n f51856l;
    public o0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f51857n;

    public h(c cVar) {
        e eVar = new e(this);
        this.f51850f = eVar;
        this.f51853i = eVar;
        this.f51855k = eVar;
        this.f51851g = cVar;
    }

    @Override // lw.q0
    public final void f() {
        this.f51855k.f();
        this.f51853i.f();
    }

    @Override // sw.b
    public final q0 g() {
        q0 q0Var = this.f51855k;
        return q0Var == this.f51850f ? this.f51853i : q0Var;
    }

    public final void h() {
        this.f51851g.q(this.f51856l, this.m);
        this.f51853i.f();
        this.f51853i = this.f51855k;
        this.f51852h = this.f51854j;
        this.f51855k = this.f51850f;
        this.f51854j = null;
    }

    public final void i(lw.y yVar) {
        Preconditions.k(yVar, "newBalancerFactory");
        if (yVar.equals(this.f51854j)) {
            return;
        }
        this.f51855k.f();
        this.f51855k = this.f51850f;
        this.f51854j = null;
        this.f51856l = lw.n.CONNECTING;
        this.m = f51849o;
        if (yVar.equals(this.f51852h)) {
            return;
        }
        f fVar = new f(this);
        q0 q0VarG = yVar.g(fVar);
        fVar.f51847e = q0VarG;
        this.f51855k = q0VarG;
        this.f51854j = yVar;
        if (this.f51857n) {
            return;
        }
        h();
    }
}
