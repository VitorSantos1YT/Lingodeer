package xu;

import com.google.api.Service;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.r4;
import h1.ua;
import j0.e2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56382a;

    public /* synthetic */ d(int i11) {
        this.f56382a = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56382a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ua.b(ub.a.e0(sVar, R.string.warnings), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar2, R.string.please_confirm_you_have_backed_up_your_progress), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar3, 0), null, null, a.f56329f, sVar3, 3120, 4);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar4, 0), null, null, g2.f0.e(4291480266L), sVar4, 3120, 4);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar5, 0), null, null, g2.f0.e(4291480266L), sVar5, 3120, 4);
                } else {
                    sVar5.W();
                }
                break;
            case 5:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar6, 0), null, null, a.f56329f, sVar6, 3120, 4);
                } else {
                    sVar6.W();
                }
                break;
            case 6:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar7, R.string.backup_amp_download), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 0, 0, 131070);
                } else {
                    sVar7.W();
                }
                break;
            case 7:
                l1.n nVar8 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.s sVar8 = (l1.s) nVar8;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar8, 0), null, null, g2.f0.e(4291480266L), sVar8, 3120, 4);
                } else {
                    sVar8.W();
                }
                break;
            case 8:
                l1.n nVar9 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                l1.s sVar9 = (l1.s) nVar9;
                if (sVar9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar9, R.string.change_nick_name), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar9, 0, 0, 131070);
                } else {
                    sVar9.W();
                }
                break;
            case 9:
                l1.n nVar10 = (l1.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                l1.s sVar10 = (l1.s) nVar10;
                if (sVar10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    d0.n.c(se.k.y(R.drawable.ic_search_friends, sVar10, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar10, 48, 124);
                } else {
                    sVar10.W();
                }
                break;
            case 10:
                l1.n nVar11 = (l1.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                l1.s sVar11 = (l1.s) nVar11;
                if (sVar11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    d0.n.c(se.k.y(R.drawable.ic_me_settings, sVar11, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar11, 48, 124);
                } else {
                    sVar11.W();
                }
                break;
            case 11:
                l1.n nVar12 = (l1.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                l1.s sVar12 = (l1.s) nVar12;
                if (sVar12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar12, R.string.search_friends), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar12, 0, 0, 131070);
                } else {
                    sVar12.W();
                }
                break;
            case 12:
                l1.n nVar13 = (l1.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                l1.s sVar13 = (l1.s) nVar13;
                if (sVar13.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.ic_search_icon, sVar13, 0), ub.a.e0(sVar13, R.string.search_friends), e2.n(z1.o.f58481a, 24), 0L, sVar13, 384, 8);
                } else {
                    sVar13.W();
                }
                break;
            case 13:
                l1.n nVar14 = (l1.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                l1.s sVar14 = (l1.s) nVar14;
                if (sVar14.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    iu.k.h(ub.a.e0(sVar14, R.string.search_hint), d2.h.a(z1.o.f58481a, 0.5f), 0L, null, null, 0L, j3.A(8), j3.A(14), null, 0L, null, 0, false, 1, 0, null, null, CropImageView.DEFAULT_ASPECT_RATIO, sVar14, 14155824, 1572864, 2031420);
                } else {
                    sVar14.W();
                }
                break;
            case 14:
                l1.n nVar15 = (l1.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                l1.s sVar15 = (l1.s) nVar15;
                if (sVar15.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.more_vert_24px, sVar15, 0), "more", null, g2.x.c(((h1.s1) sVar15.j(h1.v1.f31180a)).f31036s, 0.5f), sVar15, 48, 4);
                } else {
                    sVar15.W();
                }
                break;
            case 15:
                l1.n nVar16 = (l1.n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                l1.s sVar16 = (l1.s) nVar16;
                if (sVar16.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar16, R.string.settings), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar16, 0, 0, 131070);
                } else {
                    sVar16.W();
                }
                break;
            case 16:
                l1.n nVar17 = (l1.n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                l1.s sVar17 = (l1.s) nVar17;
                if (sVar17.T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar17, R.string.warnings), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar17, 0, 0, 131070);
                } else {
                    sVar17.W();
                }
                break;
            case 17:
                l1.n nVar18 = (l1.n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                l1.s sVar18 = (l1.s) nVar18;
                if (sVar18.T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.close_24px, sVar18, 0), null, null, 0L, sVar18, 48, 12);
                } else {
                    sVar18.W();
                }
                break;
            case 18:
                l1.n nVar19 = (l1.n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                l1.s sVar19 = (l1.s) nVar19;
                if (!sVar19.T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    sVar19.W();
                }
                break;
            case 19:
                l1.n nVar20 = (l1.n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                l1.s sVar20 = (l1.s) nVar20;
                if (sVar20.T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.close_24px, sVar20, 0), null, null, g2.x.f28617d, sVar20, 3128, 4);
                } else {
                    sVar20.W();
                }
                break;
            case 20:
                l1.n nVar21 = (l1.n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                l1.s sVar21 = (l1.s) nVar21;
                if (!sVar21.T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    sVar21.W();
                }
                break;
            case 21:
                l1.n nVar22 = (l1.n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                l1.s sVar22 = (l1.s) nVar22;
                if (sVar22.T(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ua.b("-", null, 0L, j3.A(20), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar22, 3078, 0, 131062);
                } else {
                    sVar22.W();
                }
                break;
            case 22:
                l1.n nVar23 = (l1.n) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                l1.s sVar23 = (l1.s) nVar23;
                if (sVar23.T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ua.b("+", null, 0L, j3.A(20), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar23, 3078, 0, 131062);
                } else {
                    sVar23.W();
                }
                break;
            case 23:
                l1.n nVar24 = (l1.n) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                l1.s sVar24 = (l1.s) nVar24;
                if (sVar24.T(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar24, 0), "Back", d2.h.h(z1.o.f58481a, 180.0f), 0L, sVar24, 432, 8);
                } else {
                    sVar24.W();
                }
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                l1.n nVar25 = (l1.n) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                l1.s sVar25 = (l1.s) nVar25;
                if (!sVar25.T(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    sVar25.W();
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                l1.n nVar26 = (l1.n) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                l1.s sVar26 = (l1.s) nVar26;
                if (!sVar26.T(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    sVar26.W();
                }
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                l1.n nVar27 = (l1.n) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                l1.s sVar27 = (l1.s) nVar27;
                if (sVar27.T(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    d0.n.c(se.k.y(R.drawable.ic_course_close, sVar27, 0), null, e2.n(z1.o.f58481a, 18), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar27, 432, 120);
                } else {
                    sVar27.W();
                }
                break;
            case 27:
                l1.n nVar28 = (l1.n) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                l1.s sVar28 = (l1.s) nVar28;
                if (sVar28.T(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.ic_course_close, sVar28, 0), null, null, g2.f0.e(4288519581L), sVar28, 3120, 4);
                } else {
                    sVar28.W();
                }
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                l1.n nVar29 = (l1.n) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                l1.s sVar29 = (l1.s) nVar29;
                if (sVar29.T(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    ys.a.r(sVar29, 0);
                } else {
                    sVar29.W();
                }
                break;
            default:
                l1.n nVar30 = (l1.n) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                l1.s sVar30 = (l1.s) nVar30;
                if (sVar30.T(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.close_24px, sVar30, 0), null, null, g2.x.f28618e, sVar30, 3120, 4);
                } else {
                    sVar30.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
