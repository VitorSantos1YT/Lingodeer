package x7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f55876d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f55877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f55878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f55879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f55880h;

    public e(long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f55873a = j11;
        this.f55874b = j12;
        this.f55877e = j13;
        this.f55878f = j14;
        this.f55879g = j15;
        this.f55875c = j16;
        this.f55880h = a(j12, 0L, j13, j14, j15, j16);
    }

    public static long a(long j11, long j12, long j13, long j14, long j15, long j16) {
        if (j14 + 1 >= j15 || j12 + 1 >= j13) {
            return j14;
        }
        long j17 = (long) ((j11 - j12) * ((j15 - j14) / (j13 - j12)));
        return b7.f0.h(((j17 + j14) - j16) - (j17 / 20), j14, j15 - 1);
    }
}
