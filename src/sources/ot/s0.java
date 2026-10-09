package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f45985b;

    public s0(ht.o oVar, n nVar) {
        this.f45984a = oVar;
        this.f45985b = nVar;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45984a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return kotlin.jvm.internal.m.a(this.f45984a, s0Var.f45984a) && kotlin.jvm.internal.m.a(this.f45985b, s0Var.f45985b);
    }

    public final int hashCode() {
        return this.f45985b.hashCode() + (this.f45984a.hashCode() * 31);
    }

    public final String toString() {
        return "SentenceModelM4(courseTestParams=" + this.f45984a + ", data=" + this.f45985b + ")";
    }
}
