package y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends r0 {
    @Override // w2.p0
    public final w2.g1 B(long j11) {
        m0(j11);
        k1 k1Var = this.Q;
        n1.e eVarA = k1Var.Q.A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            v0 v0Var = ((i0) objArr[i12]).f56893j0.f56975q;
            kotlin.jvm.internal.m.c(v0Var);
            v0Var.L = g0.NotUsed;
        }
        i0 i0Var = k1Var.Q;
        r0.R0(this, i0Var.Z.e(this, i0Var.m(), j11));
        return this;
    }

    @Override // y2.r0
    public final void S0() {
        v0 v0Var = this.Q.Q.f56893j0.f56975q;
        kotlin.jvm.internal.m.c(v0Var);
        v0Var.H0();
    }

    @Override // w2.p0
    public final int W(int i11) {
        qh.d dVarV = this.Q.Q.v();
        w2.q0 q0VarE = dVarV.e();
        i0 i0Var = (i0) dVarV.f47750b;
        return q0VarE.i((k1) i0Var.f56892i0.f50087e, i0Var.m(), i11);
    }

    @Override // w2.p0
    public final int b(int i11) {
        qh.d dVarV = this.Q.Q.v();
        w2.q0 q0VarE = dVarV.e();
        i0 i0Var = (i0) dVarV.f47750b;
        return q0VarE.a((k1) i0Var.f56892i0.f50087e, i0Var.m(), i11);
    }

    @Override // w2.p0
    public final int p(int i11) {
        qh.d dVarV = this.Q.Q.v();
        w2.q0 q0VarE = dVarV.e();
        i0 i0Var = (i0) dVarV.f47750b;
        return q0VarE.f((k1) i0Var.f56892i0.f50087e, i0Var.m(), i11);
    }

    @Override // w2.p0
    public final int t(int i11) {
        qh.d dVarV = this.Q.Q.v();
        w2.q0 q0VarE = dVarV.e();
        i0 i0Var = (i0) dVarV.f47750b;
        return q0VarE.h((k1) i0Var.f56892i0.f50087e, i0Var.m(), i11);
    }

    @Override // y2.q0
    public final int x0(w2.n nVar) {
        v0 v0Var = this.Q.Q.f56893j0.f56975q;
        kotlin.jvm.internal.m.c(v0Var);
        j0 j0Var = v0Var.T;
        if (!v0Var.M) {
            m0 m0Var = v0Var.f57017f;
            if (m0Var.f56963d == e0.LookaheadMeasuring) {
                j0Var.f56925f = true;
                if (j0Var.f56921b) {
                    m0Var.f56965f = true;
                    m0Var.f56966g = true;
                }
            } else {
                j0Var.f56926g = true;
            }
        }
        u uVar = v0Var.e().f57012u0;
        if (uVar != null) {
            uVar.M = true;
        }
        v0Var.L();
        u uVar2 = v0Var.e().f57012u0;
        if (uVar2 != null) {
            uVar2.M = false;
        }
        Integer num = (Integer) j0Var.f56928i.get(nVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.V.g(iIntValue, nVar);
        return iIntValue;
    }
}
