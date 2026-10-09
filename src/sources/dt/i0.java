package dt;

import com.lingodeer.R;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23874d;

    public /* synthetic */ i0(long j11, long j12, l1.a1 a1Var) {
        this.f23871a = 2;
        this.f23872b = j11;
        this.f23873c = j12;
        this.f23874d = a1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        boolean zS;
        l1.s sVar;
        y2.i iVar;
        y2.h hVar;
        float f5;
        y2.h hVar2;
        y2.h hVar3;
        z1.o oVar;
        boolean z11;
        switch (this.f23871a) {
            case 0:
                qy.l lVar = (qy.l) this.f23874d;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f11 = 10;
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarE = j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, f11, 5);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    y2.h hVar4 = y2.j.f56917f;
                    l1.t.J(hVar4, uVarA, sVar2);
                    y2.h hVar5 = y2.j.f56916e;
                    l1.t.J(hVar5, q1VarL, sVar2);
                    y2.h hVar6 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar6);
                    }
                    y2.h hVar7 = y2.j.f56915d;
                    l1.t.J(hVar7, rVarC, sVar2);
                    float f12 = 12;
                    z1.r rVarA = j0.c.A(oVar2, f12);
                    l1.c3 c3Var = ju.f.f37370d;
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, xt.d.w(((Number) sVar2.j(c3Var)).intValue()) ? z1.c.M : z1.c.N, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarA);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar4, a2VarA, sVar2);
                    l1.t.J(hVar5, q1VarL2, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar6);
                    }
                    l1.t.J(hVar7, rVarC2, sVar2);
                    sVar2.d0(914457718);
                    CourseWord courseWord = (CourseWord) lVar.f48495a;
                    if (courseWord.getPos().length() > 0) {
                        sVar2.d0(914458848);
                        zS = xt.d.s(((Number) sVar2.j(c3Var)).intValue());
                        sVar2.p(false);
                    } else {
                        sVar2.d0(-1716545547);
                        sVar2.p(false);
                        zS = false;
                    }
                    if (zS) {
                        sVar2.d0(-1716522137);
                        String pos = courseWord.getPos();
                        j3.y0 y0VarA = j3.y0.a((j3.y0) sVar2.j(ua.f31167a), g2.f0.e(4287203721L), fr.j3.A(12), null, new n3.o(1), n3.i.f43155c, 0L, null, null, 0, 0, 0L, null, 16777172);
                        iVar = iVar2;
                        hVar = hVar4;
                        hVar2 = hVar6;
                        f5 = f12;
                        ua.b(pos, j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, 11), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar2, 48, 0, 65532);
                        sVar = sVar2;
                        z11 = false;
                        sVar.p(false);
                        courseWord = courseWord;
                        hVar3 = hVar7;
                        oVar = oVar2;
                    } else {
                        sVar = sVar2;
                        iVar = iVar2;
                        hVar = hVar4;
                        f5 = f12;
                        if (xt.d.w(((Number) sVar.j(c3Var)).intValue())) {
                            sVar.d0(-1715969655);
                            oVar = oVar2;
                            hVar2 = hVar6;
                            hVar3 = hVar7;
                            ua.b(courseWord.getZhuYin(), j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, 11), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), g2.f0.e(4287203721L), fr.j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 48, 0, 65532);
                            sVar = sVar;
                            z11 = false;
                        } else {
                            hVar2 = hVar6;
                            hVar3 = hVar7;
                            oVar = oVar2;
                            z11 = false;
                            sVar.d0(-1726368791);
                        }
                        sVar.p(z11);
                    }
                    sVar.p(z11);
                    l1.s sVar3 = sVar;
                    ua.b(courseWord.getTranslation(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, fr.j3.A(16), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar3, 0, 0, 65534);
                    sVar3.p(true);
                    j0.c.g(sVar3, d0.n.h(j0.e2.g(j0.e2.e(oVar, 1.0f), 2), this.f23872b, g2.f0.f28556b));
                    float f13 = 1;
                    float f14 = 0;
                    z1.r rVarB = d2.h.b(d0.n.h(j0.c.E(j0.e2.d(oVar, 1.0f), f13, CropImageView.DEFAULT_ASPECT_RATIO, f13, f13, 2), ((h1.s1) sVar3.j(h1.v1.f31180a)).f31035r, r0.f.e(f14, f14, f5, f5)), r0.f.e(f14, f14, f5, f5));
                    w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode3 = Long.hashCode(sVar3.T);
                    l1.q1 q1VarL3 = sVar3.l();
                    z1.r rVarC3 = z1.a.c(sVar3, rVarB);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar, q0VarD, sVar3);
                    l1.t.J(hVar5, q1VarL3, sVar3);
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar2);
                    }
                    l1.t.J(hVar3, rVarC3, sVar3);
                    Object objQ = sVar3.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        courseWord.getExplain();
                        String str = "<html>\n<body bgcolor=\"#EEF0F6\" style=\"font-size:14px;\">\n<style>\n  @import url('https://fonts.googleapis.com/css2?family=Nunito:ital,wght@0,200..1000;1,200..1000&display=swap');\n  * {\n    font-family: \"Nunito\", sans-serif !important;\n  }\n</style>" + courseWord.getExplain() + "</body>\n</html>";
                        kotlin.jvm.internal.m.e(str, "toString(...)");
                        objQ = oz.x.q0(str, "<td>", "<td style=\"font-size:14px;\">");
                        sVar3.o0(objQ);
                    }
                    wg.r rVarA2 = wg.t.a((String) objQ, sVar3, 30);
                    boolean zT = d0.n.t(sVar3);
                    z1.r rVarD = j0.e2.d(oVar, 1.0f);
                    long j11 = this.f23873c;
                    boolean zE = sVar3.e(j11) | sVar3.g(zT);
                    Object objQ2 = sVar3.Q();
                    if (zE || objQ2 == gVar) {
                        objQ2 = new b0(0, j11, zT);
                        sVar3.o0(objQ2);
                    }
                    qx.p.g(rVarA2, rVarD, false, null, (fz.c) objQ2, null, null, null, sVar3, 48, 492);
                    sVar3.p(true);
                    sVar3.p(true);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 1:
                ((Integer) obj2).getClass();
                ei.z.c((List) this.f23874d, this.f23872b, this.f23873c, (l1.n) obj, l1.t.M(1));
                break;
            case 2:
                l1.a1 a1Var = (l1.a1) this.f23874d;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar2;
                if (sVar4.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h1.r4.b(se.k.y(R.drawable.ic_pinyin_arrow, sVar4, 0), "Previous", d2.h.h(j0.e2.n(z1.o.f58481a, 24), 180.0f), ((l1.h1) a1Var).l() > 0 ? this.f23872b : this.f23873c, sVar4, 432, 0);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 3:
                ((Integer) obj2).getClass();
                yg.o.d(this.f23872b, this.f23873c, (z1.r) this.f23874d, (l1.n) obj, l1.t.M(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ys.a.q((CourseLesson) this.f23874d, this.f23872b, this.f23873c, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ i0(long j11, long j12, z1.r rVar, int i11) {
        this.f23871a = 3;
        this.f23872b = j11;
        this.f23873c = j12;
        this.f23874d = rVar;
    }

    public /* synthetic */ i0(long j11, qy.l lVar, long j12) {
        this.f23871a = 0;
        this.f23872b = j11;
        this.f23874d = lVar;
        this.f23873c = j12;
    }

    public /* synthetic */ i0(Object obj, long j11, long j12, int i11, int i12) {
        this.f23871a = i12;
        this.f23874d = obj;
        this.f23872b = j11;
        this.f23873c = j12;
    }
}
