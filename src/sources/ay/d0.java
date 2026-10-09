package ay;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends qx.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.o f3281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f3284d;

    public d0(long j11, long j12, TimeUnit timeUnit, qx.o oVar) {
        this.f3282b = j11;
        this.f3283c = j12;
        this.f3284d = timeUnit;
        this.f3281a = oVar;
    }

    @Override // qx.h
    public final void j(qx.k kVar) {
        c0 c0Var = new c0(kVar);
        kVar.c(c0Var);
        qx.o oVar = this.f3281a;
        if (!(oVar instanceof dy.x)) {
            ux.b.e(c0Var, oVar.d(c0Var, this.f3282b, this.f3283c, this.f3284d));
        } else {
            dy.w wVar = new dy.w();
            ux.b.e(c0Var, wVar);
            wVar.e(c0Var, this.f3282b, this.f3283c, this.f3284d);
        }
    }
}
