package xu;

import com.lingodeer.R;
import com.lingodeer.data.model.DailyLearnWithLearnTimeHistory;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.k7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z1 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zu.a0 f56581b;

    public /* synthetic */ z1(zu.a0 a0Var, int i11) {
        this.f56580a = i11;
        this.f56581b = a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f56580a) {
            case 0:
                l0.c item = (l0.c) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    k7.k(j0.c.C(z1.o.f58481a, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, null, null, d0.n.a(((h1.s1) sVar.j(h1.v1.f31180a)).A, 1), t1.e.d(1633386456, new z1(this.f56581b, 2), sVar), sVar, 196614, 14);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                l0.c item2 = (l0.c) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item2, "$this$item");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    k7.k(j0.c.C(z1.o.f58481a, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), null, null, null, d0.n.a(((h1.s1) sVar2.j(h1.v1.f31180a)).A, 1), t1.e.d(-859444970, new z1(this.f56581b, 3), sVar2), sVar2, 196614, 14);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 2:
                j0.v OutlinedCard = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strE0 = ub.a.e0(sVar3, R.string.total);
                    zu.a0 a0Var = this.f56581b;
                    a2.e(strE0, ks.f.a(a0Var.f59373b, true), String.valueOf(a0Var.f59372a), j3.A(14), n3.s.L, ((h1.s1) sVar3.j(h1.v1.f31180a)).f31034q, false, j0.c.C(z1.o.f58481a, 10, CropImageView.DEFAULT_ASPECT_RATIO, 2), sVar3, 14183424);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            default:
                j0.v OutlinedCard2 = (j0.v) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard2, "$this$OutlinedCard");
                ?? r9 = 1;
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String strE1 = ub.a.e0(sVar4, R.string.weekly_xp);
                    zu.a0 a0Var2 = this.f56581b;
                    String strA = ks.f.a(a0Var2.f59376e, true);
                    String strValueOf = String.valueOf(a0Var2.f59375d);
                    long jA = j3.A(15);
                    n3.s sVar5 = n3.s.L;
                    long j11 = ((h1.s1) sVar4.j(h1.v1.f31180a)).f31024f;
                    float f5 = 10;
                    z1.o oVar = z1.o.f58481a;
                    a2.e(strE1, strA, strValueOf, jA, sVar5, j11, true, j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), sVar4, 14183424);
                    l1.s sVar6 = sVar4;
                    int i11 = 0;
                    for (Object obj4 : a0Var2.f59377f) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        qy.l lVar = (qy.l) obj4;
                        String str = (String) lVar.f48495a;
                        DailyLearnWithLearnTimeHistory dailyLearnWithLearnTimeHistory = (DailyLearnWithLearnTimeHistory) lVar.f48496b;
                        float f11 = f5;
                        l1.s sVar7 = sVar6;
                        a2.e(str, ep.a.e("+", ks.f.a(dailyLearnWithLearnTimeHistory.getLearnTime(), r9)), nv.p.j(dailyLearnWithLearnTimeHistory.getXp(), "+"), j3.A(15), n3.s.H, ((h1.s1) sVar6.j(h1.v1.f31180a)).f31034q, i11 < a0Var2.f59378g.size() - r9 ? r9 : 0, j0.c.C(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), sVar7, 12610560);
                        f5 = f11;
                        sVar6 = sVar7;
                        i11 = i12;
                        r9 = 1;
                    }
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
        }
    }
}
