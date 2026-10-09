package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f45837b;

    public h1(ht.o oVar, u1 u1Var) {
        this.f45836a = oVar;
        this.f45837b = u1Var;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45836a;
    }

    public final u1 b() {
        return this.f45837b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return kotlin.jvm.internal.m.a(this.f45836a, h1Var.f45836a) && kotlin.jvm.internal.m.a(this.f45837b, h1Var.f45837b);
    }

    public final int hashCode() {
        return this.f45837b.hashCode() + (this.f45836a.hashCode() * 31);
    }

    public final String toString() {
        return "WordModel8(courseTestParams=" + this.f45836a + ", data=" + this.f45837b + ")";
    }
}
