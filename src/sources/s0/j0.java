package s0;

import aj.uZCn.evRpcb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements w2.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f51068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o3.d0 f51070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz.a f51071d;

    public j0(m1 m1Var, int i11, o3.d0 d0Var, fz.a aVar) {
        this.f51068a = m1Var;
        this.f51069b = i11;
        this.f51070c = d0Var;
        this.f51071d = aVar;
    }

    @Override // w2.c0
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        long j12;
        if (p0Var.t(v3.a.g(j11)) < v3.a.h(j11)) {
            j12 = j11;
        } else {
            j12 = j11;
            j11 = v3.a.a(0, Integer.MAX_VALUE, 0, 0, 13, j12);
        }
        w2.g1 g1VarB = p0Var.B(j11);
        int iMin = Math.min(g1VarB.f54501a, v3.a.h(j12));
        return s0Var.q0(iMin, g1VarB.f54502b, ry.s.f50855a, new au.a1(this, s0Var, g1VarB, iMin, 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.m.a(this.f51068a, j0Var.f51068a) && this.f51069b == j0Var.f51069b && kotlin.jvm.internal.m.a(this.f51070c, j0Var.f51070c) && kotlin.jvm.internal.m.a(this.f51071d, j0Var.f51071d);
    }

    public final int hashCode() {
        return this.f51071d.hashCode() + ((this.f51070c.hashCode() + defpackage.e.b(this.f51069b, this.f51068a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f51068a + ", cursorOffset=" + this.f51069b + ", transformedText=" + this.f51070c + evRpcb.doF + this.f51071d + ')';
    }
}
