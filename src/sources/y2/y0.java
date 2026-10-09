package y2;

import kotlin.NoWhenBranchMatchedException;
import qp.m3;
import rt.mc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f57040a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f57042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f57043d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v3.a f57048i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3 f57041b = new m3(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qp.r f57044e = new qp.r(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1.e f57045f = new n1.e(new i0[16]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f57046g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1.e f57047h = new n1.e(new w0[16]);

    public y0(i0 i0Var) {
        this.f57040a = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean b(i0 i0Var, v3.a aVar) {
        boolean zJ0;
        i0 i0Var2 = i0Var.K;
        m0 m0Var = i0Var.f56893j0;
        if (i0Var2 == null) {
            return false;
        }
        if (aVar == null) {
            v0 v0Var = m0Var.f56975q;
            v3.a aVar2 = v0Var != null ? v0Var.P : null;
            if (aVar2 == null || i0Var2 == null) {
                zJ0 = false;
            } else {
                kotlin.jvm.internal.m.c(v0Var);
                zJ0 = v0Var.J0(aVar2.f53483a);
            }
        } else if (i0Var2 != null) {
            v0 v0Var2 = m0Var.f56975q;
            kotlin.jvm.internal.m.c(v0Var2);
            zJ0 = v0Var2.J0(aVar.f53483a);
        } else {
            zJ0 = false;
        }
        i0 i0VarW = i0Var.w();
        if (zJ0 && i0VarW != null) {
            if (i0VarW.K == null) {
                i0.Y(i0VarW, false, 3);
                return zJ0;
            }
            if (i0Var.u() == g0.InMeasureBlock) {
                i0.W(i0VarW, false, 3);
                return zJ0;
            }
            if (i0Var.u() == g0.InLayoutBlock) {
                i0VarW.V(false);
            }
        }
        return zJ0;
    }

    public static boolean c(i0 i0Var, v3.a aVar) {
        boolean zQ = aVar != null ? i0Var.Q(aVar) : i0.R(i0Var);
        i0 i0VarW = i0Var.w();
        if (zQ && i0VarW != null) {
            if (i0Var.t() == g0.InMeasureBlock) {
                i0.Y(i0VarW, false, 3);
                return zQ;
            }
            if (i0Var.t() == g0.InLayoutBlock) {
                i0VarW.X(false);
            }
        }
        return zQ;
    }

    public static boolean h(i0 i0Var) {
        v0 v0Var;
        j0 j0Var;
        if (i0Var.f56893j0.f56964e) {
            return (i0Var.u() == g0.NotUsed && ((v0Var = i0Var.f56893j0.f56975q) == null || (j0Var = v0Var.T) == null || !j0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(i0 i0Var) {
        if (!i0Var.s()) {
            return false;
        }
        do {
            if (i0Var.t() == g0.NotUsed && !i0Var.f56893j0.f56974p.Z.e()) {
                i0 i0VarW = i0Var.w();
                if ((i0VarW != null ? i0VarW.f56893j0.f56963d : null) != e0.Measuring) {
                    return false;
                }
            }
            i0Var = i0Var.w();
            if (i0Var == null) {
                return false;
            }
        } while (!i0Var.J());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z11) {
        Object[] objArr;
        qp.r rVar = this.f57044e;
        if (z11) {
            n1.e eVar = (n1.e) rVar.f48145b;
            i0 i0Var = this.f57040a;
            if (i0Var.f56902s0 > 0) {
                eVar.h();
                eVar.c(i0Var);
                i0Var.f56901r0 = true;
            }
        }
        n1.e eVar2 = (n1.e) rVar.f48145b;
        int i11 = eVar2.f43114c;
        if (i11 != 0) {
            ry.l.g0(eVar2.f43112a, q1.f56998b, 0, i11);
            int i12 = eVar2.f43114c;
            i0[] i0VarArr = (i0[]) rVar.f48146c;
            if (i0VarArr == null || i0VarArr.length < i12) {
                objArr = i0VarArr;
                objArr = new i0[Math.max(16, i12)];
            }
            objArr = i0VarArr;
            rVar.f48146c = null;
            for (int i13 = 0; i13 < i12; i13++) {
                objArr[i13] = eVar2.f43112a[i13];
            }
            eVar2.h();
            for (int i14 = i12 - 1; -1 < i14; i14--) {
                i0 i0Var2 = objArr[i14];
                kotlin.jvm.internal.m.c(i0Var2);
                if (i0Var2.f56901r0) {
                    qp.r.a(i0Var2);
                }
                objArr[i14] = 0;
            }
            rVar.f48146c = objArr;
        }
    }

    public final void d() {
        n1.e eVar = this.f57047h;
        int i11 = eVar.f43114c;
        if (i11 != 0) {
            Object[] objArr = eVar.f43112a;
            for (int i12 = 0; i12 < i11; i12++) {
                w0 w0Var = (w0) objArr[i12];
                i0 i0Var = w0Var.f57027a;
                boolean z11 = w0Var.f57029c;
                i0 i0Var2 = w0Var.f57027a;
                if (i0Var.I()) {
                    if (w0Var.f57028b) {
                        i0.W(i0Var2, z11, 2);
                    } else {
                        i0.Y(i0Var2, z11, 2);
                    }
                }
            }
            eVar.h();
        }
    }

    public final void e(i0 i0Var) {
        n1.e eVarA = i0Var.A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            i0 i0Var2 = (i0) objArr[i12];
            if (kotlin.jvm.internal.m.a(i0Var2.K(), Boolean.TRUE) && !i0Var2.f56904t0) {
                if (this.f57041b.c(i0Var2)) {
                    i0Var2.L();
                }
                e(i0Var2);
            }
        }
    }

    public final void f(i0 i0Var, boolean z11) {
        if (!this.f57042c) {
            v2.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z11 ? i0Var.f56893j0.f56964e : i0Var.s()) {
            v2.a.a("node not yet measured");
        }
        g(i0Var, z11);
    }

    public final void g(i0 i0Var, boolean z11) {
        v0 v0Var;
        j0 j0Var;
        n1.e eVarA = i0Var.A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            i0 i0Var2 = (i0) objArr[i12];
            if ((!z11 && (i0Var2.t() == g0.InMeasureBlock || i0Var2.f56893j0.f56974p.Z.e())) || (z11 && (i0Var2.u() == g0.InMeasureBlock || ((v0Var = i0Var2.f56893j0.f56975q) != null && (j0Var = v0Var.T) != null && j0Var.e())))) {
                boolean zS = f.s(i0Var2);
                m0 m0Var = i0Var2.f56893j0;
                if (zS && !z11) {
                    if (m0Var.f56964e && this.f57041b.c(i0Var2)) {
                        m(i0Var2, true, false);
                    } else {
                        f(i0Var2, true);
                    }
                }
                if (z11 ? m0Var.f56964e : i0Var2.s()) {
                    m(i0Var2, z11, false);
                }
                if (!(z11 ? m0Var.f56964e : i0Var2.s())) {
                    g(i0Var2, z11);
                }
            }
        }
        if (z11 ? i0Var.f56893j0.f56964e : i0Var.s()) {
            m(i0Var, z11, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean j(z2.p pVar) {
        boolean z11;
        z1.q qVar;
        ?? eVar;
        ?? F;
        int i11;
        boolean z12;
        i0 i0Var;
        boolean z13;
        m3 m3Var = this.f57041b;
        i0 i0Var2 = this.f57040a;
        if (!i0Var2.I()) {
            v2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!i0Var2.J()) {
            v2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f57042c) {
            v2.a.a("performMeasureAndLayout called during measure layout");
        }
        int i12 = 0;
        if (this.f57048i != null) {
            this.f57042c = true;
            this.f57043d = true;
            try {
                boolean zF = m3Var.f();
                tp.e eVar2 = (tp.e) m3Var.f48056a;
                if (zF) {
                    z11 = false;
                    while (true) {
                        tp.e eVar3 = (tp.e) m3Var.f48058c;
                        tp.e eVar4 = (tp.e) m3Var.f48057b;
                        if (!((c2) eVar2.f52454b).isEmpty()) {
                            i0Var = (i0) ((c2) eVar2.f52454b).first();
                            eVar2.v(i0Var);
                            z13 = i0Var.K != null;
                            z12 = false;
                        } else if (!((c2) eVar4.f52454b).isEmpty()) {
                            i0Var = (i0) ((c2) eVar4.f52454b).first();
                            eVar4.v(i0Var);
                            z13 = i0Var.K != null;
                            z12 = true;
                        } else {
                            if (((c2) eVar3.f52454b).isEmpty()) {
                                break;
                            }
                            i0 i0Var3 = (i0) ((c2) eVar3.f52454b).first();
                            eVar3.v(i0Var3);
                            z12 = true;
                            i0Var = i0Var3;
                            z13 = false;
                        }
                        boolean zM = m(i0Var, z13, z12);
                        if (!z12) {
                            if (i0Var.f56893j0.f56965f) {
                                m3Var.a(i0Var, w.LookaheadPlacement);
                            }
                            if (i0Var.q()) {
                                m3Var.a(i0Var, w.Placement);
                            }
                        }
                        if (i0Var == i0Var2 && zM) {
                            z11 = true;
                        }
                    }
                    if (pVar != null) {
                        pVar.invoke();
                    }
                } else {
                    z11 = false;
                }
                this.f57042c = false;
                this.f57043d = false;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    this.f57042c = false;
                    this.f57043d = false;
                    throw th3;
                }
            }
        } else {
            z11 = false;
        }
        n1.e eVar5 = this.f57045f;
        Object[] objArr = eVar5.f43112a;
        int i13 = eVar5.f43114c;
        int i14 = 0;
        while (i14 < i13) {
            mc mcVar = ((i0) objArr[i14]).f56892i0;
            v vVar = (v) mcVar.f50086d;
            int i15 = 4194304;
            boolean zG = l1.g(4194304);
            if (zG) {
                qVar = vVar.f57011t0;
            } else {
                qVar = vVar.f57011t0.f58486e;
                if (qVar == null) {
                }
                i14++;
                i12 = 0;
            }
            g2.t0 t0Var = k1.f56939o0;
            z1.q qVarE1 = vVar.e1(zG);
            while (qVarE1 != null && (qVarE1.f58485d & i15) != 0) {
                if ((qVarE1.f58484c & i15) != 0) {
                    ?? r13 = qVarE1;
                    ?? r14 = 0;
                    while (r13 != 0) {
                        if (r13 instanceof y) {
                            ((y) r13).F0((v) mcVar.f50086d);
                        } else {
                            if ((r13.f58484c & i15) != 0 && (r13 instanceof n)) {
                                z1.q qVar2 = ((n) r13).R;
                                while (qVar2 != null) {
                                    int i16 = i15;
                                    if ((qVar2.f58484c & i16) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            F = r13;
                                            eVar = r14;
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
                                        F = r13;
                                        eVar = r14;
                                    }
                                    qVar2 = qVar2.f58487f;
                                    i15 = i16;
                                    F = F;
                                    eVar = eVar;
                                }
                                F = r13;
                                eVar = r14;
                                i11 = i15;
                                eVar = eVar;
                                if (i12 == 1) {
                                }
                                i15 = i11;
                                i12 = 0;
                                r13 = F;
                                r14 = eVar;
                            }
                            F = f.f(eVar);
                            i15 = i11;
                            i12 = 0;
                            r13 = F;
                            r14 = eVar;
                        }
                        i11 = i15;
                        eVar = r14;
                        F = f.f(eVar);
                        i15 = i11;
                        i12 = 0;
                        r13 = F;
                        r14 = eVar;
                    }
                }
                int i17 = i15;
                if (qVarE1 == qVar) {
                    break;
                }
                qVarE1 = qVarE1.f58487f;
                i15 = i17;
                i12 = 0;
            }
            i14++;
            i12 = 0;
        }
        eVar5.h();
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, y2.i0] */
    public final void k(i0 i0Var, long j11) {
        z1.q qVar;
        ?? F;
        if (i0Var.f56904t0) {
            return;
        }
        i0 i0Var2 = this.f57040a;
        if (i0Var.equals(i0Var2)) {
            v2.a.a("measureAndLayout called on root");
        }
        if (!i0Var2.I()) {
            v2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!i0Var2.J()) {
            v2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f57042c) {
            v2.a.a("performMeasureAndLayout called during measure layout");
        }
        int i11 = 0;
        if (this.f57048i != null) {
            this.f57042c = true;
            this.f57043d = false;
            try {
                m3 m3Var = this.f57041b;
                ((tp.e) m3Var.f48056a).v(i0Var);
                ((tp.e) m3Var.f48057b).v(i0Var);
                ((tp.e) m3Var.f48058c).v(i0Var);
                if ((b(i0Var, new v3.a(j11)) || i0Var.f56893j0.f56965f) && kotlin.jvm.internal.m.a(i0Var.K(), Boolean.TRUE)) {
                    i0Var.L();
                }
                e(i0Var);
                c(i0Var, new v3.a(j11));
                if (i0Var.q() && i0Var.J()) {
                    i0Var.U();
                    qp.r rVar = this.f57044e;
                    rVar.getClass();
                    if (i0Var.f56902s0 > 0) {
                        ((n1.e) rVar.f48145b).c(i0Var);
                        i0Var.f56901r0 = true;
                    }
                }
                d();
                this.f57042c = false;
                this.f57043d = false;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    this.f57042c = false;
                    this.f57043d = false;
                    throw th3;
                }
            }
        }
        n1.e eVar = this.f57045f;
        Object[] objArr = eVar.f43112a;
        int i12 = eVar.f43114c;
        int i13 = 0;
        while (i13 < i12) {
            mc mcVar = ((i0) objArr[i13]).f56892i0;
            v vVar = (v) mcVar.f50086d;
            boolean zG = l1.g(4194304);
            if (zG) {
                qVar = vVar.f57011t0;
            } else {
                qVar = vVar.f57011t0.f58486e;
                if (qVar == null) {
                }
                i13++;
                i11 = 0;
            }
            g2.t0 t0Var = k1.f56939o0;
            z1.q qVarE1 = vVar.e1(zG);
            while (qVarE1 != null && (qVarE1.f58485d & 4194304) != 0) {
                if ((qVarE1.f58484c & 4194304) != 0) {
                    ?? r12 = qVarE1;
                    ?? eVar2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof y) {
                            ((y) r12).F0((v) mcVar.f50086d);
                        } else {
                            if ((r12.f58484c & 4194304) != 0 && (r12 instanceof n)) {
                                z1.q qVar2 = ((n) r12).R;
                                int i14 = i11;
                                while (qVar2 != null) {
                                    if ((qVar2.f58484c & 4194304) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            F = r12;
                                            eVar2 = eVar2;
                                            eVar2 = eVar2;
                                            F = qVar2;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new n1.e(new z1.q[16]);
                                            }
                                            if (F != 0) {
                                                eVar2.c(F);
                                                F = 0;
                                            }
                                            eVar2.c(qVar2);
                                        }
                                    } else {
                                        F = r12;
                                        eVar2 = eVar2;
                                    }
                                    qVar2 = qVar2.f58487f;
                                    F = F;
                                    eVar2 = eVar2;
                                }
                                if (i14 == 1) {
                                    F = r12;
                                    eVar2 = eVar2;
                                }
                            }
                            i11 = 0;
                            r12 = F;
                            eVar2 = eVar2;
                        }
                        F = r12;
                        eVar2 = eVar2;
                        F = f.f(eVar2);
                        i11 = 0;
                        r12 = F;
                        eVar2 = eVar2;
                    }
                }
                if (qVarE1 == qVar) {
                    break;
                }
                qVarE1 = qVarE1.f58487f;
                i11 = 0;
            }
            i13++;
            i11 = 0;
        }
        eVar.h();
    }

    public final void l() {
        m3 m3Var = this.f57041b;
        if (m3Var.f()) {
            i0 i0Var = this.f57040a;
            if (!i0Var.I()) {
                v2.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!i0Var.J()) {
                v2.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f57042c) {
                v2.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f57048i != null) {
                this.f57042c = true;
                this.f57043d = false;
                try {
                    if (!((c2) ((tp.e) m3Var.f48058c).f52454b).isEmpty() && !((c2) ((tp.e) m3Var.f48056a).f52454b).isEmpty()) {
                        if (i0Var.K != null) {
                            o(i0Var, true);
                        } else {
                            n(i0Var);
                        }
                    }
                    o(i0Var, false);
                    this.f57042c = false;
                    this.f57043d = false;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        this.f57042c = false;
                        this.f57043d = false;
                        throw th3;
                    }
                }
            }
        }
    }

    public final boolean m(i0 i0Var, boolean z11, boolean z12) {
        v3.a aVar;
        boolean zB;
        w2.f1 placementScope;
        v vVar;
        i0 i0VarW;
        v0 v0Var;
        j0 j0Var;
        boolean z13 = i0Var.f56904t0;
        m0 m0Var = i0Var.f56893j0;
        if (z13 || (!i0Var.J() && !m0Var.f56974p.V && !i(i0Var) && !kotlin.jvm.internal.m.a(i0Var.K(), Boolean.TRUE) && !h(i0Var) && !m0Var.f56974p.Z.e() && ((v0Var = m0Var.f56975q) == null || (j0Var = v0Var.T) == null || !j0Var.e()))) {
            return false;
        }
        i0 i0Var2 = this.f57040a;
        if (i0Var == i0Var2) {
            aVar = this.f57048i;
            kotlin.jvm.internal.m.c(aVar);
        } else {
            aVar = null;
        }
        if (z11) {
            zB = m0Var.f56964e ? b(i0Var, aVar) : false;
            if (z12 && ((zB || m0Var.f56965f) && kotlin.jvm.internal.m.a(i0Var.K(), Boolean.TRUE))) {
                i0Var.L();
            }
        } else {
            boolean zC = i0Var.s() ? c(i0Var, aVar) : false;
            if (z12 && i0Var.q() && (i0Var == i0Var2 || ((i0VarW = i0Var.w()) != null && i0VarW.J() && m0Var.f56974p.V))) {
                if (i0Var == i0Var2) {
                    if (i0Var.f56889f0 == g0.NotUsed) {
                        i0Var.f();
                    }
                    i0 i0VarW2 = i0Var.w();
                    if (i0VarW2 == null || (vVar = (v) i0VarW2.f56892i0.f50086d) == null || (placementScope = vVar.N) == null) {
                        placementScope = l0.a(i0Var).getPlacementScope();
                    }
                    w2.f1.k(placementScope, m0Var.f56974p, 0, 0);
                } else {
                    i0Var.U();
                }
                qp.r rVar = this.f57044e;
                rVar.getClass();
                if (i0Var.f56902s0 > 0) {
                    ((n1.e) rVar.f48145b).c(i0Var);
                    i0Var.f56901r0 = true;
                }
            }
            zB = zC;
        }
        d();
        return zB;
    }

    public final void n(i0 i0Var) {
        n1.e eVarA = i0Var.A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            i0 i0Var2 = (i0) objArr[i12];
            if (i0Var2.t() == g0.InMeasureBlock || i0Var2.f56893j0.f56974p.Z.e()) {
                if (f.s(i0Var2)) {
                    o(i0Var2, true);
                } else {
                    n(i0Var2);
                }
            }
        }
    }

    public final void o(i0 i0Var, boolean z11) {
        v3.a aVar;
        if (i0Var.f56904t0) {
            return;
        }
        if (i0Var == this.f57040a) {
            aVar = this.f57048i;
            kotlin.jvm.internal.m.c(aVar);
        } else {
            aVar = null;
        }
        if (z11) {
            b(i0Var, aVar);
        } else {
            c(i0Var, aVar);
        }
    }

    public final boolean p(i0 i0Var, boolean z11) {
        int i11 = x0.f57037a[i0Var.f56893j0.f56963d.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3 || i11 == 4) {
                this.f57047h.c(new w0(i0Var, false, z11));
            } else {
                if (i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!i0Var.s() || z11) {
                    i0Var.f56893j0.f56974p.W = true;
                    if (!i0Var.f56904t0 && (i0Var.J() || i(i0Var))) {
                        i0 i0VarW = i0Var.w();
                        if (i0VarW == null || !i0VarW.s()) {
                            this.f57041b.a(i0Var, w.Measurement);
                        }
                        if (!this.f57043d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j11) {
        v3.a aVar = this.f57048i;
        if (aVar == null ? false : v3.a.b(aVar.f53483a, j11)) {
            return;
        }
        if (this.f57042c) {
            v2.a.a("updateRootConstraints called while measuring");
        }
        this.f57048i = new v3.a(j11);
        i0 i0Var = this.f57040a;
        i0 i0Var2 = i0Var.K;
        m0 m0Var = i0Var.f56893j0;
        if (i0Var2 != null) {
            m0Var.f56964e = true;
        }
        m0Var.f56974p.W = true;
        this.f57041b.a(i0Var, i0Var2 != null ? w.LookaheadMeasurement : w.Measurement);
    }
}
