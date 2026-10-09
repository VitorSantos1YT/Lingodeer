package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f45951b;

    public q0(ht.o oVar, j jVar) {
        this.f45950a = oVar;
        this.f45951b = jVar;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45950a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.m.a(this.f45950a, q0Var.f45950a) && kotlin.jvm.internal.m.a(this.f45951b, q0Var.f45951b);
    }

    public final int hashCode() {
        return this.f45951b.hashCode() + (this.f45950a.hashCode() * 31);
    }

    public final String toString() {
        return "SentenceModelM2(courseTestParams=" + this.f45950a + ", data=" + this.f45951b + ")";
    }
}
