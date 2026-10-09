package com.google.firebase.database.connection.util;

import com.google.firebase.database.connection.b;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.logging.Logger;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RetryHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f19159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LogWrapper f19160b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f19163e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScheduledFuture f19166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f19167i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Random f19165g = new Random();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19168j = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19161c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19162d = 30000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f19164f = 1.3d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScheduledExecutorService f19171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LogWrapper f19172b;

        public Builder(ScheduledExecutorService scheduledExecutorService, Logger logger) {
            this.f19171a = scheduledExecutorService;
            this.f19172b = new LogWrapper(logger, "ConnectionRetryHelper", null);
        }
    }

    public RetryHelper(ScheduledExecutorService scheduledExecutorService, LogWrapper logWrapper, double d5) {
        this.f19159a = scheduledExecutorService;
        this.f19160b = logWrapper;
        this.f19163e = d5;
    }

    public final void a(final b bVar) {
        Runnable runnable = new Runnable() { // from class: com.google.firebase.database.connection.util.RetryHelper.1
            @Override // java.lang.Runnable
            public final void run() {
                RetryHelper.this.f19166h = null;
                bVar.run();
            }
        };
        ScheduledFuture scheduledFuture = this.f19166h;
        LogWrapper logWrapper = this.f19160b;
        if (scheduledFuture != null) {
            logWrapper.a("Cancelling previous scheduled retry", null, new Object[0]);
            this.f19166h.cancel(false);
            this.f19166h = null;
        }
        long jNextDouble = 0;
        if (!this.f19168j) {
            long j11 = this.f19167i;
            if (j11 == 0) {
                this.f19167i = this.f19161c;
            } else {
                this.f19167i = Math.min((long) (j11 * this.f19164f), this.f19162d);
            }
            double d5 = this.f19163e;
            double d11 = this.f19167i;
            jNextDouble = (long) ((this.f19165g.nextDouble() * d5 * d11) + ((1.0d - d5) * d11));
        }
        this.f19168j = false;
        logWrapper.a("Scheduling retry in %dms", null, Long.valueOf(jNextDouble));
        this.f19166h = this.f19159a.schedule(runnable, jNextDouble, TimeUnit.MILLISECONDS);
    }
}
