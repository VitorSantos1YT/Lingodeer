package mw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a2 implements lw.e0, q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.f0 f42309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n3 f42311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r5 f42312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f42313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f42314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lw.c0 f42315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dm.c f42316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lw.f f42317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f42318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final lw.t1 f42319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x1 f42320l;
    public volatile List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y0 f42321n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Stopwatch f42322o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b1.p f42323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b1.p f42324q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g3 f42325r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public w1 f42328u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile w1 f42329v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public lw.q1 f42331x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f42326s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r1 f42327t = new r1(this, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile lw.o f42330w = lw.o.a(lw.n.IDLE);

    public a2(List list, String str, n3 n3Var, l lVar, ScheduledExecutorService scheduledExecutorService, Supplier supplier, lw.t1 t1Var, r5 r5Var, lw.c0 c0Var, dm.c cVar, q qVar, lw.f0 f0Var, lw.f fVar, ArrayList arrayList) {
        Preconditions.k(list, "addressGroups");
        Preconditions.e("addressGroups is empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Preconditions.k(it.next(), "addressGroups contains null entry");
        }
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.m = listUnmodifiableList;
        x1 x1Var = new x1();
        x1Var.f42782a = listUnmodifiableList;
        this.f42320l = x1Var;
        this.f42310b = str;
        this.f42311c = n3Var;
        this.f42313e = lVar;
        this.f42314f = scheduledExecutorService;
        this.f42322o = (Stopwatch) supplier.get();
        this.f42319k = t1Var;
        this.f42312d = r5Var;
        this.f42315g = c0Var;
        this.f42316h = cVar;
        Preconditions.k(qVar, "channelTracer");
        Preconditions.k(f0Var, "logId");
        this.f42309a = f0Var;
        Preconditions.k(fVar, "channelLogger");
        this.f42317i = fVar;
        this.f42318j = arrayList;
    }

    public static void e(a2 a2Var, lw.n nVar) {
        a2Var.f42319k.d();
        a2Var.g(lw.o.a(nVar));
    }

    public static void f(a2 a2Var) {
        SocketAddress socketAddress;
        lw.z zVar;
        x1 x1Var = a2Var.f42320l;
        lw.t1 t1Var = a2Var.f42319k;
        t1Var.d();
        Preconditions.p("Should have no reconnectTask scheduled", a2Var.f42323p == null);
        if (x1Var.f42783b == 0 && x1Var.f42784c == 0) {
            Stopwatch stopwatch = a2Var.f42322o;
            stopwatch.f16400c = 0L;
            stopwatch.f16399b = false;
            stopwatch.b();
        }
        SocketAddress socketAddress2 = (SocketAddress) ((lw.v) x1Var.f42782a.get(x1Var.f42783b)).f40480a.get(x1Var.f42784c);
        if (socketAddress2 instanceof lw.z) {
            zVar = (lw.z) socketAddress2;
            socketAddress = zVar.f40490b;
        } else {
            socketAddress = socketAddress2;
            zVar = null;
        }
        lw.b bVar = ((lw.v) x1Var.f42782a.get(x1Var.f42783b)).f40481b;
        String str = (String) bVar.f40343a.get(lw.v.f40479d);
        a0 a0Var = new a0();
        a0Var.f42303a = "unknown-authority";
        a0Var.f42304b = lw.b.f40342b;
        if (str == null) {
            str = a2Var.f42310b;
        }
        Preconditions.k(str, "authority");
        a0Var.f42303a = str;
        a0Var.f42304b = bVar;
        a0Var.f42305c = zVar;
        z1 z1Var = new z1();
        z1Var.f42852d = a2Var.f42309a;
        w1 w1Var = new w1(a2Var.f42313e.y0(socketAddress, a0Var, z1Var), a2Var.f42316h);
        z1Var.f42852d = w1Var.d();
        a2Var.f42328u = w1Var;
        a2Var.f42326s.add(w1Var);
        Runnable runnableA = w1Var.a(new ie.o(a2Var, w1Var));
        if (runnableA != null) {
            t1Var.b(runnableA);
        }
        a2Var.f42317i.i(lw.e.INFO, "Started transport {0}", z1Var.f42852d);
    }

    public static String h(lw.q1 q1Var) {
        StringBuilder sb2 = new StringBuilder();
        lw.p1 p1Var = q1Var.f40444a;
        Throwable th2 = q1Var.f40446c;
        sb2.append(p1Var);
        String str = q1Var.f40445b;
        if (str != null) {
            defpackage.e.C(sb2, "(", str, ")");
        }
        if (th2 != null) {
            sb2.append("[");
            sb2.append(th2);
            sb2.append("]");
        }
        return sb2.toString();
    }

    @Override // lw.e0
    public final lw.f0 d() {
        return this.f42309a;
    }

    public final void g(lw.o oVar) {
        this.f42319k.d();
        if (this.f42330w.f40425a != oVar.f40425a) {
            Preconditions.p("Cannot transition out of SHUTDOWN to " + oVar, this.f42330w.f40425a != lw.n.SHUTDOWN);
            this.f42330w = oVar;
            ((lw.p0) this.f42312d.f42667a).a(oVar);
        }
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.b(this.f42309a.f40379c, "logId");
        toStringHelperB.c(this.m, "addressGroups");
        return toStringHelperB.toString();
    }
}
