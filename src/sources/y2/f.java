package y2;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import rt.mc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f56853a = new d(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f56854b = new q1(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [fz.c] */
    /* JADX WARN: Type inference failed for: r1v10, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void A(m mVar, Object obj, fz.c cVar) {
        mc mcVar;
        z1.q qVar = (z1.q) mVar;
        if (!qVar.f58482a.P) {
            v2.a.b("visitAncestors called on an unattached node");
        }
        z1.q qVar2 = qVar.f58482a.f58486e;
        i0 i0VarX = x(mVar);
        while (i0VarX != null) {
            if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 262144) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.f58484c & 262144) != 0) {
                        ?? F = qVar2;
                        ?? eVar = 0;
                        while (F != 0) {
                            if (F instanceof g2) {
                                g2 g2Var = (g2) F;
                                if (!(obj.equals(g2Var.h()) ? ((Boolean) cVar.invoke(g2Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((F.f58484c & 262144) != 0) && (F instanceof n)) {
                                    z1.q qVar3 = ((n) F).R;
                                    int i11 = 0;
                                    while (qVar3 != null) {
                                        if ((qVar3.f58484c & 262144) != 0) {
                                            F = F;
                                            eVar = eVar;
                                            i11++;
                                            if (i11 == 1) {
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
                                            F = F;
                                            eVar = eVar;
                                        }
                                        qVar3 = qVar3.f58487f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                        F = F;
                                        eVar = eVar;
                                    } else {
                                        F = F;
                                        eVar = eVar;
                                    }
                                }
                            }
                            F = f(eVar);
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
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, y2.g2, y2.m] */
    /* JADX WARN: Type inference failed for: r12v0, types: [fz.c] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [z1.q] */
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
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void B(g2 g2Var, fz.c cVar) {
        mc mcVar;
        z1.q qVar = (z1.q) g2Var;
        if (!qVar.f58482a.P) {
            v2.a.b("visitAncestors called on an unattached node");
        }
        z1.q qVar2 = qVar.f58482a.f58486e;
        i0 i0VarX = x(g2Var);
        while (i0VarX != null) {
            if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 262144) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.f58484c & 262144) != 0) {
                        ?? F = qVar2;
                        ?? eVar = 0;
                        while (F != 0) {
                            boolean zBooleanValue = true;
                            if (F instanceof g2) {
                                g2 g2Var2 = (g2) F;
                                if (kotlin.jvm.internal.m.a(g2Var.h(), g2Var2.h()) && g2Var.getClass() == g2Var2.getClass()) {
                                    zBooleanValue = ((Boolean) cVar.invoke(g2Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((F.f58484c & 262144) != 0) && (F instanceof n)) {
                                    z1.q qVar3 = ((n) F).R;
                                    int i11 = 0;
                                    while (qVar3 != null) {
                                        if ((qVar3.f58484c & 262144) != 0) {
                                            F = F;
                                            eVar = eVar;
                                            i11++;
                                            if (i11 == 1) {
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
                                            F = F;
                                            eVar = eVar;
                                        }
                                        qVar3 = qVar3.f58487f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                        F = F;
                                        eVar = eVar;
                                    } else {
                                        F = F;
                                        eVar = eVar;
                                    }
                                }
                            }
                            F = f(eVar);
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
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, y2.g2] */
    /* JADX WARN: Type inference failed for: r13v0, types: [fz.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void C(g2 g2Var, fz.c cVar) {
        z1.q qVar = (z1.q) g2Var;
        if (!qVar.f58482a.P) {
            v2.a.b("visitSubtreeIf called on an unattached node");
        }
        n1.e eVar = new n1.e(new z1.q[16]);
        z1.q qVar2 = qVar.f58482a;
        z1.q qVar3 = qVar2.f58487f;
        if (qVar3 == null) {
            b(eVar, qVar2);
        } else {
            eVar.c(qVar3);
        }
        while (true) {
            int i11 = eVar.f43114c;
            if (i11 == 0) {
                return;
            }
            z1.q qVar4 = (z1.q) eVar.l(i11 - 1);
            if ((qVar4.f58485d & 262144) != 0) {
                z1.q qVar5 = qVar4;
                while (true) {
                    if (qVar5 != null && qVar5.P) {
                        if ((qVar5.f58484c & 262144) != 0) {
                            ?? F = qVar5;
                            ?? eVar2 = 0;
                            while (F != 0) {
                                if (F instanceof g2) {
                                    g2 g2Var2 = (g2) F;
                                    f2 f2Var = (kotlin.jvm.internal.m.a(g2Var.h(), g2Var2.h()) && g2Var.getClass() == g2Var2.getClass()) ? (f2) cVar.invoke(g2Var2) : f2.ContinueTraversal;
                                    if (f2Var != f2.CancelTraversal) {
                                        if (f2Var == f2.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((F.f58484c & 262144) != 0 && (F instanceof n)) {
                                    z1.q qVar6 = ((n) F).R;
                                    int i12 = 0;
                                    F = F;
                                    eVar2 = eVar2;
                                    while (qVar6 != null) {
                                        if ((qVar6.f58484c & 262144) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                eVar2 = eVar2;
                                                F = qVar6;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new n1.e(new z1.q[16]);
                                                }
                                                if (F != 0) {
                                                    eVar2.c(F);
                                                    F = 0;
                                                }
                                                eVar2.c(qVar6);
                                            }
                                        }
                                        qVar6 = qVar6.f58487f;
                                        F = F;
                                        eVar2 = eVar2;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                F = f(eVar2);
                            }
                        }
                        qVar5 = qVar5.f58487f;
                    }
                }
            }
            b(eVar, qVar4);
        }
    }

    public static final long a(float f5, boolean z11, boolean z12) {
        return (((z11 ? 1L : 0L) | (z12 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32);
    }

    public static final void b(n1.e eVar, z1.q qVar) {
        n1.e eVarA = x(qVar).A();
        int i11 = eVarA.f43114c - 1;
        Object[] objArr = eVarA.f43112a;
        if (i11 < objArr.length) {
            while (i11 >= 0) {
                eVar.c((z1.q) ((i0) objArr[i11]).f56892i0.f50089g);
                i11--;
            }
        }
    }

    public static final int c(q0 q0Var, w2.n nVar) {
        q0 q0VarG0 = q0Var.G0();
        if (q0VarG0 == null) {
            v2.a.b("Child of " + q0Var + " cannot be null when calculating alignment line");
        }
        if (q0Var.K0().a().containsKey(nVar)) {
            Integer num = (Integer) q0Var.K0().a().get(nVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iX = q0VarG0.X(nVar);
            if (iX != Integer.MIN_VALUE) {
                q0VarG0.L = true;
                q0Var.M = true;
                q0Var.Q0();
                q0VarG0.L = false;
                q0Var.M = false;
                return iX + ((int) (nVar instanceof w2.n ? q0VarG0.M0() & 4294967295L : q0VarG0.M0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean d(c cVar) {
        d2 d2Var = (d2) x(cVar).f56892i0.f50088f;
        kotlin.jvm.internal.m.d(d2Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return d2Var.Q;
    }

    public static final z1.q e(m mVar, int i11) {
        z1.q qVar = ((z1.q) mVar).f58482a.f58487f;
        if (qVar == null || (qVar.f58485d & i11) == 0) {
            return null;
        }
        while (qVar != null) {
            int i12 = qVar.f58484c;
            if ((i12 & 2) != 0) {
                return null;
            }
            if ((i12 & i11) != 0) {
                return qVar;
            }
            qVar = qVar.f58487f;
        }
        return null;
    }

    public static final z1.q f(n1.e eVar) {
        int i11;
        if (eVar == null || (i11 = eVar.f43114c) == 0) {
            return null;
        }
        return (z1.q) eVar.l(i11 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final z g(z1.q qVar) {
        if ((qVar.f58484c & 2) != 0) {
            if (qVar instanceof z) {
                return (z) qVar;
            }
            if (qVar instanceof n) {
                z1.q qVar2 = ((n) qVar).R;
                while (qVar2 != 0) {
                    if (qVar2 instanceof z) {
                        return (z) qVar2;
                    }
                    qVar2 = (!(qVar2 instanceof n) || (qVar2.f58484c & 2) == 0) ? qVar2.f58487f : ((n) qVar2).R;
                }
            }
        }
        return null;
    }

    public static final int h(long j11, long j12) {
        boolean zQ = q(j11);
        if (zQ != q(j12)) {
            return zQ ? -1 : 1;
        }
        int iSignum = (int) Math.signum(l(j11) - l(j12));
        if (Math.min(l(j11), l(j12)) >= CropImageView.DEFAULT_ASPECT_RATIO && p(j11) != p(j12)) {
            return p(j11) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object i(l lVar, l1.v1 v1Var) {
        if (!((z1.q) lVar).f58482a.P) {
            v2.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        t1.i iVar = (t1.i) x(lVar).f56887e0;
        iVar.getClass();
        return l1.t.E(iVar, v1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, y2.g2, y2.m] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [z1.q] */
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
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final g2 j(g2 g2Var) {
        mc mcVar;
        z1.q qVar = (z1.q) g2Var;
        if (!qVar.f58482a.P) {
            v2.a.b("visitAncestors called on an unattached node");
        }
        z1.q qVar2 = qVar.f58482a.f58486e;
        i0 i0VarX = x(g2Var);
        while (i0VarX != null) {
            if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 262144) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.f58484c & 262144) != 0) {
                        ?? F = qVar2;
                        ?? eVar = 0;
                        while (F != 0) {
                            if (F instanceof g2) {
                                g2 g2Var2 = (g2) F;
                                if (kotlin.jvm.internal.m.a(g2Var.h(), g2Var2.h()) && g2Var.getClass() == g2Var2.getClass()) {
                                    return g2Var2;
                                }
                            } else if ((F.f58484c & 262144) != 0 && (F instanceof n)) {
                                z1.q qVar3 = ((n) F).R;
                                int i11 = 0;
                                F = F;
                                eVar = eVar;
                                while (qVar3 != null) {
                                    if ((qVar3.f58484c & 262144) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                    }
                                    qVar3 = qVar3.f58487f;
                                    F = F;
                                    eVar = eVar;
                                }
                                if (i11 == 1) {
                                }
                            }
                            F = f(eVar);
                        }
                    }
                    qVar2 = qVar2.f58486e;
                }
            }
            i0VarX = i0VarX.w();
            qVar2 = (i0VarX == null || (mcVar = i0VarX.f56892i0) == null) ? null : (d2) mcVar.f50088f;
        }
        return null;
    }

    public static final ArrayList k(w2.s sVar) {
        kotlin.jvm.internal.m.d(sVar, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        i0 i0VarJ0 = ((q0) sVar).J0();
        boolean zR = r(i0VarJ0);
        n1.b bVar = (n1.b) i0VarJ0.p();
        n1.e eVar = (n1.e) bVar.f43104b;
        ArrayList arrayList = new ArrayList(eVar.f43114c);
        int i11 = eVar.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            i0 i0Var = (i0) bVar.get(i12);
            arrayList.add(zR ? i0Var.m() : i0Var.n());
        }
        return arrayList;
    }

    public static final float l(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(q qVar) {
        if (((z1.q) qVar).f58482a.P) {
            v(qVar, 1).j1();
        }
    }

    public static final void n(z zVar) {
        x(zVar).F();
    }

    public static final void o(b2 b2Var) {
        x(b2Var).G();
    }

    public static final boolean p(long j11) {
        return (j11 & 2) != 0;
    }

    public static final boolean q(long j11) {
        return (j11 & 1) != 0;
    }

    public static final boolean r(i0 i0Var) {
        int i11 = c1.f56842a[i0Var.f56893j0.f56963d.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return true;
        }
        if (i11 == 3 || i11 == 4) {
            return false;
        }
        if (i11 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        i0 i0VarW = i0Var.w();
        if (i0VarW != null) {
            return r(i0VarW);
        }
        throw new IllegalArgumentException("no parent for idle node");
    }

    public static final boolean s(i0 i0Var) {
        if (i0Var.K == null) {
            return false;
        }
        i0 i0VarW = i0Var.w();
        return (i0VarW != null ? i0VarW.K : null) == null || i0Var.f56893j0.f56961b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void t(z1.q qVar, fz.a aVar) {
        p1 p1Var = qVar.f58488t;
        if (p1Var == null) {
            p1Var = new p1((o1) qVar);
            qVar.f58488t = p1Var;
        }
        v1 snapshotObserver = y(qVar).getSnapshotObserver();
        snapshotObserver.f57019a.d(p1Var, e.f56849t, aVar);
    }

    public static final void u(m mVar) {
        a2.e eVar;
        i0 i0VarX = x(mVar);
        if (i0VarX.W) {
            return;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) l0.a(i0VarX);
        if (!AndroidComposeView.f() || (eVar = androidComposeView.f1187p0) == null) {
            return;
        }
        eVar.f304d.f31536a.G(i0VarX.f56880b, new a2.d(eVar, i0VarX));
    }

    public static final k1 v(m mVar, int i11) {
        k1 k1Var = ((z1.q) mVar).f58482a.H;
        kotlin.jvm.internal.m.c(k1Var);
        if (k1Var.c1() != mVar || !l1.g(i11)) {
            return k1Var;
        }
        k1 k1Var2 = k1Var.R;
        kotlin.jvm.internal.m.c(k1Var2);
        return k1Var2;
    }

    public static final k1 w(m mVar) {
        if (!((z1.q) mVar).f58482a.P) {
            v2.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        k1 k1VarV = v(mVar, 2);
        if (!k1VarV.c1().P) {
            v2.a.b("LayoutCoordinates is not attached.");
        }
        return k1VarV;
    }

    public static final i0 x(m mVar) {
        k1 k1Var = ((z1.q) mVar).f58482a.H;
        if (k1Var != null) {
            return k1Var.Q;
        }
        throw defpackage.e.t("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final t1 y(m mVar) {
        t1 t1Var = x(mVar).Q;
        if (t1Var != null) {
            return t1Var;
        }
        throw defpackage.e.t("This node does not have an owner.");
    }

    public static final View z(m mVar) {
        if (!((z1.q) mVar).f58482a.P) {
            v2.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) l0.a(x(mVar));
    }
}
