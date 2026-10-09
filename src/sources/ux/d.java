package ux;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends AtomicReference implements rx.b {
    private static final long serialVersionUID = -754898800686245608L;

    @Override // rx.b
    public final boolean b() {
        return ((rx.b) get()) == b.DISPOSED;
    }

    @Override // rx.b
    public final void dispose() {
        b.a(this);
    }
}
