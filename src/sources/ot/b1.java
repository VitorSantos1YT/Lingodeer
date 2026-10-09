package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b1 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f45753b;

    public b1(ht.o courseTestParams, u1 u1Var) {
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        this.f45752a = courseTestParams;
        this.f45753b = u1Var;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45752a;
    }

    public final u1 b() {
        return this.f45753b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return kotlin.jvm.internal.m.a(this.f45752a, b1Var.f45752a) && kotlin.jvm.internal.m.a(this.f45753b, b1Var.f45753b);
    }

    public final int hashCode() {
        return this.f45753b.hashCode() + (this.f45752a.hashCode() * 31);
    }

    public final String toString() {
        return "WordModel2(courseTestParams=" + this.f45752a + ", data=" + this.f45753b + ")";
    }
}
