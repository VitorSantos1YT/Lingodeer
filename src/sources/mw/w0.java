package mw;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Throwables;
import com.google.common.base.Verify;
import com.google.common.base.VerifyException;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends lw.f {
    public static String A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Logger f42751v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Set f42752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final boolean f42753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final boolean f42754y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final boolean f42755z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lw.m1 f42756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f42757e = new Random();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile u0 f42758f = u0.INSTANCE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f42759g = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f42760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f42761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f42762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l5 f42763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f42764l;
    public final lw.t1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Stopwatch f42765n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f42766o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f42767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Executor f42768q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f42769r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c5 f42770s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f42771t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public lw.y f42772u;

    static {
        Logger logger = Logger.getLogger(w0.class.getName());
        f42751v = logger;
        f42752w = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f42753x = Boolean.parseBoolean(property);
        f42754y = Boolean.parseBoolean(property2);
        f42755z = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    if (Class.forName("mw.b2", true, w0.class.getClassLoader()).asSubclass(v0.class).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Exception e8) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e8);
                }
            } catch (Exception e10) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e10);
            }
        } catch (ClassCastException e11) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e11);
        } catch (ClassNotFoundException e12) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e12);
        }
    }

    public w0(String str, lw.f1 f1Var, l5 l5Var, Stopwatch stopwatch, boolean z11) {
        Preconditions.k(f1Var, "args");
        this.f42763k = l5Var;
        Preconditions.k(str, "name");
        URI uriCreate = URI.create("//".concat(str));
        Preconditions.f("Invalid DNS name: %s", uriCreate.getHost() != null, str);
        String authority = uriCreate.getAuthority();
        Preconditions.j(authority, uriCreate, "nameUri (%s) doesn't have an authority");
        this.f42760h = authority;
        this.f42761i = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f42762j = f1Var.f40380a;
        } else {
            this.f42762j = uriCreate.getPort();
        }
        lw.m1 m1Var = f1Var.f40381b;
        Preconditions.k(m1Var, "proxyDetector");
        this.f42756d = m1Var;
        long nanos = 0;
        if (!z11) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j11 = 30;
            if (property != null) {
                try {
                    j11 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f42751v.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j11 > 0 ? TimeUnit.SECONDS.toNanos(j11) : j11;
        }
        this.f42764l = nanos;
        this.f42765n = stopwatch;
        lw.t1 t1Var = f1Var.f40382c;
        Preconditions.k(t1Var, "syncContext");
        this.m = t1Var;
        p2 p2Var = f1Var.f40386g;
        this.f42768q = p2Var;
        this.f42769r = p2Var == null;
        c5 c5Var = f1Var.f40383d;
        Preconditions.k(c5Var, "serviceConfigParser");
        this.f42770s = c5Var;
    }

    public static Map s(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            Verify.a("Bad key: %s", f42752w.contains(entry.getKey()), entry);
        }
        List listD = e2.d("clientLanguage", map);
        if (listD != null && !listD.isEmpty()) {
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dE = e2.e("percentage", map);
        if (dE != null) {
            int iIntValue = dE.intValue();
            Verify.a("Bad percentage: %s", iIntValue >= 0 && iIntValue <= 100, dE);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listD2 = e2.d("clientHostname", map);
        if (listD2 != null && !listD2.isEmpty()) {
            Iterator it2 = listD2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapG = e2.g("serviceConfig", map);
        if (mapG != null) {
            return mapG;
        }
        throw new VerifyException(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static ArrayList t() {
        List<String> list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("grpc_config=")) {
                String strSubstring = str.substring(12);
                Logger logger = d2.f42389a;
                JsonReader jsonReader = new JsonReader(new StringReader(strSubstring));
                try {
                    Object objA = d2.a(jsonReader);
                    try {
                        jsonReader.close();
                    } catch (IOException e8) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e8);
                    }
                    if (!(objA instanceof List)) {
                        throw new ClassCastException(hh.p0.k(objA, "wrong type "));
                    }
                    List list2 = (List) objA;
                    e2.a(list2);
                    arrayList.addAll(list2);
                } catch (Throwable th2) {
                    try {
                        jsonReader.close();
                    } catch (IOException e10) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e10);
                    }
                    throw th2;
                }
            } else {
                f42751v.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // lw.f
    public final String e() {
        return this.f42760h;
    }

    @Override // lw.f
    public final void j() {
        Preconditions.p("not started", this.f42772u != null);
        u();
    }

    @Override // lw.f
    public final void n() {
        if (this.f42767p) {
            return;
        }
        this.f42767p = true;
        Executor executor = this.f42768q;
        if (executor == null || !this.f42769r) {
            return;
        }
        m5.b(this.f42763k, executor);
        this.f42768q = null;
    }

    @Override // lw.f
    public final void o(lw.y yVar) {
        Preconditions.p("already started", this.f42772u == null);
        if (this.f42769r) {
            this.f42768q = (Executor) m5.a(this.f42763k);
        }
        this.f42772u = yVar;
        u();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public final ob.m r() {
        boolean z11;
        lw.g1 g1Var;
        lw.g1 g1Var2;
        List listU;
        lw.g1 g1Var3;
        String str = this.f42761i;
        ob.m mVar = new ob.m(22, false);
        try {
            mVar.f44827c = v();
            if (!f42755z) {
                return mVar;
            }
            List list = Collections.EMPTY_LIST;
            int i11 = 0;
            if (!f42753x) {
                z11 = false;
            } else if ("localhost".equalsIgnoreCase(str)) {
                z11 = f42754y;
            } else if (str.contains(":")) {
                z11 = false;
            } else {
                boolean z12 = true;
                for (int i12 = 0; i12 < str.length(); i12++) {
                    char cCharAt = str.charAt(i12);
                    if (cCharAt != '.') {
                        z12 &= cCharAt >= '0' && cCharAt <= '9';
                    }
                }
                z11 = true ^ z12;
            }
            if (z11 && this.f42759g.get() != null) {
                throw new ClassCastException();
            }
            Object g1Var4 = null;
            if (list.isEmpty()) {
                f42751v.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
            } else {
                Random random = this.f42757e;
                if (A == null) {
                    try {
                        A = InetAddress.getLocalHost().getHostName();
                    } catch (UnknownHostException e8) {
                        throw new RuntimeException(e8);
                    }
                }
                String str2 = A;
                try {
                    ArrayList arrayListT = t();
                    int size = arrayListT.size();
                    Map mapS = null;
                    while (i11 < size) {
                        Object obj = arrayListT.get(i11);
                        i11++;
                        try {
                            mapS = s((Map) obj, random, str2);
                            if (mapS != null) {
                                break;
                            }
                        } catch (RuntimeException e10) {
                            g1Var = new lw.g1(lw.q1.f40436g.h("failed to pick service config choice").g(e10));
                        }
                    }
                    g1Var = mapS == null ? null : new lw.g1(mapS);
                } catch (IOException | RuntimeException e11) {
                    g1Var = new lw.g1(lw.q1.f40436g.h("failed to parse TXT records").g(e11));
                }
                if (g1Var != null) {
                    lw.q1 q1Var = g1Var.f40389a;
                    if (q1Var != null) {
                        g1Var4 = new lw.g1(q1Var);
                    } else {
                        Map map = (Map) g1Var.f40390b;
                        c5 c5Var = this.f42770s;
                        c5Var.getClass();
                        try {
                            r5 r5Var = c5Var.f42388d;
                            r5Var.getClass();
                            if (map != null) {
                                try {
                                    listU = j5.u(j5.g(map));
                                } catch (RuntimeException e12) {
                                    g1Var3 = new lw.g1(lw.q1.f40436g.h("can't parse load balancer configuration").g(e12));
                                }
                            } else {
                                listU = null;
                            }
                            g1Var3 = (listU == null || listU.isEmpty()) ? null : j5.t(listU, (lw.s0) r5Var.f42667a);
                            if (g1Var3 != null) {
                                lw.q1 q1Var2 = g1Var3.f40389a;
                                if (q1Var2 != null) {
                                    g1Var4 = new lw.g1(q1Var2);
                                } else {
                                    g1Var4 = g1Var3.f40390b;
                                }
                            }
                            g1Var2 = new lw.g1(e3.a(map, c5Var.f42385a, c5Var.f42386b, c5Var.f42387c, g1Var4));
                        } catch (RuntimeException e13) {
                            g1Var2 = new lw.g1(lw.q1.f40436g.h("failed to parse service config").g(e13));
                        }
                        g1Var4 = g1Var2;
                    }
                }
            }
            mVar.f44828d = g1Var4;
            return mVar;
        } catch (Exception e14) {
            mVar.f44826b = lw.q1.m.h("Unable to resolve host " + str).g(e14);
            return mVar;
        }
    }

    public final void u() {
        if (this.f42771t || this.f42767p) {
            return;
        }
        if (this.f42766o) {
            long j11 = this.f42764l;
            if (j11 != 0) {
                if (j11 <= 0) {
                    return;
                }
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                if (this.f42765n.a() <= j11) {
                    return;
                }
            }
        }
        this.f42771t = true;
        this.f42768q.execute(new i0(this, this.f42772u));
    }

    public final List v() {
        try {
            try {
                u0 u0Var = this.f42758f;
                String str = this.f42761i;
                u0Var.getClass();
                List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                Iterator it = listUnmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new lw.v(new InetSocketAddress((InetAddress) it.next(), this.f42762j)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e8) {
                Throwables.a(e8);
                throw new RuntimeException(e8);
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                f42751v.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th2;
        }
    }
}
