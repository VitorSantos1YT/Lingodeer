package bt;

import android.content.res.Resources;
import com.lingodeer.data.model.CourseUiState;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import java.util.List;
import rt.ae;
import rt.h9;
import rt.l9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g6 implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy.e f5442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5444f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5445t;

    public /* synthetic */ g6(CourseUiState.Success success, l0.w wVar, fz.c cVar, fz.a aVar, fz.a aVar2, fz.c cVar2, fz.c cVar3, fz.a aVar3, int i11) {
        this.f5439a = 9;
        this.f5444f = success;
        this.H = wVar;
        this.f5442d = cVar;
        this.f5441c = aVar;
        this.K = aVar2;
        this.f5440b = cVar2;
        this.f5443e = cVar3;
        this.f5445t = aVar3;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5439a) {
            case 0:
                CourseWord courseWord = (CourseWord) this.f5444f;
                ht.l lVar = (ht.l) this.H;
                List list = (List) this.f5441c;
                ht.q qVar = (ht.q) this.K;
                ht.o oVar = (ht.o) this.f5440b;
                fz.c cVar = (fz.c) this.f5442d;
                fz.e eVar = (fz.e) this.f5443e;
                l1.b3 b3Var = (l1.b3) this.f5445t;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) b3Var.getValue()).booleanValue();
                    boolean zF = sVar.f(cVar) | sVar.f(eVar);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF || objQ == gVar) {
                        objQ = new au.d1(23, cVar, eVar);
                        sVar.o0(objQ);
                    }
                    fz.c cVar2 = (fz.c) objQ;
                    boolean zF2 = sVar.f(eVar);
                    Object objQ2 = sVar.Q();
                    if (zF2 || objQ2 == gVar) {
                        objQ2 = new b0.p1(15, eVar);
                        sVar.o0(objQ2);
                    }
                    b.M(courseWord, zBooleanValue, lVar, list, qVar, oVar, cVar2, (fz.c) objQ2, sVar, 0);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                ht.o oVar2 = (ht.o) this.f5440b;
                List list2 = (List) this.f5441c;
                fz.c cVar3 = (fz.c) this.f5442d;
                fz.e eVar2 = (fz.e) this.f5443e;
                l1.b1 b1Var = (l1.b1) this.H;
                CourseWord courseWord2 = (CourseWord) this.f5444f;
                l1.b3 b3Var2 = (l1.b3) this.f5445t;
                l1.b1 b1Var2 = (l1.b1) this.K;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zBooleanValue2 = ((Boolean) b3Var2.getValue()).booleanValue();
                    boolean z11 = oVar2.f33766o;
                    long jB = ((ht.l) b1Var.getValue()).b();
                    boolean z12 = oVar2.f33759g;
                    boolean z13 = oVar2.f33760h;
                    boolean zF3 = sVar2.f(cVar3) | sVar2.f(oVar2) | sVar2.f(eVar2) | sVar2.f(b1Var) | sVar2.h(courseWord2);
                    Object objQ3 = sVar2.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (zF3 || objQ3 == gVar2) {
                        g7 g7Var = new g7(cVar3, oVar2, courseWord2, b1Var, b1Var2, eVar2, 0);
                        b1Var2 = b1Var2;
                        eVar2 = eVar2;
                        sVar2.o0(g7Var);
                        objQ3 = g7Var;
                    }
                    fz.c cVar4 = (fz.c) objQ3;
                    boolean zF4 = sVar2.f(oVar2) | sVar2.f(eVar2) | sVar2.f(b1Var) | sVar2.h(courseWord2);
                    Object objQ4 = sVar2.Q();
                    if (zF4 || objQ4 == gVar2) {
                        b1.a aVar = new b1.a(courseWord2, b1Var, oVar2, b1Var2, eVar2, 3);
                        sVar2.o0(aVar);
                        objQ4 = aVar;
                    }
                    b.S(list2, zBooleanValue2, false, z11, z12, z13, jB, cVar4, (fz.c) objQ4, sVar2, 384);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 2:
                CourseUiState courseUiState = (CourseUiState) this.f5444f;
                l0.w wVar = (l0.w) this.H;
                fz.c cVar5 = (fz.c) this.f5442d;
                fz.a aVar2 = (fz.a) this.f5441c;
                fz.a aVar3 = (fz.a) this.K;
                fz.c cVar6 = (fz.c) this.f5440b;
                fz.c cVar7 = (fz.c) this.f5443e;
                fz.a aVar4 = (fz.a) this.f5445t;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ys.a3.i((CourseUiState.Success) courseUiState, wVar, cVar5, aVar2, aVar3, cVar6, cVar7, aVar4, sVar3, 0);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 3:
                ni.m mVar = (ni.m) this.f5444f;
                gp.l1 l1Var = (gp.l1) this.H;
                ur.a aVar5 = (ur.a) this.f5441c;
                f.n nVar4 = (f.n) this.K;
                fz.a aVar6 = (fz.a) this.f5440b;
                fz.a aVar7 = (fz.a) this.f5442d;
                l1.b1 b1Var3 = (l1.b1) this.f5443e;
                l1.b1 b1Var4 = (l1.b1) this.f5445t;
                l1.n nVar5 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar5;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    float f5 = ((v3.f) b1Var3.getValue()).f53489a;
                    Resources resources = (Resources) b1Var4.getValue();
                    boolean zH = sVar4.h(aVar5) | sVar4.h(mVar) | sVar4.h(nVar4);
                    Object objQ5 = sVar4.Q();
                    if (zH || objQ5 == l1.m.f39353a) {
                        objQ5 = new fu.j0(aVar5, mVar, nVar4, 2);
                        sVar4.o0(objQ5);
                    }
                    gr.n.g(f5, resources, mVar, l1Var, (fz.c) objQ5, aVar6, aVar7, sVar4, 0);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 4:
                ((Integer) obj2).getClass();
                mt.y3.t((ae) this.f5444f, (fz.a) this.H, (fz.c) this.f5442d, (fz.a) this.f5441c, (fz.c) this.K, (fz.e) this.f5443e, (fz.a) this.f5440b, (fz.a) this.f5445t, (l1.n) obj, l1.t.M(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                nv.a.g((sv.h) this.f5444f, (qv.c) this.H, (fz.a) this.f5441c, (fz.a) this.K, (fz.a) this.f5440b, (fz.a) this.f5443e, (fz.c) this.f5442d, (fz.c) this.f5445t, (l1.n) obj, l1.t.M(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                xu.r.a((String) this.f5444f, (String) this.H, (String) this.f5441c, (String) this.K, (String) this.f5440b, (fz.a) this.f5442d, (fz.a) this.f5443e, (z1.r) this.f5445t, (l1.n) obj, l1.t.M(1769473));
                break;
            case 7:
                ((Integer) obj2).getClass();
                xu.r.e((fz.a) this.f5444f, (fz.a) this.H, (fz.a) this.f5441c, (fz.a) this.K, (fz.a) this.f5440b, (fz.a) this.f5442d, (fz.a) this.f5443e, (zu.q) this.f5445t, (l1.n) obj, l1.t.M(16777217));
                break;
            case 8:
                CourseTestFinishSummaryUiState courseTestFinishSummaryUiState = (CourseTestFinishSummaryUiState) this.f5444f;
                l9 l9Var = (l9) this.H;
                fz.a aVar8 = (fz.a) this.f5441c;
                fz.e eVar3 = (fz.e) this.f5443e;
                fz.e eVar4 = (fz.e) this.K;
                fz.e eVar5 = (fz.e) this.f5440b;
                fz.f fVar = (fz.f) this.f5442d;
                l1.b3 b3Var3 = (l1.b3) this.f5445t;
                l1.n nVar6 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar6;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    h9 h9Var = (h9) b3Var3.getValue();
                    z1.r rVarD = j0.e2.d(j0.c.v(z1.o.f58481a), 1.0f);
                    boolean zH2 = sVar5.h(l9Var);
                    Object objQ6 = sVar5.Q();
                    l1.g gVar3 = l1.m.f39353a;
                    if (zH2 || objQ6 == gVar3) {
                        objQ6 = new mt.g4(l9Var, 1);
                        sVar5.o0(objQ6);
                    }
                    fz.a aVar9 = (fz.a) objQ6;
                    boolean zF5 = sVar5.f(aVar8);
                    Object objQ7 = sVar5.Q();
                    if (zF5 || objQ7 == gVar3) {
                        objQ7 = new xu.r1(22, aVar8);
                        sVar5.o0(objQ7);
                    }
                    ys.p1.a(courseTestFinishSummaryUiState, h9Var, rVarD, aVar9, (fz.a) objQ7, eVar3, eVar4, eVar5, fVar, sVar5, 0);
                } else {
                    sVar5.W();
                }
                return qy.b0.f48488a;
            default:
                ((Integer) obj2).getClass();
                ys.a3.i((CourseUiState.Success) this.f5444f, (l0.w) this.H, (fz.c) this.f5442d, (fz.a) this.f5441c, (fz.a) this.K, (fz.c) this.f5440b, (fz.c) this.f5443e, (fz.a) this.f5445t, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ g6(CourseUiState courseUiState, l0.w wVar, fz.c cVar, fz.a aVar, fz.a aVar2, fz.c cVar2, fz.c cVar3, fz.a aVar3) {
        this.f5439a = 2;
        this.f5444f = courseUiState;
        this.H = wVar;
        this.f5442d = cVar;
        this.f5441c = aVar;
        this.K = aVar2;
        this.f5440b = cVar2;
        this.f5443e = cVar3;
        this.f5445t = aVar3;
    }

    public /* synthetic */ g6(CourseTestFinishSummaryUiState courseTestFinishSummaryUiState, l9 l9Var, fz.a aVar, fz.e eVar, fz.e eVar2, fz.e eVar3, fz.f fVar, l1.b1 b1Var) {
        this.f5439a = 8;
        this.f5444f = courseTestFinishSummaryUiState;
        this.H = l9Var;
        this.f5441c = aVar;
        this.f5443e = eVar;
        this.K = eVar2;
        this.f5440b = eVar3;
        this.f5442d = fVar;
        this.f5445t = b1Var;
    }

    public /* synthetic */ g6(ht.o oVar, List list, fz.c cVar, fz.e eVar, l1.b1 b1Var, CourseWord courseWord, l1.b3 b3Var, l1.b1 b1Var2) {
        this.f5439a = 1;
        this.f5440b = oVar;
        this.f5441c = list;
        this.f5442d = cVar;
        this.f5443e = eVar;
        this.H = b1Var;
        this.f5444f = courseWord;
        this.f5445t = b3Var;
        this.K = b1Var2;
    }

    public /* synthetic */ g6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, fz.a aVar, fz.a aVar2, Object obj6, int i11, int i12) {
        this.f5439a = i12;
        this.f5444f = obj;
        this.H = obj2;
        this.f5441c = obj3;
        this.K = obj4;
        this.f5440b = obj5;
        this.f5442d = aVar;
        this.f5443e = aVar2;
        this.f5445t = obj6;
    }

    public /* synthetic */ g6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, qy.e eVar, Object obj6, l1.b3 b3Var, int i11) {
        this.f5439a = i11;
        this.f5444f = obj;
        this.H = obj2;
        this.f5441c = obj3;
        this.K = obj4;
        this.f5440b = obj5;
        this.f5442d = eVar;
        this.f5443e = obj6;
        this.f5445t = b3Var;
    }

    public /* synthetic */ g6(ae aeVar, fz.a aVar, fz.c cVar, fz.a aVar2, fz.c cVar2, fz.e eVar, fz.a aVar3, fz.a aVar4, int i11) {
        this.f5439a = 4;
        this.f5444f = aeVar;
        this.H = aVar;
        this.f5442d = cVar;
        this.f5441c = aVar2;
        this.K = cVar2;
        this.f5443e = eVar;
        this.f5440b = aVar3;
        this.f5445t = aVar4;
    }

    public /* synthetic */ g6(sv.h hVar, qv.c cVar, fz.a aVar, fz.a aVar2, fz.a aVar3, fz.a aVar4, fz.c cVar2, fz.c cVar3, int i11) {
        this.f5439a = 5;
        this.f5444f = hVar;
        this.H = cVar;
        this.f5441c = aVar;
        this.K = aVar2;
        this.f5440b = aVar3;
        this.f5443e = aVar4;
        this.f5442d = cVar2;
        this.f5445t = cVar3;
    }
}
