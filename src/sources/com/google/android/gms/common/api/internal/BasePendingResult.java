package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ThreadLocal f8720l = new zaq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CallbackHandler f8722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f8723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ResultCallback f8725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f8726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Result f8727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Status f8728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f8729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8731k;
    private zar resultGuardian;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class CallbackHandler<R extends Result> extends com.google.android.gms.internal.base.zao {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    Log.wtf("BasePendingResult", e.g(i11, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i11).length() + 34)), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).e(Status.H);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            ResultCallback resultCallback = (ResultCallback) pair.first;
            Result result = (Result) pair.second;
            try {
                resultCallback.a(result);
            } catch (RuntimeException e8) {
                BasePendingResult.j(result);
                throw e8;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.f8721a = new Object();
        this.f8723c = new CountDownLatch(1);
        this.f8724d = new ArrayList();
        this.f8726f = new AtomicReference();
        this.f8731k = false;
        this.f8722b = new CallbackHandler(Looper.getMainLooper());
        new WeakReference(null);
    }

    public static void j(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(result));
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final Result b() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Preconditions.i("Result has already been consumed.", !this.f8729i);
        try {
            if (!this.f8723c.await(0L, timeUnit)) {
                e(Status.H);
            }
        } catch (InterruptedException unused) {
            e(Status.f8704f);
        }
        Preconditions.i("Result is not ready.", f());
        return h();
    }

    public final void c(PendingResult.StatusListener statusListener) {
        synchronized (this.f8721a) {
            try {
                if (f()) {
                    statusListener.a(this.f8728h);
                } else {
                    this.f8724d.add(statusListener);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Result d(Status status);

    public final void e(Status status) {
        synchronized (this.f8721a) {
            try {
                if (!f()) {
                    a(d(status));
                    this.f8730j = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean f() {
        return this.f8723c.getCount() == 0;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void a(Result result) {
        synchronized (this.f8721a) {
            try {
                if (this.f8730j) {
                    j(result);
                    return;
                }
                f();
                Preconditions.i("Results have already been set", !f());
                Preconditions.i("Result has already been consumed", !this.f8729i);
                i(result);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Result h() {
        Result result;
        synchronized (this.f8721a) {
            Preconditions.i("Result has already been consumed.", !this.f8729i);
            Preconditions.i("Result is not ready.", f());
            result = this.f8727g;
            this.f8727g = null;
            this.f8725e = null;
            this.f8729i = true;
        }
        if (((zact) this.f8726f.getAndSet(null)) != null) {
            throw null;
        }
        Preconditions.g(result);
        return result;
    }

    public final void i(Result result) {
        this.f8727g = result;
        this.f8728h = result.getStatus();
        this.f8723c.countDown();
        ResultCallback resultCallback = this.f8725e;
        if (resultCallback != null) {
            CallbackHandler callbackHandler = this.f8722b;
            callbackHandler.removeMessages(2);
            callbackHandler.sendMessage(callbackHandler.obtainMessage(1, new Pair(resultCallback, h())));
        } else if (this.f8727g instanceof Releasable) {
            this.resultGuardian = new zar(this);
        }
        ArrayList arrayList = this.f8724d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((PendingResult.StatusListener) arrayList.get(i11)).a(this.f8728h);
        }
        arrayList.clear();
    }

    public BasePendingResult(GoogleApiClient googleApiClient) {
        this.f8721a = new Object();
        this.f8723c = new CountDownLatch(1);
        this.f8724d = new ArrayList();
        this.f8726f = new AtomicReference();
        this.f8731k = false;
        this.f8722b = new CallbackHandler(googleApiClient != null ? googleApiClient.a() : Looper.getMainLooper());
        new WeakReference(googleApiClient);
    }
}
