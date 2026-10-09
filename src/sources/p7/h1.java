package p7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 extends k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f46393k;

    public h1(a aVar) {
        this.f46393k = aVar;
    }

    public void A() {
        z();
    }

    @Override // p7.a
    public final y6.o0 f() {
        return this.f46393k.f();
    }

    @Override // p7.a
    public final y6.x g() {
        return this.f46393k.g();
    }

    @Override // p7.a
    public final boolean h() {
        return this.f46393k.h();
    }

    @Override // p7.a
    public final void k(d7.q qVar) {
        this.f46412j = qVar;
        this.f46411i = b7.f0.m(null);
        A();
    }

    @Override // p7.a
    public void r(y6.x xVar) {
        this.f46393k.r(xVar);
    }

    @Override // p7.k
    public final b0 s(Object obj, b0 b0Var) {
        return x(b0Var);
    }

    @Override // p7.k
    public final long t(long j11, Object obj) {
        return j11;
    }

    @Override // p7.k
    public final int u(int i11, Object obj) {
        return i11;
    }

    @Override // p7.k
    public final void v(Object obj, a aVar, y6.o0 o0Var) {
        y(o0Var);
    }

    public abstract void y(y6.o0 o0Var);

    public final void z() {
        w(null, this.f46393k);
    }

    public b0 x(b0 b0Var) {
        return b0Var;
    }
}
