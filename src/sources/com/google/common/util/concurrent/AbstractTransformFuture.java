package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractTransformFuture<I, O, F, T> extends FluentFuture.TrustedFuture<O> implements Runnable {
    public static final /* synthetic */ int L = 0;
    public ListenableFuture H;
    public Object K;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AsyncTransformFuture<I, O> extends AbstractTransformFuture<I, O, AsyncFunction<? super I, ? extends O>, ListenableFuture<? extends O>> {
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final Object r(Object obj, Object obj2) {
            AsyncFunction asyncFunction = (AsyncFunction) obj;
            ListenableFuture listenableFutureApply = asyncFunction.apply(obj2);
            Preconditions.j(listenableFutureApply, asyncFunction, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
            return listenableFutureApply;
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final void s(Object obj) {
            o((ListenableFuture) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class TransformFuture<I, O> extends AbstractTransformFuture<I, O, Function<? super I, ? extends O>, O> {
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final Object r(Object obj, Object obj2) {
            return ((Function) obj).apply(obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final void s(Object obj) {
            m(obj);
        }
    }

    public AbstractTransformFuture(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.H = listenableFuture;
        obj.getClass();
        this.K = obj;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void c() {
        j(this.H);
        this.H = null;
        this.K = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String k() {
        String str;
        ListenableFuture listenableFuture = this.H;
        Object obj = this.K;
        String strK = super.k();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        if (obj == null) {
            if (strK != null) {
                return defpackage.e.m(str, strK);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    public abstract Object r(Object obj, Object obj2);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.H;
        Object obj = this.K;
        if (((this.f17576a instanceof AbstractFuture.Cancellation) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.H = null;
        if (listenableFuture.isCancelled()) {
            o(listenableFuture);
            return;
        }
        try {
            try {
                Object objR = r(obj, Futures.d(listenableFuture));
                this.K = null;
                s(objR);
            } catch (Throwable th2) {
                try {
                    Platform.a(th2);
                    n(th2);
                } finally {
                    this.K = null;
                }
            }
        } catch (Error e8) {
            n(e8);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e10) {
            n(e10.getCause());
        } catch (Exception e11) {
            n(e11);
        }
    }

    public abstract void s(Object obj);
}
