package k6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37912a;

    public /* synthetic */ b(int i11) {
        this.f37912a = i11;
    }

    public static final /* synthetic */ b a(int i11) {
        return new b(i11);
    }

    public static String b(int i11) {
        return nv.p.o("Vertical(value=", i11, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f37912a == ((b) obj).f37912a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37912a);
    }

    public final String toString() {
        return b(this.f37912a);
    }
}
