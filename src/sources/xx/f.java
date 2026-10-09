package xx;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import qx.k;
import qx.p;
import re.e0;
import re.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends AtomicReference implements k, rx.b {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tx.c f56642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tx.c f56643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f56644c = vx.b.f54314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f56645d = vx.b.f54315d;

    public f(tx.c cVar, tx.c cVar2) {
        this.f56642a = cVar;
        this.f56643b = cVar2;
    }

    @Override // rx.b
    public final boolean b() {
        return get() == ux.b.DISPOSED;
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        if (ux.b.e(this, bVar)) {
            try {
                this.f56645d.getClass();
            } catch (Throwable th2) {
                ef.e.E(th2);
                bVar.dispose();
                onError(th2);
            }
        }
    }

    @Override // rx.b
    public final void dispose() {
        ux.b.a(this);
    }

    @Override // qx.k
    public final void onComplete() {
        if (b()) {
            return;
        }
        lazySet(ux.b.DISPOSED);
        try {
            this.f56644c.getClass();
        } catch (Throwable th2) {
            ef.e.E(th2);
            p.u(th2);
        }
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        if (b()) {
            p.u(th2);
            return;
        }
        lazySet(ux.b.DISPOSED);
        try {
            this.f56643b.accept(th2);
        } catch (Throwable th3) {
            ef.e.E(th3);
            p.u(new CompositeException(th2, th3));
        }
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        if (b()) {
            return;
        }
        try {
            this.f56642a.accept(obj);
        } catch (Throwable th2) {
            ef.e.E(th2);
            ((rx.b) get()).dispose();
            onError(th2);
        }
    }
}
