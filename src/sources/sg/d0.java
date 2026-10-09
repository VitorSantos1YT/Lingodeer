package sg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51634a;

    public d0(String literal) {
        kotlin.jvm.internal.m.f(literal, "literal");
        this.f51634a = literal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && kotlin.jvm.internal.m.a(this.f51634a, ((d0) obj).f51634a);
    }

    public final int hashCode() {
        return this.f51634a.hashCode();
    }

    public final String toString() {
        return ep.a.g("AstText(literal=", this.f51634a, ")");
    }
}
