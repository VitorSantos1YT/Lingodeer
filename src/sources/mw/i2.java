package mw;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f42448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Stopwatch f42449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a5.f f42450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h2 f42451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScheduledFuture f42452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ScheduledFuture f42453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2 f42454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j2 f42455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f42456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f42457j;

    static {
        TimeUnit.SECONDS.toNanos(10L);
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public i2(a5.f fVar, ScheduledExecutorService scheduledExecutorService, long j11, long j12) {
        Stopwatch stopwatch = new Stopwatch();
        this.f42451d = h2.IDLE;
        this.f42454g = new j2(new f2(this, 0));
        this.f42455h = new j2(new f2(this, 1));
        this.f42450c = fVar;
        Preconditions.k(scheduledExecutorService, "scheduler");
        this.f42448a = scheduledExecutorService;
        this.f42449b = stopwatch;
        this.f42456i = j11;
        this.f42457j = j12;
        stopwatch.f16400c = 0L;
        stopwatch.f16399b = false;
        stopwatch.b();
    }

    public final synchronized void a() {
        try {
            Stopwatch stopwatch = this.f42449b;
            stopwatch.f16400c = 0L;
            stopwatch.f16399b = false;
            stopwatch.b();
            h2 h2Var = this.f42451d;
            h2 h2Var2 = h2.PING_SCHEDULED;
            if (h2Var == h2Var2) {
                this.f42451d = h2.PING_DELAYED;
            } else if (h2Var == h2.PING_SENT || h2Var == h2.IDLE_AND_PING_SENT) {
                ScheduledFuture scheduledFuture = this.f42452e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f42451d == h2.IDLE_AND_PING_SENT) {
                    this.f42451d = h2.IDLE;
                } else {
                    this.f42451d = h2Var2;
                    Preconditions.p("There should be no outstanding pingFuture", this.f42453f == null);
                    this.f42453f = this.f42448a.schedule(this.f42455h, this.f42456i, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            h2 h2Var = this.f42451d;
            if (h2Var == h2.IDLE) {
                this.f42451d = h2.PING_SCHEDULED;
                if (this.f42453f == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f42448a;
                    j2 j2Var = this.f42455h;
                    long j11 = this.f42456i;
                    Stopwatch stopwatch = this.f42449b;
                    this.f42453f = scheduledExecutorService.schedule(j2Var, j11 - stopwatch.a(), TimeUnit.NANOSECONDS);
                }
            } else if (h2Var == h2.IDLE_AND_PING_SENT) {
                this.f42451d = h2.PING_SENT;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
