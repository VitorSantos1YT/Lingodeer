package v3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f53492a;

    public /* synthetic */ j(long j11) {
        this.f53492a = j11;
    }

    public static final long a(int i11, int i12) {
        return (((long) i12) & 4294967295L) | (((long) i11) << 32);
    }

    public static /* synthetic */ long b(int i11, int i12, int i13, long j11) {
        if ((i13 & 1) != 0) {
            i11 = (int) (j11 >> 32);
        }
        if ((i13 & 2) != 0) {
            i12 = (int) (4294967295L & j11);
        }
        return a(i11, i12);
    }

    public static final boolean c(long j11, long j12) {
        return j11 == j12;
    }

    public static final long d(long j11, long j12) {
        return (((long) (((int) (j11 >> 32)) - ((int) (j12 >> 32)))) << 32) | (((long) (((int) (j11 & 4294967295L)) - ((int) (j12 & 4294967295L)))) & 4294967295L);
    }

    public static final long e(long j11, long j12) {
        return (((long) (((int) (j11 >> 32)) + ((int) (j12 >> 32)))) << 32) | (((long) (((int) (j11 & 4294967295L)) + ((int) (j12 & 4294967295L)))) & 4294967295L);
    }

    public static String f(long j11) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j11 >> 32));
        sb2.append(", ");
        return ep.a.j(sb2, (int) (j11 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f53492a == ((j) obj).f53492a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f53492a);
    }

    public final String toString() {
        return f(this.f53492a);
    }
}
