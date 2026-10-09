package com.google.common.util.concurrent;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public final class ClosingFuture<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LazyLogger f17617a = new LazyLogger(ClosingFuture.class);

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$10, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass10 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            LazyLogger lazyLogger = ClosingFuture.f17617a;
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 implements AsyncCallable<Object> {
        /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
        
            throw null;
         */
        @Override // com.google.common.util.concurrent.AsyncCallable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.google.common.util.concurrent.ListenableFuture call() {
            /*
                r2 = this;
                com.google.common.util.concurrent.ClosingFuture$CloseableList r0 = new com.google.common.util.concurrent.ClosingFuture$CloseableList
                r1 = 0
                r0.<init>(r1)
                r0 = 0
                throw r0     // Catch: java.lang.Throwable -> L8
            L8:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.ClosingFuture.AnonymousClass2.call():com.google.common.util.concurrent.ListenableFuture");
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass4 implements AsyncFunction<Object, Object> {
        @Override // com.google.common.util.concurrent.AsyncFunction
        public final ListenableFuture apply(Object obj) {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass5 implements AsyncFunction<Object, Object> {
        @Override // com.google.common.util.concurrent.AsyncFunction
        public final ListenableFuture apply(Object obj) {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass6 implements AsyncClosingFunction<Object, Object> {
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass7 implements AsyncFunction<Throwable, Object> {
        @Override // com.google.common.util.concurrent.AsyncFunction
        public final ListenableFuture apply(Object obj) {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$8, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass8 implements AsyncFunction<Throwable, Object> {
        @Override // com.google.common.util.concurrent.AsyncFunction
        public final ListenableFuture apply(Object obj) {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass9 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            LazyLogger lazyLogger = ClosingFuture.f17617a;
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface AsyncClosingCallable<V> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface AsyncClosingFunction<T, U> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CloseableList extends IdentityHashMap<AutoCloseable, Executor> implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f17618a;

        private CloseableList() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f17618a) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f17618a) {
                        return;
                    }
                    this.f17618a = true;
                    for (Map.Entry<AutoCloseable, Executor> entry : entrySet()) {
                        ClosingFuture.a(entry.getKey(), entry.getValue());
                    }
                    clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public /* synthetic */ CloseableList(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ClosingCallable<V> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ClosingFunction<T, U> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @DoNotMock
    public static class Combiner {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 implements Callable<Object> {
            @Override // java.util.concurrent.Callable
            public final Object call() {
                throw null;
            }

            public final String toString() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 implements AsyncCallable<Object> {
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final ListenableFuture call() {
                throw null;
            }

            public final String toString() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public interface AsyncCombiningCallable<V> {
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public interface CombiningCallable<V> {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Combiner2<V1, V2> extends Combiner {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 implements Combiner.CombiningCallable<Object> {
            public final String toString() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner2$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 implements Combiner.AsyncCombiningCallable<Object> {
            public final String toString() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public interface AsyncClosingFunction2<V1, V2, U> {
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public interface ClosingFunction2<V1, V2, U> {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Combiner3<V1, V2, V3> extends Combiner {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner3$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 implements Combiner.CombiningCallable<Object> {
            public final String toString() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner3$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 implements Combiner.AsyncCombiningCallable<Object> {
            public final String toString() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public interface AsyncClosingFunction3<V1, V2, V3, U> {
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public interface ClosingFunction3<V1, V2, V3, U> {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Combiner4<V1, V2, V3, V4> extends Combiner {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner4$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 implements Combiner.CombiningCallable<Object> {
            public final String toString() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner4$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 implements Combiner.AsyncCombiningCallable<Object> {
            public final String toString() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public interface AsyncClosingFunction4<V1, V2, V3, V4, U> {
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public interface ClosingFunction4<V1, V2, V3, V4, U> {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Combiner5<V1, V2, V3, V4, V5> extends Combiner {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner5$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 implements Combiner.CombiningCallable<Object> {
            public final String toString() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner5$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 implements Combiner.AsyncCombiningCallable<Object> {
            public final String toString() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public interface AsyncClosingFunction5<V1, V2, V3, V4, V5, U> {
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public interface ClosingFunction5<V1, V2, V3, V4, V5, U> {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DeferredCloser {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Peeker {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State CLOSED;
        public static final State CLOSING;
        public static final State OPEN;
        public static final State SUBSUMED;
        public static final State WILL_CLOSE;
        public static final State WILL_CREATE_VALUE_AND_CLOSER;

        static {
            State state = new State("OPEN", 0);
            OPEN = state;
            State state2 = new State("SUBSUMED", 1);
            SUBSUMED = state2;
            State state3 = new State("WILL_CLOSE", 2);
            WILL_CLOSE = state3;
            State state4 = new State("CLOSING", 3);
            CLOSING = state4;
            State state5 = new State("CLOSED", 4);
            CLOSED = state5;
            State state6 = new State("WILL_CREATE_VALUE_AND_CLOSER", 5);
            WILL_CREATE_VALUE_AND_CLOSER = state6;
            $VALUES = new State[]{state, state2, state3, state4, state5, state6};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ValueAndCloser<V> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ValueAndCloserConsumer<V> {
    }

    public static void a(final AutoCloseable autoCloseable, Executor executor) {
        if (autoCloseable == null) {
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: com.google.common.util.concurrent.e
                @Override // java.lang.Runnable
                public final void run() {
                    AutoCloseable autoCloseable2 = autoCloseable;
                    LazyLogger lazyLogger = ClosingFuture.f17617a;
                    try {
                        com.google.android.material.datepicker.d.u(autoCloseable2);
                    } catch (Exception e8) {
                        Platform.a(e8);
                        ClosingFuture.f17617a.a().log(Level.WARNING, "thrown by close()", (Throwable) e8);
                    }
                }
            });
        } catch (RejectedExecutionException e8) {
            LazyLogger lazyLogger = f17617a;
            Logger loggerA = lazyLogger.a();
            Level level = Level.WARNING;
            if (loggerA.isLoggable(level)) {
                lazyLogger.a().log(level, String.format("while submitting close to %s; will close inline", executor), (Throwable) e8);
            }
            a(autoCloseable, DirectExecutor.INSTANCE);
        }
    }

    public final void finalize() {
        throw null;
    }

    public final String toString() {
        MoreObjects.b(this);
        throw null;
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 implements FutureCallback<AutoCloseable> {
        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onSuccess(Object obj) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void a(Throwable th2) {
        }
    }
}
