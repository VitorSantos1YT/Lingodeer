package p6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46317a;

    public i(int i11) {
        this.f46317a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f46317a == ((i) obj).f46317a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46317a);
    }

    public final String toString() {
        return ep.a.j(new StringBuilder("ResourceColorProvider(resId="), this.f46317a, ')');
    }
}
