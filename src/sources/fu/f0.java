package fu;

import com.yalantis.ucrop.view.CropImageView;
import dt.h2;
import h1.k7;
import h1.s1;
import h1.v1;
import j0.a2;
import j0.b2;
import j0.e2;
import j0.i1;
import j0.z1;
import l1.b1;
import l1.c3;
import l1.q1;
import mt.n4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f0 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f28091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f28092c;

    public /* synthetic */ f0(int i11, fz.a aVar, b1 b1Var) {
        this.f28090a = i11;
        this.f28091b = aVar;
        this.f28092c = b1Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f28090a;
        fz.a aVar = this.f28091b;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.g gVar = l1.m.f39353a;
        b1 b1Var = this.f28092c;
        switch (i11) {
            case 0:
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                l1.n nVar = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                z1.o oVar = z1.o.f58481a;
                z1.r rVarE = j0.c.E(j0.c.C(oVar, 30, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 36, 7);
                a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, nVar, 0);
                l1.s sVar = (l1.s) nVar;
                int iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(nVar, rVarE);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA, nVar);
                l1.t.J(y2.j.f56916e, q1VarL, nVar);
                y2.h hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, nVar);
                z1.r rVarG = e2.g(oVar, 45);
                r0.e eVarD = r0.f.d(22);
                c3 c3Var = v1.f31180a;
                l1.s sVar2 = (l1.s) nVar;
                d0.v vVarA = d0.n.a(((s1) sVar2.j(c3Var)).f31017a, (float) 1.5d);
                j0.v1 v1Var = h1.j0.f30447a;
                h1.i0 i0VarF = h1.j0.f(0L, ((s1) sVar2.j(c3Var)).f31017a, nVar, 13);
                Object objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = new h2(11, b1Var);
                    sVar.o0(objQ);
                }
                k7.i((fz.a) objQ, rVarG, false, eVarD, i0VarF, vVarA, null, a.f28052i, nVar, 805306422, 420);
                j0.c.g(nVar, e2.s(oVar, 24));
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                iu.k.e(this.f28091b, new i1(1.0f, true), false, 0L, null, a.f28053j, nVar, 196608, 28);
                sVar.p(true);
                break;
            case 1:
                b2 AppTopAppBar = (b2) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppTopAppBar, "$this$AppTopAppBar");
                l1.s sVar3 = (l1.s) nVar2;
                if (!sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    sVar3.W();
                } else {
                    Object objQ2 = sVar3.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new mt.q(15, b1Var);
                        sVar3.o0(objQ2);
                    }
                    k7.h((fz.a) objQ2, null, false, null, mt.g.f41460w, sVar3, 196614, 30);
                    boolean zF = sVar3.f(aVar);
                    Object objQ3 = sVar3.Q();
                    if (zF || objQ3 == gVar) {
                        objQ3 = new jr.m(23, aVar);
                        sVar3.o0(objQ3);
                    }
                    k7.h((fz.a) objQ3, null, false, null, mt.g.f41462x, sVar3, 196608, 30);
                }
                break;
            case 2:
                j0.v ModalBottomSheet = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                l1.s sVar4 = (l1.s) nVar3;
                if (!sVar4.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    sVar4.W();
                } else {
                    boolean zF2 = sVar4.f(aVar);
                    Object objQ4 = sVar4.Q();
                    if (zF2 || objQ4 == gVar) {
                        objQ4 = new mt.e2(10, aVar);
                        sVar4.o0(objQ4);
                    }
                    fz.a aVar2 = (fz.a) objQ4;
                    Object objQ5 = sVar4.Q();
                    if (objQ5 == gVar) {
                        objQ5 = new n4(3, b1Var);
                        sVar4.o0(objQ5);
                    }
                    ys.a.e(aVar2, (fz.a) objQ5, sVar4, 390);
                }
                break;
            default:
                j0.v ModalBottomSheet2 = (j0.v) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet2, "$this$ModalBottomSheet");
                l1.s sVar5 = (l1.s) nVar4;
                if (!sVar5.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    sVar5.W();
                } else {
                    boolean zF3 = sVar5.f(aVar);
                    Object objQ6 = sVar5.Q();
                    if (zF3 || objQ6 == gVar) {
                        objQ6 = new mt.e2(26, aVar);
                        sVar5.o0(objQ6);
                    }
                    fz.a aVar3 = (fz.a) objQ6;
                    Object objQ7 = sVar5.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new n4(13, b1Var);
                        sVar5.o0(objQ7);
                    }
                    ys.a.e(aVar3, (fz.a) objQ7, sVar5, 390);
                }
                break;
        }
        return b0Var;
    }
}
