package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzvg f12069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f12070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f12071c = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f12072d = new AtomicReference(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f12073e = MoreExecutors.c(MoreExecutors.a());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SettableFuture f12074f;

    public zzvm(AsyncCallable asyncCallable, Executor executor) {
        long j11 = Integer.MIN_VALUE;
        this.f12070b = new AtomicLong((j11 & 4294967295L) | (j11 << 32));
        SettableFuture settableFutureQ = SettableFuture.q();
        this.f12074f = settableFutureQ;
        zzvg zzvgVar = new zzvg();
        zzvgVar.f12060a = asyncCallable;
        executor.getClass();
        zzvgVar.f12061b = executor;
        this.f12069a = zzvgVar;
        settableFutureQ.N(zzvgVar, MoreExecutors.a());
    }

    public final AbstractFuture a() {
        AtomicLong atomicLong;
        long j11;
        final int i11;
        ListenableFuture listenableFutureC;
        SettableFuture settableFuture = this.f12074f;
        if (settableFuture.isDone()) {
            return settableFuture;
        }
        do {
            atomicLong = this.f12070b;
            j11 = atomicLong.get();
            i11 = (int) (j11 >>> 32);
        } while (!atomicLong.compareAndSet(j11, (((long) (((int) j11) + 1)) & 4294967295L) | (((long) i11) << 32)));
        final SettableFuture settableFutureQ = SettableFuture.q();
        ListenableFuture listenableFuture = (ListenableFuture) this.f12072d.getAndSet(settableFutureQ);
        if (listenableFuture == null) {
            listenableFutureC = Futures.k(zzxa.a(new AsyncCallable() { // from class: com.google.android.gms.internal.measurement.zzvi
                @Override // com.google.common.util.concurrent.AsyncCallable
                public final /* synthetic */ ListenableFuture call() {
                    return this.f12064a.b(i11);
                }
            }), MoreExecutors.a());
        } else {
            AsyncFunction asyncFunction = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzvh
                @Override // com.google.common.util.concurrent.AsyncFunction
                public final /* synthetic */ ListenableFuture apply(Object obj) {
                    return this.f12062a.b(i11);
                }
            };
            int i12 = zzxa.f12143a;
            listenableFutureC = Futures.c(listenableFuture, Throwable.class, new zzwy(zzvy.a(), asyncFunction), this.f12073e);
        }
        settableFutureQ.o(listenableFutureC);
        final zzvk zzvkVar = new zzvk(this, i11);
        settableFutureQ.N(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzvj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                SettableFuture settableFuture2 = settableFutureQ;
                zzvk zzvkVar2 = zzvkVar;
                try {
                    Object objD = Futures.d(settableFuture2);
                    SettableFuture settableFuture3 = this.f12066a.f12074f;
                    settableFuture3.m(objD);
                    zzvkVar2.o(settableFuture3);
                } catch (Throwable unused) {
                    zzvkVar2.o(settableFuture2);
                }
            }
        }, MoreExecutors.a());
        return zzvkVar;
    }

    public final AbstractFuture b(int i11) {
        Executor executor;
        AtomicLong atomicLong = this.f12070b;
        if (((int) (atomicLong.get() >>> 32)) > i11) {
            return (AbstractFuture) Futures.e();
        }
        zzvl zzvlVar = new zzvl(i11);
        while (true) {
            AtomicReference atomicReference = this.f12071c;
            zzvl zzvlVar2 = (zzvl) atomicReference.get();
            if (zzvlVar2 != null && zzvlVar2.H > i11) {
                return (AbstractFuture) Futures.e();
            }
            do {
                if (atomicReference.compareAndSet(zzvlVar2, zzvlVar)) {
                    if (((int) (atomicLong.get() >>> 32)) > i11) {
                        zzvlVar.cancel(true);
                        while (!atomicReference.compareAndSet(zzvlVar, null) && atomicReference.get() == zzvlVar) {
                        }
                        return zzvlVar;
                    }
                    zzvg zzvgVar = this.f12069a;
                    AsyncCallable asyncCallable = zzvgVar.f12060a;
                    if (asyncCallable == null || (executor = zzvgVar.f12061b) == null) {
                        zzvlVar.o(this.f12074f);
                        return zzvlVar;
                    }
                    zzvlVar.o(Futures.k(zzxa.a(asyncCallable), executor));
                    return zzvlVar;
                }
            } while (atomicReference.get() == zzvlVar2);
        }
    }
}
