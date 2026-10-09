package ix;

import ax.d;
import fb.g0;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import uw.o;
import uw.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends AtomicReference implements p, ww.b {
    private static final long serialVersionUID = -5314538511045349925L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f34892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax.c f34893b;

    public c(p pVar, ax.c cVar) {
        this.f34892a = pVar;
        this.f34893b = cVar;
    }

    @Override // uw.p
    public final void b(ww.b bVar) {
        if (zw.a.f(this, bVar)) {
            this.f34892a.b(this);
        }
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
    }

    @Override // uw.p
    public final void onError(Throwable th2) {
        p pVar = this.f34892a;
        try {
            Object obj = this.f34893b.f3259b;
            d.a(obj, "The nextFunction returned a null SingleSource.");
            ((o) obj).a(new b1.p(5, this, pVar));
        } catch (Throwable th3) {
            g0.D(th3);
            pVar.onError(new CompositeException(th2, th3));
        }
    }

    @Override // uw.p
    public final void onSuccess(Object obj) {
        this.f34892a.onSuccess(obj);
    }
}
