package bp;

import com.google.api.Service;
import com.lingo.lingoskill.object.ConvertUtilsKt;
import com.lingo.lingoskill.object.HwCharPart;
import com.lingo.lingoskill.object.HwTCharPart;
import com.lingodeer.R;
import com.lingodeer.database.UserDataDatabase;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.ua;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4616a;

    public /* synthetic */ h1(int i11) {
        this.f4616a = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4616a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ua.b(ub.a.e0(sVar, R.string.sign_up), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar2, R.string.how_old_are_you), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 2:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar3, R.string.sign_up), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 3:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar4, R.string.your_parent_or_guardian_s_name), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 131070);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 4:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar5, R.string.your_parent_or_guardian_s_email_address), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 0, 0, 131070);
                } else {
                    sVar5.W();
                }
                return qy.b0.f48488a;
            case 5:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    dt.a0.q(ub.a.e0(sVar6, R.string.cn_character_hint), false, sVar6, 0, 2);
                } else {
                    sVar6.W();
                }
                return qy.b0.f48488a;
            case 6:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar7;
                if (!sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    sVar7.W();
                }
                return qy.b0.f48488a;
            case 7:
                l1.n nVar8 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.s sVar8 = (l1.s) nVar8;
                if (!sVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    sVar8.W();
                }
                return qy.b0.f48488a;
            case 8:
                l1.n nVar9 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                l1.s sVar9 = (l1.s) nVar9;
                if (!sVar9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    sVar9.W();
                }
                return qy.b0.f48488a;
            case 9:
                l1.n nVar10 = (l1.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                l1.s sVar10 = (l1.s) nVar10;
                if (sVar10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    d0.n.c(se.k.y(R.drawable.m13_keyboard_2, sVar10, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar10, 48, 124);
                } else {
                    sVar10.W();
                }
                return qy.b0.f48488a;
            case 10:
                l1.n nVar11 = (l1.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                l1.s sVar11 = (l1.s) nVar11;
                if (sVar11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    d0.n.c(se.k.y(R.drawable.m13_keyboard_1, sVar11, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar11, 48, 124);
                } else {
                    sVar11.W();
                }
                return qy.b0.f48488a;
            case 11:
                l1.n nVar12 = (l1.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                l1.s sVar12 = (l1.s) nVar12;
                if (sVar12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    d0.n.c(se.k.y(R.drawable.m13_hint_eye, sVar12, 0), null, d2.h.i(z1.o.f58481a, iu.k.p(sVar12), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar12, 48, 120);
                } else {
                    sVar12.W();
                }
                return qy.b0.f48488a;
            case 12:
                l1.n nVar13 = (l1.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                l1.s sVar13 = (l1.s) nVar13;
                if (sVar13.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    d0.n.c(se.k.y(R.drawable.m13_delete, sVar13, 0), null, d2.h.i(z1.o.f58481a, iu.k.p(sVar13), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar13, 48, 120);
                } else {
                    sVar13.W();
                }
                return qy.b0.f48488a;
            case 13:
                l1.n nVar14 = (l1.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                l1.s sVar14 = (l1.s) nVar14;
                if (!sVar14.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    sVar14.W();
                }
                return qy.b0.f48488a;
            case 14:
                l1.n nVar15 = (l1.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                l1.s sVar15 = (l1.s) nVar15;
                if (sVar15.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    h1.r4.b(se.k.y(R.drawable.close_24px, sVar15, 0), null, null, 0L, sVar15, 48, 12);
                } else {
                    sVar15.W();
                }
                return qy.b0.f48488a;
            case 15:
                l1.n nVar16 = (l1.n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                l1.s sVar16 = (l1.s) nVar16;
                if (sVar16.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    dt.a0.q(ub.a.e0(sVar16, R.string.word_m3_hint), false, sVar16, 0, 2);
                } else {
                    sVar16.W();
                }
                return qy.b0.f48488a;
            case 16:
                l1.n nVar17 = (l1.n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                l1.s sVar17 = (l1.s) nVar17;
                if (sVar17.T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    dt.a0.q(ub.a.e0(sVar17, R.string.word_m6_hint), false, sVar17, 0, 2);
                } else {
                    sVar17.W();
                }
                return qy.b0.f48488a;
            case 17:
                l1.n nVar18 = (l1.n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                l1.s sVar18 = (l1.s) nVar18;
                if (!sVar18.T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    sVar18.W();
                }
                return qy.b0.f48488a;
            case 18:
                t1.d dVar = bt.b.f5187k;
                l1.n nVar19 = (l1.n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                l1.s sVar19 = (l1.s) nVar19;
                if (sVar19.T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    dVar.invoke(sVar19, 0);
                } else {
                    sVar19.W();
                }
                return qy.b0.f48488a;
            case 19:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                return qy.b0.f48488a;
            case 20:
                e20.a factory = (e20.a) obj;
                a20.a it = (a20.a) obj2;
                kotlin.jvm.internal.m.f(factory, "$this$factory");
                kotlin.jvm.internal.m.f(it, "it");
                return new cu.g(((UserDataDatabase) factory.a(null, null, kotlin.jvm.internal.z.a(UserDataDatabase.class))).I());
            case 21:
                mz.c clazz = (mz.c) obj;
                List types = (List) obj2;
                kotlin.jvm.internal.m.f(clazz, "clazz");
                kotlin.jvm.internal.m.f(types, "types");
                ArrayList arrayListM = ob.f.M(j00.f.f35451a, types, true);
                kotlin.jvm.internal.m.c(arrayListM);
                return ob.f.G(clazz, arrayListM, new c00.f(0, types));
            case 22:
                mz.c clazz2 = (mz.c) obj;
                List types2 = (List) obj2;
                kotlin.jvm.internal.m.f(clazz2, "clazz");
                kotlin.jvm.internal.m.f(types2, "types");
                ArrayList arrayListM2 = ob.f.M(j00.f.f35451a, types2, true);
                kotlin.jvm.internal.m.c(arrayListM2);
                c00.a aVarG = ob.f.G(clazz2, arrayListM2, new c00.f(1, types2));
                if (aVarG != null) {
                    return qx.b.s(aVarG);
                }
                return null;
            case 23:
                l1.n nVar20 = (l1.n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                l1.s sVar20 = (l1.s) nVar20;
                if (sVar20.T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    h1.r4.c(ue.f.s(), null, j0.e2.n(z1.o.f58481a, 22), ch.h.f7041b, sVar20, 3504, 0);
                } else {
                    sVar20.W();
                }
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return Integer.valueOf(ConvertUtilsKt.toCharacterItem$lambda$2((HwTCharPart) obj, (HwTCharPart) obj2));
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return Integer.valueOf(ConvertUtilsKt.toCharacterItem$lambda$4((HwCharPart) obj, (HwCharPart) obj2));
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                l1.n nVar21 = (l1.n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                l1.s sVar21 = (l1.s) nVar21;
                if (sVar21.T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar21, R.string.email_not_found_message), j0.c.E(j0.e2.e(z1.o.f58481a, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 18, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, n3.s.K, null, 0L, new u3.k(5), 0L, 0, false, 0, 0, ((dc) sVar21.j(fc.f30256a)).f30177j, sVar21, 196656, 0, 64988);
                } else {
                    sVar21.W();
                }
                return qy.b0.f48488a;
            case 27:
                return Integer.valueOf(((d0.d2) obj2).f22659a.l());
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                l1.n nVar22 = (l1.n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                l1.s sVar22 = (l1.s) nVar22;
                if (sVar22.T(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar22, R.string.alphabet), null, se.i.k(sVar22, R.color.primary_black), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar22, 0, 0, 131066);
                } else {
                    sVar22.W();
                }
                return qy.b0.f48488a;
            default:
                l1.n nVar23 = (l1.n) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                l1.s sVar23 = (l1.s) nVar23;
                if (sVar23.T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar23, R.string.tell_me_why_feedback_regen_message), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar23.j(ua.f31167a), 0L, fr.j3.A(16), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar23, 0, 0, 65534);
                } else {
                    sVar23.W();
                }
                return qy.b0.f48488a;
        }
    }
}
