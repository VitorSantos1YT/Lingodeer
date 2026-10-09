package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f30317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0.t1 f30318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1.d f30319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(float f5, j0.t1 t1Var, long j11, t1.d dVar, long j12) {
        super(2);
        this.f30317a = f5;
        this.f30318b = t1Var;
        this.f30319c = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0050  */
    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    /* JADX WARN: Code duplicated, block: B:16:0x0075  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int iV;
        l1.s sVar;
        y2.i iVar;
        y2.h hVar;
        int iV2;
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar2 = (l1.s) nVar;
            if (sVar2.F()) {
                sVar2.W();
            } else {
                float f5 = this.f30317a;
                z1.o oVar = z1.o.f58481a;
                z1.r rVarZ = j0.c.z(j0.e2.b(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, 1), this.f30318b);
                g1 g1Var = g1.f30266b;
                iV = l1.t.v(nVar);
                sVar = (l1.s) nVar;
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(nVar, rVarZ);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                y2.h hVar2 = y2.j.f56917f;
                l1.t.J(hVar2, g1Var, nVar);
                y2.h hVar3 = y2.j.f56916e;
                l1.t.J(hVar3, q1VarL, nVar);
                hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV))) {
                    defpackage.e.A(iV, sVar, iV, hVar);
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, nVar);
                sVar.d0(-1293169671);
                sVar.p(false);
                z1.r rVarB = j0.c.B(w2.a0.l(oVar, "label"), m1.f30637a, 0);
                j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, nVar, 54);
                iV2 = l1.t.v(nVar);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(nVar, rVarB);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar2, a2VarA, nVar);
                l1.t.J(hVar3, q1VarL2, nVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV2))) {
                    defpackage.e.A(iV2, sVar, iV2, hVar);
                }
                l1.t.J(hVar4, rVarC2, nVar);
                this.f30319c.invoke(nVar, 0);
                sVar.p(true);
                sVar.d0(-1293135324);
                sVar.p(false);
                sVar.p(true);
            }
        } else {
            float f11 = this.f30317a;
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarZ2 = j0.c.z(j0.e2.b(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f11, 1), this.f30318b);
            g1 g1Var2 = g1.f30266b;
            iV = l1.t.v(nVar);
            sVar = (l1.s) nVar;
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(nVar, rVarZ2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar5 = y2.j.f56917f;
            l1.t.J(hVar5, g1Var2, nVar);
            y2.h hVar6 = y2.j.f56916e;
            l1.t.J(hVar6, q1VarL3, nVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iV, sVar, iV, hVar);
            } else {
                defpackage.e.A(iV, sVar, iV, hVar);
            }
            y2.h hVar7 = y2.j.f56915d;
            l1.t.J(hVar7, rVarC3, nVar);
            sVar.d0(-1293169671);
            sVar.p(false);
            z1.r rVarB2 = j0.c.B(w2.a0.l(oVar2, "label"), m1.f30637a, 0);
            j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, z1.c.M, nVar, 54);
            iV2 = l1.t.v(nVar);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(nVar, rVarB2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar5, a2VarA2, nVar);
            l1.t.J(hVar6, q1VarL4, nVar);
            if (sVar.S) {
                defpackage.e.A(iV2, sVar, iV2, hVar);
            } else {
                defpackage.e.A(iV2, sVar, iV2, hVar);
            }
            l1.t.J(hVar7, rVarC4, nVar);
            this.f30319c.invoke(nVar, 0);
            sVar.p(true);
            sVar.d0(-1293135324);
            sVar.p(false);
            sVar.p(true);
        }
        return qy.b0.f48488a;
    }
}
