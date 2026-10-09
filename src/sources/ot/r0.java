package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f45966b;

    public r0(ht.o oVar, l lVar) {
        this.f45965a = oVar;
        this.f45966b = lVar;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45965a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return kotlin.jvm.internal.m.a(this.f45965a, r0Var.f45965a) && kotlin.jvm.internal.m.a(this.f45966b, r0Var.f45966b);
    }

    public final int hashCode() {
        return this.f45966b.hashCode() + (this.f45965a.hashCode() * 31);
    }

    public final String toString() {
        return "SentenceModelM3(courseTestParams=" + this.f45965a + ", data=" + this.f45966b + ")";
    }
}
