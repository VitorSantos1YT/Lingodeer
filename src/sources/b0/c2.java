package b0;

import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f3458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f3459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.k1 f3461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1.k1 f3462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l1.i1 f3463f = new l1.i1(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l1.i1 f3464g = new l1.i1(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l1.k1 f3465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x1.p f3466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x1.p f3467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l1.k1 f3468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l1.g0 f3469l;

    public c2(h2 h2Var, c2 c2Var, String str) {
        this.f3458a = h2Var;
        this.f3459b = c2Var;
        this.f3460c = str;
        this.f3461d = l1.t.B(h2Var.Y());
        this.f3462e = l1.t.B(new x1(h2Var.Y(), h2Var.Y()));
        Boolean bool = Boolean.FALSE;
        this.f3465h = l1.t.B(bool);
        this.f3466i = new x1.p();
        this.f3467j = new x1.p();
        this.f3468k = l1.t.B(bool);
        this.f3469l = l1.t.s(new s1(this, 1));
        h2Var.p0(this);
    }

    public final void a(Object obj, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1493585151);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(obj) : sVar.h(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(this) ? 32 : 16;
        }
        if (!sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.W();
        } else if (g()) {
            sVar.d0(467781377);
            sVar.p(false);
        } else {
            sVar.d0(466120769);
            p(obj);
            int i13 = i12 & 112;
            boolean z11 = i13 == 32;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = l1.t.s(new s1(this, 0));
                sVar.o0(objQ);
            }
            if (((Boolean) ((b3) objQ).getValue()).booleanValue()) {
                sVar.d0(466528884);
                Object objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = l1.t.q(sVar);
                    sVar.o0(objQ2);
                }
                rz.b0 b0Var = (rz.b0) objQ2;
                boolean zH = sVar.h(b0Var) | (i13 == 32);
                Object objQ3 = sVar.Q();
                if (zH || objQ3 == gVar) {
                    objQ3 = new au.d1(7, b0Var, this);
                    sVar.o0(objQ3);
                }
                l1.t.d(b0Var, this, (fz.c) objQ3, sVar);
                sVar.p(false);
            } else {
                sVar.d0(467771457);
                sVar.p(false);
            }
            sVar.p(false);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t1(this, i11, 0, obj);
        }
    }

    public final long b() {
        x1.p pVar = this.f3466i;
        int size = pVar.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, ((y1) pVar.get(i11)).N.l());
        }
        x1.p pVar2 = this.f3467j;
        int size2 = pVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            jMax = Math.max(jMax, ((c2) pVar2.get(i12)).b());
        }
        return jMax;
    }

    public final void c() {
        x1.p pVar = this.f3466i;
        int size = pVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            y1 y1Var = (y1) pVar.get(i11);
            y1Var.f3751f = null;
            y1Var.f3750e = null;
            y1Var.K = false;
        }
        x1.p pVar2 = this.f3467j;
        int size2 = pVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((c2) pVar2.get(i12)).c();
        }
    }

    public final boolean d() {
        x1.p pVar = this.f3466i;
        int size = pVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((y1) pVar.get(i11)).f3750e != null) {
                return true;
            }
        }
        x1.p pVar2 = this.f3467j;
        int size2 = pVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (((c2) pVar2.get(i12)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        c2 c2Var = this.f3459b;
        return c2Var != null ? c2Var.e() : this.f3463f.l();
    }

    public final w1 f() {
        return (w1) this.f3462e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f3468k.getValue()).booleanValue();
    }

    public final void h(long j11, boolean z11) {
        l1.i1 i1Var = this.f3464g;
        long jL = i1Var.l();
        h2 h2Var = this.f3458a;
        if (jL == Long.MIN_VALUE) {
            i1Var.n(j11);
            ((l1.k1) h2Var.f3561b).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((l1.k1) h2Var.f3561b).getValue()).booleanValue()) {
            ((l1.k1) h2Var.f3561b).setValue(Boolean.TRUE);
        }
        this.f3465h.setValue(Boolean.FALSE);
        x1.p pVar = this.f3466i;
        int size = pVar.size();
        boolean z12 = true;
        for (int i11 = 0; i11 < size; i11++) {
            y1 y1Var = (y1) pVar.get(i11);
            l1.k1 k1Var = y1Var.f3752t;
            l1.k1 k1Var2 = y1Var.f3752t;
            if (!((Boolean) k1Var.getValue()).booleanValue()) {
                long jD = z11 ? y1Var.b().d() : j11;
                y1Var.f(y1Var.b().h(jD));
                y1Var.M = y1Var.b().f(jD);
                if (y1Var.b().g(jD)) {
                    k1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) k1Var2.getValue()).booleanValue()) {
                z12 = false;
            }
        }
        x1.p pVar2 = this.f3467j;
        int size2 = pVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            c2 c2Var = (c2) pVar2.get(i12);
            l1.k1 k1Var3 = c2Var.f3461d;
            h2 h2Var2 = c2Var.f3458a;
            if (!kotlin.jvm.internal.m.a(k1Var3.getValue(), h2Var2.Y())) {
                c2Var.h(j11, z11);
            }
            if (!kotlin.jvm.internal.m.a(c2Var.f3461d.getValue(), h2Var2.Y())) {
                z12 = false;
            }
        }
        if (z12) {
            i();
        }
    }

    public final void i() {
        this.f3464g.n(Long.MIN_VALUE);
        h2 h2Var = this.f3458a;
        if (h2Var instanceof p0) {
            ((p0) h2Var).o0(this.f3461d.getValue());
        }
        n(0L);
        ((l1.k1) h2Var.f3561b).setValue(Boolean.FALSE);
        x1.p pVar = this.f3467j;
        int size = pVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((c2) pVar.get(i11)).i();
        }
    }

    public final void j(float f5) {
        x1.p pVar = this.f3466i;
        int size = pVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            y1 y1Var = (y1) pVar.get(i11);
            y1Var.getClass();
            if (f5 == -4.0f || f5 == -5.0f) {
                r1 r1Var = y1Var.f3751f;
                if (r1Var != null) {
                    y1Var.b().a(r1Var.f3659c);
                    y1Var.f3750e = null;
                    y1Var.f3751f = null;
                }
                Object obj = f5 == -4.0f ? y1Var.b().f3660d : y1Var.b().f3659c;
                y1Var.b().a(obj);
                y1Var.b().b(obj);
                y1Var.f(obj);
                y1Var.N.n(y1Var.b().d());
            } else {
                y1Var.H.m(f5);
            }
        }
        x1.p pVar2 = this.f3467j;
        int size2 = pVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((c2) pVar2.get(i12)).j(f5);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.f3464g.n(Long.MIN_VALUE);
        h2 h2Var = this.f3458a;
        ((l1.k1) h2Var.f3561b).setValue(Boolean.FALSE);
        boolean zG = g();
        l1.k1 k1Var = this.f3461d;
        if (!zG || !kotlin.jvm.internal.m.a(h2Var.Y(), obj) || !kotlin.jvm.internal.m.a(k1Var.getValue(), obj2)) {
            if (!kotlin.jvm.internal.m.a(h2Var.Y(), obj) && (h2Var instanceof p0)) {
                ((p0) h2Var).o0(obj);
            }
            k1Var.setValue(obj2);
            this.f3468k.setValue(Boolean.TRUE);
            this.f3462e.setValue(new x1(obj, obj2));
        }
        x1.p pVar = this.f3467j;
        int size = pVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            c2 c2Var = (c2) pVar.get(i11);
            kotlin.jvm.internal.m.d(c2Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (c2Var.g()) {
                c2Var.k(c2Var.f3458a.Y(), c2Var.f3461d.getValue());
            }
        }
        x1.p pVar2 = this.f3466i;
        int size2 = pVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((y1) pVar2.get(i12)).d(0L);
        }
    }

    public final void l(long j11) {
        l1.i1 i1Var = this.f3464g;
        if (i1Var.l() == Long.MIN_VALUE) {
            i1Var.n(j11);
        }
        n(j11);
        this.f3465h.setValue(Boolean.FALSE);
        x1.p pVar = this.f3466i;
        int size = pVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((y1) pVar.get(i11)).d(j11);
        }
        x1.p pVar2 = this.f3467j;
        int size2 = pVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            c2 c2Var = (c2) pVar2.get(i12);
            if (!kotlin.jvm.internal.m.a(c2Var.f3461d.getValue(), c2Var.f3458a.Y())) {
                c2Var.l(j11);
            }
        }
    }

    public final void m(w0 w0Var) {
        x1.p pVar = this.f3466i;
        int size = pVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            y1 y1Var = (y1) pVar.get(i11);
            l1.k1 k1Var = y1Var.L;
            if (!kotlin.jvm.internal.m.a(y1Var.b().f3659c, y1Var.b().f3660d)) {
                y1Var.f3751f = y1Var.b();
                y1Var.f3750e = w0Var;
            }
            y1Var.f3749d.setValue(new r1(y1Var.P, y1Var.f3746a, k1Var.getValue(), k1Var.getValue(), y1Var.M.c()));
            y1Var.N.n(y1Var.b().d());
            y1Var.K = true;
        }
        x1.p pVar2 = this.f3467j;
        int size2 = pVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((c2) pVar2.get(i12)).m(w0Var);
        }
    }

    public final void n(long j11) {
        if (this.f3459b == null) {
            this.f3463f.n(j11);
        }
    }

    public final void o() {
        r1 r1Var;
        x1.p pVar = this.f3466i;
        int size = pVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            y1 y1Var = (y1) pVar.get(i11);
            w0 w0Var = y1Var.f3750e;
            if (w0Var != null && (r1Var = y1Var.f3751f) != null) {
                long jR = hz.b.R(w0Var.f3729g * ((double) w0Var.f3726d));
                Object objH = r1Var.h(jR);
                if (y1Var.K) {
                    y1Var.b().b(objH);
                }
                y1Var.b().a(objH);
                y1Var.N.n(y1Var.b().d());
                if (y1Var.H.l() == -2.0f || y1Var.K) {
                    y1Var.f(objH);
                } else {
                    y1Var.d(y1Var.Q.e());
                }
                if (jR >= w0Var.f3729g) {
                    y1Var.f3750e = null;
                    y1Var.f3751f = null;
                } else {
                    w0Var.f3725c = false;
                }
            }
        }
        x1.p pVar2 = this.f3467j;
        int size2 = pVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((c2) pVar2.get(i12)).o();
        }
    }

    public final void p(Object obj) {
        l1.k1 k1Var = this.f3461d;
        if (kotlin.jvm.internal.m.a(k1Var.getValue(), obj)) {
            return;
        }
        this.f3462e.setValue(new x1(k1Var.getValue(), obj));
        h2 h2Var = this.f3458a;
        if (!kotlin.jvm.internal.m.a(h2Var.Y(), k1Var.getValue())) {
            h2Var.o0(k1Var.getValue());
        }
        k1Var.setValue(obj);
        if (this.f3464g.l() == Long.MIN_VALUE) {
            this.f3465h.setValue(Boolean.TRUE);
        }
        x1.p pVar = this.f3466i;
        int size = pVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((y1) pVar.get(i11)).H.m(-2.0f);
        }
    }

    public final String toString() {
        x1.p pVar = this.f3466i;
        int size = pVar.size();
        String str = "Transition animation values: ";
        for (int i11 = 0; i11 < size; i11++) {
            str = str + ((y1) pVar.get(i11)) + ", ";
        }
        return str;
    }
}
