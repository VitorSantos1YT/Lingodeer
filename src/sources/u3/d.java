package u3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52737a;

    public static String a(int i11) {
        if (i11 == 1) {
            return "Hyphens.None";
        }
        if (i11 == 2) {
            return "Hyphens.Auto";
        }
        return i11 == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f52737a == ((d) obj).f52737a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52737a);
    }

    public final String toString() {
        return a(this.f52737a);
    }
}
