package v3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f53503a;

    public static final boolean a(long j11, long j12) {
        return j11 == j12;
    }

    public static String b(long j11) {
        if (a(j11, 0L)) {
            return "Unspecified";
        }
        if (a(j11, 4294967296L)) {
            return "Sp";
        }
        return a(j11, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f53503a == ((p) obj).f53503a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f53503a);
    }

    public final String toString() {
        return b(this.f53503a);
    }
}
