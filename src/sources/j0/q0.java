package j0;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f35383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w2.p0 f35384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w2.g1 f35385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w2.p0 f35386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w2.g1 f35387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y.k f35388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y.k f35389g;

    public q0(m0 m0Var) {
        this.f35383a = m0Var;
    }

    public final y.k a(int i11, int i12, boolean z11) {
        int i13 = p0.f35376a[this.f35383a.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return null;
        }
        if (i13 == 3) {
            if (z11) {
                return this.f35388f;
            }
            return null;
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (z11) {
            return this.f35388f;
        }
        if (i11 + 1 < 0 || i12 < 0) {
            return null;
        }
        return this.f35389g;
    }

    public final void b(w2.p0 p0Var, w2.p0 p0Var2, long j11) {
        long jM = c.m(j11, h1.Horizontal);
        if (p0Var != null) {
            int iP = p0Var.p(v3.a.g(jM));
            this.f35388f = new y.k(y.k.a(iP, p0Var.W(iP)));
            this.f35384b = p0Var;
            this.f35385c = null;
        }
        if (p0Var2 != null) {
            int iP2 = p0Var2.p(v3.a.g(jM));
            this.f35389g = new y.k(y.k.a(iP2, p0Var2.W(iP2)));
            this.f35386d = p0Var2;
            this.f35387e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && this.f35383a == ((q0) obj).f35383a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + defpackage.e.b(0, this.f35383a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.f35383a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
