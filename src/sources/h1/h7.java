package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f30342d;

    public h7(long j11, long j12, long j13, long j14) {
        this.f30339a = j11;
        this.f30340b = j12;
        this.f30341c = j13;
        this.f30342d = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h7)) {
            return false;
        }
        h7 h7Var = (h7) obj;
        return g2.x.d(this.f30339a, h7Var.f30339a) && g2.x.d(this.f30340b, h7Var.f30340b) && g2.x.d(this.f30341c, h7Var.f30341c) && g2.x.d(this.f30342d, h7Var.f30342d);
    }

    public final int hashCode() {
        int i11 = g2.x.f28623j;
        return Long.hashCode(this.f30342d) + defpackage.e.f(this.f30341c, defpackage.e.f(this.f30340b, Long.hashCode(this.f30339a) * 31, 31), 31);
    }
}
