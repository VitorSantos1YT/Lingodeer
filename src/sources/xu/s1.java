package xu;

import android.content.Context;
import com.lingodeer.data.model.uistate.DailyGoalUiState;
import h1.k7;
import j0.e2;
import l1.b3;
import ys.k2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f56515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f56516d;

    public /* synthetic */ s1(fz.a aVar, fz.c cVar, l1.a1 a1Var) {
        this.f56513a = 1;
        this.f56515c = aVar;
        this.f56514b = cVar;
        this.f56516d = a1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56513a) {
            case 0:
                ((Integer) obj2).getClass();
                a2.g((zu.b0) this.f56515c, (DailyGoalUiState) this.f56516d, (fz.c) this.f56514b, (l1.n) obj, l1.t.M(1));
                break;
            case 1:
                fz.a aVar = (fz.a) this.f56515c;
                fz.c cVar = (fz.c) this.f56514b;
                l1.a1 a1Var = (l1.a1) this.f56516d;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zF = sVar.f(aVar) | sVar.f(cVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new y1(aVar, cVar, a1Var, 0);
                        sVar.o0(objQ);
                    }
                    k7.m((fz.a) objQ, null, false, null, null, null, c.f56362n0, sVar, 805306368, 510);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 2:
                ((Integer) obj2).getClass();
                a2.f((zu.a0) this.f56515c, (DailyGoalUiState) this.f56516d, (fz.c) this.f56514b, (l1.n) obj, l1.t.M(1));
                break;
            case 3:
                l1.b1 b1Var = (l1.b1) this.f56515c;
                b3 b3Var = (b3) this.f56516d;
                l1.b1 b1Var2 = (l1.b1) this.f56514b;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                boolean zT = sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                qy.b0 b0Var = qy.b0.f48488a;
                if (zT) {
                    boolean zF2 = sVar2.f(b1Var);
                    Object objQ2 = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF2 || objQ2 == gVar) {
                        objQ2 = new v(12, b1Var);
                        sVar2.o0(objQ2);
                    }
                    l1.t.c(b0Var, (fz.c) objQ2, sVar2);
                    Boolean bool = (Boolean) b3Var.getValue();
                    bool.booleanValue();
                    boolean zF3 = sVar2.f(b3Var) | sVar2.f(b1Var2);
                    Object objQ3 = sVar2.Q();
                    if (zF3 || objQ3 == gVar) {
                        objQ3 = new xg.b(6, b3Var, b1Var2, null);
                        sVar2.o0(objQ3);
                    }
                    l1.t.f((fz.e) objQ3, bool, sVar2);
                } else {
                    sVar2.W();
                }
                return b0Var;
            default:
                fz.a aVar2 = (fz.a) this.f56515c;
                zs.c cVar2 = (zs.c) this.f56516d;
                Context context = (Context) this.f56514b;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarD = e2.d(oVar, 1.0f);
                    boolean zF4 = sVar3.f(aVar2);
                    Object objQ4 = sVar3.Q();
                    if (zF4 || objQ4 == l1.m.f39353a) {
                        objQ4 = new k2(8, aVar2);
                        sVar3.o0(objQ4);
                    }
                    z1.r rVarO = d0.n.o(rVarD, false, null, (fz.a) objQ4, 15);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode = Long.hashCode(sVar3.T);
                    l1.q1 q1VarL = sVar3.l();
                    z1.r rVarC = z1.a.c(sVar3, rVarO);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar3);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar3);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar3);
                    d0.n.d(new g2.h(cVar2.f59346b), null, e2.p(oVar, (context.getResources().getDisplayMetrics().widthPixels * 5) / 7, (context.getResources().getDisplayMetrics().heightPixels * 5) / 7), w2.i.f54515b, sVar3);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ s1(Object obj, Object obj2, Object obj3, int i11) {
        this.f56513a = i11;
        this.f56515c = obj;
        this.f56516d = obj2;
        this.f56514b = obj3;
    }

    public /* synthetic */ s1(zu.b0 b0Var, DailyGoalUiState dailyGoalUiState, fz.c cVar, int i11, int i12) {
        this.f56513a = i12;
        this.f56515c = b0Var;
        this.f56516d = dailyGoalUiState;
        this.f56514b = cVar;
    }
}
