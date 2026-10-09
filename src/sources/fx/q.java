package fx;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends AtomicReference implements uw.i, ww.b, Runnable {
    private static final long serialVersionUID = 8571289934935992137L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw.i f28258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw.n f28259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f28260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f28261d;

    public q(uw.i iVar, uw.n nVar) {
        this.f28258a = iVar;
        this.f28259b = nVar;
    }

    @Override // uw.i
    public final void b(ww.b bVar) {
        if (zw.a.f(this, bVar)) {
            this.f28258a.b(this);
        }
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
    }

    @Override // uw.i
    public final void onComplete() {
        zw.a.c(this, this.f28259b.b(this));
    }

    @Override // uw.i
    public final void onError(Throwable th2) {
        this.f28261d = th2;
        zw.a.c(this, this.f28259b.b(this));
    }

    @Override // uw.i
    public final void onSuccess(Object obj) {
        this.f28260c = obj;
        zw.a.c(this, this.f28259b.b(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th2 = this.f28261d;
        uw.i iVar = this.f28258a;
        if (th2 != null) {
            this.f28261d = null;
            iVar.onError(th2);
            return;
        }
        Object obj = this.f28260c;
        if (obj == null) {
            iVar.onComplete();
        } else {
            this.f28260c = null;
            iVar.onSuccess(obj);
        }
    }
}
