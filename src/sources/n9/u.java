package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f43701b = new u(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f43702c = new u(false);

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f43710a == ((u) obj).f43710a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43710a);
    }

    public final String toString() {
        return ep.a.l(new StringBuilder("NotLoading(endOfPaginationReached="), this.f43710a, ')');
    }
}
