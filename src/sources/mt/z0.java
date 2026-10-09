package mt;

import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import java.util.List;
import java.util.Set;
import rt.ke;
import rt.oe;
import rt.ue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 implements fz.g {
    public final /* synthetic */ fz.c H;
    public final /* synthetic */ l1.b1 K;
    public final /* synthetic */ l1.g1 L;
    public final /* synthetic */ Object M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f42102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f42103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ke f42104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f42105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f42106f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.e f42107t;

    public /* synthetic */ z0(List list, Set set, ke keVar, int i11, float f5, fz.e eVar, fz.c cVar, Object obj, l1.b1 b1Var, l1.g1 g1Var, int i12) {
        this.f42101a = i12;
        this.f42102b = list;
        this.f42103c = set;
        this.f42104d = keVar;
        this.f42105e = i11;
        this.f42106f = f5;
        this.f42107t = eVar;
        this.H = cVar;
        this.M = obj;
        this.K = b1Var;
        this.L = g1Var;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        switch (this.f42101a) {
            case 0:
                l0.c cVar = (l0.c) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((l1.s) nVar).f(cVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
                    oe oeVar = (oe) this.f42102b.get(iIntValue);
                    sVar.d0(-608897312);
                    boolean zContains = this.f42103c.contains(oeVar.f50220a);
                    boolean zO = b1.o(oeVar, this.f42104d);
                    boolean zH = sVar.h(oeVar) | sVar.d(this.f42105e) | sVar.c(this.f42106f) | sVar.f(this.f42107t);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zH || objQ == gVar) {
                        x0 x0Var = new x0(oeVar, this.f42105e, this.f42106f, this.f42107t, this.K, this.L, 0);
                        sVar.o0(x0Var);
                        objQ = x0Var;
                    }
                    fz.c cVar2 = (fz.c) objQ;
                    fz.c cVar3 = this.H;
                    boolean zF = sVar.f(cVar3) | sVar.h(oeVar);
                    Object objQ2 = sVar.Q();
                    if (zF || objQ2 == gVar) {
                        objQ2 = new y0(cVar3, oeVar, 0);
                        sVar.o0(objQ2);
                    }
                    b1.e(oeVar, zContains, zO, cVar2, (fz.a) objQ2, null, j0.c.d(CropImageView.DEFAULT_ASPECT_RATIO, 8, 1), sVar, 1572864, 32);
                    if (iIntValue != ns.o.A((List) this.M)) {
                        sVar.d0(-608095839);
                        k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 0, 7);
                    } else {
                        sVar.d0(-623777964);
                    }
                    sVar.p(false);
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            default:
                l0.c cVar4 = (l0.c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((l1.s) nVar2).f(cVar4) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((l1.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
                    oe oeVar2 = (oe) this.f42102b.get(iIntValue3);
                    sVar2.d0(-1375078569);
                    boolean zContains2 = this.f42103c.contains(oeVar2.f50220a);
                    boolean zO2 = b1.o(oeVar2, this.f42104d);
                    boolean zH2 = sVar2.h(oeVar2) | sVar2.d(this.f42105e) | sVar2.c(this.f42106f) | sVar2.f(this.f42107t);
                    Object objQ3 = sVar2.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (zH2 || objQ3 == gVar2) {
                        x0 x0Var2 = new x0(oeVar2, this.f42105e, this.f42106f, this.f42107t, this.K, this.L, 1);
                        sVar2.o0(x0Var2);
                        objQ3 = x0Var2;
                    }
                    fz.c cVar5 = (fz.c) objQ3;
                    fz.c cVar6 = this.H;
                    boolean zF2 = sVar2.f(cVar6) | sVar2.h(oeVar2);
                    Object objQ4 = sVar2.Q();
                    if (zF2 || objQ4 == gVar2) {
                        objQ4 = new y0(cVar6, oeVar2, 1);
                        sVar2.o0(objQ4);
                    }
                    float f5 = b1.f41269a;
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarC = j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    float f11 = 8;
                    b1.e(oeVar2, zContains2, zO2, cVar5, (fz.a) objQ4, rVarC, j0.c.d(CropImageView.DEFAULT_ASPECT_RATIO, f11, 1), sVar2, 1769472, 0);
                    if (iIntValue3 != ns.o.A(((ue) this.M).f50513d)) {
                        sVar2.d0(-1373978225);
                        k7.g(j0.c.C(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 6, 6);
                    } else {
                        sVar2.d0(-1395850368);
                    }
                    sVar2.p(false);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
