package com.google.firebase.crashlytics.internal.send;

import android.os.SystemClock;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.ForcedSender;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class ReportQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f18893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f18894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f18898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f18899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Transport f18900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final OnDemandCounter f18901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18903k;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ReportRunnable implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CrashlyticsReportWithSessionId f18904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TaskCompletionSource f18905b;

        public ReportRunnable(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource) {
            this.f18904a = crashlyticsReportWithSessionId;
            this.f18905b = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = this.f18904a;
            TaskCompletionSource taskCompletionSource = this.f18905b;
            ReportQueue reportQueue = ReportQueue.this;
            reportQueue.b(crashlyticsReportWithSessionId, taskCompletionSource);
            reportQueue.f18901i.f18340b.set(0);
            double dMin = Math.min(3600000.0d, Math.pow(reportQueue.f18894b, reportQueue.a()) * (60000.0d / reportQueue.f18893a));
            String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d));
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public ReportQueue(Transport transport, Settings settings, OnDemandCounter onDemandCounter) {
        double d5 = settings.f18918d;
        double d11 = settings.f18919e;
        long j11 = ((long) settings.f18920f) * 1000;
        this.f18893a = d5;
        this.f18894b = d11;
        this.f18895c = j11;
        this.f18900h = transport;
        this.f18901i = onDemandCounter;
        this.f18896d = SystemClock.elapsedRealtime();
        int i11 = (int) d5;
        this.f18897e = i11;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i11);
        this.f18898f = arrayBlockingQueue;
        this.f18899g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f18902j = 0;
        this.f18903k = 0L;
    }

    public final int a() {
        if (this.f18903k == 0) {
            this.f18903k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f18903k) / this.f18895c);
        int iMin = this.f18898f.size() == this.f18897e ? Math.min(100, this.f18902j + iCurrentTimeMillis) : Math.max(0, this.f18902j - iCurrentTimeMillis);
        if (this.f18902j != iMin) {
            this.f18902j = iMin;
            this.f18903k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final TaskCompletionSource taskCompletionSource) {
        final boolean z11 = SystemClock.elapsedRealtime() - this.f18896d < 2000;
        this.f18900h.b(Event.h(crashlyticsReportWithSessionId.a()), new TransportScheduleCallback() { // from class: com.google.firebase.crashlytics.internal.send.a
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void i(Exception exc) throws Throwable {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z11) {
                    boolean z12 = true;
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    final ReportQueue reportQueue = this.f18907a;
                    new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.internal.send.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                ForcedSender.a(reportQueue.f18900h, Priority.HIGHEST);
                            } catch (Exception unused) {
                            }
                            countDownLatch.countDown();
                        }
                    }).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = Utils.f18348a;
                    boolean z13 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = jNanoTime - System.nanoTime();
                                    z13 = true;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (z12) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z13) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z12 = z13;
                    }
                }
                taskCompletionSource2.trySetResult(crashlyticsReportWithSessionId);
            }
        });
    }
}
