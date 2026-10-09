package a0;

import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class w0 extends y2.d1 {
    public final x0 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.c2 f209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.v1 f210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0.v1 f211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0.v1 f212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1 f213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m1 f214f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fz.a f215t;

    public w0(b0.c2 c2Var, b0.v1 v1Var, b0.v1 v1Var2, b0.v1 v1Var3, l1 l1Var, m1 m1Var, fz.a aVar, x0 x0Var) {
        this.f209a = c2Var;
        this.f210b = v1Var;
        this.f211c = v1Var2;
        this.f212d = v1Var3;
        this.f213e = l1Var;
        this.f214f = m1Var;
        this.f215t = aVar;
        this.H = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return kotlin.jvm.internal.m.a(this.f209a, w0Var.f209a) && kotlin.jvm.internal.m.a(this.f210b, w0Var.f210b) && kotlin.jvm.internal.m.a(this.f211c, w0Var.f211c) && kotlin.jvm.internal.m.a(this.f212d, w0Var.f212d) && kotlin.jvm.internal.m.a(this.f213e, w0Var.f213e) && kotlin.jvm.internal.m.a(this.f214f, w0Var.f214f) && kotlin.jvm.internal.m.a(this.f215t, w0Var.f215t) && kotlin.jvm.internal.m.a(this.H, w0Var.H);
    }

    @Override // y2.d1
    public final z1.q f() {
        return new k1(this.f209a, this.f210b, this.f211c, this.f212d, this.f213e, this.f214f, this.f215t, this.H);
    }

    public final int hashCode() {
        int iHashCode = this.f209a.hashCode() * 31;
        b0.v1 v1Var = this.f210b;
        int iHashCode2 = (iHashCode + (v1Var == null ? 0 : v1Var.hashCode())) * 31;
        b0.v1 v1Var2 = this.f211c;
        int iHashCode3 = (iHashCode2 + (v1Var2 == null ? 0 : v1Var2.hashCode())) * 31;
        b0.v1 v1Var3 = this.f212d;
        return this.H.hashCode() + ((this.f215t.hashCode() + ((this.f214f.f143a.hashCode() + ((this.f213e.f132a.hashCode() + ((iHashCode3 + (v1Var3 != null ? v1Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        k1 k1Var = (k1) qVar;
        k1Var.R = this.f209a;
        k1Var.S = this.f210b;
        k1Var.T = this.f211c;
        k1Var.U = this.f212d;
        k1Var.V = this.f213e;
        k1Var.W = this.f214f;
        k1Var.X = this.f215t;
        k1Var.Y = this.H;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f209a + ", sizeAnimation=" + this.f210b + anrPHlQ.cxqjTcjbzJQoc + this.f211c + ", slideAnimation=" + this.f212d + ", enter=" + this.f213e + ", exit=" + this.f214f + ", isEnabled=" + this.f215t + ", graphicsLayerBlock=" + this.H + ')';
    }
}
