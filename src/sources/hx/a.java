package hx;

import fb.g0;
import uw.k;
import uw.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements k, ww.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f33826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax.b f33827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ww.b f33828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33829d;

    public a(p pVar, ax.b bVar) {
        this.f33826a = pVar;
        this.f33827b = bVar;
    }

    @Override // uw.k
    public final void b(ww.b bVar) {
        if (zw.a.g(this.f33828c, bVar)) {
            this.f33828c = bVar;
            this.f33826a.b(this);
        }
    }

    @Override // ww.b
    public final void dispose() {
        this.f33828c.dispose();
    }

    @Override // uw.k
    public final void onComplete() {
        if (this.f33829d) {
            return;
        }
        this.f33829d = true;
        this.f33826a.onSuccess(Boolean.FALSE);
    }

    @Override // uw.k
    public final void onError(Throwable th2) {
        if (this.f33829d) {
            qx.b.B(th2);
        } else {
            this.f33829d = true;
            this.f33826a.onError(th2);
        }
    }

    @Override // uw.k
    public final void onNext(Object obj) {
        if (this.f33829d) {
            return;
        }
        try {
            if (this.f33827b.test(obj)) {
                this.f33829d = true;
                this.f33828c.dispose();
                this.f33826a.onSuccess(Boolean.TRUE);
            }
        } catch (Throwable th2) {
            g0.D(th2);
            this.f33828c.dispose();
            onError(th2);
        }
    }
}
