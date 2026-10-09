package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f18351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18353c;

    public /* synthetic */ c(CrashlyticsCore crashlyticsCore, long j11, String str) {
        this.f18351a = crashlyticsCore;
        this.f18352b = j11;
        this.f18353c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        final CrashlyticsCore crashlyticsCore = this.f18351a;
        CrashlyticsWorker crashlyticsWorker = crashlyticsCore.f18301o.f18377b;
        final long j11 = this.f18352b;
        final String str = this.f18353c;
        return crashlyticsWorker.a(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.d
            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsController crashlyticsController = crashlyticsCore.f18294g;
                CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = crashlyticsController.f18272n;
                if (crashlyticsUncaughtExceptionHandler == null || !crashlyticsUncaughtExceptionHandler.f18316e.get()) {
                    crashlyticsController.f18268i.c(j11, str);
                }
            }
        });
    }
}
