package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f46010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f46011b;

    public u0(ht.o courseTestParams, q qVar) {
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        this.f46010a = courseTestParams;
        this.f46011b = qVar;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f46010a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return kotlin.jvm.internal.m.a(this.f46010a, u0Var.f46010a) && kotlin.jvm.internal.m.a(this.f46011b, u0Var.f46011b);
    }

    public final int hashCode() {
        return this.f46011b.hashCode() + (this.f46010a.hashCode() * 31);
    }

    public final String toString() {
        return "SentenceModelM7(courseTestParams=" + this.f46010a + ", data=" + this.f46011b + ")";
    }
}
