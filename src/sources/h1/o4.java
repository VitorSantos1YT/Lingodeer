package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f30787d;

    public o4(long j11, long j12, long j13, long j14) {
        this.f30784a = j11;
        this.f30785b = j12;
        this.f30786c = j13;
        this.f30787d = j14;
    }

    public final o4 a(long j11, long j12, long j13, long j14) {
        if (j11 == 16) {
            j11 = this.f30784a;
        }
        return new o4(j11, j12 != 16 ? j12 : this.f30785b, j13 != 16 ? j13 : this.f30786c, j14 != 16 ? j14 : this.f30787d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        return g2.x.d(this.f30784a, o4Var.f30784a) && g2.x.d(this.f30785b, o4Var.f30785b) && g2.x.d(this.f30786c, o4Var.f30786c) && g2.x.d(this.f30787d, o4Var.f30787d);
    }

    public final int hashCode() {
        int i11 = g2.x.f28623j;
        return Long.hashCode(this.f30787d) + defpackage.e.f(this.f30786c, defpackage.e.f(this.f30785b, Long.hashCode(this.f30784a) * 31, 31), 31);
    }
}
