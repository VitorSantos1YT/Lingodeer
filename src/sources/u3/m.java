package u3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52755a;

    public static String a(int i11) {
        if (i11 == 1) {
            return "Ltr";
        }
        if (i11 == 2) {
            return "Rtl";
        }
        if (i11 == 3) {
            return "Content";
        }
        if (i11 == 4) {
            return "ContentOrLtr";
        }
        if (i11 == 5) {
            return "ContentOrRtl";
        }
        return i11 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f52755a == ((m) obj).f52755a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52755a);
    }

    public final String toString() {
        return a(this.f52755a);
    }
}
