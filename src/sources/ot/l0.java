package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f45883b;

    public l0(ht.o oVar, z1 z1Var) {
        this.f45882a = oVar;
        this.f45883b = z1Var;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45882a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return kotlin.jvm.internal.m.a(this.f45882a, l0Var.f45882a) && kotlin.jvm.internal.m.a(this.f45883b, l0Var.f45883b);
    }

    public final int hashCode() {
        return this.f45883b.hashCode() + (this.f45882a.hashCode() * 31);
    }

    public final String toString() {
        return "PhrasePair(courseTestParams=" + this.f45882a + ", data=" + this.f45883b + ")";
    }
}
