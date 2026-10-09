package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f3541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f3542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3543c;

    public g0(y yVar, u0 u0Var, long j11) {
        this.f3541a = yVar;
        this.f3542b = u0Var;
        this.f3543c = j11;
    }

    @Override // b0.m
    public final l2 a(j2 j2Var) {
        n2 n2VarA = this.f3541a.a(j2Var);
        p2 p2Var = new p2();
        p2Var.f3638c = n2VarA;
        p2Var.f3639d = this.f3542b;
        p2Var.f3636a = ((long) (n2VarA.r() + n2VarA.n())) * 1000000;
        p2Var.f3637b = this.f3543c * 1000000;
        return p2Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (kotlin.jvm.internal.m.a(g0Var.f3541a, this.f3541a) && g0Var.f3542b == this.f3542b && g0Var.f3543c == this.f3543c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3543c) + ((this.f3542b.hashCode() + (this.f3541a.hashCode() * 31)) * 31);
    }
}
