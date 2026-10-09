package fx;

import fb.g0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends AtomicReference implements uw.i, uw.c, ww.b {
    private static final long serialVersionUID = -2177128922851101253L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw.c f28245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yw.c f28246b;

    public i(uw.c cVar, yw.c cVar2) {
        this.f28245a = cVar;
        this.f28246b = cVar2;
    }

    @Override // uw.i
    public final void b(ww.b bVar) {
        zw.a.c(this, bVar);
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
    }

    @Override // uw.i
    public final void onComplete() {
        this.f28245a.onComplete();
    }

    @Override // uw.i
    public final void onError(Throwable th2) {
        this.f28245a.onError(th2);
    }

    @Override // uw.i
    public final void onSuccess(Object obj) {
        try {
            Object objApply = this.f28246b.apply(obj);
            ax.d.a(objApply, "The mapper returned a null CompletableSource");
            uw.b bVar = (uw.b) objApply;
            if (zw.a.b((ww.b) get())) {
                return;
            }
            bVar.c(this);
        } catch (Throwable th2) {
            g0.D(th2);
            onError(th2);
        }
    }
}
