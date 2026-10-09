package sg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51630a;

    public b(String literal) {
        kotlin.jvm.internal.m.f(literal, "literal");
        this.f51630a = literal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && kotlin.jvm.internal.m.a(this.f51630a, ((b) obj).f51630a);
    }

    public final int hashCode() {
        return this.f51630a.hashCode();
    }

    public final String toString() {
        return ep.a.g("AstCode(literal=", this.f51630a, ")");
    }
}
