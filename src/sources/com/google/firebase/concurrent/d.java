package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f18184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f18185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f18186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f18187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f18188f;

    public /* synthetic */ d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j11, long j12, TimeUnit timeUnit, int i11) {
        this.f18183a = i11;
        this.f18184b = delegatingScheduledExecutorService;
        this.f18185c = runnable;
        this.f18186d = j11;
        this.f18187e = j12;
        this.f18188f = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture a(DelegatingScheduledFuture.AnonymousClass1 anonymousClass1) {
        switch (this.f18183a) {
            case 0:
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f18184b;
                return delegatingScheduledExecutorService.f18157b.scheduleAtFixedRate(new e(delegatingScheduledExecutorService, this.f18185c, anonymousClass1, 0), this.f18186d, this.f18187e, this.f18188f);
            default:
                DelegatingScheduledExecutorService delegatingScheduledExecutorService2 = this.f18184b;
                return delegatingScheduledExecutorService2.f18157b.scheduleWithFixedDelay(new e(delegatingScheduledExecutorService2, this.f18185c, anonymousClass1, 2), this.f18186d, this.f18187e, this.f18188f);
        }
    }
}
