package g2;

import w2.g1;
import y2.b2;
import y2.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends z1.q implements y2.z, b2 {
    public fz.c Q;

    public r(fz.c cVar) {
        this.Q = cVar;
    }

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        g1 g1VarB = p0Var.B(j11);
        return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new a0.e(1, g1VarB, this));
    }

    @Override // y2.b2
    public final boolean e() {
        return false;
    }

    @Override // y2.b2
    public final void i0(g3.b0 b0Var) {
        boolean z11;
        w0 w0Var;
        k1 k1VarV = y2.f.v(this, 2);
        if (k1VarV.f56951h0) {
            w0 w0Var2 = k1VarV.f56949f0;
            z11 = k1VarV.f56950g0;
            w0Var = w0Var2;
        } else {
            t0 t0Var = f0.f28555a;
            if (t0Var == null) {
                f0.f28555a = new t0();
            } else {
                t0Var.a();
            }
            t0 t0Var2 = f0.f28555a;
            kotlin.jvm.internal.m.c(t0Var2);
            t0Var2.R = k1VarV.Q.f56881b0;
            t0Var2.Q = ff.h.P(k1VarV.f54503c);
            x1.f fVarN = re.q.n();
            fz.c cVarE = fVarN != null ? fVarN.e() : null;
            x1.f fVarR = re.q.r(fVarN);
            try {
                this.Q.invoke(t0Var2);
                re.q.t(fVarN, fVarR, cVarE);
                w0Var = t0Var2.O;
                z11 = t0Var2.P;
            } catch (Throwable th2) {
                re.q.t(fVarN, fVarR, cVarE);
                throw th2;
            }
        }
        if (z11) {
            mz.j[] jVarArr = g3.z.f28737a;
            g3.a0 a0Var = g3.x.P;
            mz.j jVar = g3.z.f28737a[28];
            b0Var.b(a0Var, w0Var);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.Q + ')';
    }
}
