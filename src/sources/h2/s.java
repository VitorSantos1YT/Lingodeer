package h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f31524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f31525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f31526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f31527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f31528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f31529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f31530g;

    public s(double d5, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f31524a = d5;
        this.f31525b = d11;
        this.f31526c = d12;
        this.f31527d = d13;
        this.f31528e = d14;
        this.f31529f = d15;
        this.f31530g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d5)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d5 == -2.0d || d5 == -3.0d) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d5 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d5 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d5 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Double.compare(this.f31524a, sVar.f31524a) == 0 && Double.compare(this.f31525b, sVar.f31525b) == 0 && Double.compare(this.f31526c, sVar.f31526c) == 0 && Double.compare(this.f31527d, sVar.f31527d) == 0 && Double.compare(this.f31528e, sVar.f31528e) == 0 && Double.compare(this.f31529f, sVar.f31529f) == 0 && Double.compare(this.f31530g, sVar.f31530g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f31530g) + ((Double.hashCode(this.f31529f) + ((Double.hashCode(this.f31528e) + ((Double.hashCode(this.f31527d) + ((Double.hashCode(this.f31526c) + ((Double.hashCode(this.f31525b) + (Double.hashCode(this.f31524a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f31524a + ", a=" + this.f31525b + ", b=" + this.f31526c + ", c=" + this.f31527d + ", d=" + this.f31528e + ", e=" + this.f31529f + ", f=" + this.f31530g + ')';
    }

    public /* synthetic */ s(double d5, double d11, double d12, double d13, double d14) {
        this(d5, d11, d12, d13, d14, 0.0d, 0.0d);
    }
}
