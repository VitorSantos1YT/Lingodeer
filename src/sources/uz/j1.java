package uz;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j1 extends vz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f53325a = new AtomicReference(null);

    @Override // vz.c
    public final boolean a(vz.a aVar) {
        AtomicReference atomicReference = this.f53325a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(x0.f53435b);
        return true;
    }

    @Override // vz.c
    public final vy.d[] b(vz.a aVar) {
        this.f53325a.set(null);
        return vz.b.f54328a;
    }
}
