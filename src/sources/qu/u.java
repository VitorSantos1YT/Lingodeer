package qu;

import bp.b1;
import com.lingodeer.R;
import com.lingodeer.data.model.DailyLearnWithLearnTimeHistory;
import com.yalantis.ucrop.view.CropImageView;
import d1.e1;
import fr.j3;
import h1.k7;
import h1.s1;
import h1.v1;
import j0.e2;
import java.util.ArrayList;
import java.util.List;
import l1.q1;
import l1.x0;
import qy.b0;
import rt.sf;
import tg.h0;
import tg.i0;
import w2.q0;
import xu.a2;
import zu.a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f48416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48417c;

    public /* synthetic */ u(int i11, Object obj, Object obj2) {
        this.f48415a = i11;
        this.f48416b = obj;
        this.f48417c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ff  */
    /* JADX WARN: Type inference failed for: r1v83, types: [java.lang.Object, java.util.List] */
    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        long j11;
        int i12;
        int i13;
        int i14;
        switch (this.f48415a) {
            case 0:
                m0.l lVar = (m0.l) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                fz.c cVar = (fz.c) this.f48417c;
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((l1.s) nVar).f(lVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
                    tu.k kVar = (tu.k) ((ArrayList) this.f48416b).get(iIntValue);
                    sVar.d0(148926192);
                    q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
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
                    l1.t.J(y2.j.f56917f, q0VarD, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    if (kVar.f52598e) {
                        sVar.d0(-256134082);
                        j11 = ((s1) sVar.j(v1.f31180a)).f31024f;
                        sVar.p(false);
                    } else {
                        sVar.d0(-256029984);
                        j11 = ((s1) sVar.j(v1.f31180a)).A;
                        sVar.p(false);
                    }
                    z1.r rVarN = e2.n(oVar, su.b.f51783b);
                    float f5 = su.b.f51785d;
                    z1.r rVarB = d2.h.b(rVarN, r0.f.d(f5));
                    boolean zF = sVar.f(cVar) | sVar.f(kVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new b1(26, cVar, kVar);
                        sVar.o0(objQ);
                    }
                    k7.d(d0.n.o(rVarB, false, null, (fz.a) objQ, 15), r0.f.d(f5), null, null, d0.n.a(j11, su.b.f51784c), t1.e.d(813619791, new e1(kVar, 3), sVar), sVar, 196608, 12);
                    if (kVar.f52596c) {
                        sVar.d0(-254136597);
                        d0.n.c(se.k.y(R.drawable.gem_icon, sVar, 0), null, j0.c.x(j0.r.f35391a.a(e2.n(oVar, 18), z1.c.f58465c), -4, -6), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 120);
                        sVar = sVar;
                    } else {
                        sVar.d0(-265130623);
                    }
                    sVar.p(false);
                    sVar.p(true);
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                v3.c InlineContent = (v3.c) obj;
                String it = (String) obj2;
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                kotlin.jvm.internal.m.f(InlineContent, "$this$InlineContent");
                kotlin.jvm.internal.m.f(it, "it");
                if ((iIntValue3 & 129) == 128) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        se.k.b((i0) this.f48416b, ((sg.i) ((c.a) this.f48417c)).f51645a, nVar2, 0);
                    }
                } else {
                    se.k.b((i0) this.f48416b, ((sg.i) ((c.a) this.f48417c)).f51645a, nVar2, 0);
                }
                break;
            case 2:
                int iIntValue4 = ((Number) obj).intValue();
                int iIntValue5 = ((Number) obj2).intValue();
                l1.n nVar3 = (l1.n) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i12 = (((l1.s) nVar3).d(iIntValue4) ? 4 : 2) | iIntValue6;
                } else {
                    i12 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i12 |= ((l1.s) nVar3).d(iIntValue5) ? 32 : 16;
                }
                if ((i12 & 147) == 146) {
                    l1.s sVar3 = (l1.s) nVar3;
                    if (sVar3.F()) {
                        sVar3.W();
                    } else {
                        i0 i0Var = (i0) this.f48416b;
                        fz.c[] cVarArr = (fz.c[]) this.f48417c;
                        h0.b(i0Var, (String) cVarArr[iIntValue4 % cVarArr.length].invoke(Integer.valueOf(iIntValue5)), null, null, 0, false, 0, nVar3, 0);
                    }
                } else {
                    i0 i0Var2 = (i0) this.f48416b;
                    fz.c[] cVarArr2 = (fz.c[]) this.f48417c;
                    h0.b(i0Var2, (String) cVarArr2[iIntValue4 % cVarArr2.length].invoke(Integer.valueOf(iIntValue5)), null, null, 0, false, 0, nVar3, 0);
                }
                break;
            case 3:
                l0.c cVar2 = (l0.c) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                l1.n nVar4 = (l1.n) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i13 = (((l1.s) nVar4).f(cVar2) ? 4 : 2) | iIntValue8;
                } else {
                    i13 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i13 |= ((l1.s) nVar4).d(iIntValue7) ? 32 : 16;
                }
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(i13 & 1, (i13 & 147) != 146)) {
                    qy.l lVar2 = (qy.l) ((List) this.f48416b).get(iIntValue7);
                    sVar4.d0(1610770720);
                    String str = (String) lVar2.f48495a;
                    DailyLearnWithLearnTimeHistory dailyLearnWithLearnTimeHistory = (DailyLearnWithLearnTimeHistory) lVar2.f48496b;
                    a2.e(str, ep.a.e("+", ks.f.a(dailyLearnWithLearnTimeHistory.getLearnTime(), true)), nv.p.j(dailyLearnWithLearnTimeHistory.getXp(), "+"), j3.A(14), n3.s.f43178t, ((s1) sVar4.j(v1.f31180a)).f31036s, iIntValue7 < ((a0) this.f48417c).f59378g.size() - 1, j0.c.C(z1.o.f58481a, 26, CropImageView.DEFAULT_ASPECT_RATIO, 2), sVar4, 12610560);
                    sVar4.p(false);
                } else {
                    sVar4.W();
                }
                break;
            default:
                l0.c cVar3 = (l0.c) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                l1.n nVar5 = (l1.n) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                fz.c cVar4 = (fz.c) this.f48417c;
                if ((iIntValue10 & 6) == 0) {
                    i14 = (((l1.s) nVar5).f(cVar3) ? 4 : 2) | iIntValue10;
                } else {
                    i14 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i14 |= ((l1.s) nVar5).d(iIntValue9) ? 32 : 16;
                }
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(i14 & 1, (i14 & 147) != 146)) {
                    sf sfVar = (sf) this.f48416b.get(iIntValue9);
                    sVar5.d0(1416881239);
                    boolean zF2 = sVar5.f(cVar4);
                    Object objQ2 = sVar5.Q();
                    if (zF2 || objQ2 == l1.m.f39353a) {
                        objQ2 = new x0(cVar4, 2);
                        sVar5.o0(objQ2);
                    }
                    at.b.f(sfVar, (fz.c) objQ2, sVar5, 0);
                    sVar5.p(false);
                } else {
                    sVar5.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
