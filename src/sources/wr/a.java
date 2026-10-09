package wr;

import c6.f;
import com.google.api.Service;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseCharacterGroup;
import fz.e;
import g2.f0;
import h1.r4;
import h1.ua;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.s;
import org.koin.core.error.DefinitionParameterException;
import qy.b0;
import r5.d;
import vy.g;
import wz.u;
import wz.x;
import yr.j;
import yr.k;
import yr.l;
import zr.i;
import zr.n;
import zr.q;
import zr.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55195a;

    public /* synthetic */ a(int i11) {
        this.f55195a = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws DefinitionParameterException {
        Object objL;
        int i11 = this.f55195a;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                e20.a viewModel = (e20.a) obj;
                a20.a it = (a20.a) obj2;
                m.f(viewModel, "$this$viewModel");
                m.f(it, "it");
                return new q((l) viewModel.a(null, null, z.a(l.class)), (yr.b) viewModel.a(null, null, z.a(yr.b.class)));
            case 1:
                e20.a viewModel2 = (e20.a) obj;
                a20.a it2 = (a20.a) obj2;
                m.f(viewModel2, "$this$viewModel");
                m.f(it2, "it");
                return new w((j) viewModel2.a(null, null, z.a(j.class)));
            case 2:
                e20.a viewModel3 = (e20.a) obj;
                a20.a it3 = (a20.a) obj2;
                m.f(viewModel3, "$this$viewModel");
                m.f(it3, "it");
                return new n((k) viewModel3.a(null, null, z.a(k.class)), (l) viewModel3.a(null, null, z.a(l.class)), (yr.a) viewModel3.a(null, null, z.a(yr.a.class)));
            case 3:
                e20.a viewModel4 = (e20.a) obj;
                a20.a parameters = (a20.a) obj2;
                m.f(viewModel4, "$this$viewModel");
                m.f(parameters, "parameters");
                Object objB = parameters.b(z.a(CourseCharacterGroup.class));
                if (objB != null) {
                    return new i((CourseCharacterGroup) objB, (yr.m) viewModel4.a(null, null, z.a(yr.m.class)), (av.n) viewModel4.a(null, null, z.a(av.n.class)), (ur.a) viewModel4.a(null, null, z.a(ur.a.class)));
                }
                throw new DefinitionParameterException(defpackage.e.k(CourseCharacterGroup.class, new StringBuilder("No value found for type '"), '\''));
            case 4:
                g gVar = (g) obj2;
                if (!(gVar instanceof u)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? gVar : Integer.valueOf(iIntValue + 1);
            case 5:
                u uVar = (u) obj;
                g gVar2 = (g) obj2;
                if (uVar != null) {
                    return uVar;
                }
                if (gVar2 instanceof u) {
                    return (u) gVar2;
                }
                return null;
            case 6:
                x xVar = (x) obj;
                g gVar3 = (g) obj2;
                if (gVar3 instanceof u) {
                    u uVar2 = (u) gVar3;
                    Object objB2 = uVar2.b(xVar.f55552a);
                    Object[] objArr = xVar.f55553b;
                    int i12 = xVar.f55555d;
                    objArr[i12] = objB2;
                    u[] uVarArr = xVar.f55554c;
                    xVar.f55555d = i12 + 1;
                    uVarArr[i12] = uVar2;
                }
                return xVar;
            case 7:
                l1.n nVar = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar, R.string.alphabet), null, se.i.k(sVar, R.color.primary_black), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131066);
                } else {
                    sVar.W();
                }
                return b0Var;
            case 8:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar2, R.string.alphabet), null, se.i.k(sVar2, R.color.primary_black), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131066);
                } else {
                    sVar2.W();
                }
                return b0Var;
            case 9:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s sVar3 = (s) nVar3;
                if (sVar3.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    d dVar = xq.j.f56188a;
                    sVar3.e0(-534706435);
                    Object objJ = sVar3.j(f.f6624c);
                    if (objJ == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
                    }
                    r5.b bVar = (r5.b) objJ;
                    sVar3.p(false);
                    try {
                        String str = (String) bVar.c(xq.j.f56189b);
                        if (str == null) {
                            str = "LEARN";
                        }
                        objL = xq.d.valueOf(str);
                    } catch (Throwable th2) {
                        objL = com.bumptech.glide.e.l(th2);
                    }
                    Object obj3 = xq.d.LEARN;
                    if (objL instanceof qy.n) {
                        objL = obj3;
                    }
                    xq.d dVar2 = (xq.d) objL;
                    Integer num2 = (Integer) bVar.c(xq.j.f56188a);
                    xq.a.a(new xq.k(num2 != null ? num2.intValue() : 0, dVar2), sVar3, 0);
                    break;
                } else {
                    sVar3.W();
                }
                return b0Var;
            case 10:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                s sVar4 = (s) nVar4;
                if (sVar4.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar4, R.string.about_lingodeer), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 131070);
                } else {
                    sVar4.W();
                }
                return b0Var;
            case 11:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                s sVar5 = (s) nVar5;
                if (sVar5.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar5, 0), null, null, f0.e(4291480266L), sVar5, 3120, 4);
                } else {
                    sVar5.W();
                }
                return b0Var;
            case 12:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                s sVar6 = (s) nVar6;
                if (sVar6.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar6, 0), null, null, f0.e(4291480266L), sVar6, 3120, 4);
                } else {
                    sVar6.W();
                }
                return b0Var;
            case 13:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                s sVar7 = (s) nVar7;
                if (sVar7.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar7, 0), null, null, f0.e(4291480266L), sVar7, 3120, 4);
                } else {
                    sVar7.W();
                }
                return b0Var;
            case 14:
                l1.n nVar8 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                s sVar8 = (s) nVar8;
                if (sVar8.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar8, 0), null, null, f0.e(4291480266L), sVar8, 3120, 4);
                } else {
                    sVar8.W();
                }
                return b0Var;
            case 15:
                l1.n nVar9 = (l1.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                s sVar9 = (s) nVar9;
                if (sVar9.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar9, 0), null, null, f0.e(4291480266L), sVar9, 3120, 4);
                } else {
                    sVar9.W();
                }
                return b0Var;
            case 16:
                l1.n nVar10 = (l1.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                s sVar10 = (s) nVar10;
                if (sVar10.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar10, 0), null, null, f0.e(4291480266L), sVar10, 3120, 4);
                } else {
                    sVar10.W();
                }
                return b0Var;
            case 17:
                l1.n nVar11 = (l1.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                s sVar11 = (s) nVar11;
                if (sVar11.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar11, 0), null, null, f0.e(4291480266L), sVar11, 3120, 4);
                } else {
                    sVar11.W();
                }
                return b0Var;
            case 18:
                l1.n nVar12 = (l1.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                s sVar12 = (s) nVar12;
                if (sVar12.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar12, 0), null, null, f0.e(4291480266L), sVar12, 3120, 4);
                } else {
                    sVar12.W();
                }
                return b0Var;
            case 19:
                l1.n nVar13 = (l1.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                s sVar13 = (s) nVar13;
                if (sVar13.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar13, R.string.change_password), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar13, 0, 0, 131070);
                } else {
                    sVar13.W();
                }
                return b0Var;
            case 20:
                l1.n nVar14 = (l1.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                s sVar14 = (s) nVar14;
                if (sVar14.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar14, R.string.old_password), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar14, 0, 0, 131070);
                } else {
                    sVar14.W();
                }
                return b0Var;
            case 21:
                l1.n nVar15 = (l1.n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                s sVar15 = (s) nVar15;
                if (sVar15.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar15, R.string.new_password), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar15, 0, 0, 131070);
                } else {
                    sVar15.W();
                }
                return b0Var;
            case 22:
                l1.n nVar16 = (l1.n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                s sVar16 = (s) nVar16;
                if (sVar16.T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar16, R.string.confirm_new_password), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar16, 0, 0, 131070);
                } else {
                    sVar16.W();
                }
                return b0Var;
            case 23:
                l1.n nVar17 = (l1.n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                s sVar17 = (s) nVar17;
                if (!sVar17.T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    sVar17.W();
                }
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                l1.n nVar18 = (l1.n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                s sVar18 = (s) nVar18;
                if (sVar18.T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar18, R.string.clear_progress), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar18, 0, 0, 131070);
                } else {
                    sVar18.W();
                }
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                l1.n nVar19 = (l1.n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                s sVar19 = (s) nVar19;
                if (sVar19.T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar19, R.string.warnings), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar19, 0, 0, 131070);
                } else {
                    sVar19.W();
                }
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                l1.n nVar20 = (l1.n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                s sVar20 = (s) nVar20;
                if (sVar20.T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar20, R.string.erase_progress_warn), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar20, 0, 0, 131070);
                } else {
                    sVar20.W();
                }
                return b0Var;
            case 27:
                l1.n nVar21 = (l1.n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                s sVar21 = (s) nVar21;
                if (sVar21.T(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar21, R.string.account_settings), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar21, 0, 0, 131070);
                } else {
                    sVar21.W();
                }
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                l1.n nVar22 = (l1.n) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                s sVar22 = (s) nVar22;
                if (sVar22.T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar22, R.string.warnings), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar22, 0, 0, 131070);
                } else {
                    sVar22.W();
                }
                return b0Var;
            default:
                l1.n nVar23 = (l1.n) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                s sVar23 = (s) nVar23;
                if (sVar23.T(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar23, R.string.delete_account_prompt), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar23, 0, 0, 131070);
                } else {
                    sVar23.W();
                }
                return b0Var;
        }
    }
}
