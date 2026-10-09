package mw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableMap;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y2 extends lw.t0 implements lw.e0 {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Logger f42807c0 = Logger.getLogger(y2.class.getName());

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Pattern f42808d0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final lw.q1 f42809e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final lw.q1 f42810f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final e3 f42811g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final l2 f42812h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final k0 f42813i0;
    public final HashSet A;
    public LinkedHashSet B;
    public final Object C;
    public final HashSet D;
    public final q0 E;
    public final ob.i F;
    public final AtomicBoolean G;
    public boolean H;
    public volatile boolean I;
    public final CountDownLatch J;
    public final n3 K;
    public final dm.c L;
    public final q M;
    public final n N;
    public final lw.c0 O;
    public final u2 P;
    public v2 Q;
    public e3 R;
    public boolean S;
    public final boolean T;
    public final f U;
    public final long V;
    public final long W;
    public final boolean X;
    public final lw.k Y;
    public final r1 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.f0 f42814a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final g0 f42815a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42816b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final i4 f42817b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lw.j1 f42818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lw.f1 f42819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r5 f42820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f42821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w2 f42822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f42823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lf.x0 f42824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f42825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f42826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n3 f42827l;
    public final lw.t1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lw.u f42828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final lw.m f42829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Supplier f42830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f42831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g0 f42832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n3 f42833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lw.d f42834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f42835u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f1 f42836v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f42837w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q2 f42838x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile lw.o0 f42839y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f42840z;

    static {
        lw.q1 q1Var = lw.q1.m;
        q1Var.h("Channel shutdownNow invoked");
        f42809e0 = q1Var.h("Channel shutdown invoked");
        f42810f0 = q1Var.h("Subchannel shutdown invoked");
        f42811g0 = new e3(null, new HashMap(), new HashMap(), null, null, null);
        f42812h0 = new l2();
        f42813i0 = new k0(1);
    }

    public y2(z2 z2Var, nw.i iVar, n3 n3Var, lf.x0 x0Var, Supplier supplier, ArrayList arrayList) {
        int i11;
        n3 n3Var2 = n3.f42585c;
        lw.t1 t1Var = new lw.t1(new bq.l(this, 1));
        this.m = t1Var;
        g0 g0Var = new g0();
        g0Var.f42424b = new ArrayList();
        g0Var.f42423a = lw.n.IDLE;
        this.f42832r = g0Var;
        this.A = new HashSet(16, 0.75f);
        this.C = new Object();
        this.D = new HashSet(1, 0.75f);
        this.F = new ob.i(this);
        this.G = new AtomicBoolean(false);
        this.J = new CountDownLatch(1);
        this.Q = v2.NO_RESOLUTION;
        this.R = f42811g0;
        this.S = false;
        this.U = new f(1);
        this.Y = lw.s.f40453d;
        lp.b bVar = new lp.b(this, 3);
        this.Z = new r1(this, 1);
        this.f42815a0 = new g0(this);
        String str = z2Var.f42858i;
        Preconditions.k(str, "target");
        this.f42816b = str;
        lw.f0 f0Var = new lw.f0("Channel", str, lw.f0.f40376d.incrementAndGet());
        this.f42814a = f0Var;
        this.f42827l = n3Var2;
        lf.x0 x0Var2 = z2Var.f42853d;
        Preconditions.k(x0Var2, "executorPool");
        this.f42824i = x0Var2;
        Executor executor = (Executor) m5.a((l5) x0Var2.f40130b);
        Preconditions.k(executor, "executor");
        this.f42823h = executor;
        lf.x0 x0Var3 = z2Var.f42854e;
        Preconditions.k(x0Var3, "offloadExecutorPool");
        p2 p2Var = new p2(x0Var3);
        this.f42826k = p2Var;
        l lVar = new l(iVar, p2Var);
        this.f42821f = lVar;
        w2 w2Var = new w2(iVar.f44211d);
        this.f42822g = w2Var;
        q qVar = new q(f0Var, n3Var2.t(), ep.a.g("Channel for '", str, "'"));
        this.M = qVar;
        n nVar = new n(qVar, n3Var2);
        this.N = nVar;
        c4 c4Var = k1.m;
        boolean z11 = z2Var.f42866r;
        this.X = z11;
        r5 r5Var = new r5(z2Var.f42859j);
        this.f42820e = r5Var;
        lw.j1 j1Var = z2Var.f42856g;
        this.f42818c = j1Var;
        c5 c5Var = new c5(z11, z2Var.f42862n, z2Var.f42863o, r5Var);
        nw.j jVar = (nw.j) z2Var.A.f43673b;
        jVar.getClass();
        int i12 = nw.g.f44207b[jVar.f44223j.ordinal()];
        if (i12 == 1) {
            i11 = 80;
        } else {
            if (i12 != 2) {
                throw new AssertionError(jVar.f44223j + " not handled");
            }
            i11 = 443;
        }
        Integer numValueOf = Integer.valueOf(i11);
        c4Var.getClass();
        lw.f1 f1Var = new lw.f1(numValueOf, c4Var, t1Var, c5Var, w2Var, nVar, p2Var);
        this.f42819d = f1Var;
        lVar.f42519a.getClass();
        this.f42836v = i(str, j1Var, f1Var, Collections.singleton(InetSocketAddress.class));
        this.f42825j = new p2(x0Var);
        q0 q0Var = new q0(executor, t1Var);
        this.E = q0Var;
        q0Var.a(bVar);
        this.f42833s = n3Var;
        boolean z12 = z2Var.f42868t;
        this.T = z12;
        u2 u2Var = new u2(this, this.f42836v.e());
        this.P = u2Var;
        int size = arrayList.size();
        int i13 = 0;
        lw.d gVar = u2Var;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            gVar = new lw.g(gVar, (rw.h) obj);
        }
        this.f42834t = gVar;
        this.f42835u = new ArrayList(z2Var.f42857h);
        Preconditions.k(supplier, "stopwatchSupplier");
        this.f42830p = supplier;
        long j11 = z2Var.m;
        if (j11 == -1) {
            this.f42831q = j11;
        } else {
            Preconditions.d(j11, "invalid idleTimeoutMillis %s", j11 >= z2.D);
            this.f42831q = z2Var.m;
        }
        this.f42817b0 = new i4(new aj.i(this, 13), t1Var, lVar.f42519a.f44211d, (Stopwatch) supplier.get());
        lw.u uVar = z2Var.f42860k;
        Preconditions.k(uVar, "decompressorRegistry");
        this.f42828n = uVar;
        lw.m mVar = z2Var.f42861l;
        Preconditions.k(mVar, "compressorRegistry");
        this.f42829o = mVar;
        this.W = z2Var.f42864p;
        this.V = z2Var.f42865q;
        this.K = new n3(15);
        this.L = new dm.c(9);
        lw.c0 c0Var = z2Var.f42867s;
        c0Var.getClass();
        this.O = c0Var;
        if (z12) {
            return;
        }
        this.S = true;
    }

    public static void g(y2 y2Var) {
        if (!y2Var.I && y2Var.G.get() && y2Var.A.isEmpty() && y2Var.D.isEmpty()) {
            y2Var.N.h(lw.e.INFO, "Terminated");
            y2Var.f42824i.F(y2Var.f42823h);
            y2Var.f42825j.a();
            y2Var.f42826k.a();
            y2Var.f42821f.close();
            y2Var.I = true;
            y2Var.J.countDown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f1 i(String str, lw.j1 j1Var, lw.f1 f1Var, Collection collection) {
        URI uri;
        lw.i1 i1Var;
        lw.f1 f1Var2;
        String str2;
        String str3;
        String str4;
        ImmutableMap immutableMap;
        ImmutableMap immutableMap2;
        StringBuilder sb2 = new StringBuilder();
        w0 w0Var = null;
        try {
            uri = new URI(str);
        } catch (URISyntaxException e8) {
            sb2.append(e8.getMessage());
            uri = null;
        }
        if (uri == null) {
            i1Var = null;
        } else {
            String scheme = uri.getScheme();
            if (scheme == null) {
                j1Var.getClass();
                i1Var = null;
            } else {
                synchronized (j1Var) {
                    immutableMap2 = j1Var.f40406c;
                }
                i1Var = (lw.i1) immutableMap2.get(scheme.toLowerCase(Locale.US));
            }
        }
        if (i1Var == null && !f42808d0.matcher(str).matches()) {
            try {
                synchronized (j1Var) {
                    str4 = j1Var.f40404a;
                }
                uri = new URI(str4, BuildConfig.VERSION_NAME, "/" + str, null);
                String scheme2 = uri.getScheme();
                if (scheme2 == null) {
                    i1Var = null;
                } else {
                    synchronized (j1Var) {
                        immutableMap = j1Var.f40406c;
                    }
                    i1Var = (lw.i1) immutableMap.get(scheme2.toLowerCase(Locale.US));
                }
            } catch (URISyntaxException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        if (i1Var == null) {
            if (sb2.length() > 0) {
                str3 = " (" + ((Object) sb2) + ")";
            } else {
                str3 = BuildConfig.VERSION_NAME;
            }
            throw new IllegalArgumentException(ep.a.g("Could not find a NameResolverProvider for ", str, str3));
        }
        if (collection != null && !collection.containsAll(Collections.singleton(InetSocketAddress.class))) {
            throw new IllegalArgumentException(ep.a.h("Address types of NameResolver '", uri.getScheme(), "' for '", str, "' not supported by transport"));
        }
        if ("dns".equals(uri.getScheme())) {
            String path = uri.getPath();
            Preconditions.k(path, "targetPath");
            Preconditions.h(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
            String strSubstring = path.substring(1);
            uri.getAuthority();
            f1Var2 = f1Var;
            w0Var = new w0(strSubstring, f1Var2, k1.f42501p, new Stopwatch(), x0.f42781a);
        } else {
            f1Var2 = f1Var;
        }
        if (w0Var != null) {
            n3 n3Var = new n3(9);
            w2 w2Var = f1Var2.f40384e;
            if (w2Var == null) {
                throw new IllegalStateException("ScheduledExecutorService not set in Builder");
            }
            lw.t1 t1Var = f1Var2.f40382c;
            return new b5(w0Var, new j(n3Var, w2Var, t1Var), t1Var);
        }
        if (sb2.length() > 0) {
            str2 = " (" + ((Object) sb2) + ")";
        } else {
            str2 = BuildConfig.VERSION_NAME;
        }
        throw new IllegalArgumentException(ep.a.g("cannot create a NameResolver for ", str, str2));
    }

    @Override // lw.e0
    public final lw.f0 d() {
        return this.f42814a;
    }

    @Override // lw.d
    public final String e() {
        return this.f42834t.e();
    }

    @Override // lw.d
    public final lw.f f(lw.e1 e1Var, lw.c cVar) {
        return this.f42834t.f(e1Var, cVar);
    }

    public final void h() {
        this.m.d();
        if (this.G.get() || this.f42840z) {
            return;
        }
        if (((Set) this.Z.f3561b).isEmpty()) {
            j();
        } else {
            this.f42817b0.f42468f = false;
        }
        if (this.f42838x != null) {
            return;
        }
        this.N.h(lw.e.INFO, "Exiting idle mode");
        q2 q2Var = new q2(this);
        r5 r5Var = this.f42820e;
        r5Var.getClass();
        q2Var.f42647d = new ob.i(r5Var, q2Var);
        this.f42838x = q2Var;
        this.f42836v.o(new r2(this, q2Var, this.f42836v));
        this.f42837w = true;
    }

    public final void j() {
        long j11 = this.f42831q;
        if (j11 == -1) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i4 i4Var = this.f42817b0;
        i4Var.getClass();
        long nanos = timeUnit.toNanos(j11);
        Stopwatch stopwatch = i4Var.f42466d;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jA = stopwatch.a() + nanos;
        i4Var.f42468f = true;
        if (jA - i4Var.f42467e < 0 || i4Var.f42469g == null) {
            ScheduledFuture scheduledFuture = i4Var.f42469g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            i4Var.f42469g = i4Var.f42463a.schedule(new h4(i4Var, 1), nanos, timeUnit2);
        }
        i4Var.f42467e = jA;
    }

    public final void k(boolean z11) {
        this.m.d();
        if (z11) {
            Preconditions.p("nameResolver is not started", this.f42837w);
            Preconditions.p("lbHelper is null", this.f42838x != null);
        }
        f1 f1Var = this.f42836v;
        if (f1Var != null) {
            f1Var.n();
            this.f42837w = false;
            if (z11) {
                String str = this.f42816b;
                lw.j1 j1Var = this.f42818c;
                lw.f1 f1Var2 = this.f42819d;
                this.f42821f.f42519a.getClass();
                this.f42836v = i(str, j1Var, f1Var2, Collections.singleton(InetSocketAddress.class));
            } else {
                this.f42836v = null;
            }
        }
        q2 q2Var = this.f42838x;
        if (q2Var != null) {
            ob.i iVar = q2Var.f42647d;
            ((lw.q0) iVar.f44814c).f();
            iVar.f44814c = null;
            this.f42838x = null;
        }
        this.f42839y = null;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.b(this.f42814a.f40379c, "logId");
        toStringHelperB.c(this.f42816b, "target");
        return toStringHelperB.toString();
    }
}
