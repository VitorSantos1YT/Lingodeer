package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f31380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f31381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f31382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f31383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f31384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f31385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f31386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f31387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f31388l;

    public z0(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23) {
        this.f31377a = j11;
        this.f31378b = j12;
        this.f31379c = j13;
        this.f31380d = j14;
        this.f31381e = j15;
        this.f31382f = j16;
        this.f31383g = j17;
        this.f31384h = j18;
        this.f31385i = j19;
        this.f31386j = j21;
        this.f31387k = j22;
        this.f31388l = j23;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return g2.x.d(this.f31377a, z0Var.f31377a) && g2.x.d(this.f31378b, z0Var.f31378b) && g2.x.d(this.f31379c, z0Var.f31379c) && g2.x.d(this.f31380d, z0Var.f31380d) && g2.x.d(this.f31381e, z0Var.f31381e) && g2.x.d(this.f31382f, z0Var.f31382f) && g2.x.d(this.f31383g, z0Var.f31383g) && g2.x.d(this.f31384h, z0Var.f31384h) && g2.x.d(this.f31385i, z0Var.f31385i) && g2.x.d(this.f31386j, z0Var.f31386j) && g2.x.d(this.f31387k, z0Var.f31387k) && g2.x.d(this.f31388l, z0Var.f31388l);
    }

    public final int hashCode() {
        int i11 = g2.x.f28623j;
        return Long.hashCode(this.f31388l) + defpackage.e.f(this.f31387k, defpackage.e.f(this.f31386j, defpackage.e.f(this.f31385i, defpackage.e.f(this.f31384h, defpackage.e.f(this.f31383g, defpackage.e.f(this.f31382f, defpackage.e.f(this.f31381e, defpackage.e.f(this.f31380d, defpackage.e.f(this.f31379c, defpackage.e.f(this.f31378b, Long.hashCode(this.f31377a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
