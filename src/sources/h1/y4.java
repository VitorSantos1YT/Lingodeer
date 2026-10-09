package h1;

import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y4 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy.e f31344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(x8 x8Var, z1.r rVar, fz.f fVar, int i11) {
        super(2);
        this.f31341a = 1;
        this.f31343c = x8Var;
        this.f31342b = rVar;
        this.f31344d = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x0139  */
    /* JADX WARN: Code duplicated, block: B:44:0x0177  */
    /* JADX WARN: Code duplicated, block: B:45:0x017b  */
    /* JADX WARN: Code duplicated, block: B:50:0x019c  */
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
        int i11 = this.f31341a;
        qy.b0 b0Var = qy.b0.f48488a;
        qy.e eVar = this.f31344d;
        Object obj3 = this.f31343c;
        Object obj4 = this.f31342b;
        switch (i11) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    z1.r rVarY = d0.n.y(j0.c.J(j0.c.C((z1.r) obj4, CropImageView.DEFAULT_ASPECT_RATIO, b5.f30036d, 1), j0.e1.Max), (d0.d2) obj3, false, 14);
                    t1.d dVar = (t1.d) eVar;
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, nVar, 0);
                    iV = l1.t.v(nVar);
                    sVar = (l1.s) nVar;
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(nVar, rVarY);
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
                    dVar.invoke(j0.v.f35424a, nVar, 6);
                    sVar.p(true);
                } else {
                    l1.s sVar3 = (l1.s) nVar;
                    if (!sVar3.F()) {
                        z1.r rVarY2 = d0.n.y(j0.c.J(j0.c.C((z1.r) obj4, CropImageView.DEFAULT_ASPECT_RATIO, b5.f30036d, 1), j0.e1.Max), (d0.d2) obj3, false, 14);
                        t1.d dVar2 = (t1.d) eVar;
                        j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, nVar, 0);
                        iV = l1.t.v(nVar);
                        sVar = (l1.s) nVar;
                        l1.q1 q1VarL2 = sVar.l();
                        z1.r rVarC2 = z1.a.c(nVar, rVarY2);
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
                        dVar2.invoke(j0.v.f35424a, nVar, 6);
                        sVar.p(true);
                    } else {
                        sVar3.W();
                    }
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                k7.l((x8) obj3, (z1.r) obj4, (fz.f) eVar, (l1.n) obj, l1.t.M(7));
                break;
            case 2:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    z1.r rVarL = w2.a0.l(z1.o.f58481a, "Container");
                    float f5 = t6.f31108a;
                    z1.r rVarF = d2.h.f(rVarL, new a0.e(8, new i1.v0((l1.b1) obj4, l1.b1.class, "value", "getValue()Ljava/lang/Object;", 0), (j0.t1) obj3));
                    fz.e eVar2 = (fz.e) eVar;
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, true);
                    iV2 = l1.t.v(nVar2);
                    sVar2 = (l1.s) nVar2;
                    l1.q1 q1VarL3 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(nVar2, rVarF);
                    y2.k.J.getClass();
                    iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, nVar2);
                    l1.t.J(y2.j.f56916e, q1VarL3, nVar2);
                    hVar2 = y2.j.f56918g;
                    if (sVar2.S) {
                        defpackage.e.A(iV2, sVar2, iV2, hVar2);
                    } else {
                        defpackage.e.A(iV2, sVar2, iV2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC3, nVar2);
                    eVar2.invoke(nVar2, 0);
                    sVar2.p(true);
                } else {
                    l1.s sVar4 = (l1.s) nVar2;
                    if (!sVar4.F()) {
                        z1.r rVarL2 = w2.a0.l(z1.o.f58481a, "Container");
                        float f11 = t6.f31108a;
                        z1.r rVarF2 = d2.h.f(rVarL2, new a0.e(8, new i1.v0((l1.b1) obj4, l1.b1.class, "value", "getValue()Ljava/lang/Object;", 0), (j0.t1) obj3));
                        fz.e eVar3 = (fz.e) eVar;
                        w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, true);
                        iV2 = l1.t.v(nVar2);
                        sVar2 = (l1.s) nVar2;
                        l1.q1 q1VarL4 = sVar2.l();
                        z1.r rVarC4 = z1.a.c(nVar2, rVarF2);
                        y2.k.J.getClass();
                        iVar2 = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD2, nVar2);
                        l1.t.J(y2.j.f56916e, q1VarL4, nVar2);
                        hVar2 = y2.j.f56918g;
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iV2))) {
                            defpackage.e.A(iV2, sVar2, iV2, hVar2);
                        }
                        l1.t.J(y2.j.f56915d, rVarC4, nVar2);
                        eVar3.invoke(nVar2, 0);
                        sVar2.p(true);
                    } else {
                        sVar4.W();
                    }
                }
                break;
            case 3:
                ((Number) obj2).intValue();
                se.p.F((c6.l) obj4, (k6.c) obj3, (t1.d) eVar, (l1.n) obj, 385);
                break;
            case 4:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar3;
                if (!sVar5.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar5.W();
                } else {
                    z2.g1.a((AndroidComposeView) obj4, (z2.r0) obj3, (fz.e) eVar, sVar5, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                z2.g1.a((y2.t1) obj4, (z2.r0) obj3, (fz.e) eVar, (l1.n) obj, l1.t.M(1));
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4(Object obj, Object obj2, fz.e eVar, int i11) {
        super(2);
        this.f31341a = i11;
        this.f31342b = obj;
        this.f31343c = obj2;
        this.f31344d = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4(Object obj, Object obj2, fz.e eVar, int i11, int i12) {
        super(2);
        this.f31341a = i12;
        this.f31342b = obj;
        this.f31343c = obj2;
        this.f31344d = eVar;
    }
}
