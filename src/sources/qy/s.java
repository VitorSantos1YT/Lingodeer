package qy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f48508a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.m.h(this.f48508a & 255, ((s) obj).f48508a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f48508a == ((s) obj).f48508a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f48508a);
    }

    public final String toString() {
        return String.valueOf(this.f48508a & 255);
    }
}
