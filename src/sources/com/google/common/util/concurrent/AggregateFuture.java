package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AggregateFuture<InputT, OutputT> extends AggregateFutureState<OutputT> {
    public static final LazyLogger P = new LazyLogger(AggregateFuture.class);
    public ImmutableCollection N;
    public final boolean O;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ReleaseResourcesReason {
        private static final /* synthetic */ ReleaseResourcesReason[] $VALUES;
        public static final ReleaseResourcesReason ALL_INPUT_FUTURES_PROCESSED;
        public static final ReleaseResourcesReason OUTPUT_FUTURE_DONE;

        static {
            ReleaseResourcesReason releaseResourcesReason = new ReleaseResourcesReason("OUTPUT_FUTURE_DONE", 0);
            OUTPUT_FUTURE_DONE = releaseResourcesReason;
            ReleaseResourcesReason releaseResourcesReason2 = new ReleaseResourcesReason("ALL_INPUT_FUTURES_PROCESSED", 1);
            ALL_INPUT_FUTURES_PROCESSED = releaseResourcesReason2;
            $VALUES = new ReleaseResourcesReason[]{releaseResourcesReason, releaseResourcesReason2};
        }

        public static ReleaseResourcesReason valueOf(String str) {
            return (ReleaseResourcesReason) Enum.valueOf(ReleaseResourcesReason.class, str);
        }

        public static ReleaseResourcesReason[] values() {
            return (ReleaseResourcesReason[]) $VALUES.clone();
        }
    }

    public AggregateFuture(ImmutableCollection immutableCollection, boolean z11) {
        int size = immutableCollection.size();
        this.H = null;
        this.K = size;
        this.N = immutableCollection;
        this.O = z11;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void c() {
        ImmutableCollection immutableCollection = this.N;
        v(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean zP = p();
            UnmodifiableIterator it = immutableCollection.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zP);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String k() {
        ImmutableCollection immutableCollection = this.N;
        if (immutableCollection == null) {
            return super.k();
        }
        return "futures=" + immutableCollection;
    }

    public final void q(ImmutableCollection immutableCollection) {
        int iB = AggregateFutureState.L.b(this);
        Preconditions.p("Less than 0 remaining futures", iB >= 0);
        if (iB == 0) {
            if (immutableCollection != null) {
                UnmodifiableIterator it = immutableCollection.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            Uninterruptibles.a(future);
                        } catch (ExecutionException e8) {
                            s(e8.getCause());
                        } catch (Throwable th2) {
                            s(th2);
                        }
                    }
                }
            }
            this.H = null;
            r();
            v(ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    public abstract void r();

    public final void s(Throwable th2) {
        th2.getClass();
        if (this.O && !n(th2)) {
            Set set = this.H;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!isCancelled()) {
                    Throwable thA = a();
                    Objects.requireNonNull(thA);
                    while (thA != null && setNewSetFromMap.add(thA)) {
                        thA = thA.getCause();
                    }
                }
                AggregateFutureState.L.a(this, setNewSetFromMap);
                Set set2 = this.H;
                Objects.requireNonNull(set2);
                set = set2;
            }
            Throwable cause = th2;
            while (true) {
                if (cause == null) {
                    P.a().log(Level.SEVERE, th2 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
                    return;
                } else if (!set.add(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
        }
        boolean z11 = th2 instanceof Error;
        if (z11) {
            P.a().log(Level.SEVERE, z11 ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
        }
    }

    public final void t() {
        Objects.requireNonNull(this.N);
        if (this.N.isEmpty()) {
            r();
            return;
        }
        if (!this.O) {
            final CombinedFuture combinedFuture = (CombinedFuture) this;
            final ImmutableCollection immutableCollection = null;
            Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.c
                @Override // java.lang.Runnable
                public final void run() {
                    LazyLogger lazyLogger = AggregateFuture.P;
                    combinedFuture.q(immutableCollection);
                }
            };
            UnmodifiableIterator it = this.N.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    q(null);
                } else {
                    listenableFuture.N(runnable, DirectExecutor.INSTANCE);
                }
            }
            return;
        }
        UnmodifiableIterator it2 = this.N.iterator();
        final int i11 = 0;
        while (it2.hasNext()) {
            final ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i12 = i11 + 1;
            if (listenableFuture2.isDone()) {
                u(i11, listenableFuture2);
            } else {
                final CombinedFuture combinedFuture2 = (CombinedFuture) this;
                listenableFuture2.N(new Runnable() { // from class: com.google.common.util.concurrent.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        LazyLogger lazyLogger = AggregateFuture.P;
                        combinedFuture2.u(i11, listenableFuture2);
                    }
                }, DirectExecutor.INSTANCE);
            }
            i11 = i12;
        }
    }

    public final void u(int i11, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.N = null;
                cancel(false);
            } else {
                try {
                    Uninterruptibles.a(listenableFuture);
                } catch (ExecutionException e8) {
                    s(e8.getCause());
                } catch (Throwable th2) {
                    s(th2);
                }
            }
            q(null);
        } catch (Throwable th3) {
            q(null);
            throw th3;
        }
    }

    public void v(ReleaseResourcesReason releaseResourcesReason) {
        releaseResourcesReason.getClass();
        this.N = null;
    }
}
