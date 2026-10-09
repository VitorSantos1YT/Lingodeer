package e2;

import com.yalantis.ucrop.view.CropImageView;
import kotlin.NoWhenBranchMatchedException;
import rt.mc;
import y2.d2;
import y2.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    /* JADX WARN: Code duplicated, block: B:55:0x00a5 A[PHI: r0
      0x00a5: PHI (r0v10 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x00a3, B:57:0x00a8, B:60:0x00ac, B:63:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object A(e0 e0Var, int i11, fz.c cVar) {
        int i12;
        int i13;
        Object objInvoke;
        z1.q qVarF;
        n0.p pVarW0;
        mc mcVar;
        if (!e0Var.f58482a.P) {
            v2.a.b("visitAncestors called on an unattached node");
        }
        z1.q qVar = e0Var.f58482a.f58486e;
        y2.i0 i0VarX = y2.f.x(e0Var);
        loop0: while (true) {
            i12 = 0;
            i13 = 1;
            objInvoke = null;
            if (i0VarX == null) {
                qVarF = null;
                break;
            }
            if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 1024) != 0) {
                while (qVar != null) {
                    if ((qVar.f58484c & 1024) != 0) {
                        qVarF = qVar;
                        n1.e eVar = null;
                        while (qVarF != null) {
                            if (qVarF instanceof e0) {
                                break loop0;
                            }
                            if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                                int i14 = 0;
                                for (z1.q qVar2 = ((y2.n) qVarF).R; qVar2 != null; qVar2 = qVar2.f58487f) {
                                    if ((qVar2.f58484c & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
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
                                if (i14 == 1) {
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
        e0 e0Var2 = (e0) qVarF;
        if ((e0Var2 != null && kotlin.jvm.internal.m.a(e0Var2.W0(), e0Var.W0())) || (pVarW0 = e0Var.W0()) == null) {
            return null;
        }
        int i15 = 5;
        if (i11 == 5) {
            i13 = i15;
        } else {
            i15 = 6;
            if (i11 == 6) {
                i13 = i15;
            } else {
                i15 = 3;
                if (i11 == 3) {
                    i13 = i15;
                } else {
                    i15 = 4;
                    if (i11 == 4) {
                        i13 = i15;
                    } else if (i11 == 1) {
                        i13 = 2;
                    } else if (i11 != 2) {
                        throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                    }
                }
            }
        }
        if (pVarW0.Q.getItemCount() <= 0 || !pVarW0.Q.c() || !pVarW0.P) {
            return cVar.invoke(n0.p.T);
        }
        int iA = pVarW0.U0(i13) ? pVarW0.Q.a() : pVarW0.Q.d();
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        f0.a aVar = pVarW0.R;
        aVar.getClass();
        n0.j jVar = new n0.j(iA, iA);
        aVar.f26179a.c(jVar);
        yVar.f38361a = jVar;
        int iB = pVarW0.Q.b() * 2;
        int itemCount = pVarW0.Q.getItemCount();
        if (iB > itemCount) {
            iB = itemCount;
        }
        while (objInvoke == null && pVarW0.T0((n0.j) yVar.f38361a, i13) && i12 < iB) {
            n0.j jVar2 = (n0.j) yVar.f38361a;
            int i16 = jVar2.f42959a;
            int i17 = jVar2.f42960b;
            if (pVarW0.U0(i13)) {
                i17++;
            } else {
                i16--;
            }
            f0.a aVar2 = pVarW0.R;
            aVar2.getClass();
            n0.j jVar3 = new n0.j(i16, i17);
            aVar2.f26179a.c(jVar3);
            pVarW0.R.f26179a.k((n0.j) yVar.f38361a);
            yVar.f38361a = jVar3;
            i12++;
            y2.f.x(pVarW0).l();
            objInvoke = cVar.invoke(new n0.o(pVarW0, yVar, i13));
        }
        pVarW0.R.f26179a.k((n0.j) yVar.f38361a);
        y2.f.x(pVarW0).l();
        return objInvoke;
    }

    public static final boolean B(int i11, a0.j jVar, e0 e0Var, f2.c cVar) {
        e0 e0VarG;
        n1.e eVar = new n1.e(new e0[16]);
        if (!e0Var.f58482a.P) {
            v2.a.b("visitChildren called on an unattached node");
        }
        n1.e eVar2 = new n1.e(new z1.q[16]);
        z1.q qVar = e0Var.f58482a;
        z1.q qVar2 = qVar.f58487f;
        if (qVar2 == null) {
            y2.f.b(eVar2, qVar);
        } else {
            eVar2.c(qVar2);
        }
        while (true) {
            int i12 = eVar2.f43114c;
            if (i12 == 0) {
                break;
            }
            z1.q qVarF = (z1.q) eVar2.l(i12 - 1);
            if ((qVarF.f58485d & 1024) == 0) {
                y2.f.b(eVar2, qVarF);
            } else {
                while (qVarF != null) {
                    if ((qVarF.f58484c & 1024) != 0) {
                        n1.e eVar3 = null;
                        while (qVarF != null) {
                            if (qVarF instanceof e0) {
                                e0 e0Var2 = (e0) qVarF;
                                if (e0Var2.P) {
                                    eVar.c(e0Var2);
                                }
                            } else if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                                int i13 = 0;
                                for (z1.q qVar3 = ((y2.n) qVarF).R; qVar3 != null; qVar3 = qVar3.f58487f) {
                                    if ((qVar3.f58484c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            qVarF = qVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new n1.e(new z1.q[16]);
                                            }
                                            if (qVarF != null) {
                                                eVar3.c(qVarF);
                                                qVarF = null;
                                            }
                                            eVar3.c(qVar3);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            qVarF = y2.f.f(eVar3);
                        }
                        break;
                    }
                    qVarF = qVarF.f58487f;
                }
            }
        }
        while (eVar.f43114c != 0 && (e0VarG = g(eVar, cVar, i11)) != null) {
            if (e0VarG.V0().f24748a) {
                return ((Boolean) jVar.invoke(e0VarG)).booleanValue();
            }
            if (m(i11, jVar, e0VarG, cVar)) {
                return true;
            }
            eVar.k(e0VarG);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:158:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[ADDED_TO_REGION, LOOP:6: B:92:0x013a->B:120:0x0187, LOOP_START, PHI: r13
      0x013a: PHI (r13v15 z1.q) = (r13v9 z1.q), (r13v16 z1.q) binds: [B:91:0x0138, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    public static final boolean C(e0 e0Var, e0 e0Var2, int i11, a0.j jVar) {
        z1.q qVar;
        z1.q qVar2;
        y2.i0 i0VarX;
        mc mcVar;
        z1.q qVarF;
        n1.e eVar;
        if (e0Var.X0() != b0.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArr = new e0[16];
        if (!e0Var.f58482a.P) {
            v2.a.b("visitChildren called on an unattached node");
        }
        n1.e eVar2 = new n1.e(new z1.q[16]);
        z1.q qVar3 = e0Var.f58482a;
        z1.q qVar4 = qVar3.f58487f;
        if (qVar4 == null) {
            y2.f.b(eVar2, qVar3);
        } else {
            eVar2.c(qVar4);
        }
        int i12 = 0;
        while (true) {
            int i13 = eVar2.f43114c;
            qVar = null;
            if (i13 == 0) {
                break;
            }
            z1.q qVarF2 = (z1.q) eVar2.l(i13 - 1);
            if ((qVarF2.f58485d & 1024) == 0) {
                y2.f.b(eVar2, qVarF2);
            } else {
                while (qVarF2 != null) {
                    if ((qVarF2.f58484c & 1024) != 0) {
                        n1.e eVar3 = null;
                        while (qVarF2 != null) {
                            if (qVarF2 instanceof e0) {
                                e0 e0Var3 = (e0) qVarF2;
                                int i14 = i12 + 1;
                                if (objArr.length < i14) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i14, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i12] = e0Var3;
                                i12 = i14;
                            } else if ((qVarF2.f58484c & 1024) != 0 && (qVarF2 instanceof y2.n)) {
                                int i15 = 0;
                                for (z1.q qVar5 = ((y2.n) qVarF2).R; qVar5 != null; qVar5 = qVar5.f58487f) {
                                    if ((qVar5.f58484c & 1024) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            qVarF2 = qVar5;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new n1.e(new z1.q[16]);
                                            }
                                            if (qVarF2 != null) {
                                                eVar3.c(qVarF2);
                                                qVarF2 = null;
                                            }
                                            eVar3.c(qVar5);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            qVarF2 = y2.f.f(eVar3);
                        }
                        break;
                    }
                    qVarF2 = qVarF2.f58487f;
                }
            }
        }
        ry.l.g0(objArr, h0.f24717a, 0, i12);
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            lz.g gVarU = hz.b.U(0, i12);
            int i16 = gVarU.f40532a;
            int i17 = gVarU.f40533b;
            if (i16 <= i17) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        e0 e0Var4 = (e0) objArr[i17];
                        if (s(e0Var4) && a(e0Var4, jVar)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.m.a(objArr[i17], e0Var2)) {
                        z11 = true;
                    }
                    if (i17 == i16) {
                        break;
                    }
                    i17--;
                }
            }
            if (i11 != 1) {
                if (!e0Var.f58482a.P) {
                    v2.a.b("visitAncestors called on an unattached node");
                }
                qVar2 = e0Var.f58482a.f58486e;
                i0VarX = y2.f.x(e0Var);
                loop5: while (i0VarX != null) {
                    if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 1024) != 0) {
                        while (qVar2 != null) {
                            if ((qVar2.f58484c & 1024) != 0) {
                                qVarF = qVar2;
                                eVar = null;
                                while (qVarF != null) {
                                    if (qVarF instanceof e0) {
                                        qVar = qVarF;
                                        break loop5;
                                    }
                                    if ((qVarF.f58484c & 1024) == 0) {
                                    }
                                    qVarF = y2.f.f(eVar);
                                }
                            }
                            qVar2 = qVar2.f58486e;
                        }
                    }
                    i0VarX = i0VarX.w();
                    if (i0VarX != null) {
                    }
                }
                if (qVar != null) {
                    return ((Boolean) jVar.invoke(e0Var)).booleanValue();
                }
            }
            return false;
        }
        lz.g gVarU2 = hz.b.U(0, i12);
        int i18 = gVarU2.f40532a;
        int i19 = gVarU2.f40533b;
        if (i18 <= i19) {
            boolean z12 = false;
            while (true) {
                if (z12) {
                    e0 e0Var5 = (e0) objArr[i18];
                    if (s(e0Var5) && k(e0Var5, jVar)) {
                        return true;
                    }
                }
                if (kotlin.jvm.internal.m.a(objArr[i18], e0Var2)) {
                    z12 = true;
                }
                if (i18 == i19) {
                    break;
                }
                i18++;
            }
        }
        if (i11 != 1 && e0Var.V0().f24748a) {
            if (!e0Var.f58482a.P) {
                v2.a.b("visitAncestors called on an unattached node");
            }
            qVar2 = e0Var.f58482a.f58486e;
            i0VarX = y2.f.x(e0Var);
            loop5: while (i0VarX != null) {
                if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 1024) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.f58484c & 1024) != 0) {
                            qVarF = qVar2;
                            eVar = null;
                            while (qVarF != null) {
                                if (qVarF instanceof e0) {
                                    qVar = qVarF;
                                    break loop5;
                                }
                                if ((qVarF.f58484c & 1024) == 0 && (qVarF instanceof y2.n)) {
                                    int i21 = 0;
                                    for (z1.q qVar6 = ((y2.n) qVarF).R; qVar6 != null; qVar6 = qVar6.f58487f) {
                                        if ((qVar6.f58484c & 1024) != 0) {
                                            i21++;
                                            if (i21 == 1) {
                                                qVarF = qVar6;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new n1.e(new z1.q[16]);
                                                }
                                                if (qVarF != null) {
                                                    eVar.c(qVarF);
                                                    qVarF = null;
                                                }
                                                eVar.c(qVar6);
                                            }
                                        }
                                    }
                                    if (i21 == 1) {
                                    }
                                }
                                qVarF = y2.f.f(eVar);
                            }
                        }
                        qVar2 = qVar2.f58486e;
                    }
                }
                i0VarX = i0VarX.w();
                qVar2 = (i0VarX != null || (mcVar = i0VarX.f56892i0) == null) ? null : (d2) mcVar.f50088f;
            }
            if (qVar != null) {
                return ((Boolean) jVar.invoke(e0Var)).booleanValue();
            }
        }
        return false;
    }

    public static final Boolean D(int i11, a0.j jVar, e0 e0Var, f2.c cVar) {
        b0 b0VarX0 = e0Var.X0();
        int[] iArr = l0.f24731a;
        int i12 = iArr[b0VarX0.ordinal()];
        if (i12 != 1) {
            if (i12 == 2 || i12 == 3) {
                return Boolean.valueOf(h(e0Var, i11, jVar));
            }
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (e0Var.V0().f24748a) {
                return (Boolean) jVar.invoke(e0Var);
            }
            return cVar == null ? Boolean.valueOf(h(e0Var, i11, jVar)) : Boolean.valueOf(B(i11, jVar, e0Var, cVar));
        }
        e0 e0VarO = o(e0Var);
        if (e0VarO == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i13 = iArr[e0VarO.X0().ordinal()];
        if (i13 != 1) {
            if (i13 == 2 || i13 == 3) {
                if (cVar == null) {
                    cVar = i(e0VarO);
                }
                return Boolean.valueOf(m(i11, jVar, e0Var, cVar));
            }
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        Boolean boolD = D(i11, jVar, e0VarO, cVar);
        if (!kotlin.jvm.internal.m.a(boolD, Boolean.FALSE)) {
            return boolD;
        }
        if (cVar == null) {
            if (e0VarO.X0() != b0.ActiveParent) {
                throw new IllegalStateException("Searching for active node in inactive hierarchy");
            }
            e0 e0VarF = f(e0VarO);
            if (e0VarF == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            cVar = i(e0VarF);
        }
        return Boolean.valueOf(m(i11, jVar, e0Var, cVar));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008d A[RETURN] */
    public static final boolean a(e0 e0Var, a0.j jVar) {
        b0 b0VarX0 = e0Var.X0();
        int[] iArr = i0.f24723a;
        int i11 = iArr[b0VarX0.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return y(e0Var, jVar);
            }
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!y(e0Var, jVar)) {
                if (!(e0Var.V0().f24748a ? ((Boolean) jVar.invoke(e0Var)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        e0 e0VarO = o(e0Var);
        if (e0VarO == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i12 = iArr[e0VarO.X0().ordinal()];
        if (i12 != 1) {
            if (i12 == 2 || i12 == 3) {
                return n(e0Var, e0VarO, 2, jVar);
            }
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (a(e0VarO, jVar) || n(e0Var, e0VarO, 2, jVar) || (e0VarO.V0().f24748a && ((Boolean) jVar.invoke(e0VarO)).booleanValue())) {
            return true;
        }
        return false;
    }

    public static final boolean b(f2.c cVar, f2.c cVar2, f2.c cVar3, int i11) {
        float f5;
        float f11;
        boolean zC = c(i11, cVar3, cVar);
        float f12 = cVar3.f26573b;
        float f13 = cVar3.f26575d;
        float f14 = cVar3.f26572a;
        float f15 = cVar3.f26574c;
        float f16 = cVar.f26575d;
        float f17 = cVar.f26573b;
        float f18 = cVar.f26574c;
        float f19 = cVar.f26572a;
        if (zC || !c(i11, cVar2, cVar)) {
            return false;
        }
        if (i11 == 3) {
            if (f19 < f15) {
                return true;
            }
        } else if (i11 == 4) {
            if (f18 > f14) {
                return true;
            }
        } else if (i11 == 5) {
            if (f17 < f13) {
                return true;
            }
        } else {
            if (i11 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f16 > f12) {
                return true;
            }
        }
        if (i11 == 3 || i11 == 4) {
            return true;
        }
        if (i11 == 3) {
            f5 = f19 - cVar2.f26574c;
        } else if (i11 == 4) {
            f5 = cVar2.f26572a - f18;
        } else if (i11 == 5) {
            f5 = f17 - cVar2.f26575d;
        } else {
            if (i11 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f5 = cVar2.f26573b - f16;
        }
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f5 = 0.0f;
        }
        if (i11 == 3) {
            f11 = f19 - f14;
        } else if (i11 == 4) {
            f11 = f15 - f18;
        } else if (i11 == 5) {
            f11 = f17 - f12;
        } else {
            if (i11 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f11 = f13 - f16;
        }
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        return f5 < f11;
    }

    public static final boolean c(int i11, f2.c cVar, f2.c cVar2) {
        if (i11 == 3 || i11 == 4) {
            return cVar.f26575d > cVar2.f26573b && cVar.f26573b < cVar2.f26575d;
        }
        if (i11 == 5 || i11 == 6) {
            return cVar.f26574c > cVar2.f26572a && cVar.f26572a < cVar2.f26574c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final boolean d(e0 e0Var, boolean z11) {
        int i11 = f0.f24712a[e0Var.X0().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return z11;
            }
            if (i11 == 3) {
                e0 e0VarO = o(e0Var);
                if (!(e0VarO != null ? d(e0VarO, z11) : true)) {
                    return false;
                }
                e0Var.U0(b0.ActiveParent, b0.Inactive);
                return true;
            }
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public static final void e(e0 e0Var, n1.e eVar) {
        if (!e0Var.f58482a.P) {
            v2.a.b("visitChildren called on an unattached node");
        }
        n1.e eVar2 = new n1.e(new z1.q[16]);
        z1.q qVar = e0Var.f58482a;
        z1.q qVar2 = qVar.f58487f;
        if (qVar2 == null) {
            y2.f.b(eVar2, qVar);
        } else {
            eVar2.c(qVar2);
        }
        while (true) {
            int i11 = eVar2.f43114c;
            if (i11 == 0) {
                return;
            }
            z1.q qVarF = (z1.q) eVar2.l(i11 - 1);
            if ((qVarF.f58485d & 1024) == 0) {
                y2.f.b(eVar2, qVarF);
            } else {
                while (qVarF != null) {
                    if ((qVarF.f58484c & 1024) != 0) {
                        n1.e eVar3 = null;
                        while (qVarF != null) {
                            if (qVarF instanceof e0) {
                                e0 e0Var2 = (e0) qVarF;
                                if (e0Var2.P && !y2.f.x(e0Var2).f56904t0) {
                                    if (e0Var2.V0().f24748a) {
                                        eVar.c(e0Var2);
                                    } else {
                                        e(e0Var2, eVar);
                                    }
                                }
                            } else if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                                int i12 = 0;
                                for (z1.q qVar3 = ((y2.n) qVarF).R; qVar3 != null; qVar3 = qVar3.f58487f) {
                                    if ((qVar3.f58484c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            qVarF = qVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new n1.e(new z1.q[16]);
                                            }
                                            if (qVarF != null) {
                                                eVar3.c(qVarF);
                                                qVarF = null;
                                            }
                                            eVar3.c(qVar3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            qVarF = y2.f.f(eVar3);
                        }
                        break;
                    }
                    qVarF = qVarF.f58487f;
                }
            }
        }
    }

    public static final e0 f(e0 e0Var) {
        e0 e0VarG = ((p) y2.f.y(e0Var).getFocusOwner()).g();
        if (e0VarG == null || !e0VarG.P) {
            return null;
        }
        return e0VarG;
    }

    public static final e0 g(n1.e eVar, f2.c cVar, int i11) {
        f2.c cVarH;
        if (i11 == 3) {
            cVarH = cVar.h((cVar.f26574c - cVar.f26572a) + 1, CropImageView.DEFAULT_ASPECT_RATIO);
        } else if (i11 == 4) {
            cVarH = cVar.h(-((cVar.f26574c - cVar.f26572a) + 1), CropImageView.DEFAULT_ASPECT_RATIO);
        } else if (i11 == 5) {
            cVarH = cVar.h(CropImageView.DEFAULT_ASPECT_RATIO, (cVar.f26575d - cVar.f26573b) + 1);
        } else {
            if (i11 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            cVarH = cVar.h(CropImageView.DEFAULT_ASPECT_RATIO, -((cVar.f26575d - cVar.f26573b) + 1));
        }
        Object[] objArr = eVar.f43112a;
        int i12 = eVar.f43114c;
        e0 e0Var = null;
        for (int i13 = 0; i13 < i12; i13++) {
            e0 e0Var2 = (e0) objArr[i13];
            if (s(e0Var2)) {
                f2.c cVarI = i(e0Var2);
                if (p(cVarI, cVarH, cVar, i11)) {
                    e0Var = e0Var2;
                    cVarH = cVarI;
                }
            }
        }
        return e0Var;
    }

    public static final boolean h(e0 e0Var, int i11, fz.c cVar) {
        f2.c cVar2;
        n1.e eVar = new n1.e(new e0[16]);
        e(e0Var, eVar);
        int i12 = eVar.f43114c;
        if (i12 <= 1) {
            e0 e0Var2 = (e0) (i12 == 0 ? null : eVar.f43112a[0]);
            if (e0Var2 != null) {
                return ((Boolean) cVar.invoke(e0Var2)).booleanValue();
            }
        } else {
            if (i11 == 7) {
                i11 = 4;
            }
            if (i11 == 4 || i11 == 6) {
                f2.c cVarI = i(e0Var);
                float f5 = cVarI.f26572a;
                float f11 = cVarI.f26573b;
                cVar2 = new f2.c(f5, f11, f5, f11);
            } else {
                if (i11 != 3 && i11 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                f2.c cVarI2 = i(e0Var);
                float f12 = cVarI2.f26574c;
                float f13 = cVarI2.f26575d;
                cVar2 = new f2.c(f12, f13, f12, f13);
            }
            e0 e0VarG = g(eVar, cVar2, i11);
            if (e0VarG != null) {
                return ((Boolean) cVar.invoke(e0VarG)).booleanValue();
            }
        }
        return false;
    }

    public static final f2.c i(e0 e0Var) {
        k1 k1Var;
        if (e0Var.P && (k1Var = e0Var.H) != null) {
            w2.x xVarH = w2.a0.h(k1Var);
            if (!xVarH.k()) {
                xVarH = null;
            }
            if (xVarH != null) {
                f2.c cVar = e0Var.V0().f24759l;
                return cVar != q.f24744a ? cVar.i(xVarH.S(y2.f.w(e0Var), 0L)) : xVarH.E(y2.f.w(e0Var), false);
            }
        }
        return f2.c.f26571e;
    }

    public static final z1.r j(z1.r rVar, v vVar) {
        return rVar.i(new w(vVar));
    }

    public static final boolean k(e0 e0Var, a0.j jVar) {
        int i11 = i0.f24723a[e0Var.X0().ordinal()];
        if (i11 == 1) {
            e0 e0VarO = o(e0Var);
            if (e0VarO != null) {
                return k(e0VarO, jVar) || n(e0Var, e0VarO, 1, jVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i11 == 2 || i11 == 3) {
            return z(e0Var, jVar);
        }
        if (i11 == 4) {
            return e0Var.V0().f24748a ? ((Boolean) jVar.invoke(e0Var)).booleanValue() : z(e0Var, jVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean l(e0 e0Var) {
        int i11 = f0.f24712a[e0Var.X0().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3 || i11 == 4) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
            ((p) y2.f.y(e0Var).getFocusOwner()).getClass();
            e0Var.U0(b0.Captured, b0.Active);
        }
        return true;
    }

    public static final boolean m(int i11, a0.j jVar, e0 e0Var, f2.c cVar) {
        if (B(i11, jVar, e0Var, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) A(e0Var, i11, new j0(((p) y2.f.y(e0Var).getFocusOwner()).g(), e0Var, cVar, i11, jVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean n(e0 e0Var, e0 e0Var2, int i11, a0.j jVar) {
        if (C(e0Var, e0Var2, i11, jVar)) {
            return true;
        }
        Boolean bool = (Boolean) A(e0Var, i11, new j0(((p) y2.f.y(e0Var).getFocusOwner()).g(), e0Var, e0Var2, i11, jVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final e0 o(e0 e0Var) {
        boolean z11 = e0Var.f58482a.P;
        if (z11) {
            if (!z11) {
                v2.a.b("visitChildren called on an unattached node");
            }
            n1.e eVar = new n1.e(new z1.q[16]);
            z1.q qVar = e0Var.f58482a;
            z1.q qVar2 = qVar.f58487f;
            if (qVar2 == null) {
                y2.f.b(eVar, qVar);
            } else {
                eVar.c(qVar2);
            }
            while (true) {
                int i11 = eVar.f43114c;
                if (i11 == 0) {
                    break;
                }
                z1.q qVarF = (z1.q) eVar.l(i11 - 1);
                if ((qVarF.f58485d & 1024) == 0) {
                    y2.f.b(eVar, qVarF);
                } else {
                    while (qVarF != null) {
                        if ((qVarF.f58484c & 1024) != 0) {
                            n1.e eVar2 = null;
                            while (qVarF != null) {
                                if (qVarF instanceof e0) {
                                    e0 e0Var2 = (e0) qVarF;
                                    if (e0Var2.f58482a.P) {
                                        int i12 = g0.f24714b[e0Var2.X0().ordinal()];
                                        if (i12 == 1 || i12 == 2 || i12 == 3) {
                                            return e0Var2;
                                        }
                                        if (i12 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                } else if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                                    int i13 = 0;
                                    for (z1.q qVar3 = ((y2.n) qVarF).R; qVar3 != null; qVar3 = qVar3.f58487f) {
                                        if ((qVar3.f58484c & 1024) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                qVarF = qVar3;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new n1.e(new z1.q[16]);
                                                }
                                                if (qVarF != null) {
                                                    eVar2.c(qVarF);
                                                    qVarF = null;
                                                }
                                                eVar2.c(qVar3);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                qVarF = y2.f.f(eVar2);
                            }
                            break;
                        }
                        qVarF = qVarF.f58487f;
                    }
                }
            }
        }
        return null;
    }

    public static final boolean p(f2.c cVar, f2.c cVar2, f2.c cVar3, int i11) {
        if (!q(i11, cVar, cVar3)) {
            return false;
        }
        if (q(i11, cVar2, cVar3) && !b(cVar3, cVar, cVar2, i11)) {
            return !b(cVar3, cVar2, cVar, i11) && r(i11, cVar3, cVar) < r(i11, cVar3, cVar2);
        }
        return true;
    }

    public static final boolean q(int i11, f2.c cVar, f2.c cVar2) {
        float f5 = cVar.f26573b;
        float f11 = cVar.f26575d;
        float f12 = cVar.f26572a;
        float f13 = cVar.f26574c;
        if (i11 == 3) {
            float f14 = cVar2.f26574c;
            float f15 = cVar2.f26572a;
            return (f14 > f13 || f15 >= f13) && f15 > f12;
        }
        if (i11 == 4) {
            float f16 = cVar2.f26572a;
            float f17 = cVar2.f26574c;
            return (f16 < f12 || f17 <= f12) && f17 < f13;
        }
        if (i11 == 5) {
            float f18 = cVar2.f26575d;
            float f19 = cVar2.f26573b;
            return (f18 > f11 || f19 >= f11) && f19 > f5;
        }
        if (i11 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f21 = cVar2.f26573b;
        float f22 = cVar2.f26575d;
        return (f21 < f5 || f22 <= f5) && f22 < f11;
    }

    public static final long r(int i11, f2.c cVar, f2.c cVar2) {
        float f5;
        float f11;
        float f12 = cVar2.f26573b;
        float f13 = cVar2.f26575d;
        float f14 = cVar2.f26572a;
        float f15 = cVar2.f26574c;
        if (i11 == 3) {
            f5 = cVar.f26572a - f15;
        } else if (i11 == 4) {
            f5 = f14 - cVar.f26574c;
        } else if (i11 == 5) {
            f5 = cVar.f26573b - f13;
        } else {
            if (i11 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f5 = f12 - cVar.f26575d;
        }
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f5 = 0.0f;
        }
        long j11 = (long) f5;
        if (i11 == 3 || i11 == 4) {
            float f16 = cVar.f26573b;
            float f17 = 2;
            f11 = (((cVar.f26575d - f16) / f17) + f16) - (((f13 - f12) / f17) + f12);
        } else {
            if (i11 != 5 && i11 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f18 = cVar.f26572a;
            float f19 = 2;
            f11 = (((cVar.f26574c - f18) / f19) + f18) - (((f15 - f14) / f19) + f14);
        }
        long j12 = (long) f11;
        return (j12 * j12) + (((long) 13) * j11 * j11);
    }

    public static final boolean s(e0 e0Var) {
        y2.i0 i0Var;
        k1 k1Var;
        y2.i0 i0Var2;
        k1 k1Var2 = e0Var.H;
        return (k1Var2 == null || (i0Var = k1Var2.Q) == null || !i0Var.J() || (k1Var = e0Var.H) == null || (i0Var2 = k1Var.Q) == null || !i0Var2.I()) ? false : true;
    }

    public static final z1.r t(z1.r rVar, fz.c cVar) {
        return rVar.i(new c(cVar));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [fz.c, kotlin.jvm.internal.n] */
    public static final b u(e0 e0Var, int i11) {
        int i12 = f0.f24712a[e0Var.X0().ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return b.Cancelled;
            }
            if (i12 == 3) {
                e0 e0VarO = o(e0Var);
                if (e0VarO == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                b bVarU = u(e0VarO, i11);
                b bVar = b.None;
                if (bVarU == bVar) {
                    bVarU = null;
                }
                if (bVarU != null) {
                    return bVarU;
                }
                if (e0Var.S) {
                    return bVar;
                }
                e0Var.S = true;
                try {
                    t tVarV0 = e0Var.V0();
                    a aVar = new a(i11);
                    p pVar = (p) y2.f.y(e0Var).getFocusOwner();
                    e0 e0VarG = pVar.g();
                    tVarV0.f24758k.invoke(aVar);
                    e0 e0VarG2 = pVar.g();
                    if (aVar.f24705b) {
                        v vVar = v.f24760b;
                        return b.Cancelled;
                    }
                    if (e0VarG == e0VarG2 || e0VarG2 == null) {
                        return bVar;
                    }
                    return v.f24762d == v.f24761c ? b.Cancelled : b.Redirected;
                } finally {
                    e0Var.S = false;
                }
            }
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return b.None;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fz.c, kotlin.jvm.internal.n] */
    public static final b v(e0 e0Var, int i11) {
        if (!e0Var.T) {
            e0Var.T = true;
            try {
                t tVarV0 = e0Var.V0();
                a aVar = new a(i11);
                p pVar = (p) y2.f.y(e0Var).getFocusOwner();
                e0 e0VarG = pVar.g();
                tVarV0.f24757j.invoke(aVar);
                e0 e0VarG2 = pVar.g();
                if (aVar.f24705b) {
                    v vVar = v.f24760b;
                    return b.Cancelled;
                }
                if (e0VarG != e0VarG2 && e0VarG2 != null) {
                    return v.f24762d == v.f24761c ? b.Cancelled : b.Redirected;
                }
            } finally {
                e0Var.T = false;
            }
        }
        return b.None;
    }

    public static final b w(e0 e0Var, int i11) {
        z1.q qVarF;
        mc mcVar;
        int i12 = f0.f24712a[e0Var.X0().ordinal()];
        if (i12 == 1 || i12 == 2) {
            return b.None;
        }
        if (i12 == 3) {
            e0 e0VarO = o(e0Var);
            if (e0VarO != null) {
                return u(e0VarO, i11);
            }
            throw new IllegalArgumentException("ActiveParent with no focused child");
        }
        if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (!e0Var.f58482a.P) {
            v2.a.b("visitAncestors called on an unattached node");
        }
        z1.q qVar = e0Var.f58482a.f58486e;
        y2.i0 i0VarX = y2.f.x(e0Var);
        loop0: while (true) {
            if (i0VarX == null) {
                qVarF = null;
                break;
            }
            if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 1024) != 0) {
                while (qVar != null) {
                    if ((qVar.f58484c & 1024) != 0) {
                        qVarF = qVar;
                        n1.e eVar = null;
                        while (qVarF != null) {
                            if (qVarF instanceof e0) {
                                break loop0;
                            }
                            if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                                int i13 = 0;
                                for (z1.q qVar2 = ((y2.n) qVarF).R; qVar2 != null; qVar2 = qVar2.f58487f) {
                                    if ((qVar2.f58484c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
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
                                if (i13 == 1) {
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
        e0 e0Var2 = (e0) qVarF;
        if (e0Var2 == null) {
            return b.None;
        }
        int i14 = f0.f24712a[e0Var2.X0().ordinal()];
        if (i14 == 1) {
            return v(e0Var2, i11);
        }
        if (i14 == 2) {
            return b.Cancelled;
        }
        if (i14 == 3) {
            return w(e0Var2, i11);
        }
        if (i14 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        b bVarW = w(e0Var2, i11);
        b bVar = bVarW != b.None ? bVarW : null;
        return bVar == null ? v(e0Var2, i11) : bVar;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0211  */
    /* JADX WARN: Code duplicated, block: B:151:0x0218 A[ADDED_TO_REGION, LOOP:9: B:151:0x0218->B:158:0x022c, LOOP_START, PHI: r12
      0x0218: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:150:0x0216, B:158:0x022c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:152:0x021a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0225 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x0227  */
    /* JADX WARN: Code duplicated, block: B:157:0x022a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0234  */
    /* JADX WARN: Code duplicated, block: B:162:0x023c  */
    /* JADX WARN: Code duplicated, block: B:166:0x024a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:203:0x01a9 A[SYNTHETIC] */
    public static final boolean x(e0 e0Var) {
        n1.e eVar;
        int i11;
        e0 e0Var2;
        b0 b0Var;
        mc mcVar;
        char c11;
        mc mcVar2;
        p pVar = (p) y2.f.y(e0Var).getFocusOwner();
        e0 e0VarG = pVar.g();
        b0 b0VarX0 = e0Var.X0();
        if (e0VarG == e0Var) {
            e0Var.U0(b0VarX0, b0VarX0);
            return true;
        }
        int i12 = 0;
        if ((e0VarG == null || e0VarG.Q) && !e0Var.Q && !((p) y2.f.y(e0Var).getFocusOwner()).f24736a.D()) {
            return false;
        }
        char c12 = 16;
        if (e0VarG != null) {
            eVar = new n1.e(new e0[16]);
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
                            n1.e eVar2 = null;
                            while (qVarF != null) {
                                if (qVarF instanceof e0) {
                                    eVar.c((e0) qVarF);
                                } else if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                                    int i13 = 0;
                                    for (z1.q qVar2 = ((y2.n) qVarF).R; qVar2 != null; qVar2 = qVar2.f58487f) {
                                        if ((qVar2.f58484c & 1024) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                qVarF = qVar2;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new n1.e(new z1.q[16]);
                                                }
                                                if (qVarF != null) {
                                                    eVar2.c(qVarF);
                                                    qVarF = null;
                                                }
                                                eVar2.c(qVar2);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                qVarF = y2.f.f(eVar2);
                            }
                        }
                        qVar = qVar.f58486e;
                    }
                }
                i0VarX = i0VarX.w();
                qVar = (i0VarX == null || (mcVar2 = i0VarX.f56892i0) == null) ? null : (d2) mcVar2.f50088f;
            }
        } else {
            eVar = null;
        }
        Object[] objArr = new e0[16];
        if (!e0Var.f58482a.P) {
            v2.a.b("visitAncestors called on an unattached node");
        }
        z1.q qVar3 = e0Var.f58482a.f58486e;
        y2.i0 i0VarX2 = y2.f.x(e0Var);
        int i14 = 1;
        int i15 = 0;
        while (i0VarX2 != null) {
            if ((((z1.q) i0VarX2.f56892i0.f50089g).f58485d & 1024) != 0) {
                while (qVar3 != null) {
                    if ((qVar3.f58484c & 1024) != 0) {
                        z1.q qVarF2 = qVar3;
                        n1.e eVar3 = null;
                        while (qVarF2 != null) {
                            if (qVarF2 instanceof e0) {
                                e0 e0Var3 = (e0) qVarF2;
                                Boolean boolValueOf = eVar != null ? Boolean.valueOf(eVar.k(e0Var3)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    int i16 = i15 + 1;
                                    if (objArr.length < i16) {
                                        int length = objArr.length;
                                        Object[] objArr2 = new Object[Math.max(i16, length * 2)];
                                        System.arraycopy(objArr, i12, objArr2, i12, length);
                                        objArr = objArr2;
                                    }
                                    objArr[i15] = e0Var3;
                                    i15 = i16;
                                }
                                if (e0Var3 == e0VarG) {
                                    i14 = i12;
                                }
                            } else {
                                if ((qVarF2.f58484c & 1024) != 0 && (qVarF2 instanceof y2.n)) {
                                    int i17 = i12;
                                    for (z1.q qVar4 = ((y2.n) qVarF2).R; qVar4 != null; qVar4 = qVar4.f58487f) {
                                        if ((qVar4.f58484c & 1024) != 0) {
                                            i17++;
                                            if (i17 == 1) {
                                                qVarF2 = qVar4;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new n1.e(new z1.q[16]);
                                                }
                                                if (qVarF2 != null) {
                                                    eVar3.c(qVarF2);
                                                    qVarF2 = null;
                                                }
                                                eVar3.c(qVar4);
                                            }
                                        }
                                    }
                                    c11 = 16;
                                    if (i17 == 1) {
                                        c12 = 16;
                                    }
                                    i12 = 0;
                                }
                                qVarF2 = y2.f.f(eVar3);
                                c12 = c11;
                                i12 = 0;
                            }
                            c11 = 16;
                            qVarF2 = y2.f.f(eVar3);
                            c12 = c11;
                            i12 = 0;
                        }
                    }
                    qVar3 = qVar3.f58486e;
                    c12 = c12;
                    i12 = 0;
                }
            }
            char c13 = c12;
            i0VarX2 = i0VarX2.w();
            qVar3 = (i0VarX2 == null || (mcVar = i0VarX2.f56892i0) == null) ? null : (d2) mcVar.f50088f;
            c12 = c13;
            i12 = 0;
        }
        if (i14 == 0 || e0VarG == null || d(e0VarG, false)) {
            y2.f.t(e0Var, new a0.c0(e0Var, 2));
            int i18 = f0.f24712a[e0Var.X0().ordinal()];
            if (i18 != 1 && i18 != 2) {
                if (i18 != 3 && i18 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ((p) y2.f.y(e0Var).getFocusOwner()).j(e0Var);
            }
            if (i14 != 0 && e0VarG != null) {
                e0VarG.U0(b0.Active, b0.Inactive);
            }
            if (eVar != null) {
                int i19 = eVar.f43114c - 1;
                Object[] objArr3 = eVar.f43112a;
                if (i19 < objArr3.length) {
                    while (i19 >= 0) {
                        e0 e0Var4 = (e0) objArr3[i19];
                        if (pVar.g() == e0Var) {
                            e0Var4.U0(b0.ActiveParent, b0.Inactive);
                            i19--;
                        }
                    }
                    i11 = i15 - 1;
                    if (i11 < objArr.length) {
                        while (i11 >= 0) {
                            e0Var2 = (e0) objArr[i11];
                            if (pVar.g() == e0Var) {
                                if (e0Var2 == e0VarG) {
                                    b0Var = b0.Active;
                                } else {
                                    b0Var = b0.Inactive;
                                }
                                e0Var2.U0(b0Var, b0.ActiveParent);
                                i11--;
                            }
                        }
                        if (pVar.g() == e0Var) {
                            e0Var.U0(b0VarX0, b0.Active);
                            if (pVar.g() != e0Var) {
                                return true;
                            }
                        }
                    } else if (pVar.g() == e0Var) {
                        e0Var.U0(b0VarX0, b0.Active);
                        if (pVar.g() != e0Var) {
                            return true;
                        }
                    }
                } else {
                    i11 = i15 - 1;
                    if (i11 < objArr.length) {
                        while (i11 >= 0) {
                            e0Var2 = (e0) objArr[i11];
                            if (pVar.g() == e0Var) {
                                if (e0Var2 == e0VarG) {
                                    b0Var = b0.Active;
                                } else {
                                    b0Var = b0.Inactive;
                                }
                                e0Var2.U0(b0Var, b0.ActiveParent);
                                i11--;
                            }
                        }
                        if (pVar.g() == e0Var) {
                            e0Var.U0(b0VarX0, b0.Active);
                            if (pVar.g() != e0Var) {
                                return true;
                            }
                        }
                    } else if (pVar.g() == e0Var) {
                        e0Var.U0(b0VarX0, b0.Active);
                        if (pVar.g() != e0Var) {
                            return true;
                        }
                    }
                }
            } else {
                i11 = i15 - 1;
                if (i11 < objArr.length) {
                    while (i11 >= 0) {
                        e0Var2 = (e0) objArr[i11];
                        if (pVar.g() == e0Var) {
                            if (e0Var2 == e0VarG) {
                                b0Var = b0.Active;
                            } else {
                                b0Var = b0.Inactive;
                            }
                            e0Var2.U0(b0Var, b0.ActiveParent);
                            i11--;
                        }
                    }
                    if (pVar.g() == e0Var) {
                        e0Var.U0(b0VarX0, b0.Active);
                        if (pVar.g() != e0Var) {
                            return true;
                        }
                    }
                } else if (pVar.g() == e0Var) {
                    e0Var.U0(b0VarX0, b0.Active);
                    if (pVar.g() != e0Var) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean y(e0 e0Var, a0.j jVar) {
        Object[] objArr = new e0[16];
        if (!e0Var.f58482a.P) {
            v2.a.b("visitChildren called on an unattached node");
        }
        n1.e eVar = new n1.e(new z1.q[16]);
        z1.q qVar = e0Var.f58482a;
        z1.q qVar2 = qVar.f58487f;
        if (qVar2 == null) {
            y2.f.b(eVar, qVar);
        } else {
            eVar.c(qVar2);
        }
        int i11 = 0;
        while (true) {
            int i12 = eVar.f43114c;
            if (i12 == 0) {
                break;
            }
            z1.q qVarF = (z1.q) eVar.l(i12 - 1);
            if ((qVarF.f58485d & 1024) == 0) {
                y2.f.b(eVar, qVarF);
            } else {
                while (qVarF != null) {
                    if ((qVarF.f58484c & 1024) != 0) {
                        n1.e eVar2 = null;
                        while (qVarF != null) {
                            if (qVarF instanceof e0) {
                                e0 e0Var2 = (e0) qVarF;
                                int i13 = i11 + 1;
                                if (objArr.length < i13) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i13, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i11] = e0Var2;
                                i11 = i13;
                            } else if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                                int i14 = 0;
                                for (z1.q qVar3 = ((y2.n) qVarF).R; qVar3 != null; qVar3 = qVar3.f58487f) {
                                    if ((qVar3.f58484c & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            qVarF = qVar3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new n1.e(new z1.q[16]);
                                            }
                                            if (qVarF != null) {
                                                eVar2.c(qVarF);
                                                qVarF = null;
                                            }
                                            eVar2.c(qVar3);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            qVarF = y2.f.f(eVar2);
                        }
                        break;
                    }
                    qVarF = qVarF.f58487f;
                }
            }
        }
        ry.l.g0(objArr, h0.f24717a, 0, i11);
        int i15 = i11 - 1;
        if (i15 < objArr.length) {
            while (i15 >= 0) {
                e0 e0Var3 = (e0) objArr[i15];
                if (s(e0Var3) && a(e0Var3, jVar)) {
                    return true;
                }
                i15--;
            }
        }
        return false;
    }

    public static final boolean z(e0 e0Var, a0.j jVar) {
        Object[] objArr = new e0[16];
        if (!e0Var.f58482a.P) {
            v2.a.b("visitChildren called on an unattached node");
        }
        n1.e eVar = new n1.e(new z1.q[16]);
        z1.q qVar = e0Var.f58482a;
        z1.q qVar2 = qVar.f58487f;
        if (qVar2 == null) {
            y2.f.b(eVar, qVar);
        } else {
            eVar.c(qVar2);
        }
        int i11 = 0;
        while (true) {
            int i12 = eVar.f43114c;
            if (i12 == 0) {
                break;
            }
            z1.q qVarF = (z1.q) eVar.l(i12 - 1);
            if ((qVarF.f58485d & 1024) == 0) {
                y2.f.b(eVar, qVarF);
            } else {
                while (qVarF != null) {
                    if ((qVarF.f58484c & 1024) != 0) {
                        n1.e eVar2 = null;
                        while (qVarF != null) {
                            if (qVarF instanceof e0) {
                                e0 e0Var2 = (e0) qVarF;
                                int i13 = i11 + 1;
                                if (objArr.length < i13) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i13, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i11] = e0Var2;
                                i11 = i13;
                            } else if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                                int i14 = 0;
                                for (z1.q qVar3 = ((y2.n) qVarF).R; qVar3 != null; qVar3 = qVar3.f58487f) {
                                    if ((qVar3.f58484c & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            qVarF = qVar3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new n1.e(new z1.q[16]);
                                            }
                                            if (qVarF != null) {
                                                eVar2.c(qVarF);
                                                qVarF = null;
                                            }
                                            eVar2.c(qVar3);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            qVarF = y2.f.f(eVar2);
                        }
                        break;
                    }
                    qVarF = qVarF.f58487f;
                }
            }
        }
        ry.l.g0(objArr, h0.f24717a, 0, i11);
        for (int i15 = 0; i15 < i11; i15++) {
            e0 e0Var3 = (e0) objArr[i15];
            if (s(e0Var3) && k(e0Var3, jVar)) {
                return true;
            }
        }
        return false;
    }
}
