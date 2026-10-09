package v3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f53491a;

    public static final float a(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static final float b(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static String c(long j11) {
        if (j11 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) f.c(b(j11))) + " x " + ((Object) f.c(a(j11)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f53491a == ((h) obj).f53491a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f53491a);
    }

    public final String toString() {
        return c(this.f53491a);
    }
}
