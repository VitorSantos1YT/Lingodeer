package e2;

import android.os.Trace;
import kotlin.NoWhenBranchMatchedException;
import rt.mc;
import y2.d2;
import y2.o1;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends z1.q implements y2.l, y2.y, o1, x2.e, y2.m {
    public final boolean Q;
    public final fz.e R;
    public boolean S;
    public boolean T;
    public final int U;

    public e0(int i11, int i12, fz.e eVar) {
        i11 = (i12 & 1) != 0 ? 1 : i11;
        boolean z11 = (i12 & 2) == 0;
        eVar = (i12 & 4) != 0 ? null : eVar;
        this.Q = z11;
        this.R = eVar;
        this.U = i11;
    }

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    @Override // z1.q
    public final void M0() {
        int i11 = d0.f24710b[X0().ordinal()];
        if (i11 == 1 || i11 == 2) {
            p pVar = (p) y2.f.y(this).getFocusOwner();
            pVar.c(8, true, false);
            if (this.Q) {
                pVar.f24736a.D();
            }
            pVar.f24739d.a();
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        l focusOwner = y2.f.y(this).getFocusOwner();
        e0 e0VarF = d.f(this);
        if (e0VarF == null || !e0VarF.Q) {
            return;
        }
        p pVar2 = (p) focusOwner;
        pVar2.f24736a.D();
        pVar2.f24739d.a();
    }

    @Override // z1.q
    public final void N0() {
        if (X0().a()) {
            ((p) y2.f.y(this).getFocusOwner()).c(8, true, true);
        }
    }

    public final boolean T0(int i11) {
        int i12 = d0.f24709a[d.w(this, i11).ordinal()];
        if (i12 == 1) {
            return d.x(this);
        }
        if (i12 == 2) {
            return true;
        }
        if (i12 == 3 || i12 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final void U0(b0 b0Var, b0 b0Var2) {
        mc mcVar;
        fz.e eVar;
        p pVar = (p) y2.f.y(this).getFocusOwner();
        e0 e0VarG = pVar.g();
        if (!kotlin.jvm.internal.m.a(b0Var, b0Var2) && (eVar = this.R) != null) {
            eVar.invoke(b0Var, b0Var2);
        }
        z1.q qVar = this.f58482a;
        if (!qVar.P) {
            v2.a.b("visitAncestors called on an unattached node");
        }
        z1.q qVar2 = this.f58482a;
        y2.i0 i0VarX = y2.f.x(this);
        while (i0VarX != null) {
            if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 5120) != 0) {
                while (qVar2 != null) {
                    int i11 = qVar2.f58484c;
                    if ((i11 & 5120) != 0) {
                        if (qVar2 != qVar && (i11 & 1024) != 0) {
                            return;
                        }
                        if ((i11 & 4096) != 0) {
                            ?? F = qVar2;
                            ?? eVar2 = 0;
                            while (F != 0) {
                                if (F instanceof g) {
                                    g gVar = (g) F;
                                    if (e0VarG == pVar.g()) {
                                        gVar.u(b0Var2);
                                    }
                                } else if ((F.f58484c & 4096) != 0 && (F instanceof y2.n)) {
                                    z1.q qVar3 = ((y2.n) F).R;
                                    int i12 = 0;
                                    F = F;
                                    eVar2 = eVar2;
                                    while (qVar3 != null) {
                                        if ((qVar3.f58484c & 4096) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                eVar2 = eVar2;
                                                F = qVar3;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new n1.e(new z1.q[16]);
                                                }
                                                if (F != 0) {
                                                    eVar2.c(F);
                                                    F = 0;
                                                }
                                                eVar2.c(qVar3);
                                            }
                                        }
                                        qVar3 = qVar3.f58487f;
                                        F = F;
                                        eVar2 = eVar2;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                F = y2.f.f(eVar2);
                            }
                        }
                    }
                    qVar2 = qVar2.f58486e;
                }
            }
            i0VarX = i0VarX.w();
            qVar2 = (i0VarX == null || (mcVar = i0VarX.f56892i0) == null) ? null : (d2) mcVar.f50088f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final t V0() {
        boolean z11;
        mc mcVar;
        t tVar = new t();
        tVar.f24748a = true;
        v vVar = v.f24760b;
        tVar.f24749b = vVar;
        tVar.f24750c = vVar;
        tVar.f24751d = vVar;
        tVar.f24752e = vVar;
        tVar.f24753f = vVar;
        tVar.f24754g = vVar;
        tVar.f24755h = vVar;
        tVar.f24756i = vVar;
        tVar.f24757j = s.f24745b;
        tVar.f24758k = s.f24746c;
        tVar.f24759l = q.f24744a;
        int i11 = this.U;
        if (i11 == 1) {
            z11 = true;
        } else if (i11 == 0) {
            z11 = !(((o2.a) ((o2.c) ((o2.b) y2.f.i(this, g1.m))).f44473a.getValue()).f44472a == 1);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z11 = false;
        }
        tVar.f24748a = z11;
        z1.q qVar = this.f58482a;
        if (!qVar.P) {
            v2.a.b("visitAncestors called on an unattached node");
        }
        z1.q qVar2 = this.f58482a;
        y2.i0 i0VarX = y2.f.x(this);
        loop0: while (i0VarX != null) {
            if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 3072) != 0) {
                while (qVar2 != null) {
                    int i12 = qVar2.f58484c;
                    if ((i12 & 3072) != 0) {
                        if (qVar2 != qVar && (i12 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i12 & 2048) != 0) {
                            ?? F = qVar2;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof u) {
                                    ((u) F).a0(tVar);
                                } else if ((F.f58484c & 2048) != 0 && (F instanceof y2.n)) {
                                    z1.q qVar3 = ((y2.n) F).R;
                                    int i13 = 0;
                                    while (qVar3 != null) {
                                        if ((qVar3.f58484c & 2048) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                F = F;
                                                eVar = eVar;
                                                eVar = eVar;
                                                F = qVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new n1.e(new z1.q[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.c(F);
                                                    F = 0;
                                                }
                                                eVar.c(qVar3);
                                            }
                                        } else {
                                            F = F;
                                            eVar = eVar;
                                        }
                                        qVar3 = qVar3.f58487f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i13 == 1) {
                                        F = F;
                                        eVar = eVar;
                                    } else {
                                        F = F;
                                        eVar = eVar;
                                    }
                                }
                                F = y2.f.f(eVar);
                            }
                        }
                    }
                    qVar2 = qVar2.f58486e;
                }
            }
            i0VarX = i0VarX.w();
            qVar2 = (i0VarX == null || (mcVar = i0VarX.f56892i0) == null) ? null : (d2) mcVar.f50088f;
        }
        return tVar;
    }

    public final n0.p W0() {
        mc mcVar;
        Object obj;
        if (!this.f58482a.P) {
            v2.a.b("visitAncestors called on an unattached node");
        }
        z1.q qVar = this.f58482a.f58486e;
        y2.i0 i0VarX = y2.f.x(this);
        loop0: while (i0VarX != null) {
            if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 8388640) != 0) {
                while (qVar != null) {
                    int i11 = qVar.f58484c;
                    if ((i11 & 8388640) != 0) {
                        if ((8388608 & i11) != 0) {
                            if (!(qVar instanceof y2.n)) {
                                break loop0;
                            }
                            for (z1.q qVar2 = ((y2.n) qVar).R; qVar2 != null; qVar2 = qVar2.f58487f) {
                            }
                            break loop0;
                        }
                        if ((i11 & 32) == 0) {
                            continue;
                        } else {
                            if (qVar instanceof x2.e) {
                                obj = qVar;
                            } else if (qVar instanceof y2.n) {
                                obj = null;
                                for (z1.q qVar3 = ((y2.n) qVar).R; qVar3 != null; qVar3 = qVar3.f58487f) {
                                    if (qVar3 instanceof x2.e) {
                                        obj = qVar3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            x2.e eVar = (x2.e) obj;
                            if (eVar != null) {
                                ve.i iVarX = eVar.X();
                                x2.h hVar = w2.f.f54483a;
                                if (iVarX.n(hVar)) {
                                    return (n0.p) eVar.X().q(hVar);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    qVar = qVar.f58486e;
                }
            }
            i0VarX = i0VarX.w();
            qVar = (i0VarX == null || (mcVar = i0VarX.f56892i0) == null) ? null : (d2) mcVar.f50088f;
        }
        return null;
    }

    public final b0 X0() {
        mc mcVar;
        if (!this.P) {
            return b0.Inactive;
        }
        e0 e0VarG = ((p) y2.f.y(this).getFocusOwner()).g();
        if (e0VarG == null) {
            return b0.Inactive;
        }
        if (this == e0VarG) {
            return b0.Active;
        }
        if (e0VarG.P) {
            if (!e0VarG.f58482a.P) {
                v2.a.b("visitAncestors called on an unattached node");
            }
            z1.q qVar = e0VarG.f58482a.f58486e;
            y2.i0 i0VarX = y2.f.x(e0VarG);
            while (i0VarX != null) {
                if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 1024) != 0) {
                    while (qVar != null) {
                        if ((qVar.f58484c & 1024) != 0) {
                            z1.q qVarF = qVar;
                            n1.e eVar = null;
                            while (qVarF != null) {
                                if (qVarF instanceof e0) {
                                    if (this == ((e0) qVarF)) {
                                        return b0.ActiveParent;
                                    }
                                } else if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                                    int i11 = 0;
                                    for (z1.q qVar2 = ((y2.n) qVarF).R; qVar2 != null; qVar2 = qVar2.f58487f) {
                                        if ((qVar2.f58484c & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                qVarF = qVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new n1.e(new z1.q[16]);
                                                }
                                                if (qVarF != null) {
                                                    eVar.c(qVarF);
                                                    qVarF = null;
                                                }
                                                eVar.c(qVar2);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                qVarF = y2.f.f(eVar);
                            }
                        }
                        qVar = qVar.f58486e;
                    }
                }
                i0VarX = i0VarX.w();
                qVar = (i0VarX == null || (mcVar = i0VarX.f56892i0) == null) ? null : (d2) mcVar.f50088f;
            }
        }
        return b0.Inactive;
    }

    public final void Y0() {
        int i11 = d0.f24710b[X0().ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3 && i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        y2.f.t(this, new d2.c(2, yVar, this));
        Object obj = yVar.f38361a;
        if (obj == null) {
            kotlin.jvm.internal.m.n("focusProperties");
            throw null;
        }
        if (((r) obj).a()) {
            return;
        }
        ((p) y2.f.y(this).getFocusOwner()).c(8, true, true);
    }

    public final boolean Z0(int i11) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return V0().f24748a ? T0(i11) : d.h(this, i11, new o(i11, 2));
        } finally {
            Trace.endSection();
        }
    }

    @Override // y2.o1
    public final void m0() {
        Y0();
    }

    @Override // y2.y
    public final void F0(w2.x xVar) {
    }
}
