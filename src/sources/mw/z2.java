package mw;

import com.google.common.base.Preconditions;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z2 extends lw.f {
    public static final Logger B;
    public static final long C;
    public static final long D;
    public static final lf.x0 E;
    public static final lw.u F;
    public static final lw.m G;
    public static final Method H;
    public final n9.q A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lf.x0 f42853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lf.x0 f42854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f42855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lw.j1 f42856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f42857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f42858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f42859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final lw.u f42860k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lw.m f42861l;
    public final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f42862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f42863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f42864p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f42865q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f42866r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lw.c0 f42867s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f42868t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f42869u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f42870v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f42871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f42872x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f42873y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a5.f f42874z;

    public z2(String str, a5.f fVar, n9.q qVar) {
        lw.j1 j1Var;
        lf.x0 x0Var = E;
        this.f42853d = x0Var;
        this.f42854e = x0Var;
        this.f42855f = new ArrayList();
        Logger logger = lw.j1.f40402d;
        synchronized (lw.j1.class) {
            try {
                if (lw.j1.f40403e == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z11 = x0.f42781a;
                        arrayList.add(x0.class);
                    } catch (ClassNotFoundException e8) {
                        lw.j1.f40402d.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e8);
                    }
                    List<lw.i1> listF = lw.y.f(lw.i1.class, Collections.unmodifiableList(arrayList), lw.i1.class.getClassLoader(), new lw.k(9));
                    if (listF.isEmpty()) {
                        lw.j1.f40402d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    lw.j1.f40403e = new lw.j1();
                    for (lw.i1 i1Var : listF) {
                        lw.j1.f40402d.fine("Service loader found " + i1Var);
                        lw.j1 j1Var2 = lw.j1.f40403e;
                        synchronized (j1Var2) {
                            i1Var.getClass();
                            j1Var2.f40405b.add(i1Var);
                        }
                    }
                    lw.j1.f40403e.a();
                }
                j1Var = lw.j1.f40403e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f42856g = j1Var;
        this.f42857h = new ArrayList();
        this.f42859j = "pick_first";
        this.f42860k = F;
        this.f42861l = G;
        this.m = C;
        this.f42862n = 5;
        this.f42863o = 5;
        this.f42864p = 16777216L;
        this.f42865q = 1048576L;
        this.f42866r = true;
        this.f42867s = lw.c0.f40357e;
        this.f42868t = true;
        this.f42869u = true;
        this.f42870v = true;
        this.f42871w = true;
        this.f42872x = true;
        this.f42873y = true;
        Preconditions.k(str, "target");
        this.f42858i = str;
        this.f42874z = fVar;
        this.A = qVar;
    }

    static {
        Method declaredMethod;
        String str = ealNNtLp.zStYAIYB;
        B = Logger.getLogger(z2.class.getName());
        C = TimeUnit.MINUTES.toMillis(30L);
        D = TimeUnit.SECONDS.toMillis(1L);
        E = new lf.x0(k1.f42501p, 4);
        F = lw.u.f40474d;
        G = lw.m.f40415b;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e8) {
            B.log(Level.FINE, str, (Throwable) e8);
            declaredMethod = null;
        } catch (NoSuchMethodException e10) {
            B.log(Level.FINE, str, (Throwable) e10);
            declaredMethod = null;
        }
        H = declaredMethod;
    }
}
