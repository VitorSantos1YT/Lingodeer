package y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f56960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56962c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f56965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f56967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f56968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f56969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f56970k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f56971l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f56972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f56973o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v0 f56975q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0 f56963d = e0.Idle;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b1 f56974p = new b1(this);

    public m0(i0 i0Var) {
        this.f56960a = i0Var;
    }

    public final k1 a() {
        return (k1) this.f56960a.f56892i0.f50087e;
    }

    public final void b() {
        e0 e0Var = this.f56960a.f56893j0.f56963d;
        if (e0Var == e0.LayingOut || e0Var == e0.LookaheadLayingOut) {
            if (this.f56974p.f56829c0) {
                g(true);
            } else {
                f(true);
            }
        }
        if (e0Var == e0.LookaheadLayingOut) {
            v0 v0Var = this.f56975q;
            if (v0Var == null || !v0Var.W) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j11) {
        v0 v0Var = this.f56975q;
        if (v0Var != null) {
            e0 e0Var = e0.LookaheadMeasuring;
            m0 m0Var = v0Var.f57017f;
            m0Var.f56963d = e0Var;
            b1 b1Var = m0Var.f56974p;
            i0 i0Var = m0Var.f56960a;
            m0Var.f56964e = false;
            v0Var.f57013a0 = j11;
            v1 snapshotObserver = l0.a(i0Var).getSnapshotObserver();
            u0 u0Var = v0Var.f57014b0;
            snapshotObserver.f57019a.d(i0Var, snapshotObserver.f57020b, u0Var);
            m0Var.f56965f = true;
            m0Var.f56966g = true;
            if (f.s(i0Var)) {
                b1Var.X = true;
                b1Var.Y = true;
            } else {
                b1Var.W = true;
            }
            m0Var.f56963d = e0.Idle;
        }
    }

    public final void d(int i11) {
        int i12 = this.f56971l;
        this.f56971l = i11;
        if ((i12 == 0) != (i11 == 0)) {
            i0 i0VarW = this.f56960a.w();
            m0 m0Var = i0VarW != null ? i0VarW.f56893j0 : null;
            if (m0Var != null) {
                if (i11 == 0) {
                    m0Var.d(m0Var.f56971l - 1);
                } else {
                    m0Var.d(m0Var.f56971l + 1);
                }
            }
        }
    }

    public final void e(int i11) {
        int i12 = this.f56973o;
        this.f56973o = i11;
        if ((i12 == 0) != (i11 == 0)) {
            i0 i0VarW = this.f56960a.w();
            m0 m0Var = i0VarW != null ? i0VarW.f56893j0 : null;
            if (m0Var != null) {
                if (i11 == 0) {
                    m0Var.e(m0Var.f56973o - 1);
                } else {
                    m0Var.e(m0Var.f56973o + 1);
                }
            }
        }
    }

    public final void f(boolean z11) {
        if (this.f56970k != z11) {
            this.f56970k = z11;
            if (z11 && !this.f56969j) {
                d(this.f56971l + 1);
            } else {
                if (z11 || this.f56969j) {
                    return;
                }
                d(this.f56971l - 1);
            }
        }
    }

    public final void g(boolean z11) {
        if (this.f56969j != z11) {
            this.f56969j = z11;
            if (z11 && !this.f56970k) {
                d(this.f56971l + 1);
            } else {
                if (z11 || this.f56970k) {
                    return;
                }
                d(this.f56971l - 1);
            }
        }
    }

    public final void h(boolean z11) {
        if (this.f56972n != z11) {
            this.f56972n = z11;
            if (z11 && !this.m) {
                e(this.f56973o + 1);
            } else {
                if (z11 || this.m) {
                    return;
                }
                e(this.f56973o - 1);
            }
        }
    }

    public final void i(boolean z11) {
        if (this.m != z11) {
            this.m = z11;
            if (z11 && !this.f56972n) {
                e(this.f56973o + 1);
            } else {
                if (z11 || this.f56972n) {
                    return;
                }
                e(this.f56973o - 1);
            }
        }
    }

    public final void j() {
        b1 b1Var = this.f56974p;
        m0 m0Var = b1Var.f56832f;
        Object obj = b1Var.T;
        i0 i0Var = this.f56960a;
        if ((obj != null || m0Var.a().G() != null) && b1Var.S) {
            b1Var.S = false;
            b1Var.T = m0Var.a().G();
            i0 i0VarW = i0Var.w();
            if (i0VarW != null) {
                i0.Y(i0VarW, false, 7);
            }
        }
        v0 v0Var = this.f56975q;
        if (v0Var != null) {
            m0 m0Var2 = v0Var.f57017f;
            if (v0Var.Z == null) {
                r0 r0VarA1 = m0Var2.a().a1();
                kotlin.jvm.internal.m.c(r0VarA1);
                if (r0VarA1.Q.G() == null) {
                    return;
                }
            }
            if (v0Var.Y) {
                v0Var.Y = false;
                r0 r0VarA2 = m0Var2.a().a1();
                kotlin.jvm.internal.m.c(r0VarA2);
                v0Var.Z = r0VarA2.Q.G();
                if (f.s(i0Var)) {
                    i0 i0VarW2 = i0Var.w();
                    if (i0VarW2 != null) {
                        i0.Y(i0VarW2, false, 7);
                        return;
                    }
                    return;
                }
                i0 i0VarW3 = i0Var.w();
                if (i0VarW3 != null) {
                    i0.W(i0VarW3, false, 7);
                }
            }
        }
    }
}
