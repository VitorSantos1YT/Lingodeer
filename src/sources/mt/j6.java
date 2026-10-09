package mt;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import h1.ua;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import rt.o8;
import rt.p8;
import rt.r8;
import rt.x8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j6 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v32 */
    public static final void a(x8 reviewType, o8 state, fz.c onSelectFilter, fz.c onSelectPracticeModel, fz.a onRefresh, fz.e onClickStart, l1.n nVar, int i11) {
        o8 o8Var;
        fz.c cVar;
        x8 x8Var;
        l1.s sVar;
        l1.b1 b1Var;
        Object obj;
        ?? r9;
        l1.s sVar2;
        int i12;
        z1.o oVar;
        boolean z11;
        l1.s sVar3;
        boolean z12;
        l1.s sVar4;
        int i13;
        int i14;
        String strM;
        z1.h hVar = z1.c.O;
        kotlin.jvm.internal.m.f(reviewType, "reviewType");
        kotlin.jvm.internal.m.f(state, "state");
        List<r8> list = state.f50202e;
        kotlin.jvm.internal.m.f(onSelectFilter, "onSelectFilter");
        kotlin.jvm.internal.m.f(onSelectPracticeModel, "onSelectPracticeModel");
        kotlin.jvm.internal.m.f(onRefresh, "onRefresh");
        kotlin.jvm.internal.m.f(onClickStart, "onClickStart");
        l1.s sVar5 = (l1.s) nVar;
        sVar5.f0(2020568992);
        int i15 = ((i11 & 6) == 0 ? (sVar5.d(reviewType.ordinal()) ? 4 : 2) | i11 : i11) | (sVar5.h(state) ? 32 : 16);
        if ((i11 & 384) == 0) {
            i15 |= sVar5.h(onSelectFilter) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i15 |= sVar5.h(onSelectPracticeModel) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i15 |= sVar5.h(onRefresh) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i15 |= sVar5.h(onClickStart) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if (sVar5.T(i15 & 1, (74899 & i15) != 74898)) {
            Object objQ = sVar5.Q();
            Object obj2 = l1.m.f39353a;
            if (objQ == obj2) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar5.o0(objQ);
            }
            l1.b1 b1Var2 = (l1.b1) objQ;
            int size = state.f50198a.size();
            if (!((Boolean) b1Var2.getValue()).booleanValue() || size <= 0) {
                b1Var = b1Var2;
                obj = obj2;
                r9 = 0;
                sVar5.d0(801154690);
                sVar2 = sVar5;
            } else {
                sVar5.d0(804767709);
                Object objQ2 = sVar5.Q();
                if (objQ2 == obj2) {
                    objQ2 = new n4(15, b1Var2);
                    sVar5.o0(objQ2);
                }
                r9 = 0;
                obj = obj2;
                b1Var = b1Var2;
                h1.a6.a((fz.a) objQ2, null, h1.a6.f(6, 2, null, sVar5), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(1595434408, new at.p(23, state, onRefresh), sVar5), sVar5, 6, 384, 4090);
                sVar2 = sVar5;
            }
            sVar2.p(r9);
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarV = j0.c.v(oVar2);
            j0.u uVarA = j0.t.a(j0.i.f35305c, hVar, sVar2, r9);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarV);
            y2.k.J.getClass();
            fz.a aVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(aVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar2);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar2);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar2);
            float f5 = 14;
            float f11 = 16;
            z1.r rVarE = j0.e2.e(j0.c.C(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarE);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(aVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, q0VarD, sVar2);
            l1.t.J(hVar3, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar2);
            String strE0 = ub.a.e0(sVar2, R.string.review_filter);
            l1.v1 v1Var = ua.f31167a;
            j3.y0 y0VarA = j3.y0.a((j3.y0) sVar2.j(v1Var), 0L, fr.j3.A(16), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441);
            z1.j jVar = z1.c.f58467e;
            j0.r rVar = j0.r.f35391a;
            l1.s sVar6 = sVar2;
            z1.o oVar3 = oVar2;
            int i16 = i15;
            ua.b(strE0, rVar.a(oVar2, jVar), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar6, 0, 0, 65532);
            z1.r rVarB = d2.h.b(rVar.a(oVar3, z1.c.f58468f), r0.f.d(999));
            boolean z13 = r23 > 0;
            Object objQ3 = sVar6.Q();
            if (objQ3 == obj) {
                i12 = 14;
                objQ3 = new n4(14, b1Var);
                sVar6.o0(objQ3);
            } else {
                i12 = 14;
            }
            z1.r rVarA = d2.h.a(d0.n.o(rVarB, z13, null, (fz.a) objQ3, i12), r23 > 0 ? 1.0f : 0.4f);
            float f12 = 8;
            float f13 = 4;
            z1.r rVarB2 = j0.c.B(rVarA, f12, f13);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar6, 48);
            int iHashCode3 = Long.hashCode(sVar6.T);
            l1.q1 q1VarL3 = sVar6.l();
            z1.r rVarC3 = z1.a.c(sVar6, rVarB2);
            sVar6.h0();
            if (sVar6.S) {
                sVar6.k(aVar);
            } else {
                sVar6.r0();
            }
            l1.t.J(hVar2, a2VarA, sVar6);
            l1.t.J(hVar3, q1VarL3, sVar6);
            if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar4);
            }
            l1.t.J(hVar5, rVarC3, sVar6);
            h1.r4.b(se.k.y(R.drawable.list_24px, sVar6, 0), null, null, 0L, sVar6, 48, 12);
            j0.c.g(sVar6, j0.e2.s(oVar3, f13));
            ua.b(String.valueOf((int) r23), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar6.j(v1Var), ((h1.s1) sVar6.j(h1.v1.f31180a)).f31036s, fr.j3.A(14), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar6, 0, 0, 65534);
            l1.s sVar7 = sVar6;
            sVar7.p(true);
            sVar7.p(true);
            z1.r rVarE2 = j0.e2.e(q0.c.c(j0.c.C(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2)), 1.0f);
            float f14 = 10;
            z1.h hVar6 = hVar;
            j0.u uVarA2 = j0.t.a(j0.i.g(f14), hVar6, sVar7, 6);
            int iHashCode4 = Long.hashCode(sVar7.T);
            l1.q1 q1VarL4 = sVar7.l();
            z1.r rVarC4 = z1.a.c(sVar7, rVarE2);
            sVar7.h0();
            if (sVar7.S) {
                sVar7.k(aVar);
            } else {
                sVar7.r0();
            }
            l1.t.J(hVar2, uVarA2, sVar7);
            l1.t.J(hVar3, q1VarL4, sVar7);
            if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar7, iHashCode4, hVar4);
            }
            l1.t.J(hVar5, rVarC4, sVar7);
            List listL = ns.o.L(ns.o.L(new qy.l(p8.ALL, ub.a.e0(sVar7, R.string.all)), new qy.l(p8.WEAK_ONLY, ub.a.e0(sVar7, R.string.weak_only))), ns.o.L(new qy.l(p8.SHUFFLE_20, ub.a.e0(sVar7, R.string.shuffle_20)), new qy.l(p8.SHUFFLE_40, ub.a.e0(sVar7, R.string.shuffle_40))));
            sVar7.d0(1065403604);
            Iterator it = listL.iterator();
            while (it.hasNext()) {
                List list2 = (List) it.next();
                z1.r rVarE3 = j0.e2.e(oVar3, 1.0f);
                j0.a2 a2VarA2 = j0.z1.a(j0.i.g(f14), z1.c.L, sVar7, 6);
                int iHashCode5 = Long.hashCode(sVar7.T);
                l1.q1 q1VarL5 = sVar7.l();
                z1.r rVarC5 = z1.a.c(sVar7, rVarE3);
                y2.k.J.getClass();
                fz.a aVar2 = y2.j.f56913b;
                sVar7.h0();
                if (sVar7.S) {
                    sVar7.k(aVar2);
                } else {
                    sVar7.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA2, sVar7);
                l1.t.J(y2.j.f56916e, q1VarL5, sVar7);
                y2.h hVar7 = y2.j.f56918g;
                if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode5))) {
                    defpackage.e.A(iHashCode5, sVar7, iHashCode5, hVar7);
                }
                Iterator itO = com.google.android.material.datepicker.d.o(sVar7, rVarC5, y2.j.f56915d, 1433976417, list2);
                while (itO.hasNext()) {
                    qy.l lVar = (qy.l) itO.next();
                    p8 filterMethod = (p8) lVar.f48495a;
                    String str = (String) lVar.f48496b;
                    kotlin.jvm.internal.m.f(filterMethod, "filterMethod");
                    boolean zContains = state.f50199b.contains(filterMethod);
                    float f15 = f14;
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.i1 i1Var = new j0.i1(1.0f, true);
                    z1.h hVar8 = hVar6;
                    boolean z14 = state.f50200c == filterMethod;
                    int i17 = i16;
                    Iterator it2 = it;
                    boolean zG = sVar7.g(zContains) | ((i17 & 896) == 256) | sVar7.d(filterMethod.ordinal());
                    Object objQ4 = sVar7.Q();
                    if (zG || objQ4 == obj) {
                        objQ4 = new dt.l4(zContains, onSelectFilter, filterMethod, 2);
                        sVar7.o0(objQ4);
                    }
                    c(i1Var, str, z14, zContains, (fz.a) objQ4, sVar7, 0);
                    hVar6 = hVar8;
                    f14 = f15;
                    i16 = i17;
                    it = it2;
                }
                sVar7.p(false);
                sVar7.p(true);
                f14 = f14;
                it = it;
            }
            o8Var = state;
            cVar = onSelectFilter;
            float f16 = f14;
            z1.h hVar9 = hVar6;
            int i18 = i16;
            sVar7.p(false);
            sVar7.p(true);
            x8Var = reviewType;
            if (x8Var != x8.CHARACTER) {
                sVar7.d0(-893150043);
                j0.c.g(sVar7, j0.e2.g(oVar3, 24));
                ua.b(ub.a.e0(sVar7, R.string.review_question_type), j0.e2.e(j0.c.C(j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7), 22, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar7.j(ua.f31167a), 0L, fr.j3.A(16), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar7, 48, 0, 65532);
                z1.r rVarC6 = q0.c.c(j0.c.C(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2));
                j0.u uVarA3 = j0.t.a(j0.i.g(f16), hVar9, sVar4, 6);
                int iHashCode6 = Long.hashCode(sVar4.T);
                l1.q1 q1VarL6 = sVar4.l();
                z1.r rVarC7 = z1.a.c(sVar4, rVarC6);
                y2.k.J.getClass();
                fz.a aVar3 = y2.j.f56913b;
                sVar4.h0();
                if (sVar4.S) {
                    sVar4 = sVar7;
                    sVar4.k(aVar3);
                } else {
                    sVar4 = sVar7;
                    sVar4.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA3, sVar4);
                l1.t.J(y2.j.f56916e, q1VarL6, sVar4);
                y2.h hVar10 = y2.j.f56918g;
                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode6))) {
                    defpackage.e.A(iHashCode6, sVar4, iHashCode6, hVar10);
                }
                l1.t.J(y2.j.f56915d, rVarC7, sVar4);
                sVar4.d0(-609290004);
                l1.s sVar8 = sVar4;
                for (r8 r8Var : list) {
                    int[] iArr = i6.f41557a;
                    int i19 = iArr[r8Var.ordinal()];
                    if (i19 == 1) {
                        i13 = R.drawable.ic_lesson_redo_comprehensive;
                    } else if (i19 == 2) {
                        i13 = R.drawable.ic_lesson_redo_speaking;
                    } else if (i19 == 3) {
                        i13 = R.drawable.ic_lesson_redo_spelling;
                    } else if (i19 == 4) {
                        i13 = R.drawable.ic_lesson_redo_listening;
                    } else {
                        if (i19 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i13 = R.drawable.ic_lesson_redo_word_match;
                    }
                    int i21 = iArr[r8Var.ordinal()];
                    if (i21 == 1) {
                        i14 = 0;
                        strM = ep.a.m(sVar8, -609268679, R.string.review_question_type_comprehensive, sVar8, false);
                    } else if (i21 == 2) {
                        i14 = 0;
                        strM = ep.a.m(sVar8, -609264620, R.string.review_question_type_speaking, sVar8, false);
                    } else if (i21 == 3) {
                        i14 = 0;
                        strM = ep.a.m(sVar8, -609260716, R.string.review_question_type_spelling, sVar8, false);
                    } else if (i21 == 4) {
                        i14 = 0;
                        strM = ep.a.m(sVar8, -609256779, R.string.review_question_type_listening, sVar8, false);
                    } else {
                        if (i21 != 5) {
                            throw nv.p.x(sVar8, -609270705, false);
                        }
                        i14 = 0;
                        strM = ep.a.m(sVar8, -609252778, R.string.review_question_type_word_match, sVar8, false);
                    }
                    int i22 = o8Var.f50204g == r8Var ? 1 : i14;
                    boolean zContains2 = o8Var.f50203f.contains(r8Var);
                    z1.o oVar4 = oVar3;
                    z1.r rVarE4 = j0.c.E(oVar4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, r8Var == ry.m.q0(list) ? f12 : i14, 7);
                    boolean z15 = i22;
                    boolean zH = sVar8.h(o8Var) | sVar8.d(r8Var.ordinal()) | ((i18 & 7168) == 2048);
                    Object objQ5 = sVar8.Q();
                    if (zH || objQ5 == obj) {
                        objQ5 = new l0(o8Var, r8Var, onSelectPracticeModel);
                        sVar8.o0(objQ5);
                    }
                    l1.s sVar9 = sVar8;
                    b(i13, 0, (fz.a) objQ5, strM, sVar9, rVarE4, z15, zContains2);
                    sVar8 = sVar9;
                    oVar3 = oVar4;
                }
                oVar = oVar3;
                z11 = false;
                com.google.android.material.datepicker.d.B(sVar8, false, true, false);
                sVar3 = sVar8;
            } else {
                oVar = oVar3;
                z11 = false;
                sVar7.d0(-900687848);
                sVar7.p(false);
            }
            if (r23 > 0) {
                sVar3 = sVar7;
                z12 = true;
            } else {
                sVar3 = sVar7;
                z12 = z11;
            }
            z1.r rVarE5 = j0.e2.e(j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 20, CropImageView.DEFAULT_ASPECT_RATIO, f11, 5), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
            boolean zH2 = sVar3.h(o8Var) | ((458752 & i18) == 131072 ? true : z11);
            Object objQ6 = sVar3.Q();
            if (zH2 || objQ6 == obj) {
                objQ6 = new l1.z1(14, onClickStart, o8Var);
                sVar3.o0(objQ6);
            }
            l1.s sVar10 = sVar3;
            iu.k.e((fz.a) objQ6, rVarE5, z12, 0L, null, t1.e.d(822689343, new fu.b0(size, 12), sVar3), sVar10, 196608, 24);
            l1.s sVar11 = sVar10;
            sVar11.p(true);
            sVar = sVar11;
        } else {
            o8Var = state;
            cVar = onSelectFilter;
            x8Var = reviewType;
            sVar5.W();
            sVar = sVar5;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.d(x8Var, (Object) o8Var, cVar, onSelectPracticeModel, (qy.e) onRefresh, (Object) onClickStart, i11, 8);
        }
    }

    public static final void b(int i11, int i12, fz.a aVar, String str, l1.n nVar, z1.r rVar, boolean z11, boolean z12) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1579578924);
        int i13 = (sVar.f(rVar) ? 4 : 2) | i12 | (sVar.d(i11) ? 32 : 16) | (sVar.f(str) ? 256 : 128) | (sVar.g(z11) ? 2048 : 1024) | (sVar.g(z12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(aVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar.T(i13 & 1, (74899 & i13) != 74898)) {
            k7.k(d2.h.a(rVar, z12 ? 1.0f : 0.45f), r0.f.d(12), null, null, null, t1.e.d(-2101541320, new g6(z11, z12, aVar, i11, str), sVar), sVar, 196608, 28);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new l(rVar, i11, str, z11, z12, aVar, i12);
        }
    }

    public static final void c(z1.r rVar, String str, boolean z11, boolean z12, fz.a aVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1372747651);
        int i12 = (sVar.f(rVar) ? 4 : 2) | i11 | (sVar.f(str) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.g(z12) ? 2048 : 1024) | (sVar.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            k7.k(d2.h.a(rVar, z12 ? 1.0f : 0.45f), r0.f.d(12), null, null, null, t1.e.d(-978640911, new b5(z11, z12, aVar, str), sVar), sVar, 196608, 28);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.e2(rVar, str, z11, z12, aVar, i11);
        }
    }

    public static final void d(rt.k6 k6Var, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1244419159);
        int i12 = (sVar.h(k6Var) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            boolean z11 = k6Var.f49972c.getLastStudyStatus() == wt.o.WRONG;
            z1.i iVar = z1.c.M;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = j0.c.C(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 8, 1);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarC);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            WordSentenceCharacterType wordSentenceCharacterType = k6Var.f49973d;
            boolean z12 = wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType;
            j0.c2 c2Var = j0.c2.f35266a;
            if (z12) {
                sVar.d0(1771946013);
                f6.a((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType, z11, c2Var.a(oVar, 1.0f), sVar, 0);
                sVar.p(false);
            } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType) {
                sVar.d0(1771953656);
                f6.c((WordSentenceCharacterType.WordType) wordSentenceCharacterType, z11, c2Var.a(oVar, 1.0f), sVar, 0);
                sVar.p(false);
            } else {
                if (!(wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType)) {
                    throw nv.p.x(sVar, 1771942872, false);
                }
                sVar.d0(1771961276);
                f6.b((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType, z11, c2Var.a(oVar, 1.0f), sVar, 0);
                sVar.p(false);
            }
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y5(k6Var, i11);
        }
    }

    public static final void e(List list, boolean z11, fz.a aVar, l1.n nVar, int i11) {
        boolean z12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(526214987);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            float f5 = ((Configuration) sVar.j(AndroidCompositionLocals_androidKt.f1199a)).screenHeightDp * 0.6f;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = j0.e2.e(oVar, 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            float f11 = 16;
            z1.r rVarE2 = j0.e2.e(j0.c.E(j0.c.C(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12, 7), 1.0f);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            String strD0 = ub.a.d0(R.string.review_practice_list_title, new Object[]{Integer.valueOf(list.size())}, sVar);
            j3.y0 y0VarA = j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, fr.j3.A(16), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441);
            z1.j jVar = z1.c.f58467e;
            j0.r rVar = j0.r.f35391a;
            ua.b(strD0, j0.e2.e(j0.c.C(rVar.a(oVar, jVar), 22, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, 0, 0, 65532);
            sVar = sVar;
            if (z11) {
                sVar.d0(-1580204568);
                k7.h(aVar, rVar.a(oVar, z1.c.f58468f), false, null, g.H0, sVar, ((i12 >> 6) & 14) | 196608, 28);
                z12 = false;
            } else {
                z12 = false;
                sVar.d0(-1591988877);
            }
            sVar.p(z12);
            sVar.p(true);
            z1.r rVarI = j0.e2.i(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f5, 1);
            float f12 = 8;
            j0.v1 v1Var = new j0.v1(f11, f12, f11, f12);
            boolean zH = sVar.h(list);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new iu.d(1, list);
                sVar.o0(objQ);
            }
            ue.f.a(rVarI, null, v1Var, null, null, null, false, null, (fz.c) objQ, sVar, 384, 506);
            ep.a.C(oVar, f11, sVar, true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.b0(list, z11, aVar, i11, 10);
        }
    }
}
