package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AtomicReference<V> {
    private final java.util.concurrent.atomic.AtomicReference<V> base;

    public AtomicReference(V v11) {
        this.base = new java.util.concurrent.atomic.AtomicReference<>(v11);
    }

    public final boolean compareAndSet(V v11, V v12) {
        java.util.concurrent.atomic.AtomicReference<V> atomicReference = this.base;
        while (!atomicReference.compareAndSet(v11, v12)) {
            if (atomicReference.get() != v11) {
                return false;
            }
        }
        return true;
    }

    public final V get() {
        return this.base.get();
    }
}
