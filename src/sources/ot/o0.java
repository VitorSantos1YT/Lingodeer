package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f45930b;

    public o0(ht.o oVar, f fVar) {
        this.f45929a = oVar;
        this.f45930b = fVar;
    }

    public static o0 b(o0 o0Var, ht.o oVar) {
        f fVar = o0Var.f45930b;
        o0Var.getClass();
        return new o0(oVar, fVar);
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45929a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.m.a(this.f45929a, o0Var.f45929a) && kotlin.jvm.internal.m.a(this.f45930b, o0Var.f45930b);
    }

    public final int hashCode() {
        return this.f45930b.hashCode() + (this.f45929a.hashCode() * 31);
    }

    public final String toString() {
        return "SentenceModelM13(courseTestParams=" + this.f45929a + ", data=" + this.f45930b + ")";
    }
}
