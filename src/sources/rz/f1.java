package rz;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends i1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f50899f = AtomicIntegerFieldUpdater.newUpdater(f1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fz.c f50900e;

    public f1(fz.c cVar) {
        this.f50900e = cVar;
    }

    @Override // rz.i1
    public final boolean i() {
        return true;
    }

    @Override // rz.i1
    public final void j(Throwable th2) {
        if (f50899f.compareAndSet(this, 0, 1)) {
            this.f50900e.invoke(th2);
        }
    }
}
