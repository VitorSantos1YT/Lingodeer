package at;

import bp.g1;
import bt.s5;
import ch.o0;
import com.google.api.Service;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import ei.z;
import fr.j3;
import h1.e0;
import h1.j0;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.u;
import j0.z1;
import j3.y0;
import l1.q1;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f2914b;

    public /* synthetic */ o(int i11, int i12, fz.a aVar) {
        this.f2913a = i12;
        this.f2914b = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2913a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fz.a aVar = this.f2914b;
                    boolean zF = sVar.f(aVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new r(0, aVar);
                        sVar.o0(objQ);
                    }
                    iu.k.j((fz.a) objQ, sVar, 0);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
            case 1:
                ((Integer) obj2).getClass();
                g1.a(this.f2914b, (l1.n) obj, t.M(1));
                break;
            case 2:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fz.a aVar2 = this.f2914b;
                    boolean zF2 = sVar2.f(aVar2);
                    Object objQ2 = sVar2.Q();
                    if (zF2 || objQ2 == l1.m.f39353a) {
                        objQ2 = new r(6, aVar2);
                        sVar2.o0(objQ2);
                    }
                    iu.k.g((fz.a) objQ2, null, g1.f4590f, null, null, null, null, null, sVar2, 384, 250);
                } else {
                    sVar2.W();
                }
                return b0.f48488a;
            case 3:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    long j11 = ((s1) sVar3.j(v1.f31180a)).f31033p;
                    r0.e eVarD = r0.f.d(24);
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarE = j0.c.E(d0.n.h(oVar, j11, eVarD), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 42, 7);
                    u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar3, 48);
                    int iHashCode = Long.hashCode(sVar3.T);
                    q1 q1VarL = sVar3.l();
                    z1.r rVarC = z1.a.c(sVar3, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    t.J(hVar, uVarA, sVar3);
                    y2.h hVar2 = y2.j.f56916e;
                    t.J(hVar2, q1VarL, sVar3);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    t.J(hVar4, rVarC, sVar3);
                    a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar3, 0);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    q1 q1VarL2 = sVar3.l();
                    z1.r rVarC2 = z1.a.c(sVar3, oVar);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    t.J(hVar, a2VarA, sVar3);
                    t.J(hVar2, q1VarL2, sVar3);
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar3);
                    }
                    t.J(hVar4, rVarC2, sVar3);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    w4.c.r(1.0f, true, sVar3);
                    k7.h(this.f2914b, null, false, null, bt.b.f5193r, sVar3, 196608, 30);
                    sVar3.p(true);
                    ua.b(ub.a.e0(sVar3, R.string.understanding_your_score), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar3.j(ua.f31167a), 0L, j3.A(16), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar3, 0, 0, 65534);
                    String strE0 = ub.a.e0(sVar3, R.string.speech_score_a);
                    long j12 = s5.f5974a;
                    s5.h(strE0, 100, 76, j12, j12, s5.f5978e, R.drawable.speech_score_color_a_panel, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 32, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar3, 12807600);
                    String strE1 = ub.a.e0(sVar3, R.string.speech_score_b);
                    long j13 = s5.f5979f;
                    float f5 = 16;
                    s5.h(strE1, 75, 51, j13, j13, s5.f5983j, R.drawable.speech_score_color_b_panel, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar3, 12807600);
                    String strE2 = ub.a.e0(sVar3, R.string.speech_score_c);
                    long j14 = s5.f5984k;
                    s5.h(strE2, 50, 26, j14, j14, s5.f5987o, R.drawable.speech_score_color_c_panel, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar3, 12807600);
                    String strE3 = ub.a.e0(sVar3, R.string.speech_score_d);
                    long j15 = s5.f5988p;
                    s5.h(strE3, 25, 0, j15, j15, s5.f5992t, R.drawable.speech_score_color_d_panel, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar3, 12807600);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                return b0.f48488a;
            case 4:
                ((Integer) obj2).getClass();
                s5.d(this.f2914b, (l1.n) obj, t.M(7));
                break;
            case 5:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarV = j0.c.v(oVar2);
                    u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, 0);
                    int iHashCode3 = Long.hashCode(sVar4.T);
                    q1 q1VarL3 = sVar4.l();
                    z1.r rVarC3 = z1.a.c(sVar4, rVarV);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    y2.h hVar5 = y2.j.f56917f;
                    t.J(hVar5, uVarA2, sVar4);
                    y2.h hVar6 = y2.j.f56916e;
                    t.J(hVar6, q1VarL3, sVar4);
                    y2.h hVar7 = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar7);
                    }
                    y2.h hVar8 = y2.j.f56915d;
                    t.J(hVar8, rVarC3, sVar4);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    w4.c.r(1.0f, true, sVar4);
                    float f11 = 20;
                    z1.r rVarE2 = j0.c.E(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, f11, 16, 2);
                    a2 a2VarA2 = z1.a(j0.i.f35303a, z1.c.L, sVar4, 0);
                    int iHashCode4 = Long.hashCode(sVar4.T);
                    q1 q1VarL4 = sVar4.l();
                    z1.r rVarC4 = z1.a.c(sVar4, rVarE2);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    t.J(hVar5, a2VarA2, sVar4);
                    t.J(hVar6, q1VarL4, sVar4);
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar7);
                    }
                    t.J(hVar8, rVarC4, sVar4);
                    fz.a aVar3 = this.f2914b;
                    boolean zF3 = sVar4.f(aVar3);
                    Object objQ3 = sVar4.Q();
                    if (zF3 || objQ3 == l1.m.f39353a) {
                        objQ3 = new r(29, aVar3);
                        sVar4.o0(objQ3);
                    }
                    iu.k.e((fz.a) objQ3, e2.e(oVar2, 1.0f), false, 0L, null, ch.a.f7002c, sVar4, 196656, 28);
                    sVar4.p(true);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                return b0.f48488a;
            case 6:
                ((Integer) obj2).getClass();
                cr.a.a(this.f2914b, (l1.n) obj, t.M(7));
                break;
            case 7:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    k7.m(this.f2914b, null, false, null, null, null, cr.a.f22426a, sVar5, 805306368, 510);
                } else {
                    sVar5.W();
                }
                return b0.f48488a;
            case 8:
                ((Integer) obj2).getClass();
                cr.a.b(this.f2914b, (l1.n) obj, t.M(7));
                break;
            case 9:
                ((Integer) obj2).getClass();
                hz.b.b(this.f2914b, (l1.n) obj, t.M(1));
                break;
            case 10:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    z1.h hVar9 = z1.c.P;
                    z1.o oVar3 = z1.o.f58481a;
                    z1.r rVarE3 = e2.e(oVar3, 1.0f);
                    u uVarA3 = j0.t.a(j0.i.f35305c, hVar9, sVar6, 48);
                    int iHashCode5 = Long.hashCode(sVar6.T);
                    q1 q1VarL5 = sVar6.l();
                    z1.r rVarC5 = z1.a.c(sVar6, rVarE3);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar3);
                    } else {
                        sVar6.r0();
                    }
                    t.J(y2.j.f56917f, uVarA3, sVar6);
                    t.J(y2.j.f56916e, q1VarL5, sVar6);
                    y2.h hVar10 = y2.j.f56918g;
                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar6, iHashCode5, hVar10);
                    }
                    t.J(y2.j.f56915d, rVarC5, sVar6);
                    j0.c.g(sVar6, e2.g(oVar3, 16));
                    String strE4 = ub.a.e0(sVar6, R.string.can_t_listen_now);
                    y0 y0VarA = y0.a((y0) sVar6.j(ua.f31167a), ((s1) sVar6.j(v1.f31180a)).f31036s, j3.A(14), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208);
                    fz.a aVar4 = this.f2914b;
                    boolean zF4 = sVar6.f(aVar4);
                    Object objQ4 = sVar6.Q();
                    if (zF4 || objQ4 == l1.m.f39353a) {
                        objQ4 = new o0(16, aVar4);
                        sVar6.o0(objQ4);
                    }
                    ua.b(strE4, iu.k.q(6, 7, (fz.a) objQ4, sVar6, oVar3, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar6, 0, 0, 65532);
                    sVar6.p(true);
                } else {
                    sVar6.W();
                }
                return b0.f48488a;
            case 11:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    iu.k.g(this.f2914b, null, z.f25678a, null, null, null, null, null, sVar7, 384, 250);
                } else {
                    sVar7.W();
                }
                return b0.f48488a;
            case 12:
                l1.n nVar8 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.s sVar8 = (l1.s) nVar8;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    iu.k.g(this.f2914b, null, en.a.f25693a, null, null, null, null, null, sVar8, 384, 250);
                } else {
                    sVar8.W();
                }
                return b0.f48488a;
            case 13:
                l1.n nVar9 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                l1.s sVar9 = (l1.s) nVar9;
                if (sVar9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    iu.k.g(this.f2914b, null, es.j.f25822a, null, null, null, null, null, sVar9, 384, 250);
                } else {
                    sVar9.W();
                }
                return b0.f48488a;
            case 14:
                l1.n nVar10 = (l1.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                l1.s sVar10 = (l1.s) nVar10;
                if (sVar10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    k7.m(this.f2914b, null, false, null, null, null, fp.a.f27353c, sVar10, 805306368, 510);
                } else {
                    sVar10.W();
                }
                return b0.f48488a;
            case 15:
                l1.n nVar11 = (l1.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                l1.s sVar11 = (l1.s) nVar11;
                if (sVar11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    fz.a aVar5 = this.f2914b;
                    boolean zF5 = sVar11.f(aVar5);
                    Object objQ5 = sVar11.Q();
                    if (zF5 || objQ5 == l1.m.f39353a) {
                        objQ5 = new et.p(15, aVar5);
                        sVar11.o0(objQ5);
                    }
                    iu.k.j((fz.a) objQ5, sVar11, 0);
                } else {
                    sVar11.W();
                }
                return b0.f48488a;
            case 16:
                ((Integer) obj2).getClass();
                iu.k.j(this.f2914b, (l1.n) obj, t.M(1));
                break;
            case 17:
                l1.n nVar12 = (l1.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                l1.s sVar12 = (l1.s) nVar12;
                if (sVar12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    iu.k.j(this.f2914b, sVar12, 0);
                } else {
                    sVar12.W();
                }
                return b0.f48488a;
            case 18:
                l1.n nVar13 = (l1.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                l1.s sVar13 = (l1.s) nVar13;
                if (sVar13.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    float f12 = 16;
                    k7.b(this.f2914b, e2.g(j0.c.E(j0.c.C(j0.c.v(e2.e(z1.o.f58481a, 1.0f)), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f12, 7), 42), false, null, null, j0.b(2, 4, 28), null, null, iv.a.f34663c, sVar13, 805306368, 476);
                } else {
                    sVar13.W();
                }
                return b0.f48488a;
            case 19:
                l1.n nVar14 = (l1.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                l1.s sVar14 = (l1.s) nVar14;
                if (sVar14.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    fz.a aVar6 = this.f2914b;
                    boolean zF6 = sVar14.f(aVar6);
                    Object objQ6 = sVar14.Q();
                    if (zF6 || objQ6 == l1.m.f39353a) {
                        objQ6 = new et.p(18, aVar6);
                        sVar14.o0(objQ6);
                    }
                    iu.k.j((fz.a) objQ6, sVar14, 0);
                } else {
                    sVar14.W();
                }
                return b0.f48488a;
            case 20:
                l1.n nVar15 = (l1.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                l1.s sVar15 = (l1.s) nVar15;
                if (sVar15.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    fz.a aVar7 = this.f2914b;
                    boolean zF7 = sVar15.f(aVar7);
                    Object objQ7 = sVar15.Q();
                    if (zF7 || objQ7 == l1.m.f39353a) {
                        objQ7 = new et.p(19, aVar7);
                        sVar15.o0(objQ7);
                    }
                    iu.k.j((fz.a) objQ7, sVar15, 0);
                } else {
                    sVar15.W();
                }
                return b0.f48488a;
            case 21:
                l1.n nVar16 = (l1.n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                l1.s sVar16 = (l1.s) nVar16;
                if (sVar16.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    e0.c(iv.a.f34664d, null, t1.e.d(-605307714, new o(20, this.f2914b), sVar16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar16, 390, 250);
                } else {
                    sVar16.W();
                }
                return b0.f48488a;
            case 22:
                l1.n nVar17 = (l1.n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                l1.s sVar17 = (l1.s) nVar17;
                if (sVar17.T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    fz.a aVar8 = this.f2914b;
                    boolean zF8 = sVar17.f(aVar8);
                    Object objQ8 = sVar17.Q();
                    if (zF8 || objQ8 == l1.m.f39353a) {
                        objQ8 = new et.p(21, aVar8);
                        sVar17.o0(objQ8);
                    }
                    iu.k.j((fz.a) objQ8, sVar17, 0);
                } else {
                    sVar17.W();
                }
                return b0.f48488a;
            case 23:
                l1.n nVar18 = (l1.n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                l1.s sVar18 = (l1.s) nVar18;
                if (sVar18.T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    iu.k.j(this.f2914b, sVar18, 0);
                } else {
                    sVar18.W();
                }
                return b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                l1.n nVar19 = (l1.n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                l1.s sVar19 = (l1.s) nVar19;
                if (sVar19.T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    fz.a aVar9 = this.f2914b;
                    boolean zF9 = sVar19.f(aVar9);
                    Object objQ9 = sVar19.Q();
                    if (zF9 || objQ9 == l1.m.f39353a) {
                        objQ9 = new et.p(25, aVar9);
                        sVar19.o0(objQ9);
                    }
                    k7.m((fz.a) objQ9, null, false, null, null, null, jr.a.f36557b, sVar19, 805306368, 510);
                } else {
                    sVar19.W();
                }
                return b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                l1.n nVar20 = (l1.n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                l1.s sVar20 = (l1.s) nVar20;
                if (sVar20.T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    iu.k.g(this.f2914b, null, jr.a.f36571q, null, null, null, null, null, sVar20, 384, 250);
                } else {
                    sVar20.W();
                }
                return b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                l1.n nVar21 = (l1.n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                l1.s sVar21 = (l1.s) nVar21;
                if (sVar21.T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    k7.m(this.f2914b, null, false, null, null, null, kt.a.f38642e, sVar21, 805306368, 510);
                } else {
                    sVar21.W();
                }
                return b0.f48488a;
            case 27:
                l1.n nVar22 = (l1.n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                l1.s sVar22 = (l1.s) nVar22;
                if (sVar22.T(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    k7.m(this.f2914b, null, false, null, null, null, lr.a.f40227a, sVar22, 805306368, 510);
                } else {
                    sVar22.W();
                }
                return b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                lr.a.a(this.f2914b, (l1.n) obj, t.M(1));
                break;
            default:
                l1.n nVar23 = (l1.n) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                l1.s sVar23 = (l1.s) nVar23;
                if (sVar23.T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    fz.a aVar10 = this.f2914b;
                    boolean zF10 = sVar23.f(aVar10);
                    Object objQ10 = sVar23.Q();
                    if (zF10 || objQ10 == l1.m.f39353a) {
                        objQ10 = new jr.m(18, aVar10);
                        sVar23.o0(objQ10);
                    }
                    iu.k.j((fz.a) objQ10, sVar23, 0);
                } else {
                    sVar23.W();
                }
                return b0.f48488a;
        }
        return b0.f48488a;
    }

    public /* synthetic */ o(int i11, fz.a aVar) {
        this.f2913a = i11;
        this.f2914b = aVar;
    }
}
