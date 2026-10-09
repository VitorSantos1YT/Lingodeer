package fx;

import ay.k0;
import fb.g0;
import fr.p3;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends AtomicReference implements uw.i, ww.b {
    private static final long serialVersionUID = -6076952298809384986L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3 f28229a = ax.d.f3263d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tw.c f28230b = ax.d.f3264e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f28231c = ax.d.f3262c;

    @Override // uw.i
    public final void b(ww.b bVar) {
        zw.a.f(this, bVar);
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
    }

    @Override // uw.i
    public final void onComplete() {
        lazySet(zw.a.DISPOSED);
        try {
            this.f28231c.getClass();
        } catch (Throwable th2) {
            g0.D(th2);
            qx.b.B(th2);
        }
    }

    @Override // uw.i
    public final void onError(Throwable th2) {
        lazySet(zw.a.DISPOSED);
        try {
            this.f28230b.accept(th2);
        } catch (Throwable th3) {
            g0.D(th3);
            qx.b.B(new CompositeException(th2, th3));
        }
    }

    @Override // uw.i
    public final void onSuccess(Object obj) {
        lazySet(zw.a.DISPOSED);
        try {
            this.f28229a.getClass();
        } catch (Throwable th2) {
            g0.D(th2);
            qx.b.B(th2);
        }
    }
}
