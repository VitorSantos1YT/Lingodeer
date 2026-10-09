package dt;

import android.content.Context;
import com.google.api.Service;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23825a;

    public /* synthetic */ g(int i11) {
        this.f23825a = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23825a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h1.r4.b(se.k.y(R.drawable.close_24px, sVar2, 0), null, null, 0L, sVar2, 48, 12);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 2:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar3, R.string.ar_alphabet_content_64), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 3:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar4, R.string.korean_alphabet_charts), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 131070);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 4:
                m0.t items = (m0.t) obj;
                qy.r rVar = (qy.r) obj2;
                kotlin.jvm.internal.m.f(items, "$this$items");
                kotlin.jvm.internal.m.f(rVar, "<destruct>");
                return new m0.d(ob.f.a(((Boolean) rVar.f48507c).booleanValue() ? 2 : 1));
            case 5:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar5, R.string.chinese_tone_index_title), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 0, 0, 131070);
                } else {
                    sVar5.W();
                }
                return qy.b0.f48488a;
            case 6:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    d0.n.c(se.k.y(R.drawable.ic_dialogue_hint, sVar6, 0), null, j0.e2.n(z1.o.f58481a, 24), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar6, 432, 120);
                } else {
                    sVar6.W();
                }
                return qy.b0.f48488a;
            case 7:
                e20.a single = (e20.a) obj;
                a20.a it = (a20.a) obj2;
                kotlin.jvm.internal.m.f(single, "$this$single");
                kotlin.jvm.internal.m.f(it, "it");
                return new gv.h((Context) single.a(null, null, kotlin.jvm.internal.z.a(Context.class)), (dv.u0) single.a(null, null, kotlin.jvm.internal.z.a(dv.u0.class)), (vt.n0) single.a(null, null, kotlin.jvm.internal.z.a(vt.n0.class)));
            case 8:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ua.b("Reminders", null, 0L, fr.j3.A(18), null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 199686, 0, 131030);
                } else {
                    sVar7.W();
                }
                return qy.b0.f48488a;
            case 9:
                l1.n nVar8 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.s sVar8 = (l1.s) nVar8;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ua.b("Reminder time", null, 0L, fr.j3.A(18), null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar8, 199686, 0, 131030);
                } else {
                    sVar8.W();
                }
                return qy.b0.f48488a;
            case 10:
                l1.n nVar9 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                l1.s sVar9 = (l1.s) nVar9;
                if (sVar9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    h1.r4.b(se.k.y(R.drawable.keyboard_arrow_left_24px, sVar9, 0), null, null, 0L, sVar9, 48, 12);
                } else {
                    sVar9.W();
                }
                return qy.b0.f48488a;
            case 11:
                l1.n nVar10 = (l1.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                l1.s sVar10 = (l1.s) nVar10;
                if (sVar10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    h1.r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar10, 0), null, null, 0L, sVar10, 48, 12);
                } else {
                    sVar10.W();
                }
                return qy.b0.f48488a;
            case 12:
                l1.n nVar11 = (l1.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                l1.s sVar11 = (l1.s) nVar11;
                if (sVar11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    h1.r4.b(se.k.y(R.drawable.close_24px, sVar11, 0), null, null, g2.x.f28618e, sVar11, 3120, 4);
                } else {
                    sVar11.W();
                }
                return qy.b0.f48488a;
            case 13:
                l1.n nVar12 = (l1.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                l1.s sVar12 = (l1.s) nVar12;
                if (sVar12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    h1.r4.b(se.k.y(R.drawable.close_24px, sVar12, 0), null, null, 0L, sVar12, 48, 12);
                } else {
                    sVar12.W();
                }
                return qy.b0.f48488a;
            case 14:
                l1.n nVar13 = (l1.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                l1.s sVar13 = (l1.s) nVar13;
                if (sVar13.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    h1.r4.b(se.k.y(R.drawable.arrow_back_24px, sVar13, 0), null, null, se.i.k(sVar13, R.color.color_9D9D9D), sVar13, 56, 4);
                } else {
                    sVar13.W();
                }
                return qy.b0.f48488a;
            case 15:
                l1.n nVar14 = (l1.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                l1.s sVar14 = (l1.s) nVar14;
                if (sVar14.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    h1.r4.b(se.k.y(R.drawable.close_24px, sVar14, 0), null, null, se.i.k(sVar14, R.color.color_9D9D9D), sVar14, 56, 4);
                } else {
                    sVar14.W();
                }
                return qy.b0.f48488a;
            case 16:
                l1.n nVar15 = (l1.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                l1.s sVar15 = (l1.s) nVar15;
                if (!sVar15.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    sVar15.W();
                }
                return qy.b0.f48488a;
            case 17:
                String status = ((ReviewNew) obj).getStatus();
                kotlin.jvm.internal.m.e(status, "getStatus(...)");
                String status2 = ((ReviewNew) obj2).getStatus();
                kotlin.jvm.internal.m.e(status2, "getStatus(...)");
                return Integer.valueOf(status.compareToIgnoreCase(status2));
            case 18:
                l1.n nVar16 = (l1.n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                l1.s sVar16 = (l1.s) nVar16;
                if (sVar16.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar16, R.string.alphabet), null, se.i.k(sVar16, R.color.primary_black), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar16, 0, 0, 131066);
                } else {
                    sVar16.W();
                }
                return qy.b0.f48488a;
            case 19:
                l1.n nVar17 = (l1.n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                l1.s sVar17 = (l1.s) nVar17;
                if (sVar17.T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    h1.h0.f30315a.a(null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, sVar17, 196608);
                } else {
                    sVar17.W();
                }
                return qy.b0.f48488a;
            case 20:
                l1.n nVar18 = (l1.n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                l1.s sVar18 = (l1.s) nVar18;
                if (!sVar18.T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    sVar18.W();
                }
                return qy.b0.f48488a;
            case 21:
                l1.n nVar19 = (l1.n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                l1.s sVar19 = (l1.s) nVar19;
                if (sVar19.T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    h1.r4.b(se.k.y(R.drawable.arrow_back_24px, sVar19, 0), "Back", null, 0L, sVar19, 48, 12);
                } else {
                    sVar19.W();
                }
                return qy.b0.f48488a;
            case 22:
                l1.n nVar20 = (l1.n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                l1.s sVar20 = (l1.s) nVar20;
                if (sVar20.T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar20, R.string.introduction), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar20, 0, 0, 131070);
                } else {
                    sVar20.W();
                }
                return qy.b0.f48488a;
            case 23:
                l1.n nVar21 = (l1.n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                l1.s sVar21 = (l1.s) nVar21;
                if (sVar21.T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar21, R.string.japanese_alphabet), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar21, 0, 0, 131070);
                } else {
                    sVar21.W();
                }
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                l1.n nVar22 = (l1.n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                l1.s sVar22 = (l1.s) nVar22;
                if (sVar22.T(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar22, R.string.introduction), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar22, 0, 0, 131070);
                } else {
                    sVar22.W();
                }
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                l1.n nVar23 = (l1.n) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                l1.s sVar23 = (l1.s) nVar23;
                if (sVar23.T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar23, R.string.jp_syllable_overview_intro_s01_note01), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, iv.j0.b(sVar23), sVar23, 0, 0, 65534);
                } else {
                    sVar23.W();
                }
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                l1.n nVar24 = (l1.n) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                l1.s sVar24 = (l1.s) nVar24;
                if (sVar24.T(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    j0.u uVarA = j0.t.a(j0.i.g(8), z1.c.O, sVar24, 6);
                    int iHashCode = Long.hashCode(sVar24.T);
                    l1.q1 q1VarL = sVar24.l();
                    z1.r rVarC = z1.a.c(sVar24, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar24.h0();
                    if (sVar24.S) {
                        sVar24.k(iVar);
                    } else {
                        sVar24.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar24);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar24);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar24.S || !kotlin.jvm.internal.m.a(sVar24.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar24, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar24);
                    iv.z0.s(ub.a.e0(sVar24, R.string.jp_syllable_overview_intro_s02_note01), sVar24, 0);
                    iv.z0.s(ub.a.e0(sVar24, R.string.jp_syllable_overview_intro_s02_note02), sVar24, 0);
                    iv.z0.s(ub.a.e0(sVar24, R.string.jp_syllable_overview_intro_s02_note03), sVar24, 0);
                    sVar24.p(true);
                } else {
                    sVar24.W();
                }
                return qy.b0.f48488a;
            case 27:
                l1.n nVar25 = (l1.n) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                l1.s sVar25 = (l1.s) nVar25;
                if (sVar25.T(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    iv.b1.k(R.string.jp_syllable_overview_intro_s02_note04, true, sVar25, 48, 0);
                } else {
                    sVar25.W();
                }
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                l1.n nVar26 = (l1.n) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                l1.s sVar26 = (l1.s) nVar26;
                if (sVar26.T(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    iv.b1.k(R.string.jp_syllable_overview_intro_s02_note05, true, sVar26, 48, 0);
                } else {
                    sVar26.W();
                }
                return qy.b0.f48488a;
            default:
                l1.n nVar27 = (l1.n) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                l1.s sVar27 = (l1.s) nVar27;
                if (sVar27.T(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    j0.u uVarA2 = j0.t.a(j0.i.g(8), z1.c.O, sVar27, 6);
                    int iHashCode2 = Long.hashCode(sVar27.T);
                    l1.q1 q1VarL2 = sVar27.l();
                    z1.r rVarC2 = z1.a.c(sVar27, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar27.h0();
                    if (sVar27.S) {
                        sVar27.k(iVar2);
                    } else {
                        sVar27.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar27);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar27);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar27.S || !kotlin.jvm.internal.m.a(sVar27.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar27, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar27);
                    iv.z0.s(ub.a.e0(sVar27, R.string.jp_syllable_overview_intro_s03_note01), sVar27, 0);
                    iv.z0.s(ub.a.e0(sVar27, R.string.jp_syllable_overview_intro_s03_note02), sVar27, 0);
                    iv.z0.s(ub.a.e0(sVar27, R.string.jp_syllable_overview_intro_s03_note03), sVar27, 0);
                    sVar27.p(true);
                } else {
                    sVar27.W();
                }
                return qy.b0.f48488a;
        }
    }
}
