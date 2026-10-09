package cy;

import qx.p;
import qx.q;
import xx.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends e implements q {
    private static final long serialVersionUID = 3786543492451018833L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rx.b f22605c;

    @Override // qx.q
    public final void c(rx.b bVar) {
        if (ux.b.f(this.f22605c, bVar)) {
            this.f22605c = bVar;
            this.f56640a.c(this);
        }
    }

    @Override // xx.e, rx.b
    public final void dispose() {
        super.dispose();
        this.f22605c.dispose();
    }

    @Override // qx.q
    public final void onError(Throwable th2) {
        if ((get() & 54) != 0) {
            p.u(th2);
        } else {
            lazySet(2);
            this.f56640a.onError(th2);
        }
    }
}
