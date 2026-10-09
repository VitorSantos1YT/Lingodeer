package mt;

import com.google.api.Service;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.ua;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41503a;

    public /* synthetic */ h(int i11) {
        this.f41503a = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f41503a;
        z1.o oVar = z1.o.f58481a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(1 & iIntValue, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    d0.n.c(se.k.y(R.drawable.ic_srs_explain, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
                }
                break;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    ua.b(ub.a.e0(sVar2, R.string.number_of_cards), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                }
                break;
            case 2:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (!sVar3.T(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    sVar3.W();
                } else {
                    ua.b(ub.a.e0(sVar3, R.string.srs_explain_title), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                }
                break;
            case 3:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (!sVar4.T(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    sVar4.W();
                } else {
                    l2.e eVarB = ob.f.f44806a;
                    if (eVarB == null) {
                        l2.d dVar = new l2.d("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i12 = l2.h0.f39633a;
                        g2.y0 y0Var = new g2.y0(g2.x.f28615b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new l2.n(15.41f, 16.59f));
                        arrayList.add(new l2.m(10.83f, 12.0f));
                        arrayList.add(new l2.u(4.58f, -4.59f));
                        arrayList.add(new l2.m(14.0f, 6.0f));
                        arrayList.add(new l2.u(-6.0f, 6.0f));
                        arrayList.add(new l2.u(6.0f, 6.0f));
                        arrayList.add(new l2.u(1.41f, -1.41f));
                        arrayList.add(l2.j.f39641c);
                        l2.d.a(dVar, arrayList, y0Var);
                        eVarB = dVar.b();
                        ob.f.f44806a = eVarB;
                    }
                    h1.r4.c(eVarB, null, null, 0L, sVar4, 48, 12);
                }
                break;
            case 4:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (!sVar5.T(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    sVar5.W();
                } else {
                    l2.e eVarB2 = qx.b.f48462a;
                    if (eVarB2 == null) {
                        l2.d dVar2 = new l2.d("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i13 = l2.h0.f39633a;
                        g2.y0 y0Var2 = new g2.y0(g2.x.f28615b);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new l2.n(8.59f, 16.59f));
                        arrayList2.add(new l2.m(13.17f, 12.0f));
                        arrayList2.add(new l2.m(8.59f, 7.41f));
                        arrayList2.add(new l2.m(10.0f, 6.0f));
                        arrayList2.add(new l2.u(6.0f, 6.0f));
                        arrayList2.add(new l2.u(-6.0f, 6.0f));
                        arrayList2.add(new l2.u(-1.41f, -1.41f));
                        arrayList2.add(l2.j.f39641c);
                        l2.d.a(dVar2, arrayList2, y0Var2);
                        eVarB2 = dVar2.b();
                        qx.b.f48462a = eVarB2;
                    }
                    h1.r4.c(eVarB2, null, null, 0L, sVar5, 48, 12);
                }
                break;
            case 5:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar6;
                if (!sVar6.T(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    sVar6.W();
                } else {
                    ua.b(ub.a.e0(sVar6, R.string.srs_future_reviews_hide_confirm_title), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 0, 0, 131070);
                }
                break;
            case 6:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar7;
                if (!sVar7.T(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    sVar7.W();
                } else {
                    h1.r4.b(se.k.y(R.drawable.ic_font_reduse, sVar7, 0), null, null, 0L, sVar7, 48, 12);
                }
                break;
            case 7:
                l1.n nVar8 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.s sVar8 = (l1.s) nVar8;
                if (!sVar8.T(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    sVar8.W();
                } else {
                    h1.r4.b(se.k.y(R.drawable.ic_font_plus, sVar8, 0), null, null, 0L, sVar8, 48, 12);
                }
                break;
            case 8:
                l1.n nVar9 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                l1.s sVar9 = (l1.s) nVar9;
                if (!sVar9.T(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    sVar9.W();
                } else {
                    ua.b(ub.a.e0(sVar9, R.string.srs_adjust_next_review), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar9, 0, 0, 131070);
                }
                break;
            case 9:
                l1.n nVar10 = (l1.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                l1.s sVar10 = (l1.s) nVar10;
                if (!sVar10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    sVar10.W();
                } else {
                    ua.b(ub.a.e0(sVar10, R.string.srs_new), j0.c.B(oVar, 6, 1), ((h1.s1) sVar10.j(h1.v1.f31180a)).f31022d, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar10.j(fc.f30256a)).f30181o, sVar10, 48, 0, 65528);
                }
                break;
            case 10:
                l1.n nVar11 = (l1.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                l1.s sVar11 = (l1.s) nVar11;
                if (!sVar11.T(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    sVar11.W();
                } else {
                    ua.b(ub.a.e0(sVar11, R.string.srs_future_reviews_title), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar11, 0, 0, 131070);
                }
                break;
            case 11:
                l1.n nVar12 = (l1.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                l1.s sVar12 = (l1.s) nVar12;
                if (!sVar12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    sVar12.W();
                } else {
                    z1.r rVarC = j0.c.C(oVar, 14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar12, 48);
                    int iHashCode = Long.hashCode(sVar12.T);
                    l1.q1 q1VarL = sVar12.l();
                    z1.r rVarC2 = z1.a.c(sVar12, rVarC);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar12.h0();
                    if (sVar12.S) {
                        sVar12.k(iVar);
                    } else {
                        sVar12.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, sVar12);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar12);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar12.S || !kotlin.jvm.internal.m.a(sVar12.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar12, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar12);
                    k2.b bVarY = se.k.y(R.drawable.search_24px, sVar12, 0);
                    l1.c3 c3Var = h1.v1.f31180a;
                    h1.r4.b(bVarY, null, j0.e2.n(oVar, 24), ((h1.s1) sVar12.j(c3Var)).f31036s, sVar12, 432, 0);
                    j0.c.g(sVar12, j0.e2.s(oVar, 10));
                    String strE0 = ub.a.e0(sVar12, R.string.srs_future_reviews_search_hint);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    iu.k.c(strE0, new j0.i1(1.0f, true), j3.y0.a(((dc) sVar12.j(fc.f30256a)).f30177j, ((h1.s1) sVar12.j(c3Var)).f31036s, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), 2, false, 1, 0, new s0.g(fr.j3.A(11), fr.j3.A(16), fr.j3.z(0.25d)), sVar12, 1597440, 168);
                    sVar12.p(true);
                }
                break;
            case 12:
                l1.n nVar13 = (l1.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                l1.s sVar13 = (l1.s) nVar13;
                if (!sVar13.T(1 & iIntValue13, (iIntValue13 & 3) != 2)) {
                    sVar13.W();
                } else {
                    ua.b(ub.a.e0(sVar13, R.string.srs_future_reviews_search_hint), null, 0L, fr.j3.A(14), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar13, 3072, 0, 131062);
                }
                break;
            case 13:
                l1.n nVar14 = (l1.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                l1.s sVar14 = (l1.s) nVar14;
                if (!sVar14.T(1 & iIntValue14, (iIntValue14 & 3) != 2)) {
                    sVar14.W();
                } else {
                    h1.r4.b(se.k.y(R.drawable.search_24px, sVar14, 0), null, null, 0L, sVar14, 48, 12);
                }
                break;
            case 14:
                l1.n nVar15 = (l1.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                l1.s sVar15 = (l1.s) nVar15;
                if (!sVar15.T(1 & iIntValue15, (iIntValue15 & 3) != 2)) {
                    sVar15.W();
                } else {
                    h1.r4.b(se.k.y(R.drawable.close_24px, sVar15, 0), ub.a.e0(sVar15, R.string.cancel), null, 0L, sVar15, 0, 12);
                }
                break;
            case 15:
                l1.n nVar16 = (l1.n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                l1.s sVar16 = (l1.s) nVar16;
                if (!sVar16.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    sVar16.W();
                } else {
                    String strE1 = ub.a.e0(sVar16, R.string.words_amp_sentences);
                    l1.d0 d0Var = ua.f31167a;
                    j3.y0 y0Var3 = (j3.y0) sVar16.j(d0Var);
                    long j11 = ((j3.y0) sVar16.j(d0Var)).f35827a.f35755b;
                    fr.j3.i(j11);
                    iu.k.c(strE1, null, y0Var3, 0, false, 2, 0, new s0.g(fr.j3.L(1095216660480L & j11, (float) (((double) v3.o.c(j11)) * 0.5d)), ((j3.y0) sVar16.j(d0Var)).f35827a.f35755b, fr.j3.A(1)), sVar16, 1572864, 186);
                }
                break;
            case 16:
                l1.n nVar17 = (l1.n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                l1.s sVar17 = (l1.s) nVar17;
                if (!sVar17.T(1 & iIntValue17, (iIntValue17 & 3) != 2)) {
                    sVar17.W();
                } else {
                    h1.r4.b(se.k.y(R.drawable.list_24px, sVar17, 0), null, null, ((h1.s1) sVar17.j(h1.v1.f31180a)).f31036s, sVar17, 48, 4);
                }
                break;
            case 17:
                l1.n nVar18 = (l1.n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                l1.s sVar18 = (l1.s) nVar18;
                if (!sVar18.T(1 & iIntValue18, (iIntValue18 & 3) != 2)) {
                    sVar18.W();
                } else {
                    d0.n.c(se.k.y(R.drawable.ic_srs_index_settings, sVar18, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar18, 48, 124);
                }
                break;
            case 18:
                l1.n nVar19 = (l1.n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                l1.s sVar19 = (l1.s) nVar19;
                if (!sVar19.T(1 & iIntValue19, (iIntValue19 & 3) != 2)) {
                    sVar19.W();
                } else {
                    d0.n.c(se.k.y(R.drawable.ic_srs_notification_disabled, sVar19, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar19, 48, 124);
                }
                break;
            case 19:
                l1.n nVar20 = (l1.n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                l1.s sVar20 = (l1.s) nVar20;
                if (!sVar20.T(1 & iIntValue20, (iIntValue20 & 3) != 2)) {
                    sVar20.W();
                } else {
                    d0.n.c(se.k.y(R.drawable.ic_srs_explain, sVar20, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar20, 48, 124);
                }
                break;
            case 20:
                l1.n nVar21 = (l1.n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                l1.s sVar21 = (l1.s) nVar21;
                if (!sVar21.T(1 & iIntValue21, (iIntValue21 & 3) != 2)) {
                    sVar21.W();
                }
                break;
            case 21:
                l1.n nVar22 = (l1.n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                l1.s sVar22 = (l1.s) nVar22;
                if (!sVar22.T(1 & iIntValue22, (iIntValue22 & 3) != 2)) {
                    sVar22.W();
                } else {
                    ua.b(ub.a.e0(sVar22, R.string.srs_future_reviews_action_hide), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar22, 0, 0, 131070);
                }
                break;
            case 22:
                l1.n nVar23 = (l1.n) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                l1.s sVar23 = (l1.s) nVar23;
                if (!sVar23.T(1 & iIntValue23, (iIntValue23 & 3) != 2)) {
                    sVar23.W();
                } else {
                    ua.b(ub.a.e0(sVar23, R.string.srs_future_reviews_hide_desc), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar23, 0, 0, 131070);
                }
                break;
            case 23:
                l1.n nVar24 = (l1.n) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                l1.s sVar24 = (l1.s) nVar24;
                if (!sVar24.T(1 & iIntValue24, (iIntValue24 & 3) != 2)) {
                    sVar24.W();
                } else {
                    d0.n.c(se.k.y(R.drawable.ic_lesson_tips_btn, sVar24, 0), null, j0.e2.n(oVar, 22), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar24, 432, 120);
                }
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                l1.n nVar25 = (l1.n) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                l1.s sVar25 = (l1.s) nVar25;
                if (!sVar25.T(1 & iIntValue25, (iIntValue25 & 3) != 2)) {
                    sVar25.W();
                } else {
                    h1.r4.b(se.k.y(R.drawable.course_flashcard_hide, sVar25, 0), null, j0.e2.n(oVar, 22), ((h1.s1) sVar25.j(h1.v1.f31180a)).f31036s, sVar25, 432, 0);
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                l1.n nVar26 = (l1.n) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                l1.s sVar26 = (l1.s) nVar26;
                if (!sVar26.T(1 & iIntValue26, (iIntValue26 & 3) != 2)) {
                    sVar26.W();
                } else {
                    ua.b("-", null, 0L, fr.j3.A(20), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar26, 3078, 0, 131062);
                }
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                l1.n nVar27 = (l1.n) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                l1.s sVar27 = (l1.s) nVar27;
                if (!sVar27.T(1 & iIntValue27, (iIntValue27 & 3) != 2)) {
                    sVar27.W();
                } else {
                    ua.b("+", null, 0L, fr.j3.A(20), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar27, 3078, 0, 131062);
                }
                break;
            case 27:
                l1.n nVar28 = (l1.n) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                l1.s sVar28 = (l1.s) nVar28;
                if (!sVar28.T(1 & iIntValue28, (iIntValue28 & 3) != 2)) {
                    sVar28.W();
                } else {
                    h1.r4.b(se.k.y(R.drawable.ic_course_close, sVar28, 0), null, null, 0L, sVar28, 48, 12);
                }
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                l1.n nVar29 = (l1.n) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                l1.s sVar29 = (l1.s) nVar29;
                if (!sVar29.T(1 & iIntValue29, (iIntValue29 & 3) != 2)) {
                    sVar29.W();
                } else {
                    ua.b(ub.a.e0(sVar29, R.string.listen_along), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar29, 0, 0, 131070);
                }
                break;
            default:
                l1.n nVar30 = (l1.n) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                l1.s sVar30 = (l1.s) nVar30;
                if (!sVar30.T(1 & iIntValue30, (iIntValue30 & 3) != 2)) {
                    sVar30.W();
                } else {
                    h1.r4.c(ue.f.s(), null, null, 0L, sVar30, 48, 12);
                }
                break;
        }
        return b0Var;
    }
}
