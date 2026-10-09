package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f35821b = t.b(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f35822c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35823a;

    public /* synthetic */ x0(long j11) {
        this.f35823a = j11;
    }

    public static boolean a(long j11, Object obj) {
        return (obj instanceof x0) && j11 == ((x0) obj).f35823a;
    }

    public static final boolean b(long j11, long j12) {
        return j11 == j12;
    }

    public static final boolean c(long j11) {
        return ((int) (j11 >> 32)) == ((int) (j11 & 4294967295L));
    }

    public static final int d(long j11) {
        return e(j11) - f(j11);
    }

    public static final int e(long j11) {
        return Math.max((int) (j11 >> 32), (int) (j11 & 4294967295L));
    }

    public static final int f(long j11) {
        return Math.min((int) (j11 >> 32), (int) (j11 & 4294967295L));
    }

    public static final boolean g(long j11) {
        return ((int) (j11 >> 32)) > ((int) (j11 & 4294967295L));
    }

    public static String h(long j11) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j11 >> 32));
        sb2.append(", ");
        return ep.a.j(sb2, (int) (j11 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return a(this.f35823a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f35823a);
    }

    public final String toString() {
        return h(this.f35823a);
    }
}
