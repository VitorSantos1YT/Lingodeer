package s2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51303a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f51303a == ((h) obj).f51303a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f51303a);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f51303a + ')';
    }
}
