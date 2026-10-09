package y5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f57108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57109b;

    public f(long j11, long j12) {
        if (j12 == 0) {
            this.f57108a = 0L;
            this.f57109b = 1L;
        } else {
            this.f57108a = j11;
            this.f57109b = j12;
        }
    }

    public final String toString() {
        return this.f57108a + "/" + this.f57109b;
    }
}
