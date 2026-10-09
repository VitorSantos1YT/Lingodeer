package bt;

import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CoursePracticeType;
import rt.gc;
import rt.h9;
import rt.rc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5453a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5458f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5459t;

    public /* synthetic */ h(ou.c cVar, boolean z11, ys.d0 d0Var, l1.b1 b1Var, rz.b0 b0Var, vt.n0 n0Var, l1.a1 a1Var, CourseCharacter courseCharacter, l1.b1 b1Var2, l1.b1 b1Var3) {
        this.f5458f = cVar;
        this.f5454b = z11;
        this.f5459t = d0Var;
        this.f5455c = b1Var;
        this.H = b0Var;
        this.K = n0Var;
        this.L = a1Var;
        this.M = courseCharacter;
        this.f5456d = b1Var2;
        this.f5457e = b1Var3;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f5453a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj3 = this.M;
        Object obj4 = this.L;
        Object obj5 = this.K;
        Object obj6 = this.H;
        Object obj7 = this.f5459t;
        Object obj8 = this.f5458f;
        boolean z11 = this.f5454b;
        switch (i11) {
            case 0:
                ou.c cVar = (ou.c) obj8;
                ys.d0 d0Var = (ys.d0) obj7;
                rz.b0 b0Var2 = (rz.b0) obj6;
                vt.n0 n0Var = (vt.n0) obj5;
                l1.a1 a1Var = (l1.a1) obj4;
                CourseCharacter courseCharacter = (CourseCharacter) obj3;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
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
                    int iL = ((l1.h1) a1Var).l();
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.i1 i1Var = new j0.i1(1.0f, true);
                    boolean zG = sVar.g(z11) | sVar.h(d0Var);
                    l1.b1 b1Var = this.f5455c;
                    boolean zF = zG | sVar.f(b1Var);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF || objQ == gVar) {
                        objQ = new m(z11, d0Var, b1Var, 1);
                        sVar.o0(objQ);
                    }
                    fz.a aVar = (fz.a) objQ;
                    t1.d dVarD = t1.e.d(648140253, new bp.f0(d0Var, courseCharacter, this.f5456d, this.f5457e, b0Var2, n0Var, 1), sVar);
                    t1.d dVarD2 = t1.e.d(750617246, new androidx.lifecycle.viewmodel.compose.a(courseCharacter, 8), sVar);
                    boolean zH = sVar.h(b0Var2) | sVar.h(n0Var);
                    Object objQ2 = sVar.Q();
                    if (zH || objQ2 == gVar) {
                        objQ2 = new aj.c(b0Var2, n0Var, a1Var, 12);
                        sVar.o0(objQ2);
                    }
                    ou.b bVar = ou.c.Companion;
                    b.e0(cVar, iL, i1Var, aVar, dVarD, dVarD2, (fz.c) objQ2, sVar, 221192);
                    sVar.p(true);
                }
                break;
            default:
                gc gcVar = (gc) obj8;
                rc rcVar = (rc) obj7;
                CoursePracticeType coursePracticeType = (CoursePracticeType) obj6;
                h9 h9Var = (h9) obj5;
                fz.a aVar2 = (fz.a) obj4;
                l1.b1 b1Var2 = (l1.b1) obj3;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    a0.j0.d(!z11, null, a0.f1.e(b0.e.r(120, 0, null, 6), 2).a(a0.f1.d(b0.e.r(AchievementLevelType.DAY_STREAK_LV_8, 0, null, 6), 14)), a0.f1.f(b0.e.r(90, 0, null, 6), 2).a(a0.f1.l(b0.e.r(AchievementLevelType.DAY_STREAK_LV_8, 0, null, 6), 14)), null, t1.e.d(1478876245, new dt.w2(gcVar, rcVar, this.f5455c, this.f5456d, coursePracticeType, h9Var, aVar2, this.f5457e, b1Var2), sVar2), sVar2, 200064, 18);
                }
                break;
        }
        return b0Var;
    }

    public /* synthetic */ h(boolean z11, gc gcVar, rc rcVar, l1.b1 b1Var, l1.b1 b1Var2, CoursePracticeType coursePracticeType, h9 h9Var, fz.a aVar, l1.b1 b1Var3, l1.b1 b1Var4) {
        this.f5454b = z11;
        this.f5458f = gcVar;
        this.f5459t = rcVar;
        this.f5455c = b1Var;
        this.f5456d = b1Var2;
        this.H = coursePracticeType;
        this.K = h9Var;
        this.L = aVar;
        this.f5457e = b1Var3;
        this.M = b1Var4;
    }
}
