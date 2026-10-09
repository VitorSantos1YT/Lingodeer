package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s5 implements w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns.r0 f50375b;

    public s5(String str, ns.r0 r0Var) {
        this.f50374a = str;
        this.f50375b = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj;
        return kotlin.jvm.internal.m.a(this.f50374a, s5Var.f50374a) && kotlin.jvm.internal.m.a(this.f50375b, s5Var.f50375b);
    }

    public final int hashCode() {
        int iHashCode = this.f50374a.hashCode() * 31;
        ns.r0 r0Var = this.f50375b;
        return iHashCode + (r0Var == null ? 0 : r0Var.hashCode());
    }

    public final String toString() {
        return "Error(message=" + this.f50374a + ", partialResponse=" + this.f50375b + ")";
    }
}
