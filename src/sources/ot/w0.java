package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f46032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f46033b;

    public w0(ht.o oVar, u uVar) {
        this.f46032a = oVar;
        this.f46033b = uVar;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f46032a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return kotlin.jvm.internal.m.a(this.f46032a, w0Var.f46032a) && kotlin.jvm.internal.m.a(this.f46033b, w0Var.f46033b);
    }

    public final int hashCode() {
        return this.f46033b.hashCode() + (this.f46032a.hashCode() * 31);
    }

    public final String toString() {
        return "SentenceModelM9(courseTestParams=" + this.f46032a + ", data=" + this.f46033b + ")";
    }
}
