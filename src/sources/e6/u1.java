package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f25055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f25056b;

    public u1(b1 b1Var, b1 b1Var2) {
        this.f25055a = b1Var;
        this.f25056b = b1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return this.f25055a == u1Var.f25055a && this.f25056b == u1Var.f25056b;
    }

    public final int hashCode() {
        return this.f25056b.hashCode() + (this.f25055a.hashCode() * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + this.f25055a + ", height=" + this.f25056b + ')';
    }
}
