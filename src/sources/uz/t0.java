package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements rz.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f53400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f53401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rz.m f53403d;

    public t0(w0 w0Var, long j11, Object obj, rz.m mVar) {
        this.f53400a = w0Var;
        this.f53401b = j11;
        this.f53402c = obj;
        this.f53403d = mVar;
    }

    @Override // rz.q0
    public final void dispose() {
        w0 w0Var = this.f53400a;
        synchronized (w0Var) {
            if (this.f53401b < w0Var.p()) {
                return;
            }
            Object[] objArr = w0Var.H;
            kotlin.jvm.internal.m.c(objArr);
            long j11 = this.f53401b;
            if (objArr[((int) j11) & (objArr.length - 1)] != this) {
                return;
            }
            x0.e(objArr, j11, x0.f53434a);
            w0Var.k();
        }
    }
}
