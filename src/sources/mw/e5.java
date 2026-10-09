package mw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e5 extends j5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f42417c;

    public e5(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f42417c = atomicIntegerFieldUpdater;
    }

    @Override // mw.j5
    public final boolean m(g5 g5Var) {
        return this.f42417c.compareAndSet(g5Var, 0, -1);
    }

    @Override // mw.j5
    public final void o(g5 g5Var) {
        this.f42417c.set(g5Var, 0);
    }
}
