package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f3573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3574b;

    public j1(c0 c0Var, long j11) {
        this.f3573a = c0Var;
        this.f3574b = j11;
    }

    @Override // b0.m
    public final l2 a(j2 j2Var) {
        return new k1(this.f3573a.a(j2Var), this.f3574b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return j1Var.f3574b == this.f3574b && kotlin.jvm.internal.m.a(j1Var.f3573a, this.f3573a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f3574b) + (this.f3573a.hashCode() * 31);
    }
}
