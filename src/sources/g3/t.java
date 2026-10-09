package g3;

import a0.o0;
import java.util.ArrayList;
import java.util.List;
import y2.b2;
import y2.i0;
import y2.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1.q f28696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f28698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f28699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t f28701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28702g;

    public t(z1.q qVar, boolean z11, i0 i0Var, o oVar) {
        this.f28696a = qVar;
        this.f28697b = z11;
        this.f28698c = i0Var;
        this.f28699d = oVar;
        this.f28702g = i0Var.f56880b;
    }

    public static /* synthetic */ List j(int i11, t tVar) {
        return tVar.i((i11 & 1) != 0 ? !tVar.f28697b : false, (i11 & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final f2.c a(k1 k1Var) {
        ?? F;
        t tVarL = l();
        if (tVarL == null) {
            return f2.c.f26571e;
        }
        z1.q qVar = (z1.q) tVarL.f28698c.f56892i0.f50089g;
        if ((qVar.f58485d & 8) == 0) {
            F = 0;
            break;
        }
        loop0: while (true) {
            if (qVar != null) {
                if ((qVar.f58484c & 8) != 0) {
                    F = qVar;
                    ?? eVar = 0;
                    while (F != 0) {
                        if (F instanceof b2) {
                            if (((b2) F).e()) {
                                break loop0;
                            }
                        } else if ((F.f58484c & 8) != 0 && (F instanceof y2.n)) {
                            z1.q qVar2 = ((y2.n) F).R;
                            int i11 = 0;
                            while (qVar2 != null) {
                                if ((qVar2.f58484c & 8) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        F = F;
                                        eVar = eVar;
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
                                } else {
                                    F = F;
                                    eVar = eVar;
                                }
                                qVar2 = qVar2.f58487f;
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
                        F = y2.f.f(eVar);
                    }
                }
                if ((qVar.f58485d & 8) != 0) {
                    qVar = qVar.f58487f;
                }
            }
            F = 0;
            break;
        }
        b2 b2Var = (b2) F;
        k1 k1VarV = b2Var != null ? y2.f.v(b2Var, 8) : null;
        return k1VarV == null ? tVarL.a(k1Var) : k1VarV.E(k1Var, true);
    }

    public final t b(k kVar, fz.c cVar) {
        o oVar = new o();
        oVar.f28693c = false;
        oVar.f28694d = false;
        cVar.invoke(oVar);
        t tVar = new t(new s(cVar), false, new i0(true, this.f28702g + (kVar != null ? 1000000000 : 2000000000)), oVar);
        tVar.f28700e = true;
        tVar.f28701f = this;
        return tVar;
    }

    public final void c(i0 i0Var, ArrayList arrayList) {
        n1.e eVarZ = i0Var.z();
        Object[] objArr = eVarZ.f43112a;
        int i11 = eVarZ.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            i0 i0Var2 = (i0) objArr[i12];
            if (i0Var2.I() && !i0Var2.f56904t0) {
                if (i0Var2.f56892i0.g(8)) {
                    arrayList.add(w.a(i0Var2, this.f28697b));
                } else {
                    c(i0Var2, arrayList);
                }
            }
        }
    }

    public final k1 d() {
        if (!this.f28700e) {
            b2 b2VarF = f();
            return b2VarF != null ? y2.f.v(b2VarF, 8) : (y2.v) this.f28698c.f56892i0.f50086d;
        }
        t tVarL = l();
        if (tVarL != null) {
            return tVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            t tVar = (t) arrayList.get(size2);
            if (tVar.n()) {
                arrayList2.add(tVar);
            } else if (!tVar.f28699d.f28694d) {
                tVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final b2 f() {
        ?? F;
        boolean z11 = this.f28699d.f28693c;
        i0 i0Var = this.f28698c;
        ?? r9 = 0;
        r9 = 0;
        r9 = 0;
        r9 = 0;
        if (!z11) {
            z1.q qVar = (z1.q) i0Var.f56892i0.f50089g;
            if ((qVar.f58485d & 8) != 0) {
                loop3: while (qVar != null) {
                    if ((qVar.f58484c & 8) != 0) {
                        F = qVar;
                        ?? eVar = 0;
                        while (true) {
                            if (F != 0) {
                                if (F instanceof b2) {
                                    if (((b2) F).e()) {
                                        r9 = F;
                                    }
                                } else if ((F.f58484c & 8) != 0 && (F instanceof y2.n)) {
                                    z1.q qVar2 = ((y2.n) F).R;
                                    int i11 = 0;
                                    while (qVar2 != null) {
                                        if ((qVar2.f58484c & 8) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                F = F;
                                                eVar = eVar;
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
                                        } else {
                                            F = F;
                                            eVar = eVar;
                                        }
                                        qVar2 = qVar2.f58487f;
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
                                F = y2.f.f(eVar);
                            }
                        }
                    }
                    if ((qVar.f58485d & 8) == 0) {
                        break;
                    }
                    qVar = qVar.f58487f;
                }
            }
        } else {
            z1.q qVar3 = (z1.q) i0Var.f56892i0.f50089g;
            if ((qVar3.f58485d & 8) != 0) {
                F = 0;
                while (qVar3 != null) {
                    if ((qVar3.f58484c & 8) != 0) {
                        ?? F2 = qVar3;
                        ?? eVar2 = 0;
                        while (F2 != 0) {
                            if (F2 instanceof b2) {
                                b2 b2Var = (b2) F2;
                                if (b2Var.e()) {
                                    if (b2Var.C0()) {
                                        return b2Var;
                                    }
                                    if (F == 0) {
                                        F = b2Var;
                                    }
                                }
                            } else if ((F2.f58484c & 8) != 0 && (F2 instanceof y2.n)) {
                                z1.q qVar4 = ((y2.n) F2).R;
                                int i12 = 0;
                                while (qVar4 != null) {
                                    if ((qVar4.f58484c & 8) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            F2 = F2;
                                            eVar2 = eVar2;
                                            eVar2 = eVar2;
                                            F2 = qVar4;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new n1.e(new z1.q[16]);
                                            }
                                            if (F2 != 0) {
                                                eVar2.c(F2);
                                                F2 = 0;
                                            }
                                            eVar2.c(qVar4);
                                        }
                                    } else {
                                        F2 = F2;
                                        eVar2 = eVar2;
                                    }
                                    qVar4 = qVar4.f58487f;
                                    F2 = F2;
                                    eVar2 = eVar2;
                                }
                                if (i12 == 1) {
                                    F2 = F2;
                                    eVar2 = eVar2;
                                } else {
                                    F2 = F2;
                                    eVar2 = eVar2;
                                }
                            }
                            F2 = y2.f.f(eVar2);
                        }
                    }
                    if ((qVar3.f58485d & 8) == 0) {
                        break;
                    }
                    qVar3 = qVar3.f58487f;
                    F = F;
                }
                r9 = F;
            }
        }
        return (b2) r9;
    }

    public final f2.c g() {
        k1 k1VarD = d();
        if (k1VarD != null) {
            if (!k1VarD.c1().P) {
                k1VarD = null;
            }
            if (k1VarD != null) {
                return w2.a0.h(k1VarD).E(k1VarD, true);
            }
        }
        return f2.c.f26571e;
    }

    public final f2.c h() {
        k1 k1VarD = d();
        if (k1VarD != null) {
            if (!k1VarD.c1().P) {
                k1VarD = null;
            }
            if (k1VarD != null) {
                return w2.a0.f(k1VarD, true);
            }
        }
        return f2.c.f26571e;
    }

    public final List i(boolean z11, boolean z12) {
        if (!z11 && this.f28699d.f28694d) {
            return ry.r.f50854a;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z12);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final o k() {
        boolean zN = n();
        o oVar = this.f28699d;
        if (!zN) {
            return oVar;
        }
        o oVarD = oVar.d();
        p(new ArrayList(), oVarD);
        return oVarD;
    }

    public final t l() {
        i0 i0VarW;
        t tVar = this.f28701f;
        if (tVar != null) {
            return tVar;
        }
        i0 i0Var = this.f28698c;
        boolean z11 = this.f28697b;
        if (!z11) {
            i0VarW = null;
            break;
        }
        i0VarW = i0Var.w();
        while (true) {
            if (i0VarW == null) {
                i0VarW = null;
                break;
            }
            o oVarY = i0VarW.y();
            if (oVarY != null && oVarY.f28693c) {
                break;
            }
            i0VarW = i0VarW.w();
        }
        if (i0VarW == null) {
            for (i0 i0VarW2 = i0Var.w(); i0VarW2 != null; i0VarW2 = i0VarW2.w()) {
                if (i0VarW2.f56892i0.g(8)) {
                    i0VarW = i0VarW2;
                }
            }
            i0VarW = null;
        }
        if (i0VarW == null) {
            return null;
        }
        return w.a(i0VarW, z11);
    }

    public final o m() {
        return this.f28699d;
    }

    public final boolean n() {
        return this.f28697b && this.f28699d.f28693c;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean o() {
        if (this.f28700e || !j(4, this).isEmpty()) {
            return false;
        }
        i0 i0VarW = this.f28698c.w();
        while (i0VarW != null) {
            o oVarY = i0VarW.y();
            if (oVarY != null && oVarY.f28693c) {
                if (i0VarW == null) {
                    return true;
                }
                return false;
            }
            i0VarW = i0VarW.w();
        }
        i0VarW = null;
        if (i0VarW == null) {
            return true;
        }
        return false;
    }

    public final void p(ArrayList arrayList, o oVar) {
        if (this.f28699d.f28694d) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            t tVar = (t) arrayList.get(size2);
            if (!tVar.n()) {
                oVar.f(tVar.f28699d);
                tVar.p(arrayList, oVar);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z11) {
        if (this.f28700e) {
            return ry.r.f50854a;
        }
        c(this.f28698c, arrayList);
        if (z11) {
            o oVar = this.f28699d;
            y.i0 i0Var = oVar.f28691a;
            Object objG = i0Var.g(x.f28733y);
            if (objG == null) {
                objG = null;
            }
            k kVar = (k) objG;
            if (kVar != null && oVar.f28693c && !arrayList.isEmpty()) {
                arrayList.add(b(kVar, new o0(kVar, 9)));
            }
            a0 a0Var = x.f28710a;
            if (i0Var.c(a0Var) && !arrayList.isEmpty() && oVar.f28693c) {
                Object objG2 = i0Var.g(a0Var);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) ry.m.s0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new c6.o(str, 1)));
                }
            }
        }
        return arrayList;
    }
}
