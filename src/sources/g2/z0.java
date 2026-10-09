package g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f28631b = f0.j(0.5f, 0.5f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f28632c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28633a;

    public static final boolean a(long j11, long j12) {
        return j11 == j12;
    }

    public static final float b(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final float c(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static String d(long j11) {
        return "TransformOrigin(packedValue=" + j11 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z0) {
            return this.f28633a == ((z0) obj).f28633a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28633a);
    }

    public final String toString() {
        return d(this.f28633a);
    }
}
