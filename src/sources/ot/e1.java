package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e1 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f45799b;

    public e1(ht.o courseTestParams, x1 x1Var) {
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        this.f45798a = courseTestParams;
        this.f45799b = x1Var;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45798a;
    }

    public final x1 b() {
        return this.f45799b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return kotlin.jvm.internal.m.a(this.f45798a, e1Var.f45798a) && kotlin.jvm.internal.m.a(this.f45799b, e1Var.f45799b);
    }

    public final int hashCode() {
        return this.f45799b.hashCode() + (this.f45798a.hashCode() * 31);
    }

    public final String toString() {
        return "WordModel5(courseTestParams=" + this.f45798a + ", data=" + this.f45799b + ")";
    }
}
