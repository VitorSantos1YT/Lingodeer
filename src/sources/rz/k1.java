package rz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k1 extends i1 {
    public final Object H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1 f50919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l1 f50920f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f50921t;

    public k1(q1 q1Var, l1 l1Var, q qVar, Object obj) {
        this.f50919e = q1Var;
        this.f50920f = l1Var;
        this.f50921t = qVar;
        this.H = obj;
    }

    @Override // rz.i1
    public final boolean i() {
        return false;
    }

    @Override // rz.i1
    public final void j(Throwable th2) {
        q qVar = this.f50921t;
        q qVarM = q1.M(qVar);
        q1 q1Var = this.f50919e;
        l1 l1Var = this.f50920f;
        Object obj = this.H;
        if (qVarM == null || !q1Var.W(l1Var, qVarM, obj)) {
            l1Var.f50927a.c(new wz.h(2), 2);
            q qVarM2 = q1.M(qVar);
            if (qVarM2 == null || !q1Var.W(l1Var, qVarM2, obj)) {
                q1Var.m(q1Var.x(l1Var, obj));
            }
        }
    }
}
