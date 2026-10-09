package mw;

import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends n3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lw.q1 f42849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f42850f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lw.j[] f42851t;

    public z0(lw.q1 q1Var, x xVar, lw.j[] jVarArr) {
        super(0);
        Preconditions.e("error must not be OK", !q1Var.f());
        this.f42849e = q1Var;
        this.f42850f = xVar;
        this.f42851t = jVarArr;
    }

    @Override // mw.n3, mw.w
    public final void k(l2.f fVar) {
        fVar.a(this.f42849e, "error");
        fVar.a(this.f42850f, "progress");
    }

    @Override // mw.n3, mw.w
    public final void n(y yVar) {
        Preconditions.p("already started", !this.f42848d);
        this.f42848d = true;
        lw.j[] jVarArr = this.f42851t;
        int length = jVarArr.length;
        int i11 = 0;
        while (true) {
            lw.q1 q1Var = this.f42849e;
            if (i11 >= length) {
                yVar.f(q1Var, this.f42850f, new lw.c1());
                return;
            } else {
                jVarArr[i11].m(q1Var);
                i11++;
            }
        }
    }
}
