package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i1 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f45853b;

    public i1(ht.o oVar, t1 t1Var) {
        this.f45852a = oVar;
        this.f45853b = t1Var;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45852a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return kotlin.jvm.internal.m.a(this.f45852a, i1Var.f45852a) && kotlin.jvm.internal.m.a(this.f45853b, i1Var.f45853b);
    }

    public final int hashCode() {
        return this.f45853b.hashCode() + (this.f45852a.hashCode() * 31);
    }

    public final String toString() {
        return "WordModelJudge(courseTestParams=" + this.f45852a + ", data=" + this.f45853b + ")";
    }
}
