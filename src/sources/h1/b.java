package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f30013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, fz.e eVar) {
        super(2);
        this.f30012a = i11;
        this.f30013b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:18:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:46:0x0121  */
    /* JADX WARN: Code duplicated, block: B:48:0x0147  */
    /* JADX WARN: Code duplicated, block: B:49:0x014b  */
    /* JADX WARN: Code duplicated, block: B:54:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:79:0x021a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0251  */
    /* JADX WARN: Code duplicated, block: B:91:0x0288  */
    /* JADX WARN: Code duplicated, block: B:92:0x028c  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ad  */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x01a4, please report this as an issue */
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
        switch (this.f30012a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar5 = (l1.s) nVar;
                    if (sVar5.F()) {
                        sVar5.W();
                    } else {
                        z1.r rVarI = j0.c.z(z1.o.f58481a, k.f30512f).i(new j0.v0(z1.c.O));
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        iV = l1.t.v(nVar);
                        sVar = (l1.s) nVar;
                        l1.q1 q1VarL = sVar.l();
                        z1.r rVarC = z1.a.c(nVar, rVarI);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD, nVar);
                        l1.t.J(y2.j.f56916e, q1VarL, nVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV))) {
                            defpackage.e.A(iV, sVar, iV, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, nVar);
                        this.f30013b.invoke(nVar, 0);
                        sVar.p(true);
                    }
                } else {
                    z1.r rVarI2 = j0.c.z(z1.o.f58481a, k.f30512f).i(new j0.v0(z1.c.O));
                    w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                    iV = l1.t.v(nVar);
                    sVar = (l1.s) nVar;
                    l1.q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(nVar, rVarI2);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD2, nVar);
                    l1.t.J(y2.j.f56916e, q1VarL2, nVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iV, sVar, iV, hVar);
                    } else {
                        defpackage.e.A(iV, sVar, iV, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, nVar);
                    this.f30013b.invoke(nVar, 0);
                    sVar.p(true);
                }
                break;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar6 = (l1.s) nVar2;
                    if (sVar6.F()) {
                        sVar6.W();
                    } else {
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        z1.r rVarI3 = j0.c.z(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), k.f30513g).i(new j0.v0(z1.c.O));
                        w2.q0 q0VarD3 = j0.o.d(z1.c.f58463a, false);
                        iV2 = l1.t.v(nVar2);
                        sVar2 = (l1.s) nVar2;
                        l1.q1 q1VarL3 = sVar2.l();
                        z1.r rVarC3 = z1.a.c(nVar2, rVarI3);
                        y2.k.J.getClass();
                        iVar2 = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD3, nVar2);
                        l1.t.J(y2.j.f56916e, q1VarL3, nVar2);
                        hVar2 = y2.j.f56918g;
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iV2))) {
                            defpackage.e.A(iV2, sVar2, iV2, hVar2);
                        }
                        l1.t.J(y2.j.f56915d, rVarC3, nVar2);
                        this.f30013b.invoke(nVar2, 0);
                        sVar2.p(true);
                    }
                } else {
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    z1.r rVarI4 = j0.c.z(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), k.f30513g).i(new j0.v0(z1.c.O));
                    w2.q0 q0VarD4 = j0.o.d(z1.c.f58463a, false);
                    iV2 = l1.t.v(nVar2);
                    sVar2 = (l1.s) nVar2;
                    l1.q1 q1VarL4 = sVar2.l();
                    z1.r rVarC4 = z1.a.c(nVar2, rVarI4);
                    y2.k.J.getClass();
                    iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD4, nVar2);
                    l1.t.J(y2.j.f56916e, q1VarL4, nVar2);
                    hVar2 = y2.j.f56918g;
                    if (sVar2.S) {
                        defpackage.e.A(iV2, sVar2, iV2, hVar2);
                    } else {
                        defpackage.e.A(iV2, sVar2, iV2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC4, nVar2);
                    this.f30013b.invoke(nVar2, 0);
                    sVar2.p(true);
                }
                break;
            case 2:
                l1.n nVar3 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar7 = (l1.s) nVar3;
                    if (sVar7.F()) {
                        sVar7.W();
                    } else {
                        w2.q0 q0VarD5 = j0.o.d(z1.c.f58469t, false);
                        iV3 = l1.t.v(nVar3);
                        sVar3 = (l1.s) nVar3;
                        l1.q1 q1VarL5 = sVar3.l();
                        z1.r rVarC5 = z1.a.c(nVar3, z1.o.f58481a);
                        y2.k.J.getClass();
                        iVar3 = y2.j.f56913b;
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar3);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD5, nVar3);
                        l1.t.J(y2.j.f56916e, q1VarL5, nVar3);
                        hVar3 = y2.j.f56918g;
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iV3))) {
                            defpackage.e.A(iV3, sVar3, iV3, hVar3);
                        }
                        l1.t.J(y2.j.f56915d, rVarC5, nVar3);
                        this.f30013b.invoke(nVar3, 0);
                        sVar3.p(true);
                    }
                } else {
                    w2.q0 q0VarD6 = j0.o.d(z1.c.f58469t, false);
                    iV3 = l1.t.v(nVar3);
                    sVar3 = (l1.s) nVar3;
                    l1.q1 q1VarL6 = sVar3.l();
                    z1.r rVarC6 = z1.a.c(nVar3, z1.o.f58481a);
                    y2.k.J.getClass();
                    iVar3 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar3);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD6, nVar3);
                    l1.t.J(y2.j.f56916e, q1VarL6, nVar3);
                    hVar3 = y2.j.f56918g;
                    if (sVar3.S) {
                        defpackage.e.A(iV3, sVar3, iV3, hVar3);
                    } else {
                        defpackage.e.A(iV3, sVar3, iV3, hVar3);
                    }
                    l1.t.J(y2.j.f56915d, rVarC6, nVar3);
                    this.f30013b.invoke(nVar3, 0);
                    sVar3.p(true);
                }
                break;
            case 3:
                l1.n nVar4 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar8 = (l1.s) nVar4;
                    if (sVar8.F()) {
                        sVar8.W();
                    } else {
                        this.f30013b.invoke(nVar4, 0);
                    }
                } else {
                    this.f30013b.invoke(nVar4, 0);
                }
                break;
            case 4:
                l1.n nVar5 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar9 = (l1.s) nVar5;
                    if (sVar9.F()) {
                        sVar9.W();
                    } else {
                        ua.a(j3.y0.a(fc.a(k1.y.f37833f, nVar5), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447), this.f30013b, nVar5, 0);
                    }
                } else {
                    ua.a(j3.y0.a(fc.a(k1.y.f37833f, nVar5), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447), this.f30013b, nVar5, 0);
                }
                break;
            default:
                l1.n nVar6 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar10 = (l1.s) nVar6;
                    if (sVar10.F()) {
                        sVar10.W();
                    } else {
                        z1.r rVarL = w2.a0.l(z1.o.f58481a, "Container");
                        w2.q0 q0VarD7 = j0.o.d(z1.c.f58463a, true);
                        iV4 = l1.t.v(nVar6);
                        sVar4 = (l1.s) nVar6;
                        l1.q1 q1VarL7 = sVar4.l();
                        z1.r rVarC7 = z1.a.c(nVar6, rVarL);
                        y2.k.J.getClass();
                        iVar4 = y2.j.f56913b;
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar4);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD7, nVar6);
                        l1.t.J(y2.j.f56916e, q1VarL7, nVar6);
                        hVar4 = y2.j.f56918g;
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iV4))) {
                            defpackage.e.A(iV4, sVar4, iV4, hVar4);
                        }
                        l1.t.J(y2.j.f56915d, rVarC7, nVar6);
                        this.f30013b.invoke(nVar6, 0);
                        sVar4.p(true);
                    }
                } else {
                    z1.r rVarL2 = w2.a0.l(z1.o.f58481a, "Container");
                    w2.q0 q0VarD8 = j0.o.d(z1.c.f58463a, true);
                    iV4 = l1.t.v(nVar6);
                    sVar4 = (l1.s) nVar6;
                    l1.q1 q1VarL8 = sVar4.l();
                    z1.r rVarC8 = z1.a.c(nVar6, rVarL2);
                    y2.k.J.getClass();
                    iVar4 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar4);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD8, nVar6);
                    l1.t.J(y2.j.f56916e, q1VarL8, nVar6);
                    hVar4 = y2.j.f56918g;
                    if (sVar4.S) {
                        defpackage.e.A(iV4, sVar4, iV4, hVar4);
                    } else {
                        defpackage.e.A(iV4, sVar4, iV4, hVar4);
                    }
                    l1.t.J(y2.j.f56915d, rVarC8, nVar6);
                    this.f30013b.invoke(nVar6, 0);
                    sVar4.p(true);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
