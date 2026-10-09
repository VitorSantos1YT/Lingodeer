package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.d f30220b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t1.d dVar, int i11) {
        super(2);
        this.f30219a = 0;
        float f5 = k.f30507a;
        float f11 = k.f30507a;
        this.f30220b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0082  */
    /* JADX WARN: Code duplicated, block: B:21:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:37:0x0103  */
    /* JADX WARN: Code duplicated, block: B:38:0x0107  */
    /* JADX WARN: Code duplicated, block: B:43:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x0159  */
    /* JADX WARN: Code duplicated, block: B:55:0x015f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0169  */
    /* JADX WARN: Code duplicated, block: B:62:0x0190  */
    /* JADX WARN: Code duplicated, block: B:63:0x0194  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x020b  */
    /* JADX WARN: Code duplicated, block: B:80:0x020f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0230  */
    /* JADX WARN: Code duplicated, block: B:94:0x0261  */
    /* JADX WARN: Code duplicated, block: B:96:0x0286  */
    /* JADX WARN: Code duplicated, block: B:97:0x028a  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int iV;
        l1.s sVar;
        y2.i iVar;
        y2.h hVar;
        int iV2;
        l1.s sVar2;
        y2.i iVar2;
        y2.h hVar2;
        int iV3;
        l1.s sVar3;
        y2.i iVar3;
        y2.h hVar3;
        int iV4;
        l1.s sVar4;
        y2.i iVar4;
        y2.h hVar4;
        int iV5;
        l1.s sVar5;
        y2.i iVar5;
        y2.h hVar5;
        int i11 = this.f30219a;
        j0.v vVar = j0.v.f35424a;
        z1.o oVar = z1.o.f58481a;
        qy.b0 b0Var = qy.b0.f48488a;
        t1.d dVar = this.f30220b;
        switch (i11) {
            case 0:
                ((Number) obj2).intValue();
                float f5 = k.f30507a;
                float f11 = k.f30507a;
                k.b(dVar, (l1.n) obj, l1.t.M(439));
                break;
            case 1:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, nVar, 0);
                    iV = l1.t.v(nVar);
                    sVar = (l1.s) nVar;
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(nVar, oVar);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, nVar);
                    l1.t.J(y2.j.f56916e, q1VarL, nVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iV, sVar, iV, hVar);
                    } else {
                        defpackage.e.A(iV, sVar, iV, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, nVar);
                    dVar.invoke(vVar, nVar, 6);
                    sVar.p(true);
                } else {
                    l1.s sVar6 = (l1.s) nVar;
                    if (!sVar6.F()) {
                        j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, nVar, 0);
                        iV = l1.t.v(nVar);
                        sVar = (l1.s) nVar;
                        l1.q1 q1VarL2 = sVar.l();
                        z1.r rVarC2 = z1.a.c(nVar, oVar);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA2, nVar);
                        l1.t.J(y2.j.f56916e, q1VarL2, nVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV))) {
                            defpackage.e.A(iV, sVar, iV, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC2, nVar);
                        dVar.invoke(vVar, nVar, 6);
                        sVar.p(true);
                    } else {
                        sVar6.W();
                    }
                }
                break;
            case 2:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    j0.u uVarA3 = j0.t.a(j0.i.f35305c, z1.c.O, nVar2, 0);
                    iV2 = l1.t.v(nVar2);
                    sVar2 = (l1.s) nVar2;
                    l1.q1 q1VarL3 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(nVar2, oVar);
                    y2.k.J.getClass();
                    iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA3, nVar2);
                    l1.t.J(y2.j.f56916e, q1VarL3, nVar2);
                    hVar2 = y2.j.f56918g;
                    if (sVar2.S) {
                        defpackage.e.A(iV2, sVar2, iV2, hVar2);
                    } else {
                        defpackage.e.A(iV2, sVar2, iV2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC3, nVar2);
                    dVar.invoke(vVar, nVar2, 6);
                    sVar2.p(true);
                } else {
                    l1.s sVar7 = (l1.s) nVar2;
                    if (!sVar7.F()) {
                        j0.u uVarA4 = j0.t.a(j0.i.f35305c, z1.c.O, nVar2, 0);
                        iV2 = l1.t.v(nVar2);
                        sVar2 = (l1.s) nVar2;
                        l1.q1 q1VarL4 = sVar2.l();
                        z1.r rVarC4 = z1.a.c(nVar2, oVar);
                        y2.k.J.getClass();
                        iVar2 = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA4, nVar2);
                        l1.t.J(y2.j.f56916e, q1VarL4, nVar2);
                        hVar2 = y2.j.f56918g;
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iV2))) {
                            defpackage.e.A(iV2, sVar2, iV2, hVar2);
                        }
                        l1.t.J(y2.j.f56915d, rVarC4, nVar2);
                        dVar.invoke(vVar, nVar2, 6);
                        sVar2.p(true);
                    } else {
                        sVar7.W();
                    }
                }
                break;
            case 3:
                l1.n nVar3 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.i1 i1Var = new j0.i1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    iV3 = l1.t.v(nVar3);
                    sVar3 = (l1.s) nVar3;
                    l1.q1 q1VarL5 = sVar3.l();
                    z1.r rVarC5 = z1.a.c(nVar3, i1Var);
                    y2.k.J.getClass();
                    iVar3 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar3);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, nVar3);
                    l1.t.J(y2.j.f56916e, q1VarL5, nVar3);
                    hVar3 = y2.j.f56918g;
                    if (sVar3.S) {
                        defpackage.e.A(iV3, sVar3, iV3, hVar3);
                    } else {
                        defpackage.e.A(iV3, sVar3, iV3, hVar3);
                    }
                    l1.t.J(y2.j.f56915d, rVarC5, nVar3);
                    dVar.invoke(nVar3, 0);
                    sVar3.p(true);
                } else {
                    l1.s sVar8 = (l1.s) nVar3;
                    if (!sVar8.F()) {
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        j0.i1 i1Var2 = new j0.i1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                        w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                        iV3 = l1.t.v(nVar3);
                        sVar3 = (l1.s) nVar3;
                        l1.q1 q1VarL6 = sVar3.l();
                        z1.r rVarC6 = z1.a.c(nVar3, i1Var2);
                        y2.k.J.getClass();
                        iVar3 = y2.j.f56913b;
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar3);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD2, nVar3);
                        l1.t.J(y2.j.f56916e, q1VarL6, nVar3);
                        hVar3 = y2.j.f56918g;
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iV3))) {
                            defpackage.e.A(iV3, sVar3, iV3, hVar3);
                        }
                        l1.t.J(y2.j.f56915d, rVarC6, nVar3);
                        dVar.invoke(nVar3, 0);
                        sVar3.p(true);
                    } else {
                        sVar8.W();
                    }
                }
                break;
            case 4:
                l1.n nVar4 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    z1.r rVarL = j0.e2.l(oVar, k1.d.f37471h, k1.d.f37470g);
                    w2.q0 q0VarD3 = j0.o.d(z1.c.f58467e, false);
                    iV4 = l1.t.v(nVar4);
                    sVar4 = (l1.s) nVar4;
                    l1.q1 q1VarL7 = sVar4.l();
                    z1.r rVarC7 = z1.a.c(nVar4, rVarL);
                    y2.k.J.getClass();
                    iVar4 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar4);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD3, nVar4);
                    l1.t.J(y2.j.f56916e, q1VarL7, nVar4);
                    hVar4 = y2.j.f56918g;
                    if (sVar4.S) {
                        defpackage.e.A(iV4, sVar4, iV4, hVar4);
                    } else {
                        defpackage.e.A(iV4, sVar4, iV4, hVar4);
                    }
                    l1.t.J(y2.j.f56915d, rVarC7, nVar4);
                    dVar.invoke(nVar4, 0);
                    sVar4.p(true);
                } else {
                    l1.s sVar9 = (l1.s) nVar4;
                    if (!sVar9.F()) {
                        z1.r rVarL2 = j0.e2.l(oVar, k1.d.f37471h, k1.d.f37470g);
                        w2.q0 q0VarD4 = j0.o.d(z1.c.f58467e, false);
                        iV4 = l1.t.v(nVar4);
                        sVar4 = (l1.s) nVar4;
                        l1.q1 q1VarL8 = sVar4.l();
                        z1.r rVarC8 = z1.a.c(nVar4, rVarL2);
                        y2.k.J.getClass();
                        iVar4 = y2.j.f56913b;
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar4);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD4, nVar4);
                        l1.t.J(y2.j.f56916e, q1VarL8, nVar4);
                        hVar4 = y2.j.f56918g;
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iV4))) {
                            defpackage.e.A(iV4, sVar4, iV4, hVar4);
                        }
                        l1.t.J(y2.j.f56915d, rVarC8, nVar4);
                        dVar.invoke(nVar4, 0);
                        sVar4.p(true);
                    } else {
                        sVar9.W();
                    }
                }
                break;
            default:
                l1.n nVar5 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    z1.r rVarE = j0.c.E(new j0.i1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 0, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                    w2.q0 q0VarD5 = j0.o.d(z1.c.f58463a, false);
                    iV5 = l1.t.v(nVar5);
                    sVar5 = (l1.s) nVar5;
                    l1.q1 q1VarL9 = sVar5.l();
                    z1.r rVarC9 = z1.a.c(nVar5, rVarE);
                    y2.k.J.getClass();
                    iVar5 = y2.j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar5);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD5, nVar5);
                    l1.t.J(y2.j.f56916e, q1VarL9, nVar5);
                    hVar5 = y2.j.f56918g;
                    if (sVar5.S) {
                        defpackage.e.A(iV5, sVar5, iV5, hVar5);
                    } else {
                        defpackage.e.A(iV5, sVar5, iV5, hVar5);
                    }
                    l1.t.J(y2.j.f56915d, rVarC9, nVar5);
                    dVar.invoke(nVar5, 0);
                    sVar5.p(true);
                } else {
                    l1.s sVar10 = (l1.s) nVar5;
                    if (!sVar10.F()) {
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        z1.r rVarE2 = j0.c.E(new j0.i1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 0, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                        w2.q0 q0VarD6 = j0.o.d(z1.c.f58463a, false);
                        iV5 = l1.t.v(nVar5);
                        sVar5 = (l1.s) nVar5;
                        l1.q1 q1VarL10 = sVar5.l();
                        z1.r rVarC10 = z1.a.c(nVar5, rVarE2);
                        y2.k.J.getClass();
                        iVar5 = y2.j.f56913b;
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar5);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD6, nVar5);
                        l1.t.J(y2.j.f56916e, q1VarL10, nVar5);
                        hVar5 = y2.j.f56918g;
                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iV5))) {
                            defpackage.e.A(iV5, sVar5, iV5, hVar5);
                        }
                        l1.t.J(y2.j.f56915d, rVarC10, nVar5);
                        dVar.invoke(nVar5, 0);
                        sVar5.p(true);
                    } else {
                        sVar10.W();
                    }
                }
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(t1.d dVar, int i11, byte b3) {
        super(2);
        this.f30219a = i11;
        this.f30220b = dVar;
    }
}
