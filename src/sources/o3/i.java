package o3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44677a;

    public static String a(int i11) {
        if (i11 == -1) {
            return "Unspecified";
        }
        if (i11 == 0) {
            return "None";
        }
        if (i11 == 1) {
            return "Default";
        }
        if (i11 == 2) {
            return "Go";
        }
        if (i11 == 3) {
            return "Search";
        }
        if (i11 == 4) {
            return "Send";
        }
        if (i11 == 5) {
            return "Previous";
        }
        if (i11 == 6) {
            return "Next";
        }
        return i11 == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f44677a == ((i) obj).f44677a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44677a);
    }

    public final String toString() {
        return a(this.f44677a);
    }
}
