package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f45785b;

    public d1(ht.o oVar, u1 u1Var) {
        this.f45784a = oVar;
        this.f45785b = u1Var;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45784a;
    }

    public final u1 b() {
        return this.f45785b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return kotlin.jvm.internal.m.a(this.f45784a, d1Var.f45784a) && kotlin.jvm.internal.m.a(this.f45785b, d1Var.f45785b);
    }

    public final int hashCode() {
        return this.f45785b.hashCode() + (this.f45784a.hashCode() * 31);
    }

    public final String toString() {
        return "WordModel4(courseTestParams=" + this.f45784a + ", data=" + this.f45785b + ")";
    }
}
