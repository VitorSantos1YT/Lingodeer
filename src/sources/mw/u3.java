package mw;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableListIterator;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u3 extends lw.q0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Logger f42717o = Logger.getLogger(u3.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lw.f f42718f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x1 f42720h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b1.p f42723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public lw.n f42724l;
    public lw.n m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f42725n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f42719g = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42721i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f42722j = true;

    public u3(lw.f fVar) {
        boolean z11 = false;
        lw.n nVar = lw.n.IDLE;
        this.f42724l = nVar;
        this.m = nVar;
        Logger logger = k1.f42487a;
        String property = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        property = property == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : property;
        if (!Strings.b(property) && Boolean.parseBoolean(property)) {
            z11 = true;
        }
        this.f42725n = z11;
        this.f42718f = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lw.q0
    public final lw.q1 a(lw.n0 n0Var) {
        List list;
        lw.n nVar;
        if (this.f42724l == lw.n.SHUTDOWN) {
            return lw.q1.f40440k.h("Already shut down");
        }
        List list2 = n0Var.f40422a;
        lw.b bVar = n0Var.f40423b;
        if (list2.isEmpty()) {
            lw.q1 q1VarH = lw.q1.m.h("NameResolver returned no usable address. addrs=" + list2 + ", attrs=" + bVar);
            c(q1VarH);
            return q1VarH;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((lw.v) it.next()) == null) {
                lw.q1 q1VarH2 = lw.q1.m.h("NameResolver returned address list with null endpoint. addrs=" + list2 + ", attrs=" + bVar);
                c(q1VarH2);
                return q1VarH2;
            }
        }
        this.f42722j = true;
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.f(list2);
        ImmutableList immutableListJ = builder.j();
        x1 x1Var = this.f42720h;
        if (x1Var == null) {
            x1 x1Var2 = new x1();
            x1Var2.f42782a = immutableListJ != null ? immutableListJ : Collections.EMPTY_LIST;
            this.f42720h = x1Var2;
        } else if (this.f42724l == lw.n.READY) {
            SocketAddress socketAddressA = x1Var.a();
            x1 x1Var3 = this.f42720h;
            if (immutableListJ != null) {
                list = immutableListJ;
            } else {
                x1Var3.getClass();
                list = Collections.EMPTY_LIST;
            }
            x1Var3.f42782a = list;
            x1Var3.f42783b = 0;
            x1Var3.f42784c = 0;
            if (this.f42720h.e(socketAddressA)) {
                return lw.q1.f40434e;
            }
            x1 x1Var4 = this.f42720h;
            x1Var4.f42783b = 0;
            x1Var4.f42784c = 0;
        } else {
            x1Var.f42782a = immutableListJ != null ? immutableListJ : Collections.EMPTY_LIST;
            x1Var.f42783b = 0;
            x1Var.f42784c = 0;
        }
        HashMap map = this.f42719g;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        UnmodifiableListIterator unmodifiableListIteratorListIterator = immutableListJ.listIterator(0);
        while (unmodifiableListIteratorListIterator.hasNext()) {
            hashSet2.addAll(((lw.v) unmodifiableListIteratorListIterator.next()).f40480a);
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((t3) map.remove(socketAddress)).f42696a.o();
            }
        }
        if (hashSet.size() == 0 || (nVar = this.f42724l) == lw.n.CONNECTING || nVar == lw.n.READY) {
            lw.n nVar2 = lw.n.CONNECTING;
            this.f42724l = nVar2;
            i(nVar2, new r3(lw.m0.f40417e));
            g();
            e();
        } else {
            lw.n nVar3 = lw.n.IDLE;
            if (nVar == nVar3) {
                i(nVar3, new s3(this, this));
            } else if (nVar == lw.n.TRANSIENT_FAILURE) {
                g();
                e();
            }
        }
        return lw.q1.f40434e;
    }

    @Override // lw.q0
    public final void c(lw.q1 q1Var) {
        HashMap map = this.f42719g;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((t3) it.next()).f42696a.o();
        }
        map.clear();
        i(lw.n.TRANSIENT_FAILURE, new r3(lw.m0.a(q1Var)));
    }

    @Override // lw.q0
    public final void e() {
        lw.y yVar;
        x1 x1Var = this.f42720h;
        if (x1Var == null || !x1Var.c() || this.f42724l == lw.n.SHUTDOWN) {
            return;
        }
        SocketAddress socketAddressA = this.f42720h.a();
        HashMap map = this.f42719g;
        boolean zContainsKey = map.containsKey(socketAddressA);
        Logger logger = f42717o;
        if (zContainsKey) {
            yVar = ((t3) map.get(socketAddressA)).f42696a;
        } else {
            q3 q3Var = new q3(this);
            ob.m mVarB = lw.k0.b();
            mVarB.Q(Lists.b(new lw.v(socketAddressA)));
            mVarB.F(q3Var);
            final lw.y yVarB = this.f42718f.b(mVarB.H());
            if (yVarB == null) {
                logger.warning("Was not able to create subchannel for " + socketAddressA);
                throw new IllegalStateException("Can't create subchannel");
            }
            t3 t3Var = new t3(yVarB, lw.n.IDLE, q3Var);
            q3Var.f42650b = t3Var;
            map.put(socketAddressA, t3Var);
            if (yVarB.c().f40343a.get(lw.q0.f40430d) == null) {
                q3Var.f42649a = lw.o.a(lw.n.READY);
            }
            yVarB.p(new lw.p0() { // from class: mw.o3
                @Override // lw.p0
                public final void a(lw.o oVar) {
                    lw.y yVar2;
                    u3 u3Var = this.f42605a;
                    lw.f fVar = u3Var.f42718f;
                    lw.n nVar = oVar.f40425a;
                    HashMap map2 = u3Var.f42719g;
                    lw.y yVar3 = yVarB;
                    t3 t3Var2 = (t3) map2.get((SocketAddress) yVar3.a().f40480a.get(0));
                    if (t3Var2 == null || (yVar2 = t3Var2.f42696a) != yVar3 || nVar == lw.n.SHUTDOWN) {
                        return;
                    }
                    lw.n nVar2 = lw.n.IDLE;
                    if (nVar == nVar2) {
                        fVar.k();
                    }
                    t3.a(t3Var2, nVar);
                    lw.n nVar3 = u3Var.f42724l;
                    lw.n nVar4 = lw.n.TRANSIENT_FAILURE;
                    if (nVar3 == nVar4 || u3Var.m == nVar4) {
                        if (nVar == lw.n.CONNECTING) {
                            return;
                        }
                        if (nVar == nVar2) {
                            u3Var.e();
                            return;
                        }
                    }
                    int i11 = p3.f42621a[nVar.ordinal()];
                    if (i11 == 1) {
                        x1 x1Var2 = u3Var.f42720h;
                        x1Var2.f42783b = 0;
                        x1Var2.f42784c = 0;
                        u3Var.f42724l = nVar2;
                        u3Var.i(nVar2, new s3(u3Var, u3Var));
                        return;
                    }
                    if (i11 == 2) {
                        lw.n nVar5 = lw.n.CONNECTING;
                        u3Var.f42724l = nVar5;
                        u3Var.i(nVar5, new r3(lw.m0.f40417e));
                        return;
                    }
                    if (i11 == 3) {
                        u3Var.g();
                        for (t3 t3Var3 : map2.values()) {
                            if (!t3Var3.f42696a.equals(yVar2)) {
                                t3Var3.f42696a.o();
                            }
                        }
                        map2.clear();
                        lw.n nVar6 = lw.n.READY;
                        t3.a(t3Var2, nVar6);
                        map2.put((SocketAddress) yVar2.a().f40480a.get(0), t3Var2);
                        u3Var.f42720h.e((SocketAddress) yVar3.a().f40480a.get(0));
                        u3Var.f42724l = nVar6;
                        u3Var.j(t3Var2);
                        return;
                    }
                    if (i11 != 4) {
                        throw new IllegalArgumentException("Unsupported state:" + nVar);
                    }
                    if (u3Var.f42720h.c() && ((t3) map2.get(u3Var.f42720h.a())).f42696a == yVar3 && u3Var.f42720h.b()) {
                        u3Var.g();
                        u3Var.e();
                    }
                    x1 x1Var3 = u3Var.f42720h;
                    if (x1Var3 == null || x1Var3.c()) {
                        return;
                    }
                    int size = map2.size();
                    List list = u3Var.f42720h.f42782a;
                    if (size < (list != null ? list.size() : 0)) {
                        return;
                    }
                    Iterator it = map2.values().iterator();
                    while (it.hasNext()) {
                        if (!((t3) it.next()).f42699d) {
                            return;
                        }
                    }
                    lw.n nVar7 = lw.n.TRANSIENT_FAILURE;
                    u3Var.f42724l = nVar7;
                    u3Var.i(nVar7, new r3(lw.m0.a(oVar.f40426b)));
                    int i12 = u3Var.f42721i + 1;
                    u3Var.f42721i = i12;
                    List list2 = u3Var.f42720h.f42782a;
                    if (i12 >= (list2 != null ? list2.size() : 0) || u3Var.f42722j) {
                        u3Var.f42722j = false;
                        u3Var.f42721i = 0;
                        fVar.k();
                    }
                }
            });
            yVar = yVarB;
        }
        int i11 = p3.f42621a[((t3) map.get(socketAddressA)).f42697b.ordinal()];
        if (i11 == 1) {
            yVar.n();
            t3.a((t3) map.get(socketAddressA), lw.n.CONNECTING);
            h();
        } else {
            if (i11 == 2) {
                if (this.f42725n) {
                    h();
                    return;
                } else {
                    yVar.n();
                    return;
                }
            }
            if (i11 == 3) {
                logger.warning("Requesting a connection even though we have a READY subchannel");
            } else {
                if (i11 != 4) {
                    return;
                }
                this.f42720h.b();
                e();
            }
        }
    }

    @Override // lw.q0
    public final void f() {
        Level level = Level.FINE;
        HashMap map = this.f42719g;
        f42717o.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        lw.n nVar = lw.n.SHUTDOWN;
        this.f42724l = nVar;
        this.m = nVar;
        g();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((t3) it.next()).f42696a.o();
        }
        map.clear();
    }

    public final void g() {
        b1.p pVar = this.f42723k;
        if (pVar != null) {
            pVar.r();
            this.f42723k = null;
        }
    }

    public final void h() {
        if (this.f42725n) {
            b1.p pVar = this.f42723k;
            if (pVar != null) {
                lw.s1 s1Var = (lw.s1) pVar.f3800b;
                if (!s1Var.f40467c && !s1Var.f40466b) {
                    return;
                }
            }
            lw.f fVar = this.f42718f;
            this.f42723k = fVar.f().c(new aj.i(this, 18), 250L, TimeUnit.MILLISECONDS, fVar.d());
        }
    }

    public final void i(lw.n nVar, lw.o0 o0Var) {
        if (nVar == this.m && (nVar == lw.n.IDLE || nVar == lw.n.CONNECTING)) {
            return;
        }
        this.m = nVar;
        this.f42718f.q(nVar, o0Var);
    }

    public final void j(t3 t3Var) {
        lw.n nVar = t3Var.f42697b;
        lw.n nVar2 = lw.n.READY;
        if (nVar != nVar2) {
            return;
        }
        lw.o oVar = t3Var.f42698c.f42649a;
        lw.n nVar3 = oVar.f40425a;
        if (nVar3 == nVar2) {
            i(nVar2, new lw.l0(lw.m0.b(t3Var.f42696a, null)));
            return;
        }
        lw.n nVar4 = lw.n.TRANSIENT_FAILURE;
        if (nVar3 == nVar4) {
            i(nVar4, new r3(lw.m0.a(oVar.f40426b)));
        } else if (this.m != nVar4) {
            i(nVar3, new r3(lw.m0.f40417e));
        }
    }
}
