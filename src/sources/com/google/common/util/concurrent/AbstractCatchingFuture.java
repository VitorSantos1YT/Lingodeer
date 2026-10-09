package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractCatchingFuture<V, X extends Throwable, F, T> extends FluentFuture.TrustedFuture<V> implements Runnable {
    public static final /* synthetic */ int M = 0;
    public ListenableFuture H;
    public Class K;
    public Object L;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AsyncCatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, AsyncFunction<? super X, ? extends V>, ListenableFuture<? extends V>> {
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public final Object r(Object obj, Throwable th2) {
            AsyncFunction asyncFunction = (AsyncFunction) obj;
            ListenableFuture listenableFutureApply = asyncFunction.apply(th2);
            Preconditions.j(listenableFutureApply, asyncFunction, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
            return listenableFutureApply;
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public final void s(Object obj) {
            o((ListenableFuture) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, Function<? super X, ? extends V>, V> {
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public final Object r(Object obj, Throwable th2) {
            return ((Function) obj).apply(th2);
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public final void s(Object obj) {
            m(obj);
        }
    }

    public AbstractCatchingFuture(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.H = listenableFuture;
        this.K = cls;
        obj.getClass();
        this.L = obj;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void c() {
        j(this.H);
        this.H = null;
        this.K = null;
        this.L = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String k() {
        String str;
        ListenableFuture listenableFuture = this.H;
        Class cls = this.K;
        Object obj = this.L;
        String strK = super.k();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        if (cls == null || obj == null) {
            if (strK != null) {
                return defpackage.e.m(str, strK);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    public abstract Object r(Object obj, Throwable th2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objD;
        ListenableFuture listenableFuture = this.H;
        Class cls = this.K;
        Object obj = this.L;
        if (((obj == null) || ((listenableFuture == 0) | (cls == null))) || (this.f17576a instanceof AbstractFuture.Cancellation)) {
            return;
        }
        this.H = null;
        try {
            th = listenableFuture instanceof InternalFutureFailureAccess ? ((InternalFutureFailureAccess) listenableFuture).a() : null;
            objD = th == null ? Futures.d(listenableFuture) : null;
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e8.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        if (th == null) {
            m(objD);
            return;
        }
        if (!cls.isInstance(th)) {
            o(listenableFuture);
            return;
        }
        try {
            Object objR = r(obj, th);
            this.K = null;
            this.L = null;
            s(objR);
        } catch (Throwable th3) {
            try {
                Platform.a(th3);
                n(th3);
            } finally {
                this.K = null;
                this.L = null;
            }
        }
    }

    public abstract void s(Object obj);
}
