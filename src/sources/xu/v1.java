package xu;

import com.lingodeer.data.model.uistate.DailyGoalUiState;
import com.yalantis.ucrop.view.CropImageView;
import j0.e2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v1 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DailyGoalUiState f56529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f56530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu.a0 f56531d;

    public /* synthetic */ v1(DailyGoalUiState dailyGoalUiState, fz.c cVar, zu.a0 a0Var, int i11) {
        this.f56528a = i11;
        this.f56529b = dailyGoalUiState;
        this.f56530c = cVar;
        this.f56531d = a0Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f56528a) {
            case 0:
                j0.v Card = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    j0.v1 v1VarD = j0.c.d(CropImageView.DEFAULT_ASPECT_RATIO, 20, 1);
                    DailyGoalUiState dailyGoalUiState = this.f56529b;
                    boolean zH = sVar.h(dailyGoalUiState);
                    fz.c cVar = this.f56530c;
                    boolean zF = zH | sVar.f(cVar);
                    zu.a0 a0Var = this.f56531d;
                    boolean zH2 = zF | sVar.h(a0Var);
                    Object objQ = sVar.Q();
                    if (zH2 || objQ == l1.m.f39353a) {
                        objQ = new x0.j(a0Var, dailyGoalUiState, cVar, 3);
                        sVar.o0(objQ);
                    }
                    ue.f.a(null, null, v1VarD, null, null, null, false, null, (fz.c) objQ, sVar, 384, 507);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            default:
                l0.c item = (l0.c) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarC = j0.c.C(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarC);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                    DailyGoalUiState.Loading loading = DailyGoalUiState.Loading.INSTANCE;
                    DailyGoalUiState dailyGoalUiState2 = this.f56529b;
                    if (kotlin.jvm.internal.m.a(dailyGoalUiState2, loading)) {
                        sVar2.d0(1016941208);
                        sVar2.p(false);
                    } else {
                        if (!(dailyGoalUiState2 instanceof DailyGoalUiState.Success)) {
                            throw nv.p.x(sVar2, -1075575196, false);
                        }
                        sVar2.d0(1017037308);
                        Object objQ2 = sVar2.Q();
                        l1.g gVar = l1.m.f39353a;
                        if (objQ2 == gVar) {
                            objQ2 = l1.t.B(Boolean.FALSE);
                            sVar2.o0(objQ2);
                        }
                        l1.b1 b1Var = (l1.b1) objQ2;
                        if (((Boolean) b1Var.getValue()).booleanValue()) {
                            sVar2.d0(1017226904);
                            int dailyGoalXP = ((DailyGoalUiState.Success) dailyGoalUiState2).getDailyGoalXP();
                            Object objQ3 = sVar2.Q();
                            if (objQ3 == gVar) {
                                objQ3 = new m(25, b1Var);
                                sVar2.o0(objQ3);
                            }
                            fz.a aVar = (fz.a) objQ3;
                            fz.c cVar2 = this.f56530c;
                            boolean zF2 = sVar2.f(cVar2);
                            Object objQ4 = sVar2.Q();
                            if (zF2 || objQ4 == gVar) {
                                objQ4 = new n1(cVar2, 4);
                                sVar2.o0(objQ4);
                            }
                            a2.b(dailyGoalXP, aVar, (fz.c) objQ4, sVar2, 48);
                        } else {
                            sVar2.d0(1012500954);
                        }
                        sVar2.p(false);
                        DailyGoalUiState.Success success = (DailyGoalUiState.Success) dailyGoalUiState2;
                        boolean hasSetupUpTodayGoal = success.getHasSetupUpTodayGoal();
                        Object objQ5 = sVar2.Q();
                        if (objQ5 == gVar) {
                            objQ5 = new m(24, b1Var);
                            sVar2.o0(objQ5);
                        }
                        a2.c(hasSetupUpTodayGoal, (fz.a) objQ5, sVar2, 48);
                        if (success.getHasSetupUpTodayGoal()) {
                            sVar2.d0(1017940803);
                            a2.d(success.getTodayXP(), success.getDailyGoalXP(), sVar2, 0);
                        } else {
                            sVar2.d0(1012500954);
                        }
                        sVar2.p(false);
                        sVar2.p(false);
                    }
                    a2.h(this.f56531d.f59374c, e2.g(e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 21, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 140), sVar2, 48);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
        }
    }
}
