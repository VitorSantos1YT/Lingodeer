package b0;

import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f3700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fz.c f3701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.n f3702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v1 f3703d;

    /* JADX WARN: Multi-variable type inference failed */
    public u1(v1 v1Var, y1 y1Var, fz.c cVar, fz.c cVar2) {
        this.f3703d = v1Var;
        this.f3700a = y1Var;
        this.f3701b = cVar;
        this.f3702c = (kotlin.jvm.internal.n) cVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fz.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r1v5, types: [fz.c, kotlin.jvm.internal.n] */
    public final void b(w1 w1Var) {
        Object objInvoke = this.f3702c.invoke(w1Var.c());
        boolean zG = this.f3703d.f3714c.g();
        y1 y1Var = this.f3700a;
        if (zG) {
            y1Var.h(this.f3702c.invoke(w1Var.a()), objInvoke, (c0) this.f3701b.invoke(w1Var));
        } else {
            y1Var.j(objInvoke, (c0) this.f3701b.invoke(w1Var));
        }
    }

    @Override // l1.b3
    public final Object getValue() {
        b(this.f3703d.f3714c.f());
        return this.f3700a.L.getValue();
    }
}
