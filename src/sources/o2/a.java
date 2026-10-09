package o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44472a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f44472a == ((a) obj).f44472a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44472a);
    }

    public final String toString() {
        int i11 = this.f44472a;
        if (i11 == 1) {
            return "Touch";
        }
        return i11 == 2 ? "Keyboard" : "Error";
    }
}
