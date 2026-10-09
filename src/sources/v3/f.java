package v3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f53489a;

    public static int a(float f5, float f11) {
        if (Float.isNaN(f5) || Float.isNaN(f11)) {
            return 0;
        }
        return Float.compare(f5, f11);
    }

    public static final boolean b(float f5, float f11) {
        return Float.compare(f5, f11) == 0;
    }

    public static String c(float f5) {
        if (Float.isNaN(f5)) {
            return "Dp.Unspecified";
        }
        return f5 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.f53489a, ((f) obj).f53489a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f53489a, ((f) obj).f53489a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f53489a);
    }

    public final String toString() {
        return c(this.f53489a);
    }
}
