package xu;

import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g1 implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f56404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f56405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f56406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f56407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f56408f;

    public /* synthetic */ g1(List list, fz.c cVar, fz.c cVar2, fz.c cVar3, List list2, int i11) {
        this.f56403a = i11;
        this.f56404b = list;
        this.f56405c = cVar;
        this.f56406d = cVar2;
        this.f56407e = cVar3;
        this.f56408f = list2;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        switch (this.f56403a) {
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
                    LeaderBoardUser leaderBoardUser = (LeaderBoardUser) this.f56404b.get(iIntValue);
                    sVar.d0(-1300289805);
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
                    Object objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = f1.f56398b;
                        sVar.o0(objQ);
                    }
                    l1.s sVar2 = sVar;
                    h1.b(leaderBoardUser, false, this.f56405c, this.f56406d, this.f56407e, (fz.c) objQ, sVar2, 196656);
                    if (iIntValue < this.f56408f.size()) {
                        sVar2.d0(-1927223146);
                        k7.g(j0.c.C(oVar, 25, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 6, 6);
                        sVar2 = sVar2;
                    } else {
                        sVar2.d0(-1942281923);
                    }
                    sVar2.p(false);
                    sVar2.p(true);
                    sVar2.p(false);
                } else {
                    sVar.W();
                }
                break;
            default:
                l0.c cVar2 = (l0.c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((l1.s) nVar2).f(cVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((l1.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                l1.s sVar3 = (l1.s) nVar2;
                if (sVar3.T(i12 & 1, (i12 & 147) != 146)) {
                    LeaderBoardUser leaderBoardUser2 = (LeaderBoardUser) this.f56404b.get(iIntValue3);
                    sVar3.d0(566309615);
                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    l1.q1 q1VarL2 = sVar3.l();
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarC2 = z1.a.c(sVar3, oVar2);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar3);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar3);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar3);
                    Object objQ2 = sVar3.Q();
                    if (objQ2 == l1.m.f39353a) {
                        objQ2 = f1.f56399c;
                        sVar3.o0(objQ2);
                    }
                    l1.s sVar4 = sVar3;
                    h1.b(leaderBoardUser2, false, this.f56405c, this.f56406d, this.f56407e, (fz.c) objQ2, sVar4, 196656);
                    if (iIntValue3 < this.f56408f.size()) {
                        sVar4.d0(128780862);
                        k7.g(j0.c.C(oVar2, 25, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar4, 6, 6);
                        sVar4 = sVar4;
                    } else {
                        sVar4.d0(112332293);
                    }
                    sVar4.p(false);
                    sVar4.p(true);
                    sVar4.p(false);
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
