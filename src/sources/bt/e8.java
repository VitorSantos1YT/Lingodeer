package bt;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e8 {
    public static final void a(ot.z1 data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-195747214);
        int i12 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar);
                sVar.o0(objQ);
            }
            rz.b0 scope = (rz.b0) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(-1L);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var = (l1.b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(-1L);
                sVar.o0(objQ3);
            }
            l1.b1 b1Var2 = (l1.b1) objQ3;
            List optionWords = data.f46063a;
            List optionTranslations = data.f46064b;
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ4 = sVar.Q();
            if (z11 || objQ4 == gVar) {
                objQ4 = new v(d0Var, 12);
                sVar.o0(objQ4);
            }
            fz.c onPlayAudio = (fz.c) objQ4;
            kotlin.jvm.internal.m.f(optionWords, "optionWords");
            kotlin.jvm.internal.m.f(optionTranslations, "optionTranslations");
            kotlin.jvm.internal.m.f(scope, "scope");
            kotlin.jvm.internal.m.f(onPlayAudio, "onPlayAudio");
            boolean zF = sVar.f(optionWords);
            Object objQ5 = sVar.Q();
            if (zF || objQ5 == gVar) {
                objQ5 = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ5);
            }
            l1.b1 b1Var3 = (l1.b1) objQ5;
            boolean zF2 = sVar.f(optionWords);
            Object objQ6 = sVar.Q();
            if (zF2 || objQ6 == gVar) {
                objQ6 = l1.t.B(optionWords);
                sVar.o0(objQ6);
            }
            l1.b1 b1Var4 = (l1.b1) objQ6;
            boolean zF3 = sVar.f(optionWords);
            Object objQ7 = sVar.Q();
            if (zF3 || objQ7 == gVar) {
                objQ7 = l1.t.B(optionTranslations);
                sVar.o0(objQ7);
            }
            l1.b1 b1Var5 = (l1.b1) objQ7;
            boolean zF4 = sVar.f(optionWords);
            Object objQ8 = sVar.Q();
            if (zF4 || objQ8 == gVar) {
                objQ8 = new x1.p();
                sVar.o0(objQ8);
            }
            x1.p pVar = (x1.p) objQ8;
            boolean zF5 = sVar.f(optionWords);
            Object objQ9 = sVar.Q();
            if (zF5 || objQ9 == gVar) {
                objQ9 = new ArrayList();
                sVar.o0(objQ9);
            }
            List list = (List) objQ9;
            boolean zF6 = sVar.f(optionWords);
            Object objQ10 = sVar.Q();
            if (zF6 || objQ10 == gVar) {
                objQ10 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ10);
            }
            l1.b1 b1Var6 = (l1.b1) objQ10;
            boolean zF7 = sVar.f(optionWords);
            Object objQ11 = sVar.Q();
            if (zF7 || objQ11 == gVar) {
                objQ11 = l1.t.B(jt.b2.f36896a);
                sVar.o0(objQ11);
            }
            l1.b1 b1Var7 = (l1.b1) objQ11;
            boolean zF8 = sVar.f(optionWords);
            Object objQ12 = sVar.Q();
            if (zF8 || objQ12 == gVar) {
                objQ12 = l1.t.B(null);
                sVar.o0(objQ12);
            }
            l1.b1 b1Var8 = (l1.b1) objQ12;
            boolean zF9 = sVar.f(optionWords);
            Object objQ13 = sVar.Q();
            if (zF9 || objQ13 == gVar) {
                objQ13 = l1.t.B(null);
                sVar.o0(objQ13);
            }
            l1.b1 b1Var9 = (l1.b1) objQ13;
            boolean zF10 = sVar.f(optionWords);
            Object objQ14 = sVar.Q();
            if (zF10 || objQ14 == gVar) {
                objQ14 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ14);
            }
            l1.b1 b1Var10 = (l1.b1) objQ14;
            boolean zF11 = sVar.f(b1Var3) | sVar.f(b1Var4) | sVar.f(b1Var5) | sVar.f(pVar) | sVar.f(list) | sVar.f(b1Var6) | sVar.f(b1Var7) | sVar.f(b1Var8) | sVar.f(b1Var9) | sVar.f(b1Var10) | sVar.f(scope);
            Object objQ15 = sVar.Q();
            if (zF11 || objQ15 == gVar) {
                objQ15 = new jt.a2(b1Var3, b1Var4, b1Var5, pVar, list, b1Var6, b1Var7, b1Var8, b1Var9, b1Var10, scope, onPlayAudio);
                sVar.o0(objQ15);
            }
            jt.a2 a2Var = (jt.a2) objQ15;
            Object value = a2Var.f36879h.getValue();
            Object value2 = a2Var.f36880i.getValue();
            boolean zH = sVar.h(scope) | sVar.h(a2Var);
            Object objQ16 = sVar.Q();
            if (zH || objQ16 == gVar) {
                objQ16 = new iv.h0(10, scope, a2Var, null);
                sVar.o0(objQ16);
            }
            l1.t.g(value, value2, (fz.e) objQ16, sVar);
            kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
            boolean zF12 = sVar.f(data);
            Object objQ17 = sVar.Q();
            if (zF12 || objQ17 == gVar) {
                objQ17 = new x1.p();
                sVar.o0(objQ17);
            }
            yVar.f38361a = (x1.p) objQ17;
            l1.t.f(new ad.x(a2Var, yVar, d0Var, courseTestParams, null, 5), a2Var.f36878g.getValue(), sVar);
            ot.a2 a2Var2 = data.f46065c;
            long jLongValue = ((Number) b1Var.getValue()).longValue();
            long jLongValue2 = ((Number) b1Var2.getValue()).longValue();
            boolean z12 = i13 == 256;
            Object objQ18 = sVar.Q();
            if (z12 || objQ18 == gVar) {
                objQ18 = new defpackage.d(d0Var, b1Var, b1Var2, 2);
                sVar.o0(objQ18);
            }
            fz.f fVar = (fz.f) objQ18;
            boolean z13 = i13 == 256;
            Object objQ19 = sVar.Q();
            if (z13 || objQ19 == gVar) {
                objQ19 = new o5(d0Var, 27);
                sVar.o0(objQ19);
            }
            fz.a aVar = (fz.a) objQ19;
            int i14 = i12 & 112;
            boolean z14 = (i13 == 256) | (i14 == 32);
            Object objQ20 = sVar.Q();
            if (z14 || objQ20 == gVar) {
                objQ20 = new k(d0Var, courseTestParams, 10);
                sVar.o0(objQ20);
            }
            fz.a aVar2 = (fz.a) objQ20;
            boolean z15 = (i13 == 256) | (i14 == 32);
            Object objQ21 = sVar.Q();
            if (z15 || objQ21 == gVar) {
                objQ21 = new e0(d0Var, courseTestParams, 19);
                sVar.o0(objQ21);
            }
            b(a2Var, courseTestParams, a2Var2, jLongValue, jLongValue2, fVar, aVar, aVar2, (fz.c) objQ21, sVar, i14);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(data, courseTestParams, d0Var, i11, 20);
        }
    }

    public static final void b(final jt.a2 a2Var, final ht.o courseTestParams, final ot.a2 matchType, final long j11, final long j12, final fz.f onClickPlayOptionAudio, final fz.a onClickContinue, final fz.a onClickSkipListen, final fz.c onClickBugReport, l1.n nVar, final int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(matchType, "matchType");
        kotlin.jvm.internal.m.f(onClickPlayOptionAudio, "onClickPlayOptionAudio");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(onClickSkipListen, "onClickSkipListen");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(436349322);
        int i12 = i11 | (sVar2.h(a2Var) ? 4 : 2) | (sVar2.f(courseTestParams) ? 32 : 16) | (sVar2.d(matchType.ordinal()) ? 256 : 128) | (sVar2.e(j11) ? 2048 : 1024) | (sVar2.e(j12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onClickPlayOptionAudio) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onClickContinue) ? 1048576 : 524288) | (sVar2.h(onClickSkipListen) ? 8388608 : 4194304) | (sVar2.h(onClickBugReport) ? 67108864 : 33554432);
        if (sVar2.T(i12 & 1, (i12 & 38347923) != 38347922)) {
            final boolean zBooleanValue = ((Boolean) sVar2.j(ju.f.f37374h)).booleanValue();
            l1.b1 b1Var = a2Var.f36872a;
            final l1.b1 b1Var2 = a2Var.f36873b;
            final l1.b1 b1Var3 = a2Var.f36874c;
            final x1.p pVar = a2Var.f36875d;
            final l1.b1 b1Var4 = a2Var.f36878g;
            ht.q qVar = (ht.q) b1Var.getValue();
            String strE0 = ub.a.e0(sVar2, R.string.test_continue);
            boolean z11 = courseTestParams.f33768q && matchType == ot.a2.AudioWord;
            ht.a aVar = ht.a.f33722e;
            t1.d dVar = b.f5197v;
            t1.d dVar2 = b.f5198w;
            sVar = sVar2;
            t1.d dVarD = t1.e.d(1677622986, new fz.e() { // from class: bt.x7
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    l1.n nVar2 = (l1.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        z1.r rVarE = j0.c.E(j0.e2.d(z1.o.f58481a, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 32, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                        z1.j jVar = z1.c.f58467e;
                        final l1.b1 b1Var5 = b1Var2;
                        final l1.b1 b1Var6 = b1Var4;
                        final ot.a2 a2Var2 = matchType;
                        final fz.f fVar = onClickPlayOptionAudio;
                        final long j13 = j11;
                        final jt.a2 a2Var3 = a2Var;
                        final boolean z12 = zBooleanValue;
                        final l1.b1 b1Var7 = b1Var3;
                        final long j14 = j12;
                        final x1.p pVar2 = pVar;
                        j0.c.a(rVarE, jVar, t1.e.d(702681268, new fz.f() { // from class: bt.q7
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r3v7, types: [vy.d] */
                            @Override // fz.f
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                l1.b1 b1Var8;
                                ot.a2 a2Var4;
                                final fz.f fVar2;
                                jt.a2 a2Var5;
                                fz.a aVar2;
                                l1.g gVar;
                                fz.a aVar3;
                                fz.a aVar4;
                                l1.g gVar2;
                                CourseWord courseWord;
                                CourseWord courseWord2;
                                j0.s BoxWithConstraints = (j0.s) obj3;
                                l1.n nVar3 = (l1.n) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                z1.h hVar = z1.c.O;
                                kotlin.jvm.internal.m.f(BoxWithConstraints, "$this$BoxWithConstraints");
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= ((l1.s) nVar3).f(BoxWithConstraints) ? 4 : 2;
                                }
                                l1.s sVar4 = (l1.s) nVar3;
                                if (sVar4.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    float fB = BoxWithConstraints.b();
                                    l1.b1 b1Var9 = b1Var5;
                                    boolean zC = sVar4.c(fB) | sVar4.d(((List) b1Var9.getValue()).size());
                                    Object objQ = sVar4.Q();
                                    l1.g gVar3 = l1.m.f39353a;
                                    if (zC || objQ == gVar3) {
                                        v3.f fVar3 = new v3.f((BoxWithConstraints.b() - (24 * ((List) b1Var9.getValue()).size())) / ((List) b1Var9.getValue()).size());
                                        v3.f fVar4 = new v3.f(82);
                                        if (fVar3.compareTo(fVar4) > 0) {
                                            fVar3 = fVar4;
                                        }
                                        objQ = new v3.f(fVar3.f53489a);
                                        sVar4.o0(objQ);
                                    }
                                    float f5 = ((v3.f) objQ).f53489a;
                                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar4, 0);
                                    int iHashCode = Long.hashCode(sVar4.T);
                                    l1.q1 q1VarL = sVar4.l();
                                    z1.o oVar = z1.o.f58481a;
                                    z1.r rVarC = z1.a.c(sVar4, oVar);
                                    y2.k.J.getClass();
                                    y2.i iVar = y2.j.f56913b;
                                    sVar4.h0();
                                    if (sVar4.S) {
                                        sVar4.k(iVar);
                                    } else {
                                        sVar4.r0();
                                    }
                                    y2.h hVar2 = y2.j.f56917f;
                                    l1.t.J(hVar2, a2VarA, sVar4);
                                    y2.h hVar3 = y2.j.f56916e;
                                    l1.t.J(hVar3, q1VarL, sVar4);
                                    y2.h hVar4 = y2.j.f56918g;
                                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar4);
                                    }
                                    y2.h hVar5 = y2.j.f56915d;
                                    l1.t.J(hVar5, rVarC, sVar4);
                                    if (1.0f <= 0.0d) {
                                        k0.a.a("invalid weight; must be greater than zero");
                                    }
                                    z1.r rVarG = j0.e2.g(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ((List) b1Var9.getValue()).size() * 106);
                                    j0.u uVarA = j0.t.a(j0.i.f35306d, hVar, sVar4, 6);
                                    int iHashCode2 = Long.hashCode(sVar4.T);
                                    l1.q1 q1VarL2 = sVar4.l();
                                    z1.r rVarC2 = z1.a.c(sVar4, rVarG);
                                    sVar4.h0();
                                    if (sVar4.S) {
                                        sVar4.k(iVar);
                                    } else {
                                        sVar4.r0();
                                    }
                                    l1.t.J(hVar2, uVarA, sVar4);
                                    l1.t.J(hVar3, q1VarL2, sVar4);
                                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                                        defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar4);
                                    }
                                    l1.t.J(hVar5, rVarC2, sVar4);
                                    sVar4.d0(-1909662411);
                                    Iterator it = ((List) b1Var9.getValue()).iterator();
                                    while (true) {
                                        boolean zHasNext = it.hasNext();
                                        b1Var8 = b1Var6;
                                        a2Var4 = a2Var2;
                                        fVar2 = fVar;
                                        a2Var5 = a2Var3;
                                        aVar2 = null;
                                        if (!zHasNext) {
                                            break;
                                        }
                                        final CourseWord courseWord3 = (CourseWord) it.next();
                                        g8 g8Var = g8.Left;
                                        boolean zIsSelected = courseWord3.isSelected();
                                        boolean zIsMatched = courseWord3.isMatched();
                                        boolean zIsMatchedAndAnimate = courseWord3.isMatchedAndAnimate();
                                        jt.f2 f2Var = (jt.f2) b1Var8.getValue();
                                        if (a2Var4 == ot.a2.AudioAudio) {
                                            sVar4.d0(930675052);
                                            boolean zF = sVar4.f(fVar2) | sVar4.h(courseWord3);
                                            Object objQ2 = sVar4.Q();
                                            if (zF || objQ2 == gVar3) {
                                                final int i13 = 0;
                                                objQ2 = new fz.a() { // from class: bt.r7
                                                    @Override // fz.a
                                                    public final Object invoke() {
                                                        switch (i13) {
                                                            case 0:
                                                                CourseWord courseWord4 = courseWord3;
                                                                fVar2.invoke(b7.e0.l(courseWord4, "toString(...)"), Long.valueOf(courseWord4.getWordId()), g8.Left);
                                                                break;
                                                            default:
                                                                CourseWord courseWord5 = courseWord3;
                                                                fVar2.invoke(b7.e0.l(courseWord5, "toString(...)"), Long.valueOf(courseWord5.getWordId()), g8.Right);
                                                                break;
                                                        }
                                                        return qy.b0.f48488a;
                                                    }
                                                };
                                                sVar4.o0(objQ2);
                                            }
                                            aVar2 = (fz.a) objQ2;
                                            sVar4.p(false);
                                        } else {
                                            sVar4.d0(931140796);
                                            sVar4.p(false);
                                        }
                                        boolean zH = sVar4.h(a2Var5) | sVar4.h(courseWord3) | sVar4.d(a2Var4.ordinal());
                                        boolean z13 = z12;
                                        boolean zG = zH | sVar4.g(z13) | sVar4.f(fVar2);
                                        Object objQ3 = sVar4.Q();
                                        if (zG || objQ3 == gVar3) {
                                            h5 h5Var = new h5(a2Var5, courseWord3, a2Var4, z13, fVar2);
                                            courseWord2 = courseWord3;
                                            a2Var4 = a2Var4;
                                            sVar4.o0(h5Var);
                                            objQ3 = h5Var;
                                        } else {
                                            courseWord2 = courseWord3;
                                        }
                                        float f11 = f5;
                                        l1.s sVar5 = sVar4;
                                        e8.f(courseWord2, a2Var4, g8Var, zIsSelected, zIsMatched, f2Var, zIsMatchedAndAnimate, f11, j13, aVar2, (fz.a) objQ3, sVar5, 384);
                                        f5 = f11;
                                        sVar4 = sVar5;
                                    }
                                    final float f12 = f5;
                                    sVar4.p(false);
                                    sVar4.p(true);
                                    j0.c.g(sVar4, j0.e2.s(oVar, 22));
                                    l1.g gVar4 = gVar3;
                                    if (1.0f <= 0.0d) {
                                        k0.a.a("invalid weight; must be greater than zero");
                                    }
                                    z1.r rVarG2 = j0.e2.g(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ((List) b1Var9.getValue()).size() * 106);
                                    j0.u uVarA2 = j0.t.a(j0.i.f35306d, hVar, sVar4, 6);
                                    int iHashCode3 = Long.hashCode(sVar4.T);
                                    l1.q1 q1VarL3 = sVar4.l();
                                    z1.r rVarC3 = z1.a.c(sVar4, rVarG2);
                                    y2.k.J.getClass();
                                    y2.i iVar2 = y2.j.f56913b;
                                    sVar4.h0();
                                    if (sVar4.S) {
                                        sVar4.k(iVar2);
                                    } else {
                                        sVar4.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, uVarA2, sVar4);
                                    l1.t.J(y2.j.f56916e, q1VarL3, sVar4);
                                    y2.h hVar6 = y2.j.f56918g;
                                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar6);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC3, sVar4);
                                    sVar4.d0(-94932533);
                                    Iterator it2 = ((List) b1Var7.getValue()).iterator();
                                    while (it2.hasNext()) {
                                        final CourseWord courseWord4 = (CourseWord) it2.next();
                                        g8 g8Var2 = g8.Right;
                                        boolean zIsSelected2 = courseWord4.isSelected();
                                        boolean zIsMatched2 = courseWord4.isMatched();
                                        boolean zIsMatchedAndAnimate2 = courseWord4.isMatchedAndAnimate();
                                        jt.f2 f2Var2 = (jt.f2) b1Var8.getValue();
                                        if (a2Var4 == ot.a2.AudioAudio) {
                                            sVar4.d0(1352765792);
                                            boolean zF2 = sVar4.f(fVar2) | sVar4.h(courseWord4);
                                            Object objQ4 = sVar4.Q();
                                            if (zF2) {
                                                gVar = gVar4;
                                            } else {
                                                gVar = gVar4;
                                                if (objQ4 == gVar) {
                                                }
                                                sVar4.p(false);
                                                aVar3 = aVar2;
                                                aVar4 = (fz.a) objQ4;
                                            }
                                            final int i14 = 1;
                                            objQ4 = new fz.a() { // from class: bt.r7
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    switch (i14) {
                                                        case 0:
                                                            CourseWord courseWord5 = courseWord4;
                                                            fVar2.invoke(b7.e0.l(courseWord5, "toString(...)"), Long.valueOf(courseWord5.getWordId()), g8.Left);
                                                            break;
                                                        default:
                                                            CourseWord courseWord6 = courseWord4;
                                                            fVar2.invoke(b7.e0.l(courseWord6, "toString(...)"), Long.valueOf(courseWord6.getWordId()), g8.Right);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar4.o0(objQ4);
                                            sVar4.p(false);
                                            aVar3 = aVar2;
                                            aVar4 = (fz.a) objQ4;
                                        } else {
                                            gVar = gVar4;
                                            sVar4.d0(1353234419);
                                            sVar4.p(false);
                                            aVar3 = aVar2;
                                            aVar4 = aVar3;
                                        }
                                        boolean zH2 = sVar4.h(a2Var5) | sVar4.h(courseWord4) | sVar4.d(a2Var4.ordinal()) | sVar4.f(fVar2);
                                        Object objQ5 = sVar4.Q();
                                        if (zH2 || objQ5 == gVar) {
                                            ot.a2 a2Var6 = a2Var4;
                                            gVar2 = gVar;
                                            b0.k0 k0Var = new b0.k0(a2Var5, courseWord4, a2Var6, fVar2, 7);
                                            courseWord = courseWord4;
                                            a2Var4 = a2Var6;
                                            sVar4.o0(k0Var);
                                            objQ5 = k0Var;
                                        } else {
                                            courseWord = courseWord4;
                                            gVar2 = gVar;
                                        }
                                        l1.s sVar6 = sVar4;
                                        e8.f(courseWord, a2Var4, g8Var2, zIsSelected2, zIsMatched2, f2Var2, zIsMatchedAndAnimate2, f12, j14, aVar4, (fz.a) objQ5, sVar6, 384);
                                        a2Var5 = a2Var5;
                                        aVar2 = aVar3;
                                        b1Var9 = b1Var9;
                                        sVar4 = sVar6;
                                        fVar2 = fVar2;
                                        it2 = it2;
                                        gVar4 = gVar2;
                                    }
                                    l1.g gVar5 = gVar4;
                                    l1.b1 b1Var10 = b1Var9;
                                    final jt.a2 a2Var7 = a2Var5;
                                    ?? r9 = aVar2;
                                    sVar4.p(false);
                                    sVar4.p(true);
                                    sVar4.p(true);
                                    z1.r rVarG3 = j0.e2.g(oVar, ((List) b1Var10.getValue()).size() * 106);
                                    j0.u uVarA3 = j0.t.a(j0.i.f35305c, hVar, sVar4, 0);
                                    int iHashCode4 = Long.hashCode(sVar4.T);
                                    l1.q1 q1VarL4 = sVar4.l();
                                    z1.r rVarC4 = z1.a.c(sVar4, rVarG3);
                                    y2.k.J.getClass();
                                    y2.i iVar3 = y2.j.f56913b;
                                    sVar4.h0();
                                    if (sVar4.S) {
                                        sVar4.k(iVar3);
                                    } else {
                                        sVar4.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, uVarA3, sVar4);
                                    l1.t.J(y2.j.f56916e, q1VarL4, sVar4);
                                    y2.h hVar7 = y2.j.f56918g;
                                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                                        defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar7);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC4, sVar4);
                                    sVar4.d0(-269392365);
                                    ListIterator listIterator = pVar2.listIterator();
                                    while (true) {
                                        sy.a aVar5 = (sy.a) listIterator;
                                        if (!aVar5.hasNext()) {
                                            break;
                                        }
                                        final CourseWord courseWord5 = (CourseWord) aVar5.next();
                                        sVar4.a0(-363134296, Long.valueOf(courseWord5.getWordId()));
                                        Object objQ6 = sVar4.Q();
                                        if (objQ6 == gVar5) {
                                            objQ6 = l1.t.B(Boolean.FALSE);
                                            sVar4.o0(objQ6);
                                        }
                                        l1.b1 b1Var11 = (l1.b1) objQ6;
                                        Long lValueOf = Long.valueOf(courseWord5.getWordId());
                                        Object objQ7 = sVar4.Q();
                                        if (objQ7 == gVar5) {
                                            objQ7 = new z7(b1Var11, r9, 0);
                                            sVar4.o0(objQ7);
                                        }
                                        l1.t.f((fz.e) objQ7, lValueOf, sVar4);
                                        a0.j0.c(((Boolean) b1Var11.getValue()).booleanValue(), null, null, null, null, t1.e.d(-699735659, new fz.f() { // from class: bt.s7
                                            @Override // fz.f
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                a0.k0 AnimatedVisibility = (a0.k0) obj6;
                                                ((Integer) obj8).getClass();
                                                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                                                float f13 = 10;
                                                z1.r rVarB = d2.h.b(j0.e2.g(j0.c.E(j0.e2.e(z1.o.f58481a, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 24, 7), f12), r0.f.d(f13));
                                                l1.s sVar7 = (l1.s) ((l1.n) obj7);
                                                jt.a2 a2Var8 = a2Var7;
                                                boolean zH3 = sVar7.h(a2Var8);
                                                CourseWord courseWord6 = courseWord5;
                                                boolean zH4 = zH3 | sVar7.h(courseWord6);
                                                Object objQ8 = sVar7.Q();
                                                if (zH4 || objQ8 == l1.m.f39353a) {
                                                    objQ8 = new at.f(18, a2Var8, courseWord6);
                                                    sVar7.o0(objQ8);
                                                }
                                                z1.r rVarO = d0.n.o(rVarB, false, null, (fz.a) objQ8, 15);
                                                r0.e eVarD = r0.f.d(f13);
                                                l1.c3 c3Var = h1.v1.f31180a;
                                                h1.k7.d(rVarO, eVarD, h1.k7.p(g2.x.c(ob.f.x((h1.s1) sVar7.j(c3Var), sVar7), 0.5f), sVar7, 0), null, d0.n.a(ob.f.w((h1.s1) sVar7.j(c3Var), sVar7), 2), t1.e.d(-299952925, new s3(courseWord6, 1), sVar7), sVar7, 196608, 8);
                                                return qy.b0.f48488a;
                                            }
                                        }, sVar4), sVar4, 1572870, 30);
                                        sVar4.p(false);
                                    }
                                    sVar4.p(false);
                                    sVar4.p(true);
                                } else {
                                    sVar4.W();
                                }
                                return qy.b0.f48488a;
                            }
                        }, sVar3), sVar3, 3126, 4);
                    } else {
                        sVar3.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar);
            t1.d dVar3 = b.f5199x;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new ju.d(25);
                sVar.o0(objQ);
            }
            fz.a aVar2 = (fz.a) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new ys.d(3);
                sVar.o0(objQ2);
            }
            fz.a aVar3 = (fz.a) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new ju.d(25);
                sVar.o0(objQ3);
            }
            dt.k3.e(null, qVar, aVar, false, false, false, z11, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, strE0, dVar, dVar2, dVarD, null, null, dVar3, null, null, null, null, null, null, onClickSkipListen, aVar2, onClickBugReport, aVar3, onClickContinue, null, null, (fz.a) objQ3, sVar, 196608, 807100416, ((i12 >> 3) & 3670016) | 817889280 | (i12 & 234881024), ((i12 >> 18) & 14) | 3072, 66461529, 3);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(courseTestParams, matchType, j11, j12, onClickPlayOptionAudio, onClickContinue, onClickSkipListen, onClickBugReport, i11) { // from class: bt.y7
                public final /* synthetic */ fz.a H;
                public final /* synthetic */ fz.c K;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ht.o f6229b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ot.a2 f6230c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f6231d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f6232e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ fz.f f6233f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ fz.a f6234t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    e8.b(this.f6228a, this.f6229b, this.f6230c, this.f6231d, this.f6232e, this.f6233f, this.f6234t, this.H, this.K, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void c(ot.u1 data, ht.o oVar, ys.d0 d0Var, l1.n nVar, int i11) {
        Object l6Var;
        int i12;
        ys.d0 d0Var2;
        kotlin.jvm.internal.m.f(data, "data");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1738094611);
        int i13 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(oVar) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            boolean zF = sVar.f(data);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zF2 = sVar.f(data);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(data.f46013b);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            ht.q qVar = (ht.q) b1Var.getValue();
            CourseWord courseWord = data.f46012a;
            List list = (List) b1Var2.getValue();
            int i14 = i13 & 896;
            boolean z11 = i14 == 256;
            Object objQ3 = sVar.Q();
            if (z11 || objQ3 == gVar) {
                objQ3 = new o5(d0Var, 28);
                sVar.o0(objQ3);
            }
            fz.a aVar = (fz.a) objQ3;
            boolean z12 = i14 == 256;
            Object objQ4 = sVar.Q();
            if (z12 || objQ4 == gVar) {
                objQ4 = new t6(d0Var, 4);
                sVar.o0(objQ4);
            }
            fz.e eVar = (fz.e) objQ4;
            boolean zF3 = sVar.f(b1Var2) | sVar.f(b1Var);
            Object objQ5 = sVar.Q();
            if (zF3 || objQ5 == gVar) {
                objQ5 = new bp.i2(b1Var2, b1Var, 7);
                sVar.o0(objQ5);
            }
            fz.c cVar = (fz.c) objQ5;
            boolean zF4 = sVar.f(b1Var2) | sVar.h(data) | sVar.f(b1Var) | (i14 == 256);
            Object objQ6 = sVar.Q();
            if (zF4 || objQ6 == gVar) {
                i12 = i14;
                d0Var2 = d0Var;
                l6Var = new l6(d0Var2, b1Var2, data, b1Var, 4);
                sVar.o0(l6Var);
            } else {
                i12 = i14;
                l6Var = objQ6;
                d0Var2 = d0Var;
            }
            fz.a aVar2 = (fz.a) l6Var;
            boolean z13 = i12 == 256;
            Object objQ7 = sVar.Q();
            if (z13 || objQ7 == gVar) {
                objQ7 = new o5(d0Var2, 29);
                sVar.o0(objQ7);
            }
            fz.a aVar3 = (fz.a) objQ7;
            boolean z14 = i12 == 256;
            Object objQ8 = sVar.Q();
            if (z14 || objQ8 == gVar) {
                objQ8 = new d8(d0Var2, 0);
                sVar.o0(objQ8);
            }
            fz.a aVar4 = (fz.a) objQ8;
            int i15 = i13 & 112;
            boolean z15 = (i15 == 32) | (i12 == 256);
            Object objQ9 = sVar.Q();
            if (z15 || objQ9 == gVar) {
                objQ9 = new k(d0Var2, oVar, 11);
                sVar.o0(objQ9);
            }
            fz.a aVar5 = (fz.a) objQ9;
            boolean z16 = (i12 == 256) | (i15 == 32);
            Object objQ10 = sVar.Q();
            if (z16 || objQ10 == gVar) {
                objQ10 = new e0(d0Var2, oVar, 20);
                sVar.o0(objQ10);
            }
            d(qVar, courseWord, list, oVar, aVar, eVar, cVar, aVar2, aVar3, aVar4, aVar5, (fz.c) objQ10, sVar, (i13 << 6) & 7168);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m6(data, oVar, d0Var, i11, 4);
        }
    }

    public static final void d(ht.q courseTestState, CourseWord word, List options, ht.o oVar, fz.a getComboCount, fz.e onClickPlayAudio, fz.c onClickOption, fz.a onClickCheck, fz.a onClickContinue, fz.a getAudioTime, fz.a onClickSkipListen, fz.c onClickBugReport, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        ns.z zVarJ;
        Object nVar2;
        boolean z11;
        l1.g gVar;
        fz.e eVar;
        l1.b1 b1Var;
        l1.s sVar2;
        CourseWord courseWord;
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(word, "word");
        kotlin.jvm.internal.m.f(options, "options");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onClickOption, "onClickOption");
        kotlin.jvm.internal.m.f(onClickCheck, "onClickCheck");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(getAudioTime, "getAudioTime");
        kotlin.jvm.internal.m.f(onClickSkipListen, "onClickSkipListen");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(-910460940);
        if ((i11 & 6) == 0) {
            i12 = (sVar3.d(courseTestState.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar3.h(word) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar3.h(options) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar3.f(oVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar3.h(getComboCount) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i13 = i12;
        if ((i11 & 196608) == 0) {
            i13 |= sVar3.h(onClickPlayAudio) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= sVar3.h(onClickOption) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i13 |= sVar3.h(onClickCheck) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i13 |= sVar3.h(onClickContinue) ? 67108864 : 33554432;
        }
        int i14 = (sVar3.h(onClickSkipListen) ? 4 : 2) | (sVar3.h(onClickBugReport) ? 32 : 16);
        if (sVar3.T(i13 & 1, ((i13 & 38347923) == 38347922 && (i14 & 19) == 18) ? false : true)) {
            boolean zBooleanValue = ((Boolean) sVar3.j(ju.f.f37372f)).booleanValue();
            boolean zF = sVar3.f(word);
            Object objQ = sVar3.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (zF || objQ == gVar2) {
                objQ = l1.t.B(ht.a.f33722e);
                sVar3.o0(objQ);
            }
            l1.b1 b1Var2 = (l1.b1) objQ;
            l1.b1 b1VarH = l1.t.H(courseTestState, sVar3);
            Object objQ2 = sVar3.Q();
            if (objQ2 == gVar2) {
                objQ2 = l1.t.s(new z6(19, b1VarH));
                sVar3.o0(objQ2);
            }
            l1.b3 b3Var = (l1.b3) objQ2;
            if (courseTestState == ht.q.WRONG) {
                CourseWord courseWordC = se.k.C(options);
                String translation = word.getTranslation();
                String word2 = word.getWord();
                String word3 = courseWordC != null ? courseWordC.getWord() : null;
                if (word3 == null) {
                    word3 = BuildConfig.VERSION_NAME;
                }
                zVarJ = se.k.j(oVar, "vocab_m8_select_pic_by_word", translation, word2, word3);
            } else {
                zVarJ = null;
            }
            int i15 = i13 & 458752;
            boolean zG = sVar3.g(zBooleanValue) | (i15 == 131072) | sVar3.h(word) | sVar3.f(b1Var2);
            Object objQ3 = sVar3.Q();
            if (zG || objQ3 == gVar2) {
                z11 = zBooleanValue;
                gVar = gVar2;
                eVar = onClickPlayAudio;
                b1Var = b1Var2;
                sVar2 = sVar3;
                courseWord = word;
                nVar2 = new n(z11, eVar, courseWord, b1Var, null, 1);
                sVar2.o0(nVar2);
            } else {
                b1Var = b1Var2;
                sVar2 = sVar3;
                courseWord = word;
                nVar2 = objQ3;
                z11 = zBooleanValue;
                gVar = gVar2;
                eVar = onClickPlayAudio;
            }
            l1.t.f((fz.e) nVar2, courseWord, sVar2);
            ht.l lVar = (ht.l) b1Var.getValue();
            t1.d dVarD = t1.e.d(1551691058, new c8(oVar, eVar, courseWord, b1Var), sVar2);
            t1.d dVarD2 = t1.e.d(1157287219, new c8(courseWord, oVar, eVar, b1Var), sVar2);
            fz.e eVar2 = eVar;
            l1.b1 b1Var3 = b1Var;
            CourseWord courseWord2 = courseWord;
            t1.d dVarD3 = t1.e.d(762883380, new n6(oVar, options, onClickOption, z11, eVar2, b1Var3, courseWord2, b3Var), sVar2);
            t1.d dVarD4 = t1.e.d(1540165539, new h6(courseTestState, courseWord2, 5), sVar2);
            boolean zH = (i15 == 131072) | sVar2.h(courseWord2) | sVar2.f(b1Var3);
            Object objQ4 = sVar2.Q();
            if (zH || objQ4 == gVar) {
                objQ4 = new o6(eVar2, courseWord2, b1Var3, 5);
                sVar2.o0(objQ4);
            }
            sVar = sVar2;
            dt.k3.e(null, courseTestState, lVar, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, null, null, dVarD4, zVarJ, null, null, null, null, null, onClickSkipListen, (fz.a) objQ4, onClickBugReport, getComboCount, onClickCheck, null, null, onClickContinue, sVar, ((i13 << 3) & 112) | 196608, 807100416, ((i14 << 18) & 3670016) | (234881024 & (i14 << 21)) | ((i13 << 15) & 1879048192), ((i13 >> 21) & 14) | ((i13 >> 15) & 7168), 65421273, 3);
        } else {
            sVar = sVar3;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i7(courseTestState, word, options, oVar, getComboCount, onClickPlayAudio, onClickOption, onClickCheck, onClickContinue, getAudioTime, onClickSkipListen, onClickBugReport, i11, 1);
        }
    }

    public static final void e(long j11, d0.v vVar, z1.r rVar, t1.d dVar, l1.n nVar, int i11) {
        z1.r rVar2;
        d0.v vVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1638672824);
        int i12 = (sVar.e(j11) ? 4 : 2) | i11 | (sVar.f(vVar) ? 32 : 16) | (sVar.f(rVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            rVar2 = rVar;
            h1.k7.d(rVar2, r0.f.d(10), h1.k7.p(j11, sVar, i12 & 14), null, vVar, t1.e.d(1904227222, new br.l(dVar, 1), sVar), sVar, ((i12 >> 6) & 14) | 196608 | ((i12 << 9) & 57344), 8);
            vVar2 = vVar;
        } else {
            rVar2 = rVar;
            vVar2 = vVar;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w7(j11, vVar2, rVar2, dVar, i11);
        }
    }

    public static final void f(final CourseWord courseWord, final ot.a2 matchType, final g8 direction, final boolean z11, final boolean z12, final jt.f2 sideEffect, final boolean z13, final float f5, final long j11, final fz.a aVar, final fz.a onClick, l1.n nVar, final int i11) {
        long jC;
        d0.v vVarA;
        long jT;
        kotlin.jvm.internal.m.f(matchType, "matchType");
        kotlin.jvm.internal.m.f(direction, "direction");
        kotlin.jvm.internal.m.f(sideEffect, "sideEffect");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1283422934);
        int i12 = i11 | (sVar.h(courseWord) ? 4 : 2) | (sVar.d(matchType.ordinal()) ? 32 : 16) | (sVar.g(z11) ? 2048 : 1024) | (sVar.g(z12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.f(sideEffect) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.g(z13) ? 1048576 : 524288) | (sVar.c(f5) ? 8388608 : 4194304) | (sVar.e(j11) ? 67108864 : 33554432) | (sVar.h(aVar) ? 536870912 : 268435456);
        if (sVar.T(i12 & 1, ((306783379 & i12) == 306783378 && ((sVar.h(onClick) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
            }
            sVar.q();
            final Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            if (z11) {
                sVar.d0(-653241929);
                if (sideEffect instanceof jt.c2) {
                    sVar.d0(-713804958);
                    jC = g2.x.c(ob.f.z((h1.s1) sVar.j(h1.v1.f31180a), sVar), 0.5f);
                    sVar.p(false);
                } else if (sideEffect instanceof jt.d2) {
                    sVar.d0(-713799582);
                    jC = g2.x.c(ob.f.x((h1.s1) sVar.j(h1.v1.f31180a), sVar), 0.5f);
                    sVar.p(false);
                } else {
                    sVar.d0(-713795582);
                    jC = g2.x.c(((h1.s1) sVar.j(h1.v1.f31180a)).f31021c, 0.5f);
                    sVar.p(false);
                }
                sVar.p(false);
            } else {
                sVar.d0(-652735389);
                if (z12) {
                    sVar.d0(-652710031);
                    jC = g2.x.c(ob.f.x((h1.s1) sVar.j(h1.v1.f31180a), sVar), 0.5f);
                    sVar.p(false);
                } else {
                    sVar.d0(-652572329);
                    jC = ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p;
                    sVar.p(false);
                }
                sVar.p(false);
            }
            final l1.b3 b3VarA = a0.t1.a(jC, null, BuildConfig.VERSION_NAME, sVar, 384, 10);
            if (z11) {
                sVar.d0(-652426257);
                if (sideEffect instanceof jt.c2) {
                    sVar.d0(-713780273);
                    vVarA = d0.n.a(ob.f.y((h1.s1) sVar.j(h1.v1.f31180a), sVar), 2);
                    sVar.p(false);
                } else if (sideEffect instanceof jt.d2) {
                    sVar.d0(-713775087);
                    vVarA = d0.n.a(ob.f.w((h1.s1) sVar.j(h1.v1.f31180a), sVar), 2);
                    sVar.p(false);
                } else {
                    sVar.d0(-713771091);
                    vVarA = d0.n.a(((h1.s1) sVar.j(h1.v1.f31180a)).f31017a, 2);
                    sVar.p(false);
                }
                sVar.p(false);
            } else {
                sVar.d0(-651941479);
                if (z12) {
                    sVar.d0(-651921639);
                    vVarA = d0.n.a(ob.f.w((h1.s1) sVar.j(h1.v1.f31180a), sVar), 2);
                    sVar.p(false);
                } else {
                    sVar.d0(-651789827);
                    vVarA = d0.n.a(((h1.s1) sVar.j(h1.v1.f31180a)).A, 2);
                    sVar.p(false);
                }
                sVar.p(false);
            }
            final d0.v vVar = vVarA;
            if (z11) {
                sVar.d0(-651573602);
                if (sideEffect instanceof jt.c2) {
                    sVar.d0(-713751618);
                    jT = ob.f.u((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                } else if (sideEffect instanceof jt.d2) {
                    sVar.d0(-713748096);
                    jT = ob.f.t((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                } else {
                    sVar.d0(-713745764);
                    jT = ((h1.s1) sVar.j(h1.v1.f31180a)).f31022d;
                    sVar.p(false);
                }
                sVar.p(false);
            } else {
                sVar.d0(-651229192);
                if (z12) {
                    sVar.d0(-651203896);
                    jT = ob.f.t((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                } else {
                    sVar.d0(-651118987);
                    jT = ((h1.s1) sVar.j(h1.v1.f31180a)).f31034q;
                    sVar.p(false);
                }
                sVar.p(false);
            }
            final l1.b3 b3VarA2 = a0.t1.a(jT, null, BuildConfig.VERSION_NAME, sVar, 384, 10);
            final l1.b3 b3VarB = b0.h.b(z13 ? 1.2f : 1.0f, null, BuildConfig.VERSION_NAME, sVar, 3072, 22);
            boolean z14 = ((57344 & i12) == 16384) | ((458752 & i12) == 131072) | ((i12 & 7168) == 2048);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z14 || objQ == gVar) {
                objQ = Boolean.valueOf((!z11 && z12) || (z12 && sideEffect.equals(jt.b2.f36896a)));
                sVar.o0(objQ);
            }
            boolean z15 = !((Boolean) objQ).booleanValue();
            a0.l1 l1VarE = a0.f1.e(null, 3);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new br.b(19);
                sVar.o0(objQ2);
            }
            a0.l1 l1VarA = l1VarE.a(a0.f1.c((fz.c) objQ2, 7));
            a0.m1 m1VarF = a0.f1.f(null, 3);
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new br.b(20);
                sVar.o0(objQ3);
            }
            sVar = sVar;
            a0.j0.d(z15, null, l1VarA, m1VarF.a(a0.f1.k((fz.c) objQ3, 7)), null, t1.e.d(-1944734206, new fz.f() { // from class: bt.t7
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    l1.g1 g1Var;
                    z1.j jVar;
                    a0.k0 AnimatedVisibility = (a0.k0) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    ((Integer) obj3).getClass();
                    kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                    ot.a2 a2Var = ot.a2.AudioWord;
                    ot.a2 a2Var2 = ot.a2.AudioZhuYin;
                    ot.a2 a2Var3 = ot.a2.AudioAudio;
                    ot.a2 a2Var4 = matchType;
                    boolean zD = ry.l.D(new ot.a2[]{a2Var, a2Var2, a2Var3}, a2Var4);
                    g8 g8Var = direction;
                    boolean z16 = z12;
                    final CourseWord courseWord2 = courseWord;
                    boolean z17 = (zD && g8Var == g8.Left && !z16) || (g8Var == g8.Left && courseWord2.getWordType() == 4) || (a2Var4 == a2Var3 && g8Var == g8.Right && !z16);
                    final fz.a aVar2 = aVar;
                    final boolean z18 = z17 && a2Var4 == a2Var3 && aVar2 != null;
                    z1.o oVar = z1.o.f58481a;
                    float f11 = f5;
                    final fz.a aVar3 = onClick;
                    d0.v vVar2 = vVar;
                    l1.b3 b3Var = b3VarB;
                    l1.b3 b3Var2 = b3VarA;
                    l1.g gVar2 = l1.m.f39353a;
                    if (z17) {
                        l1.s sVar2 = (l1.s) nVar2;
                        sVar2.d0(-762163564);
                        float f12 = 10;
                        z1.r rVarB = d2.h.b(j0.e2.g(j0.c.E(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 24, 7), f11), r0.f.d(f12));
                        boolean zF = sVar2.f(aVar3);
                        Object objQ4 = sVar2.Q();
                        if (zF || objQ4 == gVar2) {
                            objQ4 = new at.r(24, aVar3);
                            sVar2.o0(objQ4);
                        }
                        z1.r rVarQ = iu.k.q(0, 7, (fz.a) objQ4, sVar2, rVarB, false);
                        float fFloatValue = ((Number) b3Var.getValue()).floatValue();
                        z1.r rVarI = d2.h.i(rVarQ, fFloatValue, fFloatValue);
                        r0.e eVarD = r0.f.d(f12);
                        h1.t0 t0VarP = h1.k7.p(((g2.x) b3Var2.getValue()).f28624a, sVar2, 0);
                        final long j12 = j11;
                        h1.k7.d(rVarI, eVarD, t0VarP, null, vVar2, t1.e.d(753997775, new fz.f() { // from class: bt.v7
                            @Override // fz.f
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                j0.v Card = (j0.v) obj4;
                                l1.n nVar3 = (l1.n) obj5;
                                int iIntValue = ((Integer) obj6).intValue();
                                kotlin.jvm.internal.m.f(Card, "$this$Card");
                                l1.s sVar3 = (l1.s) nVar3;
                                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    z1.o oVar2 = z1.o.f58481a;
                                    z1.r rVarD = j0.e2.d(oVar2, 1.0f);
                                    z1.j jVar2 = z1.c.f58467e;
                                    w2.q0 q0VarD = j0.o.d(jVar2, false);
                                    int iHashCode = Long.hashCode(sVar3.T);
                                    l1.q1 q1VarL = sVar3.l();
                                    z1.r rVarC = z1.a.c(sVar3, rVarD);
                                    y2.k.J.getClass();
                                    y2.i iVar = y2.j.f56913b;
                                    sVar3.h0();
                                    if (sVar3.S) {
                                        sVar3.k(iVar);
                                    } else {
                                        sVar3.r0();
                                    }
                                    y2.h hVar = y2.j.f56917f;
                                    l1.t.J(hVar, q0VarD, sVar3);
                                    y2.h hVar2 = y2.j.f56916e;
                                    l1.t.J(hVar2, q1VarL, sVar3);
                                    y2.h hVar3 = y2.j.f56918g;
                                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
                                    }
                                    y2.h hVar4 = y2.j.f56915d;
                                    l1.t.J(hVar4, rVarC, sVar3);
                                    boolean z19 = z18;
                                    long j13 = j12;
                                    CourseWord courseWord3 = courseWord2;
                                    l1.g gVar3 = l1.m.f39353a;
                                    if (z19) {
                                        sVar3.d0(-223685241);
                                        z1.r rVarN = j0.e2.n(oVar2, 42);
                                        l1.c3 c3Var = h1.v1.f31180a;
                                        long j14 = ((h1.s1) sVar3.j(c3Var)).f31033p;
                                        r0.e eVar = r0.f.f48733a;
                                        z1.r rVarJ = d0.n.j(d0.n.h(rVarN, j14, eVar), 1, ((h1.s1) sVar3.j(c3Var)).A, eVar);
                                        w2.q0 q0VarD2 = j0.o.d(jVar2, false);
                                        int iHashCode2 = Long.hashCode(sVar3.T);
                                        l1.q1 q1VarL2 = sVar3.l();
                                        z1.r rVarC2 = z1.a.c(sVar3, rVarJ);
                                        sVar3.h0();
                                        if (sVar3.S) {
                                            sVar3.k(iVar);
                                        } else {
                                            sVar3.r0();
                                        }
                                        l1.t.J(hVar, q0VarD2, sVar3);
                                        l1.t.J(hVar2, q1VarL2, sVar3);
                                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar3);
                                        }
                                        l1.t.J(hVar4, rVarC2, sVar3);
                                        boolean z20 = j13 == courseWord3.getWordId();
                                        long j15 = ((h1.s1) sVar3.j(c3Var)).f31017a;
                                        z1.r rVarN2 = j0.e2.n(oVar2, 28);
                                        fz.a aVar4 = aVar2;
                                        boolean zF2 = sVar3.f(aVar4);
                                        Object objQ5 = sVar3.Q();
                                        if (zF2 || objQ5 == gVar3) {
                                            objQ5 = new at.r(26, aVar4);
                                            sVar3.o0(objQ5);
                                        }
                                        dt.a0.a(z20, rVarN2, j15, (fz.a) objQ5, sVar3, 48, 0);
                                        sVar3.p(true);
                                        sVar3.p(false);
                                    } else {
                                        sVar3.d0(-222522710);
                                        boolean z21 = j13 == courseWord3.getWordId();
                                        long j16 = ((h1.s1) sVar3.j(h1.v1.f31180a)).f31017a;
                                        z1.r rVarN3 = j0.e2.n(oVar2, 32);
                                        fz.a aVar5 = aVar3;
                                        boolean zF3 = sVar3.f(aVar5);
                                        Object objQ6 = sVar3.Q();
                                        if (zF3 || objQ6 == gVar3) {
                                            objQ6 = new at.r(27, aVar5);
                                            sVar3.o0(objQ6);
                                        }
                                        dt.a0.a(z21, rVarN3, j16, (fz.a) objQ6, sVar3, 48, 0);
                                        sVar3.p(false);
                                    }
                                    sVar3.p(true);
                                } else {
                                    sVar3.W();
                                }
                                return qy.b0.f48488a;
                            }
                        }, sVar2), sVar2, 196608, 8);
                        sVar2.p(false);
                    } else {
                        l1.s sVar3 = (l1.s) nVar2;
                        sVar3.d0(-759659942);
                        z1.j jVar2 = z1.c.f58463a;
                        w2.q0 q0VarD = j0.o.d(jVar2, false);
                        int iHashCode = Long.hashCode(sVar3.T);
                        l1.q1 q1VarL = sVar3.l();
                        z1.r rVarC = z1.a.c(sVar3, oVar);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD, sVar3);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar3);
                        y2.h hVar = y2.j.f56918g;
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar3);
                        long j13 = ((g2.x) b3Var2.getValue()).f28624a;
                        z1.r rVarB2 = d2.h.b(j0.e2.g(j0.c.E(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 24, 7), f11), r0.f.d(10));
                        boolean zF2 = sVar3.f(aVar3);
                        Object objQ5 = sVar3.Q();
                        if (zF2 || objQ5 == gVar2) {
                            objQ5 = new at.r(25, aVar3);
                            sVar3.o0(objQ5);
                        }
                        z1.r rVarQ2 = iu.k.q(0, 7, (fz.a) objQ5, sVar3, rVarB2, false);
                        float fFloatValue2 = ((Number) b3Var.getValue()).floatValue();
                        e8.e(j13, vVar2, d2.h.i(rVarQ2, fFloatValue2, fFloatValue2), t1.e.d(1935119263, new bp.t(g8Var, a2Var4, courseWord2, b3VarA2, 4), sVar3), sVar3, 3072);
                        Object objQ6 = sVar3.Q();
                        if (objQ6 == gVar2) {
                            objQ6 = hh.p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar3);
                        }
                        l1.g1 g1Var2 = (l1.g1) objQ6;
                        boolean z19 = z11;
                        Boolean boolValueOf = Boolean.valueOf(z19);
                        Boolean boolValueOf2 = Boolean.valueOf(z16);
                        boolean zG = sVar3.g(z19);
                        jt.f2 f2Var = sideEffect;
                        boolean zH = zG | sVar3.h(f2Var) | sVar3.g(z16);
                        Context context2 = context;
                        boolean zH2 = zH | sVar3.h(context2);
                        Object objQ7 = sVar3.Q();
                        if (zH2 || objQ7 == gVar2) {
                            g1Var = g1Var2;
                            jVar = jVar2;
                            a8 a8Var = new a8(z19, f2Var, z16, context2, g1Var, (vy.d) null);
                            sVar3.o0(a8Var);
                            objQ7 = a8Var;
                        } else {
                            g1Var = g1Var2;
                            jVar = jVar2;
                        }
                        l1.t.h(boolValueOf, boolValueOf2, f2Var, (fz.e) objQ7, sVar3);
                        l1.b3 b3VarB2 = b0.h.b(g1Var.l(), null, BuildConfig.VERSION_NAME, sVar3, 3072, 22);
                        k2.b bVarY = se.k.y(R.drawable.m6_word_match_correct_star, sVar3, 0);
                        float f13 = 8;
                        z1.r rVarE = j0.c.E(oVar, f13, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
                        j0.r rVar = j0.r.f35391a;
                        d0.n.c(bVarY, null, d2.h.a(rVar.a(rVarE, jVar), ((Number) b3VarB2.getValue()).floatValue()), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 48, 120);
                        d0.n.c(se.k.y(R.drawable.m6_word_match_correct_star, sVar3, 0), null, d2.h.a(rVar.a(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f13, 30, 3), z1.c.K), ((Number) b3VarB2.getValue()).floatValue()), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 48, 120);
                        sVar3.p(true);
                        sVar3.p(false);
                    }
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, 200064, 18);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(matchType, direction, z11, z12, sideEffect, z13, f5, j11, aVar, onClick, i11) { // from class: bt.u7
                public final /* synthetic */ float H;
                public final /* synthetic */ long K;
                public final /* synthetic */ fz.a L;
                public final /* synthetic */ fz.a M;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ot.a2 f6080b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g8 f6081c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f6082d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f6083e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ jt.f2 f6084f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ boolean f6085t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e8.f(this.f6079a, this.f6080b, this.f6081c, this.f6082d, this.f6083e, this.f6084f, this.f6085t, this.H, this.K, this.L, this.M, (l1.n) obj, l1.t.M(385));
                    return qy.b0.f48488a;
                }
            };
        }
    }
}
