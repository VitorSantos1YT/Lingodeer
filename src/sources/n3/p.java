package n3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43171a;

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f43171a == ((p) obj).f43171a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43171a);
    }

    public final String toString() {
        int i11 = this.f43171a;
        if (i11 == 0) {
            return "None";
        }
        if (i11 == 1) {
            return "Weight";
        }
        if (i11 == 2) {
            return "Style";
        }
        return i11 == 65535 ? "All" : "Invalid";
    }
}
