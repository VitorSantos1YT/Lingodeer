package mw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends lw.f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Logger f42729s = Logger.getLogger(v.class.getName());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final double f42730t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lw.e1 f42731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f42732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dm.c f42734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lw.r f42735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile ScheduledFuture f42736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f42737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public lw.c f42738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w f42739l;
    public volatile boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f42740n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f42741o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g0 f42742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f42743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public lw.u f42744r = lw.u.f40474d;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        f42730t = TimeUnit.SECONDS.toNanos(1L) * 1.0d;
    }

    public v(lw.e1 e1Var, Executor executor, lw.c cVar, g0 g0Var, ScheduledExecutorService scheduledExecutorService, dm.c cVar2) {
        lw.m mVar = lw.m.f40415b;
        this.f42731d = e1Var;
        String str = e1Var.f40368b;
        System.identityHashCode(this);
        tw.b.f52660a.getClass();
        if (executor == MoreExecutors.a()) {
            this.f42732e = new d5();
            this.f42733f = true;
        } else {
            this.f42732e = new g5(executor);
            this.f42733f = false;
        }
        this.f42734g = cVar2;
        this.f42735h = lw.r.b();
        lw.d1 d1Var = e1Var.f40367a;
        this.f42737j = d1Var == lw.d1.UNARY || d1Var == lw.d1.SERVER_STREAMING;
        this.f42738k = cVar;
        this.f42742p = g0Var;
        this.f42743q = scheduledExecutorService;
    }

    @Override // lw.f
    public final void a(String str, Throwable th2) {
        tw.b.c();
        try {
            tw.b.a();
            r(str, th2);
            tw.b.f52660a.getClass();
        } catch (Throwable th3) {
            try {
                tw.b.f52660a.getClass();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // lw.f
    public final void g() {
        tw.b.c();
        try {
            tw.b.a();
            Preconditions.p("Not started", this.f42739l != null);
            Preconditions.p("call was cancelled", !this.f42740n);
            Preconditions.p("call already half-closed", !this.f42741o);
            this.f42741o = true;
            this.f42739l.h();
            tw.b.f52660a.getClass();
        } catch (Throwable th2) {
            try {
                tw.b.f52660a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // lw.f
    public final void l() {
        tw.b.c();
        try {
            tw.b.a();
            Preconditions.p("Not started", this.f42739l != null);
            this.f42739l.e();
            tw.b.f52660a.getClass();
        } catch (Throwable th2) {
            try {
                tw.b.f52660a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // lw.f
    public final void m(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest) {
        tw.b.c();
        try {
            tw.b.a();
            t(fetchEligibleCampaignsRequest);
            tw.b.f52660a.getClass();
        } catch (Throwable th2) {
            try {
                tw.b.f52660a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // lw.f
    public final void p(lw.y yVar, lw.c1 c1Var) {
        tw.b.c();
        try {
            tw.b.a();
            u(yVar, c1Var);
            tw.b.f52660a.getClass();
        } catch (Throwable th2) {
            try {
                tw.b.f52660a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void r(String str, Throwable th2) {
        if (str == null && th2 == null) {
            th2 = new CancellationException("Cancelled without a message or cause");
            f42729s.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th2);
        }
        if (this.f42740n) {
            return;
        }
        this.f42740n = true;
        try {
            if (this.f42739l != null) {
                lw.q1 q1Var = lw.q1.f40435f;
                lw.q1 q1VarH = str != null ? q1Var.h(str) : q1Var.h("Call cancelled without message");
                if (th2 != null) {
                    q1VarH = q1VarH.g(th2);
                }
                this.f42739l.p(q1VarH);
            }
        } finally {
            s();
        }
    }

    public final void s() {
        this.f42735h.getClass();
        ScheduledFuture scheduledFuture = this.f42736i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void t(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest) {
        Preconditions.p("Not started", this.f42739l != null);
        Preconditions.p("call was cancelled", !this.f42740n);
        Preconditions.p("call was half-closed", !this.f42741o);
        try {
            w wVar = this.f42739l;
            if (wVar instanceof n2) {
                ((n2) wVar).v(fetchEligibleCampaignsRequest);
            } else {
                wVar.j(this.f42731d.c(fetchEligibleCampaignsRequest));
            }
            if (this.f42737j) {
                return;
            }
            this.f42739l.flush();
        } catch (Error e8) {
            this.f42739l.p(lw.q1.f40435f.h("Client sendMessage() failed with Error"));
            throw e8;
        } catch (RuntimeException e10) {
            this.f42739l.p(lw.q1.f40435f.g(e10).h("Failed to stream message"));
        }
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f42731d, "method");
        return toStringHelperB.toString();
    }

    public final void u(lw.y yVar, lw.c1 c1Var) {
        lp.b bVar;
        lw.c cVar;
        w n2Var;
        lw.k kVar = lw.k.f40407b;
        Preconditions.p("Already started", this.f42739l == null);
        Preconditions.p("call was cancelled", !this.f42740n);
        this.f42735h.getClass();
        lw.c cVar2 = this.f42738k;
        lp.b bVar2 = c3.f42372g;
        c3 c3Var = (c3) cVar2.a(bVar2);
        if (c3Var == null) {
            bVar = bVar2;
        } else {
            Integer num = c3Var.f42376d;
            Integer num2 = c3Var.f42375c;
            Long l9 = c3Var.f42373a;
            if (l9 != null) {
                long jLongValue = l9.longValue();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                if (timeUnit == null) {
                    lw.k kVar2 = lw.s.f40453d;
                    throw new NullPointerException("units");
                }
                lw.s sVar = new lw.s(timeUnit.toNanos(jLongValue));
                lw.c cVar3 = this.f42738k;
                lw.s sVar2 = cVar3.f40349a;
                if (sVar2 != null) {
                    lw.k kVar3 = sVar.f40457a;
                    if (kVar3 != sVar2.f40457a) {
                        throw new AssertionError("Tickers (" + kVar3 + " and " + sVar2.f40457a + ") don't match. Custom Ticker should only be used in tests!");
                    }
                    bVar = bVar2;
                    if (sVar.f40458b - sVar2.f40458b < 0) {
                    }
                } else {
                    bVar = bVar2;
                }
                cVar3.getClass();
                r.x2 x2VarB = lw.c.b(cVar3);
                x2VarB.f48709a = sVar;
                this.f42738k = new lw.c(x2VarB);
            } else {
                bVar = bVar2;
            }
            Boolean bool = c3Var.f42374b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    lw.c cVar4 = this.f42738k;
                    cVar4.getClass();
                    r.x2 x2VarB2 = lw.c.b(cVar4);
                    x2VarB2.f48713e = Boolean.TRUE;
                    cVar = new lw.c(x2VarB2);
                } else {
                    lw.c cVar5 = this.f42738k;
                    cVar5.getClass();
                    r.x2 x2VarB3 = lw.c.b(cVar5);
                    x2VarB3.f48713e = Boolean.FALSE;
                    cVar = new lw.c(x2VarB3);
                }
                this.f42738k = cVar;
            }
            if (num2 != null) {
                lw.c cVar6 = this.f42738k;
                Integer num3 = cVar6.f40354f;
                if (num3 != null) {
                    int iMin = Math.min(num3.intValue(), num2.intValue());
                    Preconditions.b(iMin, "invalid maxsize %s", iMin >= 0);
                    r.x2 x2VarB4 = lw.c.b(cVar6);
                    x2VarB4.f48714f = Integer.valueOf(iMin);
                    this.f42738k = new lw.c(x2VarB4);
                } else {
                    int iIntValue = num2.intValue();
                    Preconditions.b(iIntValue, "invalid maxsize %s", iIntValue >= 0);
                    r.x2 x2VarB5 = lw.c.b(cVar6);
                    x2VarB5.f48714f = num2;
                    this.f42738k = new lw.c(x2VarB5);
                }
            }
            if (num != null) {
                lw.c cVar7 = this.f42738k;
                Integer num4 = cVar7.f40355g;
                if (num4 != null) {
                    int iMin2 = Math.min(num4.intValue(), num.intValue());
                    Preconditions.b(iMin2, "invalid maxsize %s", iMin2 >= 0);
                    r.x2 x2VarB6 = lw.c.b(cVar7);
                    x2VarB6.f48715t = Integer.valueOf(iMin2);
                    this.f42738k = new lw.c(x2VarB6);
                } else {
                    int iIntValue2 = num.intValue();
                    Preconditions.b(iIntValue2, "invalid maxsize %s", iIntValue2 >= 0);
                    r.x2 x2VarB7 = lw.c.b(cVar7);
                    x2VarB7.f48715t = num;
                    this.f42738k = new lw.c(x2VarB7);
                }
            }
        }
        this.f42738k.getClass();
        lw.u uVar = this.f42744r;
        c1Var.a(k1.f42494h);
        c1Var.a(k1.f42490d);
        lw.z0 z0Var = k1.f42491e;
        c1Var.a(z0Var);
        byte[] bArr = uVar.f40476b;
        if (bArr.length != 0) {
            c1Var.e(z0Var, bArr);
        }
        c1Var.a(k1.f42492f);
        c1Var.a(k1.f42493g);
        lw.s sVar3 = this.f42738k.f40349a;
        this.f42735h.getClass();
        lw.s sVar4 = sVar3 == null ? null : sVar3;
        if (sVar4 == null || !sVar4.a()) {
            this.f42735h.getClass();
            lw.s sVar5 = this.f42738k.f40349a;
            Logger logger = f42729s;
            if (logger.isLoggable(Level.FINE) && sVar4 != null && sVar4.equals(null)) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long jMax = Math.max(0L, sVar4.b());
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder(nv.p.m(jMax, "Call timeout set to '", "' ns, due to context deadline."));
                if (sVar5 == null) {
                    sb2.append(" Explicit call timeout was not set.");
                } else {
                    sb2.append(" Explicit call timeout was '" + sVar5.b() + "' ns.");
                }
                logger.fine(sb2.toString());
            }
            g0 g0Var = this.f42742p;
            lw.e1 e1Var = this.f42731d;
            lw.c cVar8 = this.f42738k;
            lw.r rVar = this.f42735h;
            if (((y2) g0Var.f42424b).X) {
                c3 c3Var2 = (c3) cVar8.a(bVar);
                n2Var = new n2(g0Var, e1Var, c1Var, cVar8, c3Var2 == null ? null : c3Var2.f42377e, c3Var2 == null ? null : c3Var2.f42378f, rVar);
            } else {
                z zVarB = g0Var.b(new b4(e1Var, c1Var, cVar8));
                lw.r rVarA = rVar.a();
                try {
                    n2Var = zVarB.b(e1Var, c1Var, cVar8, k1.c(cVar8, c1Var, 0, false));
                    rVar.c(rVarA);
                } catch (Throwable th2) {
                    rVar.c(rVarA);
                    throw th2;
                }
            }
            this.f42739l = n2Var;
        } else {
            lw.j[] jVarArrC = k1.c(this.f42738k, c1Var, 0, false);
            lw.s sVar6 = this.f42738k.f40349a;
            this.f42735h.getClass();
            String str = sVar6 == null ? "Context" : "CallOptions";
            Long l11 = (Long) this.f42738k.a(lw.j.f40401a);
            TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
            double dB = sVar4.b();
            double d5 = f42730t;
            this.f42739l = new z0(lw.q1.f40437h.h(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(dB / d5), Double.valueOf(l11 == null ? 0.0d : l11.longValue() / d5))), x.PROCESSED, jVarArrC);
        }
        if (this.f42733f) {
            this.f42739l.q();
        }
        this.f42738k.getClass();
        Integer num5 = this.f42738k.f40354f;
        if (num5 != null) {
            this.f42739l.l(num5.intValue());
        }
        Integer num6 = this.f42738k.f40355g;
        if (num6 != null) {
            this.f42739l.d(num6.intValue());
        }
        if (sVar4 != null) {
            this.f42739l.s(sVar4);
        }
        this.f42739l.c(kVar);
        this.f42739l.r(this.f42744r);
        dm.c cVar9 = this.f42734g;
        ((k2) cVar9.f23491c).a();
        ((n3) cVar9.f23490b).t();
        this.f42739l.n(new xq.c(this, yVar));
        lw.r rVar2 = this.f42735h;
        Executor executorA = MoreExecutors.a();
        rVar2.getClass();
        Logger logger2 = lw.r.f40447a;
        if (executorA == null) {
            throw new NullPointerException("executor");
        }
        if (sVar4 != null) {
            this.f42735h.getClass();
            if (!sVar4.equals(null) && this.f42743q != null) {
                TimeUnit timeUnit4 = TimeUnit.NANOSECONDS;
                long jB = sVar4.b();
                this.f42736i = this.f42743q.schedule(new j2(new u(this, jB, 0)), jB, timeUnit4);
            }
        }
        if (this.m) {
            s();
        }
    }
}
