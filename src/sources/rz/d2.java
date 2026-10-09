package rz;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d2 extends i1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f50877t = AtomicIntegerFieldUpdater.newUpdater(d2.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Thread f50878e = Thread.currentThread();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q0 f50879f;

    public static void l(int i11) {
        throw new IllegalStateException(("Illegal state " + i11).toString());
    }

    @Override // rz.i1
    public final boolean i() {
        return true;
    }

    @Override // rz.i1
    public final void j(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f50877t;
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 == 1 || i11 == 2 || i11 == 3) {
                    return;
                }
                l(i11);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 2));
        this.f50878e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f50877t;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        l(i11);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i11, 1)) {
                q0 q0Var = this.f50879f;
                if (q0Var != null) {
                    q0Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}
