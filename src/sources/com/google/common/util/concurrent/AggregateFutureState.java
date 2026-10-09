package com.google.common.util.concurrent;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AggregateFutureState<OutputT> extends AbstractFuture.TrustedFuture<OutputT> {
    public static final AtomicHelper L;
    public static final LazyLogger M = new LazyLogger(AggregateFutureState.class);
    public volatile Set H;
    public volatile int K;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        public abstract void a(AggregateFuture aggregateFuture, Set set);

        public abstract int b(AggregateFuture aggregateFuture);

        public /* synthetic */ AtomicHelper(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SafeAtomicHelper extends AtomicHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f17613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicIntegerFieldUpdater f17614b;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super(0);
            this.f17613a = atomicReferenceFieldUpdater;
            this.f17614b = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        public final void a(AggregateFuture aggregateFuture, Set set) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f17613a;
                if (atomicReferenceFieldUpdater.compareAndSet(aggregateFuture, null, set)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(aggregateFuture) == null);
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        public final int b(AggregateFuture aggregateFuture) {
            return this.f17614b.decrementAndGet(aggregateFuture);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedAtomicHelper extends AtomicHelper {
        private SynchronizedAtomicHelper() {
            super(0);
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        public final void a(AggregateFuture aggregateFuture, Set set) {
            synchronized (aggregateFuture) {
                try {
                    if (aggregateFuture.H == null) {
                        aggregateFuture.H = set;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        public final int b(AggregateFuture aggregateFuture) {
            int i11;
            synchronized (aggregateFuture) {
                i11 = aggregateFuture.K - 1;
                aggregateFuture.K = i11;
            }
            return i11;
        }

        public /* synthetic */ SynchronizedAtomicHelper(int i11) {
            this();
        }
    }

    static {
        Throwable th2;
        AtomicHelper synchronizedAtomicHelper;
        try {
            synchronizedAtomicHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(AggregateFutureState.class, Set.class, "H"), AtomicIntegerFieldUpdater.newUpdater(AggregateFutureState.class, "K"));
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            synchronizedAtomicHelper = new SynchronizedAtomicHelper(0);
        }
        L = synchronizedAtomicHelper;
        if (th2 != null) {
            M.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }
}
