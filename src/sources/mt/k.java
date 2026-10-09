package mt;

import com.google.api.Service;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.ua;
import java.util.Map;
import rt.oe;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41581a;

    public /* synthetic */ k(int i11, byte b3) {
        this.f41581a = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41581a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h1.r4.b(se.k.y(R.drawable.refresh_24px, sVar, 0), null, null, 0L, sVar, 48, 12);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar2, R.string.srs_customize_suggestion_title), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 2:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar3, R.string.srs_adjust_next_review), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 3:
                ((Integer) obj).intValue();
                oe item = (oe) obj2;
                kotlin.jvm.internal.m.f(item, "item");
                return item.f50220a;
            case 4:
                ((Integer) obj2).getClass();
                b1.a((l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            case 5:
                ((Integer) obj).intValue();
                oe item2 = (oe) obj2;
                kotlin.jvm.internal.m.f(item2, "item");
                return item2.f50220a;
            case 6:
                ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f((ht.o) obj, "<unused var>");
                return qy.b0.f48488a;
            case 7:
                ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f((ht.o) obj, "<unused var>");
                return qy.b0.f48488a;
            case 8:
                ((Integer) obj).intValue();
                rt.k6 content = (rt.k6) obj2;
                kotlin.jvm.internal.m.f(content, "content");
                return ep.a.e("content_", content.f49972c.getId());
            case 9:
                int iIntValue4 = ((Integer) obj).intValue();
                rt.k6 item3 = (rt.k6) obj2;
                kotlin.jvm.internal.m.f(item3, "item");
                return nv.p.k(iIntValue4, item3.f49972c.getId(), tcppUUQxZjFdy.bBvjF);
            case 10:
                Map mapA = ((n0.x0) obj2).a();
                if (mapA.isEmpty()) {
                    return null;
                }
                return mapA;
            case 11:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    h1.r4.b(se.k.y(R.drawable.ic_pd_filter, sVar4, 0), "筛选", null, 0L, sVar4, 56, 12);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 12:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar5, R.string.lesson_starred), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 0, 0, 131070);
                } else {
                    sVar5.W();
                }
                return qy.b0.f48488a;
            case 13:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    h1.r4.b(se.k.y(R.drawable.arrow_back_24px, sVar6, 0), null, null, g2.x.f28618e, sVar6, 3128, 4);
                } else {
                    sVar6.W();
                }
                return qy.b0.f48488a;
            case 14:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar7, R.string.alphabet), null, se.i.k(sVar7, R.color.primary_black), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 0, 0, 131066);
                } else {
                    sVar7.W();
                }
                return qy.b0.f48488a;
            case 15:
                l1.n nVar8 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                l1.s sVar8 = (l1.s) nVar8;
                if (sVar8.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar8, R.string.vietnamese_alphabet_charts), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar8, 0, 0, 131070);
                } else {
                    sVar8.W();
                }
                return qy.b0.f48488a;
            case 16:
                l1.n nVar9 = (l1.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                l1.s sVar9 = (l1.s) nVar9;
                if (sVar9.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar9, R.string.hangul), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar9, 0, 0, 131070);
                } else {
                    sVar9.W();
                }
                return qy.b0.f48488a;
            case 17:
                l1.n nVar10 = (l1.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                l1.s sVar10 = (l1.s) nVar10;
                if (sVar10.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    d0.n.c(se.k.y(R.drawable.syllable_ko_han, sVar10, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar10, 48, 124);
                } else {
                    sVar10.W();
                }
                return qy.b0.f48488a;
            case 18:
                l1.n nVar11 = (l1.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                l1.s sVar11 = (l1.s) nVar11;
                if (sVar11.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    d0.n.c(se.k.y(R.drawable.syllable_ko_geul, sVar11, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar11, 48, 124);
                } else {
                    sVar11.W();
                }
                return qy.b0.f48488a;
            case 19:
                l1.n nVar12 = (l1.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                l1.s sVar12 = (l1.s) nVar12;
                if (sVar12.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar12, R.string.korean_alphabet), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar12, 0, 0, 131070);
                } else {
                    sVar12.W();
                }
                return qy.b0.f48488a;
            case 20:
                l1.n nVar13 = (l1.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                l1.s sVar13 = (l1.s) nVar13;
                if (sVar13.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar13, R.string.hangul_letters), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar13, 0, 0, 131070);
                } else {
                    sVar13.W();
                }
                return qy.b0.f48488a;
            case 21:
                l1.n nVar14 = (l1.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                l1.s sVar14 = (l1.s) nVar14;
                if (sVar14.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar14, R.string.sound_change_rules), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar14, 0, 0, 131070);
                } else {
                    sVar14.W();
                }
                return qy.b0.f48488a;
            case 22:
                l1.n nVar15 = (l1.n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                l1.s sVar15 = (l1.s) nVar15;
                if (sVar15.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar15, R.string.handwriting), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar15, 0, 0, 131070);
                } else {
                    sVar15.W();
                }
                return qy.b0.f48488a;
            case 23:
                l1.n nVar16 = (l1.n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                l1.s sVar16 = (l1.s) nVar16;
                if (!sVar16.T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    sVar16.W();
                }
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                l1.n nVar17 = (l1.n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                l1.s sVar17 = (l1.s) nVar17;
                if (sVar17.T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ua.b(ub.a.d0(R.string.lesson_s, new Object[]{"10"}, sVar17), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar17, 0, 0, 131070);
                } else {
                    sVar17.W();
                }
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                l1.n nVar18 = (l1.n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                l1.s sVar18 = (l1.s) nVar18;
                if (sVar18.T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ua.b(ub.a.d0(R.string.lesson_s, new Object[]{"11"}, sVar18), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar18, 0, 0, 131070);
                } else {
                    sVar18.W();
                }
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                l1.n nVar19 = (l1.n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                l1.s sVar19 = (l1.s) nVar19;
                if (sVar19.T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ua.b(ub.a.d0(R.string.lesson_s, new Object[]{"12"}, sVar19), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar19, 0, 0, 131070);
                } else {
                    sVar19.W();
                }
                return qy.b0.f48488a;
            case 27:
                l1.n nVar20 = (l1.n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                l1.s sVar20 = (l1.s) nVar20;
                if (sVar20.T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    z1.r rVarC = j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, 1);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar20, 0);
                    int iHashCode = Long.hashCode(sVar20.T);
                    l1.q1 q1VarL = sVar20.l();
                    z1.r rVarC2 = z1.a.c(sVar20, rVarC);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar20.h0();
                    if (sVar20.S) {
                        sVar20.k(iVar);
                    } else {
                        sVar20.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar20);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar20);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar20.S || !kotlin.jvm.internal.m.a(sVar20.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar20, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar20);
                    ua.b(ub.a.e0(sVar20, R.string.ko_syllable_lesson12_3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar20.j(fc.f30256a)).f30178k, sVar20, 0, 0, 65534);
                    sVar20.p(true);
                } else {
                    sVar20.W();
                }
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                l1.n nVar21 = (l1.n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                l1.s sVar21 = (l1.s) nVar21;
                if (sVar21.T(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ua.b(ub.a.d0(R.string.lesson_s, new Object[]{"13"}, sVar21), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar21, 0, 0, 131070);
                } else {
                    sVar21.W();
                }
                return qy.b0.f48488a;
            default:
                l1.n nVar22 = (l1.n) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                l1.s sVar22 = (l1.s) nVar22;
                if (sVar22.T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ua.b(ub.a.d0(R.string.lesson_s, new Object[]{"14"}, sVar22), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar22, 0, 0, 131070);
                } else {
                    sVar22.W();
                }
                return qy.b0.f48488a;
        }
    }
}
