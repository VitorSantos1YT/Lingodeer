package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25057a;

    public v(int i11) {
        this.f25057a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f25057a == ((v) obj).f25057a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25057a);
    }

    public final String toString() {
        return ep.a.j(new StringBuilder("ContainerInfo(layoutId="), this.f25057a, ')');
    }
}
