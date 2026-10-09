package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3.c f35406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35407b;

    public s(w2.q1 q1Var, long j11) {
        this.f35406a = q1Var;
        this.f35407b = j11;
    }

    @Override // j0.q
    public final z1.r a(z1.r rVar, z1.j jVar) {
        return rVar.i(new l(jVar, false));
    }

    public final float b() {
        long j11 = this.f35407b;
        if (!v3.a.c(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f35406a.Q(v3.a.g(j11));
    }

    public final float c() {
        long j11 = this.f35407b;
        if (!v3.a.d(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f35406a.Q(v3.a.h(j11));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.m.a(this.f35406a, sVar.f35406a) && v3.a.b(this.f35407b, sVar.f35407b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f35407b) + (this.f35406a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f35406a + ", constraints=" + ((Object) v3.a.k(this.f35407b)) + ')';
    }
}
