package bt;

import android.content.res.Resources;
import com.lingodeer.R;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import rt.ec;
import rt.fc;
import rt.gc;
import rt.qa;
import rt.rc;
import rt.sa;
import rt.ta;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b1 implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5207f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5208t;

    public /* synthetic */ b1(CourseSentence courseSentence, l1.a1 a1Var, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, rz.b0 b0Var, ys.d0 d0Var) {
        this.f5202a = 0;
        this.f5203b = b1Var;
        this.f5204c = b1Var2;
        this.f5206e = d0Var;
        this.f5207f = b0Var;
        this.f5208t = courseSentence;
        this.f5205d = b1Var3;
        this.H = a1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5202a) {
            case 0:
                l1.b1 b1Var = (l1.b1) this.f5203b;
                l1.b1 b1Var2 = (l1.b1) this.f5204c;
                ys.d0 d0Var = (ys.d0) this.f5206e;
                rz.b0 b0Var = (rz.b0) this.f5207f;
                CourseSentence courseSentence = (CourseSentence) this.f5208t;
                l1.b1 b1Var3 = (l1.b1) this.f5205d;
                l1.a1 a1Var = (l1.a1) this.H;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
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
                    l1.t.J(y2.j.f56917f, a2VarA, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    dt.a0.q(ub.a.e0(sVar, R.string.sentence_m0_hint), false, sVar, 0, 2);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.c.g(sVar, new j0.i1(1.0f, true));
                    boolean z11 = ((ht.l) b1Var3.getValue()) instanceof ht.i;
                    long j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a;
                    z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 11);
                    boolean zF = sVar.f(b1Var) | sVar.f(b1Var2) | sVar.h(d0Var) | sVar.h(b0Var) | sVar.h(courseSentence) | sVar.f(b1Var3);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        e1 e1Var = new e1(courseSentence, a1Var, b1Var, b1Var2, b1Var3, b0Var, d0Var);
                        sVar.o0(e1Var);
                        objQ = e1Var;
                    }
                    dt.a0.b(z11, rVarE, j11, (fz.a) objQ, sVar, 48, 0);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                ((Integer) obj2).getClass();
                b.s((jt.k0) this.f5203b, (ht.o) this.f5204c, (fz.a) this.f5205d, (fz.e) this.f5206e, (fz.c) this.f5207f, (fz.a) this.f5208t, (fz.c) this.H, (l1.n) obj, l1.t.M(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                b.v((jt.l0) this.f5203b, (ht.o) this.f5204c, (fz.a) this.f5205d, (fz.e) this.f5206e, (fz.c) this.f5207f, (fz.a) this.f5208t, (fz.c) this.H, (l1.n) obj, l1.t.M(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                b.G((jt.m1) this.f5203b, (ht.o) this.f5204c, (fz.a) this.f5205d, (fz.e) this.f5206e, (fz.c) this.f5207f, (fz.a) this.f5208t, (fz.c) this.H, (l1.n) obj, l1.t.M(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                b.I((jt.q1) this.f5203b, (ht.o) this.f5204c, (fz.a) this.f5205d, (fz.e) this.f5206e, (fz.c) this.f5207f, (fz.a) this.f5208t, (fz.c) this.H, (l1.n) obj, l1.t.M(1));
                break;
            case 5:
                List list = (List) this.f5204c;
                ht.o oVar2 = (ht.o) this.f5205d;
                fz.c cVar = (fz.c) this.f5206e;
                fz.e eVar = (fz.e) this.f5207f;
                l1.b1 b1Var4 = (l1.b1) this.f5203b;
                CourseWord courseWord = (CourseWord) this.f5208t;
                l1.b3 b3Var = (l1.b3) this.H;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) b3Var.getValue()).booleanValue();
                    boolean z12 = oVar2.f33766o;
                    boolean z13 = oVar2.f33759g;
                    boolean z14 = oVar2.f33760h;
                    long jB = ((ht.l) b1Var4.getValue()).b();
                    boolean zF2 = sVar2.f(cVar) | sVar2.f(oVar2) | sVar2.f(eVar) | sVar2.f(b1Var4) | sVar2.h(courseWord);
                    Object objQ2 = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF2 || objQ2 == gVar) {
                        b1.a aVar = new b1.a(cVar, (Object) oVar2, (Object) eVar, (Object) courseWord, (l1.b3) b1Var4, 4);
                        sVar2.o0(aVar);
                        objQ2 = aVar;
                    }
                    fz.c cVar2 = (fz.c) objQ2;
                    boolean zF3 = sVar2.f(eVar) | sVar2.f(b1Var4) | sVar2.h(courseWord);
                    Object objQ3 = sVar2.Q();
                    if (zF3 || objQ3 == gVar) {
                        objQ3 = new r6(eVar, courseWord, b1Var4, 2);
                        sVar2.o0(objQ3);
                    }
                    b.S(list, zBooleanValue, true, z12, z13, z14, jB, cVar2, (fz.c) objQ3, sVar2, 384);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 6:
                gc gcVar = (gc) this.f5205d;
                fz.a aVar2 = (fz.a) this.f5206e;
                rz.b0 b0Var2 = (rz.b0) this.f5207f;
                fz.a aVar3 = (fz.a) this.f5208t;
                l1.b1 b1Var5 = (l1.b1) this.f5203b;
                rc rcVar = (rc) this.H;
                l1.b1 b1Var6 = (l1.b1) this.f5204c;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sVar3.W();
                } else if (kotlin.jvm.internal.m.a(gcVar, ec.f49694a)) {
                    sVar3.d0(-1500250871);
                    sVar3.p(false);
                } else {
                    if (!(gcVar instanceof fc)) {
                        throw nv.p.x(sVar3, -1500251773, false);
                    }
                    sVar3.d0(736983568);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    l1.q1 q1VarL2 = sVar3.l();
                    z1.r rVarC2 = z1.a.c(sVar3, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar3);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar3);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar3);
                    float f5 = ((fc) gcVar).f49762a;
                    int iIntValue4 = ((Number) aVar2.invoke()).intValue();
                    boolean zBooleanValue2 = ((Boolean) b1Var5.getValue()).booleanValue();
                    boolean zH = sVar3.h(b0Var2) | sVar3.f(aVar3);
                    Object objQ4 = sVar3.Q();
                    if (zH || objQ4 == l1.m.f39353a) {
                        objQ4 = new fs.f(b0Var2, aVar3, 0);
                        sVar3.o0(objQ4);
                    }
                    ys.a.v(f5, iIntValue4, zBooleanValue2, (fz.a) objQ4, t1.e.d(-246072786, new at.p(9, rcVar, b1Var6), sVar3), sVar3, 24576);
                    sVar3.p(true);
                    sVar3.p(false);
                }
                return qy.b0.f48488a;
            case 7:
                ((Integer) obj2).getClass();
                gr.n.i((fz.a) this.f5203b, (fz.c) this.f5204c, (fz.a) this.f5205d, (fz.a) this.f5206e, (fz.e) this.f5207f, (ni.m) this.f5208t, (gp.l1) this.H, (l1.n) obj, l1.t.M(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                uu.a.f((Resources) this.f5203b, (z1.r) this.f5204c, (fz.a) this.f5205d, (fz.a) this.f5206e, (fz.a) this.f5207f, (fz.a) this.f5208t, (fz.a) this.H, (l1.n) obj, l1.t.M(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                xu.h1.f((z2.i2) this.f5203b, (String) this.f5204c, (fz.c) this.f5205d, (e2.v) this.f5206e, (fz.c) this.f5207f, (fz.a) this.f5208t, (fz.c) this.H, (l1.n) obj, l1.t.M(1576321));
                break;
            case 10:
                ta taVar = (ta) this.f5203b;
                CoursePracticeType coursePracticeType = (CoursePracticeType) this.f5204c;
                qa qaVar = (qa) this.f5205d;
                fz.c cVar3 = (fz.c) this.f5206e;
                fz.a aVar4 = (fz.a) this.f5207f;
                fz.a aVar5 = (fz.a) this.f5208t;
                l1.g1 g1Var = (l1.g1) this.H;
                l1.n nVar4 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    List list2 = ((sa) taVar).f50385a;
                    Object objQ5 = sVar4.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (objQ5 == gVar2) {
                        objQ5 = new mt.l1(g1Var, 1);
                        sVar4.o0(objQ5);
                    }
                    fz.c cVar4 = (fz.c) objQ5;
                    boolean zF4 = sVar4.f(aVar4) | sVar4.f(aVar5);
                    Object objQ6 = sVar4.Q();
                    if (zF4 || objQ6 == gVar2) {
                        objQ6 = new defpackage.a(2, aVar4, aVar5);
                        sVar4.o0(objQ6);
                    }
                    et.a.g(list2, coursePracticeType, qaVar, cVar3, cVar4, (fz.a) objQ6, sVar4, 24576);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            default:
                ((Integer) obj2).getClass();
                ys.a.p((ta) this.f5203b, (CoursePracticeType) this.f5204c, (qa) this.f5205d, (fz.c) this.f5206e, (fz.a) this.f5207f, (fz.a) this.f5208t, (fz.a) this.H, (l1.n) obj, l1.t.M(49));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ b1(Object obj, Object obj2, Object obj3, Object obj4, qy.e eVar, Object obj5, Object obj6, int i11, int i12) {
        this.f5202a = i12;
        this.f5203b = obj;
        this.f5204c = obj2;
        this.f5205d = obj3;
        this.f5206e = obj4;
        this.f5207f = eVar;
        this.f5208t = obj5;
        this.H = obj6;
    }

    public /* synthetic */ b1(List list, ht.o oVar, fz.c cVar, fz.e eVar, l1.b1 b1Var, CourseWord courseWord, l1.b3 b3Var) {
        this.f5202a = 5;
        this.f5204c = list;
        this.f5205d = oVar;
        this.f5206e = cVar;
        this.f5207f = eVar;
        this.f5203b = b1Var;
        this.f5208t = courseWord;
        this.H = b3Var;
    }

    public /* synthetic */ b1(ta taVar, CoursePracticeType coursePracticeType, qa qaVar, fz.c cVar, fz.a aVar, fz.a aVar2, l1.g1 g1Var) {
        this.f5202a = 10;
        this.f5203b = taVar;
        this.f5204c = coursePracticeType;
        this.f5205d = qaVar;
        this.f5206e = cVar;
        this.f5207f = aVar;
        this.f5208t = aVar2;
        this.H = g1Var;
    }

    public /* synthetic */ b1(gc gcVar, fz.a aVar, rz.b0 b0Var, fz.a aVar2, l1.b1 b1Var, rc rcVar, l1.b1 b1Var2) {
        this.f5202a = 6;
        this.f5205d = gcVar;
        this.f5206e = aVar;
        this.f5207f = b0Var;
        this.f5208t = aVar2;
        this.f5203b = b1Var;
        this.H = rcVar;
        this.f5204c = b1Var2;
    }
}
