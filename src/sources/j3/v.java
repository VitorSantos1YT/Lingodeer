package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f35804b;

    public v(String str, v0 v0Var) {
        this.f35803a = str;
        this.f35804b = v0Var;
    }

    @Override // j3.w
    public final uu.e a() {
        return null;
    }

    @Override // j3.w
    public final v0 b() {
        return this.f35804b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.m.a(this.f35803a, vVar.f35803a) && kotlin.jvm.internal.m.a(this.f35804b, vVar.f35804b);
    }

    public final int hashCode() {
        int iHashCode = this.f35803a.hashCode() * 31;
        v0 v0Var = this.f35804b;
        return (iHashCode + (v0Var != null ? v0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return hh.p0.o(new StringBuilder("LinkAnnotation.Url(url="), this.f35803a, ')');
    }
}
