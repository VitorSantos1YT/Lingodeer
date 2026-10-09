package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u1 extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f42711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f42712b;

    public u1(v1 v1Var, y yVar) {
        this.f42712b = v1Var;
        this.f42711a = yVar;
    }

    @Override // mw.y
    public final void f(lw.q1 q1Var, x xVar, lw.c1 c1Var) {
        dm.c cVar = this.f42712b.f42746b.f42774b;
        if (q1Var.f()) {
            ((k2) cVar.f23492d).a();
        } else {
            ((k2) cVar.f23493e).a();
        }
        this.f42711a.f(q1Var, xVar, c1Var);
    }
}
