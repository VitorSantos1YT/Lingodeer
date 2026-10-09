package fx;

import fb.g0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends AtomicReference implements uw.i, ww.b {
    private static final long serialVersionUID = 4375739915521278546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw.i f28247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yw.c f28248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ww.b f28249c;

    public j(uw.i iVar, yw.c cVar) {
        this.f28247a = iVar;
        this.f28248b = cVar;
    }

    @Override // uw.i
    public final void b(ww.b bVar) {
        if (zw.a.g(this.f28249c, bVar)) {
            this.f28249c = bVar;
            this.f28247a.b(this);
        }
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
        this.f28249c.dispose();
    }

    @Override // uw.i
    public final void onComplete() {
        this.f28247a.onComplete();
    }

    @Override // uw.i
    public final void onError(Throwable th2) {
        this.f28247a.onError(th2);
    }

    @Override // uw.i
    public final void onSuccess(Object obj) {
        try {
            Object objApply = this.f28248b.apply(obj);
            ax.d.a(objApply, "The mapper returned a null MaybeSource");
            uw.h hVar = (uw.h) objApply;
            if (zw.a.b((ww.b) get())) {
                return;
            }
            hVar.b(new dm.a(this, 10));
        } catch (Exception e8) {
            g0.D(e8);
            this.f28247a.onError(e8);
        }
    }
}
