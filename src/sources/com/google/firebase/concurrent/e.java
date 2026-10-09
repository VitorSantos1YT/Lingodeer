package com.google.firebase.concurrent;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f18190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f18191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.AnonymousClass1 f18192d;

    public /* synthetic */ e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.AnonymousClass1 anonymousClass1, int i11) {
        this.f18189a = i11;
        this.f18190b = delegatingScheduledExecutorService;
        this.f18191c = runnable;
        this.f18192d = anonymousClass1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18189a) {
            case 0:
                ExecutorService executorService = this.f18190b.f18156a;
                final int i11 = 0;
                final Runnable runnable = this.f18191c;
                final DelegatingScheduledFuture.AnonymousClass1 anonymousClass1 = this.f18192d;
                executorService.execute(new Runnable() { // from class: com.google.firebase.concurrent.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e8) {
                                    anonymousClass1.b(e8);
                                    throw e8;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    anonymousClass1.b(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                DelegatingScheduledFuture.AnonymousClass1 anonymousClass2 = anonymousClass1;
                                try {
                                    runnable2.run();
                                    anonymousClass2.a(null);
                                    return;
                                } catch (Exception e11) {
                                    anonymousClass2.b(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f18190b.f18156a;
                final int i12 = 2;
                final Runnable runnable2 = this.f18191c;
                final DelegatingScheduledFuture.AnonymousClass1 anonymousClass2 = this.f18192d;
                executorService2.execute(new Runnable() { // from class: com.google.firebase.concurrent.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e8) {
                                    anonymousClass2.b(e8);
                                    throw e8;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    anonymousClass2.b(e10);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                DelegatingScheduledFuture.AnonymousClass1 anonymousClass3 = anonymousClass2;
                                try {
                                    runnable3.run();
                                    anonymousClass3.a(null);
                                    return;
                                } catch (Exception e11) {
                                    anonymousClass3.b(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f18190b.f18156a;
                final int i13 = 1;
                final Runnable runnable3 = this.f18191c;
                final DelegatingScheduledFuture.AnonymousClass1 anonymousClass3 = this.f18192d;
                executorService3.execute(new Runnable() { // from class: com.google.firebase.concurrent.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i13) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e8) {
                                    anonymousClass3.b(e8);
                                    throw e8;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    anonymousClass3.b(e10);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                DelegatingScheduledFuture.AnonymousClass1 anonymousClass4 = anonymousClass3;
                                try {
                                    runnable4.run();
                                    anonymousClass4.a(null);
                                    return;
                                } catch (Exception e11) {
                                    anonymousClass4.b(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
