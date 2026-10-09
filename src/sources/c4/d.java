package c4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f6541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f6542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f6543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f6544h;

    public d(String str) {
        super(0);
        this.f6548b = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f6541e = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i11 = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i11);
        this.f6542f = Double.parseDouble(str.substring(i11, iIndexOf3).trim());
        int i12 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(44, i12);
        this.f6543g = Double.parseDouble(str.substring(i12, iIndexOf4).trim());
        int i13 = iIndexOf4 + 1;
        this.f6544h = Double.parseDouble(str.substring(i13, str.indexOf(41, i13)).trim());
    }

    @Override // c4.e
    public final double a(double d5) {
        if (d5 <= 0.0d) {
            return 0.0d;
        }
        if (d5 >= 1.0d) {
            return 1.0d;
        }
        double d11 = 0.5d;
        double d12 = 0.5d;
        while (d11 > 0.01d) {
            d11 *= 0.5d;
            d12 = e(d12) < d5 ? d12 + d11 : d12 - d11;
        }
        double d13 = d12 - d11;
        double dE = e(d13);
        double d14 = d12 + d11;
        double dE2 = e(d14);
        double dF = f(d13);
        return (((d5 - dE) * (f(d14) - dF)) / (dE2 - dE)) + dF;
    }

    @Override // c4.e
    public final double b(double d5) {
        double d11 = 0.5d;
        double d12 = 0.5d;
        while (d11 > 1.0E-4d) {
            d11 *= 0.5d;
            d12 = e(d12) < d5 ? d12 + d11 : d12 - d11;
        }
        double d13 = d12 - d11;
        double d14 = d12 + d11;
        return (f(d14) - f(d13)) / (e(d14) - e(d13));
    }

    public final double e(double d5) {
        double d11 = 1.0d - d5;
        double d12 = 3.0d * d11;
        double d13 = d11 * d12 * d5;
        double d14 = d12 * d5 * d5;
        return (this.f6543g * d14) + (this.f6541e * d13) + (d5 * d5 * d5);
    }

    public final double f(double d5) {
        double d11 = 1.0d - d5;
        double d12 = 3.0d * d11;
        double d13 = d11 * d12 * d5;
        double d14 = d12 * d5 * d5;
        return (this.f6544h * d14) + (this.f6542f * d13) + (d5 * d5 * d5);
    }
}
