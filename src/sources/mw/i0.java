package mw;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42446c;

    public /* synthetic */ i0(int i11, Object obj, Object obj2) {
        this.f42444a = i11;
        this.f42445b = obj;
        this.f42446c = obj2;
    }

    private final void a() {
        n2 n2Var = (n2) this.f42445b;
        w4 w4VarG = n2Var.g(n2Var.Q.f42704e, false);
        if (w4VarG == null) {
            return;
        }
        ((n2) this.f42445b).f42573b.execute(new i0(21, this, w4VarG));
    }

    private final void b() {
        ((n2) ((r5) this.f42445b).f42668b).W.j((lw.c1) this.f42446c);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0090 A[Catch: all -> 0x008d, TryCatch #6 {all -> 0x008d, blocks: (B:12:0x0032, B:32:0x00c2, B:15:0x0041, B:17:0x0061, B:19:0x006d, B:24:0x007b, B:27:0x0090, B:31:0x00b6, B:30:0x009f), top: B:303:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f A[Catch: all -> 0x008d, TryCatch #6 {all -> 0x008d, blocks: (B:12:0x0032, B:32:0x00c2, B:15:0x0041, B:17:0x0061, B:19:0x006d, B:24:0x007b, B:27:0x0090, B:31:0x00b6, B:30:0x009f), top: B:303:0x0032 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        h9.b bVar;
        lw.g1 g1Var;
        List listSingletonList;
        w1 w1Var;
        e3 e3Var;
        lw.q1 q1VarA;
        Object obj;
        t4 t4Var;
        int i11 = 2;
        int i12 = 22;
        boolean z11 = false;
        objArr = 0;
        Object[] objArr = 0;
        int i13 = 0;
        z = false;
        boolean z12 = false;
        z = false;
        boolean z13 = false;
        z11 = false;
        ob.m mVar = null;
        oVar = null;
        ie.o oVar = null;
        mVar = null;
        ob.m mVar2 = null;
        boolean z14 = true;
        char c11 = 1;
        switch (this.f42444a) {
            case 0:
                ((n0) this.f42445b).r(lw.q1.f40437h.h(((StringBuilder) this.f42446c).toString()), true);
                return;
            case 1:
                lw.f fVar = ((n0) this.f42445b).f42560i;
                lw.q1 q1Var = (lw.q1) this.f42446c;
                fVar.a(q1Var.f40445b, q1Var.f40446c);
                return;
            case 2:
                ((n0) this.f42445b).f42560i.m((FetchEligibleCampaignsRequest) this.f42446c);
                return;
            case 3:
                ((m0) this.f42445b).f42529a.j((lw.c1) this.f42446c);
                return;
            case 4:
                ((m0) this.f42445b).f42529a.k(this.f42446c);
                return;
            case 5:
                Preconditions.p("Channel must have been shut down", ((y2) ((q0) this.f42445b).f42635h.f40184b).G.get());
                return;
            case 6:
                ((p0) this.f42445b).f42612c.c((lw.l) this.f42446c);
                return;
            case 7:
                ((p0) this.f42445b).f42612c.r((lw.u) this.f42446c);
                return;
            case 8:
                ((p0) this.f42445b).f42612c.s((lw.s) this.f42446c);
                return;
            case 9:
                ((p0) this.f42445b).f42612c.j((qw.a) this.f42446c);
                return;
            case 10:
                ((p0) this.f42445b).f42612c.p((lw.q1) this.f42446c);
                return;
            case 11:
                ((t0) this.f42445b).f42685a.e((dm.a) this.f42446c);
                return;
            case 12:
                ((t0) this.f42445b).f42685a.j((lw.c1) this.f42446c);
                return;
            case 13:
                lw.y yVar = (lw.y) this.f42446c;
                w0 w0Var = (w0) this.f42445b;
                String str = w0Var.f42761i;
                lw.t1 t1Var = w0Var.m;
                Logger logger = w0.f42751v;
                Level level = Level.FINER;
                if (logger.isLoggable(level)) {
                    logger.finer("Attempting DNS resolution of " + str);
                }
                try {
                    try {
                        lw.l1 l1VarA = w0Var.f42756d.a(InetSocketAddress.createUnresolved(str, w0Var.f42762j));
                        lw.v vVar = l1VarA != null ? new lw.v(l1VarA) : null;
                        List list = Collections.EMPTY_LIST;
                        lw.b bVar2 = lw.b.f40342b;
                        if (vVar == null) {
                            ob.m mVarR = w0Var.r();
                            try {
                                lw.q1 q1Var2 = (lw.q1) mVarR.f44826b;
                                if (q1Var2 != null) {
                                    yVar.i(q1Var2);
                                    bVar = new h9.b(this, ((lw.q1) mVarR.f44826b) == null, 3);
                                } else {
                                    List list2 = (List) mVarR.f44827c;
                                    if (list2 != null) {
                                        list = list2;
                                    }
                                    lw.g1 g1Var2 = (lw.g1) mVarR.f44828d;
                                    g1Var = g1Var2 != null ? g1Var2 : null;
                                    mVar = mVarR;
                                    listSingletonList = list;
                                }
                            } catch (IOException e8) {
                                e = e8;
                                mVar = mVarR;
                                yVar.i(lw.q1.m.h("Unable to resolve host " + str).g(e));
                                if (mVar != null && ((lw.q1) mVar.f44826b) == null) {
                                    z13 = true;
                                }
                                bVar = new h9.b(this, z13, 3);
                            } catch (Throwable th2) {
                                th = th2;
                                mVar2 = mVarR;
                                if (mVar2 != null && ((lw.q1) mVar2.f44826b) == null) {
                                    z11 = true;
                                }
                                t1Var.execute(new h9.b(this, z11, 3));
                                throw th;
                            }
                            t1Var.execute(bVar);
                            return;
                        }
                        if (logger.isLoggable(level)) {
                            logger.finer("Using proxy address " + vVar);
                        }
                        listSingletonList = Collections.singletonList(vVar);
                        g1Var = null;
                        yVar.m(new lw.h1(listSingletonList, bVar2, g1Var));
                        if (mVar != null && ((lw.q1) mVar.f44826b) == null) {
                            z12 = true;
                        }
                        bVar = new h9.b(this, z12, 3);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e10) {
                    e = e10;
                }
                t1Var.execute(bVar);
                return;
            case 14:
                x1 x1Var = ((a2) this.f42445b).f42320l;
                SocketAddress socketAddress = (SocketAddress) ((lw.v) x1Var.f42782a.get(x1Var.f42783b)).f40480a.get(x1Var.f42784c);
                x1 x1Var2 = ((a2) this.f42445b).f42320l;
                x1Var2.f42782a = (List) this.f42446c;
                x1Var2.d();
                ((a2) this.f42445b).m = (List) this.f42446c;
                if (((a2) this.f42445b).f42330w.f40425a == lw.n.READY || ((a2) this.f42445b).f42330w.f40425a == lw.n.CONNECTING) {
                    x1 x1Var3 = ((a2) this.f42445b).f42320l;
                    while (true) {
                        if (i13 < x1Var3.f42782a.size()) {
                            int iIndexOf = ((lw.v) x1Var3.f42782a.get(i13)).f40480a.indexOf(socketAddress);
                            if (iIndexOf == -1) {
                                i13++;
                            } else {
                                x1Var3.f42783b = i13;
                                x1Var3.f42784c = iIndexOf;
                            }
                        } else if (((a2) this.f42445b).f42330w.f40425a == lw.n.READY) {
                            w1Var = ((a2) this.f42445b).f42329v;
                            ((a2) this.f42445b).f42329v = null;
                            ((a2) this.f42445b).f42320l.d();
                            a2.e((a2) this.f42445b, lw.n.IDLE);
                        } else {
                            ((a2) this.f42445b).f42328u.c(lw.q1.m.h("InternalSubchannel closed pending transport due to address change"));
                            a2 a2Var = (a2) this.f42445b;
                            a2Var.f42328u = null;
                            a2Var.f42320l.d();
                            a2.f((a2) this.f42445b);
                        }
                        w1Var = null;
                    }
                } else {
                    w1Var = null;
                }
                if (w1Var != null) {
                    a2 a2Var2 = (a2) this.f42445b;
                    if (a2Var2.f42324q != null) {
                        a2Var2.f42325r.c(lw.q1.m.h("InternalSubchannel closed transport early due to address change"));
                        ((a2) this.f42445b).f42324q.r();
                        a2 a2Var3 = (a2) this.f42445b;
                        a2Var3.f42324q = null;
                        a2Var3.f42325r = null;
                    }
                    a2 a2Var4 = (a2) this.f42445b;
                    a2Var4.f42325r = w1Var;
                    a2Var4.f42324q = a2Var4.f42319k.c(new aj.i(this, 11), 5L, TimeUnit.SECONDS, a2Var4.f42314f);
                    return;
                }
                return;
            case 15:
                lw.n nVar = ((a2) this.f42445b).f42330w.f40425a;
                lw.n nVar2 = lw.n.SHUTDOWN;
                if (nVar == nVar2) {
                    return;
                }
                a2 a2Var5 = (a2) this.f42445b;
                a2Var5.f42331x = (lw.q1) this.f42446c;
                w1 w1Var2 = a2Var5.f42329v;
                a2 a2Var6 = (a2) this.f42445b;
                w1 w1Var3 = a2Var6.f42328u;
                a2Var6.f42329v = null;
                a2 a2Var7 = (a2) this.f42445b;
                a2Var7.f42328u = null;
                a2.e(a2Var7, nVar2);
                ((a2) this.f42445b).f42320l.d();
                if (((a2) this.f42445b).f42326s.isEmpty()) {
                    a2 a2Var8 = (a2) this.f42445b;
                    a2Var8.f42319k.execute(new s1(a2Var8, i11));
                }
                a2 a2Var9 = (a2) this.f42445b;
                a2Var9.f42319k.d();
                b1.p pVar = a2Var9.f42323p;
                if (pVar != null) {
                    pVar.r();
                    a2Var9.f42323p = null;
                    a2Var9.f42321n = null;
                }
                b1.p pVar2 = ((a2) this.f42445b).f42324q;
                if (pVar2 != null) {
                    pVar2.r();
                    ((a2) this.f42445b).f42325r.c((lw.q1) this.f42446c);
                    a2 a2Var10 = (a2) this.f42445b;
                    a2Var10.f42324q = null;
                    a2Var10.f42325r = null;
                }
                if (w1Var2 != null) {
                    w1Var2.c((lw.q1) this.f42446c);
                }
                if (w1Var3 != null) {
                    w1Var3.c((lw.q1) this.f42446c);
                    return;
                }
                return;
            case 16:
                if (((a2) ((ie.o) this.f42445b).f34407d).f42330w.f40425a == lw.n.SHUTDOWN) {
                    return;
                }
                w1 w1Var4 = ((a2) ((ie.o) this.f42445b).f34407d).f42329v;
                ie.o oVar2 = (ie.o) this.f42445b;
                w1 w1Var5 = (w1) oVar2.f34406c;
                if (w1Var4 == w1Var5) {
                    ((a2) oVar2.f34407d).f42329v = null;
                    ((a2) ((ie.o) this.f42445b).f34407d).f42320l.d();
                    a2.e((a2) ((ie.o) this.f42445b).f34407d, lw.n.IDLE);
                    return;
                }
                a2 a2Var11 = (a2) oVar2.f34407d;
                if (a2Var11.f42328u == w1Var5) {
                    Preconditions.q("Expected state is CONNECTING, actual state is %s", a2Var11.f42330w.f40425a == lw.n.CONNECTING, ((a2) ((ie.o) this.f42445b).f34407d).f42330w.f40425a);
                    x1 x1Var4 = ((a2) ((ie.o) this.f42445b).f34407d).f42320l;
                    lw.v vVar2 = (lw.v) x1Var4.f42782a.get(x1Var4.f42783b);
                    int i14 = x1Var4.f42784c + 1;
                    x1Var4.f42784c = i14;
                    if (i14 >= vVar2.f40480a.size()) {
                        x1Var4.f42783b++;
                        x1Var4.f42784c = 0;
                    }
                    x1 x1Var5 = ((a2) ((ie.o) this.f42445b).f34407d).f42320l;
                    if (x1Var5.f42783b < x1Var5.f42782a.size()) {
                        a2.f((a2) ((ie.o) this.f42445b).f34407d);
                        return;
                    }
                    a2 a2Var12 = (a2) ((ie.o) this.f42445b).f34407d;
                    a2Var12.f42328u = null;
                    a2Var12.f42320l.d();
                    a2 a2Var13 = (a2) ((ie.o) this.f42445b).f34407d;
                    lw.q1 q1Var3 = (lw.q1) this.f42446c;
                    a2Var13.f42319k.d();
                    Preconditions.e("The error status must not be OK", !q1Var3.f());
                    a2Var13.g(new lw.o(lw.n.TRANSIENT_FAILURE, q1Var3));
                    if (a2Var13.f42321n == null) {
                        a2Var13.f42311c.getClass();
                        a2Var13.f42321n = n3.u();
                    }
                    long jA = a2Var13.f42321n.a();
                    Stopwatch stopwatch = a2Var13.f42322o;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long jA2 = jA - stopwatch.a();
                    a2Var13.f42317i.i(lw.e.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", a2.h(q1Var3), Long.valueOf(jA2));
                    Preconditions.p("previous reconnectTask is not done", a2Var13.f42323p == null);
                    a2Var13.f42323p = a2Var13.f42319k.c(new s1(a2Var13, z11 ? 1 : 0), jA2, timeUnit, a2Var13.f42314f);
                    return;
                }
                return;
            case 17:
                r2 r2Var = (r2) this.f42445b;
                lw.q1 q1Var4 = (lw.q1) this.f42446c;
                Logger logger2 = y2.f42807c0;
                Level level2 = Level.WARNING;
                y2 y2Var = r2Var.f42661c;
                logger2.log(level2, "[{0}] Failed to resolve name. status={1}", new Object[]{y2Var.f42814a, q1Var4});
                u2 u2Var = y2Var.P;
                if (u2Var.f42713a.get() == y2.f42812h0) {
                    u2Var.h(null);
                }
                v2 v2Var = y2Var.Q;
                v2 v2Var2 = v2.ERROR;
                if (v2Var != v2Var2) {
                    y2Var.N.i(lw.e.WARNING, "Failed to resolve name: {0}", q1Var4);
                    y2Var.Q = v2Var2;
                }
                q2 q2Var = r2Var.f42659a;
                if (q2Var != y2Var.f42838x) {
                    return;
                }
                ((lw.q0) q2Var.f42647d.f44814c).c(q1Var4);
                return;
            case 18:
                lw.a aVar = lw.d0.f40366a;
                r2 r2Var2 = (r2) this.f42445b;
                y2 y2Var2 = r2Var2.f42661c;
                if (y2Var2.f42836v != r2Var2.f42660b) {
                    return;
                }
                lw.h1 h1Var = (lw.h1) this.f42446c;
                List list3 = h1Var.f40393a;
                n nVar3 = y2Var2.N;
                lw.e eVar = lw.e.DEBUG;
                nVar3.i(eVar, "Resolved address: {0}, config={1}", list3, h1Var.f40394b);
                y2 y2Var3 = ((r2) this.f42445b).f42661c;
                v2 v2Var3 = y2Var3.Q;
                v2 v2Var4 = v2.SUCCESS;
                if (v2Var3 != v2Var4) {
                    y2Var3.N.i(lw.e.INFO, "Address resolved: {0}", list3);
                    ((r2) this.f42445b).f42661c.Q = v2Var4;
                }
                lw.h1 h1Var2 = (lw.h1) this.f42446c;
                lw.g1 g1Var3 = h1Var2.f40395c;
                z4 z4Var = (z4) h1Var2.f40394b.f40343a.get(b5.f42363g);
                lw.d0 d0Var = (lw.d0) ((lw.h1) this.f42446c).f40394b.f40343a.get(aVar);
                e3 e3Var2 = (g1Var3 == null || (obj = g1Var3.f40390b) == null) ? null : (e3) obj;
                lw.q1 q1Var5 = g1Var3 != null ? g1Var3.f40389a : null;
                y2 y2Var4 = ((r2) this.f42445b).f42661c;
                if (y2Var4.T) {
                    if (e3Var2 != null) {
                        if (d0Var != null) {
                            y2Var4.P.h(d0Var);
                            if (e3Var2.b() != null) {
                                ((r2) this.f42445b).f42661c.N.h(eVar, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            y2Var4.P.h(e3Var2.b());
                        }
                    } else if (q1Var5 == null) {
                        e3Var2 = y2.f42811g0;
                        y2Var4.P.h(null);
                    } else {
                        if (!y2Var4.S) {
                            y2Var4.N.h(lw.e.INFO, "Fallback to error due to invalid first service config without default config");
                            ((r2) this.f42445b).i(g1Var3.f40389a);
                            if (z4Var != null) {
                                lw.q1 q1Var6 = g1Var3.f40389a;
                                b5 b5Var = z4Var.f42878a;
                                j jVar = b5Var.f42364e;
                                if (!q1Var6.f()) {
                                    jVar.a(new aj.i(b5Var, i12));
                                    return;
                                }
                                lw.t1 t1Var2 = jVar.f42474b;
                                t1Var2.d();
                                t1Var2.execute(new lf.i0(jVar, i11));
                                return;
                            }
                            return;
                        }
                        e3Var2 = y2Var4.R;
                    }
                    if (!e3Var2.equals(((r2) this.f42445b).f42661c.R)) {
                        ((r2) this.f42445b).f42661c.N.i(lw.e.INFO, "Service config changed{0}", e3Var2 == y2.f42811g0 ? " to empty" : BuildConfig.VERSION_NAME);
                        y2 y2Var5 = ((r2) this.f42445b).f42661c;
                        y2Var5.R = e3Var2;
                        y2Var5.f42815a0.f42423a = e3Var2.f42410d;
                    }
                    try {
                        ((r2) this.f42445b).f42661c.S = true;
                    } catch (RuntimeException e11) {
                        y2.f42807c0.log(Level.WARNING, "[" + ((r2) this.f42445b).f42661c.f42814a + "] Unexpected exception from parsing service config", (Throwable) e11);
                    }
                    e3Var = e3Var2;
                    break;
                } else {
                    if (e3Var2 != null) {
                        y2Var4.N.h(lw.e.INFO, "Service config from name resolver discarded by channel settings");
                    }
                    y2 y2Var6 = ((r2) this.f42445b).f42661c;
                    e3Var = y2.f42811g0;
                    if (d0Var != null) {
                        y2Var6.N.h(lw.e.INFO, "Config selector from name resolver discarded by channel settings");
                    }
                    ((r2) this.f42445b).f42661c.P.h(e3Var.b());
                }
                lw.b bVar3 = ((lw.h1) this.f42446c).f40394b;
                r2 r2Var3 = (r2) this.f42445b;
                if (r2Var3.f42659a == r2Var3.f42661c.f42838x) {
                    bVar3.getClass();
                    ob.l lVar = new ob.l(bVar3, 20);
                    if (((lw.b) lVar.f44822b).f40343a.containsKey(aVar)) {
                        IdentityHashMap identityHashMap = new IdentityHashMap(((lw.b) lVar.f44822b).f40343a);
                        identityHashMap.remove(aVar);
                        lVar.f44822b = new lw.b(identityHashMap);
                    }
                    IdentityHashMap identityHashMap2 = (IdentityHashMap) lVar.f44823c;
                    if (identityHashMap2 != null) {
                        identityHashMap2.remove(aVar);
                    }
                    Map map = e3Var.f42412f;
                    if (map != null) {
                        lVar.C(lw.q0.f40428b, map);
                        lVar.u();
                    }
                    lw.b bVarU = lVar.u();
                    ob.i iVar = ((r2) this.f42445b).f42659a.f42647d;
                    lw.b bVar4 = lw.b.f40342b;
                    lw.n0 n0Var = new lw.n0(list3, bVarU, e3Var.f42411e);
                    q2 q2Var2 = (q2) iVar.f44813b;
                    i5 i5Var = (i5) n0Var.f40424c;
                    if (i5Var == null) {
                        try {
                            r5 r5Var = (r5) iVar.f44816e;
                            String str2 = (String) r5Var.f42668b;
                            lw.r0 r0VarB = ((lw.s0) r5Var.f42667a).b(str2);
                            if (r0VarB == null) {
                                throw new i("Trying to load '" + str2 + "' because using default policy, but it's unavailable");
                            }
                            i5Var = new i5(r0VarB, null);
                        } catch (i e12) {
                            q2Var2.q(lw.n.TRANSIENT_FAILURE, new lw.l0(lw.q1.f40441l.h(e12.getMessage()), z14 ? 1 : 0));
                            ((lw.q0) iVar.f44814c).f();
                            iVar.f44815d = null;
                            iVar.f44814c = new h();
                            q1VarA = lw.q1.f40434e;
                        }
                    }
                    Object obj2 = i5Var.f42471b;
                    lw.r0 r0Var = i5Var.f42470a;
                    if (((lw.r0) iVar.f44815d) == null || !r0Var.r().equals(((lw.r0) iVar.f44815d).r())) {
                        q2Var2.q(lw.n.CONNECTING, new g());
                        ((lw.q0) iVar.f44814c).f();
                        iVar.f44815d = r0Var;
                        lw.q0 q0Var = (lw.q0) iVar.f44814c;
                        iVar.f44814c = r0Var.g(q2Var2);
                        q2Var2.f42648e.N.i(lw.e.INFO, "Load balancer changed from {0} to {1}", q0Var.getClass().getSimpleName(), ((lw.q0) iVar.f44814c).getClass().getSimpleName());
                    }
                    if (obj2 != null) {
                        q2Var2.f42648e.N.i(lw.e.DEBUG, "Load-balancing config: {0}", obj2);
                    }
                    q1VarA = ((lw.q0) iVar.f44814c).a(new lw.n0(n0Var.f40422a, n0Var.f40423b, obj2));
                    if (z4Var != null) {
                        b5 b5Var2 = z4Var.f42878a;
                        j jVar2 = b5Var2.f42364e;
                        if (!q1VarA.f()) {
                            jVar2.a(new aj.i(b5Var2, i12));
                            return;
                        }
                        lw.t1 t1Var3 = jVar2.f42474b;
                        t1Var3.d();
                        t1Var3.execute(new lf.i0(jVar2, i11));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                t2 t2Var = (t2) this.f42446c;
                u2 u2Var2 = (u2) this.f42445b;
                y2 y2Var7 = u2Var2.f42716d;
                if (u2Var2.f42713a.get() != y2.f42812h0) {
                    t2Var.u();
                    return;
                }
                if (y2Var7.B == null) {
                    y2Var7.B = new LinkedHashSet();
                    y2Var7.Z.r0(y2Var7.C, true);
                }
                y2Var7.B.add(t2Var);
                return;
            case 20:
                ((t) this.f42446c).run();
                t2 t2Var2 = (t2) this.f42445b;
                t2Var2.f42695r.f42716d.m.execute(new aj.i(t2Var2, 16));
                return;
            case 21:
                synchronized (((n2) ((i0) this.f42445b).f42445b).K) {
                    try {
                        i0 i0Var = (i0) this.f42445b;
                        if (((ie.o) i0Var.f42446c).f34405b) {
                            objArr = 1;
                        } else {
                            n2 n2Var = (n2) i0Var.f42445b;
                            n2Var.Q = n2Var.Q.a((w4) this.f42446c);
                            n2 n2Var2 = (n2) ((i0) this.f42445b).f42445b;
                            if (n2Var2.t(n2Var2.Q)) {
                                x4 x4Var = ((n2) ((i0) this.f42445b).f42445b).O;
                                if (x4Var != null) {
                                    if (x4Var.f42799d.get() <= x4Var.f42797b) {
                                        c11 = 0;
                                    }
                                    if (c11 == 0) {
                                        n2 n2Var3 = (n2) ((i0) this.f42445b).f42445b;
                                        t4Var = n2Var3.Q;
                                        if (t4Var.f42707h) {
                                            t4Var = new t4(t4Var.f42701b, t4Var.f42702c, t4Var.f42703d, t4Var.f42705f, t4Var.f42706g, t4Var.f42700a, true, t4Var.f42704e);
                                        }
                                        n2Var3.Q = t4Var;
                                        ((n2) ((i0) this.f42445b).f42445b).Y = null;
                                    }
                                }
                                n2 n2Var4 = (n2) ((i0) this.f42445b).f42445b;
                                oVar = new ie.o(n2Var4.K);
                                n2Var4.Y = oVar;
                            } else {
                                n2 n2Var5 = (n2) ((i0) this.f42445b).f42445b;
                                t4Var = n2Var5.Q;
                                if (t4Var.f42707h) {
                                    t4Var = new t4(t4Var.f42701b, t4Var.f42702c, t4Var.f42703d, t4Var.f42705f, t4Var.f42706g, t4Var.f42700a, true, t4Var.f42704e);
                                }
                                n2Var5.Q = t4Var;
                                ((n2) ((i0) this.f42445b).f42445b).Y = null;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                if (objArr != 0) {
                    w4 w4Var = (w4) this.f42446c;
                    w4Var.f42777a.n(new r5((n2) ((i0) this.f42445b).f42445b, w4Var));
                    ((w4) this.f42446c).f42777a.p(lw.q1.f40435f.h("Unneeded hedging"));
                    return;
                } else {
                    if (oVar != null) {
                        n2 n2Var6 = (n2) ((i0) this.f42445b).f42445b;
                        oVar.g(n2Var6.f42577d.schedule(new i0(i12, n2Var6, oVar), n2Var6.f42583t.f42565b, TimeUnit.NANOSECONDS));
                    }
                    ((n2) ((i0) this.f42445b).f42445b).m((w4) this.f42446c);
                    return;
                }
            case 22:
                a();
                return;
            case 23:
                b();
                return;
            default:
                ((n2) ((r5) this.f42445b).f42668b).W.e((dm.a) this.f42446c);
                return;
        }
    }

    public i0(w0 w0Var, lw.y yVar) {
        this.f42444a = 13;
        this.f42445b = w0Var;
        Preconditions.k(yVar, "savedListener");
        this.f42446c = yVar;
    }
}
