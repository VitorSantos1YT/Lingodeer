package c4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final double[] f6519s = new double[91];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f6520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f6521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f6522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f6523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f6524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f6525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f6526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f6527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f6528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f6529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f6530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f6531l;
    public double m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f6532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f6533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f6534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6536r;

    public final double a() {
        double d5 = this.f6529j * this.f6534p;
        double dHypot = this.f6532n / Math.hypot(d5, (-this.f6530k) * this.f6533o);
        return this.f6535q ? (-d5) * dHypot : d5 * dHypot;
    }

    public final double b() {
        double d5 = this.f6529j * this.f6534p;
        double d11 = (-this.f6530k) * this.f6533o;
        double dHypot = this.f6532n / Math.hypot(d5, d11);
        return this.f6535q ? (-d11) * dHypot : d11 * dHypot;
    }

    public final double c(double d5) {
        double d11 = (d5 - this.f6522c) * this.f6528i;
        double d12 = this.f6524e;
        return ((this.f6525f - d12) * d11) + d12;
    }

    public final double d(double d5) {
        double d11 = (d5 - this.f6522c) * this.f6528i;
        double d12 = this.f6526g;
        return ((this.f6527h - d12) * d11) + d12;
    }

    public final double e() {
        return (this.f6529j * this.f6533o) + this.f6531l;
    }

    public final double f() {
        return (this.f6530k * this.f6534p) + this.m;
    }

    public final void g(double d5) {
        double d11 = (this.f6535q ? this.f6523d - d5 : d5 - this.f6522c) * this.f6528i;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            d12 = 1.0d;
            if (d11 < 1.0d) {
                double[] dArr = this.f6520a;
                double length = d11 * ((double) (dArr.length - 1));
                int i11 = (int) length;
                double d13 = dArr[i11];
                d12 = ((dArr[i11 + 1] - d13) * (length - ((double) i11))) + d13;
            }
        }
        double d14 = d12 * 1.5707963267948966d;
        this.f6533o = Math.sin(d14);
        this.f6534p = Math.cos(d14);
    }
}
