package at;

import a0.f1;
import a0.j0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.LessonState;
import com.lingodeer.data.model.LessonType;
import com.lingodeer.data.model.StoryLessonType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.d4;
import fr.j3;
import fr.p3;
import g2.x;
import h1.bc;
import h1.e0;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.u;
import j0.v;
import j0.z1;
import j3.y0;
import kotlin.NoWhenBranchMatchedException;
import l1.c3;
import l1.q1;
import l1.t;
import l1.x1;
import qy.b0;
import rt.ed;
import rt.sf;
import rt.uf;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f2855a = new t1.d(new a(0), false, 38077330);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f2856b = new t1.d(new ah.e(26), false, 243750872);

    public static final void a(boolean z11, l1.n nVar, int i11) {
        boolean z12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(922456426);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z12 = z11;
            j0.d(z12, null, f1.e(null, 3).a(f1.r(null, 3)), f1.f(null, 3).a(f1.w(null, 3)), null, f2855a, sVar, (i12 & 14) | 200064, 18);
        } else {
            z12 = z11;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m(i11, 0, z12);
        }
    }

    public static final void b(CourseLesson courseLesson, fz.c onClickDialogueLesson, l1.n nVar, int i11) {
        CourseLesson courseLesson2;
        l1.s sVar;
        long jC;
        long j11;
        int i12;
        String strM;
        kotlin.jvm.internal.m.f(courseLesson, "courseLesson");
        kotlin.jvm.internal.m.f(onClickDialogueLesson, "onClickDialogueLesson");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-378541468);
        int i13 = (sVar2.h(courseLesson) ? 4 : 2) | i11 | (sVar2.h(onClickDialogueLesson) ? 32 : 16);
        if (sVar2.T(i13 & 1, (i13 & 19) != 18)) {
            LessonState lessonState = courseLesson.getLessonState();
            int[] iArr = j.f2888a;
            int i14 = iArr[lessonState.ordinal()];
            if (i14 == 1) {
                sVar2.d0(1293877356);
                jC = ((s1) sVar2.j(v1.f31180a)).f31028j;
                sVar2.p(false);
            } else if (i14 == 2) {
                sVar2.d0(1293879564);
                jC = ((s1) sVar2.j(v1.f31180a)).f31028j;
                sVar2.p(false);
            } else {
                if (i14 != 3) {
                    throw nv.p.x(sVar2, 1293874640, false);
                }
                sVar2.d0(1293882167);
                jC = x.c(((s1) sVar2.j(v1.f31180a)).f31034q, 0.34f);
                sVar2.p(false);
            }
            int i15 = iArr[courseLesson.getLessonState().ordinal()];
            if (i15 == 1 || i15 == 2) {
                sVar2.d0(1293887405);
                j11 = ((s1) sVar2.j(v1.f31180a)).f31034q;
                sVar2.p(false);
            } else {
                if (i15 != 3) {
                    throw nv.p.x(sVar2, 1293883894, false);
                }
                sVar2.d0(1293889716);
                j11 = ((s1) sVar2.j(v1.f31180a)).f31036s;
                sVar2.p(false);
            }
            int i16 = iArr[courseLesson.getLessonState().ordinal()];
            if (i16 == 1) {
                i12 = R.drawable.ic_lesson_index_lesson_redo;
            } else if (i16 == 2) {
                i12 = R.drawable.ic_lesson_index_lesson_start;
            } else {
                if (i16 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.drawable.ic_lesson_index_lesson_start_grey;
            }
            LessonType lessonType = courseLesson.getLessonType();
            int[] iArr2 = j.f2890c;
            int i17 = iArr2[lessonType.ordinal()];
            int i18 = R.drawable.ic_lesson_index_dialog;
            if (i17 != 1 && i17 != 2) {
                if (i17 != 3) {
                    i18 = i17 != 4 ? R.drawable.ic_lesson_index_course : R.drawable.ic_lesson_index_audiolesson;
                } else {
                    i18 = R.drawable.ic_lesson_index_speak;
                }
            }
            int i19 = iArr2[courseLesson.getLessonType().ordinal()];
            if (i19 == 1) {
                strM = ep.a.m(sVar2, 1293918305, R.string.dialog_warm_up, sVar2, false);
            } else if (i19 == 2) {
                strM = ep.a.m(sVar2, 1293921664, R.string.comprehension, sVar2, false);
            } else if (i19 == 3) {
                strM = ep.a.m(sVar2, 1293924987, R.string.speaking, sVar2, false);
            } else if (i19 != 4) {
                sVar2.d0(1457091290);
                sVar2.p(false);
                strM = BuildConfig.VERSION_NAME;
            } else {
                sVar2.d0(1730585561);
                sVar2.p(false);
                strM = "Coffee Break";
            }
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar2, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            int i21 = i12;
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(y2.j.f56917f, q0VarD, sVar2);
            t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar2);
            courseLesson2 = courseLesson;
            sVar = sVar2;
            k7.d(e2.g(e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 85), r0.f.d(18), null, null, null, t1.e.d(947290460, new g(onClickDialogueLesson, courseLesson, i21, jC, i18, strM, j11, 0), sVar2), sVar, 196614, 28);
            a(courseLesson2.isCurrentOpen() && courseLesson2.getCanAccess(), sVar, 0);
            sVar.p(true);
        } else {
            courseLesson2 = courseLesson;
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(courseLesson2, i11, 0, onClickDialogueLesson);
        }
    }

    public static final void c(CourseLesson lesson, ed edVar, fz.c onClickLesson, l1.n nVar, int i11) {
        g2.j0 j0VarA;
        long j11;
        int i12;
        kotlin.jvm.internal.m.f(lesson, "lesson");
        long jC = edVar.f49698d;
        kotlin.jvm.internal.m.f(onClickLesson, "onClickLesson");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2106508279);
        int i13 = i11 | (sVar.h(lesson) ? 4 : 2) | (sVar.f(edVar) ? 32 : 16) | (sVar.h(onClickLesson) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            LessonState lessonState = lesson.getLessonState();
            int[] iArr = j.f2888a;
            int i14 = iArr[lessonState.ordinal()];
            if (i14 == 1 || i14 == 2) {
                sVar.d0(1424867833);
                sVar.p(false);
                j0VarA = p3.A(ns.o.L(new x(x.c(jC, 0.8f)), new x(jC)));
            } else {
                if (i14 != 3) {
                    throw nv.p.x(sVar, 1424865329, false);
                }
                sVar.d0(1424875460);
                c3 c3Var = v1.f31180a;
                j0VarA = p3.A(ns.o.L(new x(x.c(((s1) sVar.j(c3Var)).f31034q, 0.34f)), new x(x.c(((s1) sVar.j(c3Var)).f31034q, 0.34f))));
                sVar.p(false);
            }
            int i15 = iArr[lesson.getLessonState().ordinal()];
            if (i15 == 1 || i15 == 2) {
                sVar.d0(1424886884);
                sVar.p(false);
            } else {
                if (i15 != 3) {
                    throw nv.p.x(sVar, 1424884037, false);
                }
                sVar.d0(1424889642);
                jC = x.c(((s1) sVar.j(v1.f31180a)).f31034q, 0.34f);
                sVar.p(false);
            }
            int i16 = iArr[lesson.getLessonState().ordinal()];
            if (i16 == 1 || i16 == 2) {
                sVar.d0(1424894688);
                j11 = ((s1) sVar.j(v1.f31180a)).f31034q;
                sVar.p(false);
            } else {
                if (i16 != 3) {
                    throw nv.p.x(sVar, 1424891363, false);
                }
                sVar.d0(1424896999);
                j11 = ((s1) sVar.j(v1.f31180a)).f31036s;
                sVar.p(false);
            }
            int i17 = iArr[lesson.getLessonState().ordinal()];
            if (i17 == 1) {
                i12 = R.drawable.ic_lesson_index_lesson_redo;
            } else if (i17 == 2) {
                i12 = R.drawable.ic_lesson_index_lesson_start;
            } else {
                if (i17 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.drawable.ic_lesson_index_lesson_start_grey;
            }
            d(lesson, j0VarA, jC, edVar.f49697c, j11, i12, onClickLesson, sVar, (i13 & 14) | ((i13 << 15) & 29360128));
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i(lesson, edVar, onClickLesson, i11, 0);
        }
    }

    public static final void d(final CourseLesson lesson, final g2.j0 j0Var, final long j11, final long j12, final long j13, final int i11, final fz.c onClickLesson, l1.n nVar, final int i12) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(lesson, "lesson");
        kotlin.jvm.internal.m.f(onClickLesson, "onClickLesson");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(890169294);
        int i13 = i12 | (sVar2.h(lesson) ? 4 : 2) | (sVar2.f(j0Var) ? 32 : 16) | (sVar2.e(j11) ? 256 : 128) | (sVar2.e(j12) ? 2048 : 1024) | (sVar2.e(j13) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.d(i11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.d(R.drawable.ic_lesson_index_course) ? 1048576 : 524288);
        if ((i12 & 12582912) == 0) {
            i13 |= sVar2.h(onClickLesson) ? 8388608 : 4194304;
        }
        if (sVar2.T(i13 & 1, (4793491 & i13) != 4793490)) {
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar2, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(y2.j.f56917f, q0VarD, sVar2);
            t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar2);
            sVar = sVar2;
            k7.d(e2.g(e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 85), r0.f.d(18), null, null, null, t1.e.d(779616214, new fz.f() { // from class: at.k
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    y2.h hVar2;
                    y2.h hVar3;
                    y2.h hVar4;
                    y2.i iVar2;
                    y2.h hVar5;
                    long j14;
                    l1.s sVar3;
                    z1.o oVar2;
                    v Card = (v) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(Card, "$this$Card");
                    l1.s sVar4 = (l1.s) nVar2;
                    if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        z1.o oVar3 = z1.o.f58481a;
                        z1.r rVarD = e2.d(oVar3, 1.0f);
                        fz.c cVar = onClickLesson;
                        boolean zF = sVar4.f(cVar);
                        CourseLesson courseLesson = lesson;
                        boolean zH = zF | sVar4.h(courseLesson);
                        Object objQ = sVar4.Q();
                        if (zH || objQ == l1.m.f39353a) {
                            objQ = new e(cVar, courseLesson, 1);
                            sVar4.o0(objQ);
                        }
                        z1.r rVarO = d0.n.o(rVarD, false, null, (fz.a) objQ, 15);
                        float f5 = 20;
                        z1.r rVarE = j0.c.E(rVarO, f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                        a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar4, 48);
                        int iHashCode2 = Long.hashCode(sVar4.T);
                        q1 q1VarL2 = sVar4.l();
                        z1.r rVarC2 = z1.a.c(sVar4, rVarE);
                        y2.k.J.getClass();
                        y2.i iVar3 = y2.j.f56913b;
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar3);
                        } else {
                            sVar4.r0();
                        }
                        y2.h hVar6 = y2.j.f56917f;
                        t.J(hVar6, a2VarA, sVar4);
                        y2.h hVar7 = y2.j.f56916e;
                        t.J(hVar7, q1VarL2, sVar4);
                        y2.h hVar8 = y2.j.f56918g;
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar8);
                        }
                        y2.h hVar9 = y2.j.f56915d;
                        t.J(hVar9, rVarC2, sVar4);
                        LessonState lessonState = courseLesson.getLessonState();
                        LessonState lessonState2 = LessonState.StateRedo;
                        long j15 = j11;
                        if (lessonState == lessonState2) {
                            sVar4.d0(599487336);
                            hVar4 = hVar9;
                            hVar3 = hVar6;
                            hVar2 = hVar8;
                            ys.a.q(courseLesson, j15, j12, sVar4, 0);
                            sVar4.p(false);
                            j14 = j15;
                            hVar5 = hVar7;
                            iVar2 = iVar3;
                            sVar3 = sVar4;
                        } else {
                            hVar2 = hVar8;
                            hVar3 = hVar6;
                            hVar4 = hVar9;
                            sVar4.d0(599740544);
                            q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                            int iHashCode3 = Long.hashCode(sVar4.T);
                            q1 q1VarL3 = sVar4.l();
                            z1.r rVarC3 = z1.a.c(sVar4, oVar3);
                            sVar4.h0();
                            if (sVar4.S) {
                                sVar4.k(iVar3);
                            } else {
                                sVar4.r0();
                            }
                            t.J(hVar3, q0VarD2, sVar4);
                            t.J(hVar7, q1VarL3, sVar4);
                            if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                                defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar2);
                            }
                            t.J(hVar4, rVarC3, sVar4);
                            j0.o.a(d0.n.g(e2.n(oVar3, 42), j0Var, r0.f.d(12), 4), sVar4, 0);
                            k2.b bVarY = se.k.y(R.drawable.ic_lesson_index_course, sVar4, 0);
                            z1.r rVarN = e2.n(oVar3, 30);
                            float f11 = d0.n.t(sVar4) ? 0.8f : 1.0f;
                            iVar2 = iVar3;
                            hVar5 = hVar7;
                            j14 = j15;
                            sVar3 = sVar4;
                            d0.n.c(bVarY, null, rVarN, null, null, f11, null, sVar3, 432, 88);
                            sVar3.p(true);
                            sVar3.p(false);
                        }
                        z1.r rVarE2 = j0.c.E(oVar3, 18, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        z1.r rVarP = w4.c.p(1.0f, true, rVarE2);
                        u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
                        int iHashCode4 = Long.hashCode(sVar3.T);
                        q1 q1VarL4 = sVar3.l();
                        z1.r rVarC4 = z1.a.c(sVar3, rVarP);
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar2);
                        } else {
                            sVar3.r0();
                        }
                        t.J(hVar3, uVarA, sVar3);
                        t.J(hVar5, q1VarL4, sVar3);
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar2);
                        }
                        t.J(hVar4, rVarC4, sVar3);
                        String strQ0 = oz.x.q0(ub.a.e0(sVar3, R.string.lesson_s), "%s", String.valueOf(r7.getSortIndex()));
                        y0 y0Var = (y0) sVar3.j(ua.f31167a);
                        long jA = j3.A(r6);
                        n3.s sVar5 = n3.s.L;
                        long j16 = j13;
                        l1.s sVar6 = sVar3;
                        ua.b(strQ0, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, j16, jA, sVar5, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar6, 0, 0, 65534);
                        l1.s sVar7 = sVar6;
                        if (r7.getDescription().length() > 0) {
                            sVar7.d0(-1729648621);
                            v3.m mVarG = d4.g(sVar7);
                            v3.m mVar = v3.m.Rtl;
                            long jA2 = mVarG == mVar ? j3.A(16) : j3.A(14);
                            oVar2 = oVar3;
                            ua.b(oz.x.q0(courseLesson.getDescription(), " / ", "\n"), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, y0.a(ct.c.b(sVar7), j16, jA2, null, null, null, 0L, null, null, d4.g(sVar7) == mVar ? 6 : 0, d4.g(sVar7) == mVar ? 2 : 0, 0L, null, 16678908), sVar7, 48, 3120, 55292);
                            sVar7 = sVar7;
                        } else {
                            oVar2 = oVar3;
                            sVar7.d0(-1734422714);
                        }
                        sVar7.p(false);
                        sVar7.p(true);
                        if (r7.getCanAccess()) {
                            sVar7.d0(602412899);
                            d0.n.c(se.k.y(i11, sVar7, 0), null, d2.h.i(oVar2, iu.k.p(sVar7), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j14, 5), sVar7, 48, 56);
                            sVar7.p(false);
                        } else {
                            sVar7.d0(602201510);
                            d0.n.c(se.k.y(R.drawable.ic_lesson_index_pro, sVar7, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar7, 48, 124);
                            sVar7.p(false);
                        }
                        sVar7.p(true);
                    } else {
                        sVar4.W();
                    }
                    return b0.f48488a;
                }
            }, sVar2), sVar, 196614, 28);
            a(lesson.isCurrentOpen(), sVar, 0);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: at.l
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b.d(lesson, j0Var, j11, j12, j13, i11, onClickLesson, (l1.n) obj, t.M(i12 | 1));
                    return b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x012e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0139  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    public static final void e(int i11, int i12, long j11, String title, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        boolean z11;
        l1.s sVar;
        z1.r rVar3;
        x1 x1VarT;
        z1.r rVar4;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        float f5;
        kotlin.jvm.internal.m.f(title, "title");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1461941485);
        int i13 = (sVar2.e(j11) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i13 |= sVar2.f(title) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 == 0) {
            if ((i11 & 384) == 0) {
                rVar2 = rVar;
                i13 |= sVar2.f(rVar2) ? 256 : 128;
            }
            if ((i13 & 147) != 146) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i13 & 1, z11)) {
                if (i14 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                z1.r rVarB = j0.c.B(d0.n.h(rVar4, j11, r0.f.b(0, 50, 50, 50)), 14, 6);
                q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                iHashCode = Long.hashCode(sVar2.T);
                q1 q1VarL = sVar2.l();
                z1.r rVarC = z1.a.c(sVar2, rVarB);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                t.J(y2.j.f56917f, q0VarD, sVar2);
                t.J(y2.j.f56916e, q1VarL, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                t.J(y2.j.f56915d, rVarC, sVar2);
                y0 y0Var = (y0) sVar2.j(ua.f31167a);
                long jA = j3.A(16);
                n3.s sVar3 = n3.s.K;
                long j12 = x.f28618e;
                if (d0.n.t(sVar2)) {
                    f5 = 0.8f;
                } else {
                    f5 = 1.0f;
                }
                ua.b(title, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, x.c(j12, f5), jA, sVar3, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar2, (i13 >> 3) & 14, 0, 65534);
                sVar = sVar2;
                sVar.p(true);
                rVar3 = rVar4;
            } else {
                sVar = sVar2;
                sVar.W();
                rVar3 = rVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new n(j11, title, rVar3, i11, i12);
            }
        }
        i13 |= 384;
        rVar2 = rVar;
        if ((i13 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i13 & 1, z11)) {
            if (i14 != 0) {
                rVar4 = z1.o.f58481a;
            } else {
                rVar4 = rVar2;
            }
            z1.r rVarB2 = j0.c.B(d0.n.h(rVar4, j11, r0.f.b(0, 50, 50, 50)), 14, 6);
            q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
            iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarB2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(y2.j.f56917f, q0VarD2, sVar2);
            t.J(y2.j.f56916e, q1VarL2, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC2, sVar2);
            y0 y0Var2 = (y0) sVar2.j(ua.f31167a);
            long jA2 = j3.A(16);
            n3.s sVar4 = n3.s.K;
            long j13 = x.f28618e;
            if (d0.n.t(sVar2)) {
                f5 = 0.8f;
            } else {
                f5 = 1.0f;
            }
            ua.b(title, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var2, x.c(j13, f5), jA2, sVar4, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar2, (i13 >> 3) & 14, 0, 65534);
            sVar = sVar2;
            sVar.p(true);
            rVar3 = rVar4;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar3 = rVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(j11, title, rVar3, i11, i12);
        }
    }

    public static final void f(sf storyLesson, fz.c cVar, l1.n nVar, int i11) {
        l1.s sVar;
        long jC;
        long j11;
        int i12;
        int i13;
        String strM;
        fz.c onClickLesson = cVar;
        kotlin.jvm.internal.m.f(storyLesson, "storyLesson");
        StoryLessonType storyLessonType = storyLesson.f50393d;
        LessonState lessonState = storyLesson.f50392c;
        kotlin.jvm.internal.m.f(onClickLesson, "onClickLesson");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1622789977);
        int i14 = (sVar2.f(storyLesson) ? 4 : 2) | i11 | (sVar2.h(onClickLesson) ? 32 : 16);
        if (sVar2.T(i14 & 1, (i14 & 19) != 18)) {
            int[] iArr = j.f2888a;
            int i15 = iArr[lessonState.ordinal()];
            if (i15 == 1) {
                sVar2.d0(-428032241);
                jC = ((s1) sVar2.j(v1.f31180a)).f31028j;
                sVar2.p(false);
            } else if (i15 == 2) {
                sVar2.d0(-428030033);
                jC = ((s1) sVar2.j(v1.f31180a)).f31028j;
                sVar2.p(false);
            } else {
                if (i15 != 3) {
                    throw nv.p.x(sVar2, -428034926, false);
                }
                sVar2.d0(-428027430);
                jC = x.c(((s1) sVar2.j(v1.f31180a)).f31034q, 0.34f);
                sVar2.p(false);
            }
            int i16 = iArr[lessonState.ordinal()];
            if (i16 == 1 || i16 == 2) {
                sVar2.d0(-428022224);
                j11 = ((s1) sVar2.j(v1.f31180a)).f31034q;
                sVar2.p(false);
            } else {
                if (i16 != 3) {
                    throw nv.p.x(sVar2, -428025705, false);
                }
                sVar2.d0(-428019945);
                j11 = ((s1) sVar2.j(v1.f31180a)).f31036s;
                sVar2.p(false);
            }
            int i17 = iArr[lessonState.ordinal()];
            if (i17 == 1) {
                i12 = R.drawable.ic_lesson_index_lesson_redo;
            } else if (i17 == 2) {
                i12 = R.drawable.ic_lesson_index_lesson_start;
            } else {
                if (i17 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.drawable.ic_lesson_index_lesson_start_grey;
            }
            int[] iArr2 = j.f2889b;
            int i18 = iArr2[storyLessonType.ordinal()];
            if (i18 == 1) {
                i13 = R.drawable.ic_lesson_index_story;
            } else if (i18 == 2) {
                i13 = R.drawable.ic_lesson_index_speak;
            } else {
                if (i18 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = R.drawable.ic_lesson_index_story_leaderboard;
            }
            int i19 = iArr2[storyLessonType.ordinal()];
            if (i19 == 1) {
                strM = ep.a.m(sVar2, -427994722, R.string.story_reading, sVar2, false);
            } else if (i19 == 2) {
                strM = ep.a.m(sVar2, -427991457, R.string.story_speaking, sVar2, false);
            } else {
                if (i19 != 3) {
                    throw nv.p.x(sVar2, -427996878, false);
                }
                strM = ep.a.m(sVar2, -427988111, R.string.story_voice_share, sVar2, false);
            }
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar2, oVar);
            y2.k.J.getClass();
            String str = strM;
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(y2.j.f56917f, q0VarD, sVar2);
            t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar2);
            onClickLesson = cVar;
            k7.d(e2.g(e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 85), r0.f.d(18), null, null, null, t1.e.d(492766111, new g(onClickLesson, storyLesson, i12, jC, i13, str, j11, 1), sVar2), sVar2, 196614, 28);
            sVar = sVar2;
            a(storyLesson.f50396g && storyLesson.f50394e, sVar, 0);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(storyLesson, i11, 1, onClickLesson);
        }
    }

    public static final void g(CourseUnit courseUnit, boolean z11, fz.a onClickClose, fz.c onClickUnitOffline, fz.c onClickUnitWordReview, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(courseUnit, "courseUnit");
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onClickUnitOffline, "onClickUnitOffline");
        kotlin.jvm.internal.m.f(onClickUnitWordReview, "onClickUnitWordReview");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-281211290);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(courseUnit) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onClickClose) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onClickUnitOffline) ? 2048 : 1024;
        }
        int i13 = 0;
        if (sVar.T(i12 & 1, (i12 & 1155) != 1154)) {
            float f5 = bc.f30055a;
            long j11 = x.f28621h;
            c3 c3Var = v1.f31180a;
            e0.c(t1.e.d(-378813142, new androidx.lifecycle.viewmodel.compose.a(courseUnit, 1), sVar), null, t1.e.d(119743660, new o(i13, onClickClose), sVar), t1.e.d(-70539755, new p(i13, onClickUnitOffline, courseUnit), sVar), CropImageView.DEFAULT_ASPECT_RATIO, null, bc.a(j11, x.c(((s1) sVar.j(c3Var)).f31034q, 1.0f), x.c(((s1) sVar.j(c3Var)).f31034q, 1.0f), x.c(((s1) sVar.j(c3Var)).f31034q, 1.0f), sVar), null, sVar, 3462, 178);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q(courseUnit, z11, onClickClose, onClickUnitOffline, onClickUnitWordReview, i11);
        }
    }

    public static final void h(uf tipsLesson, boolean z11, ed edVar, fz.c cVar, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(tipsLesson, "tipsLesson");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(96783920);
        int i12 = i11 | (sVar.f(tipsLesson) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.f(edVar) ? 256 : 128) | (sVar.h(cVar) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = p3.A(ns.o.L(new x(edVar.f49699e), new x(edVar.f49700f)));
                sVar.o0(objQ);
            }
            g2.t tVar = (g2.t) objQ;
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, q0VarD, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            k7.d(e2.g(e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 68), r0.f.a(), k7.p(x.c(edVar.f49697c, 0.2f), sVar, 0), null, null, t1.e.d(790352680, new c(cVar, tipsLesson, z11, edVar, tVar), sVar), sVar, 196614, 24);
            a(tipsLesson.f50517d && tipsLesson.f50516c, sVar, 0);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(tipsLesson, z11, edVar, cVar, i11, 0);
        }
    }
}
