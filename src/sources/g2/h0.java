package g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28569a;

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            return this.f28569a == ((h0) obj).f28569a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28569a);
    }

    public final String toString() {
        int i11 = this.f28569a;
        if (i11 == 0) {
            return "Argb8888";
        }
        if (i11 == 1) {
            return "Alpha8";
        }
        if (i11 == 2) {
            return "Rgb565";
        }
        if (i11 == 3) {
            return "F16";
        }
        return i11 == 4 ? "Gpu" : "Unknown";
    }
}
