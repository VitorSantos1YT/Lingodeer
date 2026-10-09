package mw;

import com.google.common.base.Preconditions;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n2 implements w {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final lw.x0 f42567g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final lw.x0 f42568h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final lw.q1 f42569i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Random f42570j0;
    public final boolean H;
    public final Object K;
    public final f L;
    public final long M;
    public final long N;
    public final x4 O;
    public final l2.f P;
    public volatile t4 Q;
    public final AtomicBoolean R;
    public final AtomicInteger S;
    public final AtomicInteger T;
    public xq.c U;
    public long V;
    public y W;
    public ie.o X;
    public ie.o Y;
    public long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.e1 f42571a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public lw.q1 f42572a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f42573b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f42574b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lw.t1 f42575c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final /* synthetic */ lw.e1 f42576c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f42577d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final /* synthetic */ lw.c f42578d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lw.c1 f42579e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final /* synthetic */ lw.r f42580e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y4 f42581f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final /* synthetic */ g0 f42582f0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n1 f42583t;

    static {
        lw.k kVar = lw.c1.f40362d;
        BitSet bitSet = lw.z0.f40493d;
        f42567g0 = new lw.x0("grpc-previous-rpc-attempts", kVar);
        f42568h0 = new lw.x0("grpc-retry-pushback-ms", kVar);
        f42569i0 = lw.q1.f40435f.h("Stream thrown away because RetriableStream committed");
        f42570j0 = new Random();
    }

    public n2(g0 g0Var, lw.e1 e1Var, lw.c1 c1Var, lw.c cVar, y4 y4Var, n1 n1Var, lw.r rVar) {
        this.f42582f0 = g0Var;
        this.f42576c0 = e1Var;
        this.f42578d0 = cVar;
        this.f42580e0 = rVar;
        y2 y2Var = (y2) g0Var.f42424b;
        f fVar = y2Var.U;
        long j11 = y2Var.V;
        long j12 = y2Var.W;
        Executor executor = cVar.f40350b;
        executor = executor == null ? y2Var.f42823h : executor;
        ScheduledExecutorService scheduledExecutorService = y2Var.f42821f.f42519a.f44211d;
        x4 x4Var = (x4) g0Var.f42423a;
        this.f42575c = new lw.t1(new j4());
        this.K = new Object();
        this.P = new l2.f(1);
        this.Q = new t4(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.R = new AtomicBoolean();
        this.S = new AtomicInteger();
        this.T = new AtomicInteger();
        this.f42571a = e1Var;
        this.L = fVar;
        this.M = j11;
        this.N = j12;
        this.f42573b = executor;
        this.f42577d = scheduledExecutorService;
        this.f42579e = c1Var;
        this.f42581f = y4Var;
        if (y4Var != null) {
            this.Z = y4Var.f42843b;
        }
        this.f42583t = n1Var;
        Preconditions.e("Should not provide both retryPolicy and hedgingPolicy", y4Var == null || n1Var == null);
        this.H = n1Var != null;
        this.O = x4Var;
    }

    public static void a(n2 n2Var, Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            n2Var.o();
            return;
        }
        synchronized (n2Var.K) {
            try {
                ie.o oVar = n2Var.Y;
                if (oVar == null) {
                    return;
                }
                oVar.f34405b = true;
                Future future = (Future) oVar.f34407d;
                ie.o oVar2 = new ie.o(n2Var.K);
                n2Var.Y = oVar2;
                if (future != null) {
                    future.cancel(false);
                }
                oVar2.g(n2Var.f42577d.schedule(new i0(22, n2Var, oVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final k4 b(w4 w4Var) {
        List list;
        boolean z11;
        Collection collectionSingleton;
        Future future;
        Future future2;
        synchronized (this.K) {
            try {
                if (this.Q.f42705f != null) {
                    return null;
                }
                Collection collection = this.Q.f42702c;
                t4 t4Var = this.Q;
                Preconditions.p("Already committed", t4Var.f42705f == null);
                List list2 = t4Var.f42701b;
                if (t4Var.f42702c.contains(w4Var)) {
                    list = null;
                    collectionSingleton = Collections.singleton(w4Var);
                    z11 = true;
                } else {
                    list = list2;
                    z11 = false;
                    collectionSingleton = Collections.EMPTY_LIST;
                }
                this.Q = new t4(list, collectionSingleton, t4Var.f42703d, w4Var, t4Var.f42706g, z11, t4Var.f42707h, t4Var.f42704e);
                this.L.f42418a.addAndGet(-this.V);
                ie.o oVar = this.X;
                if (oVar != null) {
                    oVar.f34405b = true;
                    Future future3 = (Future) oVar.f34407d;
                    this.X = null;
                    future = future3;
                } else {
                    future = null;
                }
                ie.o oVar2 = this.Y;
                if (oVar2 != null) {
                    oVar2.f34405b = true;
                    Future future4 = (Future) oVar2.f34407d;
                    this.Y = null;
                    future2 = future4;
                } else {
                    future2 = null;
                }
                return new k4(this, collection, w4Var, future, future2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mw.o5
    public final void c(lw.l lVar) {
        i(new l4(lVar, 0));
    }

    @Override // mw.w
    public final void d(int i11) {
        i(new n4(i11, 1));
    }

    @Override // mw.o5
    public final void e() {
        t4 t4Var = this.Q;
        if (t4Var.f42700a) {
            t4Var.f42705f.f42777a.e();
        } else {
            i(new m4(3));
        }
    }

    @Override // mw.o5
    public final boolean f() {
        Iterator it = this.Q.f42702c.iterator();
        while (it.hasNext()) {
            if (((w4) it.next()).f42777a.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // mw.o5
    public final void flush() {
        t4 t4Var = this.Q;
        if (t4Var.f42700a) {
            t4Var.f42705f.f42777a.flush();
        } else {
            i(new m4(0));
        }
    }

    public final w4 g(int i11, boolean z11) {
        AtomicInteger atomicInteger;
        int i12;
        do {
            atomicInteger = this.T;
            i12 = atomicInteger.get();
            if (i12 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i12, i12 + 1));
        w4 w4Var = new w4(i11);
        p4 p4Var = new p4(new r4(this, w4Var));
        lw.c1 c1Var = new lw.c1();
        c1Var.d(this.f42579e);
        if (i11 > 0) {
            c1Var.e(f42567g0, String.valueOf(i11));
        }
        lw.c cVar = this.f42578d0;
        cVar.getClass();
        List list = cVar.f40352d;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(p4Var);
        r.x2 x2VarB = lw.c.b(cVar);
        x2VarB.f48712d = Collections.unmodifiableList(arrayList);
        lw.c cVar2 = new lw.c(x2VarB);
        lw.j[] jVarArrC = k1.c(cVar2, c1Var, i11, z11);
        lw.e1 e1Var = this.f42576c0;
        z zVarB = this.f42582f0.b(new b4(e1Var, c1Var, cVar2));
        lw.r rVar = this.f42580e0;
        lw.r rVarA = rVar.a();
        try {
            w wVarB = zVarB.b(e1Var, c1Var, cVar2, jVarArrC);
            rVar.c(rVarA);
            w4Var.f42777a = wVarB;
            return w4Var;
        } catch (Throwable th2) {
            rVar.c(rVarA);
            throw th2;
        }
    }

    @Override // mw.w
    public final void h() {
        i(new m4(1));
    }

    public final void i(q4 q4Var) {
        Collection collection;
        synchronized (this.K) {
            try {
                if (!this.Q.f42700a) {
                    this.Q.f42701b.add(q4Var);
                }
                collection = this.Q.f42702c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            q4Var.a((w4) it.next());
        }
    }

    @Override // mw.o5
    public final void j(qw.a aVar) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // mw.w
    public final void k(l2.f fVar) {
        t4 t4Var;
        synchronized (this.K) {
            fVar.a(this.P, "closed");
            t4Var = this.Q;
        }
        if (t4Var.f42705f != null) {
            l2.f fVar2 = new l2.f(1);
            t4Var.f42705f.f42777a.k(fVar2);
            fVar.a(fVar2, "committed");
            return;
        }
        l2.f fVar3 = new l2.f(1);
        for (w4 w4Var : t4Var.f42702c) {
            l2.f fVar4 = new l2.f(1);
            w4Var.f42777a.k(fVar4);
            fVar3.f39601b.add(String.valueOf(fVar4));
        }
        fVar.a(fVar3, "open");
    }

    @Override // mw.w
    public final void l(int i11) {
        i(new n4(i11, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
    
        if (r5 >= r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0092, code lost:
    
        r6 = r3.get(r5);
        r5 = r5 + 1;
        r6 = (mw.q4) r6;
        r6.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
    
        if ((r6 instanceof mw.s4) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
    
        r6 = r9.Q;
        r8 = r6.f42705f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
    
        if (r8 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
    
        if (r8 == r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r6.f42706g == false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(mw.w4 r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.K
            monitor-enter(r5)
            mw.t4 r6 = r9.Q     // Catch: java.lang.Throwable -> L12
            mw.w4 r7 = r6.f42705f     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L15
            if (r7 == r10) goto L15
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            goto L39
        L12:
            r10 = move-exception
            goto Lb2
        L15:
            boolean r7 = r6.f42706g     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L1b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            goto L39
        L1b:
            java.util.List r7 = r6.f42701b     // Catch: java.lang.Throwable -> L12
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L12
            if (r2 != r7) goto L5e
            mw.t4 r0 = r6.e(r10)     // Catch: java.lang.Throwable -> L12
            r9.Q = r0     // Catch: java.lang.Throwable -> L12
            boolean r0 = r9.f()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L31
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L31:
            aj.i r1 = new aj.i     // Catch: java.lang.Throwable -> L12
            r0 = 20
            r1.<init>(r9, r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
        L39:
            if (r1 == 0) goto L41
            lw.t1 r10 = r9.f42575c
            r10.execute(r1)
            return
        L41:
            if (r4 != 0) goto L4d
            mw.w r0 = r10.f42777a
            mw.r5 r1 = new mw.r5
            r1.<init>(r9, r10)
            r0.n(r1)
        L4d:
            mw.w r0 = r10.f42777a
            mw.t4 r1 = r9.Q
            mw.w4 r1 = r1.f42705f
            if (r1 != r10) goto L58
            lw.q1 r10 = r9.f42572a0
            goto L5a
        L58:
            lw.q1 r10 = mw.n2.f42569i0
        L5a:
            r0.p(r10)
            return
        L5e:
            boolean r7 = r10.f42778b     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L64
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L64:
            int r7 = r2 + 128
            java.util.List r8 = r6.f42701b     // Catch: java.lang.Throwable -> L12
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L12
            int r7 = java.lang.Math.min(r7, r8)     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L7e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12
            java.util.List r6 = r6.f42701b     // Catch: java.lang.Throwable -> L12
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> L12
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L12
            goto L8a
        L7e:
            r3.clear()     // Catch: java.lang.Throwable -> L12
            java.util.List r6 = r6.f42701b     // Catch: java.lang.Throwable -> L12
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> L12
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L12
        L8a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.size()
            r5 = r0
        L90:
            if (r5 >= r2) goto Laf
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            mw.q4 r6 = (mw.q4) r6
            r6.a(r10)
            boolean r6 = r6 instanceof mw.s4
            if (r6 == 0) goto La2
            r4 = 1
        La2:
            mw.t4 r6 = r9.Q
            mw.w4 r8 = r6.f42705f
            if (r8 == 0) goto Lab
            if (r8 == r10) goto Lab
            goto Laf
        Lab:
            boolean r6 = r6.f42706g
            if (r6 == 0) goto L90
        Laf:
            r2 = r7
            goto L5
        Lb2:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mw.n2.m(mw.w4):void");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:27:0x0047, B:29:0x0057, B:31:0x005b, B:35:0x0068, B:38:0x0074), top: B:50:0x0047 }] */
    @Override // mw.w
    public final void n(y yVar) {
        lw.q1 q1Var;
        ie.o oVar;
        this.W = yVar;
        ob.i iVar = ((y2) this.f42582f0.f42424b).F;
        synchronized (iVar.f44813b) {
            try {
                q1Var = (lw.q1) iVar.f44815d;
                oVar = null;
                if (q1Var == null) {
                    ((HashSet) iVar.f44814c).add(this);
                    q1Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (q1Var != null) {
            p(q1Var);
            return;
        }
        synchronized (this.K) {
            this.Q.f42701b.add(new s4(this));
        }
        w4 w4VarG = g(0, false);
        if (w4VarG == null) {
            return;
        }
        if (this.H) {
            synchronized (this.K) {
                try {
                    this.Q = this.Q.a(w4VarG);
                    if (t(this.Q)) {
                        x4 x4Var = this.O;
                        if (x4Var == null) {
                            oVar = new ie.o(this.K);
                            this.Y = oVar;
                        } else {
                            if (x4Var.f42799d.get() > x4Var.f42797b) {
                                oVar = new ie.o(this.K);
                                this.Y = oVar;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (oVar != null) {
                oVar.g(this.f42577d.schedule(new i0(22, this, oVar), this.f42583t.f42565b, TimeUnit.NANOSECONDS));
            }
        }
        m(w4VarG);
    }

    public final void o() {
        Future future;
        synchronized (this.K) {
            try {
                ie.o oVar = this.Y;
                future = null;
                if (oVar != null) {
                    oVar.f34405b = true;
                    Future future2 = (Future) oVar.f34407d;
                    this.Y = null;
                    future = future2;
                }
                t4 t4Var = this.Q;
                if (!t4Var.f42707h) {
                    t4Var = new t4(t4Var.f42701b, t4Var.f42702c, t4Var.f42703d, t4Var.f42705f, t4Var.f42706g, t4Var.f42700a, true, t4Var.f42704e);
                }
                this.Q = t4Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    @Override // mw.w
    public final void p(lw.q1 q1Var) {
        w4 w4Var;
        w4 w4Var2 = new w4(0);
        w4Var2.f42777a = new n3(0);
        k4 k4VarB = b(w4Var2);
        if (k4VarB != null) {
            synchronized (this.K) {
                this.Q = this.Q.e(w4Var2);
            }
            k4VarB.run();
            u(q1Var, x.PROCESSED, new lw.c1());
            return;
        }
        synchronized (this.K) {
            try {
                if (this.Q.f42702c.contains(this.Q.f42705f)) {
                    w4Var = this.Q.f42705f;
                } else {
                    this.f42572a0 = q1Var;
                    w4Var = null;
                }
                t4 t4Var = this.Q;
                this.Q = new t4(t4Var.f42701b, t4Var.f42702c, t4Var.f42703d, t4Var.f42705f, true, t4Var.f42700a, t4Var.f42707h, t4Var.f42704e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (w4Var != null) {
            w4Var.f42777a.p(q1Var);
        }
    }

    @Override // mw.o5
    public final void q() {
        i(new m4(2));
    }

    @Override // mw.w
    public final void r(lw.u uVar) {
        i(new l4(uVar, 2));
    }

    @Override // mw.w
    public final void s(lw.s sVar) {
        i(new l4(sVar, 1));
    }

    public final boolean t(t4 t4Var) {
        return t4Var.f42705f == null && t4Var.f42704e < this.f42583t.f42564a && !t4Var.f42707h;
    }

    public final void u(lw.q1 q1Var, x xVar, lw.c1 c1Var) {
        this.U = new xq.c(q1Var, xVar, c1Var, 22);
        if (this.T.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f42575c.execute(new a(this, q1Var, xVar, c1Var, 2));
        }
    }

    public final void v(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest) {
        t4 t4Var = this.Q;
        if (t4Var.f42700a) {
            t4Var.f42705f.f42777a.j(this.f42571a.c(fetchEligibleCampaignsRequest));
        } else {
            i(new o4(this, fetchEligibleCampaignsRequest));
        }
    }
}
