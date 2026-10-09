package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f45813b;

    public f1(ht.o courseTestParams, z1 z1Var) {
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        this.f45812a = courseTestParams;
        this.f45813b = z1Var;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45812a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return kotlin.jvm.internal.m.a(this.f45812a, f1Var.f45812a) && kotlin.jvm.internal.m.a(this.f45813b, f1Var.f45813b);
    }

    public final int hashCode() {
        return this.f45813b.hashCode() + (this.f45812a.hashCode() * 31);
    }

    public final String toString() {
        return "WordModel6(courseTestParams=" + this.f45812a + ", data=" + this.f45813b + ")";
    }
}
