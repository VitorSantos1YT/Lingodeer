package a0;

import b0.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements b0.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.c2 f234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z1.e f235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.k1 f236c = l1.t.B(new v3.l(0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.i0 f237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0.u1 f238e;

    public y(b0.c2 c2Var, z1.e eVar, v3.m mVar) {
        this.f234a = c2Var;
        this.f235b = eVar;
        long[] jArr = y.r0.f56756a;
        this.f237d = new y.i0();
    }

    public static final long d(y yVar) {
        b0.u1 u1Var = yVar.f238e;
        return u1Var != null ? ((v3.l) u1Var.getValue()).f53498a : ((v3.l) yVar.f236c.getValue()).f53498a;
    }

    public static l1 e(y yVar, i2 i2Var) {
        yVar.getClass();
        return f1.o(i2Var, new x(yVar, 0));
    }

    public static m1 f(y yVar, i2 i2Var) {
        yVar.getClass();
        return f1.s(i2Var, new e1(new x(yVar, 1), 2));
    }

    @Override // b0.w1
    public final Object a() {
        return this.f234a.f().a();
    }

    @Override // b0.w1
    public final Object c() {
        return this.f234a.f().c();
    }
}
