package v3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f53490a;

    public static final float a(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static String b(long j11) {
        if (j11 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.c(a(j11))) + ", " + ((Object) f.c(Float.intBitsToFloat((int) (j11 & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f53490a == ((g) obj).f53490a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f53490a);
    }

    public final String toString() {
        return b(this.f53490a);
    }
}
