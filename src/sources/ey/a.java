package ey;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import n20.c;
import qx.e;
import qx.p;
import re.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicReference implements e, c, rx.b {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tx.c f26104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tx.c f26105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f26106c = vx.b.f54314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tx.c f26107d;

    public a(tx.c cVar, tx.c cVar2, zx.e eVar) {
        this.f26104a = cVar;
        this.f26105b = cVar2;
        this.f26107d = eVar;
    }

    @Override // rx.b
    public final boolean b() {
        return get() == fy.c.CANCELLED;
    }

    @Override // n20.b
    public final void c(c cVar) {
        if (fy.c.b(this, cVar)) {
            try {
                this.f26107d.accept(this);
            } catch (Throwable th2) {
                ef.e.E(th2);
                cVar.cancel();
                onError(th2);
            }
        }
    }

    @Override // n20.c
    public final void cancel() {
        fy.c.a(this);
    }

    @Override // rx.b
    public final void dispose() {
        fy.c.a(this);
    }

    @Override // n20.b
    public final void onComplete() {
        Object obj = get();
        fy.c cVar = fy.c.CANCELLED;
        if (obj != cVar) {
            lazySet(cVar);
            try {
                this.f26106c.getClass();
            } catch (Throwable th2) {
                ef.e.E(th2);
                p.u(th2);
            }
        }
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        Object obj = get();
        fy.c cVar = fy.c.CANCELLED;
        if (obj == cVar) {
            p.u(th2);
            return;
        }
        lazySet(cVar);
        try {
            this.f26105b.accept(th2);
        } catch (Throwable th3) {
            ef.e.E(th3);
            p.u(new CompositeException(th2, th3));
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (b()) {
            return;
        }
        try {
            this.f26104a.accept(obj);
        } catch (Throwable th2) {
            ef.e.E(th2);
            ((c) get()).cancel();
            onError(th2);
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        ((c) get()).request(j11);
    }
}
