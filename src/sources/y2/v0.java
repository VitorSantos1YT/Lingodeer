package y2;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends w2.g1 implements w2.p0, a, e1 {
    public boolean M;
    public boolean N;
    public boolean O;
    public v3.a P;
    public fz.c R;
    public boolean W;
    public Object Z;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f57016d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0 f57017f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f57018t;
    public int H = Integer.MAX_VALUE;
    public int K = Integer.MAX_VALUE;
    public g0 L = g0.NotUsed;
    public long Q = 0;
    public s0 S = s0.IsNotPlaced;
    public final j0 T = new j0(this, 1);
    public final n1.e U = new n1.e(new v0[16]);
    public boolean V = true;
    public final u0 X = new u0(this, 0);
    public boolean Y = true;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f57013a0 = v3.b.b(0, 0, 15);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final u0 f57014b0 = new u0(this, 2);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final u0 f57015c0 = new u0(this, 1);

    public v0(m0 m0Var) {
        this.f57017f = m0Var;
        this.Z = m0Var.f56974p.T;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // w2.p0
    public final w2.g1 B(long j11) {
        g0 g0Var;
        m0 m0Var = this.f57017f;
        i0 i0VarW = m0Var.f56960a.w();
        if ((i0VarW != null ? i0VarW.f56893j0.f56963d : null) == e0.LookaheadMeasuring) {
            m0Var.f56961b = false;
        } else {
            i0 i0VarW2 = m0Var.f56960a.w();
            if ((i0VarW2 != null ? i0VarW2.f56893j0.f56963d : null) == e0.LookaheadLayingOut) {
                m0Var.f56961b = false;
            }
        }
        i0 i0Var = m0Var.f56960a;
        i0 i0VarW3 = i0Var.w();
        if (i0VarW3 != null) {
            m0 m0Var2 = i0VarW3.f56893j0;
            if (this.L != g0.NotUsed && !i0Var.f56891h0) {
                v2.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i11 = t0.f57006a[m0Var2.f56963d.ordinal()];
            if (i11 == 1 || i11 == 2) {
                g0Var = g0.InMeasureBlock;
            } else {
                if (i11 != 3 && i11 != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + m0Var2.f56963d);
                }
                g0Var = g0.InLayoutBlock;
            }
            this.L = g0Var;
        } else {
            this.L = g0.NotUsed;
        }
        i0 i0Var2 = m0Var.f56960a;
        if (i0Var2.f56889f0 == g0.NotUsed) {
            i0Var2.e();
        }
        J0(j11);
        return this;
    }

    public final void C0() {
        s0 s0Var = this.S;
        m0 m0Var = this.f57017f;
        boolean z11 = m0Var.f56962c;
        i0 i0Var = m0Var.f56960a;
        if (z11) {
            this.S = s0.IsPlacedInApproach;
        } else {
            this.S = s0.IsPlacedInLookahead;
        }
        if (s0Var != s0.IsPlacedInLookahead && m0Var.f56964e) {
            i0.W(i0Var, true, 6);
        }
        n1.e eVarA = i0Var.A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            i0 i0Var2 = (i0) objArr[i12];
            v0 v0Var = i0Var2.f56893j0.f56975q;
            if (v0Var == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (v0Var.K != Integer.MAX_VALUE) {
                v0Var.C0();
                i0.Z(i0Var2);
            }
        }
    }

    public final void F0() {
        m0 m0Var = this.f57017f;
        if (m0Var.f56973o > 0) {
            n1.e eVarA = m0Var.f56960a.A();
            Object[] objArr = eVarA.f43112a;
            int i11 = eVarA.f43114c;
            for (int i12 = 0; i12 < i11; i12++) {
                i0 i0Var = (i0) objArr[i12];
                m0 m0Var2 = i0Var.f56893j0;
                if ((m0Var2.m || m0Var2.f56972n) && !m0Var2.f56965f) {
                    i0Var.V(false);
                }
                v0 v0Var = m0Var2.f56975q;
                if (v0Var != null) {
                    v0Var.F0();
                }
            }
        }
    }

    @Override // w2.g1, w2.p0
    public final Object G() {
        return this.Z;
    }

    public final void G0() {
        g0 g0Var;
        m0 m0Var = this.f57017f;
        i0.W(m0Var.f56960a, false, 7);
        i0 i0Var = m0Var.f56960a;
        i0 i0VarW = i0Var.w();
        if (i0VarW == null || i0Var.f56889f0 != g0.NotUsed) {
            return;
        }
        int i11 = t0.f57006a[i0VarW.f56893j0.f56963d.ordinal()];
        if (i11 != 2) {
            g0Var = i11 != 3 ? i0VarW.f56889f0 : g0.InLayoutBlock;
        } else {
            g0Var = g0.InMeasureBlock;
        }
        i0Var.f56889f0 = g0Var;
    }

    public final void H0() {
        e0 e0Var;
        this.f57016d0 = true;
        m0 m0Var = this.f57017f;
        i0 i0VarW = m0Var.f56960a.w();
        s0 s0Var = this.S;
        if ((s0Var != s0.IsPlacedInLookahead && !m0Var.f56962c) || (s0Var != s0.IsPlacedInApproach && m0Var.f56962c)) {
            C0();
            if (this.f57018t && i0VarW != null) {
                i0VarW.V(false);
            }
        }
        if (i0VarW != null) {
            m0 m0Var2 = i0VarW.f56893j0;
            if (!this.f57018t && ((e0Var = m0Var2.f56963d) == e0.LayingOut || e0Var == e0.LookaheadLayingOut)) {
                if (this.K != Integer.MAX_VALUE) {
                    v2.a.b("Place was called on a node which was placed already");
                }
                int i11 = m0Var2.f56967h;
                this.K = i11;
                m0Var2.f56967h = i11 + 1;
            }
        } else {
            this.K = 0;
        }
        L();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0082, B:31:0x006e), top: B:36:0x0007 }] */
    public final void I0(long j11, fz.c cVar) {
        m0 m0Var = this.f57017f;
        i0 i0Var = m0Var.f56960a;
        i0 i0Var2 = m0Var.f56960a;
        try {
            i0 i0VarW = i0Var.w();
            e0 e0Var = i0VarW != null ? i0VarW.f56893j0.f56963d : null;
            e0 e0Var2 = e0.LookaheadLayingOut;
            if (e0Var == e0Var2) {
                m0Var.f56962c = false;
            }
            if (i0Var2.f56904t0) {
                v2.a.a("place is called on a deactivated node");
            }
            m0Var.f56963d = e0Var2;
            boolean z11 = true;
            this.N = true;
            this.f57016d0 = false;
            if (!v3.j.c(j11, this.Q)) {
                if (m0Var.f56972n || m0Var.m) {
                    m0Var.f56965f = true;
                }
                F0();
            }
            t1 t1VarA = l0.a(i0Var2);
            this.Q = j11;
            if (m0Var.f56965f) {
                m0Var.h(false);
                this.T.f56926g = false;
                v1 snapshotObserver = t1VarA.getSnapshotObserver();
                snapshotObserver.f57019a.d(i0Var2, snapshotObserver.f57025g, this.f57015c0);
            } else {
                if (this.S == s0.IsNotPlaced) {
                    z11 = false;
                }
                if (z11) {
                    r0 r0VarA1 = m0Var.a().a1();
                    kotlin.jvm.internal.m.c(r0VarA1);
                    r0VarA1.T0(v3.j.e(j11, r0VarA1.f54505e));
                    H0();
                } else {
                    m0Var.h(false);
                    this.T.f56926g = false;
                    v1 snapshotObserver2 = t1VarA.getSnapshotObserver();
                    snapshotObserver2.f57019a.d(i0Var2, snapshotObserver2.f57025g, this.f57015c0);
                }
            }
            this.R = cVar;
            m0Var.f56963d = e0.Idle;
        } catch (Throwable th2) {
            i0Var.b0(th2);
            throw null;
        }
    }

    @Override // y2.e1
    public final void J(boolean z11) {
        r0 r0VarA1;
        m0 m0Var = this.f57017f;
        r0 r0VarA2 = m0Var.a().a1();
        if (Boolean.valueOf(z11).equals(r0VarA2 != null ? Boolean.valueOf(r0VarA2.K) : null) || (r0VarA1 = m0Var.a().a1()) == null) {
            return;
        }
        r0VarA1.K = z11;
    }

    public final boolean J0(long j11) {
        long j12;
        m0 m0Var = this.f57017f;
        i0 i0Var = m0Var.f56960a;
        i0 i0Var2 = m0Var.f56960a;
        try {
            if (i0Var.f56904t0) {
                v2.a.a("measure is called on a deactivated node");
            }
            i0 i0VarW = i0Var2.w();
            i0Var2.f56891h0 = i0Var2.f56891h0 || (i0VarW != null && i0VarW.f56891h0);
            if (!i0Var2.f56893j0.f56964e) {
                v3.a aVar = this.P;
                if (aVar == null ? false : v3.a.b(aVar.f53483a, j11)) {
                    t1 t1Var = i0Var2.Q;
                    if (t1Var != null) {
                        ((AndroidComposeView) t1Var).j(i0Var2, true);
                    }
                    i0Var2.a0();
                    return false;
                }
            }
            this.P = new v3.a(j11);
            m0(j11);
            this.T.f56925f = false;
            n1.e eVarA = i0Var2.A();
            Object[] objArr = eVarA.f43112a;
            int i11 = eVarA.f43114c;
            for (int i12 = 0; i12 < i11; i12++) {
                v0 v0Var = ((i0) objArr[i12]).f56893j0.f56975q;
                kotlin.jvm.internal.m.c(v0Var);
                v0Var.T.f56922c = false;
            }
            if (this.O) {
                j12 = this.f54503c;
            } else {
                long j13 = Integer.MIN_VALUE;
                j12 = (j13 & 4294967295L) | (j13 << 32);
            }
            this.O = true;
            r0 r0VarA1 = m0Var.a().a1();
            if (!(r0VarA1 != null)) {
                v2.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            m0Var.c(j11);
            l0((((long) r0VarA1.f54502b) & 4294967295L) | (((long) r0VarA1.f54501a) << 32));
            return (((int) (j12 >> 32)) == r0VarA1.f54501a && ((int) (j12 & 4294967295L)) == r0VarA1.f54502b) ? false : true;
        } catch (Throwable th2) {
            i0Var.b0(th2);
            throw null;
        }
    }

    @Override // y2.a
    public final void L() {
        this.W = true;
        j0 j0Var = this.T;
        j0Var.h();
        m0 m0Var = this.f57017f;
        boolean z11 = m0Var.f56965f;
        i0 i0Var = m0Var.f56960a;
        if (z11) {
            n1.e eVarA = i0Var.A();
            Object[] objArr = eVarA.f43112a;
            int i11 = eVarA.f43114c;
            for (int i12 = 0; i12 < i11; i12++) {
                i0 i0Var2 = (i0) objArr[i12];
                m0 m0Var2 = i0Var2.f56893j0;
                if (m0Var2.f56964e && i0Var2.u() == g0.InMeasureBlock) {
                    v0 v0Var = m0Var2.f56975q;
                    kotlin.jvm.internal.m.c(v0Var);
                    v0 v0Var2 = m0Var2.f56975q;
                    v3.a aVar = v0Var2 != null ? v0Var2.P : null;
                    kotlin.jvm.internal.m.c(aVar);
                    if (v0Var.J0(aVar.f53483a)) {
                        i0.W(i0Var, false, 7);
                    }
                }
            }
        }
        u uVar = e().f57012u0;
        kotlin.jvm.internal.m.c(uVar);
        if (m0Var.f56966g || (!this.M && !uVar.M && m0Var.f56965f)) {
            m0Var.f56965f = false;
            e0 e0Var = m0Var.f56963d;
            m0Var.f56963d = e0.LookaheadLayingOut;
            m0Var.i(false);
            v1 snapshotObserver = l0.a(i0Var).getSnapshotObserver();
            snapshotObserver.f57019a.d(i0Var, snapshotObserver.f57026h, this.X);
            m0Var.f56963d = e0Var;
            if (m0Var.m && uVar.M) {
                requestLayout();
            }
            m0Var.f56966g = false;
        }
        if (j0Var.f56923d) {
            j0Var.f56924e = true;
        }
        if (j0Var.f56921b && j0Var.e()) {
            j0Var.g();
        }
        this.W = false;
    }

    @Override // y2.a
    public final void N(y.p0 p0Var) {
        n1.e eVarA = this.f57017f.f56960a.A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            v0 v0Var = ((i0) objArr[i12]).f56893j0.f56975q;
            kotlin.jvm.internal.m.c(v0Var);
            p0Var.invoke(v0Var);
        }
    }

    @Override // y2.a
    public final void R() {
        i0.W(this.f57017f.f56960a, false, 7);
    }

    @Override // w2.p0
    public final int W(int i11) {
        G0();
        r0 r0VarA1 = this.f57017f.a().a1();
        kotlin.jvm.internal.m.c(r0VarA1);
        return r0VarA1.W(i11);
    }

    @Override // w2.g1
    public final int X(w2.n nVar) {
        m0 m0Var = this.f57017f;
        i0 i0VarW = m0Var.f56960a.w();
        e0 e0Var = i0VarW != null ? i0VarW.f56893j0.f56963d : null;
        e0 e0Var2 = e0.LookaheadMeasuring;
        j0 j0Var = this.T;
        if (e0Var == e0Var2) {
            j0Var.f56922c = true;
        } else {
            i0 i0VarW2 = m0Var.f56960a.w();
            if ((i0VarW2 != null ? i0VarW2.f56893j0.f56963d : null) == e0.LookaheadLayingOut) {
                j0Var.f56923d = true;
            }
        }
        this.M = true;
        r0 r0VarA1 = m0Var.a().a1();
        kotlin.jvm.internal.m.c(r0VarA1);
        int iX = r0VarA1.X(nVar);
        this.M = false;
        return iX;
    }

    @Override // y2.a
    public final j0 a() {
        return this.T;
    }

    @Override // w2.g1
    public final int a0() {
        r0 r0VarA1 = this.f57017f.a().a1();
        kotlin.jvm.internal.m.c(r0VarA1);
        return r0VarA1.a0();
    }

    @Override // w2.p0
    public final int b(int i11) {
        G0();
        r0 r0VarA1 = this.f57017f.a().a1();
        kotlin.jvm.internal.m.c(r0VarA1);
        return r0VarA1.b(i11);
    }

    @Override // y2.a
    public final v e() {
        return (v) this.f57017f.f56960a.f56892i0.f50086d;
    }

    @Override // w2.g1
    public final int g0() {
        r0 r0VarA1 = this.f57017f.a().a1();
        kotlin.jvm.internal.m.c(r0VarA1);
        return r0VarA1.g0();
    }

    @Override // y2.a
    public final a i() {
        m0 m0Var;
        i0 i0VarW = this.f57017f.f56960a.w();
        if (i0VarW == null || (m0Var = i0VarW.f56893j0) == null) {
            return null;
        }
        return m0Var.f56975q;
    }

    @Override // w2.g1
    public final void i0(long j11, float f5, fz.c cVar) {
        I0(j11, cVar);
    }

    @Override // w2.p0
    public final int p(int i11) {
        G0();
        r0 r0VarA1 = this.f57017f.a().a1();
        kotlin.jvm.internal.m.c(r0VarA1);
        return r0VarA1.p(i11);
    }

    @Override // y2.a
    public final int q() {
        return this.K;
    }

    @Override // y2.a
    public final void requestLayout() {
        this.f57017f.f56960a.V(false);
    }

    public final boolean s0() {
        m0 m0Var = this.f57017f;
        return f.s(m0Var.f56960a) || m0Var.f56962c;
    }

    @Override // w2.p0
    public final int t(int i11) {
        G0();
        r0 r0VarA1 = this.f57017f.a().a1();
        kotlin.jvm.internal.m.c(r0VarA1);
        return r0VarA1.t(i11);
    }

    public final void x0(boolean z11) {
        if (z11 && s0()) {
            return;
        }
        if (z11 || s0()) {
            this.S = s0.IsNotPlaced;
            n1.e eVarA = this.f57017f.f56960a.A();
            Object[] objArr = eVarA.f43112a;
            int i11 = eVarA.f43114c;
            for (int i12 = 0; i12 < i11; i12++) {
                v0 v0Var = ((i0) objArr[i12]).f56893j0.f56975q;
                kotlin.jvm.internal.m.c(v0Var);
                v0Var.x0(true);
            }
        }
    }
}
