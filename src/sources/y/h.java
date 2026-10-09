package y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f56709a;

    public static long a(float f5, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static String b(long j11) {
        return "(" + Float.intBitsToFloat((int) (j11 >> 32)) + ", " + Float.intBitsToFloat((int) (j11 & 4294967295L)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f56709a == ((h) obj).f56709a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f56709a);
    }

    public final String toString() {
        return b(this.f56709a);
    }
}
