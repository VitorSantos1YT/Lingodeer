package sg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51649a;

    public l(String str) {
        this.f51649a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && kotlin.jvm.internal.m.a(this.f51649a, ((l) obj).f51649a);
    }

    public final int hashCode() {
        return this.f51649a.hashCode();
    }

    public final String toString() {
        return ep.a.g("AstIndentedCodeBlock(literal=", this.f51649a, ")");
    }
}
