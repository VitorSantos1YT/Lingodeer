package y2;

import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import rt.mc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends w2.g1 implements w2.p0, a, e1 {
    public boolean L;
    public boolean M;
    public boolean O;
    public fz.c Q;
    public float R;
    public Object T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f56829c0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0 f56832f;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f56834g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f56835h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public fz.c f56836i0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f56838k0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f56840m0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f56841t;
    public int H = Integer.MAX_VALUE;
    public int K = Integer.MAX_VALUE;
    public g0 N = g0.NotUsed;
    public long P = 0;
    public boolean S = true;
    public final j0 Z = new j0(this, 0);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final n1.e f56827a0 = new n1.e(new b1[16]);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f56828b0 = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f56830d0 = v3.b.b(0, 0, 15);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final a1 f56831e0 = new a1(this, 1);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final a1 f56833f0 = new a1(this, 0);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public long f56837j0 = 0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final a1 f56839l0 = new a1(this, 2);

    public b1(m0 m0Var) {
        this.f56832f = m0Var;
    }

    @Override // w2.p0
    public final w2.g1 B(long j11) {
        g0 g0Var;
        m0 m0Var = this.f56832f;
        i0 i0Var = m0Var.f56960a;
        g0 g0Var2 = i0Var.f56889f0;
        g0 g0Var3 = g0.NotUsed;
        if (g0Var2 == g0Var3) {
            i0Var.e();
        }
        if (f.s(m0Var.f56960a)) {
            v0 v0Var = m0Var.f56975q;
            kotlin.jvm.internal.m.c(v0Var);
            v0Var.L = g0Var3;
            v0Var.B(j11);
        }
        i0 i0Var2 = m0Var.f56960a;
        i0 i0VarW = i0Var2.w();
        if (i0VarW != null) {
            m0 m0Var2 = i0VarW.f56893j0;
            if (this.N != g0Var3 && !i0Var2.f56891h0) {
                v2.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i11 = z0.f57049a[m0Var2.f56963d.ordinal()];
            if (i11 == 1) {
                g0Var = g0.InMeasureBlock;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + m0Var2.f56963d);
                }
                g0Var = g0.InLayoutBlock;
            }
            this.N = g0Var;
        } else {
            this.N = g0Var3;
        }
        J0(j11);
        return this;
    }

    public final void C0() {
        if (this.U) {
            this.U = false;
            m0 m0Var = this.f56832f;
            i0 i0Var = m0Var.f56960a;
            i0 i0Var2 = m0Var.f56960a;
            l0.a(i0Var).getRectManager().g(i0Var2);
            mc mcVar = i0Var2.f56892i0;
            k1 k1Var = ((v) mcVar.f50086d).R;
            for (k1 k1Var2 = (k1) mcVar.f50087e; !kotlin.jvm.internal.m.a(k1Var2, k1Var) && k1Var2 != null; k1Var2 = k1Var2.R) {
                k1Var2.p1();
                k1Var2.u1();
            }
            n1.e eVarA = i0Var2.A();
            Object[] objArr = eVarA.f43112a;
            int i11 = eVarA.f43114c;
            for (int i12 = 0; i12 < i11; i12++) {
                ((i0) objArr[i12]).f56893j0.f56974p.C0();
            }
        }
    }

    public final void F0() {
        m0 m0Var = this.f56832f;
        if (m0Var.f56971l > 0) {
            n1.e eVarA = m0Var.f56960a.A();
            Object[] objArr = eVarA.f43112a;
            int i11 = eVarA.f43114c;
            for (int i12 = 0; i12 < i11; i12++) {
                i0 i0Var = (i0) objArr[i12];
                m0 m0Var2 = i0Var.f56893j0;
                boolean z11 = m0Var2.f56969j;
                b1 b1Var = m0Var2.f56974p;
                if ((z11 || m0Var2.f56970k) && !b1Var.X) {
                    i0Var.X(false);
                }
                b1Var.F0();
            }
        }
    }

    @Override // w2.g1, w2.p0
    public final Object G() {
        return this.T;
    }

    public final void G0() {
        g0 g0Var;
        m0 m0Var = this.f56832f;
        i0.Y(m0Var.f56960a, false, 7);
        i0 i0Var = m0Var.f56960a;
        i0 i0VarW = i0Var.w();
        if (i0VarW == null || i0Var.f56889f0 != g0.NotUsed) {
            return;
        }
        int i11 = z0.f57049a[i0VarW.f56893j0.f56963d.ordinal()];
        if (i11 != 1) {
            g0Var = i11 != 2 ? i0VarW.f56889f0 : g0.InLayoutBlock;
        } else {
            g0Var = g0.InMeasureBlock;
        }
        i0Var.f56889f0 = g0Var;
    }

    public final void H0() {
        this.f56835h0 = true;
        m0 m0Var = this.f56832f;
        i0 i0VarW = m0Var.f56960a.w();
        float f5 = e().f56946c0;
        i0 i0Var = m0Var.f56960a;
        mc mcVar = i0Var.f56892i0;
        k1 k1Var = (k1) mcVar.f50087e;
        v vVar = (v) mcVar.f50086d;
        while (k1Var != vVar) {
            kotlin.jvm.internal.m.d(k1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            b0 b0Var = (b0) k1Var;
            f5 += b0Var.f56946c0;
            k1Var = b0Var.R;
        }
        if (f5 != this.f56834g0) {
            this.f56834g0 = f5;
            if (i0VarW != null) {
                i0VarW.P();
            }
            if (i0VarW != null) {
                i0VarW.D();
            }
        }
        if (!e().M) {
            boolean z11 = this.U;
            if (!z11 || this.Z.d()) {
                x0();
            }
            if (z11) {
                ((v) i0Var.f56892i0.f50086d).n1();
            } else {
                if (i0VarW != null) {
                    i0VarW.D();
                }
                if (this.f56841t && i0VarW != null) {
                    i0VarW.X(false);
                }
            }
        }
        if (i0VarW != null) {
            m0 m0Var2 = i0VarW.f56893j0;
            if (!this.f56841t && m0Var2.f56963d == e0.LayingOut) {
                if (this.K != Integer.MAX_VALUE) {
                    v2.a.b("Place was called on a node which was placed already");
                }
                int i11 = m0Var2.f56968i;
                this.K = i11;
                m0Var2.f56968i = i11 + 1;
            }
        } else {
            this.K = 0;
        }
        L();
    }

    public final void I0(long j11, float f5, fz.c cVar) {
        m0 m0Var = this.f56832f;
        i0 i0Var = m0Var.f56960a;
        i0 i0Var2 = m0Var.f56960a;
        if (i0Var.f56904t0) {
            v2.a.a("place is called on a deactivated node");
        }
        m0Var.f56963d = e0.LayingOut;
        this.P = j11;
        this.R = f5;
        this.Q = cVar;
        this.f56835h0 = false;
        t1 t1VarA = l0.a(i0Var2);
        if (this.X || !this.U) {
            this.Z.f56926g = false;
            m0Var.f(false);
            this.f56836i0 = cVar;
            this.f56837j0 = j11;
            this.f56838k0 = f5;
            v1 snapshotObserver = t1VarA.getSnapshotObserver();
            snapshotObserver.f57019a.d(i0Var2, snapshotObserver.f57024f, this.f56839l0);
        } else {
            k1 k1VarA = m0Var.a();
            k1VarA.s1(v3.j.e(j11, k1VarA.f54505e), f5, cVar);
            H0();
        }
        m0Var.f56963d = e0.Idle;
        if (m0Var.a().M && (m0Var.f56970k || m0Var.f56969j)) {
            requestLayout();
        }
        this.M = true;
    }

    @Override // y2.e1
    public final void J(boolean z11) {
        m0 m0Var = this.f56832f;
        if (z11 != m0Var.a().K) {
            m0Var.a().K = z11;
            this.f56840m0 = true;
        }
    }

    public final boolean J0(long j11) {
        m0 m0Var = this.f56832f;
        i0 i0Var = m0Var.f56960a;
        i0 i0Var2 = m0Var.f56960a;
        try {
            if (i0Var.f56904t0) {
                v2.a.a("measure is called on a deactivated node");
            }
            t1 t1VarA = l0.a(i0Var2);
            i0 i0VarW = i0Var2.w();
            boolean z11 = true;
            i0Var2.f56891h0 = i0Var2.f56891h0 || (i0VarW != null && i0VarW.f56891h0);
            if (!i0Var2.s() && v3.a.b(this.f54504d, j11)) {
                ((AndroidComposeView) t1VarA).j(i0Var2, false);
                i0Var2.a0();
                return false;
            }
            this.Z.f56925f = false;
            n1.e eVarA = i0Var2.A();
            Object[] objArr = eVarA.f43112a;
            int i11 = eVarA.f43114c;
            for (int i12 = 0; i12 < i11; i12++) {
                ((i0) objArr[i12]).f56893j0.f56974p.Z.f56922c = false;
            }
            this.L = true;
            long j12 = m0Var.a().f54503c;
            m0(j11);
            e0 e0Var = m0Var.f56963d;
            e0 e0Var2 = e0.Idle;
            if (e0Var != e0Var2) {
                v2.a.b("layout state is not idle before measure starts");
            }
            this.f56830d0 = j11;
            e0 e0Var3 = e0.Measuring;
            m0Var.f56963d = e0Var3;
            this.W = false;
            v1 snapshotObserver = l0.a(i0Var2).getSnapshotObserver();
            snapshotObserver.f57019a.d(i0Var2, snapshotObserver.f57021c, this.f56831e0);
            if (m0Var.f56963d == e0Var3) {
                this.X = true;
                this.Y = true;
                m0Var.f56963d = e0Var2;
            }
            if (v3.l.a(m0Var.a().f54503c, j12) && m0Var.a().f54501a == this.f54501a && m0Var.a().f54502b == this.f54502b) {
                z11 = false;
            }
            l0((((long) m0Var.a().f54502b) & 4294967295L) | (((long) m0Var.a().f54501a) << 32));
            return z11;
        } catch (Throwable th2) {
            i0Var.b0(th2);
            throw null;
        }
    }

    @Override // y2.a
    public final void L() {
        this.f56829c0 = true;
        j0 j0Var = this.Z;
        j0Var.h();
        boolean z11 = this.X;
        m0 m0Var = this.f56832f;
        if (z11) {
            n1.e eVarA = m0Var.f56960a.A();
            Object[] objArr = eVarA.f43112a;
            int i11 = eVarA.f43114c;
            for (int i12 = 0; i12 < i11; i12++) {
                i0 i0Var = (i0) objArr[i12];
                if (i0Var.s() && i0Var.t() == g0.InMeasureBlock && i0.R(i0Var)) {
                    i0.Y(m0Var.f56960a, false, 7);
                }
            }
        }
        if (this.Y || (!this.O && !e().M && this.X)) {
            this.X = false;
            e0 e0Var = m0Var.f56963d;
            m0Var.f56963d = e0.LayingOut;
            m0Var.g(false);
            i0 i0Var2 = m0Var.f56960a;
            v1 snapshotObserver = l0.a(i0Var2).getSnapshotObserver();
            snapshotObserver.f57019a.d(i0Var2, snapshotObserver.f57023e, this.f56833f0);
            m0Var.f56963d = e0Var;
            this.Y = false;
        }
        if (j0Var.f56923d) {
            j0Var.f56924e = true;
        }
        if (j0Var.f56921b && j0Var.e()) {
            j0Var.g();
        }
        this.f56829c0 = false;
    }

    @Override // y2.a
    public final void N(y.p0 p0Var) {
        n1.e eVarA = this.f56832f.f56960a.A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            p0Var.invoke(((i0) objArr[i12]).f56893j0.f56974p);
        }
    }

    @Override // y2.a
    public final void R() {
        i0.Y(this.f56832f.f56960a, false, 7);
    }

    @Override // w2.p0
    public final int W(int i11) {
        m0 m0Var = this.f56832f;
        if (!f.s(m0Var.f56960a)) {
            G0();
            return m0Var.a().W(i11);
        }
        v0 v0Var = m0Var.f56975q;
        kotlin.jvm.internal.m.c(v0Var);
        return v0Var.W(i11);
    }

    @Override // w2.g1
    public final int X(w2.n nVar) {
        m0 m0Var = this.f56832f;
        i0 i0VarW = m0Var.f56960a.w();
        e0 e0Var = i0VarW != null ? i0VarW.f56893j0.f56963d : null;
        e0 e0Var2 = e0.Measuring;
        j0 j0Var = this.Z;
        if (e0Var == e0Var2) {
            j0Var.f56922c = true;
        } else {
            i0 i0VarW2 = m0Var.f56960a.w();
            if ((i0VarW2 != null ? i0VarW2.f56893j0.f56963d : null) == e0.LayingOut) {
                j0Var.f56923d = true;
            }
        }
        this.O = true;
        int iX = m0Var.a().X(nVar);
        this.O = false;
        return iX;
    }

    @Override // y2.a
    public final j0 a() {
        return this.Z;
    }

    @Override // w2.g1
    public final int a0() {
        return this.f56832f.a().a0();
    }

    @Override // w2.p0
    public final int b(int i11) {
        m0 m0Var = this.f56832f;
        if (!f.s(m0Var.f56960a)) {
            G0();
            return m0Var.a().b(i11);
        }
        v0 v0Var = m0Var.f56975q;
        kotlin.jvm.internal.m.c(v0Var);
        return v0Var.b(i11);
    }

    @Override // y2.a
    public final v e() {
        return (v) this.f56832f.f56960a.f56892i0.f50086d;
    }

    @Override // w2.g1
    public final int g0() {
        return this.f56832f.a().g0();
    }

    @Override // y2.a
    public final a i() {
        m0 m0Var;
        i0 i0VarW = this.f56832f.f56960a.w();
        if (i0VarW == null || (m0Var = i0VarW.f56893j0) == null) {
            return null;
        }
        return m0Var.f56974p;
    }

    @Override // w2.g1
    public final void i0(long j11, float f5, fz.c cVar) {
        w2.f1 placementScope;
        m0 m0Var = this.f56832f;
        i0 i0Var = m0Var.f56960a;
        i0 i0Var2 = m0Var.f56960a;
        try {
            this.V = true;
            if (!v3.j.c(j11, this.P) || this.f56840m0) {
                if (m0Var.f56970k || m0Var.f56969j || this.f56840m0) {
                    this.X = true;
                    this.f56840m0 = false;
                }
                F0();
            }
            v0 v0Var = m0Var.f56975q;
            if (v0Var != null) {
                m0 m0Var2 = v0Var.f57017f;
                if (v0Var.S == s0.IsNotPlaced && !f.s(m0Var2.f56960a)) {
                    m0Var2.f56962c = true;
                }
            }
            v0 v0Var2 = m0Var.f56975q;
            if (v0Var2 != null && v0Var2.s0()) {
                k1 k1Var = m0Var.a().S;
                if (k1Var == null || (placementScope = k1Var.N) == null) {
                    placementScope = l0.a(i0Var2).getPlacementScope();
                }
                v0 v0Var3 = m0Var.f56975q;
                kotlin.jvm.internal.m.c(v0Var3);
                i0 i0VarW = i0Var2.w();
                if (i0VarW != null) {
                    i0VarW.f56893j0.f56967h = 0;
                }
                v0Var3.K = Integer.MAX_VALUE;
                placementScope.f(v0Var3, (int) (j11 >> 32), (int) (4294967295L & j11), CropImageView.DEFAULT_ASPECT_RATIO);
            }
            v0 v0Var4 = m0Var.f56975q;
            if (v0Var4 != null && !v0Var4.N) {
                v2.a.b("Error: Placement happened before lookahead.");
            }
            I0(j11, f5, cVar);
        } catch (Throwable th2) {
            i0Var.b0(th2);
            throw null;
        }
    }

    @Override // w2.p0
    public final int p(int i11) {
        m0 m0Var = this.f56832f;
        if (!f.s(m0Var.f56960a)) {
            G0();
            return m0Var.a().p(i11);
        }
        v0 v0Var = m0Var.f56975q;
        kotlin.jvm.internal.m.c(v0Var);
        return v0Var.p(i11);
    }

    @Override // y2.a
    public final int q() {
        return this.K;
    }

    @Override // y2.a
    public final void requestLayout() {
        this.f56832f.f56960a.X(false);
    }

    public final List s0() {
        m0 m0Var = this.f56832f;
        m0Var.f56960a.i0();
        boolean z11 = this.f56828b0;
        n1.e eVar = this.f56827a0;
        if (!z11) {
            return eVar.g();
        }
        i0 i0Var = m0Var.f56960a;
        n1.e eVarA = i0Var.A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            i0 i0Var2 = (i0) objArr[i12];
            if (eVar.f43114c <= i12) {
                eVar.c(i0Var2.f56893j0.f56974p);
            } else {
                b1 b1Var = i0Var2.f56893j0.f56974p;
                Object[] objArr2 = eVar.f43112a;
                Object obj = objArr2[i12];
                objArr2[i12] = b1Var;
            }
        }
        eVar.m(((n1.e) ((n1.b) i0Var.o()).f43104b).f43114c, eVar.f43114c);
        this.f56828b0 = false;
        return eVar.g();
    }

    @Override // w2.p0
    public final int t(int i11) {
        m0 m0Var = this.f56832f;
        if (!f.s(m0Var.f56960a)) {
            G0();
            return m0Var.a().t(i11);
        }
        v0 v0Var = m0Var.f56975q;
        kotlin.jvm.internal.m.c(v0Var);
        return v0Var.t(i11);
    }

    public final void x0() {
        boolean z11 = this.U;
        this.U = true;
        m0 m0Var = this.f56832f;
        i0 i0Var = m0Var.f56960a;
        mc mcVar = i0Var.f56892i0;
        if (!z11) {
            ((v) mcVar.f50086d).n1();
            l0.a(i0Var).getRectManager().e(m0Var.f56960a, true);
            if (i0Var.s()) {
                i0.Y(i0Var, true, 6);
            } else if (i0Var.f56893j0.f56964e) {
                i0.W(i0Var, true, 6);
            }
        }
        k1 k1Var = ((v) mcVar.f50086d).R;
        for (k1 k1Var2 = (k1) mcVar.f50087e; !kotlin.jvm.internal.m.a(k1Var2, k1Var) && k1Var2 != null; k1Var2 = k1Var2.R) {
            if (k1Var2.f56956m0) {
                k1Var2.j1();
            }
        }
        n1.e eVarA = i0Var.A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            i0 i0Var2 = (i0) objArr[i12];
            if (i0Var2.x() != Integer.MAX_VALUE) {
                i0Var2.f56893j0.f56974p.x0();
                i0.Z(i0Var2);
            }
        }
    }
}
