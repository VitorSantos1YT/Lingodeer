package com.google.common.util.concurrent;

import java.lang.ref.WeakReference;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class Striped<L> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class CompactStriped<L> extends PowerOfTwoStriped<L> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class PaddedLock extends ReentrantLock {
        public PaddedLock() {
            super(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class PaddedSemaphore extends Semaphore {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class PowerOfTwoStriped<L> extends Striped<L> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class ArrayReference<L> extends WeakReference<L> {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WeakSafeCondition extends ForwardingCondition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Condition f17681a;

        public WeakSafeCondition(Condition condition) {
            this.f17681a = condition;
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        public final Condition a() {
            return this.f17681a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WeakSafeLock extends ForwardingLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lock f17682a;

        public WeakSafeLock(Lock lock, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.f17682a = lock;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        public final Lock a() {
            return this.f17682a;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public final Condition newCondition() {
            return new WeakSafeCondition(this.f17682a.newCondition());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WeakSafeReadWriteLock implements ReadWriteLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReentrantReadWriteLock f17683a = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public final Lock readLock() {
            return new WeakSafeLock(this.f17683a.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public final Lock writeLock() {
            return new WeakSafeLock(this.f17683a.writeLock(), this);
        }
    }

    private Striped() {
    }
}
