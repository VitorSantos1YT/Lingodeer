package com.google.common.util.concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class ForwardingCondition implements Condition {
    public abstract Condition a();

    @Override // java.util.concurrent.locks.Condition
    public final void await() throws InterruptedException {
        a().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public final long awaitNanos(long j11) {
        return a().awaitNanos(j11);
    }

    @Override // java.util.concurrent.locks.Condition
    public final void awaitUninterruptibly() {
        a().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public final boolean awaitUntil(Date date) {
        return a().awaitUntil(date);
    }

    @Override // java.util.concurrent.locks.Condition
    public final void signal() {
        a().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public final void signalAll() {
        a().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public final boolean await(long j11, TimeUnit timeUnit) {
        return a().await(j11, timeUnit);
    }
}
