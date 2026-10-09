package ys;

import com.lingodeer.R;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseLessonPracticeType;
import com.lingodeer.data.model.uistate.CourseLessonClicked;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f57994b;

    public /* synthetic */ f(fz.c cVar, int i11) {
        this.f57993a = i11;
        this.f57994b = cVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57993a) {
            case 0:
                CourseLesson lesson = (CourseLesson) obj;
                CourseLessonPracticeType practiceType = (CourseLessonPracticeType) obj2;
                kotlin.jvm.internal.m.f(lesson, "lesson");
                kotlin.jvm.internal.m.f(practiceType, "practiceType");
                this.f57994b.invoke(new CourseLessonClicked(lesson, practiceType));
                break;
            default:
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
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, uVarA, sVar);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar);
                    ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson12_4), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30178k, sVar, 0, 0, 65534);
                    float f5 = 16;
                    j0.g gVarG = j0.i.g(f5);
                    z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    j0.a2 a2VarA = j0.z1.a(gVarG, z1.c.L, sVar, 6);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, rVarE);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, a2VarA, sVar);
                    l1.t.J(hVar2, q1VarL2, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.i1 i1Var = new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    fz.c cVar = this.f57994b;
                    boolean zF = sVar.f(cVar);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF || objQ == gVar) {
                        objQ = new nv.o(cVar, 21);
                        sVar.o0(objQ);
                    }
                    nv.a.l(390, (fz.a) objQ, "싸", "ssa", sVar, i1Var);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.i1 i1Var2 = new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean zF2 = sVar.f(cVar);
                    Object objQ2 = sVar.Q();
                    if (zF2 || objQ2 == gVar) {
                        objQ2 = new nv.o(cVar, 14);
                        sVar.o0(objQ2);
                    }
                    nv.a.l(390, (fz.a) objQ2, "쏘", "sso", sVar, i1Var2);
                    sVar.p(true);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
