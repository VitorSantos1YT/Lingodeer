package ux;

import ef.e;
import java.util.concurrent.atomic.AtomicReference;
import qx.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicReference implements rx.b {
    private static final long serialVersionUID = 5718521705281392066L;

    @Override // rx.b
    public final boolean b() {
        return get() == null;
    }

    @Override // rx.b
    public final void dispose() {
        no.b bVar;
        if (get() == null || (bVar = (no.b) getAndSet(null)) == null) {
            return;
        }
        try {
            bVar.f43862a.d(bVar.f43863b);
        } catch (Throwable th2) {
            e.E(th2);
            p.u(th2);
        }
    }
}
