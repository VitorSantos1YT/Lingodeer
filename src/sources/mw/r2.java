package mw;

import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r2 extends lw.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2 f42659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw.f f42660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2 f42661c;

    public r2(y2 y2Var, q2 q2Var, f1 f1Var) {
        this.f42661c = y2Var;
        this.f42659a = q2Var;
        Preconditions.k(f1Var, "resolver");
        this.f42660b = f1Var;
    }

    @Override // lw.y
    public final void i(lw.q1 q1Var) {
        Preconditions.e("the error status must not be OK", !q1Var.f());
        this.f42661c.m.execute(new i0(17, this, q1Var));
    }

    @Override // lw.y
    public final void m(lw.h1 h1Var) {
        this.f42661c.m.execute(new i0(18, this, h1Var));
    }
}
