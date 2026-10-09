package mw;

import com.google.common.base.Stopwatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f42463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw.t1 f42464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aj.i f42465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Stopwatch f42466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledFuture f42469g;

    public i4(aj.i iVar, lw.t1 t1Var, ScheduledExecutorService scheduledExecutorService, Stopwatch stopwatch) {
        this.f42465c = iVar;
        this.f42464b = t1Var;
        this.f42463a = scheduledExecutorService;
        this.f42466d = stopwatch;
        stopwatch.b();
    }
}
