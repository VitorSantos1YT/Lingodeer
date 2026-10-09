package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingQueue;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingQueue<E> extends ForwardingQueue<E> implements BlockingQueue<E> {
    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection collection, int i11) {
        return j0().drainTo(collection, i11);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final boolean offer(Object obj, long j11, TimeUnit timeUnit) {
        return j0().offer(obj, j11, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final Object poll(long j11, TimeUnit timeUnit) {
        return j0().poll(j11, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final void put(Object obj) throws InterruptedException {
        j0().put(obj);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int remainingCapacity() {
        return j0().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final Object take() {
        return j0().take();
    }

    @Override // com.google.common.collect.ForwardingQueue
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BlockingQueue o0();

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection collection) {
        return j0().drainTo(collection);
    }
}
