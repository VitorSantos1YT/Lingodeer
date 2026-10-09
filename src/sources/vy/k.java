package vy;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements d, xy.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f54322b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f54323a;
    private volatile Object result;

    public k(d dVar, wy.a aVar) {
        this.f54323a = dVar;
        this.result = aVar;
    }

    @Override // xy.d
    public final xy.d getCallerFrame() {
        d dVar = this.f54323a;
        if (dVar instanceof xy.d) {
            return (xy.d) dVar;
        }
        return null;
    }

    @Override // vy.d
    public final i getContext() {
        return this.f54323a.getContext();
    }

    @Override // vy.d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            wy.a aVar = wy.a.UNDECIDED;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54322b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    }
                }
                return;
            }
            wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f54322b;
            wy.a aVar3 = wy.a.RESUMED;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    this.f54323a.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == aVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f54323a;
    }
}
