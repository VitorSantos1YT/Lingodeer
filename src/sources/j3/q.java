package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35769a;

    public static String a(int i11) {
        if (i11 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i11 == 1) {
            return "EmojiSupportMatch.None";
        }
        return i11 == 2 ? "EmojiSupportMatch.All" : nv.p.o("Invalid(value=", i11, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f35769a == ((q) obj).f35769a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35769a);
    }

    public final String toString() {
        return a(this.f35769a);
    }
}
