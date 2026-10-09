package zw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends AtomicReference implements ww.b {
    private static final long serialVersionUID = -754898800686245608L;

    public final boolean a() {
        return a.b((ww.b) get());
    }

    @Override // ww.b
    public final void dispose() {
        a.a(this);
    }
}
