package bt;

import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.ua;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g4 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5436c;

    public /* synthetic */ g4(l1.b1 b1Var, l1.b1 b1Var2, int i11) {
        this.f5434a = i11;
        this.f5435b = b1Var;
        this.f5436c = b1Var2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        y2.i iVar;
        switch (this.f5434a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list = (List) this.f5435b.getValue();
                    Object objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = new br.b(12);
                        sVar.o0(objQ);
                    }
                    b.y(list, this.f5436c, false, null, null, false, null, 0, false, null, (fz.c) objQ, sVar, 100860288, 6, 728);
                } else {
                    sVar.W();
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarC = z1.a.c(sVar2, oVar);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, uVarA, sVar2);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar2);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar2);
                    float f5 = 52;
                    z1.r rVarI = j0.e2.i(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    Object objQ2 = sVar2.Q();
                    l1.b1 b1Var = this.f5435b;
                    l1.b1 b1Var2 = this.f5436c;
                    l1.g gVar = l1.m.f39353a;
                    if (objQ2 == gVar) {
                        objQ2 = new ch.h0(b1Var, b1Var2, 11);
                        sVar2.o0(objQ2);
                    }
                    z1.r rVarO = d0.n.o(rVarI, false, null, (fz.a) objQ2, 15);
                    z1.i iVar3 = z1.c.M;
                    j0.b bVar = j0.i.f35303a;
                    j0.a2 a2VarA = j0.z1.a(bVar, iVar3, sVar2, 48);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarO);
                    sVar2.h0();
                    if (sVar2.S) {
                        iVar = iVar2;
                        sVar2.k(iVar);
                    } else {
                        iVar = iVar2;
                        sVar2.r0();
                    }
                    l1.t.J(hVar, a2VarA, sVar2);
                    l1.t.J(hVar2, q1VarL2, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar2);
                    String strQ0 = oz.x.q0(ub.a.e0(sVar2, R.string.reset_s_learning_progress), "%s", tv.a.l(tv.a.n(((Number) sVar2.j(ju.f.f37370d)).intValue()), sVar2));
                    l1.c3 c3Var = fc.f30256a;
                    y2.i iVar4 = iVar;
                    ua.b(strQ0, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar2.j(c3Var)).f30175h, sVar2, 0, 0, 65534);
                    sVar2.p(true);
                    h1.k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 0, 7);
                    z1.r rVarI2 = j0.e2.i(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    Object objQ3 = sVar2.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new ch.h0(b1Var, b1Var2, 10);
                        sVar2.o0(objQ3);
                    }
                    z1.r rVarO2 = d0.n.o(rVarI2, false, null, (fz.a) objQ3, 15);
                    j0.a2 a2VarA2 = j0.z1.a(bVar, iVar3, sVar2, 48);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL3 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(sVar2, rVarO2);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar4);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar, a2VarA2, sVar2);
                    l1.t.J(hVar2, q1VarL3, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
                    }
                    l1.t.J(hVar4, rVarC3, sVar2);
                    ua.b(ub.a.e0(sVar2, R.string.reset_all_language_s_progress), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar2.j(c3Var)).f30175h, sVar2, 0, 0, 65534);
                    sVar2.p(true);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
