package com.google.firebase.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f18176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f18177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f18178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18179e;

    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j11, TimeUnit timeUnit, int i11) {
        this.f18175a = i11;
        this.f18176b = delegatingScheduledExecutorService;
        this.f18179e = obj;
        this.f18177c = j11;
        this.f18178d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture a(final DelegatingScheduledFuture.AnonymousClass1 anonymousClass1) {
        switch (this.f18175a) {
            case 0:
                Runnable runnable = (Runnable) this.f18179e;
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f18176b;
                return delegatingScheduledExecutorService.f18157b.schedule(new e(delegatingScheduledExecutorService, runnable, anonymousClass1, 1), this.f18177c, this.f18178d);
            default:
                final Callable callable = (Callable) this.f18179e;
                final DelegatingScheduledExecutorService delegatingScheduledExecutorService2 = this.f18176b;
                return delegatingScheduledExecutorService2.f18157b.schedule(new Callable() { // from class: com.google.firebase.concurrent.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return delegatingScheduledExecutorService2.f18156a.submit(new a(1, callable, anonymousClass1));
                    }
                }, this.f18177c, this.f18178d);
        }
    }
}
