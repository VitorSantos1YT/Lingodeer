package u3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52750a;

    public static String a(int i11) {
        if (i11 == 1) {
            return "Left";
        }
        if (i11 == 2) {
            return "Right";
        }
        if (i11 == 3) {
            return "Center";
        }
        if (i11 == 4) {
            return "Justify";
        }
        if (i11 == 5) {
            return "Start";
        }
        if (i11 == 6) {
            return "End";
        }
        return i11 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f52750a == ((k) obj).f52750a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52750a);
    }

    public final String toString() {
        return a(this.f52750a);
    }
}
