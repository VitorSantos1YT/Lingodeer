package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import pt.ImS.aYZzTH;
import su.Mbl.tcppUUQxZjFdy;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractFuture<V> extends InternalFutureFailureAccess implements ListenableFuture<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f17572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LazyLogger f17573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicHelper f17574f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f17575t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f17576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Listener f17577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Waiter f17578c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        public abstract boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2);

        public abstract boolean b(AbstractFuture abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2);

        public abstract Listener d(AbstractFuture abstractFuture, Listener listener);

        public abstract Waiter e(AbstractFuture abstractFuture);

        public abstract void f(Waiter waiter, Waiter waiter2);

        public abstract void g(Waiter waiter, Thread thread);

        public /* synthetic */ AtomicHelper(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Cancellation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Cancellation f17579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Cancellation f17580d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f17581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f17582b;

        static {
            if (AbstractFuture.f17572d) {
                f17580d = null;
                f17579c = null;
            } else {
                f17580d = new Cancellation(null, false);
                f17579c = new Cancellation(null, true);
            }
        }

        public Cancellation(Throwable th2, boolean z11) {
            this.f17581a = z11;
            this.f17582b = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Failure {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Failure f17583b = new Failure(new AnonymousClass1("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f17584a;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$Failure$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public Failure(Throwable th2) {
            th2.getClass();
            this.f17584a = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SafeAtomicHelper extends AtomicHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f17589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f17590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f17591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f17592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f17593e;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(0);
            this.f17589a = atomicReferenceFieldUpdater;
            this.f17590b = atomicReferenceFieldUpdater2;
            this.f17591c = atomicReferenceFieldUpdater3;
            this.f17592d = atomicReferenceFieldUpdater4;
            this.f17593e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f17592d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, listener, listener2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == listener);
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f17593e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == obj);
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f17591c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, waiter, waiter2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == waiter);
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Listener d(AbstractFuture abstractFuture, Listener listener) {
            return (Listener) this.f17592d.getAndSet(abstractFuture, listener);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Waiter e(AbstractFuture abstractFuture) {
            return (Waiter) this.f17591c.getAndSet(abstractFuture, Waiter.f17602c);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void f(Waiter waiter, Waiter waiter2) {
            this.f17590b.lazySet(waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void g(Waiter waiter, Thread thread) {
            this.f17589a.lazySet(waiter, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SetFuture<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractFuture f17594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ListenableFuture f17595b;

        public SetFuture(AbstractFuture abstractFuture, ListenableFuture listenableFuture) {
            this.f17594a = abstractFuture;
            this.f17595b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f17594a.f17576a != this) {
                return;
            }
            if (AbstractFuture.f17574f.b(this.f17594a, this, AbstractFuture.h(this.f17595b))) {
                AbstractFuture.e(this.f17594a, false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedHelper extends AtomicHelper {
        private SynchronizedHelper() {
            super(0);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f17577b != listener) {
                        return false;
                    }
                    abstractFuture.f17577b = listener2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f17576a != obj) {
                        return false;
                    }
                    abstractFuture.f17576a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f17578c != waiter) {
                        return false;
                    }
                    abstractFuture.f17578c = waiter2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Listener d(AbstractFuture abstractFuture, Listener listener) {
            Listener listener2;
            synchronized (abstractFuture) {
                try {
                    listener2 = abstractFuture.f17577b;
                    if (listener2 != listener) {
                        abstractFuture.f17577b = listener;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return listener2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Waiter e(AbstractFuture abstractFuture) {
            Waiter waiter;
            Waiter waiter2 = Waiter.f17602c;
            synchronized (abstractFuture) {
                try {
                    waiter = abstractFuture.f17578c;
                    if (waiter != waiter2) {
                        abstractFuture.f17578c = waiter2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return waiter;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void f(Waiter waiter, Waiter waiter2) {
            waiter.f17604b = waiter2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void g(Waiter waiter, Thread thread) {
            waiter.f17603a = thread;
        }

        public /* synthetic */ SynchronizedHelper(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Trusted<V> extends ListenableFuture<V> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class TrustedFuture<V> extends AbstractFuture<V> implements Trusted<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f17576a instanceof Cancellation;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class UnsafeAtomicHelper extends AtomicHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsafe f17596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f17597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f17598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f17599d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f17600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f17601f;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e8) {
                    throw new RuntimeException("Could not initialize intrinsics", e8.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.1
                    public static Unsafe a() throws IllegalAccessException {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }

                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() {
                        return a();
                    }
                });
            }
            try {
                f17598c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("c"));
                f17597b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("b"));
                f17599d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("a"));
                f17600e = unsafe.objectFieldOffset(Waiter.class.getDeclaredField("a"));
                f17601f = unsafe.objectFieldOffset(Waiter.class.getDeclaredField("b"));
                f17596a = unsafe;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            }
        }

        private UnsafeAtomicHelper() {
            super(0);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            return a.a(f17596a, abstractFuture, f17597b, listener, listener2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return a.a(f17596a, abstractFuture, f17599d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            return a.a(f17596a, abstractFuture, f17598c, waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Listener d(AbstractFuture abstractFuture, Listener listener) {
            Listener listener2;
            do {
                listener2 = abstractFuture.f17577b;
                if (listener == listener2) {
                    break;
                }
            } while (!a(abstractFuture, listener2, listener));
            return listener2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Waiter e(AbstractFuture abstractFuture) {
            Waiter waiter;
            Waiter waiter2 = Waiter.f17602c;
            do {
                waiter = abstractFuture.f17578c;
                if (waiter2 == waiter) {
                    break;
                }
            } while (!c(abstractFuture, waiter, waiter2));
            return waiter;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void f(Waiter waiter, Waiter waiter2) {
            f17596a.putObject(waiter, f17601f, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void g(Waiter waiter, Thread thread) {
            f17596a.putObject(waiter, f17600e, thread);
        }

        public /* synthetic */ UnsafeAtomicHelper(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Waiter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Waiter f17602c = new Waiter();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f17603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile Waiter f17604b;

        public Waiter() {
            AbstractFuture.f17574f.g(this, Thread.currentThread());
        }
    }

    public static void e(AbstractFuture abstractFuture, boolean z11) {
        Listener listener = null;
        while (true) {
            for (Waiter waiterE = f17574f.e(abstractFuture); waiterE != null; waiterE = waiterE.f17604b) {
                Thread thread = waiterE.f17603a;
                if (thread != null) {
                    waiterE.f17603a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z11) {
                abstractFuture.i();
                z11 = false;
            }
            abstractFuture.c();
            Listener listener2 = listener;
            Listener listenerD = f17574f.d(abstractFuture, Listener.f17585d);
            Listener listener3 = listener2;
            while (listenerD != null) {
                Listener listener4 = listenerD.f17588c;
                listenerD.f17588c = listener3;
                listener3 = listenerD;
                listenerD = listener4;
            }
            while (listener3 != null) {
                listener = listener3.f17588c;
                Runnable runnable = listener3.f17586a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof SetFuture) {
                    SetFuture setFuture = (SetFuture) runnable;
                    abstractFuture = setFuture.f17594a;
                    if (abstractFuture.f17576a == setFuture) {
                        if (f17574f.b(abstractFuture, setFuture, h(setFuture.f17595b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = listener3.f17587b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                listener3 = listener;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            f17573e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            Throwable th2 = ((Cancellation) obj).f17582b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f17584a);
        }
        if (obj == f17575t) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thA;
        if (listenableFuture instanceof Trusted) {
            Object cancellation = ((AbstractFuture) listenableFuture).f17576a;
            if (cancellation instanceof Cancellation) {
                Cancellation cancellation2 = (Cancellation) cancellation;
                if (cancellation2.f17581a) {
                    cancellation = cancellation2.f17582b != null ? new Cancellation(cancellation2.f17582b, false) : Cancellation.f17580d;
                }
            }
            Objects.requireNonNull(cancellation);
            return cancellation;
        }
        if ((listenableFuture instanceof InternalFutureFailureAccess) && (thA = ((InternalFutureFailureAccess) listenableFuture).a()) != null) {
            return new Failure(thA);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z11 = true;
        if ((!f17572d) && zIsCancelled) {
            Cancellation cancellation3 = Cancellation.f17580d;
            Objects.requireNonNull(cancellation3);
            return cancellation3;
        }
        boolean z12 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = listenableFuture.get();
                        break;
                    } catch (Error e8) {
                        e = e8;
                        return new Failure(e);
                    }
                } catch (InterruptedException unused) {
                    z12 = z11;
                } catch (Throwable th2) {
                    if (z12) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e10) {
                e = e10;
                return new Failure(e);
            } catch (CancellationException e11) {
                if (zIsCancelled) {
                    return new Cancellation(e11, false);
                }
                return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e11));
            } catch (ExecutionException e12) {
                if (!zIsCancelled) {
                    return new Failure(e12.getCause());
                }
                return new Cancellation(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e12), false);
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? f17575t : obj;
        }
        return new Cancellation(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture), false);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void N(Runnable runnable, Executor executor) {
        Listener listener;
        Preconditions.k(executor, "Executor was null.");
        if (!isDone() && (listener = this.f17577b) != Listener.f17585d) {
            Listener listener2 = new Listener(runnable, executor);
            do {
                listener2.f17588c = listener;
                if (f17574f.a(this, listener, listener2)) {
                    return;
                } else {
                    listener = this.f17577b;
                }
            } while (listener != Listener.f17585d);
        }
        f(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    public final Throwable a() {
        if (!(this instanceof Trusted)) {
            return null;
        }
        Object obj = this.f17576a;
        if (obj instanceof Failure) {
            return ((Failure) obj).f17584a;
        }
        return null;
    }

    public final void b(StringBuilder sb2) {
        V v11;
        boolean z11 = false;
        while (true) {
            try {
                try {
                    v11 = get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                } catch (Throwable th2) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (ExecutionException e8) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e8.getCause());
                sb2.append("]");
                return;
            } catch (Exception e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        d(sb2, v11);
        sb2.append("]");
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        Cancellation cancellation;
        Object obj = this.f17576a;
        if (!(obj == null) && !(obj instanceof SetFuture)) {
            return false;
        }
        if (f17572d) {
            cancellation = new Cancellation(new CancellationException("Future.cancel() was called."), z11);
        } else {
            cancellation = z11 ? Cancellation.f17579c : Cancellation.f17580d;
            Objects.requireNonNull(cancellation);
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z12 = false;
        while (true) {
            if (f17574f.b(abstractFuture, obj, cancellation)) {
                e(abstractFuture, z11);
                if (obj instanceof SetFuture) {
                    ListenableFuture listenableFuture = ((SetFuture) obj).f17595b;
                    if (listenableFuture instanceof Trusted) {
                        abstractFuture = (AbstractFuture) listenableFuture;
                        obj = abstractFuture.f17576a;
                        if ((obj == null) | (obj instanceof SetFuture)) {
                            z12 = true;
                        }
                    } else {
                        listenableFuture.cancel(z11);
                    }
                }
                return true;
            }
            obj = abstractFuture.f17576a;
            if (!(obj instanceof SetFuture)) {
                return z12;
            }
        }
    }

    public final void d(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j11, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z11;
        long j12;
        Waiter waiter = Waiter.f17602c;
        long nanos = timeUnit.toNanos(j11);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f17576a;
        if ((obj != null) && (!(obj instanceof SetFuture))) {
            return g(obj);
        }
        long j13 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            Waiter waiter2 = this.f17578c;
            if (waiter2 != waiter) {
                Waiter waiter3 = new Waiter();
                z11 = true;
                while (true) {
                    AtomicHelper atomicHelper = f17574f;
                    atomicHelper.f(waiter3, waiter2);
                    if (atomicHelper.c(this, waiter2, waiter3)) {
                        j12 = j13;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                l(waiter3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f17576a;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        l(waiter3);
                        break;
                    }
                    long j14 = j13;
                    waiter2 = this.f17578c;
                    if (waiter2 != waiter) {
                        j13 = j14;
                    }
                }
            }
            Object obj3 = this.f17576a;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        z11 = true;
        j12 = 0;
        while (nanos > j12) {
            Object obj4 = this.f17576a;
            if ((obj4 != null ? z11 : false) && (!(obj4 instanceof SetFuture))) {
                return g(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbJ = w4.c.j(j11, "Waited ", " ");
        sbJ.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbJ.toString();
        if (nanos + 1000 < j12) {
            String strM = defpackage.e.m(string3, " (plus ");
            long j15 = -nanos;
            long jConvert = timeUnit.convert(j15, TimeUnit.NANOSECONDS);
            long nanos2 = j15 - timeUnit.toNanos(jConvert);
            boolean z12 = (jConvert == j12 || nanos2 > 1000) ? z11 : false;
            if (jConvert > j12) {
                String strM2 = strM + jConvert + " " + lowerCase;
                if (z12) {
                    strM2 = defpackage.e.m(strM2, ",");
                }
                strM = defpackage.e.m(strM2, " ");
            }
            if (z12) {
                strM = strM + nanos2 + " nanoseconds ";
            }
            string3 = defpackage.e.m(strM, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(defpackage.e.m(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(ep.a.D(string3, " for ", string));
    }

    public void i() {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f17576a instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f17576a;
        return (!(obj instanceof SetFuture)) & (obj != null);
    }

    public final void j(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(p());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String k() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void l(Waiter waiter) {
        waiter.f17603a = null;
        while (true) {
            Waiter waiter2 = this.f17578c;
            if (waiter2 == Waiter.f17602c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.f17604b;
                if (waiter2.f17603a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.f17604b = waiter4;
                    if (waiter3.f17603a == null) {
                    }
                } else if (!f17574f.c(this, waiter2, waiter4)) {
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    public boolean m(Object obj) {
        if (obj == null) {
            obj = f17575t;
        }
        if (!f17574f.b(this, null, obj)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean n(Throwable th2) {
        th2.getClass();
        if (!f17574f.b(this, null, new Failure(th2))) {
            return false;
        }
        e(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean o(ListenableFuture listenableFuture) {
        Failure failure;
        listenableFuture.getClass();
        Object obj = this.f17576a;
        if (obj != null) {
            if (obj instanceof Cancellation) {
                listenableFuture.cancel(((Cancellation) obj).f17581a);
            }
        } else if (listenableFuture.isDone()) {
            if (f17574f.b(this, null, h(listenableFuture))) {
                e(this, false);
                return true;
            }
        } else {
            SetFuture setFuture = new SetFuture(this, listenableFuture);
            if (f17574f.b(this, null, setFuture)) {
                try {
                    listenableFuture.N(setFuture, DirectExecutor.INSTANCE);
                    return true;
                } catch (Throwable th2) {
                    try {
                        failure = new Failure(th2);
                    } catch (Error | Exception unused) {
                        failure = Failure.f17583b;
                    }
                    f17574f.b(this, setFuture, failure);
                    return true;
                }
            }
            obj = this.f17576a;
            if (obj instanceof Cancellation) {
                listenableFuture.cancel(((Cancellation) obj).f17581a);
            }
        }
        return false;
    }

    public final boolean p() {
        Object obj = this.f17576a;
        return (obj instanceof Cancellation) && ((Cancellation) obj).f17581a;
    }

    static {
        boolean z11;
        Throwable th2;
        AtomicHelper synchronizedHelper;
        int i11 = 0;
        try {
            z11 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z11 = false;
        }
        f17572d = z11;
        f17573e = new LazyLogger(AbstractFuture.class);
        Throwable th3 = null;
        try {
            synchronizedHelper = new UnsafeAtomicHelper(i11);
            th2 = null;
        } catch (Error | Exception e8) {
            th2 = e8;
            try {
                synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "a"));
            } catch (Error | Exception e10) {
                th3 = e10;
                synchronizedHelper = new SynchronizedHelper(i11);
            }
        }
        f17574f = synchronizedHelper;
        if (th3 != null) {
            LazyLogger lazyLogger = f17573e;
            Logger loggerA = lazyLogger.a();
            Level level = Level.SEVERE;
            loggerA.log(level, aYZzTH.QLttwghnnm, th2);
            lazyLogger.a().log(level, "SafeAtomicHelper is broken!", th3);
        }
        f17575t = new Object();
    }

    public String toString() {
        String strA;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        boolean zIsCancelled = isCancelled();
        String str = tcppUUQxZjFdy.WUiiRBMeJgQEfw;
        if (zIsCancelled) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f17576a;
            if (obj instanceof SetFuture) {
                sb2.append(", setFuture=[");
                ListenableFuture listenableFuture = ((SetFuture) obj).f17595b;
                try {
                    if (listenableFuture == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(listenableFuture);
                    }
                } catch (Exception e8) {
                    e = e8;
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e.getClass());
                } catch (StackOverflowError e10) {
                    e = e10;
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e.getClass());
                }
                sb2.append(str);
            } else {
                try {
                    strA = Strings.a(k());
                } catch (Exception | StackOverflowError e11) {
                    strA = "Exception thrown from implementation: " + e11.getClass();
                }
                if (strA != null) {
                    defpackage.e.C(sb2, ", info=[", strA, str);
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                b(sb2);
            }
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Listener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Listener f17585d = new Listener();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f17586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f17587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Listener f17588c;

        public Listener(Runnable runnable, Executor executor) {
            this.f17586a = runnable;
            this.f17587b = executor;
        }

        public Listener() {
            this.f17586a = null;
            this.f17587b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        Waiter waiter = Waiter.f17602c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f17576a;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return g(obj2);
            }
            Waiter waiter2 = this.f17578c;
            if (waiter2 != waiter) {
                Waiter waiter3 = new Waiter();
                do {
                    AtomicHelper atomicHelper = f17574f;
                    atomicHelper.f(waiter3, waiter2);
                    if (atomicHelper.c(this, waiter2, waiter3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f17576a;
                            } else {
                                l(waiter3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return g(obj);
                    }
                    waiter2 = this.f17578c;
                } while (waiter2 != waiter);
            }
            Object obj3 = this.f17576a;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
