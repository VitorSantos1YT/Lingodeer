package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f46020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f46021b;

    public v0(ht.o oVar, s sVar) {
        this.f46020a = oVar;
        this.f46021b = sVar;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f46020a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return kotlin.jvm.internal.m.a(this.f46020a, v0Var.f46020a) && kotlin.jvm.internal.m.a(this.f46021b, v0Var.f46021b);
    }

    public final int hashCode() {
        return this.f46021b.hashCode() + (this.f46020a.hashCode() * 31);
    }

    public final String toString() {
        return "SentenceModelM8(courseTestParams=" + this.f46020a + ", data=" + this.f46021b + ")";
    }
}
