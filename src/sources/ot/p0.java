package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f45943b;

    public p0(ht.o oVar, h hVar) {
        this.f45942a = oVar;
        this.f45943b = hVar;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45942a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.m.a(this.f45942a, p0Var.f45942a) && kotlin.jvm.internal.m.a(this.f45943b, p0Var.f45943b);
    }

    public final int hashCode() {
        return this.f45943b.hashCode() + (this.f45942a.hashCode() * 31);
    }

    public final String toString() {
        return "SentenceModelM1(courseTestParams=" + this.f45942a + ", data=" + this.f45943b + ")";
    }
}
