package d0;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends z1.q implements y2.r, y2.q, y2.b2, y2.o1 {
    public bp.r0 Q;
    public d1.d1 R;
    public u1 S;
    public View T;
    public v3.c U;
    public t1 V;
    public l1.g0 X;
    public v3.l Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public tz.h f22739a0;
    public final l1.k1 W = new l1.k1(null, l1.g.f39300d);
    public long Y = 9205357640488583168L;

    public j1(bp.r0 r0Var, d1.d1 d1Var, u1 u1Var) {
        this.Q = r0Var;
        this.R = d1Var;
        this.S = u1Var;
    }

    @Override // z1.q
    public final void L0() {
        m0();
        this.f22739a0 = qx.p.b(0, 7, null);
        rz.e0.B(H0(), null, rz.d0.UNDISPATCHED, new b0.a1(this, null, 21), 1);
    }

    @Override // z1.q
    public final void M0() {
        t1 t1Var = this.V;
        if (t1Var != null) {
            ((v1) t1Var).b();
        }
        this.V = null;
    }

    public final long T0() {
        if (this.X == null) {
            this.X = l1.t.s(new i1(this, 2));
        }
        l1.g0 g0Var = this.X;
        if (g0Var != null) {
            return ((f2.b) g0Var.getValue()).f26570a;
        }
        return 9205357640488583168L;
    }

    public final void U0() {
        t1 t1Var = this.V;
        if (t1Var != null) {
            ((v1) t1Var).b();
        }
        View viewZ = this.T;
        if (viewZ == null) {
            viewZ = y2.f.z(this);
        }
        this.T = viewZ;
        v3.c cVar = this.U;
        if (cVar == null) {
            cVar = y2.f.x(this).f56881b0;
        }
        this.U = cVar;
        this.V = this.S.b(viewZ, cVar);
        W0();
    }

    public final void V0() {
        v3.c cVar = this.U;
        if (cVar == null) {
            cVar = y2.f.x(this).f56881b0;
            this.U = cVar;
        }
        long j11 = ((f2.b) this.Q.invoke(cVar)).f26570a;
        if ((j11 & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & T0()) == 9205357640488583168L) {
            this.Y = 9205357640488583168L;
            t1 t1Var = this.V;
            if (t1Var != null) {
                ((v1) t1Var).b();
                return;
            }
            return;
        }
        this.Y = f2.b.h(T0(), j11);
        if (this.V == null) {
            U0();
        }
        t1 t1Var2 = this.V;
        if (t1Var2 != null) {
            t1Var2.a(this.Y, 9205357640488583168L);
        }
        W0();
    }

    public final void W0() {
        v3.c cVar;
        t1 t1Var = this.V;
        if (t1Var == null || (cVar = this.U) == null) {
            return;
        }
        v1 v1Var = (v1) t1Var;
        long jC = v1Var.c();
        v3.l lVar = this.Z;
        if (lVar != null && jC == lVar.f53498a) {
            return;
        }
        this.R.invoke(new v3.h(cVar.o(ff.h.P(v1Var.c()))));
        this.Z = new v3.l(v1Var.c());
    }

    @Override // y2.q
    public final void i(y2.k0 k0Var) {
        k0Var.a();
        tz.h hVar = this.f22739a0;
        if (hVar != null) {
            hVar.i(qy.b0.f48488a);
        }
    }

    @Override // y2.b2
    public final void i0(g3.b0 b0Var) {
        b0Var.b(k1.f22752a, new i1(this, 1));
    }

    @Override // y2.r
    public final void m(y2.k1 k1Var) {
        this.W.setValue(k1Var);
    }

    @Override // y2.o1
    public final void m0() {
        y2.f.t(this, new i1(this, 0));
    }
}
