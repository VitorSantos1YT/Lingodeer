package l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f39022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f39023b;

    public j0(long j11, boolean z11) {
        this.f39022a = z11;
        this.f39023b = j11;
    }

    public long a() {
        if (this.f39022a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.f39023b - System.nanoTime());
    }
}
