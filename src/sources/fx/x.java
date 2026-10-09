package fx;

import fb.g0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends AtomicReference implements uw.i {
    private static final long serialVersionUID = 3323743579927613702L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f28276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28277b;

    public x(w wVar, int i11) {
        this.f28276a = wVar;
        this.f28277b = i11;
    }

    @Override // uw.i
    public final void b(ww.b bVar) {
        zw.a.f(this, bVar);
    }

    @Override // uw.i
    public final void onComplete() {
        w wVar = this.f28276a;
        if (wVar.getAndSet(0) > 0) {
            wVar.a(this.f28277b);
            wVar.f28272a.onComplete();
        }
    }

    @Override // uw.i
    public final void onError(Throwable th2) {
        w wVar = this.f28276a;
        if (wVar.getAndSet(0) <= 0) {
            qx.b.B(th2);
        } else {
            wVar.a(this.f28277b);
            wVar.f28272a.onError(th2);
        }
    }

    @Override // uw.i
    public final void onSuccess(Object obj) {
        w wVar = this.f28276a;
        uw.i iVar = wVar.f28272a;
        Object[] objArr = wVar.f28275d;
        objArr[this.f28277b] = obj;
        if (wVar.decrementAndGet() == 0) {
            try {
                iVar.onSuccess(wVar.f28273b.apply(objArr));
            } catch (Throwable th2) {
                g0.D(th2);
                iVar.onError(th2);
            }
        }
    }
}
