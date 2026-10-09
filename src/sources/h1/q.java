package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f30892b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i11, l1.b1 b1Var) {
        super(2);
        this.f30891a = i11;
        this.f30892b = b1Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:45:0x0149  */
    /* JADX WARN: Code duplicated, block: B:53:0x016c  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        float fMin;
        int iV;
        l1.s sVar;
        y2.i iVar;
        y2.h hVar;
        int i11 = this.f30891a;
        z1.o oVar = z1.o.f58481a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f30892b;
        switch (i11) {
            case 0:
                v3.k kVar = (v3.k) obj;
                v3.k kVar2 = (v3.k) obj2;
                float f5 = b5.f30033a;
                int i12 = kVar2.f53494a;
                int i13 = kVar2.f53497d;
                int i14 = kVar2.f53496c;
                int i15 = kVar2.f53495b;
                int i16 = kVar.f53496c;
                int i17 = kVar.f53495b;
                int i18 = kVar.f53497d;
                int i19 = kVar.f53494a;
                float fMin2 = 1.0f;
                if (i12 >= i16) {
                    fMin = 0.0f;
                } else if (i14 <= i19) {
                    fMin = 1.0f;
                } else if (kVar2.d() == 0) {
                    fMin = 0.0f;
                } else {
                    fMin = (((Math.min(kVar.f53496c, i14) + Math.max(i19, i12)) / 2) - i12) / kVar2.d();
                }
                if (i15 >= i18) {
                    fMin2 = 0.0f;
                } else if (i13 > i17) {
                    if (kVar2.b() == 0) {
                        fMin2 = 0.0f;
                    } else {
                        fMin2 = (((Math.min(i18, i13) + Math.max(i17, i15)) / 2) - i15) / kVar2.b();
                    }
                }
                b1Var.setValue(new g2.z0(g2.f0.j(fMin, fMin2)));
                break;
            case 1:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else if (!oz.q.K0((CharSequence) b1Var.getValue())) {
                        ua.b((String) b1Var.getValue(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, nVar, 0, 0, 131070);
                    }
                } else if (!oz.q.K0((CharSequence) b1Var.getValue())) {
                    ua.b((String) b1Var.getValue(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, nVar, 0, 0, 131070);
                }
                break;
            case 2:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    z1.r rVarB = g3.r.b(oVar, false, o0.O);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    iV = l1.t.v(nVar2);
                    sVar = (l1.s) nVar2;
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(nVar2, rVarB);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, nVar2);
                    l1.t.J(y2.j.f56916e, q1VarL, nVar2);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iV, sVar, iV, hVar);
                    } else {
                        defpackage.e.A(iV, sVar, iV, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, nVar2);
                    ((fz.e) b1Var.getValue()).invoke(nVar2, 0);
                    sVar.p(true);
                } else {
                    l1.s sVar3 = (l1.s) nVar2;
                    if (!sVar3.F()) {
                        z1.r rVarB2 = g3.r.b(oVar, false, o0.O);
                        w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                        iV = l1.t.v(nVar2);
                        sVar = (l1.s) nVar2;
                        l1.q1 q1VarL2 = sVar.l();
                        z1.r rVarC2 = z1.a.c(nVar2, rVarB2);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD2, nVar2);
                        l1.t.J(y2.j.f56916e, q1VarL2, nVar2);
                        hVar = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV))) {
                            defpackage.e.A(iV, sVar, iV, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC2, nVar2);
                        ((fz.e) b1Var.getValue()).invoke(nVar2, 0);
                        sVar.p(true);
                    } else {
                        sVar3.W();
                    }
                }
                break;
            default:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar3;
                if (!sVar4.T(1 & iIntValue, (iIntValue & 3) != 2)) {
                    sVar4.W();
                } else {
                    Object objQ = sVar4.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = z3.c.f58742b;
                        sVar4.o0(objQ);
                    }
                    androidx.compose.ui.window.a.b(g3.r.b(oVar, false, (fz.c) objQ), (fz.e) b1Var.getValue(), sVar4, 0);
                }
                break;
        }
        return b0Var;
    }
}
