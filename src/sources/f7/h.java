package f7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26778c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26779d = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f26781f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f26782g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f26785j = 0.97f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f26784i = 1.03f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f26786k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f26787l = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f26780e = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f26783h = -9223372036854775807L;
    public long m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f26788n = -9223372036854775807L;

    public h(long j11, long j12) {
        this.f26776a = j11;
        this.f26777b = j12;
    }

    public final void a() {
        long j11;
        long j12 = this.f26778c;
        if (j12 != -9223372036854775807L) {
            j11 = this.f26779d;
            if (j11 == -9223372036854775807L) {
                long j13 = this.f26781f;
                if (j13 != -9223372036854775807L && j12 < j13) {
                    j12 = j13;
                }
                j11 = this.f26782g;
                if (j11 == -9223372036854775807L || j12 <= j11) {
                    j11 = j12;
                }
            }
        } else {
            j11 = -9223372036854775807L;
        }
        if (this.f26780e == j11) {
            return;
        }
        this.f26780e = j11;
        this.f26783h = j11;
        this.m = -9223372036854775807L;
        this.f26788n = -9223372036854775807L;
        this.f26787l = -9223372036854775807L;
    }
}
