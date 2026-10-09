package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f43692b = new t(false);

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f43710a == ((t) obj).f43710a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43710a);
    }

    public final String toString() {
        return ep.a.l(new StringBuilder("Loading(endOfPaginationReached="), this.f43710a, ')');
    }
}
