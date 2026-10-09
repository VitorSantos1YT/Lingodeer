package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f46061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f46062b;

    public z0(ht.o oVar, u1 u1Var) {
        this.f46061a = oVar;
        this.f46062b = u1Var;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f46061a;
    }

    public final u1 b() {
        return this.f46062b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return kotlin.jvm.internal.m.a(this.f46061a, z0Var.f46061a) && kotlin.jvm.internal.m.a(this.f46062b, z0Var.f46062b);
    }

    public final int hashCode() {
        return this.f46062b.hashCode() + (this.f46061a.hashCode() * 31);
    }

    public final String toString() {
        return "WordModel11(courseTestParams=" + this.f46061a + ", data=" + this.f46062b + ")";
    }
}
