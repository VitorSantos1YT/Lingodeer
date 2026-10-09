package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends vz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f53441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rz.m f53442b;

    @Override // vz.c
    public final boolean a(vz.a aVar) {
        w0 w0Var = (w0) aVar;
        if (this.f53441a >= 0) {
            return false;
        }
        long j11 = w0Var.K;
        if (j11 < w0Var.L) {
            w0Var.L = j11;
        }
        this.f53441a = j11;
        return true;
    }

    @Override // vz.c
    public final vy.d[] b(vz.a aVar) {
        long j11 = this.f53441a;
        this.f53441a = -1L;
        this.f53442b = null;
        return ((w0) aVar).v(j11);
    }
}
