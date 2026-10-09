package mw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n0 extends lw.f {
    public static final k0 m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledFuture f42555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f42556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lw.r f42557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f42558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public lw.y f42559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public lw.f f42560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public lw.q1 f42561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f42562k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m0 f42563l;

    static {
        Logger.getLogger(n0.class.getName());
        m = new k0(0);
    }

    public n0(Executor executor, ScheduledExecutorService scheduledExecutorService, lw.s sVar) {
        ScheduledFuture<?> scheduledFutureSchedule;
        Preconditions.k(executor, "callExecutor");
        this.f42556e = executor;
        Preconditions.k(scheduledExecutorService, "scheduler");
        lw.r rVarB = lw.r.b();
        this.f42557f = rVarB;
        rVarB.getClass();
        if (sVar == null) {
            scheduledFutureSchedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jB = sVar.b();
            long jAbs = Math.abs(jB);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit2.toNanos(1L);
            long jAbs2 = Math.abs(jB) % timeUnit2.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            if (jB < 0) {
                sb2.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb2.append("Deadline CallOptions will be exceeded in ");
            }
            sb2.append(nanos);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb2.append("s. ");
            scheduledFutureSchedule = scheduledExecutorService.schedule(new i0(0, this, sb2), jB, timeUnit);
        }
        this.f42555d = scheduledFutureSchedule;
    }

    @Override // lw.f
    public final void a(String str, Throwable th2) {
        lw.q1 q1Var = lw.q1.f40435f;
        lw.q1 q1VarH = str != null ? q1Var.h(str) : q1Var.h("Call cancelled without message");
        if (th2 != null) {
            q1VarH = q1VarH.g(th2);
        }
        r(q1VarH, false);
    }

    @Override // lw.f
    public final void g() {
        s(new j0(this, 1));
    }

    @Override // lw.f
    public final void l() {
        if (this.f42558g) {
            this.f42560i.l();
        } else {
            s(new j0(this, 0));
        }
    }

    @Override // lw.f
    public final void m(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest) {
        if (this.f42558g) {
            this.f42560i.m(fetchEligibleCampaignsRequest);
        } else {
            s(new i0(2, this, fetchEligibleCampaignsRequest));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x004b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // lw.f
    public final void p(lw.y r7, lw.c1 r8) {
        /*
            r6 = this;
            lw.y r0 = r6.f42559h
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.String r1 = "already started"
            com.google.common.base.Preconditions.p(r1, r0)
            monitor-enter(r6)
            r6.f42559h = r7     // Catch: java.lang.Throwable -> L46
            lw.q1 r0 = r6.f42561j     // Catch: java.lang.Throwable -> L46
            boolean r1 = r6.f42558g     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L22
            mw.m0 r2 = new mw.m0     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L1e
            r6.f42563l = r2     // Catch: java.lang.Throwable -> L1e
            r3 = r2
            goto L23
        L1e:
            r0 = move-exception
            r7 = r0
            r2 = r6
            goto L49
        L22:
            r3 = r7
        L23:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L31
            java.util.concurrent.Executor r7 = r6.f42556e
            mw.l0 r8 = new mw.l0
            r8.<init>(r6, r3, r0)
            r7.execute(r8)
            return
        L31:
            if (r1 == 0) goto L39
            lw.f r7 = r6.f42560i
            r7.p(r3, r8)
            return
        L39:
            com.android.billingclient.api.b0 r0 = new com.android.billingclient.api.b0
            r1 = 4
            r5 = 0
            r2 = r6
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r6.s(r0)
            return
        L46:
            r0 = move-exception
            r2 = r6
        L48:
            r7 = r0
        L49:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4b
            throw r7
        L4b:
            r0 = move-exception
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: mw.n0.p(lw.y, lw.c1):void");
    }

    public final void r(lw.q1 q1Var, boolean z11) {
        lw.y yVar;
        synchronized (this) {
            try {
                lw.f fVar = this.f42560i;
                boolean z12 = true;
                if (fVar == null) {
                    k0 k0Var = m;
                    if (fVar != null) {
                        z12 = false;
                    }
                    Preconditions.q("realCall already set to %s", z12, fVar);
                    ScheduledFuture scheduledFuture = this.f42555d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f42560i = k0Var;
                    yVar = this.f42559h;
                    this.f42561j = q1Var;
                    z12 = false;
                } else if (z11) {
                    return;
                } else {
                    yVar = null;
                }
                if (z12) {
                    s(new i0(1, this, q1Var));
                } else {
                    if (yVar != null) {
                        this.f42556e.execute(new l0(this, yVar, q1Var));
                    }
                    t();
                }
                t2 t2Var = (t2) this;
                t2Var.f42695r.f42716d.m.execute(new aj.i(t2Var, 16));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f42558g) {
                    runnable.run();
                } else {
                    this.f42562k.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f42562k     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f42562k = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f42558g = r0     // Catch: java.lang.Throwable -> L24
            mw.m0 r0 = r3.f42563l     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f42556e
            mw.t r2 = new mw.t
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.f42562k     // Catch: java.lang.Throwable -> L24
            r3.f42562k = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mw.n0.t():void");
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f42560i, "realCall");
        return toStringHelperB.toString();
    }
}
