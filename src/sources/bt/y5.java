package bt;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y5 implements fz.e {
    public final /* synthetic */ fz.e H;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ rz.b0 L;
    public final /* synthetic */ jt.q1 M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f6223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6225f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ht.o f6226t;

    public /* synthetic */ y5(v3.m mVar, boolean z11, CourseSentence courseSentence, l1.b1 b1Var, l1.b1 b1Var2, ht.o oVar, fz.e eVar, boolean z12, rz.b0 b0Var, jt.q1 q1Var, int i11) {
        this.f6220a = i11;
        this.f6221b = mVar;
        this.f6222c = z11;
        this.f6223d = courseSentence;
        this.f6224e = b1Var;
        this.f6225f = b1Var2;
        this.f6226t = oVar;
        this.H = eVar;
        this.K = z12;
        this.L = b0Var;
        this.M = q1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        r0.e eVarE;
        switch (this.f6220a) {
            case 0:
                v3.m mVar = (v3.m) this.f6221b;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
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
                    l1.t.J(y2.j.f56917f, a2VarA, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-938879585, new y5(mVar, this.f6222c, this.f6223d, this.f6224e, this.f6225f, this.f6226t, this.H, this.K, this.L, this.M, 1), sVar), sVar, 56);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.c.g(sVar, new j0.i1(1.0f, true));
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                v3.m mVar2 = (v3.m) this.f6221b;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (mVar2 == v3.m.Rtl) {
                        float f5 = 12;
                        eVarE = r0.f.e(f5, 0, f5, f5);
                    } else {
                        float f11 = 12;
                        eVarE = r0.f.e(0, f11, f11, f11);
                    }
                    l1.c3 c3Var = h1.v1.f31180a;
                    long j11 = ((h1.s1) sVar2.j(c3Var)).f31033p;
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarH = d0.n.h(oVar, j11, eVarE);
                    d0.v vVarA = d0.n.a(((h1.s1) sVar2.j(c3Var)).A, 2);
                    z1.r rVarA = j0.c.A(d0.n.k(vVarA.f22811a, vVarA.f22812b, eVarE, rVarH), 16);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarA);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                    boolean z11 = this.f6222c;
                    CourseSentence courseSentence = this.f6223d;
                    List<CourseWord> displayCourseWords = z11 ? courseSentence.getDisplayCourseWords() : (List) this.f6224e.getValue();
                    l1.d0 d0Var = ua.f31167a;
                    j3.y0 y0VarA = j3.y0.a((j3.y0) sVar2.j(d0Var), 0L, ct.c.c(sVar2), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
                    boolean z12 = this.f6225f.getValue() instanceof ht.f;
                    ht.o oVar2 = this.f6226t;
                    boolean z13 = z11 || !oVar2.f33757e;
                    boolean z14 = !oVar2.f33757e;
                    j0.b bVar = j0.i.f35303a;
                    fz.e eVar = this.H;
                    boolean zF = sVar2.f(eVar) | sVar2.h(courseSentence);
                    Object objQ = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF || objQ == gVar) {
                        objQ = new m0(eVar, courseSentence, 13);
                        sVar2.o0(objQ);
                    }
                    fz.a aVar = (fz.a) objQ;
                    boolean z15 = this.K;
                    boolean zG = sVar2.g(z15);
                    rz.b0 b0Var = this.L;
                    boolean zH = zG | sVar2.h(b0Var);
                    jt.q1 q1Var = this.M;
                    boolean zH2 = zH | sVar2.h(q1Var);
                    Object objQ2 = sVar2.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new n1(z15, b0Var, q1Var, 2);
                        sVar2.o0(objQ2);
                    }
                    fz.c cVar = (fz.c) objQ2;
                    boolean zF2 = sVar2.f(eVar);
                    Object objQ3 = sVar2.Q();
                    if (zF2 || objQ3 == gVar) {
                        objQ3 = new b0.p1(14, eVar);
                        sVar2.o0(objQ3);
                    }
                    dt.d4.a(displayCourseWords, null, null, z14, false, y0VarA, bVar, z12, z13, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, aVar, cVar, (fz.c) objQ3, sVar2, 1572864, 0, 0, 523798);
                    ua.b(courseSentence.getTranslation(), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(d0Var), 0L, ct.c.e(sVar2), n3.s.f43178t, null, null, 0L, null, null, 0, 4, 0L, null, 16711673), sVar2, 48, 0, 65532);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
            default:
                CourseSentence courseSentence2 = (CourseSentence) this.f6221b;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    v3.m mVarG = dt.d4.g(sVar3);
                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
                    int iHashCode3 = Long.hashCode(sVar3.T);
                    l1.q1 q1VarL3 = sVar3.l();
                    z1.r rVarC3 = z1.a.c(sVar3, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar3);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar3);
                    l1.t.J(y2.j.f56916e, q1VarL3, sVar3);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar3);
                    }
                    l1.t.J(y2.j.f56915d, rVarC3, sVar3);
                    l1.c3 c3Var2 = z2.g1.f58552n;
                    l1.w1 w1VarA = c3Var2.a(dt.d4.g(sVar3));
                    boolean z16 = this.f6222c;
                    CourseSentence courseSentence3 = this.f6223d;
                    l1.b1 b1Var = this.f6224e;
                    l1.b1 b1Var2 = this.f6225f;
                    ht.o oVar3 = this.f6226t;
                    fz.e eVar2 = this.H;
                    boolean z17 = this.K;
                    rz.b0 b0Var2 = this.L;
                    jt.q1 q1Var2 = this.M;
                    l1.t.a(w1VarA, t1.e.d(327650115, new y5(mVarG, z16, courseSentence3, b1Var, b1Var2, oVar3, eVar2, z17, b0Var2, q1Var2, 0), sVar3), sVar3, 56);
                    l1.t.a(c3Var2.a(dt.d4.g(sVar3)), t1.e.d(492470764, new z5(mVarG, z16, b1Var, courseSentence2, b1Var2, oVar3, eVar2, b0Var2, q1Var2, 0), sVar3), sVar3, 56);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ y5(boolean z11, CourseSentence courseSentence, l1.b1 b1Var, l1.b1 b1Var2, ht.o oVar, fz.e eVar, boolean z12, rz.b0 b0Var, jt.q1 q1Var, CourseSentence courseSentence2) {
        this.f6220a = 2;
        this.f6222c = z11;
        this.f6223d = courseSentence;
        this.f6224e = b1Var;
        this.f6225f = b1Var2;
        this.f6226t = oVar;
        this.H = eVar;
        this.K = z12;
        this.L = b0Var;
        this.M = q1Var;
        this.f6221b = courseSentence2;
    }
}
