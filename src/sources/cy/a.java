package cy;

import java.util.concurrent.atomic.AtomicReference;
import qx.p;
import qx.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicReference implements rx.b {
    private static final long serialVersionUID = -2467358622224974244L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f22604a;

    public a(q qVar) {
        this.f22604a = qVar;
    }

    public final void a(Throwable th2) {
        rx.b bVar;
        Object obj = get();
        ux.b bVar2 = ux.b.DISPOSED;
        if (obj == bVar2 || (bVar = (rx.b) getAndSet(bVar2)) == bVar2) {
            p.u(th2);
            return;
        }
        try {
            this.f22604a.onError(th2);
        } finally {
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    @Override // rx.b
    public final boolean b() {
        return ((rx.b) get()) == ux.b.DISPOSED;
    }

    public final void c(Object obj) {
        rx.b bVar;
        q qVar = this.f22604a;
        Object obj2 = get();
        ux.b bVar2 = ux.b.DISPOSED;
        if (obj2 == bVar2 || (bVar = (rx.b) getAndSet(bVar2)) == bVar2) {
            return;
        }
        try {
            qVar.onSuccess(obj);
        } finally {
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    @Override // rx.b
    public final void dispose() {
        ux.b.a(this);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return nv.p.r(a.class.getSimpleName(), "{", super.toString(), "}");
    }
}
