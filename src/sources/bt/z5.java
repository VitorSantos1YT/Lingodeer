package bt;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z5 implements fz.e {
    public final /* synthetic */ fz.e H;
    public final /* synthetic */ rz.b0 K;
    public final /* synthetic */ jt.q1 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v3.m f6267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f6270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6271f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ht.o f6272t;

    public /* synthetic */ z5(v3.m mVar, boolean z11, l1.b1 b1Var, CourseSentence courseSentence, l1.b1 b1Var2, ht.o oVar, fz.e eVar, rz.b0 b0Var, jt.q1 q1Var, int i11) {
        this.f6266a = i11;
        this.f6267b = mVar;
        this.f6268c = z11;
        this.f6269d = b1Var;
        this.f6270e = courseSentence;
        this.f6271f = b1Var2;
        this.f6272t = oVar;
        this.H = eVar;
        this.K = b0Var;
        this.L = q1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        r0.e eVarE;
        switch (this.f6266a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z1.r rVarE = j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, 26, 5);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarE);
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
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    w4.c.r(1.0f, true, sVar);
                    l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-1166826168, new z5(this.f6267b, this.f6268c, this.f6269d, this.f6270e, this.f6271f, this.f6272t, this.H, this.K, this.L, 1), sVar), sVar, 56);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (this.f6267b == v3.m.Rtl) {
                        float f5 = 12;
                        eVarE = r0.f.e(0, f5, f5, f5);
                    } else {
                        float f11 = 12;
                        eVarE = r0.f.e(f11, 0, f11, f11);
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
                    boolean z11 = this.f6268c;
                    CourseSentence courseSentence = this.f6270e;
                    List<CourseWord> displayCourseWords = z11 ? (List) this.f6269d.getValue() : courseSentence.getDisplayCourseWords();
                    l1.d0 d0Var = ua.f31167a;
                    j3.y0 y0VarA = j3.y0.a((j3.y0) sVar2.j(d0Var), 0L, ct.c.c(sVar2), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
                    boolean z12 = this.f6271f.getValue() instanceof ht.b;
                    ht.o oVar2 = this.f6272t;
                    boolean z13 = (z11 && oVar2.f33757e) ? false : true;
                    boolean z14 = !oVar2.f33757e;
                    j0.b bVar = j0.i.f35303a;
                    fz.e eVar = this.H;
                    boolean zF = sVar2.f(eVar) | sVar2.h(courseSentence);
                    Object objQ = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF || objQ == gVar) {
                        objQ = new m0(eVar, courseSentence, 14);
                        sVar2.o0(objQ);
                    }
                    fz.a aVar = (fz.a) objQ;
                    rz.b0 b0Var = this.K;
                    boolean zH = sVar2.h(b0Var);
                    jt.q1 q1Var = this.L;
                    boolean zH2 = zH | sVar2.h(q1Var);
                    Object objQ2 = sVar2.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new au.d1(21, b0Var, q1Var);
                        sVar2.o0(objQ2);
                    }
                    dt.d4.a(displayCourseWords, null, null, z14, false, y0VarA, bVar, z12, z13, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, aVar, (fz.c) objQ2, null, sVar2, 1572864, 0, 0, 2620950);
                    ua.b(courseSentence.getTranslation(), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(d0Var), 0L, ct.c.e(sVar2), n3.s.f43178t, null, null, 0L, null, null, 0, 4, 0L, null, 16711673), sVar2, 48, 0, 65532);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
