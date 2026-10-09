package kb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38029a;

    public b(int i11) {
        this.f38029a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f38029a == ((b) obj).f38029a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38029a);
    }

    public final String toString() {
        return ep.a.j(new StringBuilder("ConstraintsNotMet(reason="), this.f38029a, ')');
    }
}
