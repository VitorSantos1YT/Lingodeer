package s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements w2.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f51238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o3.d0 f51240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz.a f51241d;

    public v1(m1 m1Var, int i11, o3.d0 d0Var, fz.a aVar) {
        this.f51238a = m1Var;
        this.f51239b = i11;
        this.f51240c = d0Var;
        this.f51241d = aVar;
    }

    @Override // w2.c0
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        w2.g1 g1VarB = p0Var.B(v3.a.a(0, 0, 0, Integer.MAX_VALUE, 7, j11));
        int iMin = Math.min(g1VarB.f54502b, v3.a.g(j11));
        return s0Var.q0(g1VarB.f54501a, iMin, ry.s.f50855a, new au.k(this, g1VarB, iMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return kotlin.jvm.internal.m.a(this.f51238a, v1Var.f51238a) && this.f51239b == v1Var.f51239b && kotlin.jvm.internal.m.a(this.f51240c, v1Var.f51240c) && kotlin.jvm.internal.m.a(this.f51241d, v1Var.f51241d);
    }

    public final int hashCode() {
        return this.f51241d.hashCode() + ((this.f51240c.hashCode() + defpackage.e.b(this.f51239b, this.f51238a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f51238a + ", cursorOffset=" + this.f51239b + ", transformedText=" + this.f51240c + ", textLayoutResultProvider=" + this.f51241d + ')';
    }
}
