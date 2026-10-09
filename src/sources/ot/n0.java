package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f45911b;

    public n0(ht.o oVar, c cVar) {
        this.f45910a = oVar;
        this.f45911b = cVar;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45910a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return kotlin.jvm.internal.m.a(this.f45910a, n0Var.f45910a) && kotlin.jvm.internal.m.a(this.f45911b, n0Var.f45911b);
    }

    public final int hashCode() {
        return this.f45911b.hashCode() + (this.f45910a.hashCode() * 31);
    }

    public final String toString() {
        return "SentenceModelM10(courseTestParams=" + this.f45910a + ", data=" + this.f45911b + ")";
    }
}
