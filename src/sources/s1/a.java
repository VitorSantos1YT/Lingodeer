package s1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51279a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f51279a == ((a) obj).f51279a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51279a);
    }

    public final String toString() {
        return ep.a.j(new StringBuilder("DeltaCounter(count="), this.f51279a, ')');
    }
}
