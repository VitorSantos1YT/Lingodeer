package v3;

import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p[] f53500b = {new p(0), new p(4294967296L), new p(8589934592L)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f53501c = j3.L(0, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f53502a;

    public static final boolean a(long j11, long j12) {
        return j11 == j12;
    }

    public static final long b(long j11) {
        return f53500b[(int) ((j11 & 1095216660480L) >>> 32)].f53503a;
    }

    public static final float c(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static final boolean d(long j11) {
        return (j11 & 1095216660480L) == 8589934592L;
    }

    public static final boolean e(long j11) {
        return (j11 & 1095216660480L) == 4294967296L;
    }

    public static String f(long j11) {
        long jB = b(j11);
        if (p.a(jB, 0L)) {
            return "Unspecified";
        }
        if (p.a(jB, 4294967296L)) {
            return c(j11) + ".sp";
        }
        if (!p.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j11) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f53502a == ((o) obj).f53502a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f53502a);
    }

    public final String toString() {
        return f(this.f53502a);
    }
}
