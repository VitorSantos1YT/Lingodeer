package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25077a;

    public x0(int i11) {
        this.f25077a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && this.f25077a == ((x0) obj).f25077a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25077a);
    }

    public final String toString() {
        return ep.a.j(new StringBuilder("LayoutInfo(layoutId="), this.f25077a, ')');
    }
}
