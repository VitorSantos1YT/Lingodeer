package app.rive.runtime.kotlin.core;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface RefCount {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DefaultImpls {
        public static int acquire(RefCount refCount) {
            return refCount.getRefs().incrementAndGet();
        }

        public static int getRefCount(RefCount refCount) {
            return refCount.getRefs().get();
        }

        public static int release(RefCount refCount) {
            return refCount.getRefs().decrementAndGet();
        }
    }

    int acquire();

    int getRefCount();

    AtomicInteger getRefs();

    int release();

    void setRefs(AtomicInteger atomicInteger);
}
