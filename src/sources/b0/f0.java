package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f3524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3526d;

    public f0(int i11, int i12, z zVar) {
        this.f3523a = i11;
        this.f3524b = zVar;
        this.f3525c = ((long) i11) * 1000000;
        this.f3526d = ((long) i12) * 1000000;
    }

    @Override // b0.d0
    public final long b(float f5, float f11, float f12) {
        return this.f3526d + this.f3525c;
    }

    @Override // b0.d0
    public final float c(float f5, float f11, float f12, long j11) {
        long j12 = j11 - this.f3526d;
        if (j12 < 0) {
            j12 = 0;
        }
        long j13 = this.f3525c;
        long j14 = j12 > j13 ? j13 : j12;
        if (j14 == 0) {
            return f12;
        }
        return (e(f5, f11, f12, j14) - e(f5, f11, f12, j14 - 1000000)) * 1000.0f;
    }

    @Override // b0.d0
    public final float e(float f5, float f11, float f12, long j11) {
        long j12 = j11 - this.f3526d;
        if (j12 < 0) {
            j12 = 0;
        }
        long j13 = this.f3525c;
        if (j12 > j13) {
            j12 = j13;
        }
        float fA = this.f3524b.a(this.f3523a == 0 ? 1.0f : j12 / j13);
        return (f11 * fA) + ((1 - fA) * f5);
    }
}
