package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31299a;

    public final boolean equals(Object obj) {
        if (obj instanceof x3) {
            return this.f31299a == ((x3) obj).f31299a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31299a);
    }

    public final String toString() {
        int i11 = this.f31299a;
        if (i11 == 0) {
            return "Picker";
        }
        return i11 == 1 ? "Input" : "Unknown";
    }
}
