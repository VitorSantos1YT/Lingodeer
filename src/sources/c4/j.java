package c4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f6569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f6570f;

    @Override // c4.e
    public final double a(double d5) {
        double d11 = this.f6569e;
        double d12 = this.f6570f;
        if (d5 < d12) {
            return (d12 * d5) / (((d12 - d5) * d11) + d5);
        }
        return ((d5 - 1.0d) * (1.0d - d12)) / ((1.0d - d5) - ((d12 - d5) * d11));
    }

    @Override // c4.e
    public final double b(double d5) {
        double d11 = this.f6569e;
        double d12 = this.f6570f;
        if (d5 < d12) {
            double d13 = d11 * d12 * d12;
            double d14 = ((d12 - d5) * d11) + d5;
            return d13 / (d14 * d14);
        }
        double d15 = d12 - 1.0d;
        double d16 = (((d12 - d5) * (-d11)) - d5) + 1.0d;
        return ((d15 * d11) * d15) / (d16 * d16);
    }
}
