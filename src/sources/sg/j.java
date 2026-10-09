package sg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51646a;

    public j(String str) {
        this.f51646a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && kotlin.jvm.internal.m.a(this.f51646a, ((j) obj).f51646a);
    }

    public final int hashCode() {
        return this.f51646a.hashCode();
    }

    public final String toString() {
        return ep.a.g("AstHtmlInline(literal=", this.f51646a, ")");
    }
}
