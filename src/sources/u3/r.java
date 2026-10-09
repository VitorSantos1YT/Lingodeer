package u3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52763a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f52763a == ((r) obj).f52763a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52763a);
    }

    public final String toString() {
        int i11 = this.f52763a;
        if (i11 == 1) {
            return "Linearity.Linear";
        }
        if (i11 == 2) {
            return "Linearity.FontHinting";
        }
        return i11 == 3 ? "Linearity.None" : "Invalid";
    }
}
