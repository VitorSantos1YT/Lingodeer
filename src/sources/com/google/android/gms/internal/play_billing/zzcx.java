package com.google.android.gms.internal.play_billing;

import defpackage.e;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcx implements zzcz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzcy f12325b = new zzcy(zzcx.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12326a;

    public zzcx(Object obj) {
        this.f12326a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f12326a;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final void h0(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            f12325b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", e.n("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e8);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return p.r(super.toString(), "[status=SUCCESS, result=[", this.f12326a.toString(), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f12326a;
    }
}
