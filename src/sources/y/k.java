package y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f56725a;

    public static long a(int i11, int i12) {
        return (((long) i12) & 4294967295L) | (((long) i11) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f56725a == ((k) obj).f56725a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f56725a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        long j11 = this.f56725a;
        sb2.append((int) (j11 >> 32));
        sb2.append(", ");
        return ep.a.j(sb2, (int) (j11 & 4294967295L), ')');
    }
}
