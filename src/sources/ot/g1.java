package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g1 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f45826b;

    public g1(ht.o oVar, z1 z1Var) {
        this.f45825a = oVar;
        this.f45826b = z1Var;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45825a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return kotlin.jvm.internal.m.a(this.f45825a, g1Var.f45825a) && kotlin.jvm.internal.m.a(this.f45826b, g1Var.f45826b);
    }

    public final int hashCode() {
        return this.f45826b.hashCode() + (this.f45825a.hashCode() * 31);
    }

    public final String toString() {
        return "WordModel7(courseTestParams=" + this.f45825a + ", data=" + this.f45826b + ")";
    }
}
