package com.google.firebase.appcheck.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DefaultTokenRefresher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultFirebaseAppCheck f17820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f17821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f17822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile ScheduledFuture f17823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f17824e = -1;

    public DefaultTokenRefresher(DefaultFirebaseAppCheck defaultFirebaseAppCheck, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f17820a = defaultFirebaseAppCheck;
        this.f17821b = executor;
        this.f17822c = scheduledExecutorService;
    }

    public final void a() {
        if (this.f17823d == null || this.f17823d.isDone()) {
            return;
        }
        this.f17823d.cancel(false);
    }

    public final void b(long j11) {
        a();
        this.f17824e = -1L;
        this.f17823d = this.f17822c.schedule(new b2.a(this, 8), Math.max(0L, j11), TimeUnit.MILLISECONDS);
    }
}
