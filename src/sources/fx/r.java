package fx;

import fb.g0;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends AtomicReference implements uw.i, ww.b {
    private static final long serialVersionUID = 2026620218879969836L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw.i f28262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yw.c f28263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28264c = true;

    public r(uw.i iVar, yw.c cVar) {
        this.f28262a = iVar;
        this.f28263b = cVar;
    }

    @Override // uw.i
    public final void b(ww.b bVar) {
        if (zw.a.f(this, bVar)) {
            this.f28262a.b(this);
        }
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
    }

    @Override // uw.i
    public final void onComplete() {
        this.f28262a.onComplete();
    }

    @Override // uw.i
    public final void onError(Throwable th2) {
        boolean z11 = this.f28264c;
        uw.i iVar = this.f28262a;
        if (!z11 && !(th2 instanceof Exception)) {
            iVar.onError(th2);
            return;
        }
        try {
            Object objApply = this.f28263b.apply(th2);
            ax.d.a(objApply, "The resumeFunction returned a null MaybeSource");
            uw.h hVar = (uw.h) objApply;
            zw.a.c(this, null);
            hVar.b(new ob.e(9, iVar, this));
        } catch (Throwable th3) {
            g0.D(th3);
            iVar.onError(new CompositeException(th2, th3));
        }
    }

    @Override // uw.i
    public final void onSuccess(Object obj) {
        this.f28262a.onSuccess(obj);
    }
}
