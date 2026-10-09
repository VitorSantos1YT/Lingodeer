package mw;

import com.google.common.base.MoreObjects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b1 implements w {
    @Override // mw.o5
    public final void c(lw.l lVar) {
        ((v1) this).f42745a.c(lVar);
    }

    @Override // mw.w
    public final void d(int i11) {
        ((v1) this).f42745a.d(i11);
    }

    @Override // mw.o5
    public final void e() {
        ((v1) this).f42745a.e();
    }

    @Override // mw.o5
    public final boolean f() {
        return ((v1) this).f42745a.f();
    }

    @Override // mw.o5
    public final void flush() {
        ((v1) this).f42745a.flush();
    }

    @Override // mw.w
    public final void h() {
        ((v1) this).f42745a.h();
    }

    @Override // mw.o5
    public final void j(qw.a aVar) {
        ((v1) this).f42745a.j(aVar);
    }

    @Override // mw.w
    public final void k(l2.f fVar) {
        ((v1) this).f42745a.k(fVar);
    }

    @Override // mw.w
    public final void l(int i11) {
        ((v1) this).f42745a.l(i11);
    }

    @Override // mw.w
    public final void p(lw.q1 q1Var) {
        ((v1) this).f42745a.p(q1Var);
    }

    @Override // mw.o5
    public final void q() {
        ((v1) this).f42745a.q();
    }

    @Override // mw.w
    public final void r(lw.u uVar) {
        ((v1) this).f42745a.r(uVar);
    }

    @Override // mw.w
    public final void s(lw.s sVar) {
        ((v1) this).f42745a.s(sVar);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(((v1) this).f42745a, "delegate");
        return toStringHelperB.toString();
    }
}
