package qy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f48515a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.m.h(this.f48515a & 65535, ((z) obj).f48515a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f48515a == ((z) obj).f48515a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f48515a);
    }

    public final String toString() {
        return String.valueOf(this.f48515a & 65535);
    }
}
