package lx;

import ay.k0;
import ex.s0;
import fb.g0;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import uw.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends AtomicReference implements g, n20.c, ww.b {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.firebase.database.android.d f40507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tw.c f40508b = ax.d.f3264e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f40509c = ax.d.f3262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yw.b f40510d;

    public c(com.google.firebase.database.android.d dVar, s0 s0Var) {
        this.f40507a = dVar;
        this.f40510d = s0Var;
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.b(this, cVar)) {
            try {
                this.f40510d.accept(this);
            } catch (Throwable th2) {
                g0.D(th2);
                cVar.cancel();
                onError(th2);
            }
        }
    }

    @Override // n20.c
    public final void cancel() {
        mx.g.a(this);
    }

    @Override // ww.b
    public final void dispose() {
        mx.g.a(this);
    }

    @Override // n20.b
    public final void onComplete() {
        Object obj = get();
        mx.g gVar = mx.g.CANCELLED;
        if (obj != gVar) {
            lazySet(gVar);
            try {
                this.f40509c.getClass();
            } catch (Throwable th2) {
                g0.D(th2);
                qx.b.B(th2);
            }
        }
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        Object obj = get();
        mx.g gVar = mx.g.CANCELLED;
        if (obj == gVar) {
            qx.b.B(th2);
            return;
        }
        lazySet(gVar);
        try {
            this.f40508b.accept(th2);
        } catch (Throwable th3) {
            g0.D(th3);
            qx.b.B(new CompositeException(th2, th3));
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (get() == mx.g.CANCELLED) {
            return;
        }
        try {
            this.f40507a.accept(obj);
        } catch (Throwable th2) {
            g0.D(th2);
            ((n20.c) get()).cancel();
            onError(th2);
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        ((n20.c) get()).request(j11);
    }
}
