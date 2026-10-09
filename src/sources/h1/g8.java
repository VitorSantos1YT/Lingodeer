package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f30291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f30292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f30293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f30294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f30295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f30296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f30297j;

    public g8(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21) {
        this.f30288a = j11;
        this.f30289b = j12;
        this.f30290c = j13;
        this.f30291d = j14;
        this.f30292e = j15;
        this.f30293f = j16;
        this.f30294g = j17;
        this.f30295h = j18;
        this.f30296i = j19;
        this.f30297j = j21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g8)) {
            return false;
        }
        g8 g8Var = (g8) obj;
        return g2.x.d(this.f30288a, g8Var.f30288a) && g2.x.d(this.f30289b, g8Var.f30289b) && g2.x.d(this.f30290c, g8Var.f30290c) && g2.x.d(this.f30291d, g8Var.f30291d) && g2.x.d(this.f30292e, g8Var.f30292e) && g2.x.d(this.f30293f, g8Var.f30293f) && g2.x.d(this.f30294g, g8Var.f30294g) && g2.x.d(this.f30295h, g8Var.f30295h) && g2.x.d(this.f30296i, g8Var.f30296i) && g2.x.d(this.f30297j, g8Var.f30297j);
    }

    public final int hashCode() {
        int i11 = g2.x.f28623j;
        return Long.hashCode(this.f30297j) + defpackage.e.f(this.f30296i, defpackage.e.f(this.f30295h, defpackage.e.f(this.f30294g, defpackage.e.f(this.f30293f, defpackage.e.f(this.f30292e, defpackage.e.f(this.f30291d, defpackage.e.f(this.f30290c, defpackage.e.f(this.f30289b, Long.hashCode(this.f30288a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
