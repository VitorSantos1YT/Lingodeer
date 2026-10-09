package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f35703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f35704b;

    public h0(g0 g0Var, f0 f0Var) {
        this.f35703a = g0Var;
        this.f35704b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.m.a(this.f35704b, h0Var.f35704b) && kotlin.jvm.internal.m.a(this.f35703a, h0Var.f35703a);
    }

    public final int hashCode() {
        g0 g0Var = this.f35703a;
        int iHashCode = (g0Var != null ? g0Var.hashCode() : 0) * 31;
        f0 f0Var = this.f35704b;
        return iHashCode + (f0Var != null ? f0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f35703a + ", paragraphSyle=" + this.f35704b + ')';
    }
}
