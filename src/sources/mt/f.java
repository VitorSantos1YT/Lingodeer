package mt;

import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41394c;

    public /* synthetic */ f(String str, l1.b1 b1Var, int i11) {
        this.f41392a = i11;
        this.f41393b = str;
        this.f41394c = b1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41392a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarC = z1.a.c(sVar, oVar);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    l1.b1 b1Var = this.f41394c;
                    String str = (String) b1Var.getValue();
                    String str2 = this.f41393b;
                    boolean z11 = str2 != null;
                    Object objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = new bp.h0(28, b1Var);
                        sVar.o0(objQ);
                    }
                    h1.t6.a(str, (fz.c) objQ, null, false, null, g.f41429g, null, null, null, z11, null, null, null, true, 0, 0, null, null, sVar, 1572912, 12582912, 8249276);
                    if (str2 == null) {
                        sVar.d0(1109735063);
                    } else {
                        sVar.d0(1109735064);
                        ua.b(str2, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((h1.s1) sVar.j(h1.v1.f31180a)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30179l, sVar, 48, 0, 65528);
                    }
                    sVar.p(false);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL2 = sVar2.l();
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarC2 = z1.a.c(sVar2, oVar2);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                    l1.b1 b1Var2 = this.f41394c;
                    String str3 = (String) b1Var2.getValue();
                    String str4 = this.f41393b;
                    boolean z12 = str4 != null;
                    boolean zF = sVar2.f(b1Var2);
                    Object objQ2 = sVar2.Q();
                    if (zF || objQ2 == l1.m.f39353a) {
                        objQ2 = new p(1, b1Var2);
                        sVar2.o0(objQ2);
                    }
                    h1.t6.a(str3, (fz.c) objQ2, null, false, null, g.f41456u, null, null, null, z12, null, null, null, true, 0, 0, null, null, sVar2, 1572864, 12582912, 8249276);
                    if (str4 == null) {
                        sVar2.d0(-682365715);
                    } else {
                        sVar2.d0(-682365714);
                        ua.b(str4, j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar2.j(fc.f30256a)).f30179l, sVar2, 48, 0, 65528);
                    }
                    sVar2.p(false);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
