package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f31087d;

    public t0(long j11, long j12, long j13, long j14) {
        this.f31084a = j11;
        this.f31085b = j12;
        this.f31086c = j13;
        this.f31087d = j14;
    }

    public final t0 a(long j11, long j12, long j13, long j14) {
        if (j11 == 16) {
            j11 = this.f31084a;
        }
        return new t0(j11, j12 != 16 ? j12 : this.f31085b, j13 != 16 ? j13 : this.f31086c, j14 != 16 ? j14 : this.f31087d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return g2.x.d(this.f31084a, t0Var.f31084a) && g2.x.d(this.f31085b, t0Var.f31085b) && g2.x.d(this.f31086c, t0Var.f31086c) && g2.x.d(this.f31087d, t0Var.f31087d);
    }

    public final int hashCode() {
        int i11 = g2.x.f28623j;
        return Long.hashCode(this.f31087d) + defpackage.e.f(this.f31086c, defpackage.e.f(this.f31085b, Long.hashCode(this.f31084a) * 31, 31), 31);
    }
}
