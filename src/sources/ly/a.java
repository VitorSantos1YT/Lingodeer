package ly;

import java.util.concurrent.atomic.AtomicBoolean;
import qx.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicBoolean implements rx.b {
    private static final long serialVersionUID = 3562861878281475070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f40517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f40518b;

    public a(k kVar, b bVar) {
        this.f40517a = kVar;
        this.f40518b = bVar;
    }

    @Override // rx.b
    public final boolean b() {
        return get();
    }

    @Override // rx.b
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.f40518b.n(this);
        }
    }
}
