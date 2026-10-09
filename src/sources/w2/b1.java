package w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class b1 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f54474a;

    public b1(fz.c cVar) {
        this.f54474a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            return this.f54474a == ((b1) obj).f54474a;
        }
        return false;
    }

    @Override // y2.d1
    public final z1.q f() {
        c1 c1Var = new c1();
        c1Var.Q = this.f54474a;
        long j11 = Integer.MIN_VALUE;
        c1Var.R = (j11 & 4294967295L) | (j11 << 32);
        return c1Var;
    }

    public final int hashCode() {
        return this.f54474a.hashCode();
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        c1 c1Var = (c1) qVar;
        c1Var.Q = this.f54474a;
        long j11 = Integer.MIN_VALUE;
        c1Var.R = (j11 & 4294967295L) | (j11 << 32);
    }
}
