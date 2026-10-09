package l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static i0 f39016d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f39018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39019c;

    public final void a(double d5, double d11, long j11) {
        float f5 = (j11 - 946728000000L) / 8.64E7f;
        float f11 = (0.01720197f * f5) + 6.24006f;
        double d12 = f11;
        double dSin = (Math.sin(f11 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f11) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double d13 = (-d11) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + ((double) (Math.round(((double) (f5 - 9.0E-4f)) - d13) + 9.0E-4f)) + d13;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d14 = 0.01745329238474369d * d5;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d14))) / (Math.cos(dAsin) * Math.cos(d14));
        if (dSin3 >= 1.0d) {
            this.f39019c = 1;
            this.f39017a = -1L;
            this.f39018b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f39019c = 0;
                this.f39017a = -1L;
                this.f39018b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f39017a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f39018b = jRound;
            if (jRound >= j11 || this.f39017a <= j11) {
                this.f39019c = 1;
            } else {
                this.f39019c = 0;
            }
        }
    }
}
