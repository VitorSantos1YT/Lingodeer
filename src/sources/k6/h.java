package k6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37927a;

    public /* synthetic */ h(int i11) {
        this.f37927a = i11;
    }

    public static String a(int i11) {
        return nv.p.o("ContentScale(value=", i11, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f37927a == ((h) obj).f37927a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37927a);
    }

    public final String toString() {
        return a(this.f37927a);
    }
}
