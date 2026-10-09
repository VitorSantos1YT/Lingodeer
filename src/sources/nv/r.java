package nv;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import b0.o1;
import bt.e6;
import bt.g7;
import bt.m1;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingodeer.R;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import com.yalantis.ucrop.view.CropImageView;
import dt.y3;
import g2.f0;
import h1.a6;
import h1.dc;
import h1.e0;
import h1.e8;
import h1.fc;
import h1.s1;
import h1.ua;
import h1.v1;
import hh.p0;
import iv.f1;
import j0.a2;
import j0.e2;
import j0.z1;
import j9.c0;
import l1.b1;
import l1.c3;
import l1.i1;
import l1.k1;
import l1.q1;
import l1.x1;
import mt.e5;
import mt.n4;
import pt.ImS.aYZzTH;
import rt.cb;
import rt.db;
import rt.eb;
import rt.fb;
import rt.gc;
import rt.h9;
import rt.l9;
import rt.pc;
import rt.qc;
import rt.rc;
import rt.y9;
import rz.b0;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r {
    public static final void a(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        fz.c cVar;
        fz.c cVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(689905812);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            l1.t.J(hVar4, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            l1.t.J(hVar4, rVarC2, sVar);
            e0.c(a.f44106p, null, t1.e.d(774481246, new lt.g(onClickFinish, 19, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            float f5 = 16;
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson12_1), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, 48, 0, 65532);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                cVar2 = playAudio;
                objQ = new o(cVar2, 17);
                sVar.o0(objQ);
            } else {
                cVar2 = playAudio;
            }
            cVar = playAudio;
            a.b("ㅅ", "s", false, (fz.a) objQ, t1.e.d(-12394763, new e6(cVar2, 28), sVar), a.f44107q, sVar, 221238, 4);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new o(cVar, 18);
                sVar.o0(objQ2);
            }
            a.b("ㅆ", "ss", false, (fz.a) objQ2, t1.e.d(141359070, new ys.f(cVar, 1), sVar), t1.e.d(-2051779681, new q(cVar, 0), sVar), sVar, 221238, 4);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.f44108r, sVar, ((i12 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            cVar = playAudio;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, cVar, i11, 2);
        }
    }

    public static final void b(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        fz.c cVar;
        fz.c cVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1014440086);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            l1.t.J(hVar4, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            l1.t.J(hVar4, rVarC2, sVar);
            e0.c(a.f44109s, null, t1.e.d(1099015520, new lt.g(onClickFinish, 20, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            float f5 = 16;
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson13_1), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, 48, 0, 65532);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                cVar2 = playAudio;
                objQ = new s(cVar2, 8);
                sVar.o0(objQ);
            } else {
                cVar2 = playAudio;
            }
            cVar = playAudio;
            a.b("ㄴ", "n", false, (fz.a) objQ, t1.e.d(312139511, new q(cVar2, 4), sVar), t1.e.d(1775777528, new q(cVar2, 5), sVar), sVar, 221238, 4);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new s(cVar, 9);
                sVar.o0(objQ2);
            }
            a.b("ㅁ", "m", false, (fz.a) objQ2, t1.e.d(465893344, new q(cVar, 6), sVar), t1.e.d(-1727245407, new q(cVar, 7), sVar), sVar, 221238, 4);
            boolean z13 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new o(cVar, 22);
                sVar.o0(objQ3);
            }
            a.b("ㄹ", "l", false, (fz.a) objQ3, t1.e.d(599480255, new q(cVar, 1), sVar), t1.e.d(-1593658496, new q(cVar, 2), sVar), sVar, 221238, 4);
            boolean z14 = i13 == 256;
            Object objQ4 = sVar.Q();
            if (z14 || objQ4 == gVar) {
                objQ4 = new s(cVar, 0);
                sVar.o0(objQ4);
            }
            a.b("ㅇ", "ng", false, (fz.a) objQ4, t1.e.d(733067166, new q(cVar, 3), sVar), null, sVar, 24630, 36);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.f44110t, sVar, ((i12 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            cVar = playAudio;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, cVar, i11, 3);
        }
    }

    public static final void d(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1629290048);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            l1.t.J(hVar4, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            l1.t.J(hVar4, rVarC2, sVar);
            e0.c(a.f44113w, null, t1.e.d(-1481233014, new lt.g(onClickFinish, 22, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            String strE0 = ub.a.e0(sVar, R.string.ko_syllable_lesson1_1);
            c3 c3Var = fc.f30256a;
            float f5 = 16;
            ua.b(strE0, j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_vowels), j0.c.E(oVar, f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30175h, sVar, 48, 0, 65532);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson1_2), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new s(playAudio, 27);
                sVar.o0(objQ);
            }
            int i14 = i12;
            a.b("ㅏ", "a", false, (fz.a) objQ, a.f44114x, null, sVar, 24630, 36);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new s(playAudio, 28);
                sVar.o0(objQ2);
            }
            a.b("ㅓ", "eo", false, (fz.a) objQ2, a.f44115y, null, sVar, 24630, 36);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_constants), j0.c.E(oVar, f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30175h, sVar, 48, 0, 65532);
            String strE1 = ub.a.e0(sVar, R.string.ko_syllable_silent);
            boolean z13 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new s(playAudio, 29);
                sVar.o0(objQ3);
            }
            a.b("ㅇ", strE1, false, (fz.a) objQ3, t1.e.d(-1557730391, new q(playAudio, 14), sVar), null, sVar, 24966, 32);
            boolean z14 = i13 == 256;
            Object objQ4 = sVar.Q();
            if (z14 || objQ4 == gVar) {
                objQ4 = new t(playAudio, 0);
                sVar.o0(objQ4);
            }
            a.b("ㅁ", "m", false, (fz.a) objQ4, t1.e.d(-1633568952, new q(playAudio, 15), sVar), null, sVar, 24630, 36);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.f44116z, sVar, ((i14 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, playAudio, i11, 5);
        }
    }

    public static final void e(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1990301344);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            l1.t.J(hVar4, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            l1.t.J(hVar4, rVarC2, sVar);
            e0.c(a.A, null, t1.e.d(-1120221718, new lt.g(onClickFinish, 23, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            String strE0 = ub.a.e0(sVar, R.string.ko_syllable_lesson2_1);
            c3 c3Var = fc.f30256a;
            float f5 = 16;
            ua.b(strE0, j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_vowels), j0.c.E(oVar, f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30175h, sVar, 48, 0, 65532);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson2_2), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new t(playAudio, 9);
                sVar.o0(objQ);
            }
            int i14 = i12;
            a.b("ㅗ", "o", false, (fz.a) objQ, t1.e.d(-910984895, new q(playAudio, 16), sVar), null, sVar, 24630, 36);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new t(playAudio, 10);
                sVar.o0(objQ2);
            }
            a.b("ㅜ", "u", false, (fz.a) objQ2, t1.e.d(-1120880534, new q(playAudio, 17), sVar), null, sVar, 24630, 36);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_constant), j0.c.E(oVar, f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30175h, sVar, 48, 0, 65532);
            boolean z13 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new t(playAudio, 11);
                sVar.o0(objQ3);
            }
            a.b("ㄴ", "n", false, (fz.a) objQ3, t1.e.d(-1196719095, new q(playAudio, 18), sVar), null, sVar, 24630, 36);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.B, sVar, ((i14 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, playAudio, i11, 6);
        }
    }

    public static final void h(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        fz.c cVar;
        fz.c cVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1221632064);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(oVar);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            l1.t.J(hVar4, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            l1.t.J(hVar4, rVarC2, sVar);
            e0.c(a.G, null, t1.e.d(-37187830, new lt.g(onClickFinish, 26, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            float f5 = 16;
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson5_1), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, 48, 0, 65532);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                cVar2 = playAudio;
                objQ = new u(cVar2, 28);
                sVar.o0(objQ);
            } else {
                cVar2 = playAudio;
            }
            cVar = playAudio;
            a.b("ㅡ", "eu", false, (fz.a) objQ, t1.e.d(172048993, new v(cVar2, 1), sVar), null, sVar, 24630, 36);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new u(cVar, 29);
                sVar.o0(objQ2);
            }
            a.b("ㅣ", "i", false, (fz.a) objQ2, t1.e.d(-37846646, new v(cVar, 2), sVar), null, sVar, 24630, 36);
            boolean z13 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new w(cVar, 0);
                sVar.o0(objQ3);
            }
            a.b("ㅢ", "ui", false, (fz.a) objQ3, a.H, t1.e.d(1349952810, new v(cVar, 3), sVar), sVar, 221238, 4);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.I, sVar, ((i12 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            cVar = playAudio;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, cVar, i11, 9);
        }
    }

    public static final void i(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        fz.c cVar;
        fz.c cVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-860620768);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            l1.t.J(hVar4, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            l1.t.J(hVar4, rVarC2, sVar);
            e0.c(a.J, null, t1.e.d(323823466, new lt.g(onClickFinish, 27, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            float f5 = 16;
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson6_1), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, 48, 0, 65532);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                cVar2 = playAudio;
                objQ = new w(cVar2, 6);
                sVar.o0(objQ);
            } else {
                cVar2 = playAudio;
            }
            cVar = playAudio;
            a.b("ㅘ", "wa", false, (fz.a) objQ, t1.e.d(533060289, new v(cVar2, 4), sVar), null, sVar, 24630, 36);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new w(cVar, 7);
                sVar.o0(objQ2);
            }
            a.b("ㅙ", "wae", false, (fz.a) objQ2, t1.e.d(323164650, new v(cVar, 5), sVar), null, sVar, 24630, 36);
            boolean z13 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new w(cVar, 8);
                sVar.o0(objQ3);
            }
            a.b("ㅚ", "oe", false, (fz.a) objQ3, t1.e.d(247326089, new v(cVar, 6), sVar), null, sVar, 24630, 36);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.K, sVar, ((i12 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            cVar = playAudio;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, cVar, i11, 10);
        }
    }

    public static final void j(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        fz.c cVar;
        fz.c cVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-499609472);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            l1.t.J(hVar4, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            l1.t.J(hVar4, rVarC2, sVar);
            e0.c(a.L, null, t1.e.d(684834762, new lt.g(onClickFinish, 28, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            float f5 = 16;
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson7_1), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, 48, 0, 65532);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                cVar2 = playAudio;
                objQ = new w(cVar2, 15);
                sVar.o0(objQ);
            } else {
                cVar2 = playAudio;
            }
            cVar = playAudio;
            a.b("ㅝ", "wo", false, (fz.a) objQ, t1.e.d(894071585, new v(cVar2, 7), sVar), null, sVar, 24630, 36);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new w(cVar, 16);
                sVar.o0(objQ2);
            }
            a.b("ㅞ", "we", false, (fz.a) objQ2, t1.e.d(684175946, new v(cVar, 8), sVar), null, sVar, 24630, 36);
            boolean z13 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new w(cVar, 17);
                sVar.o0(objQ3);
            }
            a.b("ㅟ", "wi", false, (fz.a) objQ3, t1.e.d(608337385, new v(cVar, 9), sVar), null, sVar, 24630, 36);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.M, sVar, ((i12 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            cVar = playAudio;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, cVar, i11, 11);
        }
    }

    public static final void k(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        fz.c cVar;
        fz.c cVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-138598176);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            l1.t.J(hVar4, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            l1.t.J(hVar4, rVarC2, sVar);
            e0.c(a.N, null, t1.e.d(1045846058, new lt.g(onClickFinish, 29, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            float f5 = 16;
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson8_1), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, 48, 0, 65532);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                cVar2 = playAudio;
                objQ = new w(cVar2, 27);
                sVar.o0(objQ);
            } else {
                cVar2 = playAudio;
            }
            cVar = playAudio;
            a.b("ㄱ", "g", false, (fz.a) objQ, t1.e.d(1255082881, new v(cVar2, 10), sVar), t1.e.d(1305767874, new v(cVar2, 11), sVar), sVar, 221238, 4);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new w(cVar, 28);
                sVar.o0(objQ2);
            }
            a.b("ㅋ", "k", false, (fz.a) objQ2, t1.e.d(1045187242, new v(cVar, 12), sVar), null, sVar, 24630, 36);
            boolean z13 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new w(cVar, 29);
                sVar.o0(objQ3);
            }
            a.b("ㄲ", "kk", false, (fz.a) objQ3, t1.e.d(969348681, new v(cVar, 13), sVar), null, sVar, 24630, 36);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.O, sVar, ((i12 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            cVar = playAudio;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, cVar, i11, 12);
        }
    }

    public static final void m(int i11, sv.d dVar, fz.a onClickFinish, fz.a onClickStartLearning, l1.n nVar, int i12) {
        sv.d dVar2;
        sv.d dVar3;
        int i13;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1114179973);
        int i14 = i12 | (sVar.d(i11) ? 4 : 2) | 16 | (sVar.h(onClickFinish) ? 256 : 128);
        if (sVar.T(i14 & 1, (i14 & 1171) != 1170)) {
            sVar.Y();
            if ((i12 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(sv.d.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                dVar3 = (sv.d) viewModelA;
                i13 = i14 & (-113);
            } else {
                sVar.W();
                i13 = i14 & (-113);
                dVar3 = dVar;
            }
            sVar.q();
            sv.c cVar = (sv.c) l1.t.o(dVar3.f51800e, sVar).getValue();
            if (kotlin.jvm.internal.m.a(cVar, sv.a.f51793a)) {
                sVar.d0(-1280086966);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            } else {
                if (!(cVar instanceof sv.b)) {
                    throw p.x(sVar, -1280086202, false);
                }
                sVar.d0(-1027844735);
                fb fbVar = ((sv.b) cVar).f51794a;
                if (fbVar instanceof db) {
                    sVar.d0(-1280081750);
                    tv.a.d(0, 1, sVar, null);
                    sVar.p(false);
                } else if (kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                    sVar.d0(-1280079542);
                    tv.a.d(0, 1, sVar, null);
                    sVar.p(false);
                } else {
                    if (!kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                        throw p.x(sVar, -1280081847, false);
                    }
                    sVar.d0(-1027604268);
                    l1.g gVar = l1.m.f39353a;
                    switch (i11) {
                        case 1:
                            sVar.d0(-1280074695);
                            boolean zH = sVar.h(dVar3);
                            Object objQ = sVar.Q();
                            if (zH || objQ == gVar) {
                                objQ = new m(dVar3, 15);
                                sVar.o0(objQ);
                            }
                            n((i13 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ, sVar);
                            sVar.p(false);
                            break;
                        case 2:
                            sVar.d0(-1280062535);
                            boolean zH2 = sVar.h(dVar3);
                            Object objQ2 = sVar.Q();
                            if (zH2 || objQ2 == gVar) {
                                objQ2 = new m(dVar3, 16);
                                sVar.o0(objQ2);
                            }
                            o((i13 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ2, sVar);
                            sVar.p(false);
                            break;
                        case 3:
                            sVar.d0(-1280050375);
                            boolean zH3 = sVar.h(dVar3);
                            Object objQ3 = sVar.Q();
                            if (zH3 || objQ3 == gVar) {
                                objQ3 = new m(dVar3, 17);
                                sVar.o0(objQ3);
                            }
                            p((i13 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ3, sVar);
                            sVar.p(false);
                            break;
                        case 4:
                            sVar.d0(-1280038215);
                            boolean zH4 = sVar.h(dVar3);
                            Object objQ4 = sVar.Q();
                            if (zH4 || objQ4 == gVar) {
                                objQ4 = new m(dVar3, 18);
                                sVar.o0(objQ4);
                            }
                            q((i13 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ4, sVar);
                            sVar.p(false);
                            break;
                        case 5:
                            sVar.d0(-1280026055);
                            boolean zH5 = sVar.h(dVar3);
                            Object objQ5 = sVar.Q();
                            if (zH5 || objQ5 == gVar) {
                                objQ5 = new m(dVar3, 19);
                                sVar.o0(objQ5);
                            }
                            r((i13 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ5, sVar);
                            sVar.p(false);
                            break;
                        case 6:
                            sVar.d0(-1280013895);
                            boolean zH6 = sVar.h(dVar3);
                            Object objQ6 = sVar.Q();
                            if (zH6 || objQ6 == gVar) {
                                objQ6 = new m(dVar3, 20);
                                sVar.o0(objQ6);
                            }
                            s((i13 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ6, sVar);
                            sVar.p(false);
                            break;
                        case 7:
                            sVar.d0(-1280001735);
                            boolean zH7 = sVar.h(dVar3);
                            Object objQ7 = sVar.Q();
                            if (zH7 || objQ7 == gVar) {
                                objQ7 = new m(dVar3, 21);
                                sVar.o0(objQ7);
                            }
                            t((i13 >> 6) & 126, onClickFinish, onClickStartLearning, (fz.c) objQ7, sVar);
                            sVar.p(false);
                            break;
                        default:
                            sVar.d0(-1028763513);
                            sVar.p(false);
                            break;
                    }
                    sVar.p(false);
                }
                sVar.p(false);
            }
            dVar2 = dVar3;
        } else {
            sVar.W();
            dVar2 = dVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(i11, dVar2, onClickFinish, onClickStartLearning, i12, 29);
        }
    }

    public static final void n(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        y2.h hVar;
        y2.h hVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1430083030);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar3 = y2.j.f56917f;
            l1.t.J(hVar3, q0VarD, sVar);
            y2.h hVar4 = y2.j.f56916e;
            l1.t.J(hVar4, q1VarL, sVar);
            y2.h hVar5 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
            }
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar7 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA, sVar);
            l1.t.J(hVar4, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
            }
            l1.t.J(hVar6, rVarC2, sVar);
            e0.c(a.R, null, t1.e.d(1083150752, new y(1, onClickFinish), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA2, sVar);
            l1.t.J(hVar4, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                hVar = hVar5;
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar);
            } else {
                hVar = hVar5;
            }
            l1.t.J(hVar6, rVarC3, sVar);
            String strE0 = ub.a.e0(sVar, R.string.ko_syllable_sound_change_lesson1_1);
            c3 c3Var = fc.f30256a;
            float f5 = 16;
            y2.h hVar8 = hVar;
            int i13 = i12;
            ua.b(strE0, j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_sound_change_lesson1_2), j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            j0.g gVarG = j0.i.g(f5);
            z1.r rVarA = j0.c.A(oVar, f5);
            z1.i iVar2 = z1.c.M;
            a2 a2VarA = z1.a(gVarG, iVar2, sVar, 54);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarA);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA, sVar);
            l1.t.J(hVar4, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar8);
            }
            String strL = p.l(R.string.ko_syllable_sound_change_lesson1_3, sVar, p.v(sVar, rVarC4, hVar6, -1428106758, "han-gug-eo\n"), false);
            z1.r rVarE = e2.e(oVar, 0.4f);
            int i14 = i13 & 896;
            boolean z11 = i14 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new x(playAudio, 12);
                sVar.o0(objQ);
            }
            a.l(54, (fz.a) objQ, "한국어", strL, sVar, rVarE);
            float f11 = 18;
            z1.r rVarE2 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA3 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA3, sVar);
            l1.t.J(hVar4, q1VarL5, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar8);
            }
            l1.t.J(hVar6, rVarC5, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[한구거 / han-gu-geo]*"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            j0.g gVarG2 = j0.i.g(f5);
            z1.r rVarA2 = j0.c.A(oVar, f5);
            a2 a2VarA2 = z1.a(gVarG2, iVar2, sVar, 54);
            int iHashCode6 = Long.hashCode(sVar.T);
            q1 q1VarL6 = sVar.l();
            z1.r rVarC6 = z1.a.c(sVar, rVarA2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA2, sVar);
            l1.t.J(hVar4, q1VarL6, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                hVar2 = hVar8;
                defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar2);
            } else {
                hVar2 = hVar8;
            }
            String strL2 = p.l(R.string.ko_syllable_sound_change_lesson1_4, sVar, p.v(sVar, rVarC6, hVar6, -844015647, "ap-eu-lo\n"), false);
            z1.r rVarE3 = e2.e(oVar, 0.4f);
            boolean z12 = i14 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new x(playAudio, 13);
                sVar.o0(objQ2);
            }
            a.l(54, (fz.a) objQ2, "앞으로", strL2, sVar, rVarE3);
            z1.r rVarE4 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA4 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode7 = Long.hashCode(sVar.T);
            q1 q1VarL7 = sVar.l();
            z1.r rVarC7 = z1.a.c(sVar, rVarE4);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA4, sVar);
            l1.t.J(hVar4, q1VarL7, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                defpackage.e.A(iHashCode7, sVar, iHashCode7, hVar2);
            }
            l1.t.J(hVar6, rVarC7, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[아프로 / a-peu-lo]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_sound_change_lesson1_5), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.S, sVar, ((i13 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, playAudio, i11, 14);
        }
    }

    public static final void o(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        y2.h hVar;
        y2.h hVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(436852888);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar3 = y2.j.f56917f;
            l1.t.J(hVar3, q0VarD, sVar);
            y2.h hVar4 = y2.j.f56916e;
            l1.t.J(hVar4, q1VarL, sVar);
            y2.h hVar5 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
            }
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar7 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA, sVar);
            l1.t.J(hVar4, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
            }
            l1.t.J(hVar6, rVarC2, sVar);
            e0.c(a.T, null, t1.e.d(89920610, new y(2, onClickFinish), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA2, sVar);
            l1.t.J(hVar4, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                hVar = hVar5;
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar);
            } else {
                hVar = hVar5;
            }
            l1.t.J(hVar6, rVarC3, sVar);
            String strE0 = ub.a.e0(sVar, R.string.ko_syllable_sound_change_lesson2_1);
            c3 c3Var = fc.f30256a;
            float f5 = 16;
            y2.h hVar8 = hVar;
            int i13 = i12;
            ua.b(strE0, j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            j0.g gVarG = j0.i.g(f5);
            z1.r rVarA = j0.c.A(oVar, f5);
            z1.i iVar2 = z1.c.M;
            a2 a2VarA = z1.a(gVarG, iVar2, sVar, 54);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarA);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA, sVar);
            l1.t.J(hVar4, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar8);
            }
            String strL = p.l(R.string.ko_syllable_sound_change_lesson2_2, sVar, p.v(sVar, rVarC4, hVar6, 1855433751, "anj-a\n"), false);
            z1.r rVarE = e2.e(oVar, 0.4f);
            int i14 = i13 & 896;
            boolean z11 = i14 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new x(playAudio, 14);
                sVar.o0(objQ);
            }
            a.l(54, (fz.a) objQ, "앉아", strL, sVar, rVarE);
            float f11 = 18;
            z1.r rVarE2 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA3 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA3, sVar);
            l1.t.J(hVar4, q1VarL5, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar8);
            }
            l1.t.J(hVar6, rVarC5, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[안자 / an-ja]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            j0.g gVarG2 = j0.i.g(f5);
            z1.r rVarA2 = j0.c.A(oVar, f5);
            a2 a2VarA2 = z1.a(gVarG2, iVar2, sVar, 54);
            int iHashCode6 = Long.hashCode(sVar.T);
            q1 q1VarL6 = sVar.l();
            z1.r rVarC6 = z1.a.c(sVar, rVarA2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA2, sVar);
            l1.t.J(hVar4, q1VarL6, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                hVar2 = hVar8;
                defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar2);
            } else {
                hVar2 = hVar8;
            }
            String strL2 = p.l(R.string.ko_syllable_sound_change_lesson2_3, sVar, p.v(sVar, rVarC6, hVar6, -1855442394, "jeolm-eo-yo\n"), false);
            z1.r rVarE3 = e2.e(oVar, 0.4f);
            boolean z12 = i14 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new x(playAudio, 15);
                sVar.o0(objQ2);
            }
            a.l(54, (fz.a) objQ2, "젊어요", strL2, sVar, rVarE3);
            z1.r rVarE4 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA4 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode7 = Long.hashCode(sVar.T);
            q1 q1VarL7 = sVar.l();
            z1.r rVarC7 = z1.a.c(sVar, rVarE4);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA4, sVar);
            l1.t.J(hVar4, q1VarL7, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                defpackage.e.A(iHashCode7, sVar, iHashCode7, hVar2);
            }
            l1.t.J(hVar6, rVarC7, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[절머요 / jeol-meo-yo]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.U, sVar, ((i13 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, playAudio, i11, 15);
        }
    }

    public static final void q(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        y2.h hVar;
        y2.h hVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1549607396);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar3 = y2.j.f56917f;
            l1.t.J(hVar3, q0VarD, sVar);
            y2.h hVar4 = y2.j.f56916e;
            l1.t.J(hVar4, q1VarL, sVar);
            y2.h hVar5 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
            }
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar7 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA, sVar);
            l1.t.J(hVar4, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
            }
            l1.t.J(hVar6, rVarC2, sVar);
            e0.c(a.X, null, t1.e.d(-1896539674, new y(4, onClickFinish), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA2, sVar);
            l1.t.J(hVar4, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                hVar = hVar5;
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar);
            } else {
                hVar = hVar5;
            }
            l1.t.J(hVar6, rVarC3, sVar);
            String strE0 = ub.a.e0(sVar, R.string.ko_syllable_sound_change_lesson4_1);
            c3 c3Var = fc.f30256a;
            float f5 = 16;
            y2.h hVar8 = hVar;
            int i13 = i12;
            ua.b(strE0, j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            j0.g gVarG = j0.i.g(f5);
            z1.r rVarA = j0.c.A(oVar, f5);
            z1.i iVar2 = z1.c.M;
            a2 a2VarA = z1.a(gVarG, iVar2, sVar, 54);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarA);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA, sVar);
            l1.t.J(hVar4, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar8);
            }
            String strL = p.l(R.string.ko_syllable_sound_change_lesson4_2, sVar, p.v(sVar, rVarC4, hVar6, -167419748, "bag-ha\n"), false);
            z1.r rVarE = e2.e(oVar, 0.4f);
            int i14 = i13 & 896;
            boolean z11 = i14 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new x(playAudio, 20);
                sVar.o0(objQ);
            }
            a.l(54, (fz.a) objQ, "박하", strL, sVar, rVarE);
            float f11 = 18;
            z1.r rVarE2 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA3 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA3, sVar);
            l1.t.J(hVar4, q1VarL5, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar8);
            }
            l1.t.J(hVar6, rVarC5, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[바카 / ba-ka]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            j0.g gVarG2 = j0.i.g(f5);
            z1.r rVarA2 = j0.c.A(oVar, f5);
            a2 a2VarA2 = z1.a(gVarG2, iVar2, sVar, 54);
            int iHashCode6 = Long.hashCode(sVar.T);
            q1 q1VarL6 = sVar.l();
            z1.r rVarC6 = z1.a.c(sVar, rVarA2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA2, sVar);
            l1.t.J(hVar4, q1VarL6, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                hVar2 = hVar8;
                defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar2);
            } else {
                hVar2 = hVar8;
            }
            String strL2 = p.l(R.string.ko_syllable_sound_change_lesson4_3, sVar, p.v(sVar, rVarC6, hVar6, 416671366, "manh-da\n"), false);
            z1.r rVarE3 = e2.e(oVar, 0.4f);
            boolean z12 = i14 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new x(playAudio, 21);
                sVar.o0(objQ2);
            }
            a.l(54, (fz.a) objQ2, "많다", strL2, sVar, rVarE3);
            z1.r rVarE4 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA4 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode7 = Long.hashCode(sVar.T);
            q1 q1VarL7 = sVar.l();
            z1.r rVarC7 = z1.a.c(sVar, rVarE4);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA4, sVar);
            l1.t.J(hVar4, q1VarL7, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                defpackage.e.A(iHashCode7, sVar, iHashCode7, hVar2);
            }
            l1.t.J(hVar6, rVarC7, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[만타 / man-ta]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.Y, sVar, ((i13 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, playAudio, i11, 17);
        }
    }

    public static final void r(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        y2.h hVar;
        y2.h hVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1752129758);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar3 = y2.j.f56917f;
            l1.t.J(hVar3, q0VarD, sVar);
            y2.h hVar4 = y2.j.f56916e;
            l1.t.J(hVar4, q1VarL, sVar);
            y2.h hVar5 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
            }
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar7 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA, sVar);
            l1.t.J(hVar4, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
            }
            l1.t.J(hVar6, rVarC2, sVar);
            e0.c(a.Z, null, t1.e.d(1405197480, new y(5, onClickFinish), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA2, sVar);
            l1.t.J(hVar4, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                hVar = hVar5;
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar);
            } else {
                hVar = hVar5;
            }
            l1.t.J(hVar6, rVarC3, sVar);
            String strE0 = ub.a.e0(sVar, R.string.ko_syllable_sound_change_lesson5_1);
            c3 c3Var = fc.f30256a;
            float f5 = 16;
            y2.h hVar8 = hVar;
            int i13 = i12;
            ua.b(strE0, j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            j0.g gVarG = j0.i.g(f5);
            z1.r rVarA = j0.c.A(oVar, f5);
            z1.i iVar2 = z1.c.M;
            a2 a2VarA = z1.a(gVarG, iVar2, sVar, 54);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarA);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA, sVar);
            l1.t.J(hVar4, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar8);
            }
            String strL = p.l(R.string.ko_syllable_sound_change_lesson5_2, sVar, p.v(sVar, rVarC4, hVar6, -1178846497, "hag-gyo\n"), false);
            z1.r rVarE = e2.e(oVar, 0.4f);
            int i14 = i13 & 896;
            boolean z11 = i14 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new x(playAudio, 22);
                sVar.o0(objQ);
            }
            a.l(54, (fz.a) objQ, "학교", strL, sVar, rVarE);
            float f11 = 18;
            z1.r rVarE2 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA3 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA3, sVar);
            l1.t.J(hVar4, q1VarL5, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar8);
            }
            l1.t.J(hVar6, rVarC5, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[학꾜 / hag-kkyo]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            j0.g gVarG2 = j0.i.g(f5);
            z1.r rVarA2 = j0.c.A(oVar, f5);
            a2 a2VarA2 = z1.a(gVarG2, iVar2, sVar, 54);
            int iHashCode6 = Long.hashCode(sVar.T);
            q1 q1VarL6 = sVar.l();
            z1.r rVarC6 = z1.a.c(sVar, rVarA2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA2, sVar);
            l1.t.J(hVar4, q1VarL6, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                hVar2 = hVar8;
                defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar2);
            } else {
                hVar2 = hVar8;
            }
            String strL2 = p.l(R.string.ko_syllable_sound_change_lesson5_3, sVar, p.v(sVar, rVarC6, hVar6, -594755384, "eobs-da\n"), false);
            z1.r rVarE3 = e2.e(oVar, 0.4f);
            boolean z12 = i14 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new x(playAudio, 23);
                sVar.o0(objQ2);
            }
            a.l(54, (fz.a) objQ2, "없다", strL2, sVar, rVarE3);
            z1.r rVarE4 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA4 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode7 = Long.hashCode(sVar.T);
            q1 q1VarL7 = sVar.l();
            z1.r rVarC7 = z1.a.c(sVar, rVarE4);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA4, sVar);
            l1.t.J(hVar4, q1VarL7, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                defpackage.e.A(iHashCode7, sVar, iHashCode7, hVar2);
            }
            l1.t.J(hVar6, rVarC7, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[업따 / eob-tta]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.f44087a0, sVar, ((i13 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, playAudio, i11, 18);
        }
    }

    public static final void s(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        y2.h hVar;
        y2.h hVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(758899616);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar3 = y2.j.f56917f;
            l1.t.J(hVar3, q0VarD, sVar);
            y2.h hVar4 = y2.j.f56916e;
            l1.t.J(hVar4, q1VarL, sVar);
            y2.h hVar5 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
            }
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar7 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA, sVar);
            l1.t.J(hVar4, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
            }
            l1.t.J(hVar6, rVarC2, sVar);
            e0.c(a.f44089b0, null, t1.e.d(411967338, new y(6, onClickFinish), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA2, sVar);
            l1.t.J(hVar4, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                hVar = hVar5;
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar);
            } else {
                hVar = hVar5;
            }
            l1.t.J(hVar6, rVarC3, sVar);
            String strE0 = ub.a.e0(sVar, R.string.ko_syllable_sound_change_lesson6_1);
            c3 c3Var = fc.f30256a;
            float f5 = 16;
            y2.h hVar8 = hVar;
            int i13 = i12;
            ua.b(strE0, j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            j0.g gVarG = j0.i.g(f5);
            z1.r rVarA = j0.c.A(oVar, f5);
            z1.i iVar2 = z1.c.M;
            a2 a2VarA = z1.a(gVarG, iVar2, sVar, 54);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarA);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA, sVar);
            l1.t.J(hVar4, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar8);
            }
            String strL = p.l(R.string.ko_syllable_sound_change_lesson6_2, sVar, p.v(sVar, rVarC4, hVar6, 2104694050, "baeg-man\n"), false);
            z1.r rVarE = e2.e(oVar, 0.4f);
            int i14 = i13 & 896;
            boolean z11 = i14 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new x(playAudio, 24);
                sVar.o0(objQ);
            }
            a.l(54, (fz.a) objQ, "백만", strL, sVar, rVarE);
            float f11 = 18;
            z1.r rVarE2 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA3 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA3, sVar);
            l1.t.J(hVar4, q1VarL5, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar8);
            }
            l1.t.J(hVar6, rVarC5, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[뱅만 / baeng-man]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            j0.g gVarG2 = j0.i.g(f5);
            z1.r rVarA2 = j0.c.A(oVar, f5);
            a2 a2VarA2 = z1.a(gVarG2, iVar2, sVar, 54);
            int iHashCode6 = Long.hashCode(sVar.T);
            q1 q1VarL6 = sVar.l();
            z1.r rVarC6 = z1.a.c(sVar, rVarA2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA2, sVar);
            l1.t.J(hVar4, q1VarL6, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                hVar2 = hVar8;
                defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar2);
            } else {
                hVar2 = hVar8;
            }
            String strL2 = p.l(R.string.ko_syllable_sound_change_lesson6_3, sVar, p.v(sVar, rVarC6, hVar6, -1606182101, "ib-ni-da\n"), false);
            z1.r rVarE3 = e2.e(oVar, 0.4f);
            boolean z12 = i14 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new x(playAudio, 25);
                sVar.o0(objQ2);
            }
            a.l(54, (fz.a) objQ2, "입니다", strL2, sVar, rVarE3);
            z1.r rVarE4 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA4 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode7 = Long.hashCode(sVar.T);
            q1 q1VarL7 = sVar.l();
            z1.r rVarC7 = z1.a.c(sVar, rVarE4);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA4, sVar);
            l1.t.J(hVar4, q1VarL7, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                defpackage.e.A(iHashCode7, sVar, iHashCode7, hVar2);
            }
            l1.t.J(hVar6, rVarC7, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[임니다 / im-ni-da]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.f44091c0, sVar, ((i13 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, playAudio, i11, 19);
        }
    }

    public static final void t(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        y2.h hVar;
        y2.h hVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-234330526);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar3 = y2.j.f56917f;
            l1.t.J(hVar3, q0VarD, sVar);
            y2.h hVar4 = y2.j.f56916e;
            l1.t.J(hVar4, q1VarL, sVar);
            y2.h hVar5 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
            }
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar7 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA, sVar);
            l1.t.J(hVar4, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
            }
            l1.t.J(hVar6, rVarC2, sVar);
            e0.c(a.f44093d0, null, t1.e.d(-581262804, new y(7, onClickFinish), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA2, sVar);
            l1.t.J(hVar4, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                hVar = hVar5;
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar);
            } else {
                hVar = hVar5;
            }
            l1.t.J(hVar6, rVarC3, sVar);
            String strE0 = ub.a.e0(sVar, R.string.ko_syllable_sound_change_lesson7_1);
            c3 c3Var = fc.f30256a;
            float f5 = 16;
            y2.h hVar8 = hVar;
            int i13 = i12;
            ua.b(strE0, j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            j0.g gVarG = j0.i.g(f5);
            z1.r rVarA = j0.c.A(oVar, f5);
            z1.i iVar2 = z1.c.M;
            a2 a2VarA = z1.a(gVarG, iVar2, sVar, 54);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarA);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA, sVar);
            l1.t.J(hVar4, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar8);
            }
            String strL = p.l(R.string.ko_syllable_sound_change_lesson7_2, sVar, p.v(sVar, rVarC4, hVar6, 1093267298, "jin-li\n"), false);
            z1.r rVarE = e2.e(oVar, 0.4f);
            int i14 = i13 & 896;
            boolean z11 = i14 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new x(playAudio, 26);
                sVar.o0(objQ);
            }
            a.l(54, (fz.a) objQ, "진리", strL, sVar, rVarE);
            float f11 = 18;
            z1.r rVarE2 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA3 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA3, sVar);
            l1.t.J(hVar4, q1VarL5, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar8);
            }
            l1.t.J(hVar6, rVarC5, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[질리 / jil-li]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            j0.g gVarG2 = j0.i.g(f5);
            z1.r rVarA2 = j0.c.A(oVar, f5);
            a2 a2VarA2 = z1.a(gVarG2, iVar2, sVar, 54);
            int iHashCode6 = Long.hashCode(sVar.T);
            q1 q1VarL6 = sVar.l();
            z1.r rVarC6 = z1.a.c(sVar, rVarA2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA2, sVar);
            l1.t.J(hVar4, q1VarL6, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                hVar2 = hVar8;
                defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar2);
            } else {
                hVar2 = hVar8;
            }
            String strL2 = p.l(R.string.ko_syllable_sound_change_lesson7_3, sVar, p.v(sVar, rVarC6, hVar6, 1677358411, "nan-lo\n"), false);
            z1.r rVarE3 = e2.e(oVar, 0.4f);
            boolean z12 = i14 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new x(playAudio, 27);
                sVar.o0(objQ2);
            }
            a.l(54, (fz.a) objQ2, "난로", strL2, sVar, rVarE3);
            z1.r rVarE4 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA4 = j0.t.a(dVar, hVar7, sVar, 0);
            int iHashCode7 = Long.hashCode(sVar.T);
            q1 q1VarL7 = sVar.l();
            z1.r rVarC7 = z1.a.c(sVar, rVarE4);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA4, sVar);
            l1.t.J(hVar4, q1VarL7, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                defpackage.e.A(iHashCode7, sVar, iHashCode7, hVar2);
            }
            l1.t.J(hVar6, rVarC7, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[날로 / nal-lo]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.f44095e0, sVar, ((i13 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, playAudio, i11, 20);
        }
    }

    public static final void u(fz.a onClickConfirm, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        kotlin.jvm.internal.m.f(onClickConfirm, "onClickConfirm");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1011899138);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(onClickConfirm) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            e8 e8VarF = a6.f(6, 2, null, sVar2);
            boolean z11 = (i12 & 14) == 4;
            Object objQ = sVar2.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new d(28, onClickConfirm);
                sVar2.o0(objQ);
            }
            sVar = sVar2;
            a6.a((fz.a) objQ, null, e8VarF, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(1797383711, new bp.u(16, onClickConfirm), sVar2), sVar, 0, 384, 4090);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.m(onClickConfirm, i11, 8, (byte) 0);
        }
    }

    public static final void v(KOSyllableLesson lesson, boolean z11, sv.o oVar, l9 l9Var, fz.a finish, fz.c loginNow, l1.n nVar, int i11) {
        sv.o oVar2;
        l9 l9Var2;
        int i12;
        l9 l9Var3;
        sv.o oVar3;
        j9.v vVar;
        kotlin.jvm.internal.m.f(lesson, "lesson");
        kotlin.jvm.internal.m.f(finish, "finish");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1889236503);
        int i13 = i11 | (sVar.h(lesson) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | 1152 | (sVar.h(finish) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(loginNow) ? 131072 : 65536);
        if (sVar.T(i13 & 1, (74899 & i13) != 74898)) {
            sVar.Y();
            int i14 = i11 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i14 == 0 || sVar.C()) {
                boolean zH = sVar.h(lesson) | ((i13 & 112) == 32);
                Object objQ = sVar.Q();
                if (zH || objQ == gVar) {
                    objQ = new bt.w(lesson, z11, 3);
                    sVar.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar.d0(-1614864554);
                LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                int i15 = LocalViewModelStoreOwner.$stable;
                ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(sVar, i15);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(sv.o.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), aVar);
                sVar.p(false);
                sv.o oVar4 = (sv.o) viewModelA;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(sVar, i15);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA2 = i20.b.a(kotlin.jvm.internal.z.a(l9.class), current2.getViewModelStore(), null, i20.a.a(current2), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-8065);
                l9Var3 = (l9) viewModelA2;
                oVar3 = oVar4;
            } else {
                sVar.W();
                i12 = i13 & (-8065);
                oVar3 = oVar;
                l9Var3 = l9Var;
            }
            sVar.q();
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new i1(-1L);
                sVar.o0(objQ2);
            }
            i1 i1Var = (i1) objQ2;
            j9.v vVarH = cf.x.H(new c0[0], sVar);
            boolean zH2 = ((57344 & i12) == 16384) | sVar.h(oVar3) | sVar.h(l9Var3) | sVar.h(vVarH) | ((i12 & 458752) == 131072);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == gVar) {
                vVar = vVarH;
                g7 g7Var = new g7((y9) oVar3, l9Var3, i1Var, finish, vVar, loginNow, 14);
                sVar.o0(g7Var);
                objQ3 = g7Var;
            } else {
                vVar = vVarH;
            }
            com.bumptech.glide.e.c(vVar, "syllable_test", null, null, null, null, null, null, (fz.c) objQ3, sVar, 48);
            oVar2 = oVar3;
            l9Var2 = l9Var3;
        } else {
            sVar.W();
            oVar2 = oVar;
            l9Var2 = l9Var;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.q1(lesson, z11, oVar2, l9Var2, finish, loginNow, i11, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r15v2, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r15v4, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18 */
    public static final void w(rc uiState, h9 settingsUiState, gc progressUiState, int i11, fz.a getCombo, fz.a onClickClose, fz.c onConfirmSettings, fz.e onWordMatchFailed, fz.c onChecked, fz.a onShowNext, fz.c onSkip, fz.a showFinish, l1.n nVar, int i12) {
        ?? r15;
        Object obj;
        ?? r9;
        l1.g gVar;
        boolean z11;
        Object obj2;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(settingsUiState, "settingsUiState");
        kotlin.jvm.internal.m.f(progressUiState, "progressUiState");
        kotlin.jvm.internal.m.f(getCombo, "getCombo");
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onConfirmSettings, "onConfirmSettings");
        kotlin.jvm.internal.m.f(onWordMatchFailed, "onWordMatchFailed");
        kotlin.jvm.internal.m.f(onChecked, "onChecked");
        kotlin.jvm.internal.m.f(onShowNext, "onShowNext");
        kotlin.jvm.internal.m.f(onSkip, "onSkip");
        kotlin.jvm.internal.m.f(showFinish, "showFinish");
        ?? r16 = (l1.s) nVar;
        r16.f0(-294060303);
        int i13 = i12 | (r16.h(uiState) ? 4 : 2) | (r16.h(settingsUiState) ? 32 : 16) | (r16.h(progressUiState) ? 256 : 128) | (r16.d(i11) ? 2048 : 1024) | (r16.h(getCombo) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (r16.h(onClickClose) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (r16.h(onConfirmSettings) ? 1048576 : 524288) | (r16.h(onWordMatchFailed) ? 8388608 : 4194304) | (r16.h(onChecked) ? 67108864 : 33554432) | (r16.h(onShowNext) ? 536870912 : 268435456);
        int i14 = (r16.h(onSkip) ? 4 : 2) | (r16.h(showFinish) ? 32 : 16);
        if (!r16.T(i13 & 1, ((i13 & 306783379) == 306783378 && (i14 & 19) == 18) ? false : true)) {
            r16.W();
            r15 = r16;
        } else if (uiState instanceof pc) {
            r16.d0(875907840);
            tv.a.d(0, 1, r16, null);
            r16.p(false);
            r15 = r16;
        } else {
            if (!(uiState instanceof qc)) {
                throw p.x(r16, 875910868, false);
            }
            r16.d0(1383541541);
            Object objQ = r16.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ == gVar2) {
                obj = objQ;
                b0 b0VarQ = l1.t.q(r16);
                r16.o0(b0VarQ);
                obj = b0VarQ;
            }
            obj = objQ;
            b0 b0Var = (b0) obj;
            Object objQ2 = r16.Q();
            Object obj3 = objQ2;
            if (objQ2 == gVar2) {
                k1 k1VarB = l1.t.B(Boolean.FALSE);
                r16.o0(k1VarB);
                obj3 = k1VarB;
            }
            b1 b1Var = (b1) obj3;
            Object objQ3 = r16.Q();
            Object obj4 = objQ3;
            if (objQ3 == gVar2) {
                k1 k1VarB2 = l1.t.B(Boolean.FALSE);
                r16.o0(k1VarB2);
                obj4 = k1VarB2;
            }
            b1 b1Var2 = (b1) obj4;
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                r16.d0(1383626791);
                Object objQ4 = r16.Q();
                if (objQ4 == gVar2) {
                    obj2 = objQ4;
                    n4 n4Var = new n4(21, b1Var2);
                    r16.o0(n4Var);
                    obj2 = n4Var;
                }
                obj2 = objQ4;
                fz.a aVar = (fz.a) obj2;
                boolean z12 = (i13 & 3670016) == 1048576;
                Object objQ5 = r16.Q();
                Object obj5 = objQ5;
                if (z12 || objQ5 == gVar2) {
                    o1 o1Var = new o1(onConfirmSettings, 27);
                    r16.o0(o1Var);
                    obj5 = o1Var;
                }
                z11 = true;
                gVar = gVar2;
                r9 = 0;
                ys.a.w(settingsUiState, null, false, false, aVar, (fz.c) obj5, null, null, r16, ((i13 >> 3) & 14) | 24576, 206);
            } else {
                r9 = 0;
                gVar = gVar2;
                z11 = true;
                r16.d0(1375826385);
            }
            r16.p(r9);
            Object objQ6 = r16.Q();
            Object obj6 = objQ6;
            if (objQ6 == gVar) {
                k1 k1VarB3 = l1.t.B(Boolean.FALSE);
                r16.o0(k1VarB3);
                obj6 = k1VarB3;
            }
            b1 b1Var3 = (b1) obj6;
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                r16.d0(1383998140);
                ?? r11 = (i13 & 458752) == 131072 ? z11 : r9;
                Object objQ7 = r16.Q();
                Object obj7 = objQ7;
                if (r11 != 0 || objQ7 == gVar) {
                    fu.e eVar = new fu.e(22, onClickClose, b1Var3);
                    r16.o0(eVar);
                    obj7 = eVar;
                }
                u((fz.a) obj7, r16, r9);
            } else {
                r16.d0(1375826385);
            }
            r16.p(r9);
            l1.g gVar3 = gVar;
            ?? r24 = r9;
            t1.d dVarD = t1.e.d(-1698057119, new m1(progressUiState, getCombo, b0Var, onClickClose, b1Var, uiState, i11, b1Var3, b1Var2), r16);
            Object objQ8 = r16.Q();
            Object obj8 = objQ8;
            if (objQ8 == gVar3) {
                c cVar = new c(19);
                r16.o0(cVar);
                obj8 = cVar;
            }
            fz.e eVar2 = (fz.e) obj8;
            boolean z13 = (i13 & 234881024) == 67108864 ? z11 : r24 == true ? 1 : 0;
            Object objQ9 = r16.Q();
            Object obj9 = objQ9;
            if (z13 || objQ9 == gVar3) {
                f1 f1Var = new f1(onChecked, b1Var, 3);
                r16.o0(f1Var);
                obj9 = f1Var;
            }
            fz.e eVar3 = (fz.e) obj9;
            boolean z14 = (i13 & 1879048192) == 536870912 ? z11 : r24 == true ? 1 : 0;
            Object objQ10 = r16.Q();
            Object obj10 = objQ10;
            if (z14 || objQ10 == gVar3) {
                fu.e eVar4 = new fu.e(23, onShowNext, b1Var);
                r16.o0(eVar4);
                obj10 = eVar4;
            }
            fz.a aVar2 = (fz.a) obj10;
            boolean z15 = (i14 & 14) == 4 ? z11 : r24 == true ? 1 : 0;
            Object objQ11 = r16.Q();
            Object obj11 = objQ11;
            if (z15 || objQ11 == gVar3) {
                y3 y3Var = new y3(onSkip, b1Var, 6);
                r16.o0(y3Var);
                obj11 = y3Var;
            }
            ys.a.n(uiState, settingsUiState, false, false, 0L, null, null, null, null, null, null, dVarD, onWordMatchFailed, eVar2, eVar3, aVar2, (fz.c) obj11, getCombo, showFinish, r16, i13 & 112, ((i13 >> 15) & 896) | 3120 | ((i13 << 9) & 29360128) | (234881024 & (i14 << 21)), 2044);
            ?? r17 = r16;
            r17.p(false);
            r15 = r17;
        }
        x1 x1VarT = r15.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e5(uiState, settingsUiState, progressUiState, i11, getCombo, onClickClose, onConfirmSettings, onWordMatchFailed, onChecked, onShowNext, onSkip, showFinish, i12);
        }
    }

    public static final void c(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c cVar, l1.n nVar) {
        int i12;
        fz.c cVar2;
        fz.c cVar3;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(cVar, kHfjNGauVgdF.dkLPkGLcO);
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1338974360);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(cVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            l1.t.J(hVar4, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            l1.t.J(hVar4, rVarC2, sVar);
            e0.c(a.f44111u, null, t1.e.d(1423549794, new lt.g(onClickFinish, 21, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            float f5 = 16;
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson14_1), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, 48, 0, 65532);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                cVar3 = cVar;
                objQ = new s(cVar3, 22);
                sVar.o0(objQ);
            } else {
                cVar3 = cVar;
            }
            cVar2 = cVar;
            a.b("ㄱ", "g", false, (fz.a) objQ, t1.e.d(636673785, new q(cVar3, 9), sVar), t1.e.d(2100311802, new q(cVar3, 10), sVar), sVar, 221238, 4);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new s(cVar2, 23);
                sVar.o0(objQ2);
            }
            a.b("ㄷ", "d", false, (fz.a) objQ2, t1.e.d(790427618, new q(cVar2, 11), sVar), t1.e.d(-1402711133, new q(cVar2, 12), sVar), sVar, 221238, 4);
            boolean z13 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new s(cVar2, 24);
                sVar.o0(objQ3);
            }
            a.b("ㅂ", "b", false, (fz.a) objQ3, t1.e.d(924014529, new q(cVar2, 13), sVar), t1.e.d(-1269124222, new q(cVar2, 8), sVar), sVar, 221238, 4);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.f44112v, sVar, ((i12 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            cVar2 = cVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, cVar2, i11, 4);
        }
    }

    public static final void f(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1943654656);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            l1.t.J(hVar4, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            l1.t.J(hVar4, rVarC2, sVar);
            e0.c(a.C, null, t1.e.d(-759210422, new lt.g(onClickFinish, 24, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            String strE0 = ub.a.e0(sVar, R.string.ko_syllable_lesson3_1);
            c3 c3Var = fc.f30256a;
            float f5 = 16;
            ua.b(strE0, j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_vowels), j0.c.E(oVar, f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30175h, sVar, 48, 0, 65532);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson3_2), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new t(playAudio, 24);
                sVar.o0(objQ);
            }
            int i14 = i12;
            a.b("ㅐ", "ae", false, (fz.a) objQ, t1.e.d(-549973599, new q(playAudio, 19), sVar), null, sVar, 24630, 36);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new t(playAudio, 27);
                sVar.o0(objQ2);
            }
            a.b("ㅔ", MzwEyWCkjXL.BCIWurLUQPaVtY, false, (fz.a) objQ2, t1.e.d(-759869238, new q(playAudio, 20), sVar), null, sVar, 24630, 36);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_constants), j0.c.E(oVar, f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30175h, sVar, 48, 0, 65532);
            boolean z13 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new t(playAudio, 28);
                sVar.o0(objQ3);
            }
            a.b("ㄹ", "l", false, (fz.a) objQ3, t1.e.d(-835707799, new q(playAudio, 21), sVar), null, sVar, 24630, 36);
            boolean z14 = i13 == 256;
            Object objQ4 = sVar.Q();
            if (z14 || objQ4 == gVar) {
                objQ4 = new t(playAudio, 29);
                sVar.o0(objQ4);
            }
            a.b("ㅎ", "h", false, (fz.a) objQ4, t1.e.d(-911546360, new q(playAudio, 22), sVar), null, sVar, 24630, 36);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.D, sVar, ((i14 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, playAudio, i11, 7);
        }
    }

    public static final void g(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c playAudio, l1.n nVar) {
        int i12;
        fz.c cVar;
        fz.c cVar2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1582643360);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(playAudio) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            l1.t.J(hVar4, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            l1.t.J(hVar4, rVarC2, sVar);
            e0.c(a.E, null, t1.e.d(-398199126, new lt.g(onClickFinish, 25, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            float f5 = 16;
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson4_1), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, 48, 0, 65532);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                cVar2 = playAudio;
                objQ = new u(cVar2, 18);
                sVar.o0(objQ);
            } else {
                cVar2 = playAudio;
            }
            cVar = playAudio;
            a.b("ㅑ", "ya", false, (fz.a) objQ, t1.e.d(-188962303, new v(cVar2, 0), sVar), null, sVar, 24630, 36);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new u(cVar, 19);
                sVar.o0(objQ2);
            }
            a.b("ㅕ", bjXGJ.dMJm, false, (fz.a) objQ2, t1.e.d(-398857942, new q(cVar, 23), sVar), null, sVar, 24630, 36);
            boolean z13 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new u(cVar, 0);
                sVar.o0(objQ3);
            }
            a.b("ㅛ", "yo", false, (fz.a) objQ3, t1.e.d(-474696503, new q(cVar, 24), sVar), null, sVar, 24630, 36);
            boolean z14 = i13 == 256;
            Object objQ4 = sVar.Q();
            if (z14 || objQ4 == gVar) {
                objQ4 = new u(cVar, 1);
                sVar.o0(objQ4);
            }
            a.b("ㅠ", "yu", false, (fz.a) objQ4, t1.e.d(-550535064, new q(cVar, 25), sVar), null, sVar, 24630, 36);
            boolean z15 = i13 == 256;
            Object objQ5 = sVar.Q();
            if (z15 || objQ5 == gVar) {
                objQ5 = new u(cVar, 2);
                sVar.o0(objQ5);
            }
            a.b("ㅒ", "yae", false, (fz.a) objQ5, t1.e.d(-626373625, new q(cVar, 26), sVar), t1.e.d(837264392, new q(cVar, 27), sVar), sVar, 221238, 4);
            boolean z16 = i13 == 256;
            Object objQ6 = sVar.Q();
            if (z16 || objQ6 == gVar) {
                objQ6 = new u(cVar, 17);
                sVar.o0(objQ6);
            }
            a.b("ㅖ", "ye", false, (fz.a) objQ6, t1.e.d(-702212186, new q(cVar, 28), sVar), t1.e.d(761425831, new q(cVar, 29), sVar), sVar, 221238, 4);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.F, sVar, ((i12 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            cVar = playAudio;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, cVar, i11, 8);
        }
    }

    public static final void l(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c cVar, l1.n nVar) {
        int i12;
        fz.c cVar2;
        fz.c cVar3;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(cVar, aYZzTH.EUyytr);
        l1.s sVar = (l1.s) nVar;
        sVar.f0(222413120);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(cVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
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
            l1.t.J(hVar4, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar5 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            l1.t.J(hVar4, rVarC2, sVar);
            e0.c(a.P, null, t1.e.d(1406857354, new y(0, onClickFinish), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            float f5 = 16;
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_lesson9_1), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, 48, 0, 65532);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                cVar3 = cVar;
                objQ = new x(cVar3, 8);
                sVar.o0(objQ);
            } else {
                cVar3 = cVar;
            }
            cVar2 = cVar;
            a.b("ㄷ", "d", false, (fz.a) objQ, t1.e.d(1616094177, new v(cVar3, 14), sVar), t1.e.d(1666779170, new v(cVar3, 15), sVar), sVar, 221238, 4);
            boolean z12 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new x(cVar2, 9);
                sVar.o0(objQ2);
            }
            a.b("ㅌ", "t", false, (fz.a) objQ2, t1.e.d(1406198538, new v(cVar2, 16), sVar), null, sVar, 24630, 36);
            boolean z13 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new x(cVar2, 10);
                sVar.o0(objQ3);
            }
            a.b("ㄸ", "tt", false, (fz.a) objQ3, t1.e.d(1330359977, new v(cVar2, 17), sVar), null, sVar, 24630, 36);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.Q, sVar, ((i12 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            cVar2 = cVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, cVar2, i11, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x046c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0470  */
    /* JADX WARN: Code duplicated, block: B:120:0x048b  */
    /* JADX WARN: Code duplicated, block: B:123:0x054a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0550  */
    /* JADX WARN: Code duplicated, block: B:130:0x056e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0597  */
    /* JADX WARN: Code duplicated, block: B:136:0x059a  */
    /* JADX WARN: Code duplicated, block: B:142:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:145:0x0604  */
    /* JADX WARN: Code duplicated, block: B:146:0x0608  */
    /* JADX WARN: Code duplicated, block: B:151:0x0623  */
    /* JADX WARN: Code duplicated, block: B:154:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:155:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:160:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:165:0x070c  */
    /* JADX WARN: Code duplicated, block: B:166:0x070e  */
    /* JADX WARN: Code duplicated, block: B:173:0x071d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0760  */
    /* JADX WARN: Code duplicated, block: B:177:0x0764  */
    /* JADX WARN: Code duplicated, block: B:182:0x077f  */
    public static final void p(int i11, fz.a onClickFinish, fz.a onClickStartLearning, fz.c cVar, l1.n nVar) {
        int i12;
        y2.h hVar;
        y2.h hVar2;
        l1.g gVar;
        y2.h hVar3;
        int iHashCode;
        int iHashCode2;
        y2.h hVar4;
        boolean z11;
        Object objQ;
        y2.h hVar5;
        int iHashCode3;
        int iHashCode4;
        y2.h hVar6;
        boolean z12;
        Object objQ2;
        int iHashCode5;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        kotlin.jvm.internal.m.f(cVar, OCBJEWZHh.FAPslZswuceh);
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-556377254);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onClickFinish) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickStartLearning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(cVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode6 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar7 = y2.j.f56917f;
            l1.t.J(hVar7, q0VarD, sVar);
            y2.h hVar8 = y2.j.f56916e;
            l1.t.J(hVar8, q1VarL, sVar);
            y2.h hVar9 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar9);
            }
            y2.h hVar10 = y2.j.f56915d;
            l1.t.J(hVar10, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar11 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar11, sVar, 0);
            int iHashCode7 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar7, uVarA, sVar);
            l1.t.J(hVar8, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                defpackage.e.A(iHashCode7, sVar, iHashCode7, hVar9);
            }
            l1.t.J(hVar10, rVarC2, sVar);
            e0.c(a.V, null, t1.e.d(-903309532, new y(3, onClickFinish), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarY = d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b), d0.n.u(sVar), true, 12);
            j0.u uVarA2 = j0.t.a(dVar, hVar11, sVar, 0);
            int iHashCode8 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar7, uVarA2, sVar);
            l1.t.J(hVar8, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode8))) {
                hVar = hVar9;
                defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar);
            } else {
                hVar = hVar9;
            }
            l1.t.J(hVar10, rVarC3, sVar);
            String strE0 = ub.a.e0(sVar, R.string.ko_syllable_sound_change_lesson3_1);
            c3 c3Var = fc.f30256a;
            float f5 = 16;
            y2.h hVar12 = hVar;
            int i13 = i12;
            ua.b(strE0, j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            j0.g gVarG = j0.i.g(f5);
            z1.r rVarA = j0.c.A(oVar, f5);
            z1.i iVar2 = z1.c.M;
            a2 a2VarA = z1.a(gVarG, iVar2, sVar, 54);
            int iHashCode9 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarA);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar7, a2VarA, sVar);
            l1.t.J(hVar8, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode9))) {
                defpackage.e.A(iHashCode9, sVar, iHashCode9, hVar12);
            }
            String strL = p.l(R.string.ko_syllable_sound_change_lesson3_2, sVar, p.v(sVar, rVarC4, hVar10, 844007036, "joh-a-yo\n"), false);
            z1.r rVarE = e2.e(oVar, 0.4f);
            int i14 = i13 & 896;
            boolean z13 = i14 == 256;
            Object objQ3 = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (z13 || objQ3 == gVar2) {
                objQ3 = new x(cVar, 16);
                sVar.o0(objQ3);
            }
            a.l(54, (fz.a) objQ3, "좋아요", strL, sVar, rVarE);
            float f11 = 18;
            z1.r rVarE2 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA3 = j0.t.a(dVar, hVar11, sVar, 0);
            int iHashCode10 = Long.hashCode(sVar.T);
            q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar7, uVarA3, sVar);
            l1.t.J(hVar8, q1VarL5, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode10))) {
                defpackage.e.A(iHashCode10, sVar, iHashCode10, hVar12);
            }
            l1.t.J(hVar10, rVarC5, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[조아요 / jo-a-yo]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            j0.g gVarG2 = j0.i.g(f5);
            z1.r rVarA2 = j0.c.A(oVar, f5);
            a2 a2VarA2 = z1.a(gVarG2, iVar2, sVar, 54);
            int iHashCode11 = Long.hashCode(sVar.T);
            q1 q1VarL6 = sVar.l();
            z1.r rVarC6 = z1.a.c(sVar, rVarA2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar7, a2VarA2, sVar);
            l1.t.J(hVar8, q1VarL6, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode11))) {
                hVar2 = hVar12;
                defpackage.e.A(iHashCode11, sVar, iHashCode11, hVar2);
            } else {
                hVar2 = hVar12;
            }
            String strL2 = p.l(R.string.ko_syllable_sound_change_lesson3_3, sVar, p.v(sVar, rVarC6, hVar10, 1428098151, "silh-eo-yo\n"), false);
            z1.r rVarE3 = e2.e(oVar, 0.4f);
            boolean z14 = i14 == 256;
            Object objQ4 = sVar.Q();
            if (z14) {
                gVar = gVar2;
            } else {
                gVar = gVar2;
                if (objQ4 == gVar) {
                }
                l1.g gVar3 = gVar;
                a.l(54, (fz.a) objQ4, "싫어요", strL2, sVar, rVarE3);
                hVar3 = hVar2;
                z1.r rVarE4 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                j0.u uVarA4 = j0.t.a(dVar, hVar11, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL7 = sVar.l();
                z1.r rVarC7 = z1.a.c(sVar, rVarE4);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar7, uVarA4, sVar);
                l1.t.J(hVar8, q1VarL7, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                }
                l1.t.J(hVar10, rVarC7, sVar);
                ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[시러요 / si-leo-yo]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
                sVar.p(true);
                sVar.p(true);
                ua.b(ub.a.e0(sVar, R.string.ko_syllable_sound_change_lesson3_4), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
                j0.g gVarG3 = j0.i.g(f5);
                z1.r rVarA3 = j0.c.A(oVar, f5);
                a2 a2VarA3 = z1.a(gVarG3, iVar2, sVar, 54);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL8 = sVar.l();
                z1.r rVarC8 = z1.a.c(sVar, rVarA3);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar7, a2VarA3, sVar);
                l1.t.J(hVar8, q1VarL8, sVar);
                if (sVar.S && kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    hVar4 = hVar3;
                } else {
                    hVar4 = hVar3;
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
                }
                String strL3 = p.l(R.string.ko_syllable_sound_change_lesson3_5, sVar, p.v(sVar, rVarC8, hVar10, 1772661473, "gat-i\n"), false);
                z1.r rVarE5 = e2.e(oVar, 0.4f);
                if (i14 == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objQ = sVar.Q();
                if (z11 || objQ == gVar3) {
                    objQ = new x(cVar, 18);
                    sVar.o0(objQ);
                }
                a.l(54, (fz.a) objQ, "같이", strL3, sVar, rVarE5);
                hVar5 = hVar4;
                z1.r rVarE6 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                j0.u uVarA5 = j0.t.a(dVar, hVar11, sVar, 0);
                iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL9 = sVar.l();
                z1.r rVarC9 = z1.a.c(sVar, rVarE6);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar7, uVarA5, sVar);
                l1.t.J(hVar8, q1VarL9, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar5);
                }
                l1.t.J(hVar10, rVarC9, sVar);
                ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[가치 / ga-chi]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
                sVar.p(true);
                sVar.p(true);
                j0.g gVarG4 = j0.i.g(f5);
                z1.r rVarA4 = j0.c.A(oVar, f5);
                a2 a2VarA4 = z1.a(gVarG4, iVar2, sVar, 54);
                iHashCode4 = Long.hashCode(sVar.T);
                q1 q1VarL10 = sVar.l();
                z1.r rVarC10 = z1.a.c(sVar, rVarA4);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar7, a2VarA4, sVar);
                l1.t.J(hVar8, q1VarL10, sVar);
                if (sVar.S && kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                    hVar6 = hVar5;
                } else {
                    hVar6 = hVar5;
                    defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar6);
                }
                String strL4 = p.l(R.string.ko_syllable_sound_change_lesson3_6, sVar, p.v(sVar, rVarC10, hVar10, 2117224832, "gud-i\n"), false);
                z1.r rVarE7 = e2.e(oVar, 0.4f);
                if (i14 == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objQ2 = sVar.Q();
                if (z12 || objQ2 == gVar3) {
                    objQ2 = new x(cVar, 19);
                    sVar.o0(objQ2);
                }
                a.l(54, (fz.a) objQ2, "굳이", strL4, sVar, rVarE7);
                z1.r rVarE8 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                j0.u uVarA6 = j0.t.a(dVar, hVar11, sVar, 0);
                iHashCode5 = Long.hashCode(sVar.T);
                q1 q1VarL11 = sVar.l();
                z1.r rVarC11 = z1.a.c(sVar, rVarE8);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar7, uVarA6, sVar);
                l1.t.J(hVar8, q1VarL11, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                    defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar6);
                }
                l1.t.J(hVar10, rVarC11, sVar);
                ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[구지 / gu-ji]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
                sVar.p(true);
                sVar.p(true);
                p0.B(oVar, 72, sVar, true, true);
                iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.W, sVar, ((i13 >> 3) & 14) | 196608, 28);
                sVar = sVar;
                sVar.p(true);
            }
            objQ4 = new x(cVar, 17);
            sVar.o0(objQ4);
            l1.g gVar4 = gVar;
            a.l(54, (fz.a) objQ4, "싫어요", strL2, sVar, rVarE3);
            hVar3 = hVar2;
            z1.r rVarE9 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA7 = j0.t.a(dVar, hVar11, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL12 = sVar.l();
            z1.r rVarC12 = z1.a.c(sVar, rVarE9);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar7, uVarA7, sVar);
            l1.t.J(hVar8, q1VarL12, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            l1.t.J(hVar10, rVarC12, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[시러요 / si-leo-yo]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            ua.b(ub.a.e0(sVar, R.string.ko_syllable_sound_change_lesson3_4), j0.c.A(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30177j, sVar, 48, 0, 65532);
            j0.g gVarG5 = j0.i.g(f5);
            z1.r rVarA5 = j0.c.A(oVar, f5);
            a2 a2VarA5 = z1.a(gVarG5, iVar2, sVar, 54);
            iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL13 = sVar.l();
            z1.r rVarC13 = z1.a.c(sVar, rVarA5);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar7, a2VarA5, sVar);
            l1.t.J(hVar8, q1VarL13, sVar);
            if (sVar.S) {
                hVar4 = hVar3;
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            } else {
                hVar4 = hVar3;
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            String strL5 = p.l(R.string.ko_syllable_sound_change_lesson3_5, sVar, p.v(sVar, rVarC13, hVar10, 1772661473, "gat-i\n"), false);
            z1.r rVarE10 = e2.e(oVar, 0.4f);
            if (i14 == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            objQ = sVar.Q();
            if (z11) {
                objQ = new x(cVar, 18);
                sVar.o0(objQ);
            } else {
                objQ = new x(cVar, 18);
                sVar.o0(objQ);
            }
            a.l(54, (fz.a) objQ, "같이", strL5, sVar, rVarE10);
            hVar5 = hVar4;
            z1.r rVarE11 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA8 = j0.t.a(dVar, hVar11, sVar, 0);
            iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL14 = sVar.l();
            z1.r rVarC14 = z1.a.c(sVar, rVarE11);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar7, uVarA8, sVar);
            l1.t.J(hVar8, q1VarL14, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar5);
            } else {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar5);
            }
            l1.t.J(hVar10, rVarC14, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[가치 / ga-chi]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            j0.g gVarG6 = j0.i.g(f5);
            z1.r rVarA6 = j0.c.A(oVar, f5);
            a2 a2VarA6 = z1.a(gVarG6, iVar2, sVar, 54);
            iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL15 = sVar.l();
            z1.r rVarC15 = z1.a.c(sVar, rVarA6);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar7, a2VarA6, sVar);
            l1.t.J(hVar8, q1VarL15, sVar);
            if (sVar.S) {
                hVar6 = hVar5;
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar6);
            } else {
                hVar6 = hVar5;
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar6);
            }
            String strL6 = p.l(R.string.ko_syllable_sound_change_lesson3_6, sVar, p.v(sVar, rVarC15, hVar10, 2117224832, "gud-i\n"), false);
            z1.r rVarE12 = e2.e(oVar, 0.4f);
            if (i14 == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            objQ2 = sVar.Q();
            if (z12) {
                objQ2 = new x(cVar, 19);
                sVar.o0(objQ2);
            } else {
                objQ2 = new x(cVar, 19);
                sVar.o0(objQ2);
            }
            a.l(54, (fz.a) objQ2, "굳이", strL6, sVar, rVarE12);
            z1.r rVarE13 = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA9 = j0.t.a(dVar, hVar11, sVar, 0);
            iHashCode5 = Long.hashCode(sVar.T);
            q1 q1VarL16 = sVar.l();
            z1.r rVarC16 = z1.a.c(sVar, rVarE13);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar7, uVarA9, sVar);
            l1.t.J(hVar8, q1VarL16, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar6);
            } else {
                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar6);
            }
            l1.t.J(hVar10, rVarC16, sVar);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.ko_syllable_sound_change_word_reads_like), "%s", "[구지 / gu-ji]"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            p0.B(oVar, 72, sVar, true, true);
            iu.k.e(onClickStartLearning, j0.r.f35391a.a(j0.c.A(e2.e(oVar, 1.0f), f5), z1.c.H), false, 0L, null, a.W, sVar, ((i13 >> 3) & 14) | 196608, 28);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(onClickFinish, onClickStartLearning, cVar, i11, 16);
        }
    }
}
