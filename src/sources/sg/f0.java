package sg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f51642a;

    public f0(char c11) {
        this.f51642a = c11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.f51642a == ((f0) obj).f51642a;
    }

    public final int hashCode() {
        return Character.hashCode(this.f51642a);
    }

    public final String toString() {
        return "AstUnorderedList(bulletMarker=" + this.f51642a + ")";
    }
}
