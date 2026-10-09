package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f31229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f31230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f31231f;

    public w4(long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f31226a = j11;
        this.f31227b = j12;
        this.f31228c = j13;
        this.f31229d = j14;
        this.f31230e = j15;
        this.f31231f = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj;
        return g2.x.d(this.f31226a, w4Var.f31226a) && g2.x.d(this.f31227b, w4Var.f31227b) && g2.x.d(this.f31228c, w4Var.f31228c) && g2.x.d(this.f31229d, w4Var.f31229d) && g2.x.d(this.f31230e, w4Var.f31230e) && g2.x.d(this.f31231f, w4Var.f31231f);
    }

    public final int hashCode() {
        int i11 = g2.x.f28623j;
        return Long.hashCode(this.f31231f) + defpackage.e.f(this.f31230e, defpackage.e.f(this.f31229d, defpackage.e.f(this.f31228c, defpackage.e.f(this.f31227b, Long.hashCode(this.f31226a) * 31, 31), 31), 31), 31);
    }
}
