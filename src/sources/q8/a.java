package q8;

import x7.x;
import x7.y;
import x7.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f, y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f47550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f47551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f47552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f47553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f47554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f47555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f47556l;

    public a(long j11, long j12, int i11, int i12, boolean z11) {
        this.f47545a = j11;
        this.f47546b = j12;
        this.f47547c = i12 == -1 ? 1 : i12;
        this.f47549e = i11;
        this.f47551g = z11;
        if (j11 == -1) {
            this.f47548d = -1L;
            this.f47550f = -9223372036854775807L;
        } else {
            long j13 = j11 - j12;
            this.f47548d = j13;
            this.f47550f = (Math.max(0L, j13) * 8000000) / ((long) i11);
        }
        this.f47552h = j12;
        this.f47553i = i11;
        this.f47554j = i12;
        this.f47555k = z11;
        this.f47556l = j11 == -1 ? -1L : j11;
    }

    @Override // q8.f
    public final long a() {
        return this.f47556l;
    }

    @Override // q8.f
    public final long b(long j11) {
        return (Math.max(0L, j11 - this.f47546b) * 8000000) / ((long) this.f47549e);
    }

    @Override // x7.y
    public final boolean d() {
        return this.f47548d != -1 || this.f47551g;
    }

    @Override // x7.y
    public final x i(long j11) {
        long j12 = this.f47548d;
        long j13 = this.f47546b;
        if (j12 == -1 && !this.f47551g) {
            z zVar = new z(0L, j13);
            return new x(zVar, zVar);
        }
        int i11 = this.f47549e;
        long j14 = this.f47547c;
        long jMin = (((((long) i11) * j11) / 8000000) / j14) * j14;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - j14);
        }
        long jMax = Math.max(jMin, 0L) + j13;
        long jMax2 = (Math.max(0L, jMax - j13) * 8000000) / ((long) i11);
        z zVar2 = new z(jMax2, jMax);
        if (j12 != -1 && jMax2 < j11) {
            long j15 = jMax + j14;
            if (j15 < this.f47545a) {
                return new x(zVar2, new z((Math.max(0L, j15 - j13) * 8000000) / ((long) i11), j15));
            }
        }
        return new x(zVar2, zVar2);
    }

    @Override // q8.f
    public final int j() {
        return this.f47553i;
    }

    @Override // x7.y
    public final long k() {
        return this.f47550f;
    }
}
