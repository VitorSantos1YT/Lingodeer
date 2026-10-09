package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BlockingAnalyticsEventLogger implements AnalyticsEventReceiver, AnalyticsEventLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsOriginAnalyticsEventLogger f18225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CountDownLatch f18227c;

    public BlockingAnalyticsEventLogger(CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f18226b = new Object();
        this.f18225a = crashlyticsOriginAnalyticsEventLogger;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public final void b(Bundle bundle) {
        synchronized (this.f18226b) {
            Objects.toString(bundle);
            this.f18227c = new CountDownLatch(1);
            this.f18225a.b(bundle);
            try {
                this.f18227c.await(500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
            this.f18227c = null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public final void c(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f18227c;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
