package mt;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CourseQuestionPreferenceContext;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import rt.f9;
import rt.g9;
import rt.h9;
import rt.ja;
import rt.l9;
import rt.nc;
import rt.pc;
import rt.qc;
import rt.rc;
import rt.z8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean, int] */
    public static final void a(rt.e3 e3Var, fz.a onFinish, boolean z11, fz.a onSummaryContinueRequest, fz.c loginNow, l1.n nVar, int i11) {
        l1.s sVar;
        l1.b1 b1VarO;
        Object obj;
        ?? r9;
        Object tVar;
        l1.b1 b1Var;
        l1.b1 b1Var2;
        z1.r rVar;
        l1.b1 b1Var3;
        rt.e3 courseTestViewModel = e3Var;
        kotlin.jvm.internal.m.f(courseTestViewModel, "courseTestViewModel");
        kotlin.jvm.internal.m.f(onFinish, "onFinish");
        kotlin.jvm.internal.m.f(onSummaryContinueRequest, "onSummaryContinueRequest");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-144877144);
        int i12 = i11 | (sVar2.h(courseTestViewModel) ? 4 : 2) | (sVar2.h(onFinish) ? 32 : 16) | (sVar2.g(z11) ? 256 : 128) | (sVar2.h(onSummaryContinueRequest) ? 2048 : 1024) | (sVar2.h(loginNow) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar2.T(i12 & 1, (i12 & 9363) != 9362)) {
            l1.b1 b1VarO2 = l1.t.o(courseTestViewModel.K0, sVar2);
            l1.b1 b1VarO3 = l1.t.o(courseTestViewModel.T, sVar2);
            l1.b1 b1VarO4 = l1.t.o(courseTestViewModel.f50716j0, sVar2);
            Object objQ = sVar2.Q();
            Object obj2 = l1.m.f39353a;
            if (objQ == obj2) {
                objQ = l1.t.B(null);
                sVar2.o0(objQ);
            }
            l1.b1 b1Var4 = (l1.b1) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == obj2) {
                objQ2 = l1.t.B(null);
                sVar2.o0(objQ2);
            }
            l1.b1 b1Var5 = (l1.b1) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == obj2) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            }
            l1.b1 b1Var6 = (l1.b1) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == obj2) {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ4);
            }
            l1.b1 b1Var7 = (l1.b1) objQ4;
            boolean zF = sVar2.f((ja) b1Var4.getValue());
            Object objQ5 = sVar2.Q();
            if (zF || objQ5 == obj2) {
                ja jaVar = (ja) b1Var4.getValue();
                objQ5 = jaVar != null ? courseTestViewModel.y(jaVar) : null;
                sVar2.o0(objQ5);
            }
            uz.g1 g1Var = (uz.g1) objQ5;
            if (g1Var == null) {
                sVar2.d0(408203465);
                sVar2.p(false);
                b1VarO = null;
            } else {
                sVar2.d0(-1787947464);
                b1VarO = l1.t.o(g1Var, sVar2);
                sVar2.p(false);
            }
            if (b1VarO == null) {
                sVar2.d0(408224422);
                Object objQ6 = sVar2.Q();
                if (objQ6 == obj2) {
                    objQ6 = l1.t.B(ry.r.f50854a);
                    sVar2.o0(objQ6);
                }
                b1VarO = (l1.b1) objQ6;
                sVar2.p(false);
            } else {
                sVar2.d0(-1787952585);
                sVar2.p(false);
            }
            ja jaVar2 = (ja) b1Var4.getValue();
            List list = (List) b1VarO.getValue();
            rt.p pVar = (rt.p) b1VarO4.getValue();
            boolean zBooleanValue = ((Boolean) b1Var7.getValue()).booleanValue();
            boolean zH = sVar2.h(courseTestViewModel);
            Object objQ7 = sVar2.Q();
            if (zH || objQ7 == obj2) {
                obj = obj2;
                Object m0Var = new d0.m0(2, courseTestViewModel, rt.e3.class, "createFolder", "createFolder(Lcom/lingodeer/course/viewmodels/CourseTestBookmarkTarget;Ljava/lang/String;)V", 0, 8);
                sVar2.o0(m0Var);
                objQ7 = m0Var;
            } else {
                obj = obj2;
            }
            fz.e eVar = (fz.e) ((mz.e) objQ7);
            boolean zH2 = sVar2.h(courseTestViewModel);
            Object objQ8 = sVar2.Q();
            if (zH2 || objQ8 == obj) {
                Object m0Var2 = new d0.m0(2, courseTestViewModel, rt.e3.class, "addBookmarkToFolder", "addBookmarkToFolder(Lcom/lingodeer/course/viewmodels/CourseTestBookmarkTarget;Ljava/lang/String;)V", 0, 9);
                sVar2.o0(m0Var2);
                objQ8 = m0Var2;
            }
            fz.e eVar2 = (fz.e) ((mz.e) objQ8);
            Object objQ9 = sVar2.Q();
            if (objQ9 == obj) {
                objQ9 = new ch.h0(b1Var4, b1Var7, 7);
                sVar2.o0(objQ9);
            }
            fz.a aVar = (fz.a) objQ9;
            Object objQ10 = sVar2.Q();
            if (objQ10 == obj) {
                objQ10 = new bp.i2(b1Var5, b1Var6, 14);
                sVar2.o0(objQ10);
            }
            fz.c cVar = (fz.c) objQ10;
            boolean zH3 = sVar2.h(courseTestViewModel);
            Object objQ11 = sVar2.Q();
            if (zH3 || objQ11 == obj) {
                Object y2Var = new bt.y2(0, courseTestViewModel, rt.e3.class, "clearBookmarkFolderOperationResult", "clearBookmarkFolderOperationResult()V", 0, 26);
                sVar2.o0(y2Var);
                objQ11 = y2Var;
            }
            g.i(jaVar2, list, pVar, zBooleanValue, null, eVar, eVar2, aVar, cVar, (fz.a) ((mz.e) objQ11), sVar2, 113246208, 16);
            if (((Boolean) b1Var6.getValue()).booleanValue()) {
                sVar2.d0(409002274);
                ja jaVar3 = (ja) b1Var5.getValue();
                Object objQ12 = sVar2.Q();
                if (objQ12 == obj) {
                    objQ12 = new fu.y(b1Var6, b1Var5, null, 3);
                    sVar2.o0(objQ12);
                }
                l1.t.f((fz.e) objQ12, jaVar3, sVar2);
                r9 = 0;
            } else {
                r9 = 0;
                sVar2.d0(389465082);
            }
            sVar2.p(r9);
            CourseTestFinishSummaryUiState courseTestFinishSummaryUiState = (CourseTestFinishSummaryUiState) b1VarO2.getValue();
            if (kotlin.jvm.internal.m.a(courseTestFinishSummaryUiState, CourseTestFinishSummaryUiState.Loading.INSTANCE)) {
                sVar2.d0(-1787913449);
                tv.a.d(r9, 1, sVar2, null);
                sVar2.p(r9);
                sVar = sVar2;
            } else {
                if (!(courseTestFinishSummaryUiState instanceof CourseTestFinishSummaryUiState.Success)) {
                    throw nv.p.x(sVar2, -1787913123, r9);
                }
                sVar2.d0(-1787908696);
                z1.r rVarD = j0.e2.d(z1.o.f58481a, 1.0f);
                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, r9);
                int iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL = sVar2.l();
                z1.r rVarC = z1.a.c(sVar2, rVarD);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                y2.h hVar = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar2);
                CoursePracticeType coursePracticeType = CoursePracticeType.COURSE_REVIEW_WORD_SENT;
                CourseTestFinishSummaryUiState courseTestFinishSummaryUiState2 = (CourseTestFinishSummaryUiState) b1VarO2.getValue();
                long jLongValue = ((Number) b1VarO3.getValue()).longValue();
                boolean z12 = (i12 & 112) == 32;
                Object objQ13 = sVar2.Q();
                if (z12 || objQ13 == obj) {
                    objQ13 = new e2(9, onFinish);
                    sVar2.o0(objQ13);
                }
                fz.a aVar2 = (fz.a) objQ13;
                boolean zH4 = sVar2.h(courseTestViewModel);
                Object objQ14 = sVar2.Q();
                if (zH4 || objQ14 == obj) {
                    objQ14 = new f4(courseTestViewModel, 2);
                    sVar2.o0(objQ14);
                }
                fz.e eVar3 = (fz.e) objQ14;
                boolean zH5 = sVar2.h(courseTestViewModel);
                Object objQ15 = sVar2.Q();
                if (zH5 || objQ15 == obj) {
                    b1Var = b1Var4;
                    b1Var2 = b1Var5;
                    rVar = null;
                    tVar = new bp.t(courseTestViewModel, b1Var6, b1Var2, b1Var, 23);
                    courseTestViewModel = courseTestViewModel;
                    b1Var3 = b1Var6;
                    sVar2.o0(tVar);
                } else {
                    tVar = objQ15;
                    b1Var = b1Var4;
                    b1Var3 = b1Var6;
                    b1Var2 = b1Var5;
                    rVar = null;
                }
                fz.e eVar4 = (fz.e) tVar;
                boolean zH6 = sVar2.h(courseTestViewModel);
                Object objQ16 = sVar2.Q();
                if (zH6 || objQ16 == obj) {
                    objQ16 = new f4(courseTestViewModel, 4);
                    sVar2.o0(objQ16);
                }
                fz.e eVar5 = (fz.e) objQ16;
                boolean zH7 = sVar2.h(courseTestViewModel);
                Object objQ17 = sVar2.Q();
                if (zH7 || objQ17 == obj) {
                    objQ17 = new a00.b(courseTestViewModel, 24);
                    sVar2.o0(objQ17);
                }
                fz.f fVar = (fz.f) objQ17;
                int i13 = i12 << 12;
                z1.r rVar2 = rVar;
                Object obj3 = obj;
                ys.y0.c(coursePracticeType, courseTestFinishSummaryUiState2, jLongValue, true, aVar2, loginNow, z11, onSummaryContinueRequest, null, eVar3, eVar4, eVar5, fVar, null, sVar2, ((i12 << 3) & 458752) | 3078 | (3670016 & i13) | (i13 & 29360128), 8448);
                l1.s sVar3 = sVar2;
                if (((Boolean) b1Var3.getValue()).booleanValue()) {
                    sVar3.d0(524825382);
                    Object objQ18 = sVar3.Q();
                    if (objQ18 == obj3) {
                        Object i3Var = new i3(2, b1Var2, b1Var3, b1Var, b1Var7);
                        sVar3.o0(i3Var);
                        objQ18 = i3Var;
                    }
                    g.a(54, (fz.a) objQ18, sVar3, rVar2);
                } else {
                    sVar3.d0(502877971);
                }
                sVar3.p(false);
                sVar3.p(true);
                sVar3.p(false);
                sVar = sVar3;
            }
        } else {
            l1.s sVar4 = sVar2;
            sVar4.W();
            sVar = sVar4;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.c0(courseTestViewModel, onFinish, z11, onSummaryContinueRequest, loginNow, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x03c3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v136 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77, types: [rt.nc] */
    /* JADX WARN: Type inference failed for: r13v1, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r13v13, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, qs.b] */
    /* JADX WARN: Type inference failed for: r1v68, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r1v69, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r1v70, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r45v0 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [rt.g9] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r5v0, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r5v1, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r5v21, types: [l1.n] */
    /* JADX WARN: Type inference failed for: r5v36, types: [l1.n] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    public static final void b(rt.e3 courseTestViewModel, final l9 courseSettingsViewModel, fz.a onClickClose, fz.c onClickBilling, final fz.a onFinish, fz.c loginNow, l1.n nVar, int i11) {
        ?? r9;
        l1.b1 b1VarO;
        l1.b1 b1Var;
        l1.b1 b1Var2;
        l1.g gVar;
        vt.n0 n0Var;
        rz.b0 b0Var;
        l1.b1 b1Var3;
        boolean z11;
        qc qcVar;
        l1.b1 b1Var4;
        l1.b1 b1Var5;
        int i12;
        ?? r11;
        ot.j1 j1Var;
        CourseQuestionPreferenceContext courseQuestionPreferenceContextY;
        ?? X;
        g9 g9Var;
        qc qcVar2;
        boolean z12;
        int i13;
        int i14;
        ?? r12;
        l1.b1 b1Var6;
        final l1.b1 b1Var7;
        boolean z13;
        rt.e3 e3Var;
        ?? r13;
        ?? r14;
        Object n4Var;
        ?? r15;
        kotlin.jvm.internal.m.f(courseTestViewModel, "courseTestViewModel");
        kotlin.jvm.internal.m.f(courseSettingsViewModel, "courseSettingsViewModel");
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        kotlin.jvm.internal.m.f(onFinish, "onFinish");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        ?? r16 = (l1.s) nVar;
        r16.f0(1004376176);
        int i15 = i11 | (r16.h(courseTestViewModel) ? 4 : 2) | (r16.h(courseSettingsViewModel) ? 32 : 16) | (r16.h(onClickClose) ? 256 : 128) | (r16.h(onClickBilling) ? 2048 : 1024) | (r16.h(onFinish) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (r16.T(i15 & 1, (i15 & 9363) != 9362)) {
            Context context = (Context) r16.j(AndroidCompositionLocals_androidKt.f1200b);
            e20.a aVarC = w4.c.c(r16, -1168520582, r16, -1633490746);
            boolean zF = r16.f(null) | r16.f(aVarC);
            Object objQ = r16.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (zF || objQ == gVar2) {
                objQ = w4.c.e(vt.n0.class, aVarC, null, null, r16);
            }
            r16.p(false);
            r16.p(false);
            vt.n0 n0Var2 = (vt.n0) objQ;
            Object objQ2 = r16.Q();
            if (objQ2 == gVar2) {
                objQ2 = new av.n(context);
                r16.o0(objQ2);
            }
            av.n nVar2 = (av.n) objQ2;
            Object objQ3 = r16.Q();
            if (objQ3 == gVar2) {
                objQ3 = l1.t.q(r16);
                r16.o0(objQ3);
            }
            rz.b0 b0Var2 = (rz.b0) objQ3;
            Object objQ4 = r16.Q();
            if (objQ4 == gVar2) {
                objQ4 = l1.t.B(Boolean.FALSE);
                r16.o0(objQ4);
            }
            l1.b1 b1Var8 = (l1.b1) objQ4;
            boolean zH = r16.h(nVar2) | r16.h(courseTestViewModel);
            Object objQ5 = r16.Q();
            if (zH || objQ5 == gVar2) {
                objQ5 = new j9.h(24, nVar2, courseTestViewModel);
                r16.o0(objQ5);
            }
            l1.t.c(courseTestViewModel, (fz.c) objQ5, r16);
            final l1.b1 b1VarO2 = l1.t.o(courseTestViewModel.J0, r16);
            final l1.b1 b1VarO3 = l1.t.o(courseTestViewModel.I0, r16);
            final l1.b1 b1VarO4 = l1.t.o(courseSettingsViewModel.f50024d, r16);
            l1.b1 b1VarO5 = l1.t.o(courseTestViewModel.M, r16);
            l1.b1 b1VarO6 = l1.t.o(courseTestViewModel.L, r16);
            l1.b1 b1VarO7 = l1.t.o(courseTestViewModel.f50716j0, r16);
            Object objQ6 = r16.Q();
            if (objQ6 == gVar2) {
                objQ6 = l1.t.B(null);
                r16.o0(objQ6);
            }
            final l1.b1 b1Var9 = (l1.b1) objQ6;
            Object objQ7 = r16.Q();
            if (objQ7 == gVar2) {
                objQ7 = l1.t.B(null);
                r16.o0(objQ7);
            }
            final l1.b1 b1Var10 = (l1.b1) objQ7;
            Object objQ8 = r16.Q();
            if (objQ8 == gVar2) {
                objQ8 = l1.t.B(Boolean.FALSE);
                r16.o0(objQ8);
            }
            l1.b1 b1Var11 = (l1.b1) objQ8;
            Object objQ9 = r16.Q();
            if (objQ9 == gVar2) {
                objQ9 = l1.t.B(Boolean.FALSE);
                r16.o0(objQ9);
            }
            l1.b1 b1Var12 = (l1.b1) objQ9;
            Object objQ10 = r16.Q();
            if (objQ10 == gVar2) {
                objQ10 = l1.t.B(Boolean.FALSE);
                r16.o0(objQ10);
            }
            l1.b1 b1Var13 = (l1.b1) objQ10;
            boolean zF2 = r16.f((ja) b1Var9.getValue());
            Object objQ11 = r16.Q();
            if (zF2 || objQ11 == gVar2) {
                ja jaVar = (ja) b1Var9.getValue();
                objQ11 = jaVar != null ? courseTestViewModel.y(jaVar) : null;
                r16.o0(objQ11);
            }
            uz.g1 g1Var = (uz.g1) objQ11;
            if (g1Var == null) {
                r16.d0(-1664131551);
                r16.p(false);
                b1VarO = null;
            } else {
                r16.d0(-1162060320);
                b1VarO = l1.t.o(g1Var, r16);
                r16.p(false);
            }
            if (b1VarO == null) {
                r16.d0(-1664110594);
                Object objQ12 = r16.Q();
                if (objQ12 == gVar2) {
                    objQ12 = l1.t.B(ry.r.f50854a);
                    r16.o0(objQ12);
                }
                b1Var = (l1.b1) objQ12;
                r16.p(false);
            } else {
                r16.d0(-1162065441);
                r16.p(false);
                b1Var = b1VarO;
            }
            ja jaVar2 = (ja) b1Var9.getValue();
            List list = (List) b1Var.getValue();
            rt.p pVar = (rt.p) b1VarO7.getValue();
            boolean zBooleanValue = ((Boolean) b1Var13.getValue()).booleanValue();
            boolean zH2 = r16.h(courseTestViewModel);
            Object objQ13 = r16.Q();
            if (zH2 || objQ13 == gVar2) {
                b1Var2 = b1VarO6;
                gVar = gVar2;
                n0Var = n0Var2;
                b0Var = b0Var2;
                b1Var3 = b1VarO5;
                z11 = false;
                d0.m0 m0Var = new d0.m0(2, courseTestViewModel, rt.e3.class, "createFolder", "createFolder(Lcom/lingodeer/course/viewmodels/CourseTestBookmarkTarget;Ljava/lang/String;)V", 0, 10);
                r16.o0(m0Var);
                objQ13 = m0Var;
            } else {
                n0Var = n0Var2;
                b0Var = b0Var2;
                b1Var3 = b1VarO5;
                gVar = gVar2;
                b1Var2 = b1VarO6;
                z11 = false;
            }
            fz.e eVar = (fz.e) ((mz.e) objQ13);
            boolean zH3 = r16.h(courseTestViewModel);
            Object objQ14 = r16.Q();
            if (zH3 || objQ14 == gVar) {
                d0.m0 m0Var2 = new d0.m0(2, courseTestViewModel, rt.e3.class, "addBookmarkToFolder", "addBookmarkToFolder(Lcom/lingodeer/course/viewmodels/CourseTestBookmarkTarget;Ljava/lang/String;)V", 0, 11);
                r16.o0(m0Var2);
                objQ14 = m0Var2;
            }
            fz.e eVar2 = (fz.e) ((mz.e) objQ14);
            Object objQ15 = r16.Q();
            if (objQ15 == gVar) {
                objQ15 = new ch.h0(b1Var9, b1Var13, 8);
                r16.o0(objQ15);
            }
            fz.a aVar = (fz.a) objQ15;
            Object objQ16 = r16.Q();
            if (objQ16 == gVar) {
                objQ16 = new bp.i2(b1Var10, b1Var11, 15);
                r16.o0(objQ16);
            }
            fz.c cVar = (fz.c) objQ16;
            boolean zH4 = r16.h(courseTestViewModel);
            Object objQ17 = r16.Q();
            if (zH4 || objQ17 == gVar) {
                bt.y2 y2Var = new bt.y2(0, courseTestViewModel, rt.e3.class, "clearBookmarkFolderOperationResult", "clearBookmarkFolderOperationResult()V", 0, 27);
                r16.o0(y2Var);
                objQ17 = y2Var;
            }
            g.i(jaVar2, list, pVar, zBooleanValue, null, eVar, eVar2, aVar, cVar, (fz.a) ((mz.e) objQ17), r16, 113246208, 16);
            if (((Boolean) b1Var11.getValue()).booleanValue()) {
                r16.d0(-1663332742);
                ja jaVar3 = (ja) b1Var10.getValue();
                Object objQ18 = r16.Q();
                if (objQ18 == gVar) {
                    qcVar = null;
                    objQ18 = new fu.y(b1Var11, b1Var10, null, 4);
                    r16.o0(objQ18);
                } else {
                    qcVar = null;
                }
                l1.t.f((fz.e) objQ18, jaVar3, r16);
            } else {
                qcVar = null;
                r16.d0(-1669230926);
            }
            r16.p(z11);
            Object objQ19 = r16.Q();
            if (objQ19 == gVar) {
                b1Var4 = b1Var11;
                objQ19 = new i3(1, b1Var10, b1Var4, b1Var9, b1Var13);
                r16.o0(objQ19);
            } else {
                b1Var4 = b1Var11;
            }
            final fz.a aVar2 = (fz.a) objQ19;
            boolean zBooleanValue2 = ((Boolean) b1Var4.getValue()).booleanValue();
            Object objQ20 = r16.Q();
            if (objQ20 == gVar) {
                b1Var5 = b1Var12;
                objQ20 = new p(9, b1Var5);
                r16.o0(objQ20);
            } else {
                b1Var5 = r22;
            }
            dt.c1 c1Var = new dt.c1(zBooleanValue2, aVar2, (fz.c) objQ20);
            h9 h9Var = (h9) b1VarO4.getValue();
            if (kotlin.jvm.internal.m.a(h9Var, f9.f49754a)) {
                i12 = -1;
            } else {
                if (!(h9Var instanceof g9)) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = ((g9) h9Var).f49787b.f50784c;
            }
            final int i16 = i12;
            rc rcVar = (rc) b1VarO2.getValue();
            qc qcVar3 = rcVar instanceof qc ? (qc) rcVar : qcVar;
            if (qcVar3 == null) {
                r11 = g9Var;
                r11 = g9Var;
                r11 = g9Var;
                X = qcVar;
            } else {
                h9 h9Var2 = (h9) b1VarO4.getValue();
                if (h9Var2 instanceof g9) {
                    g9Var = (g9) h9Var2;
                } else {
                    r11 = qcVar;
                }
                if (r11 == 0 || (j1Var = qcVar3.f50301a) == null || (courseQuestionPreferenceContextY = vc.a.y(r11.f49786a, j1Var)) == null) {
                    r11 = g9Var;
                    r11 = g9Var;
                    r11 = g9Var;
                    X = qcVar;
                } else {
                    r11 = g9Var;
                    Collection collectionValues = r11.f49788c.values();
                    z8 z8Var = r11.f49787b;
                    X = vc.a.x(courseQuestionPreferenceContextY, j1Var, collectionValues, z8Var.f50785d, z8Var.f50792k, z8Var.f50782a);
                }
            }
            Object objQ21 = r16.Q();
            if (objQ21 == gVar) {
                objQ21 = l1.t.B(Boolean.FALSE);
                r16.o0(objQ21);
            }
            final l1.b1 b1Var14 = (l1.b1) objQ21;
            if (((Boolean) b1Var14.getValue()).booleanValue()) {
                r16.d0(-1661256145);
                h9 h9Var3 = (h9) b1VarO4.getValue();
                Object objQ22 = r16.Q();
                if (objQ22 == gVar) {
                    objQ22 = new w1(25, b1Var14);
                    r16.o0(objQ22);
                }
                fz.a aVar3 = (fz.a) objQ22;
                boolean zH5 = r16.h(courseSettingsViewModel);
                Object objQ23 = r16.Q();
                if (zH5 || objQ23 == gVar) {
                    objQ23 = new fs.b(courseSettingsViewModel, 2);
                    r16.o0(objQ23);
                }
                fz.c cVar2 = (fz.c) objQ23;
                boolean zH6 = r16.h(X) | r16.h(courseSettingsViewModel);
                Object objQ24 = r16.Q();
                if (zH6 || objQ24 == gVar) {
                    objQ24 = new j9.h(23, (Object) X, courseSettingsViewModel);
                    r16.o0(objQ24);
                }
                fz.c cVar3 = (fz.c) objQ24;
                boolean zH7 = r16.h(courseSettingsViewModel);
                Object objQ25 = r16.Q();
                if (zH7 || objQ25 == gVar) {
                    objQ25 = new fs.b(courseSettingsViewModel, 3);
                    r16.o0(objQ25);
                }
                qcVar2 = null;
                ys.a.w(h9Var3, X, false, false, aVar3, cVar2, cVar3, (fz.c) objQ25, r16, 24576, 12);
            } else {
                qcVar2 = qcVar;
                r16.d0(-1669230926);
            }
            r16.p(z11);
            Object objQ26 = r16.Q();
            if (objQ26 == gVar) {
                objQ26 = l1.t.B(Boolean.FALSE);
                r16.o0(objQ26);
            }
            l1.b1 b1Var15 = (l1.b1) objQ26;
            Object objQ27 = r16.Q();
            if (objQ27 == gVar) {
                objQ27 = l1.t.B(Boolean.FALSE);
                r16.o0(objQ27);
            }
            final l1.b1 b1Var16 = (l1.b1) objQ27;
            rc rcVar2 = (rc) b1VarO2.getValue();
            qc qcVar4 = rcVar2 instanceof qc ? (qc) rcVar2 : qcVar2;
            long j11 = qcVar4 != null ? qcVar4.f50303c : -1L;
            if (!((Boolean) b1Var16.getValue()).booleanValue() || j11 <= 0) {
                ?? r17 = r16;
                z12 = z11;
                i13 = r21;
                i14 = -1669230926;
                r17.d0(-1669230926);
                r12 = r17;
            } else {
                r16.d0(-1659891525);
                Object objQ28 = r16.Q();
                if (objQ28 == gVar) {
                    objQ28 = new w1(26, b1Var16);
                    r16.o0(objQ28);
                }
                fz.a aVar4 = (fz.a) objQ28;
                i13 = i15;
                boolean z14 = (i13 & 7168) == 2048;
                Object objQ29 = r16.Q();
                if (z14 || objQ29 == gVar) {
                    objQ29 = new km.x0(onClickBilling, 12);
                    r16.o0(objQ29);
                }
                i14 = -1669230926;
                ys.j3.c(j11, aVar4, (fz.a) objQ29, r16, 48);
                r12 = r16;
                z12 = false;
            }
            r12.p(z12);
            if (((Boolean) b1Var15.getValue()).booleanValue()) {
                r12.d0(-1659583044);
                Object objQ30 = r12.Q();
                if (objQ30 == gVar) {
                    objQ30 = new w1(22, b1Var15);
                    r12.o0(objQ30);
                }
                fz.a aVar5 = (fz.a) objQ30;
                Object objQ31 = r12.Q();
                if (objQ31 == gVar) {
                    objQ31 = new w1(23, b1Var15);
                    r12.o0(objQ31);
                }
                fz.a aVar6 = (fz.a) objQ31;
                l1.b1 b1Var17 = b1Var3;
                l1.b1 b1Var18 = b1Var2;
                b0Var = b0Var;
                boolean zF3 = r12.f(b1Var17) | r12.f(b1Var18) | r12.h(b0Var) | r12.h(e3Var) | ((57344 & i13) == 16384) | ((i13 & 896) == 256);
                Object objQ32 = r12.Q();
                if (zF3 || objQ32 == gVar) {
                    ?? r18 = r12;
                    bt.z0 z0Var = new bt.z0(b1Var15, b1Var17, b1Var18, b0Var, b1Var8, courseTestViewModel, onFinish, onClickClose);
                    b1Var6 = b1Var15;
                    e3Var = courseTestViewModel;
                    b1Var7 = b1Var8;
                    r18.o0(z0Var);
                    objQ32 = z0Var;
                    r15 = r18;
                } else {
                    b1Var6 = b1Var15;
                    b1Var7 = b1Var8;
                    r15 = r12;
                }
                fz.a aVar7 = (fz.a) objQ32;
                ?? r19 = r15;
                tv.a.i(true, aVar5, aVar6, aVar7, r19, 438);
                r13 = r19;
                z13 = false;
            } else {
                b1Var5 = b1Var5;
                b1Var6 = b1Var15;
                b1Var14 = b1Var14;
                b1Var7 = b1Var8;
                z13 = false;
                r12.d0(i14);
                r13 = r12;
            }
            r13.p(z13);
            Object objQ33 = r13.Q();
            if (objQ33 == gVar) {
                objQ33 = new w1(24, b1Var6);
                r13.o0(objQ33);
            }
            se.i.a(false, (fz.a) objQ33, r13, 48, 1);
            nc ncVar = (nc) b1VarO3.getValue();
            if (ncVar == null || ncVar.f50156d.isEmpty()) {
                r14 = ncVar;
                r14 = qcVar2;
            }
            if (r14 == 0) {
                r13.d0(-1658972872);
                r13.p(false);
                n4Var = qcVar2;
            } else {
                r13.d0(-1658972871);
                ?? r21 = r14.f50156d;
                boolean z15 = r14.f50157e;
                boolean zH8 = r13.h(e3Var);
                Object objQ34 = r13.Q();
                if (zH8 || objQ34 == gVar) {
                    objQ34 = new z3(e3Var, 1);
                    r13.o0(objQ34);
                }
                fz.c cVar4 = (fz.c) objQ34;
                vt.n0 n0Var3 = n0Var;
                boolean zH9 = r13.h(n0Var3) | r13.h(nVar2);
                Object objQ35 = r13.Q();
                if (zH9 || objQ35 == gVar) {
                    objQ35 = new j9.h(22, n0Var3, nVar2);
                    r13.o0(objQ35);
                }
                n4Var = new dt.n4(r21, z15, cVar4, (fz.c) objQ35);
                r13.p(false);
            }
            ?? r45 = r13;
            final rt.e3 e3Var2 = e3Var;
            final l1.b1 b1Var19 = b1Var6;
            final l1.b1 b1Var20 = b1Var5;
            final l1.b1 b1Var21 = b1Var4;
            final rz.b0 b0Var3 = b0Var;
            ?? r22 = r45;
            l1.t.b(new l1.w1[]{dt.k3.f23943a.a(n4Var), dt.v2.f24278d.a(c1Var)}, t1.e.d(-1430346448, new fz.e() { // from class: mt.d4
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    Object aVar8;
                    l1.b1 b1Var22;
                    l1.n nVar3 = (l1.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    l1.s sVar = (l1.s) nVar3;
                    if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        z1.r rVarD = j0.e2.d(z1.o.f58481a, 1.0f);
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        int iHashCode = Long.hashCode(sVar.T);
                        l1.q1 q1VarL = sVar.l();
                        z1.r rVarC = z1.a.c(sVar, rVarD);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar);
                        y2.h hVar = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar);
                        rc rcVar3 = (rc) b1VarO2.getValue();
                        boolean z16 = rcVar3 instanceof pc;
                        l1.b1 b1Var23 = b1Var21;
                        if (z16) {
                            sVar.d0(-581050945);
                            tv.a.g(((pc) rcVar3).f50247a, null, sVar, 0, 6);
                            sVar.p(false);
                            b1Var23 = b1Var23;
                        } else {
                            if (!(rcVar3 instanceof qc)) {
                                throw nv.p.x(sVar, -581047329, false);
                            }
                            sVar.d0(-832437960);
                            qc qcVar5 = (qc) rcVar3;
                            h9 h9Var4 = (h9) b1VarO4.getValue();
                            rt.e3 e3Var3 = e3Var2;
                            boolean zH10 = sVar.h(e3Var3);
                            Object objQ36 = sVar.Q();
                            l1.g gVar3 = l1.m.f39353a;
                            if (zH10 || objQ36 == gVar3) {
                                objQ36 = new z3(e3Var3, 2);
                                sVar.o0(objQ36);
                            }
                            fz.c cVar5 = (fz.c) objQ36;
                            boolean zH11 = sVar.h(e3Var3);
                            Object objQ37 = sVar.Q();
                            l1.b1 b1Var24 = b1Var10;
                            l1.b1 b1Var25 = b1Var9;
                            if (zH11 || objQ37 == gVar3) {
                                b1Var22 = b1Var24;
                                aVar8 = new b0.a(e3Var3, b1Var23, b1Var22, b1Var25, 24);
                                sVar.o0(aVar8);
                            } else {
                                aVar8 = objQ37;
                                b1Var22 = b1Var24;
                            }
                            fz.c cVar6 = (fz.c) aVar8;
                            boolean zH12 = sVar.h(e3Var3);
                            Object objQ38 = sVar.Q();
                            if (zH12 || objQ38 == gVar3) {
                                objQ38 = new f4(e3Var3, 0);
                                sVar.o0(objQ38);
                            }
                            fz.e eVar3 = (fz.e) objQ38;
                            boolean zH13 = sVar.h(e3Var3);
                            Object objQ39 = sVar.Q();
                            if (zH13 || objQ39 == gVar3) {
                                br.j jVar = new br.j(e3Var3, b1Var23, b1Var22, b1Var25, 12);
                                sVar.o0(jVar);
                                objQ39 = jVar;
                            }
                            fz.f fVar = (fz.f) objQ39;
                            boolean zH14 = sVar.h(e3Var3);
                            Object objQ40 = sVar.Q();
                            if (zH14 || objQ40 == gVar3) {
                                objQ40 = new z3(e3Var3, 4);
                                sVar.o0(objQ40);
                            }
                            fz.c cVar7 = (fz.c) objQ40;
                            boolean zH15 = sVar.h(e3Var3);
                            Object objQ41 = sVar.Q();
                            if (zH15 || objQ41 == gVar3) {
                                objQ41 = new f4(e3Var3, 1);
                                sVar.o0(objQ41);
                            }
                            fz.e eVar4 = (fz.e) objQ41;
                            t1.d dVarD = t1.e.d(607761478, new br.d(qcVar5, i16, courseSettingsViewModel, b1VarO3, b1Var19, b1Var16, b1Var14), sVar);
                            Object objQ42 = sVar.Q();
                            if (objQ42 == gVar3) {
                                objQ42 = new k(6, (byte) 0);
                                sVar.o0(objQ42);
                            }
                            fz.e eVar5 = (fz.e) objQ42;
                            Object objQ43 = sVar.Q();
                            if (objQ43 == gVar3) {
                                objQ43 = new k(7, (byte) 0);
                                sVar.o0(objQ43);
                            }
                            fz.e eVar6 = (fz.e) objQ43;
                            boolean zH16 = sVar.h(e3Var3);
                            Object objQ44 = sVar.Q();
                            if (zH16 || objQ44 == gVar3) {
                                objQ44 = new f4(e3Var3, 3);
                                sVar.o0(objQ44);
                            }
                            fz.e eVar7 = (fz.e) objQ44;
                            boolean zH17 = sVar.h(e3Var3);
                            Object objQ45 = sVar.Q();
                            if (zH17 || objQ45 == gVar3) {
                                objQ45 = new e4(e3Var3, 0);
                                sVar.o0(objQ45);
                            }
                            fz.a aVar9 = (fz.a) objQ45;
                            boolean zH18 = sVar.h(e3Var3);
                            Object objQ46 = sVar.Q();
                            if (zH18 || objQ46 == gVar3) {
                                objQ46 = new z3(e3Var3, 3);
                                sVar.o0(objQ46);
                            }
                            fz.c cVar8 = (fz.c) objQ46;
                            boolean zH19 = sVar.h(e3Var3);
                            Object objQ47 = sVar.Q();
                            if (zH19 || objQ47 == gVar3) {
                                objQ47 = new e4(e3Var3, 1);
                                sVar.o0(objQ47);
                            }
                            fz.a aVar10 = (fz.a) objQ47;
                            rz.b0 b0Var4 = b0Var3;
                            boolean zH20 = sVar.h(b0Var4) | sVar.h(e3Var3);
                            fz.a aVar11 = onFinish;
                            boolean zF4 = zH20 | sVar.f(aVar11);
                            Object objQ48 = sVar.Q();
                            if (zF4 || objQ48 == gVar3) {
                                b0.k0 k0Var = new b0.k0(b0Var4, b1Var7, e3Var3, aVar11, 15);
                                sVar.o0(k0Var);
                                objQ48 = k0Var;
                            }
                            ys.a.n(qcVar5, h9Var4, false, false, 0L, cVar5, cVar6, eVar3, fVar, cVar7, eVar4, dVarD, eVar5, eVar6, eVar7, aVar9, cVar8, aVar10, (fz.a) objQ48, sVar, 0, 3504, 28);
                            sVar.p(false);
                        }
                        if (!((Boolean) b1Var23.getValue()).booleanValue() || ((Boolean) b1Var20.getValue()).booleanValue()) {
                            sVar.d0(-844146164);
                        } else {
                            sVar.d0(-826630048);
                            g.a(54, aVar2, sVar, null);
                        }
                        sVar.p(false);
                        sVar.p(true);
                    } else {
                        sVar.W();
                    }
                    return qy.b0.f48488a;
                }
            }, r22), r22, 56);
            r9 = r22;
        } else {
            ?? r23 = r16;
            r23.W();
            r9 = r23;
        }
        l1.x1 x1VarT = r9.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.f0(courseTestViewModel, courseSettingsViewModel, onClickClose, onClickBilling, onFinish, loginNow, i11);
        }
    }
}
