package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f30389d;

    public i0(long j11, long j12, long j13, long j14) {
        this.f30386a = j11;
        this.f30387b = j12;
        this.f30388c = j13;
        this.f30389d = j14;
    }

    public final i0 a(long j11, long j12, long j13, long j14) {
        if (j11 == 16) {
            j11 = this.f30386a;
        }
        return new i0(j11, j12 != 16 ? j12 : this.f30387b, j13 != 16 ? j13 : this.f30388c, j14 != 16 ? j14 : this.f30389d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return g2.x.d(this.f30386a, i0Var.f30386a) && g2.x.d(this.f30387b, i0Var.f30387b) && g2.x.d(this.f30388c, i0Var.f30388c) && g2.x.d(this.f30389d, i0Var.f30389d);
    }

    public final int hashCode() {
        int i11 = g2.x.f28623j;
        return Long.hashCode(this.f30389d) + defpackage.e.f(this.f30388c, defpackage.e.f(this.f30387b, Long.hashCode(this.f30386a) * 31, 31), 31);
    }
}
