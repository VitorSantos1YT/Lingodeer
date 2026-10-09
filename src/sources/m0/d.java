package m0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40543a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f40543a == ((d) obj).f40543a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40543a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f40543a + ')';
    }
}
