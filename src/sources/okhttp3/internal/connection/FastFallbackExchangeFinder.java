package okhttp3.internal.connection;

import cf.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskRunner;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class FastFallbackExchangeFinder implements ExchangeFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoutePlanner f45269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskRunner f45270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f45273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BlockingQueue f45274f;

    public FastFallbackExchangeFinder(RoutePlanner routePlanner, TaskRunner taskRunner) {
        m.f(taskRunner, "taskRunner");
        this.f45269a = routePlanner;
        this.f45270b = taskRunner;
        this.f45271c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f45272d = Long.MIN_VALUE;
        this.f45273e = new CopyOnWriteArrayList();
        this.f45274f = new LinkedBlockingDeque();
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RealConnection a() throws IOException {
        RoutePlanner.ConnectResult connectResultD;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f45273e;
        IOException iOException = null;
        while (true) {
            try {
                boolean zIsEmpty = copyOnWriteArrayList.isEmpty();
                RoutePlanner routePlanner = this.f45269a;
                if (zIsEmpty && !routePlanner.a(null)) {
                    c();
                    m.c(iOException);
                    throw iOException;
                }
                if (routePlanner.b()) {
                    throw new IOException("Canceled");
                }
                TaskRunner.RealBackend realBackend = this.f45270b.f45227a;
                long jNanoTime = System.nanoTime();
                long j11 = this.f45272d - jNanoTime;
                if (copyOnWriteArrayList.isEmpty() || j11 <= 0) {
                    connectResultD = d();
                    j11 = this.f45271c;
                    this.f45272d = jNanoTime + j11;
                } else {
                    connectResultD = null;
                }
                if (connectResultD == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (copyOnWriteArrayList.isEmpty() || (connectResultD = (RoutePlanner.ConnectResult) this.f45274f.poll(j11, timeUnit)) == null) {
                        connectResultD = null;
                    } else {
                        copyOnWriteArrayList.remove(connectResultD.f45323a);
                    }
                    if (connectResultD == null) {
                    }
                }
                RoutePlanner.Plan plan = connectResultD.f45323a;
                boolean z11 = false;
                if (connectResultD.f45324b == null && connectResultD.f45325c == null) {
                    c();
                    if (!plan.f()) {
                        connectResultD = plan.g();
                    }
                    if (connectResultD.f45324b == null && connectResultD.f45325c == null) {
                        z11 = true;
                    }
                    if (z11) {
                        RealConnection realConnectionB = connectResultD.f45323a.b();
                        c();
                        return realConnectionB;
                    }
                }
                Throwable th2 = connectResultD.f45325c;
                if (th2 != null) {
                    if (!(th2 instanceof IOException)) {
                        throw th2;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th2;
                    } else {
                        x.b(iOException, th2);
                    }
                }
                RoutePlanner.Plan plan2 = connectResultD.f45324b;
                if (plan2 != null) {
                    routePlanner.e().addFirst(plan2);
                }
            } catch (Throwable th3) {
                c();
                throw th3;
            }
        }
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RoutePlanner b() {
        return this.f45269a;
    }

    public final void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f45273e;
        Iterator it = copyOnWriteArrayList.iterator();
        m.e(it, "iterator(...)");
        while (it.hasNext()) {
            RoutePlanner.Plan plan = (RoutePlanner.Plan) it.next();
            plan.cancel();
            RoutePlanner.Plan planC = plan.c();
            if (planC != null) {
                this.f45269a.e().addLast(planC);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final RoutePlanner.ConnectResult d() {
        final RoutePlanner.Plan failedPlan;
        RoutePlanner routePlanner = this.f45269a;
        if (routePlanner.a(null)) {
            try {
                failedPlan = routePlanner.f();
            } catch (Throwable th2) {
                failedPlan = new FailedPlan(th2);
            }
            if (failedPlan.f()) {
                return new RoutePlanner.ConnectResult(failedPlan, null, null, 6);
            }
            if (failedPlan instanceof FailedPlan) {
                return ((FailedPlan) failedPlan).f45268a;
            }
            this.f45273e.add(failedPlan);
            final String str = _UtilJvmKt.f45205b + " connect " + routePlanner.c().f44940i.h();
            this.f45270b.d().c(new Task(str) { // from class: okhttp3.internal.connection.FastFallbackExchangeFinder$launchTcpConnect$1
                @Override // okhttp3.internal.concurrent.Task
                public final long a() throws InterruptedException {
                    RoutePlanner.ConnectResult connectResult;
                    RoutePlanner.Plan plan = failedPlan;
                    try {
                        connectResult = plan.d();
                    } catch (Throwable th3) {
                        connectResult = new RoutePlanner.ConnectResult(plan, null, th3, 2);
                    }
                    FastFallbackExchangeFinder fastFallbackExchangeFinder = this;
                    if (!fastFallbackExchangeFinder.f45273e.contains(plan)) {
                        return -1L;
                    }
                    fastFallbackExchangeFinder.f45274f.put(connectResult);
                    return -1L;
                }
            }, 0L);
        }
        return null;
    }
}
