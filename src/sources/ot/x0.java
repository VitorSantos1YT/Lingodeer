package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f46040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f46041b;

    public x0(ht.o oVar, w wVar) {
        this.f46040a = oVar;
        this.f46041b = wVar;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f46040a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return kotlin.jvm.internal.m.a(this.f46040a, x0Var.f46040a) && kotlin.jvm.internal.m.a(this.f46041b, x0Var.f46041b);
    }

    public final int hashCode() {
        return this.f46041b.hashCode() + (this.f46040a.hashCode() * 31);
    }

    public final String toString() {
        return "SentenceModelMQA(courseTestParams=" + this.f46040a + ", data=" + this.f46041b + ")";
    }
}
