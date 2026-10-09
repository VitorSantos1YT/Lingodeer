package mw;

import am.rVFB.LwKl;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f42487a = Logger.getLogger(k1.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f42488b = Collections.unmodifiableSet(EnumSet.of(lw.p1.OK, lw.p1.INVALID_ARGUMENT, lw.p1.NOT_FOUND, lw.p1.ALREADY_EXISTS, lw.p1.FAILED_PRECONDITION, lw.p1.ABORTED, lw.p1.OUT_OF_RANGE, lw.p1.DATA_LOSS));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final lw.x0 f42489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lw.x0 f42490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final lw.a1 f42491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final lw.x0 f42492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final lw.a1 f42493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final lw.x0 f42494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final lw.x0 f42495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final lw.x0 f42496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final lw.x0 f42497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f42498l;
    public static final c4 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final lp.b f42499n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h1 f42500o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final n3 f42501p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final n3 f42502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i1 f42503r;

    public static URI a(String str) {
        String str2;
        Preconditions.k(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e8) {
                e = e8;
                throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
            }
        } catch (URISyntaxException e10) {
            e = e10;
            str2 = str;
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e8) {
            f42487a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e8);
        }
    }

    public static lw.j[] c(lw.c cVar, lw.c1 c1Var, int i11, boolean z11) {
        List list = cVar.f40352d;
        int size = list.size();
        lw.j[] jVarArr = new lw.j[size + 1];
        lw.c cVar2 = lw.c.f40348h;
        lw.i iVar = new lw.i(cVar, i11, z11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            jVarArr[i12] = ((lw.h) list.get(i12)).a(iVar, c1Var);
        }
        jVarArr[size] = f42500o;
        return jVarArr;
    }

    public static String d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory e(String str) {
        ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();
        threadFactoryBuilder.f17685b = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        threadFactoryBuilder.f17684a = str;
        return threadFactoryBuilder.a();
    }

    public static z f(lw.m0 m0Var, boolean z11) {
        w1 w1Var;
        lw.y yVar = m0Var.f40418a;
        lw.q1 q1Var = m0Var.f40420c;
        if (yVar == null) {
            w1Var = null;
        } else {
            a2 a2Var = (a2) ((q5) yVar.e());
            w1Var = a2Var.f42329v;
            if (w1Var == null) {
                a2Var.f42319k.execute(new s1(a2Var, 1));
                w1Var = null;
            }
        }
        if (w1Var != null) {
            lw.h hVar = m0Var.f40419b;
            return hVar == null ? w1Var : new a1(hVar, w1Var);
        }
        if (!q1Var.f()) {
            if (m0Var.f40421d) {
                return new a1(h(q1Var), x.DROPPED);
            }
            if (!z11) {
                return new a1(h(q1Var), x.PROCESSED);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0029  */
    /* JADX WARN: Code duplicated, block: B:25:0x0035  */
    public static lw.q1 g(int i11) {
        lw.p1 p1Var;
        if ((i11 >= 100 && i11 < 200) || i11 == 400) {
            p1Var = lw.p1.INTERNAL;
        } else if (i11 == 401) {
            p1Var = lw.p1.UNAUTHENTICATED;
        } else if (i11 == 403) {
            p1Var = lw.p1.PERMISSION_DENIED;
        } else if (i11 == 404) {
            p1Var = lw.p1.UNIMPLEMENTED;
        } else if (i11 == 429) {
            p1Var = lw.p1.UNAVAILABLE;
        } else if (i11 != 431) {
            switch (i11) {
                case 502:
                case 503:
                case 504:
                    p1Var = lw.p1.UNAVAILABLE;
                    break;
                default:
                    p1Var = lw.p1.UNKNOWN;
                    break;
            }
        } else {
            p1Var = lw.p1.INTERNAL;
        }
        return p1Var.b().h("HTTP status code " + i11);
    }

    public static lw.q1 h(lw.q1 q1Var) {
        Preconditions.g(q1Var != null);
        if (!f42488b.contains(q1Var.f40444a)) {
            return q1Var;
        }
        return lw.q1.f40441l.h("Inappropriate status code from control plane: " + q1Var.f40444a + " " + q1Var.f40445b).g(q1Var.f40446c);
    }

    static {
        Charset.forName("US-ASCII");
        f42489c = new lw.x0("grpc-timeout", new n3(13));
        lw.k kVar = lw.c1.f40362d;
        f42490d = new lw.x0("grpc-encoding", kVar);
        f42491e = lw.h0.a("grpc-accept-encoding", new n3(12));
        f42492f = new lw.x0("content-encoding", kVar);
        f42493g = lw.h0.a("accept-encoding", new n3(12));
        f42494h = new lw.x0("content-length", kVar);
        f42495i = new lw.x0("content-type", kVar);
        f42496j = new lw.x0(LwKl.OIpksC, kVar);
        f42497k = new lw.x0(PQgum.mfaHJZwopqZYq, kVar);
        Splitter.a(',').f();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f42498l = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        m = new c4();
        f42499n = new lp.b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", 1);
        f42500o = new h1();
        f42501p = new n3(10);
        f42502q = new n3(11);
        f42503r = new i1(0);
    }
}
