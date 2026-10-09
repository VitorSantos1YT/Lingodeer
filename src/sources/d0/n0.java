package d0;

import bt.a3;
import bt.y2;
import rt.mc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends y2.n implements y2.b2, y2.r, y2.l, y2.o1, y2.g2 {
    public static final p1 Y = new p1();
    public h0.i S;
    public final fz.c T;
    public h0.d U;
    public n0.h0 V;
    public y2.k1 W;
    public final e2.e0 X;

    public n0(h0.i iVar, int i11, a3 a3Var) {
        this.S = iVar;
        this.T = a3Var;
        e2.e0 e0Var = new e2.e0(i11, 10, new m0(2, this, n0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0));
        T0(e0Var);
        this.X = e0Var;
    }

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    @Override // z1.q
    public final void N0() {
        n0.h0 h0Var = this.V;
        if (h0Var != null) {
            h0Var.b();
        }
        this.V = null;
    }

    public final void W0(h0.i iVar, h0.h hVar) {
        if (!this.P) {
            iVar.b(hVar);
            return;
        }
        rz.g1 g1Var = (rz.g1) ((wz.d) H0()).f55510a.get(rz.z.f50978b);
        rz.e0.B(H0(), null, null, new a0.e0(iVar, hVar, g1Var != null ? g1Var.invokeOnCompletion(new com.google.accompanist.permissions.a(7, iVar, hVar)) : null, (vy.d) null, 15), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final o0 X0() {
        y2.g2 g2Var;
        mc mcVar;
        if (this.P) {
            if (!this.f58482a.P) {
                v2.a.b("visitAncestors called on an unattached node");
            }
            z1.q qVar = this.f58482a.f58486e;
            y2.i0 i0VarX = y2.f.x(this);
            loop0: while (true) {
                if (i0VarX == null) {
                    g2Var = null;
                    break;
                }
                if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 262144) != 0) {
                    while (qVar != null) {
                        if ((qVar.f58484c & 262144) != 0) {
                            ?? F = qVar;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof y2.g2) {
                                    g2Var = (y2.g2) F;
                                    if (o0.R.equals(g2Var.h())) {
                                        break loop0;
                                    }
                                } else if ((F.f58484c & 262144) != 0 && (F instanceof y2.n)) {
                                    z1.q qVar2 = ((y2.n) F).R;
                                    int i11 = 0;
                                    F = F;
                                    eVar = eVar;
                                    while (qVar2 != null) {
                                        if ((qVar2.f58484c & 262144) != 0) {
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
                                F = y2.f.f(eVar);
                            }
                        }
                        qVar = qVar.f58486e;
                    }
                }
                i0VarX = i0VarX.w();
                qVar = (i0VarX == null || (mcVar = i0VarX.f56892i0) == null) ? null : (y2.d2) mcVar.f50088f;
            }
            if (g2Var instanceof o0) {
                return (o0) g2Var;
            }
        }
        return null;
    }

    public final void Y0(h0.i iVar) {
        h0.d dVar;
        if (kotlin.jvm.internal.m.a(this.S, iVar)) {
            return;
        }
        h0.i iVar2 = this.S;
        if (iVar2 != null && (dVar = this.U) != null) {
            iVar2.b(new h0.e(dVar));
        }
        this.U = null;
        this.S = iVar;
    }

    @Override // y2.g2
    public final Object h() {
        return Y;
    }

    @Override // y2.b2
    public final void i0(g3.b0 b0Var) {
        boolean zA = this.X.X0().a();
        mz.j[] jVarArr = g3.z.f28737a;
        g3.a0 a0Var = g3.x.f28720k;
        mz.j jVar = g3.z.f28737a[4];
        b0Var.b(a0Var, Boolean.valueOf(zA));
        b0Var.b(g3.n.f28687w, new g3.a(null, new y2(0, this, n0.class, "requestFocus", "requestFocus()Z", 0, 3)));
    }

    @Override // y2.r
    public final void m(y2.k1 k1Var) {
        o0 o0VarX0;
        this.W = k1Var;
        if (this.X.X0().a()) {
            if (!k1Var.c1().P) {
                o0 o0VarX1 = X0();
                if (o0VarX1 != null) {
                    o0VarX1.T0(null);
                    return;
                }
                return;
            }
            y2.k1 k1Var2 = this.W;
            if (k1Var2 == null || !k1Var2.c1().P || (o0VarX0 = X0()) == null) {
                return;
            }
            o0VarX0.T0(this.W);
        }
    }

    @Override // y2.o1
    public final void m0() {
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        y2.f.t(this, new at.f(24, yVar, this));
        n0.h0 h0Var = (n0.h0) yVar.f38361a;
        if (this.X.X0().a()) {
            n0.h0 h0Var2 = this.V;
            if (h0Var2 != null) {
                h0Var2.b();
            }
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.V = h0Var;
        }
    }
}
