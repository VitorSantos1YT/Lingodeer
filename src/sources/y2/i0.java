package y2;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import java.util.List;
import kotlin.KotlinNothingValueException;
import l1.c3;
import mf.sOm.txBUGYhC;
import qp.m3;
import rt.mc;
import z2.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements l1.j, u1, k {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final d0 f56875u0 = new d0("Undefined intrinsics block and it is required");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final c0 f56876v0 = new c0();

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final bq.h f56877w0 = new bq.h(29);
    public boolean H;
    public i0 K;
    public int L;
    public final qh.z M;
    public n1.e N;
    public boolean O;
    public i0 P;
    public t1 Q;
    public ViewFactoryHolder R;
    public int S;
    public boolean T;
    public boolean U;
    public g3.o V;
    public boolean W;
    public final n1.e X;
    public boolean Y;
    public w2.q0 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56878a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public qh.d f56879a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56880b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public v3.c f56881b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56882c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public v3.m f56883c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f56884d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public p2 f56885d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f56886e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public l1.b0 f56887e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f56888f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public g0 f56889f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public g0 f56890g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f56891h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final mc f56892i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final m0 f56893j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public w2.m0 f56894k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public k1 f56895l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f56896m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public z1.r f56897n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public z1.r f56898o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public y3.c f56899p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public s2.a0 f56900q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f56901r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f56902s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f56903t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f56904t0;

    public i0(int i11) {
        this((i11 & 1) == 0, g3.r.f28695a.addAndGet(1));
    }

    public static boolean R(i0 i0Var) {
        b1 b1Var = i0Var.f56893j0.f56974p;
        return i0Var.Q(b1Var.L ? new v3.a(b1Var.f54504d) : null);
    }

    public static void Y(i0 i0Var, boolean z11, int i11) {
        t1 t1Var;
        i0 i0VarW;
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        boolean z12 = (i11 & 2) != 0;
        boolean z13 = (i11 & 4) != 0;
        if (i0Var.T || i0Var.f56878a || (t1Var = i0Var.Q) == null) {
            return;
        }
        ((AndroidComposeView) t1Var).y(i0Var, false, z11, z12);
        if (z13) {
            m0 m0Var = i0Var.f56893j0.f56974p.f56832f;
            i0 i0VarW2 = m0Var.f56960a.w();
            g0 g0Var = m0Var.f56960a.f56889f0;
            if (i0VarW2 == null || g0Var == g0.NotUsed) {
                return;
            }
            while (i0VarW2.f56889f0 == g0Var && (i0VarW = i0VarW2.w()) != null) {
                i0VarW2 = i0VarW;
            }
            int i12 = z0.f57050b[g0Var.ordinal()];
            if (i12 == 1) {
                Y(i0VarW2, z11, 6);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                i0VarW2.X(z11);
            }
        }
    }

    public static void Z(i0 i0Var) {
        m0 m0Var = i0Var.f56893j0;
        if (h0.f56869a[m0Var.f56963d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + m0Var.f56963d);
        }
        if (m0Var.f56964e) {
            W(i0Var, true, 6);
            return;
        }
        if (m0Var.f56965f) {
            i0Var.V(true);
        }
        if (i0Var.s()) {
            Y(i0Var, true, 6);
        } else if (i0Var.q()) {
            i0Var.X(true);
        }
    }

    private final String k(i0 i0Var) {
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(i0Var);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(g(0));
        sb2.append(" Other tree: ");
        i0 i0Var2 = i0Var.P;
        sb2.append(i0Var2 != null ? i0Var2.g(0) : null);
        return sb2.toString();
    }

    public final n1.e A() {
        i0();
        if (this.L == 0) {
            return (n1.e) this.M.f47796b;
        }
        n1.e eVar = this.N;
        kotlin.jvm.internal.m.c(eVar);
        return eVar;
    }

    public final void B(long j11, t tVar, int i11, boolean z11) {
        mc mcVar = this.f56892i0;
        k1 k1Var = (k1) mcVar.f50087e;
        g2.t0 t0Var = k1.f56939o0;
        ((k1) mcVar.f50087e).h1(k1.f56942r0, k1Var.Z0(j11), tVar, i11, z11);
    }

    public final void C(int i11, i0 i0Var) {
        if (i0Var.P != null && i0Var.Q != null) {
            v2.a.b(k(i0Var));
        }
        i0Var.P = this;
        qh.z zVar = this.M;
        ((n1.e) zVar.f47796b).b(i11, i0Var);
        ((w2.l1) zVar.f47797c).invoke();
        P();
        if (i0Var.f56878a) {
            this.L++;
        }
        H();
        t1 t1Var = this.Q;
        if (t1Var != null) {
            i0Var.d(t1Var);
        }
        if (i0Var.f56893j0.f56971l > 0) {
            m0 m0Var = this.f56893j0;
            m0Var.d(m0Var.f56971l + 1);
        }
        if (i0Var.f56902s0 > 0) {
            d0(this.f56902s0 + 1);
        }
    }

    public final void D() {
        if (this.f56896m0) {
            mc mcVar = this.f56892i0;
            k1 k1Var = (v) mcVar.f50086d;
            k1 k1Var2 = ((k1) mcVar.f50087e).S;
            this.f56895l0 = null;
            while (!kotlin.jvm.internal.m.a(k1Var, k1Var2)) {
                if ((k1Var != null ? k1Var.f56957n0 : null) != null) {
                    this.f56895l0 = k1Var;
                    break;
                }
                k1Var = k1Var != null ? k1Var.S : null;
            }
        }
        k1 k1Var3 = this.f56895l0;
        if (k1Var3 != null && k1Var3.f56957n0 == null) {
            throw defpackage.e.t("layer was not set");
        }
        if (k1Var3 != null) {
            k1Var3.j1();
            return;
        }
        i0 i0VarW = w();
        if (i0VarW != null) {
            i0VarW.D();
        }
    }

    public final void E() {
        mc mcVar = this.f56892i0;
        k1 k1Var = (k1) mcVar.f50087e;
        v vVar = (v) mcVar.f50086d;
        while (k1Var != vVar) {
            kotlin.jvm.internal.m.d(k1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            b0 b0Var = (b0) k1Var;
            s1 s1Var = b0Var.f56957n0;
            if (s1Var != null) {
                s1Var.invalidate();
            }
            k1Var = b0Var.R;
        }
        s1 s1Var2 = ((v) mcVar.f50086d).f56957n0;
        if (s1Var2 != null) {
            s1Var2.invalidate();
        }
    }

    public final void F() {
        if (this.f56878a) {
            i0 i0VarW = w();
            if (i0VarW != null) {
                i0VarW.F();
                return;
            }
            return;
        }
        if (this.K != null) {
            W(this, false, 7);
        } else {
            Y(this, false, 7);
        }
    }

    public final void G() {
        if (this.W) {
            return;
        }
        if (((g1) this.f56892i0.f50085c).f58487f != null || this.f56898o0 != null) {
            this.U = true;
            return;
        }
        g3.o oVar = this.V;
        this.W = true;
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.f38361a = new g3.o();
        v1 snapshotObserver = l0.a(this).getSnapshotObserver();
        d2.c cVar = new d2.c(13, this, yVar);
        snapshotObserver.f57019a.d(this, snapshotObserver.f57022d, cVar);
        this.W = false;
        this.V = (g3.o) yVar.f38361a;
        this.U = false;
        t1 t1VarA = l0.a(this);
        t1VarA.getSemanticsOwner().b(this, oVar);
        ((AndroidComposeView) t1VarA).A();
    }

    public final void H() {
        i0 i0Var;
        if (this.L > 0) {
            this.O = true;
        }
        if (!this.f56878a || (i0Var = this.P) == null) {
            return;
        }
        i0Var.H();
    }

    public final boolean I() {
        return this.Q != null;
    }

    public final boolean J() {
        return this.f56893j0.f56974p.U;
    }

    public final Boolean K() {
        v0 v0Var = this.f56893j0.f56975q;
        if (v0Var != null) {
            return Boolean.valueOf(v0Var.S != s0.IsNotPlaced);
        }
        return null;
    }

    public final void L() {
        i0 i0VarW;
        if (this.f56889f0 == g0.NotUsed) {
            f();
        }
        v0 v0Var = this.f56893j0.f56975q;
        kotlin.jvm.internal.m.c(v0Var);
        boolean z11 = true;
        try {
            v0Var.f57018t = true;
            if (!v0Var.N) {
                v2.a.b("replace() called on item that was not placed");
            }
            v0Var.f57016d0 = false;
            if (v0Var.S == s0.IsNotPlaced) {
                z11 = false;
            }
            v0Var.I0(v0Var.Q, v0Var.R);
            if (z11 && !v0Var.f57016d0 && (i0VarW = v0Var.f57017f.f56960a.w()) != null) {
                i0VarW.V(false);
            }
        } finally {
            v0Var.f57018t = false;
        }
    }

    public final void M(int i11, int i12, int i13) {
        if (i11 == i12) {
            return;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i11 > i12 ? i11 + i14 : i11;
            int i16 = i11 > i12 ? i12 + i14 : (i12 + i13) - 2;
            qh.z zVar = this.M;
            n1.e eVar = (n1.e) zVar.f47796b;
            w2.l1 l1Var = (w2.l1) zVar.f47797c;
            Object objL = eVar.l(i15);
            l1Var.invoke();
            ((n1.e) zVar.f47796b).b(i16, (i0) objL);
            l1Var.invoke();
        }
        P();
        H();
        F();
    }

    public final void N(i0 i0Var) {
        if (i0Var.f56893j0.f56971l > 0) {
            m0 m0Var = this.f56893j0;
            m0Var.d(m0Var.f56971l - 1);
        }
        if (this.Q != null) {
            i0Var.h();
        }
        i0Var.P = null;
        if (i0Var.f56902s0 > 0) {
            d0(this.f56902s0 - 1);
        }
        ((k1) i0Var.f56892i0.f50087e).S = null;
        if (i0Var.f56878a) {
            this.L--;
            n1.e eVar = (n1.e) i0Var.M.f47796b;
            Object[] objArr = eVar.f43112a;
            int i11 = eVar.f43114c;
            for (int i12 = 0; i12 < i11; i12++) {
                ((k1) ((i0) objArr[i12]).f56892i0.f50087e).S = null;
            }
        }
        H();
        P();
    }

    public final void O() {
        h3.b rectManager;
        this.f56903t = true;
        t1 t1Var = this.Q;
        if (t1Var == null || (rectManager = t1Var.getRectManager()) == null) {
            return;
        }
        rectManager.d(this);
    }

    public final void P() {
        if (!this.f56878a) {
            this.Y = true;
            return;
        }
        i0 i0VarW = w();
        if (i0VarW != null) {
            i0VarW.P();
        }
    }

    public final boolean Q(v3.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.f56889f0 == g0.NotUsed) {
            e();
        }
        return this.f56893j0.f56974p.J0(aVar.f53483a);
    }

    public final void S() {
        qh.z zVar = this.M;
        n1.e eVar = (n1.e) zVar.f47796b;
        n1.e eVar2 = (n1.e) zVar.f47796b;
        int i11 = eVar.f43114c;
        while (true) {
            i11--;
            if (-1 >= i11) {
                eVar2.h();
                ((w2.l1) zVar.f47797c).invoke();
                return;
            }
            N((i0) eVar2.f43112a[i11]);
        }
    }

    public final void T(int i11, int i12) {
        if (i12 < 0) {
            v2.a.a("count (" + i12 + ") must be greater than 0");
        }
        int i13 = (i12 + i11) - 1;
        if (i11 > i13) {
            return;
        }
        while (true) {
            qh.z zVar = this.M;
            N((i0) ((n1.e) zVar.f47796b).f43112a[i13]);
            Object objL = ((n1.e) zVar.f47796b).l(i13);
            ((w2.l1) zVar.f47797c).invoke();
            if (i13 == i11) {
                return;
            } else {
                i13--;
            }
        }
    }

    public final void U() {
        i0 i0VarW;
        if (this.f56889f0 == g0.NotUsed) {
            f();
        }
        b1 b1Var = this.f56893j0.f56974p;
        m0 m0Var = b1Var.f56832f;
        try {
            b1Var.f56841t = true;
            if (!b1Var.M) {
                v2.a.b("replace called on unplaced item");
            }
            boolean z11 = b1Var.U;
            b1Var.I0(b1Var.P, b1Var.R, b1Var.Q);
            if (z11 && !b1Var.f56835h0 && (i0VarW = m0Var.f56960a.w()) != null) {
                i0VarW.X(false);
            }
            b1Var.f56841t = false;
        } catch (Throwable th2) {
            try {
                m0Var.f56960a.b0(th2);
                throw null;
            } catch (Throwable th3) {
                b1Var.f56841t = false;
                throw th3;
            }
        }
    }

    public final void V(boolean z11) {
        t1 t1Var;
        if (this.f56878a || (t1Var = this.Q) == null) {
            return;
        }
        ((AndroidComposeView) t1Var).z(this, true, z11);
    }

    public final void X(boolean z11) {
        t1 t1Var;
        if (this.f56878a || (t1Var = this.Q) == null) {
            return;
        }
        ((AndroidComposeView) t1Var).z(this, false, z11);
    }

    @Override // l1.j
    public final void a() {
        ViewFactoryHolder viewFactoryHolder = this.R;
        if (viewFactoryHolder != null) {
            viewFactoryHolder.a();
        }
        w2.m0 m0Var = this.f56894k0;
        if (m0Var != null) {
            m0Var.a();
        }
        mc mcVar = this.f56892i0;
        k1 k1Var = ((v) mcVar.f50086d).R;
        for (k1 k1Var2 = (k1) mcVar.f50087e; !kotlin.jvm.internal.m.a(k1Var2, k1Var) && k1Var2 != null; k1Var2 = k1Var2.R) {
            k1Var2.o1();
        }
    }

    public final void a0() {
        n1.e eVarA = A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            i0 i0Var = (i0) objArr[i12];
            g0 g0Var = i0Var.f56890g0;
            i0Var.f56889f0 = g0Var;
            if (g0Var != g0.NotUsed) {
                i0Var.a0();
            }
        }
    }

    @Override // l1.j
    public final void b() {
        a2.e eVar;
        ViewFactoryHolder viewFactoryHolder = this.R;
        if (viewFactoryHolder != null) {
            viewFactoryHolder.b();
        }
        w2.m0 m0Var = this.f56894k0;
        if (m0Var != null) {
            m0Var.h(true);
        }
        this.f56904t0 = true;
        z1.q qVar = (d2) this.f56892i0.f50088f;
        for (z1.q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.f58486e) {
            if (qVar2.P) {
                qVar2.O0();
            }
        }
        for (z1.q qVar3 = qVar; qVar3 != null; qVar3 = qVar3.f58486e) {
            if (qVar3.P) {
                qVar3.Q0();
            }
        }
        while (qVar != null) {
            if (qVar.P) {
                qVar.K0();
            }
            qVar = qVar.f58486e;
        }
        if (I()) {
            this.V = null;
            this.U = false;
        }
        t1 t1Var = this.Q;
        if (t1Var != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) t1Var;
            if (AndroidComposeView.f() && (eVar = androidComposeView.f1187p0) != null && eVar.H.e(this.f56880b)) {
                eVar.f301a.e(eVar.f303c, this.f56880b, false);
            }
        }
    }

    public final void b0(Throwable th2) {
        l1.b0 b0Var = this.f56887e0;
        c3 c3Var = y1.e.f56816a;
        t1.i iVar = (t1.i) b0Var;
        iVar.getClass();
        y1.d dVar = (y1.d) l1.t.E(iVar, c3Var);
        if (dVar == null) {
            throw th2;
        }
        hz.b.T(th2, new pv.c(25, dVar, this));
        throw th2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5591. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void c(z1.r r20) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.i0.c(z1.r):void");
    }

    public final void c0(v3.c cVar) {
        if (kotlin.jvm.internal.m.a(this.f56881b0, cVar)) {
            return;
        }
        this.f56881b0 = cVar;
        F();
        i0 i0VarW = w();
        if (i0VarW != null) {
            i0VarW.D();
        }
        E();
        for (z1.q qVar = (z1.q) this.f56892i0.f50089g; qVar != null; qVar = qVar.f58487f) {
            qVar.c();
        }
    }

    public final void d(t1 t1Var) {
        i0 i0Var;
        a2.e eVar;
        g3.o oVarY;
        if (this.Q != null) {
            v2.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        i0 i0Var2 = this.P;
        if (i0Var2 != null && !kotlin.jvm.internal.m.a(i0Var2.Q, t1Var)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(t1Var);
            sb2.append(") than the parent's owner(");
            i0 i0VarW = w();
            sb2.append(i0VarW != null ? i0VarW.Q : null);
            sb2.append("). This tree: ");
            sb2.append(g(0));
            sb2.append(" Parent tree: ");
            i0 i0Var3 = this.P;
            sb2.append(i0Var3 != null ? i0Var3.g(0) : null);
            v2.a.b(sb2.toString());
        }
        i0 i0VarW2 = w();
        m0 m0Var = this.f56893j0;
        if (i0VarW2 == null) {
            m0Var.f56974p.U = true;
            t1Var.getRectManager().e(this, false);
            v0 v0Var = m0Var.f56975q;
            if (v0Var != null) {
                v0Var.S = s0.IsPlacedInLookahead;
            }
        }
        mc mcVar = this.f56892i0;
        ((k1) mcVar.f50087e).S = i0VarW2 != null ? (v) i0VarW2.f56892i0.f50086d : null;
        this.Q = t1Var;
        this.S = (i0VarW2 != null ? i0VarW2.S : -1) + 1;
        z1.r rVar = this.f56898o0;
        if (rVar != null) {
            c(rVar);
        }
        this.f56898o0 = null;
        AndroidComposeView androidComposeView = (AndroidComposeView) t1Var;
        androidComposeView.getLayoutNodes().h(this.f56880b, this);
        i0 i0Var4 = this.P;
        if (i0Var4 == null || (i0Var = i0Var4.K) == null) {
            i0Var = this.K;
        }
        e0(i0Var);
        if (this.K == null && mcVar.g(512)) {
            e0(this);
        }
        if (!this.f56904t0) {
            for (z1.q qVar = (z1.q) mcVar.f50089g; qVar != null; qVar = qVar.f58487f) {
                qVar.J0();
            }
        }
        n1.e eVar2 = (n1.e) this.M.f47796b;
        Object[] objArr = eVar2.f43112a;
        int i11 = eVar2.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            ((i0) objArr[i12]).d(t1Var);
        }
        if (!this.f56904t0) {
            mcVar.i();
        }
        F();
        if (i0VarW2 != null) {
            i0VarW2.F();
        }
        y3.c cVar = this.f56899p0;
        if (cVar != null) {
            cVar.invoke(t1Var);
        }
        m0Var.j();
        if (!this.f56904t0 && mcVar.g(8)) {
            G();
        }
        androidComposeView.getClass();
        if (!AndroidComposeView.f() || (eVar = androidComposeView.f1187p0) == null || (oVarY = y()) == null || !oVarY.f28691a.b(g3.x.f28725q)) {
            return;
        }
        eVar.H.a(this.f56880b);
        eVar.f301a.e(eVar.f303c, this.f56880b, true);
    }

    public final void d0(int i11) {
        i0 i0VarW;
        i0 i0VarW2;
        int i12 = this.f56902s0;
        if (i12 != i11) {
            if (i11 > 0 && i12 == 0 && (i0VarW2 = w()) != null) {
                i0VarW2.d0(i0VarW2.f56902s0 + 1);
            }
            if (i11 == 0 && this.f56902s0 > 0 && (i0VarW = w()) != null) {
                i0VarW.d0(i0VarW.f56902s0 - 1);
            }
            this.f56902s0 = i11;
        }
    }

    public final void e() {
        this.f56890g0 = this.f56889f0;
        this.f56889f0 = g0.NotUsed;
        n1.e eVarA = A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            i0 i0Var = (i0) objArr[i12];
            if (i0Var.f56889f0 != g0.NotUsed) {
                i0Var.e();
            }
        }
    }

    public final void e0(i0 i0Var) {
        if (kotlin.jvm.internal.m.a(i0Var, this.K)) {
            return;
        }
        this.K = i0Var;
        m0 m0Var = this.f56893j0;
        if (i0Var != null) {
            if (m0Var.f56975q == null) {
                m0Var.f56975q = new v0(m0Var);
            }
            mc mcVar = this.f56892i0;
            k1 k1Var = ((v) mcVar.f50086d).R;
            for (k1 k1Var2 = (k1) mcVar.f50087e; !kotlin.jvm.internal.m.a(k1Var2, k1Var) && k1Var2 != null; k1Var2 = k1Var2.R) {
                k1Var2.X0();
            }
        } else {
            m0Var.f56975q = null;
            m0Var.f56965f = false;
            m0Var.f56964e = false;
        }
        F();
    }

    public final void f() {
        this.f56890g0 = this.f56889f0;
        this.f56889f0 = g0.NotUsed;
        n1.e eVarA = A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            i0 i0Var = (i0) objArr[i12];
            if (i0Var.f56889f0 == g0.InLayoutBlock) {
                i0Var.f();
            }
        }
    }

    public final void f0(w2.q0 q0Var) {
        if (kotlin.jvm.internal.m.a(this.Z, q0Var)) {
            return;
        }
        this.Z = q0Var;
        qh.d dVar = this.f56879a0;
        if (dVar != null) {
            ((l1.k1) dVar.f47751c).setValue(q0Var);
        }
        F();
    }

    public final String g(int i11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        n1.e eVarA = A();
        Object[] objArr = eVarA.f43112a;
        int i13 = eVarA.f43114c;
        for (int i14 = 0; i14 < i13; i14++) {
            sb2.append(((i0) objArr[i14]).g(i11 + 1));
        }
        String string = sb2.toString();
        if (i11 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void g0(z1.r rVar) {
        if (this.f56878a && this.f56897n0 != z1.o.f58481a) {
            v2.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f56904t0) {
            v2.a.a("modifier is updated when deactivated");
        }
        if (!I()) {
            this.f56898o0 = rVar;
            return;
        }
        c(rVar);
        if (this.U) {
            G();
        }
    }

    public final void h() {
        a2.e eVar;
        j0 j0Var;
        t1 t1Var = this.Q;
        if (t1Var == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            i0 i0VarW = w();
            sb2.append(i0VarW != null ? i0VarW.g(0) : null);
            v2.a.c(sb2.toString());
            throw new KotlinNothingValueException();
        }
        i0 i0VarW2 = w();
        m0 m0Var = this.f56893j0;
        if (i0VarW2 != null) {
            i0VarW2.D();
            i0VarW2.F();
            b1 b1Var = m0Var.f56974p;
            g0 g0Var = g0.NotUsed;
            b1Var.N = g0Var;
            v0 v0Var = m0Var.f56975q;
            if (v0Var != null) {
                v0Var.L = g0Var;
            }
        }
        j0 j0Var2 = m0Var.f56974p.Z;
        j0Var2.f56921b = true;
        j0Var2.f56922c = false;
        j0Var2.f56924e = false;
        j0Var2.f56923d = false;
        j0Var2.f56925f = false;
        j0Var2.f56926g = false;
        j0Var2.f56927h = null;
        v0 v0Var2 = m0Var.f56975q;
        if (v0Var2 != null && (j0Var = v0Var2.T) != null) {
            j0Var.f56921b = true;
            j0Var.f56922c = false;
            j0Var.f56924e = false;
            j0Var.f56923d = false;
            j0Var.f56925f = false;
            j0Var.f56926g = false;
            j0Var.f56927h = null;
        }
        mc mcVar = this.f56892i0;
        z1.q qVar = (d2) mcVar.f50088f;
        k1 k1Var = ((v) mcVar.f50086d).R;
        for (k1 k1Var2 = (k1) mcVar.f50087e; !kotlin.jvm.internal.m.a(k1Var2, k1Var) && k1Var2 != null; k1Var2 = k1Var2.R) {
            k1Var2.u1();
            if (k1Var2.Q.J()) {
                k1Var2.p1();
            }
        }
        s2.a0 a0Var = this.f56900q0;
        if (a0Var != null) {
            a0Var.invoke(t1Var);
        }
        for (z1.q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.f58486e) {
            if (qVar2.P) {
                qVar2.Q0();
            }
        }
        this.T = true;
        n1.e eVar2 = (n1.e) this.M.f47796b;
        Object[] objArr = eVar2.f43112a;
        int i11 = eVar2.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            ((i0) objArr[i12]).h();
        }
        this.T = false;
        while (qVar != null) {
            if (qVar.P) {
                qVar.K0();
            }
            qVar = qVar.f58486e;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) t1Var;
        androidComposeView.getLayoutNodes().g(this.f56880b);
        y0 y0Var = androidComposeView.f1197y0;
        m3 m3Var = y0Var.f57041b;
        ((tp.e) m3Var.f48056a).v(this);
        ((tp.e) m3Var.f48057b).v(this);
        ((tp.e) m3Var.f48058c).v(this);
        ((n1.e) y0Var.f57044e.f48145b).k(this);
        androidComposeView.f1188q0 = true;
        if (AndroidComposeView.f() && (eVar = androidComposeView.f1187p0) != null && eVar.H.e(this.f56880b)) {
            eVar.f301a.e(eVar.f303c, this.f56880b, false);
        }
        t1Var.getRectManager().g(this);
        this.Q = null;
        e0(null);
        this.S = 0;
        b1 b1Var2 = m0Var.f56974p;
        b1Var2.K = Integer.MAX_VALUE;
        b1Var2.H = Integer.MAX_VALUE;
        b1Var2.U = false;
        v0 v0Var3 = m0Var.f56975q;
        if (v0Var3 != null) {
            v0Var3.K = Integer.MAX_VALUE;
            v0Var3.H = Integer.MAX_VALUE;
            v0Var3.S = s0.IsNotPlaced;
        }
        if (mcVar.g(8)) {
            g3.o oVar = this.V;
            this.V = null;
            this.U = false;
            t1Var.getSemanticsOwner().b(this, oVar);
            androidComposeView.A();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void h0(p2 p2Var) {
        if (kotlin.jvm.internal.m.a(this.f56885d0, p2Var)) {
            return;
        }
        this.f56885d0 = p2Var;
        z1.q qVar = (z1.q) this.f56892i0.f50089g;
        if ((qVar.f58485d & 16) != 0) {
            while (qVar != null) {
                if ((qVar.f58484c & 16) != 0) {
                    ?? F = qVar;
                    ?? eVar = 0;
                    while (F != 0) {
                        if (F instanceof y1) {
                            ((y1) F).x0();
                        } else if ((F.f58484c & 16) != 0 && (F instanceof n)) {
                            z1.q qVar2 = ((n) F).R;
                            int i11 = 0;
                            F = F;
                            eVar = eVar;
                            while (qVar2 != null) {
                                if ((qVar2.f58484c & 16) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        eVar = eVar;
                                        F = qVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new n1.e(new z1.q[16]);
                                        }
                                        if (F != 0) {
                                            eVar.c(F);
                                            F = 0;
                                        }
                                        eVar.c(qVar2);
                                    }
                                }
                                qVar2 = qVar2.f58487f;
                                F = F;
                                eVar = eVar;
                            }
                            if (i11 == 1) {
                            }
                        }
                        F = f.f(eVar);
                    }
                }
                if ((qVar.f58485d & 16) == 0) {
                    return;
                } else {
                    qVar = qVar.f58487f;
                }
            }
        }
    }

    public final void i(g2.v vVar, j2.c cVar) {
        try {
            ((k1) this.f56892i0.f50087e).V0(vVar, cVar);
        } catch (Throwable th2) {
            b0(th2);
            throw null;
        }
    }

    public final void i0() {
        if (this.L <= 0 || !this.O) {
            return;
        }
        this.O = false;
        n1.e eVar = this.N;
        if (eVar == null) {
            eVar = new n1.e(new i0[16]);
            this.N = eVar;
        }
        eVar.h();
        n1.e eVar2 = (n1.e) this.M.f47796b;
        Object[] objArr = eVar2.f43112a;
        int i11 = eVar2.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            i0 i0Var = (i0) objArr[i12];
            if (i0Var.f56878a) {
                eVar.e(eVar.f43114c, i0Var.A());
            } else {
                eVar.c(i0Var);
            }
        }
        m0 m0Var = this.f56893j0;
        m0Var.f56974p.f56828b0 = true;
        v0 v0Var = m0Var.f56975q;
        if (v0Var != null) {
            v0Var.V = true;
        }
    }

    @Override // l1.j
    public final void j() {
        h3.b rectManager;
        a2.e eVar;
        h3.b rectManager2;
        if (!I()) {
            v2.a.a("onReuse is only expected on attached node");
        }
        ViewFactoryHolder viewFactoryHolder = this.R;
        if (viewFactoryHolder != null) {
            viewFactoryHolder.j();
        }
        w2.m0 m0Var = this.f56894k0;
        if (m0Var != null) {
            m0Var.h(false);
        }
        this.W = false;
        boolean z11 = this.f56904t0;
        mc mcVar = this.f56892i0;
        if (z11) {
            this.f56904t0 = false;
        } else {
            z1.q qVar = (d2) mcVar.f50088f;
            for (z1.q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.f58486e) {
                if (qVar2.P) {
                    qVar2.O0();
                }
            }
            for (z1.q qVar3 = qVar; qVar3 != null; qVar3 = qVar3.f58486e) {
                if (qVar3.P) {
                    qVar3.Q0();
                }
            }
            while (qVar != null) {
                if (qVar.P) {
                    qVar.K0();
                }
                qVar = qVar.f58486e;
            }
        }
        int i11 = this.f56880b;
        t1 t1Var = this.Q;
        if (t1Var != null && (rectManager2 = t1Var.getRectManager()) != null) {
            rectManager2.g(this);
        }
        this.f56880b = g3.r.f28695a.addAndGet(1);
        t1 t1Var2 = this.Q;
        if (t1Var2 != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) t1Var2;
            androidComposeView.getLayoutNodes().g(i11);
            androidComposeView.getLayoutNodes().h(this.f56880b, this);
        }
        for (z1.q qVar4 = (z1.q) mcVar.f50089g; qVar4 != null; qVar4 = qVar4.f58487f) {
            qVar4.J0();
        }
        mcVar.i();
        if (mcVar.g(8)) {
            G();
        }
        Z(this);
        t1 t1Var3 = this.Q;
        if (t1Var3 != null) {
            AndroidComposeView androidComposeView2 = (AndroidComposeView) t1Var3;
            if (AndroidComposeView.f() && (eVar = androidComposeView2.f1187p0) != null) {
                AndroidComposeView androidComposeView3 = eVar.f303c;
                a2.s sVar = eVar.f301a;
                y.y yVar = eVar.H;
                if (yVar.e(i11)) {
                    sVar.e(androidComposeView3, i11, false);
                }
                g3.o oVarY = y();
                if (oVarY != null && oVarY.f28691a.b(g3.x.f28725q)) {
                    yVar.a(this.f56880b);
                    sVar.e(androidComposeView3, this.f56880b, true);
                }
            }
        }
        t1 t1Var4 = this.Q;
        if (t1Var4 == null || (rectManager = t1Var4.getRectManager()) == null) {
            return;
        }
        rectManager.e(this, true);
    }

    public final void l() {
        if (this.K != null) {
            W(this, false, 5);
        } else {
            Y(this, false, 5);
        }
        b1 b1Var = this.f56893j0.f56974p;
        v3.a aVar = b1Var.L ? new v3.a(b1Var.f54504d) : null;
        if (aVar != null) {
            t1 t1Var = this.Q;
            if (t1Var != null) {
                ((AndroidComposeView) t1Var).t(this, aVar.f53483a);
                return;
            }
            return;
        }
        t1 t1Var2 = this.Q;
        if (t1Var2 != null) {
            ((AndroidComposeView) t1Var2).s(true);
        }
    }

    public final List m() {
        v0 v0Var = this.f56893j0.f56975q;
        kotlin.jvm.internal.m.c(v0Var);
        n1.e eVar = v0Var.U;
        m0 m0Var = v0Var.f57017f;
        m0Var.f56960a.o();
        if (!v0Var.V) {
            return eVar.g();
        }
        i0 i0Var = m0Var.f56960a;
        n1.e eVarA = i0Var.A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            i0 i0Var2 = (i0) objArr[i12];
            if (eVar.f43114c <= i12) {
                v0 v0Var2 = i0Var2.f56893j0.f56975q;
                kotlin.jvm.internal.m.c(v0Var2);
                eVar.c(v0Var2);
            } else {
                v0 v0Var3 = i0Var2.f56893j0.f56975q;
                kotlin.jvm.internal.m.c(v0Var3);
                Object[] objArr2 = eVar.f43112a;
                Object obj = objArr2[i12];
                objArr2[i12] = v0Var3;
            }
        }
        eVar.m(((n1.e) ((n1.b) i0Var.o()).f43104b).f43114c, eVar.f43114c);
        v0Var.V = false;
        return eVar.g();
    }

    public final List n() {
        return this.f56893j0.f56974p.s0();
    }

    public final List o() {
        return A().g();
    }

    public final List p() {
        return ((n1.e) this.M.f47796b).g();
    }

    public final boolean q() {
        return this.f56893j0.f56974p.X;
    }

    @Override // y2.u1
    public final boolean r() {
        return I();
    }

    public final boolean s() {
        return this.f56893j0.f56974p.W;
    }

    public final g0 t() {
        return this.f56893j0.f56974p.N;
    }

    public final String toString() {
        return z2.g0.D(this) + " children: " + ((n1.e) ((n1.b) o()).f43104b).f43114c + " measurePolicy: " + this.Z + " deactivated: " + this.f56904t0;
    }

    public final g0 u() {
        g0 g0Var;
        v0 v0Var = this.f56893j0.f56975q;
        return (v0Var == null || (g0Var = v0Var.L) == null) ? g0.NotUsed : g0Var;
    }

    public final qh.d v() {
        qh.d dVar = this.f56879a0;
        if (dVar != null) {
            return dVar;
        }
        qh.d dVar2 = new qh.d(this, this.Z);
        this.f56879a0 = dVar2;
        return dVar2;
    }

    public final i0 w() {
        i0 i0Var = this.P;
        while (i0Var != null && i0Var.f56878a) {
            i0Var = i0Var.P;
        }
        return i0Var;
    }

    public final int x() {
        return this.f56893j0.f56974p.K;
    }

    public final g3.o y() {
        if (I() && !this.f56904t0 && this.f56892i0.g(8)) {
            return this.V;
        }
        return null;
    }

    public final n1.e z() {
        boolean z11 = this.Y;
        n1.e eVar = this.X;
        if (z11) {
            eVar.h();
            eVar.e(eVar.f43114c, A());
            ry.l.g0(eVar.f43112a, f56877w0, 0, eVar.f43114c);
            this.Y = false;
        }
        return eVar;
    }

    public static void W(i0 i0Var, boolean z11, int i11) {
        i0 i0VarW;
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        boolean z12 = (i11 & 2) != 0;
        boolean z13 = (i11 & 4) != 0;
        if (i0Var.K == null) {
            v2.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        t1 t1Var = i0Var.Q;
        if (t1Var == null || i0Var.T || i0Var.f56878a) {
            return;
        }
        ((AndroidComposeView) t1Var).y(i0Var, true, z11, z12);
        if (z13) {
            v0 v0Var = i0Var.f56893j0.f56975q;
            kotlin.jvm.internal.m.c(v0Var);
            m0 m0Var = v0Var.f57017f;
            i0 i0VarW2 = m0Var.f56960a.w();
            g0 g0Var = m0Var.f56960a.f56889f0;
            if (i0VarW2 == null || g0Var == g0.NotUsed) {
                return;
            }
            while (i0VarW2.f56889f0 == g0Var && (i0VarW = i0VarW2.w()) != null) {
                i0VarW2 = i0VarW;
            }
            int i12 = t0.f57007b[g0Var.ordinal()];
            if (i12 == 1) {
                if (i0VarW2.K != null) {
                    W(i0VarW2, z11, 6);
                    return;
                } else {
                    Y(i0VarW2, z11, 6);
                    return;
                }
            }
            if (i12 != 2) {
                throw new IllegalStateException(txBUGYhC.wctSUkdbMz);
            }
            if (i0VarW2.K != null) {
                i0VarW2.V(z11);
            } else {
                i0VarW2.X(z11);
            }
        }
    }

    public i0(boolean z11, int i11) {
        this.f56878a = z11;
        this.f56880b = i11;
        this.f56884d = 9223372034707292159L;
        this.f56886e = 0L;
        this.f56888f = 9223372034707292159L;
        this.f56903t = true;
        this.M = new qh.z(12, new n1.e(new i0[16]), new w2.l1(this, 4));
        this.X = new n1.e(new i0[16]);
        this.Y = true;
        this.Z = f56875u0;
        this.f56881b0 = l0.f56958a;
        this.f56883c0 = v3.m.Ltr;
        this.f56885d0 = f56876v0;
        l1.b0.f39236v.getClass();
        this.f56887e0 = l1.a0.f39231b;
        g0 g0Var = g0.NotUsed;
        this.f56889f0 = g0Var;
        this.f56890g0 = g0Var;
        this.f56892i0 = new mc(this);
        this.f56893j0 = new m0(this);
        this.f56896m0 = true;
        this.f56897n0 = z1.o.f58481a;
    }
}
