package bt;

import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.ua;
import rt.ud;
import rt.we;
import rt.y8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q0 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5863e;

    public /* synthetic */ q0(fz.a aVar, boolean z11, fz.c cVar, fz.a aVar2) {
        this.f5859a = 3;
        this.f5861c = aVar;
        this.f5860b = z11;
        this.f5863e = cVar;
        this.f5862d = aVar2;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y2.h hVar;
        int i11;
        z1.o oVar;
        boolean z11;
        z1.o oVar2;
        boolean z12;
        switch (this.f5859a) {
            case 0:
                jt.u uVar = (jt.u) this.f5861c;
                j3.y0 y0Var = (j3.y0) this.f5862d;
                fz.c cVar = (fz.c) this.f5863e;
                j0.v Card = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.o oVar3 = z1.o.f58481a;
                    z1.r rVarA = j0.c.A(oVar3, 16);
                    j0.u uVarA = j0.t.a(j0.i.g(4), z1.c.P, sVar, 54);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarA);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    y2.h hVar2 = y2.j.f56917f;
                    l1.t.J(hVar2, uVarA, sVar);
                    y2.h hVar3 = y2.j.f56916e;
                    l1.t.J(hVar3, q1VarL, sVar);
                    y2.h hVar4 = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                    }
                    y2.h hVar5 = y2.j.f56915d;
                    l1.t.J(hVar5, rVarC, sVar);
                    float f5 = 2;
                    j0.g gVarG = j0.i.g(f5);
                    z1.i iVar2 = z1.c.M;
                    j0.a2 a2VarA = j0.z1.a(gVarG, iVar2, sVar, 54);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, oVar3);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar2, a2VarA, sVar);
                    l1.t.J(hVar3, q1VarL2, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        hVar = hVar4;
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
                    } else {
                        hVar = hVar4;
                    }
                    l1.t.J(hVar5, rVarC2, sVar);
                    float f11 = 50;
                    j0.o.a(j0.e2.p(oVar3, f11, 24), sVar, 6);
                    CourseWord courseWord = (CourseWord) uVar.f37196h.getValue();
                    long j11 = y0Var.f35827a.f35755b;
                    fr.j3.i(j11);
                    y2.h hVar6 = hVar;
                    j3.y0 y0VarA = j3.y0.a(y0Var, 0L, fr.j3.L(j11 & 1095216660480L, v3.o.c(j11) * 0.8f), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213);
                    boolean z13 = this.f5860b;
                    b.i0(courseWord, y0VarA, z13, cVar, sVar, 0);
                    sVar.p(true);
                    j0.a2 a2VarA2 = j0.z1.a(j0.i.g(f5), iVar2, sVar, 54);
                    int iHashCode3 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL3 = sVar.l();
                    z1.r rVarC3 = z1.a.c(sVar, oVar3);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar2, a2VarA2, sVar);
                    l1.t.J(hVar3, q1VarL3, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar6);
                    }
                    l1.t.J(hVar5, rVarC3, sVar);
                    b.h0((CourseWord) uVar.f37194f.getValue(), y0Var, z13, cVar, true, f11, sVar, 221184);
                    b.h0((CourseWord) uVar.f37195g.getValue(), y0Var, z13, cVar, false, 70, sVar, 221184);
                    sVar.p(true);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                fz.a aVar = (fz.a) this.f5861c;
                y8 y8Var = (y8) this.f5862d;
                fz.e eVar = (fz.e) this.f5863e;
                j0.v Card2 = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.o oVar4 = z1.o.f58481a;
                    z1.r rVarE = j0.e2.e(oVar4, 1.0f);
                    boolean zF = sVar2.f(aVar);
                    Object objQ = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF || objQ == gVar) {
                        objQ = new mt.e2(25, aVar);
                        sVar2.o0(objQ);
                    }
                    z1.r rVarO = d0.n.o(rVarE, false, null, (fz.a) objQ, 15);
                    float f12 = 10;
                    z1.r rVarC4 = j0.c.C(rVarO, CropImageView.DEFAULT_ASPECT_RATIO, f12, 1);
                    j0.a2 a2VarA3 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
                    int iHashCode4 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL4 = sVar2.l();
                    z1.r rVarC5 = z1.a.c(sVar2, rVarC4);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar3);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA3, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL4, sVar2);
                    y2.h hVar7 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar7);
                    }
                    l1.t.J(y2.j.f56915d, rVarC5, sVar2);
                    String str = y8Var.f50693c;
                    int i12 = y8Var.f50695e;
                    l1.d0 d0Var = ua.f31167a;
                    float f13 = 16;
                    ua.b(str, j0.c.E(oVar4, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(d0Var), 0L, fr.j3.A(18), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, 48, 0, 65532);
                    l1.s sVar3 = sVar2;
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    w4.c.r(1.0f, true, sVar3);
                    boolean z14 = this.f5860b;
                    if (!z14 || i12 <= 0) {
                        i11 = -2101519655;
                        oVar = oVar4;
                        z11 = false;
                        sVar3.d0(-2101519655);
                    } else {
                        sVar3.d0(-2070588475);
                        i11 = -2101519655;
                        ua.b("(" + i12 + ")", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar3.j(d0Var), ((h1.s1) sVar3.j(h1.v1.f31180a)).f31017a, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar3, 0, 0, 65534);
                        sVar3 = sVar3;
                        oVar = oVar4;
                        j0.c.g(sVar3, j0.e2.s(oVar, (float) 8));
                        z11 = false;
                    }
                    sVar3.p(z11);
                    z1.o oVar5 = oVar;
                    l1.s sVar4 = sVar3;
                    ua.b(String.valueOf(y8Var.f50694d), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar3.j(d0Var), ((h1.s1) sVar3.j(h1.v1.f31180a)).f31036s, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar4, 0, 0, 65534);
                    l1.s sVar5 = sVar4;
                    j0.c.g(sVar5, j0.e2.s(oVar5, f13));
                    if (y8Var.f50699i) {
                        oVar2 = oVar5;
                        z12 = false;
                        sVar5.d0(i11);
                    } else {
                        sVar5.d0(-2070027096);
                        float f14 = 0;
                        oVar2 = oVar5;
                        d0.n.c(se.k.y(R.drawable.ic_lesson_index_pro, sVar5, 0), null, j0.e2.n(j0.c.C(j0.c.E(oVar5, f14, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, 10), CropImageView.DEFAULT_ASPECT_RATIO, f12, 1), 24), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 432, 120);
                        sVar5 = sVar5;
                        z12 = false;
                    }
                    sVar5.p(z12);
                    if (z14) {
                        sVar5.d0(-2069632714);
                        boolean z15 = y8Var.f50696f;
                        boolean zF2 = sVar5.f(eVar) | sVar5.h(y8Var);
                        Object objQ2 = sVar5.Q();
                        if (zF2 || objQ2 == gVar) {
                            objQ2 = new j9.h(26, eVar, y8Var);
                            sVar5.o0(objQ2);
                        }
                        h1.e1.a(z15, (fz.c) objQ2, oVar2, y8Var.f50698h, null, sVar5, 384, 48);
                        sVar5.p(false);
                    } else {
                        sVar5.d0(-2069344879);
                        j0.c.g(sVar5, j0.e2.s(oVar2, f13));
                        sVar5.p(false);
                    }
                    sVar5.p(true);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                ud udVar = (ud) this.f5861c;
                fz.a aVar2 = (fz.a) this.f5862d;
                fz.a aVar3 = (fz.a) this.f5863e;
                j0.v Card3 = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card3, "$this$Card");
                l1.s sVar6 = (l1.s) nVar3;
                if (sVar6.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    z1.o oVar6 = z1.o.f58481a;
                    z1.r rVarA2 = j0.c.A(oVar6, 16);
                    j0.d dVar = j0.i.f35305c;
                    z1.h hVar8 = z1.c.O;
                    j0.u uVarA2 = j0.t.a(dVar, hVar8, sVar6, 0);
                    int iHashCode5 = Long.hashCode(sVar6.T);
                    l1.q1 q1VarL5 = sVar6.l();
                    z1.r rVarC6 = z1.a.c(sVar6, rVarA2);
                    y2.k.J.getClass();
                    y2.i iVar4 = y2.j.f56913b;
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar4);
                    } else {
                        sVar6.r0();
                    }
                    y2.h hVar9 = y2.j.f56917f;
                    l1.t.J(hVar9, uVarA2, sVar6);
                    y2.h hVar10 = y2.j.f56916e;
                    l1.t.J(hVar10, q1VarL5, sVar6);
                    y2.h hVar11 = y2.j.f56918g;
                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar6, iHashCode5, hVar11);
                    }
                    y2.h hVar12 = y2.j.f56915d;
                    l1.t.J(hVar12, rVarC6, sVar6);
                    j0.a2 a2VarA4 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar6, 48);
                    int iHashCode6 = Long.hashCode(sVar6.T);
                    l1.q1 q1VarL6 = sVar6.l();
                    z1.r rVarC7 = z1.a.c(sVar6, oVar6);
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar4);
                    } else {
                        sVar6.r0();
                    }
                    l1.t.J(hVar9, a2VarA4, sVar6);
                    l1.t.J(hVar10, q1VarL6, sVar6);
                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar6, iHashCode6, hVar11);
                    }
                    l1.t.J(hVar12, rVarC7, sVar6);
                    boolean z16 = udVar.f50509h;
                    boolean zF3 = sVar6.f(aVar3);
                    Object objQ3 = sVar6.Q();
                    if (zF3 || objQ3 == l1.m.f39353a) {
                        objQ3 = new bp.r0(12, aVar3);
                        sVar6.o0(objQ3);
                    }
                    boolean z17 = this.f5860b;
                    h1.e1.a(z16, (fz.c) objQ3, null, z17, null, sVar6, 0, 52);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    z1.r rVarE2 = j0.c.E(new j0.i1(1.0f, true), 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    j0.u uVarA3 = j0.t.a(dVar, hVar8, sVar6, 0);
                    int iHashCode7 = Long.hashCode(sVar6.T);
                    l1.q1 q1VarL7 = sVar6.l();
                    z1.r rVarC8 = z1.a.c(sVar6, rVarE2);
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar4);
                    } else {
                        sVar6.r0();
                    }
                    l1.t.J(hVar9, uVarA3, sVar6);
                    l1.t.J(hVar10, q1VarL7, sVar6);
                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode7))) {
                        defpackage.e.A(iHashCode7, sVar6, iHashCode7, hVar11);
                    }
                    l1.t.J(hVar12, rVarC8, sVar6);
                    ua.b(udVar.f50504c, null, 0L, 0L, null, n3.s.K, null, 0L, null, 0L, 2, false, 2, 0, ((dc) sVar6.j(fc.f30256a)).f30175h, sVar6, 196608, 3120, 55262);
                    sVar6.p(true);
                    sVar6.p(true);
                    h1.k7.g(j0.c.C(oVar6, CropImageView.DEFAULT_ASPECT_RATIO, 12, 1), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar6, 6, 6);
                    mt.y3.y(ub.a.e0(sVar6, R.string.srs_customize_suggestion_original), mt.y3.B(udVar.f50506e, sVar6), false, false, null, sVar6, 0, 28);
                    String strE0 = ub.a.e0(sVar6, R.string.srs_customize_suggestion_recommended);
                    long j12 = udVar.f50508g;
                    long j13 = udVar.f50507f;
                    if (j12 == j13) {
                        j12 = j13;
                    }
                    mt.y3.y(strE0, mt.y3.B(j12, sVar6), true, z17 && udVar.f50509h, aVar2, sVar6, 384, 0);
                    sVar6.p(true);
                } else {
                    sVar6.W();
                }
                break;
            case 3:
                fz.a aVar4 = (fz.a) this.f5861c;
                fz.c cVar2 = (fz.c) this.f5863e;
                fz.a aVar5 = (fz.a) this.f5862d;
                j0.v Card4 = (j0.v) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card4, "$this$Card");
                l1.s sVar7 = (l1.s) nVar4;
                if (sVar7.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String strE1 = ub.a.e0(sVar7, R.string.progress_sync);
                    boolean zF4 = sVar7.f(aVar4);
                    Object objQ4 = sVar7.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (zF4 || objQ4 == gVar2) {
                        objQ4 = new wo.c(15, aVar4);
                        sVar7.o0(objQ4);
                    }
                    z1.o oVar7 = z1.o.f58481a;
                    float f15 = 16;
                    xu.r.b(R.drawable.backup_download_backup, strE1, j0.c.A(d0.n.o(oVar7, false, null, (fz.a) objQ4, 15), f15), xu.c.L, sVar7, 3072);
                    String strE2 = ub.a.e0(sVar7, R.string.offline_learning);
                    boolean z18 = this.f5860b;
                    boolean zG = sVar7.g(z18) | sVar7.f(cVar2) | sVar7.f(aVar5);
                    Object objQ5 = sVar7.Q();
                    if (zG || objQ5 == gVar2) {
                        objQ5 = new dt.l4(z18, cVar2, aVar5, 3);
                        sVar7.o0(objQ5);
                    }
                    xu.r.b(R.drawable.backup_download_offline_learning, strE2, j0.c.A(d0.n.o(oVar7, false, null, (fz.a) objQ5, 15), f15), t1.e.d(-871616316, new at.m(z18, 6), sVar7), sVar7, 3072);
                } else {
                    sVar7.W();
                }
                break;
            default:
                we weVar = (we) this.f5861c;
                fz.a aVar6 = (fz.a) this.f5862d;
                l1.b1 b1Var = (l1.b1) this.f5863e;
                j0.b2 AppTopAppBar = (j0.b2) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppTopAppBar, "$this$AppTopAppBar");
                l1.s sVar8 = (l1.s) nVar5;
                if (sVar8.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    if (weVar != null) {
                        sVar8.d0(-2002995421);
                        k2.b bVarY = se.k.y(R.drawable.ic_tips_poster, sVar8, 0);
                        g2.p pVar = new g2.p(((h1.s1) sVar8.j(h1.v1.f31180a)).f31034q, 5);
                        z1.o oVar8 = z1.o.f58481a;
                        z1.r rVarN = j0.e2.n(oVar8, 24);
                        boolean z19 = this.f5860b;
                        boolean zG2 = sVar8.g(z19) | sVar8.f(aVar6) | sVar8.f(b1Var);
                        Object objQ6 = sVar8.Q();
                        if (zG2 || objQ6 == l1.m.f39353a) {
                            objQ6 = new dt.l4(z19, aVar6, b1Var, 4);
                            sVar8.o0(objQ6);
                        }
                        d0.n.c(bVarY, null, iu.k.q(6, 7, (fz.a) objQ6, sVar8, rVarN, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, pVar, sVar8, 48, 56);
                        sVar8 = sVar8;
                        j0.c.g(sVar8, j0.e2.s(oVar8, 16));
                    } else {
                        sVar8.d0(-2025060477);
                    }
                    sVar8.p(false);
                } else {
                    sVar8.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ q0(Object obj, Object obj2, boolean z11, qy.e eVar, int i11) {
        this.f5859a = i11;
        this.f5861c = obj;
        this.f5862d = obj2;
        this.f5860b = z11;
        this.f5863e = eVar;
    }

    public /* synthetic */ q0(Object obj, boolean z11, fz.a aVar, Object obj2, int i11) {
        this.f5859a = i11;
        this.f5861c = obj;
        this.f5860b = z11;
        this.f5862d = aVar;
        this.f5863e = obj2;
    }
}
