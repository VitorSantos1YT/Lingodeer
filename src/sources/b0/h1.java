package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f3558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3559c;

    public final long a(long j11, float f5, float f11) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f12 = f5 - this.f3557a;
        double d5 = j11 / 1000.0d;
        float f13 = this.f3559c;
        double d11 = ((double) f13) * ((double) f13);
        double d12 = this.f3558b;
        double d13 = ((double) (-f13)) * d12;
        if (f13 <= 1.0f) {
            if (f13 == 1.0f) {
                double d14 = f12;
                double d15 = (d12 * d14) + ((double) f11);
                double d16 = (-d12) * d5;
                double d17 = (d5 * d15) + d14;
                dSin = Math.exp(d16) * d17;
                dExp = Math.exp(d16) * d17 * (-this.f3558b);
                dExp2 = Math.exp(d16) * d15;
            } else {
                double d18 = 1;
                double dSqrt = Math.sqrt(d18 - d11) * d12;
                double d19 = f12;
                double d20 = (((-d13) * d19) + ((double) f11)) * (d18 / dSqrt);
                double d21 = dSqrt * d5;
                double d22 = d5 * d13;
                dSin = ((Math.sin(d21) * d20) + (Math.cos(d21) * d19)) * Math.exp(d22);
                dCos = (((Math.cos(d21) * dSqrt * d20) + (Math.sin(d21) * (-dSqrt) * d19)) * Math.exp(d22)) + (d13 * dSin);
            }
            return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f3557a))) << 32);
        }
        double dSqrt2 = Math.sqrt(d11 - ((double) 1)) * d12;
        double d23 = d13 + dSqrt2;
        double d24 = d13 - dSqrt2;
        double d25 = f12;
        double d26 = ((d24 * d25) - ((double) f11)) / (d24 - d23);
        double d27 = d25 - d26;
        double d28 = d24 * d5;
        double d29 = d5 * d23;
        dSin = (Math.exp(d29) * d26) + (Math.exp(d28) * d27);
        dExp = Math.exp(d28) * d27 * d24;
        dExp2 = Math.exp(d29) * d26 * d23;
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f3557a))) << 32);
    }
}
