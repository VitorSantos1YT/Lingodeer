package et;

import a0.m0;
import a0.t1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import av.j0;
import b0.o1;
import b0.x0;
import bt.s5;
import ch.n0;
import ch.o0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import com.google.accompanist.permissions.PermissionStatus;
import com.google.accompanist.permissions.PermissionsUtilKt;
import com.lingodeer.R;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.lingodeer.data.model.RecordingStatus;
import com.lingodeer.data.model.SentenceMFType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.d4;
import dt.h2;
import fr.j3;
import g2.f0;
import h1.i9;
import h1.k7;
import h1.r4;
import h1.s1;
import h1.t0;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.c2;
import j0.e2;
import j0.i1;
import j0.z1;
import j3.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l1.a1;
import l1.b1;
import l1.b3;
import l1.h1;
import l1.q1;
import l1.x1;
import rt.qa;
import w2.q0;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f25823a = new t1.d(new dt.g(6), false, 585183995);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f25824b = new t1.d(new dt.f(11), false, 1978435448);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r7v2, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r7v6, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static final void a(final CourseSentence courseSentence, final List stemWords, final boolean z11, final boolean z12, final boolean z13, final int i11, final fz.e onClickPlaySentenceAudio, final fz.e onClickPlayUserAudio, final fz.c onShowWordPopup, fz.a aVar, l1.n nVar, int i12) {
        ?? r9;
        Object obj;
        boolean z14;
        r0.e eVarE;
        long j11;
        int i13;
        long j12;
        ?? r11;
        float f5;
        boolean z15;
        boolean z16;
        kotlin.jvm.internal.m.f(stemWords, "stemWords");
        kotlin.jvm.internal.m.f(onClickPlaySentenceAudio, "onClickPlaySentenceAudio");
        kotlin.jvm.internal.m.f(onClickPlayUserAudio, "onClickPlayUserAudio");
        kotlin.jvm.internal.m.f(onShowWordPopup, "onShowWordPopup");
        ?? r12 = (l1.s) nVar;
        r12.f0(154395500);
        int i14 = i12 | (r12.h(courseSentence) ? 4 : 2) | (r12.h(stemWords) ? 32 : 16) | (r12.g(z11) ? 256 : 128) | (r12.g(z12) ? 2048 : 1024) | (r12.g(z13) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (r12.d(i11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (r12.h(onClickPlaySentenceAudio) ? 1048576 : 524288) | (r12.h(onClickPlayUserAudio) ? 8388608 : 4194304) | (r12.h(onShowWordPopup) ? 67108864 : 33554432) | (r12.h(aVar) ? 536870912 : 268435456);
        if (r12.T(i14 & 1, (306783379 & i14) != 306783378)) {
            Object objQ = r12.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                obj = objQ;
                rz.b0 b0VarQ = l1.t.q(r12);
                r12.o0(b0VarQ);
                obj = b0VarQ;
            }
            obj = objQ;
            rz.b0 b0Var = (rz.b0) obj;
            Object objQ2 = r12.Q();
            Object objR = objQ2;
            if (objQ2 == gVar) {
                objR = ep.a.r(0, r12);
            }
            b1 b1Var = (b1) objR;
            SentenceMFType sentenceMFType = courseSentence.getSentenceMFType();
            SentenceMFType sentenceMFType2 = SentenceMFType.MALE;
            if (sentenceMFType == sentenceMFType2) {
                z14 = false;
                float f11 = 12;
                eVarE = r0.f.e(0, f11, f11, f11);
            } else {
                z14 = false;
                float f12 = 12;
                eVarE = r0.f.e(f12, 0, f12, f12);
            }
            r0.e eVar = eVarE;
            if (courseSentence.getSentenceMFType() == sentenceMFType2) {
                r12.d0(-312701499);
                j11 = ((s1) r12.j(v1.f31180a)).f31033p;
                r12.p(z14);
            } else {
                r12.d0(-312646939);
                j11 = ((s1) r12.j(v1.f31180a)).f31033p;
                r12.p(z14);
            }
            if (courseSentence.getSentenceMFType() == sentenceMFType2) {
                r12.d0(-312520955);
                long j13 = ((s1) r12.j(v1.f31180a)).A;
                i13 = 0;
                r12.p(false);
                j12 = j13;
            } else {
                i13 = 0;
                r12.d0(-312466395);
                j12 = ((s1) r12.j(v1.f31180a)).A;
                r12.p(false);
            }
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, r12, i13);
            int iHashCode = Long.hashCode(r12.T);
            q1 q1VarL = r12.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(r12, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            r12.h0();
            if (r12.S) {
                r12.k(iVar);
            } else {
                r12.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, r12);
            l1.t.J(y2.j.f56916e, q1VarL, r12);
            y2.h hVar = y2.j.f56918g;
            if (r12.S || !kotlin.jvm.internal.m.a(r12.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, r12, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, r12);
            if (courseSentence.getSentenceMFType() == SentenceMFType.FEMALE) {
                r12.d0(-2055445196);
                f5 = Float.MAX_VALUE;
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j0.c.g(r12, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                r11 = 0;
            } else {
                r11 = 0;
                f5 = Float.MAX_VALUE;
                r12.d0(-2076355502);
            }
            r12.p(r11);
            t0 t0VarP = k7.p(j11, r12, r11);
            d0.v vVarA = d0.n.a(j12, 2);
            z1.r rVarA = m0.a(e2.w(oVar, null, 3), b0.e.r(150, r11, b0.b0.f3438a, 2));
            int i15 = (r12.h(b0Var) ? 1 : 0) | ((i14 & 1879048192) == 536870912 ? 1 : r11);
            Object objQ3 = r12.Q();
            Object obj2 = objQ3;
            if (i15 != 0 || objQ3 == gVar) {
                aj.c cVar = new aj.c(b0Var, b1Var, aVar, 25);
                r12.o0(cVar);
                obj2 = cVar;
            }
            ?? r13 = r12;
            k7.d(w2.a0.m(rVarA, (fz.c) obj2), eVar, t0VarP, null, vVarA, t1.e.d(-1200227518, new fz.f() { // from class: et.u
                @Override // fz.f
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    j0.v Card = (j0.v) obj3;
                    l1.n nVar2 = (l1.n) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    kotlin.jvm.internal.m.f(Card, "$this$Card");
                    l1.s sVar = (l1.s) nVar2;
                    if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        z1.o oVar2 = z1.o.f58481a;
                        z1.r rVarB = j0.c.B(oVar2, 12, 8);
                        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                        int iHashCode2 = Long.hashCode(sVar.T);
                        q1 q1VarL2 = sVar.l();
                        z1.r rVarC2 = z1.a.c(sVar, rVarB);
                        y2.k.J.getClass();
                        y2.i iVar2 = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar2);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                        y2.h hVar2 = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                        }
                        l1.t.J(y2.j.f56915d, rVarC2, sVar);
                        l1.d0 d0Var = ua.f31167a;
                        y0 y0VarA = y0.a((y0) sVar.j(d0Var), 0L, j3.A(20), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
                        j0.b bVar = j0.i.f35303a;
                        fz.e eVar2 = onClickPlaySentenceAudio;
                        boolean zF = sVar.f(eVar2);
                        CourseSentence courseSentence2 = courseSentence;
                        boolean zH = zF | sVar.h(courseSentence2);
                        Object objQ4 = sVar.Q();
                        l1.g gVar2 = l1.m.f39353a;
                        if (zH || objQ4 == gVar2) {
                            objQ4 = new bt.m0(eVar2, courseSentence2, 15);
                            sVar.o0(objQ4);
                        }
                        fz.a aVar2 = (fz.a) objQ4;
                        fz.c cVar2 = onShowWordPopup;
                        boolean zF2 = sVar.f(cVar2);
                        Object objQ5 = sVar.Q();
                        if (zF2 || objQ5 == gVar2) {
                            objQ5 = new o1(cVar2, 7);
                            sVar.o0(objQ5);
                        }
                        d4.a(stemWords, null, null, false, false, y0VarA, bVar, z11, true, i11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, z13, false, false, aVar2, null, (fz.c) objQ5, sVar, 102236160, 12582912, 0, 1375262);
                        ua.b(courseSentence2.getTranslation(), j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 9, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), ((s1) sVar.j(v1.f31180a)).f31036s, j3.A(14), n3.s.f43178t, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 48, 0, 65532);
                        if (courseSentence2.getSpeechScore() == -1.0f) {
                            sVar.d0(-1324465526);
                        } else {
                            sVar.d0(-1301072027);
                            j0.c.g(sVar, e2.g(oVar2, 7));
                            float speechScore = courseSentence2.getSpeechScore();
                            fz.e eVar3 = onClickPlayUserAudio;
                            boolean zF3 = sVar.f(eVar3) | sVar.h(courseSentence2);
                            Object objQ6 = sVar.Q();
                            if (zF3 || objQ6 == gVar2) {
                                objQ6 = new bt.m0(eVar3, courseSentence2, 16);
                                sVar.o0(objQ6);
                            }
                            a.h(speechScore, z12, (fz.a) objQ6, null, sVar, 0);
                        }
                        sVar.p(false);
                        sVar.p(true);
                    } else {
                        sVar.W();
                    }
                    return qy.b0.f48488a;
                }
            }, r12), r13, 196608, 8);
            if (courseSentence.getSentenceMFType() == sentenceMFType2) {
                r13.d0(-2052505900);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                z15 = true;
                j0.c.g(r13, new i1(1.0f > f5 ? f5 : 1.0f, true));
                z16 = false;
            } else {
                z15 = true;
                z16 = false;
                r13.d0(-2076355502);
            }
            r13.p(z16);
            r13.p(z15);
            r9 = r13;
        } else {
            ?? r14 = r12;
            r14.W();
            r9 = r14;
        }
        x1 x1VarT = r9.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v(courseSentence, stemWords, z11, z12, z13, i11, onClickPlaySentenceAudio, onClickPlayUserAudio, onShowWordPopup, aVar, i12);
        }
    }

    public static final void b(o courseTestDialogueSentence, boolean z11, fz.c onRefreshOneSentence, fz.a onFinishOneSentence, fz.a replay, fz.a redo, fz.a finish, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(courseTestDialogueSentence, "courseTestDialogueSentence");
        kotlin.jvm.internal.m.f(onRefreshOneSentence, "onRefreshOneSentence");
        kotlin.jvm.internal.m.f(onFinishOneSentence, "onFinishOneSentence");
        kotlin.jvm.internal.m.f(replay, "replay");
        kotlin.jvm.internal.m.f(redo, "redo");
        kotlin.jvm.internal.m.f(finish, "finish");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-840769542);
        int i12 = i11 | (sVar.h(courseTestDialogueSentence) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(onRefreshOneSentence) ? 256 : 128) | (sVar.h(onFinishOneSentence) ? 2048 : 1024) | (sVar.h(replay) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(redo) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.h(finish) ? 1048576 : 524288);
        if (sVar.T(i12 & 1, (599187 & i12) != 599186)) {
            int i13 = i12 >> 3;
            f(courseTestDialogueSentence, onRefreshOneSentence, onFinishOneSentence, sVar, (i12 & 14) | (i13 & 112) | (i13 & 896));
            if (z11) {
                sVar.d0(884358532);
                c(replay, redo, finish, sVar, (i12 >> 12) & 1022);
            } else {
                sVar.d0(880107688);
            }
            sVar.p(false);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new es.g(courseTestDialogueSentence, z11, onRefreshOneSentence, onFinishOneSentence, replay, redo, finish, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:103:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:105:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:110:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:116:0x0514  */
    /* JADX WARN: Code duplicated, block: B:117:0x0516  */
    /* JADX WARN: Code duplicated, block: B:124:0x0525  */
    /* JADX WARN: Code duplicated, block: B:127:0x0556  */
    /* JADX WARN: Code duplicated, block: B:128:0x055a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0575  */
    /* JADX WARN: Code duplicated, block: B:94:0x037f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0385  */
    public static final void c(fz.a replay, fz.a redo, fz.a finish, l1.n nVar, int i11) {
        int i12;
        y2.h hVar;
        l1.g gVar;
        int iHashCode;
        y2.i iVar;
        y2.h hVar2;
        y2.i iVar2;
        int iHashCode2;
        y2.i iVar3;
        y2.h hVar3;
        boolean z11;
        Object objQ;
        y2.h hVar4;
        int iHashCode3;
        kotlin.jvm.internal.m.f(replay, "replay");
        kotlin.jvm.internal.m.f(redo, "redo");
        kotlin.jvm.internal.m.f(finish, "finish");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1198990901);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(replay) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(redo) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(finish) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = e2.e(j0.c.C(oVar, 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
            a2 a2VarA = z1.a(j0.i.f35310h, z1.c.L, sVar, 54);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar4 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar4);
            } else {
                sVar.r0();
            }
            y2.h hVar5 = y2.j.f56917f;
            l1.t.J(hVar5, a2VarA, sVar);
            y2.h hVar6 = y2.j.f56916e;
            l1.t.J(hVar6, q1VarL, sVar);
            y2.h hVar7 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar7);
            }
            y2.h hVar8 = y2.j.f56915d;
            l1.t.J(hVar8, rVarC, sVar);
            z1.h hVar9 = z1.c.P;
            c2 c2Var = c2.f35266a;
            float f5 = 8;
            z1.r rVarC2 = j0.c.C(c2Var.a(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.d dVar = j0.i.f35305c;
            j0.u uVarA = j0.t.a(dVar, hVar9, sVar, 48);
            int iHashCode5 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarC2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar4);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar5, uVarA, sVar);
            l1.t.J(hVar6, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar7);
            }
            l1.t.J(hVar8, rVarC3, sVar);
            float f11 = 56;
            float f12 = 14;
            z1.r rVarB = d2.h.b(d0.n.h(e2.n(oVar, f11), k7.t(sVar).f31017a, r0.f.d(f12)), r0.f.d(f12));
            boolean z12 = (i12 & 14) == 4;
            Object objQ2 = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (z12 || objQ2 == gVar2) {
                objQ2 = new o0(27, replay);
                sVar.o0(objQ2);
            }
            z1.r rVarO = d0.n.o(rVarB, false, null, (fz.a) objQ2, 15);
            z1.j jVar = z1.c.f58467e;
            q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode6 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarO);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar4);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar5, q0VarD, sVar);
            l1.t.J(hVar6, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar7);
            }
            l1.t.J(hVar8, rVarC4, sVar);
            int i13 = i12;
            r4.b(se.k.y(R.drawable.ic_dialog_finish_replay, sVar, 0), null, null, k7.t(sVar).f31019b, sVar, 48, 4);
            sVar.p(true);
            String strE0 = ub.a.e0(sVar, R.string.replay);
            l1.d0 d0Var = ua.f31167a;
            y0 y0Var = (y0) sVar.j(d0Var);
            long jA = j3.A(14);
            n3.s sVar2 = n3.s.H;
            float f13 = 6;
            iu.k.h(strE0, e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 0L, null, null, 0L, j3.A(8), j3.A(14), null, 0L, jVar, 0, false, 2, 0, null, y0.a(y0Var, k7.t(sVar).f31036s, jA, sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), CropImageView.DEFAULT_ASPECT_RATIO, sVar, 14155824, 1575936, 1498940);
            sVar.p(true);
            z1.r rVarC5 = j0.c.C(c2Var.a(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.u uVarA2 = j0.t.a(dVar, hVar9, sVar, 48);
            int iHashCode7 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC6 = z1.a.c(sVar, rVarC5);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar4);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar5, uVarA2, sVar);
            l1.t.J(hVar6, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                hVar = hVar7;
                defpackage.e.A(iHashCode7, sVar, iHashCode7, hVar);
            } else {
                hVar = hVar7;
            }
            l1.t.J(hVar8, rVarC6, sVar);
            z1.r rVarB2 = d2.h.b(d0.n.h(e2.n(oVar, f11), k7.t(sVar).f31017a, r0.f.d(f12)), r0.f.d(f12));
            boolean z13 = (i13 & 112) == 32;
            Object objQ3 = sVar.Q();
            if (z13) {
                gVar = gVar2;
            } else {
                gVar = gVar2;
                if (objQ3 == gVar) {
                }
                z1.r rVarO2 = d0.n.o(rVarB2, false, null, (fz.a) objQ3, 15);
                q0 q0VarD2 = j0.o.d(jVar, false);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL5 = sVar.l();
                z1.r rVarC7 = z1.a.c(sVar, rVarO2);
                sVar.h0();
                if (sVar.S) {
                    iVar = iVar4;
                    sVar.k(iVar);
                } else {
                    iVar = iVar4;
                    sVar.r0();
                }
                l1.t.J(hVar5, q0VarD2, sVar);
                l1.t.J(hVar6, q1VarL5, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(hVar8, rVarC7, sVar);
                hVar2 = hVar;
                l1.g gVar3 = gVar;
                r4.b(se.k.y(R.drawable.ic_dialog_finish_redo, sVar, 0), null, null, k7.t(sVar).f31019b, sVar, 48, 4);
                sVar.p(true);
                iVar2 = iVar;
                iu.k.h(ub.a.e0(sVar, R.string.redo), e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 0L, null, null, 0L, j3.A(8), j3.A(14), null, 0L, jVar, 0, false, 2, 0, null, y0.a((y0) sVar.j(d0Var), k7.t(sVar).f31036s, j3.A(14), sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), CropImageView.DEFAULT_ASPECT_RATIO, sVar, 14155824, 1575936, 1498940);
                sVar.p(true);
                z1.r rVarC8 = j0.c.C(c2Var.a(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                j0.u uVarA3 = j0.t.a(dVar, hVar9, sVar, 48);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL6 = sVar.l();
                z1.r rVarC9 = z1.a.c(sVar, rVarC8);
                sVar.h0();
                if (sVar.S) {
                    iVar3 = iVar2;
                    sVar.k(iVar3);
                } else {
                    iVar3 = iVar2;
                    sVar.r0();
                }
                l1.t.J(hVar5, uVarA3, sVar);
                l1.t.J(hVar6, q1VarL6, sVar);
                if (sVar.S && kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    hVar3 = hVar2;
                } else {
                    hVar3 = hVar2;
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                }
                l1.t.J(hVar8, rVarC9, sVar);
                z1.r rVarB3 = d2.h.b(d0.n.h(e2.n(oVar, f11), k7.t(sVar).f31017a, r0.f.d(f12)), r0.f.d(f12));
                if ((i13 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objQ = sVar.Q();
                if (z11 || objQ == gVar3) {
                    objQ = new o0(29, finish);
                    sVar.o0(objQ);
                }
                z1.r rVarO3 = d0.n.o(rVarB3, false, null, (fz.a) objQ, 15);
                q0 q0VarD3 = j0.o.d(jVar, false);
                hVar4 = hVar3;
                iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL7 = sVar.l();
                z1.r rVarC10 = z1.a.c(sVar, rVarO3);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar5, q0VarD3, sVar);
                l1.t.J(hVar6, q1VarL7, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
                }
                l1.t.J(hVar8, rVarC10, sVar);
                r4.b(se.k.y(R.drawable.ic_dialog_finish_quit, sVar, 0), null, null, k7.t(sVar).f31019b, sVar, 48, 4);
                sVar.p(true);
                iu.k.h(ub.a.e0(sVar, R.string.test_finish), e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 0L, null, null, 0L, j3.A(8), j3.A(14), null, 0L, jVar, 0, false, 2, 0, null, y0.a((y0) sVar.j(d0Var), k7.t(sVar).f31036s, j3.A(14), sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), CropImageView.DEFAULT_ASPECT_RATIO, sVar, 14155824, 1575936, 1498940);
                sVar = sVar;
                sVar.p(true);
                sVar.p(true);
            }
            objQ3 = new o0(28, redo);
            sVar.o0(objQ3);
            z1.r rVarO4 = d0.n.o(rVarB2, false, null, (fz.a) objQ3, 15);
            q0 q0VarD4 = j0.o.d(jVar, false);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL8 = sVar.l();
            z1.r rVarC11 = z1.a.c(sVar, rVarO4);
            sVar.h0();
            if (sVar.S) {
                iVar = iVar4;
                sVar.k(iVar);
            } else {
                iVar = iVar4;
                sVar.r0();
            }
            l1.t.J(hVar5, q0VarD4, sVar);
            l1.t.J(hVar6, q1VarL8, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(hVar8, rVarC11, sVar);
            hVar2 = hVar;
            l1.g gVar4 = gVar;
            r4.b(se.k.y(R.drawable.ic_dialog_finish_redo, sVar, 0), null, null, k7.t(sVar).f31019b, sVar, 48, 4);
            sVar.p(true);
            iVar2 = iVar;
            iu.k.h(ub.a.e0(sVar, R.string.redo), e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 0L, null, null, 0L, j3.A(8), j3.A(14), null, 0L, jVar, 0, false, 2, 0, null, y0.a((y0) sVar.j(d0Var), k7.t(sVar).f31036s, j3.A(14), sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), CropImageView.DEFAULT_ASPECT_RATIO, sVar, 14155824, 1575936, 1498940);
            sVar.p(true);
            z1.r rVarC12 = j0.c.C(c2Var.a(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.u uVarA4 = j0.t.a(dVar, hVar9, sVar, 48);
            iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL9 = sVar.l();
            z1.r rVarC13 = z1.a.c(sVar, rVarC12);
            sVar.h0();
            if (sVar.S) {
                iVar3 = iVar2;
                sVar.k(iVar3);
            } else {
                iVar3 = iVar2;
                sVar.r0();
            }
            l1.t.J(hVar5, uVarA4, sVar);
            l1.t.J(hVar6, q1VarL9, sVar);
            if (sVar.S) {
                hVar3 = hVar2;
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            } else {
                hVar3 = hVar2;
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar8, rVarC13, sVar);
            z1.r rVarB4 = d2.h.b(d0.n.h(e2.n(oVar, f11), k7.t(sVar).f31017a, r0.f.d(f12)), r0.f.d(f12));
            if ((i13 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            objQ = sVar.Q();
            if (z11) {
                objQ = new o0(29, finish);
                sVar.o0(objQ);
            } else {
                objQ = new o0(29, finish);
                sVar.o0(objQ);
            }
            z1.r rVarO5 = d0.n.o(rVarB4, false, null, (fz.a) objQ, 15);
            q0 q0VarD5 = j0.o.d(jVar, false);
            hVar4 = hVar3;
            iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL10 = sVar.l();
            z1.r rVarC14 = z1.a.c(sVar, rVarO5);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar5, q0VarD5, sVar);
            l1.t.J(hVar6, q1VarL10, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
            } else {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
            }
            l1.t.J(hVar8, rVarC14, sVar);
            r4.b(se.k.y(R.drawable.ic_dialog_finish_quit, sVar, 0), null, null, k7.t(sVar).f31019b, sVar, 48, 4);
            sVar.p(true);
            iu.k.h(ub.a.e0(sVar, R.string.test_finish), e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 0L, null, null, 0L, j3.A(8), j3.A(14), null, 0L, jVar, 0, false, 2, 0, null, y0.a((y0) sVar.j(d0Var), k7.t(sVar).f31036s, j3.A(14), sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), CropImageView.DEFAULT_ASPECT_RATIO, sVar, 14155824, 1575936, 1498940);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n0(replay, redo, finish, i11, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [int] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v13, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r7v8, types: [l1.n] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r8v3, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r8v4, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r8v6, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r8v7, types: [l1.n, l1.s] */
    public static final void d(List list, int i11, fz.c onClickOption, l1.n nVar, int i12) {
        ?? r9;
        int iL;
        boolean z11;
        boolean z12;
        ?? r11;
        Object next;
        OptionItemSelectedState optionItemSelectedState;
        z1.o oVar;
        long jX;
        b3 b3VarA;
        ?? r12;
        long jT;
        b3 b3VarA2;
        boolean z13;
        kotlin.jvm.internal.m.f(onClickOption, "onClickOption");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-286231921);
        int i13 = i12 | (sVar.h(list) ? 4 : 2) | (sVar.d(i11) ? 32 : 16) | (sVar.h(onClickOption) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            v3.c cVar = (v3.c) sVar.j(g1.f58547h);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = defpackage.e.v(0, sVar);
            }
            a1 a1Var = (a1) objQ;
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarC = j0.c.C(e2.d(oVar2, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 16, 1);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new bt.a2(a1Var, 6);
                sVar.o0(objQ2);
            }
            z1.r rVarN = w2.a0.n(rVarC, (fz.c) objQ2);
            q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarN);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC2, sVar);
            float f5 = 10;
            z1.r rVarE = j0.c.E(e2.e(oVar2, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 10);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            h1 h1Var = (h1) a1Var;
            boolean zD = sVar.d(h1Var.l());
            Object objQ3 = sVar.Q();
            if (zD || objQ3 == gVar) {
                if (h1Var.l() > 0) {
                    iL = (int) ((h1Var.l() - cVar.e0(12)) / cVar.e0(60));
                    if (iL < 1) {
                        iL = 1;
                    }
                } else {
                    iL = 4;
                }
                objQ3 = Integer.valueOf(iL);
                sVar.o0(objQ3);
            }
            int iIntValue = ((Number) objQ3).intValue();
            if (iIntValue <= 0 || list.isEmpty()) {
                z11 = false;
                z12 = true;
                sVar.d0(-274286281);
                r11 = sVar;
            } else {
                sVar.d0(-230697584);
                if (iIntValue < 1) {
                    iIntValue = 1;
                }
                ArrayList arrayListG1 = ry.m.g1(list, iIntValue, iIntValue);
                int size = arrayListG1.size();
                int i14 = 0;
                ?? r13 = sVar;
                while (i14 < size) {
                    int i15 = i14 + 1;
                    List<CourseWord> list2 = (List) arrayListG1.get(i14);
                    boolean zF = r13.f(list2);
                    Object objQ4 = r13.Q();
                    if (zF || objQ4 == gVar) {
                        Iterator it = list2.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((CourseWord) next).getSelectedState() != OptionItemSelectedState.DEFAULT);
                        objQ4 = Boolean.valueOf(next == null);
                        r13.o0(objQ4);
                    }
                    boolean zBooleanValue = ((Boolean) objQ4).booleanValue();
                    float f11 = zBooleanValue ? 0 : 46 + f5;
                    ?? r14 = r13;
                    l1.g gVar2 = gVar;
                    char c11 = 0;
                    char c12 = 6;
                    ?? r15 = r14;
                    z1.r rVarE2 = e2.e(j0.c.E(e2.g(oVar2, ((v3.f) b0.h.a(f11, null, BuildConfig.VERSION_NAME, r14, 384, 10).getValue()).f53489a), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, zBooleanValue ? 0 : f5, 7), 1.0f);
                    j0.b bVar = j0.i.f35303a;
                    a2 a2VarA = z1.a(j0.i.h(8), z1.c.L, r15, 6);
                    int iHashCode3 = Long.hashCode(r15.T);
                    q1 q1VarL3 = r15.l();
                    z1.r rVarC4 = z1.a.c(r15, rVarE2);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    r15.h0();
                    if (r15.S) {
                        r15.k(iVar2);
                    } else {
                        r15.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, r15);
                    l1.t.J(y2.j.f56916e, q1VarL3, r15);
                    y2.h hVar5 = y2.j.f56918g;
                    if (r15.S || !kotlin.jvm.internal.m.a(r15.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, r15, iHashCode3, hVar5);
                    }
                    l1.t.J(y2.j.f56915d, rVarC4, r15);
                    r15.d0(-959161013);
                    ?? r16 = r15;
                    for (CourseWord courseWord : list2) {
                        int iIndexOf = list.indexOf(courseWord);
                        OptionItemSelectedState selectedState = courseWord.getSelectedState();
                        OptionItemSelectedState optionItemSelectedState2 = OptionItemSelectedState.DEFAULT;
                        if (selectedState != optionItemSelectedState2) {
                            r16.d0(330875275);
                            if (courseWord.getSelectedState() == OptionItemSelectedState.WRONG) {
                                r16.d0(330956402);
                                oVar = oVar2;
                                optionItemSelectedState = optionItemSelectedState2;
                                b3VarA = t1.a(ob.f.z((s1) r16.j(v1.f31180a), r16), null, BuildConfig.VERSION_NAME, r16, 384, 10);
                                z13 = false;
                                r16.p(false);
                            } else {
                                optionItemSelectedState = optionItemSelectedState2;
                                oVar = oVar2;
                                r16.d0(331201085);
                                b3VarA = t1.a(((s1) r16.j(v1.f31180a)).A, null, BuildConfig.VERSION_NAME, r16, 384, 10);
                                z13 = false;
                                r16.p(false);
                            }
                            r16.p(z13);
                        } else {
                            courseWord = courseWord;
                            iIndexOf = iIndexOf;
                            optionItemSelectedState = optionItemSelectedState2;
                            oVar = oVar2;
                            r16.d0(331467933);
                            if (i11 == iIndexOf) {
                                r16.d0(-959134157);
                                jX = ob.f.x((s1) r16.j(v1.f31180a), r16);
                            } else {
                                r16.d0(-959132506);
                                jX = ((s1) r16.j(v1.f31180a)).f31033p;
                            }
                            r16.p(false);
                            b3VarA = t1.a(jX, null, BuildConfig.VERSION_NAME, r16, 384, 10);
                            r16.p(false);
                        }
                        b3 b3Var = b3VarA;
                        ?? r17 = r16;
                        b3 b3VarB = b0.h.b(i11 == iIndexOf ? 1.1f : 1.0f, null, BuildConfig.VERSION_NAME, r17, 3072, 22);
                        if (courseWord.getSelectedState() != optionItemSelectedState) {
                            r17.d0(332166921);
                            if (courseWord.getSelectedState() == OptionItemSelectedState.WRONG) {
                                r17.d0(332248048);
                                b3VarA2 = t1.a(ob.f.u((s1) r17.j(v1.f31180a), r17), null, BuildConfig.VERSION_NAME, r17, 384, 10);
                                r17.p(false);
                                r12 = 0;
                            } else {
                                r17.d0(332494653);
                                b3VarA2 = t1.a(((s1) r17.j(v1.f31180a)).A, null, BuildConfig.VERSION_NAME, r17, 384, 10);
                                r12 = 0;
                                r17.p(false);
                            }
                            r17.p(r12);
                        } else {
                            r12 = 0;
                            r17.d0(332761625);
                            if (i11 == iIndexOf) {
                                r17.d0(-959092427);
                                jT = ob.f.t((s1) r17.j(v1.f31180a), r17);
                            } else {
                                r17.d0(-959090712);
                                jT = ((s1) r17.j(v1.f31180a)).f31034q;
                            }
                            r17.p(false);
                            b3VarA2 = t1.a(jT, null, BuildConfig.VERSION_NAME, r17, 384, 10);
                            r17.p(false);
                        }
                        k7.d(f0.s(e2.g(e2.s(oVar, 52), 46), ((Number) b3VarB.getValue()).floatValue(), ((Number) b3VarB.getValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 524284), r0.f.d(f5), k7.p(((g2.x) b3Var.getValue()).f28624a, r17, r12), null, d0.n.a(((s1) r17.j(v1.f31180a)).A, 2), t1.e.d(1432149707, new defpackage.d(courseWord, onClickOption, b3VarA2, 4), r17), r17, 196608, 8);
                        r16 = r17;
                        oVar2 = oVar;
                        c11 = 0;
                        c12 = 6;
                        arrayListG1 = arrayListG1;
                    }
                    r16.p(false);
                    r16.p(true);
                    i14 = i15;
                    gVar = gVar2;
                    arrayListG1 = arrayListG1;
                    r13 = r16;
                }
                z11 = false;
                z12 = true;
                r11 = r13;
            }
            r11.p(z11);
            r11.p(z12);
            r11.p(z12);
            r9 = r11;
        } else {
            sVar.W();
            r9 = sVar;
        }
        x1 x1VarT = r9.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(list, i11, onClickOption, i12, 0);
        }
    }

    public static final void e(o oVar, boolean z11, fz.c onRefreshOneSentence, fz.a onFinishOneSentence, l1.n nVar, int i11) {
        boolean z12;
        o courseTestDialogueSentence = oVar;
        kotlin.jvm.internal.m.f(courseTestDialogueSentence, "courseTestDialogueSentence");
        kotlin.jvm.internal.m.f(onRefreshOneSentence, "onRefreshOneSentence");
        kotlin.jvm.internal.m.f(onFinishOneSentence, "onFinishOneSentence");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(646767176);
        int i12 = (sVar.h(courseTestDialogueSentence) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16);
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onRefreshOneSentence) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onFinishOneSentence) ? 2048 : 1024;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            long jC = ct.c.c(sVar);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar);
                sVar.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            y0 y0VarB = ct.c.b(sVar);
            if (courseTestDialogueSentence instanceof h) {
                sVar.d0(-1226986836);
                sVar.p(false);
            } else {
                vy.d dVar = null;
                if (courseTestDialogueSentence instanceof k) {
                    sVar.d0(618288900);
                    Boolean boolValueOf = Boolean.valueOf(z11);
                    int i14 = i13 & 896;
                    boolean zH = ((i13 & 112) == 32) | (i14 == 256) | sVar.h(courseTestDialogueSentence);
                    Object objQ2 = sVar.Q();
                    if (zH || objQ2 == gVar) {
                        objQ2 = new e(z11, onRefreshOneSentence, courseTestDialogueSentence, null);
                        sVar.o0(objQ2);
                    }
                    l1.t.f((fz.e) objQ2, boolValueOf, sVar);
                    List list = ((k) courseTestDialogueSentence).f25888c.f45830c;
                    boolean zH2 = sVar.h(courseTestDialogueSentence) | ((i13 & 7168) == 2048) | sVar.h(b0Var) | (i14 == 256);
                    Object objQ3 = sVar.Q();
                    if (zH2 || objQ3 == gVar) {
                        objQ3 = new b(courseTestDialogueSentence, onFinishOneSentence, b0Var, onRefreshOneSentence);
                        sVar.o0(objQ3);
                    }
                    bt.b.o(list, true, (fz.c) objQ3, sVar, 48);
                    sVar.p(false);
                } else if (courseTestDialogueSentence instanceof i) {
                    sVar.d0(622134078);
                    Boolean boolValueOf2 = Boolean.valueOf(z11);
                    int i15 = i13 & 896;
                    boolean zH3 = ((i13 & 112) == 32) | sVar.h(courseTestDialogueSentence) | (i15 == 256);
                    Object objQ4 = sVar.Q();
                    if (zH3 || objQ4 == gVar) {
                        objQ4 = new e(z11, courseTestDialogueSentence, onRefreshOneSentence, null, 1);
                        sVar.o0(objQ4);
                    }
                    l1.t.f((fz.e) objQ4, boolValueOf2, sVar);
                    boolean zE = sVar.e(r19);
                    Object objQ5 = sVar.Q();
                    if (zE || objQ5 == gVar) {
                        objQ5 = l1.t.B(y0.a(y0VarB, 0L, jC, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209));
                        sVar.o0(objQ5);
                    }
                    b1 b1Var = (b1) objQ5;
                    List list2 = ((i) courseTestDialogueSentence).f25883b.f45763c;
                    boolean zH4 = sVar.h(courseTestDialogueSentence) | ((i13 & 7168) == 2048) | (i15 == 256) | sVar.h(b0Var);
                    Object objQ6 = sVar.Q();
                    if (zH4 || objQ6 == gVar) {
                        b bVar = new b(courseTestDialogueSentence, onFinishOneSentence, onRefreshOneSentence, b0Var, 3);
                        courseTestDialogueSentence = courseTestDialogueSentence;
                        sVar.o0(bVar);
                        objQ6 = bVar;
                    }
                    bt.b.y(list2, b1Var, true, null, null, false, null, 0, false, null, (fz.c) objQ6, sVar, 384, 0, 1016);
                    sVar = sVar;
                    sVar.p(false);
                } else if (courseTestDialogueSentence instanceof j) {
                    sVar.d0(629482535);
                    Object objQ7 = sVar.Q();
                    if (objQ7 == gVar) {
                        objQ7 = l1.t.q(sVar);
                        sVar.o0(objQ7);
                    }
                    rz.b0 b0Var2 = (rz.b0) objQ7;
                    Object objQ8 = sVar.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new x1.p();
                        sVar.o0(objQ8);
                    }
                    x1.p pVar = (x1.p) objQ8;
                    if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(((Number) sVar.j(ju.f.f37370d)).intValue()))) {
                        sVar.d0(-1226617790);
                        boolean zD = ry.l.D(new Integer[]{2, 4}, Integer.valueOf(((ct.b) sVar.j(ct.c.f22476a)).f22473h));
                        sVar.p(false);
                        z12 = zD;
                    } else {
                        sVar.d0(629555411);
                        sVar.p(false);
                        z12 = false;
                    }
                    Object objQ9 = sVar.Q();
                    if (objQ9 == gVar) {
                        objQ9 = defpackage.e.v(-1, sVar);
                    }
                    a1 a1Var = (a1) objQ9;
                    Boolean boolValueOf3 = Boolean.valueOf(z11);
                    boolean zH5 = sVar.h(courseTestDialogueSentence) | ((i13 & 112) == 32) | sVar.g(z12);
                    Object objQ10 = sVar.Q();
                    if (zH5 || objQ10 == gVar) {
                        ca.c cVar = new ca.c(z11, courseTestDialogueSentence, z12, a1Var, (vy.d) null);
                        sVar.o0(cVar);
                        objQ10 = cVar;
                    }
                    l1.t.f((fz.e) objQ10, boolValueOf3, sVar);
                    List list3 = ((j) courseTestDialogueSentence).f25885b.f45804c;
                    int iL = ((h1) a1Var).l();
                    boolean zH6 = sVar.h(b0Var2) | sVar.h(courseTestDialogueSentence) | sVar.g(z12) | ((i13 & 7168) == 2048) | ((i13 & 896) == 256);
                    Object objQ11 = sVar.Q();
                    if (zH6 || objQ11 == gVar) {
                        d dVar2 = new d(b0Var2, courseTestDialogueSentence, z12, pVar, onFinishOneSentence, onRefreshOneSentence);
                        sVar.o0(dVar2);
                        objQ11 = dVar2;
                    }
                    d(list3, iL, (fz.c) objQ11, sVar, r6);
                    sVar.p(false);
                } else {
                    if (courseTestDialogueSentence instanceof l) {
                        sVar.d0(635638918);
                        Boolean boolValueOf4 = Boolean.valueOf(z11);
                        int i16 = i13 & 896;
                        boolean zH7 = sVar.h(courseTestDialogueSentence) | ((i13 & 112) == 32) | (i16 == 256);
                        Object objQ12 = sVar.Q();
                        if (zH7 || objQ12 == gVar) {
                            e eVar = new e(z11, courseTestDialogueSentence, onRefreshOneSentence, dVar, 2);
                            sVar.o0(eVar);
                            objQ12 = eVar;
                        }
                        l1.t.f((fz.e) objQ12, boolValueOf4, sVar);
                        Object objQ13 = sVar.Q();
                        if (objQ13 == gVar) {
                            objQ13 = l1.t.B(y0.a(y0VarB, 0L, jC, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209));
                            sVar.o0(objQ13);
                        }
                        b1 b1Var2 = (b1) objQ13;
                        List list4 = ((l) courseTestDialogueSentence).f25890b.f45881d;
                        boolean zH8 = sVar.h(courseTestDialogueSentence) | ((i13 & 7168) == 2048) | (i16 == 256) | sVar.h(b0Var);
                        Object objQ14 = sVar.Q();
                        if (zH8 || objQ14 == gVar) {
                            b bVar2 = new b(courseTestDialogueSentence, onFinishOneSentence, onRefreshOneSentence, b0Var, 0);
                            courseTestDialogueSentence = courseTestDialogueSentence;
                            sVar.o0(bVar2);
                            objQ14 = bVar2;
                        }
                        bt.b.y(list4, b1Var2, true, null, null, false, null, 0, false, null, (fz.c) objQ14, sVar, 432, 0, 1016);
                        sVar = sVar;
                        sVar.p(false);
                    } else if (courseTestDialogueSentence instanceof m) {
                        sVar.d0(642326455);
                        Boolean boolValueOf5 = Boolean.valueOf(z11);
                        int i17 = i13 & 896;
                        boolean zH9 = sVar.h(courseTestDialogueSentence) | ((i13 & 112) == 32) | (i17 == 256);
                        Object objQ15 = sVar.Q();
                        if (zH9 || objQ15 == gVar) {
                            e eVar2 = new e(z11, courseTestDialogueSentence, onRefreshOneSentence, dVar, 3);
                            sVar.o0(eVar2);
                            objQ15 = eVar2;
                        }
                        l1.t.f((fz.e) objQ15, boolValueOf5, sVar);
                        Object objQ16 = sVar.Q();
                        if (objQ16 == gVar) {
                            objQ16 = l1.t.B(y0.a(y0VarB, 0L, jC, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209));
                            sVar.o0(objQ16);
                        }
                        b1 b1Var3 = (b1) objQ16;
                        List list5 = ((m) courseTestDialogueSentence).f25893c.f45908b;
                        boolean zH10 = sVar.h(courseTestDialogueSentence) | ((i13 & 7168) == 2048) | (i17 == 256) | sVar.h(b0Var);
                        Object objQ17 = sVar.Q();
                        if (zH10 || objQ17 == gVar) {
                            b bVar3 = new b(courseTestDialogueSentence, onFinishOneSentence, onRefreshOneSentence, b0Var, 1);
                            courseTestDialogueSentence = courseTestDialogueSentence;
                            sVar.o0(bVar3);
                            objQ17 = bVar3;
                        }
                        bt.b.y(list5, b1Var3, true, null, null, false, null, 0, false, null, (fz.c) objQ17, sVar, 432, 0, 1016);
                        sVar = sVar;
                        sVar.p(false);
                    } else {
                        if (!(courseTestDialogueSentence instanceof n)) {
                            throw nv.p.x(sVar, -1226958519, false);
                        }
                        sVar.d0(-1225989620);
                        sVar.p(false);
                    }
                }
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.o(courseTestDialogueSentence, z11, onRefreshOneSentence, onFinishOneSentence, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    public static final void f(o oVar, fz.c cVar, fz.a aVar, l1.n nVar, int i11) {
        fz.c cVar2;
        fz.a aVar2;
        ?? r9;
        b1 b1Var;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(143489401);
        int i12 = (sVar.h(oVar) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            cVar2 = cVar;
            i12 |= sVar.h(cVar2) ? 32 : 16;
        } else {
            cVar2 = cVar;
        }
        if ((i11 & 384) == 0) {
            aVar2 = aVar;
            i12 |= sVar.h(aVar2) ? 256 : 128;
        } else {
            aVar2 = aVar;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar.Q();
            Object obj = l1.m.f39353a;
            if (objQ == obj) {
                objQ = l1.t.q(sVar);
                sVar.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == obj) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var2 = (b1) objQ2;
            boolean z11 = oVar instanceof h;
            z1.o oVar2 = z1.o.f58481a;
            if (z11 || (oVar instanceof n)) {
                r9 = 0;
                b1Var = b1Var2;
                sVar.d0(1191141417);
            } else {
                sVar.d0(1200777829);
                z1.r rVarD = e2.d(oVar2, 1.0f);
                q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                int iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
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
                boolean zH = sVar.h(b0Var);
                Object objQ3 = sVar.Q();
                if (zH || objQ3 == obj) {
                    objQ3 = new at.f(29, b0Var, b1Var2);
                    sVar.o0(objQ3);
                }
                b1Var = b1Var2;
                r9 = 0;
                k7.h((fz.a) objQ3, j0.r.f35391a.a(oVar2, z1.c.f58465c), false, null, f25823a, sVar, 196608, 28);
                sVar.p(true);
            }
            sVar.p(r9);
            z1.r rVarY = d0.n.y(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 36, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), d0.n.u(sVar), true, 12);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, r9);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarY);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL2, sVar);
            y2.h hVar2 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            int i13 = i12 & 14;
            int i14 = i12 << 3;
            e(oVar, ((Boolean) b1Var.getValue()).booleanValue(), cVar2, aVar2, sVar, i13 | (i14 & 896) | (i14 & 7168));
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h((Object) oVar, cVar, (Object) aVar, i11, 9);
        }
    }

    public static final void g(List sentences, CoursePracticeType practiceType, qa runtimeState, fz.c cVar, fz.c onProgressChange, fz.a onFinish, l1.n nVar, int i11) {
        fz.c cVar2;
        l1.s sVar;
        Object obj;
        vy.d dVar;
        fz.c onRuntimeStateChange = cVar;
        kotlin.jvm.internal.m.f(sentences, "sentences");
        kotlin.jvm.internal.m.f(practiceType, "practiceType");
        kotlin.jvm.internal.m.f(runtimeState, "runtimeState");
        List list = runtimeState.f50296a;
        kotlin.jvm.internal.m.f(onRuntimeStateChange, "onRuntimeStateChange");
        kotlin.jvm.internal.m.f(onProgressChange, "onProgressChange");
        kotlin.jvm.internal.m.f(onFinish, "onFinish");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1064755640);
        int i12 = i11 | (sVar2.h(sentences) ? 4 : 2) | (sVar2.d(practiceType.ordinal()) ? 32 : 16) | (sVar2.h(runtimeState) ? 256 : 128) | (sVar2.h(onRuntimeStateChange) ? 2048 : 1024) | (sVar2.h(onFinish) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar2.T(i12 & 1, (74899 & i12) != 74898)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            l0.w wVarA = l0.y.a(0, sVar2, 3);
            if (list.isEmpty()) {
                list = sentences;
            }
            int i13 = runtimeState.f50298c;
            List list2 = runtimeState.f50297b;
            boolean z11 = runtimeState.f50299d;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(ht.q.DEFAULT);
                sVar2.o0(objQ2);
            }
            b1 b1Var = (b1) objQ2;
            List list3 = list;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(ht.a.f33722e);
                sVar2.o0(objQ3);
            }
            b1 b1Var2 = (b1) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(RecordingStatus.ReadyRecord.INSTANCE);
                sVar2.o0(objQ4);
            }
            b1 b1Var3 = (b1) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = l1.t.B(null);
                sVar2.o0(objQ5);
            }
            b1 b1Var4 = (b1) objQ5;
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                objQ6 = l1.t.B(list3);
                sVar2.o0(objQ6);
            }
            b1 b1Var5 = (b1) objQ6;
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                objQ7 = ep.a.r(i13, sVar2);
            }
            b1 b1Var6 = (b1) objQ7;
            Object objQ8 = sVar2.Q();
            Object obj2 = objQ8;
            if (objQ8 == gVar) {
                x1.p pVar = new x1.p();
                pVar.addAll(list2);
                sVar2.o0(pVar);
                obj2 = pVar;
            }
            x1.p pVar2 = (x1.p) obj2;
            Object objQ9 = sVar2.Q();
            if (objQ9 == gVar) {
                objQ9 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ9);
            }
            b1 b1Var7 = (b1) objQ9;
            Object objQ10 = sVar2.Q();
            if (objQ10 == gVar) {
                objQ10 = l1.t.B(BuildConfig.VERSION_NAME);
                sVar2.o0(objQ10);
            }
            b1 b1Var8 = (b1) objQ10;
            Object objQ11 = sVar2.Q();
            if (objQ11 == gVar) {
                objQ11 = ep.a.s(z11, sVar2);
            }
            b1 b1Var9 = (b1) objQ11;
            Object objQ12 = sVar2.Q();
            if (objQ12 == gVar) {
                objQ12 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ12);
            }
            b1 b1Var10 = (b1) objQ12;
            Object objQ13 = sVar2.Q();
            if (objQ13 == gVar) {
                objQ13 = l1.t.B(-1);
                sVar2.o0(objQ13);
            }
            b1 b1Var11 = (b1) objQ13;
            Object objQ14 = sVar2.Q();
            if (objQ14 == gVar) {
                objQ14 = l1.t.B(-1);
                sVar2.o0(objQ14);
            }
            b1 b1Var12 = (b1) objQ14;
            Object objQ15 = sVar2.Q();
            if (objQ15 == gVar) {
                objQ15 = l1.t.B(-1);
                sVar2.o0(objQ15);
            }
            b1 b1Var13 = (b1) objQ15;
            Object objQ16 = sVar2.Q();
            if (objQ16 == gVar) {
                objQ16 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ16);
            }
            b1 b1Var14 = (b1) objQ16;
            Object objQ17 = sVar2.Q();
            if (objQ17 == gVar) {
                objQ17 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ17);
            }
            b1 b1Var15 = (b1) objQ17;
            Object objQ18 = sVar2.Q();
            if (objQ18 == gVar) {
                objQ18 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ18);
            }
            b1 b1Var16 = (b1) objQ18;
            e20.a aVarC = w4.c.c(sVar2, -1168520582, sVar2, -1633490746);
            boolean zF = sVar2.f(null) | sVar2.f(aVarC);
            Object objQ19 = sVar2.Q();
            if (zF || objQ19 == gVar) {
                objQ19 = w4.c.e(vt.n0.class, aVarC, null, null, sVar2);
            }
            sVar2.p(false);
            sVar2.p(false);
            vt.n0 n0Var = (vt.n0) objQ19;
            Context context = (Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b);
            Object objQ20 = sVar2.Q();
            if (objQ20 == gVar) {
                objQ20 = new j0(context.getApplicationContext(), 2);
                sVar2.o0(objQ20);
            }
            j0 j0Var = (j0) objQ20;
            e20.a aVarC2 = w4.c.c(sVar2, -1168520582, sVar2, -1633490746);
            boolean zF2 = sVar2.f(null) | sVar2.f(aVarC2);
            Object objQ21 = sVar2.Q();
            if (zF2 || objQ21 == gVar) {
                obj = null;
                objQ21 = w4.c.e(av.i.class, aVarC2, null, null, sVar2);
            } else {
                obj = null;
            }
            sVar2.p(false);
            sVar2.p(false);
            av.i iVar = (av.i) objQ21;
            e20.a aVarC3 = w4.c.c(sVar2, -1168520582, sVar2, -1633490746);
            boolean zF3 = sVar2.f(obj) | sVar2.f(aVarC3);
            Object objQ22 = sVar2.Q();
            if (zF3 || objQ22 == gVar) {
                objQ22 = w4.c.e(av.c.class, aVarC3, null, null, sVar2);
            }
            sVar2.p(false);
            sVar2.p(false);
            av.c cVar3 = (av.c) objQ22;
            Object objQ23 = sVar2.Q();
            if (objQ23 == gVar) {
                objQ23 = ((fr.o0) n0Var).v() + "userWordRecorder.wav";
                sVar2.o0(objQ23);
            }
            String str = (String) objQ23;
            Object objQ24 = sVar2.Q();
            Object obj3 = objQ24;
            if (objQ24 == gVar) {
                av.n nVar2 = new av.n(context);
                nVar2.f3173d = new xq.c(b1Var7, b1Var2, b1Var13, 16);
                sVar2.o0(nVar2);
                obj3 = nVar2;
            }
            av.n nVar3 = (av.n) obj3;
            Object objQ25 = sVar2.Q();
            if (objQ25 == gVar) {
                objQ25 = l1.t.q(sVar2);
                sVar2.o0(objQ25);
            }
            rz.b0 b0Var2 = (rz.b0) objQ25;
            boolean zH = sVar2.h(j0Var) | sVar2.h(iVar) | sVar2.h(nVar3);
            Object objQ26 = sVar2.Q();
            if (zH || objQ26 == gVar) {
                objQ26 = new jt.h(j0Var, iVar, nVar3, 1);
                sVar2.o0(objQ26);
            }
            qy.b0 b0Var3 = qy.b0.f48488a;
            l1.t.c(b0Var3, (fz.c) objQ26, sVar2);
            Object objQ27 = sVar2.Q();
            if (objQ27 == gVar) {
                objQ27 = l1.t.s(new h2(29, b1Var));
                sVar2.o0(objQ27);
            }
            b3 b3Var = (b3) objQ27;
            boolean zD = sVar2.d(((fr.o0) n0Var).f27733a.keyLanguage) | sVar2.f(j0Var) | sVar2.f(nVar3) | sVar2.f(cVar3) | sVar2.g(((Boolean) b3Var.getValue()).booleanValue()) | sVar2.f(b1Var) | sVar2.f(b1Var2) | sVar2.f(b1Var3) | sVar2.f(b1Var4) | sVar2.f(b1Var5) | sVar2.f(pVar2) | sVar2.f(b1Var6) | sVar2.f(b1Var7) | sVar2.f(b1Var8) | sVar2.f(b1Var9) | sVar2.f(b1Var10) | sVar2.f(b1Var11) | sVar2.f(b1Var12) | sVar2.f(b1Var14) | sVar2.f(b1Var15) | sVar2.f(b1Var16);
            Object objQ28 = sVar2.Q();
            if (zD || objQ28 == gVar) {
                ((Boolean) b3Var.getValue()).getClass();
                objQ28 = new jt.v(j0Var, nVar3, cVar3, str, b1Var, b1Var2, b1Var3, b1Var4, b1Var5, b1Var6, pVar2, b1Var7, b1Var8, b1Var9, b1Var10, b1Var11, b1Var12, b1Var13, b1Var14, b1Var15, b1Var16);
                sVar2.o0(objQ28);
            }
            jt.v vVar = (jt.v) objQ28;
            b1 b1Var17 = vVar.f37219j;
            b1 b1Var18 = vVar.f37214e;
            Object value = b1Var17.getValue();
            boolean zH2 = sVar2.h(vVar);
            Object objQ29 = sVar2.Q();
            if (zH2 || objQ29 == gVar) {
                objQ29 = new av.p(vVar, null, 25);
                sVar2.o0(objQ29);
            }
            l1.t.f((fz.e) objQ29, value, sVar2);
            Object value2 = vVar.f37226r.getValue();
            boolean zH3 = sVar2.h(vVar);
            Object objQ30 = sVar2.Q();
            if (zH3 || objQ30 == gVar) {
                objQ30 = new jt.y(vVar, null);
                sVar2.o0(objQ30);
            }
            l1.t.f((fz.e) objQ30, value2, sVar2);
            PermissionState permissionStateA = PermissionStateKt.a(sVar2);
            Object objQ31 = sVar2.Q();
            if (objQ31 == gVar) {
                objQ31 = l1.t.B(Boolean.valueOf(PermissionsUtilKt.b(permissionStateA.getStatus())));
                sVar2.o0(objQ31);
            }
            b1 b1Var19 = (b1) objQ31;
            PermissionStatus status = permissionStateA.getStatus();
            boolean zF4 = sVar2.f(permissionStateA) | sVar2.f(pVar2) | sVar2.h(b0Var2) | sVar2.h(j0Var) | sVar2.h(vVar);
            Object objQ32 = sVar2.Q();
            if (zF4 || objQ32 == gVar) {
                objQ32 = new jt.z(permissionStateA, b1Var19, pVar2, b0Var2, vVar, j0Var, (vy.d) null);
                sVar2.o0(objQ32);
            }
            l1.t.f((fz.e) objQ32, status, sVar2);
            Object value3 = vVar.f37225q.getValue();
            boolean zH4 = sVar2.h(vVar) | sVar2.f(pVar2) | sVar2.h(b0Var2) | sVar2.h(j0Var) | sVar2.f(permissionStateA);
            Object objQ33 = sVar2.Q();
            if (zH4 || objQ33 == gVar) {
                objQ33 = new jt.z(vVar, permissionStateA, b1Var19, pVar2, b0Var2, j0Var, (vy.d) null);
                sVar2.o0(objQ33);
            }
            l1.t.f((fz.e) objQ33, value3, sVar2);
            Object value4 = vVar.f37215f.getValue();
            boolean zH5 = sVar2.h(vVar);
            Object objQ34 = sVar2.Q();
            if (zH5 || objQ34 == gVar) {
                objQ34 = new jt.a0(vVar, str, null);
                sVar2.o0(objQ34);
            }
            l1.t.f((fz.e) objQ34, value4, sVar2);
            Object value5 = b1Var18.getValue();
            boolean zH6 = sVar2.h(vVar) | sVar2.f(pVar2) | sVar2.h(iVar) | sVar2.h(b0Var2);
            Object objQ35 = sVar2.Q();
            if (zH6 || objQ35 == gVar) {
                objQ35 = new x0(vVar, pVar2, iVar, b0Var2, str, (vy.d) null, 11);
                sVar2.o0(objQ35);
            }
            l1.t.f((fz.e) objQ35, value5, sVar2);
            boolean zH7 = sVar2.h(vVar) | ((i12 & 7168) == 2048);
            Object objQ36 = sVar2.Q();
            if (zH7 || objQ36 == gVar) {
                onRuntimeStateChange = cVar;
                objQ36 = new e6.q0(4, vVar, onRuntimeStateChange, (vy.d) null);
                sVar2.o0(objQ36);
            } else {
                onRuntimeStateChange = cVar;
            }
            l1.t.f((fz.e) objQ36, b0Var3, sVar2);
            Object value6 = vVar.f37217h.getValue();
            boolean zH8 = sVar2.h(vVar) | sVar2.f(wVarA);
            Object objQ37 = sVar2.Q();
            if (zH8 || objQ37 == gVar) {
                cVar2 = onProgressChange;
                objQ37 = new z(vVar, cVar2, wVarA, null);
                sVar2.o0(objQ37);
            } else {
                cVar2 = onProgressChange;
            }
            l1.t.f((fz.e) objQ37, value6, sVar2);
            Object objQ38 = sVar2.Q();
            if (objQ38 == gVar) {
                objQ38 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ38);
            }
            b1 b1Var20 = (b1) objQ38;
            Object value7 = b1Var20.getValue();
            boolean zH9 = sVar2.h(vVar);
            Object objQ39 = sVar2.Q();
            if (zH9 || objQ39 == gVar) {
                dVar = null;
                objQ39 = new av.f0(22, b1Var20, vVar, dVar);
                sVar2.o0(objQ39);
            } else {
                dVar = null;
            }
            l1.t.f((fz.e) objQ39, value7, sVar2);
            Object value8 = b1Var18.getValue();
            boolean zH10 = sVar2.h(vVar) | sVar2.h(b0Var) | sVar2.f(wVarA);
            Object objQ40 = sVar2.Q();
            if (zH10 || objQ40 == gVar) {
                ad.y yVar = new ad.y(vVar, b0Var, wVarA, dVar, 6);
                sVar2.o0(yVar);
                objQ40 = yVar;
            }
            l1.t.f((fz.e) objQ40, value8, sVar2);
            Object objQ41 = sVar2.Q();
            if (objQ41 == gVar) {
                objQ41 = l1.t.s(new r(wVarA, 0));
                sVar2.o0(objQ41);
            }
            l1.s sVar3 = sVar2;
            i9.a(null, null, ((s1) sVar2.j(v1.f31180a)).f31031n, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1822846237, new bp.f0(wVarA, vVar, practiceType, b0Var, onFinish, (b3) objQ41, 5), sVar2), sVar3, 12582912, 123);
            sVar = sVar3;
        } else {
            l1.s sVar4 = sVar2;
            cVar2 = onProgressChange;
            sVar4.W();
            sVar = sVar4;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.f0(sentences, (Object) practiceType, (Object) runtimeState, (Object) onRuntimeStateChange, (qy.e) cVar2, onFinish, i11, 6);
        }
    }

    public static final void h(final float f5, final boolean z11, final fz.a onClickPlayUserAudio, z1.r rVar, l1.n nVar, final int i11) {
        final z1.r rVar2;
        kotlin.jvm.internal.m.f(onClickPlayUserAudio, "onClickPlayUserAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1591384032);
        int i12 = i11 | (sVar.c(f5) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(onClickPlayUserAudio) ? 256 : 128) | 3072;
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
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
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            z1.r rVarN = e2.n(j0.c.E(oVar, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 24);
            float f11 = f5 * 100;
            double d5 = f11;
            long jI = s5.i(d5);
            boolean z12 = (i12 & 896) == 256;
            Object objQ = sVar.Q();
            if (z12 || objQ == l1.m.f39353a) {
                objQ = new p(3, onClickPlayUserAudio);
                sVar.o0(objQ);
            }
            dt.a0.c(((i12 >> 3) & 14) | 48, jI, (fz.a) objQ, sVar, rVarN, z11);
            ua.b(String.valueOf((int) f11), j0.c.E(oVar, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), s5.i(d5), j3.A(13), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 48, 0, 65532);
            sVar = sVar;
            sVar.p(true);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(f5, z11, onClickPlayUserAudio, rVar2, i11) { // from class: et.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f25920a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f25921b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ fz.a f25922c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ z1.r f25923d;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    a.h(this.f25920a, this.f25921b, this.f25922c, this.f25923d, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final String i(CourseWord courseWord, boolean z11) {
        if (!z11) {
            String word = courseWord.getWord();
            return word.length() == 0 ? courseWord.getZhuYin() : word;
        }
        String luoMa = courseWord.getLuoMa();
        if (luoMa.length() == 0) {
            luoMa = courseWord.getWord();
            if (luoMa.length() == 0) {
                return courseWord.getZhuYin();
            }
        }
        return luoMa;
    }

    public static final void j(jt.v vVar, int i11, String str) {
        vVar.f37220k.setValue(str);
        vVar.f37211b.h(str);
        vVar.f37223o.setValue(Integer.valueOf(i11));
        b1 b1Var = vVar.f37226r;
        if (((Boolean) b1Var.getValue()).booleanValue()) {
            return;
        }
        b1Var.setValue(Boolean.TRUE);
    }
}
