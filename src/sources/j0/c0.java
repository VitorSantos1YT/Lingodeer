package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2 f35263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2 f35264b;

    public c0(n2 n2Var, n2 n2Var2) {
        this.f35263a = n2Var;
        this.f35264b = n2Var2;
    }

    @Override // j0.n2
    public final int a(v3.c cVar) {
        int iA = this.f35263a.a(cVar) - this.f35264b.a(cVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // j0.n2
    public final int b(v3.c cVar, v3.m mVar) {
        int iB = this.f35263a.b(cVar, mVar) - this.f35264b.b(cVar, mVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // j0.n2
    public final int c(v3.c cVar, v3.m mVar) {
        int iC = this.f35263a.c(cVar, mVar) - this.f35264b.c(cVar, mVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // j0.n2
    public final int d(v3.c cVar) {
        int iD = this.f35263a.d(cVar) - this.f35264b.d(cVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.m.a(c0Var.f35263a, this.f35263a) && kotlin.jvm.internal.m.a(c0Var.f35264b, this.f35264b);
    }

    public final int hashCode() {
        return this.f35264b.hashCode() + (this.f35263a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f35263a + " - " + this.f35264b + ')';
    }
}
