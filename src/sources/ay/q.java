package ay;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements qx.k, rx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.g0 f3370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re.e0 f3371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.v f3372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rx.b f3373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3374f;

    public q(qx.k kVar, re.g0 g0Var, re.e0 e0Var, re.v vVar) {
        this.f3369a = kVar;
        this.f3370b = g0Var;
        this.f3371c = e0Var;
        this.f3372d = vVar;
    }

    @Override // rx.b
    public final boolean b() {
        return this.f3373e.b();
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        if (ux.b.f(this.f3373e, bVar)) {
            this.f3373e = bVar;
            this.f3369a.c(this);
        }
    }

    @Override // rx.b
    public final void dispose() {
        this.f3373e.dispose();
    }

    @Override // qx.k
    public final void onComplete() {
        if (this.f3374f) {
            return;
        }
        try {
            this.f3372d.run();
            this.f3374f = true;
            this.f3369a.onComplete();
        } catch (Throwable th2) {
            ef.e.E(th2);
            onError(th2);
        }
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        if (this.f3374f) {
            qx.p.u(th2);
            return;
        }
        this.f3374f = true;
        try {
            this.f3371c.accept(th2);
        } catch (Throwable th3) {
            ef.e.E(th3);
            th2 = new CompositeException(th2, th3);
        }
        this.f3369a.onError(th2);
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        if (this.f3374f) {
            return;
        }
        try {
            this.f3370b.accept(obj);
            this.f3369a.onNext(obj);
        } catch (Throwable th2) {
            ef.e.E(th2);
            this.f3373e.dispose();
            onError(th2);
        }
    }
}
