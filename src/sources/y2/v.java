package y2;

import com.yalantis.ucrop.view.CropImageView;
import rt.mc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends k1 {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final a.a f57010v0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final d2 f57011t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public u f57012u0;

    static {
        a.a aVarH = g2.f0.h();
        aVarH.N(g2.x.f28619f);
        aVarH.U(1.0f);
        aVarH.V(1);
        f57010v0 = aVarH;
    }

    public v(i0 i0Var) {
        super(i0Var);
        d2 d2Var = new d2();
        d2Var.f58485d = 0;
        this.f57011t0 = d2Var;
        d2Var.H = this;
        this.f57012u0 = i0Var.K != null ? new u(this) : null;
    }

    @Override // w2.p0
    public final w2.g1 B(long j11) {
        m0(j11);
        i0 i0Var = this.Q;
        n1.e eVarA = i0Var.A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            ((i0) objArr[i12]).f56893j0.f56974p.N = g0.NotUsed;
        }
        v1(i0Var.Z.e(this, i0Var.n(), j11));
        m1();
        return this;
    }

    @Override // w2.p0
    public final int W(int i11) {
        qh.d dVarV = this.Q.v();
        w2.q0 q0VarE = dVarV.e();
        i0 i0Var = (i0) dVarV.f47750b;
        return q0VarE.i((k1) i0Var.f56892i0.f50087e, i0Var.n(), i11);
    }

    @Override // y2.k1
    public final void X0() {
        if (this.f57012u0 == null) {
            this.f57012u0 = new u(this);
        }
    }

    @Override // y2.k1
    public final r0 a1() {
        return this.f57012u0;
    }

    @Override // w2.p0
    public final int b(int i11) {
        qh.d dVarV = this.Q.v();
        w2.q0 q0VarE = dVarV.e();
        i0 i0Var = (i0) dVarV.f47750b;
        return q0VarE.a((k1) i0Var.f56892i0.f50087e, i0Var.n(), i11);
    }

    @Override // y2.k1
    public final z1.q c1() {
        return this.f57011t0;
    }

    @Override // w2.g1
    public final void i0(long j11, float f5, fz.c cVar) {
        s1(j11, f5, cVar);
        if (this.L) {
            return;
        }
        this.Q.f56893j0.f56974p.H0();
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // y2.k1
    public final void i1(d dVar, long j11, t tVar, int i11, boolean z11) {
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        Object[] objArr;
        int i13;
        i0 i0Var;
        i0 i0Var2;
        long jB;
        long j12 = j11;
        t tVar2 = tVar;
        int i14 = dVar.f56843a;
        i0 i0Var3 = this.Q;
        switch (i14) {
            case 1:
                z12 = true;
                break;
            default:
                g3.o oVarY = i0Var3.y();
                z12 = !(oVarY != null && oVarY.f28694d);
                break;
        }
        if (z12) {
            if (C1(j12)) {
                i12 = i11;
                z13 = z11;
                z14 = true;
            } else {
                i12 = i11;
                if (i12 == 1 && (Float.floatToRawIntBits(U0(j12, b1())) & Integer.MAX_VALUE) < 2139095040) {
                    z14 = true;
                    z13 = false;
                }
            }
            if (z14) {
                int i15 = tVar2.f57005c;
                n1.e eVarZ = i0Var3.z();
                objArr = eVarZ.f43112a;
                i13 = eVarZ.f43114c - 1;
                while (i13 >= 0) {
                    i0Var = (i0) objArr[i13];
                    if (i0Var.J()) {
                        switch (dVar.f56843a) {
                            case 1:
                                i0Var.B(j12, tVar2, i12, z13);
                                i0Var2 = i0Var;
                                break;
                            default:
                                mc mcVar = i0Var.f56892i0;
                                ((k1) mcVar.f50087e).h1(k1.f56943s0, ((k1) mcVar.f50087e).Z0(j12), tVar2, 1, z13);
                                tVar2 = tVar;
                                i0Var2 = i0Var;
                                break;
                        }
                        jB = tVar2.b();
                        if (f.l(jB) < CropImageView.DEFAULT_ASPECT_RATIO && f.q(jB) && !f.p(jB)) {
                            k1 k1Var = (k1) i0Var2.f56892i0.f50087e;
                            k1Var.getClass();
                            z1.q qVarE1 = k1Var.e1(l1.g(16));
                            if (qVarE1 != null && qVarE1.P) {
                                if (!qVarE1.f58482a.P) {
                                    v2.a.b("visitLocalDescendants called on an unattached node");
                                }
                                z1.q qVar = qVarE1.f58482a;
                                if ((qVar.f58485d & 16) != 0) {
                                    while (true) {
                                        if (qVar != null) {
                                            if ((qVar.f58484c & 16) != 0) {
                                                ?? F = qVar;
                                                ?? eVar = 0;
                                                while (F != 0) {
                                                    if (F instanceof y1) {
                                                        if (((y1) F).s0()) {
                                                            tVar2.f57005c = tVar2.f57003a.f56687b - 1;
                                                            break;
                                                        }
                                                    } else if ((F.f58484c & 16) != 0 && (F instanceof n)) {
                                                        z1.q qVar2 = ((n) F).R;
                                                        int i16 = 0;
                                                        while (qVar2 != null) {
                                                            if ((qVar2.f58484c & 16) != 0) {
                                                                i16++;
                                                                if (i16 == 1) {
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
                                                        if (i16 == 1) {
                                                            F = F;
                                                            eVar = eVar;
                                                        } else {
                                                            F = F;
                                                            eVar = eVar;
                                                        }
                                                    }
                                                    F = f.f(eVar);
                                                }
                                            }
                                            qVar = qVar.f58487f;
                                        }
                                    }
                                }
                            }
                            tVar2.f57005c = i15;
                        }
                    }
                    i13--;
                    j12 = j11;
                    i12 = i11;
                }
                tVar2.f57005c = i15;
            }
        }
        i12 = i11;
        z13 = z11;
        z14 = false;
        if (z14) {
            int i17 = tVar2.f57005c;
            n1.e eVarZ2 = i0Var3.z();
            objArr = eVarZ2.f43112a;
            i13 = eVarZ2.f43114c - 1;
            while (i13 >= 0) {
                i0Var = (i0) objArr[i13];
                if (i0Var.J()) {
                    switch (dVar.f56843a) {
                        case 1:
                            i0Var.B(j12, tVar2, i12, z13);
                            i0Var2 = i0Var;
                            break;
                        default:
                            mc mcVar2 = i0Var.f56892i0;
                            ((k1) mcVar2.f50087e).h1(k1.f56943s0, ((k1) mcVar2.f50087e).Z0(j12), tVar2, 1, z13);
                            tVar2 = tVar;
                            i0Var2 = i0Var;
                            break;
                    }
                    jB = tVar2.b();
                    if (f.l(jB) < CropImageView.DEFAULT_ASPECT_RATIO) {
                        continue;
                    }
                }
                i13--;
                j12 = j11;
                i12 = i11;
            }
            tVar2.f57005c = i17;
        }
    }

    @Override // w2.p0
    public final int p(int i11) {
        qh.d dVarV = this.Q.v();
        w2.q0 q0VarE = dVarV.e();
        i0 i0Var = (i0) dVarV.f47750b;
        return q0VarE.f((k1) i0Var.f56892i0.f50087e, i0Var.n(), i11);
    }

    @Override // y2.k1
    public final void r1(g2.v vVar, j2.c cVar) {
        i0 i0Var = this.Q;
        t1 t1VarA = l0.a(i0Var);
        n1.e eVarZ = i0Var.z();
        Object[] objArr = eVarZ.f43112a;
        int i11 = eVarZ.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            i0 i0Var2 = (i0) objArr[i12];
            if (i0Var2.J()) {
                i0Var2.i(vVar, cVar);
            }
        }
        if (t1VarA.getShowLayoutBounds()) {
            long j11 = this.f54503c;
            vVar.o(0.5f, 0.5f, ((int) (j11 >> 32)) - 0.5f, ((int) (j11 & 4294967295L)) - 0.5f, f57010v0);
        }
    }

    @Override // w2.p0
    public final int t(int i11) {
        qh.d dVarV = this.Q.v();
        w2.q0 q0VarE = dVarV.e();
        i0 i0Var = (i0) dVarV.f47750b;
        return q0VarE.h((k1) i0Var.f56892i0.f50087e, i0Var.n(), i11);
    }

    @Override // y2.q0
    public final int x0(w2.n nVar) {
        u uVar = this.f57012u0;
        if (uVar != null) {
            return uVar.x0(nVar);
        }
        b1 b1Var = this.Q.f56893j0.f56974p;
        j0 j0Var = b1Var.Z;
        if (!b1Var.O) {
            if (b1Var.f56832f.f56963d == e0.Measuring) {
                j0Var.f56925f = true;
                if (j0Var.f56921b) {
                    b1Var.X = true;
                    b1Var.Y = true;
                }
            } else {
                j0Var.f56926g = true;
            }
        }
        v vVarE = b1Var.e();
        boolean z11 = vVarE.M;
        vVarE.M = true;
        b1Var.L();
        vVarE.M = z11;
        Integer num = (Integer) j0Var.f56928i.get(nVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
