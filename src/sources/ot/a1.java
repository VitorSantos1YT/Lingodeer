package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f45741b;

    public a1(ht.o oVar, u1 u1Var) {
        this.f45740a = oVar;
        this.f45741b = u1Var;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45740a;
    }

    public final u1 b() {
        return this.f45741b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return kotlin.jvm.internal.m.a(this.f45740a, a1Var.f45740a) && kotlin.jvm.internal.m.a(this.f45741b, a1Var.f45741b);
    }

    public final int hashCode() {
        return this.f45741b.hashCode() + (this.f45740a.hashCode() * 31);
    }

    public final String toString() {
        return "WordModel1(courseTestParams=" + this.f45740a + ", data=" + this.f45741b + ")";
    }
}
