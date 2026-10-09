package n3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43170a;

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f43170a == ((o) obj).f43170a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43170a);
    }

    public final String toString() {
        int i11 = this.f43170a;
        if (i11 == 0) {
            return "Normal";
        }
        return i11 == 1 ? "Italic" : "Invalid";
    }
}
