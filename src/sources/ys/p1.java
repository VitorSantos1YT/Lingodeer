package ys;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import h1.r4;
import h1.ua;
import java.io.File;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import rt.f9;
import rt.g9;
import rt.h9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f58207a = 40;

    public static final void a(CourseTestFinishSummaryUiState summaryUiState, final h9 settingsUiState, final z1.r rVar, final fz.a updateScriptShortcutDisplay, final fz.a onClickContinue, final fz.e eVar, final fz.e eVar2, final fz.e eVar3, final fz.f fVar, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(summaryUiState, "summaryUiState");
        kotlin.jvm.internal.m.f(settingsUiState, "settingsUiState");
        kotlin.jvm.internal.m.f(updateScriptShortcutDisplay, "updateScriptShortcutDisplay");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(96591697);
        int i12 = i11 | (sVar2.h(summaryUiState) ? 4 : 2) | (sVar2.f(settingsUiState) ? 32 : 16) | (sVar2.f(rVar) ? 256 : 128) | (sVar2.h(updateScriptShortcutDisplay) ? 2048 : 1024) | (sVar2.h(onClickContinue) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(eVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(eVar2) ? 1048576 : 524288) | (sVar2.h(eVar3) ? 8388608 : 4194304) | (sVar2.h(fVar) ? 67108864 : 33554432);
        if (sVar2.T(i12 & 1, (i12 & 38347923) != 38347922)) {
            e20.a aVarC = w4.c.c(sVar2, -1168520582, sVar2, -1633490746);
            boolean zF = sVar2.f(null) | sVar2.f(aVarC);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = w4.c.e(av.n.class, aVarC, null, null, sVar2);
            }
            sVar2.p(false);
            sVar2.p(false);
            final av.n nVar2 = (av.n) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(null);
                sVar2.o0(objQ2);
            }
            final l1.b1 b1Var = (l1.b1) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(null);
                sVar2.o0(objQ3);
            }
            final l1.b1 b1Var2 = (l1.b1) objQ3;
            boolean zH = sVar2.h(nVar2);
            Object objQ4 = sVar2.Q();
            if (zH || objQ4 == gVar) {
                objQ4 = new yb.a(nVar2, 1);
                sVar2.o0(objQ4);
            }
            l1.t.c(nVar2, (fz.c) objQ4, sVar2);
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = l1.t.B(Boolean.TRUE);
                sVar2.o0(objQ5);
            }
            final l1.b1 b1Var3 = (l1.b1) objQ5;
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                objQ6 = l1.t.B(Boolean.TRUE);
                sVar2.o0(objQ6);
            }
            final l1.b1 b1Var4 = (l1.b1) objQ6;
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                objQ7 = l1.t.B(Boolean.TRUE);
                sVar2.o0(objQ7);
            }
            final l1.b1 b1Var5 = (l1.b1) objQ7;
            sVar = sVar2;
            a0.o.b(summaryUiState, null, null, null, BuildConfig.VERSION_NAME, null, t1.e.d(1315389057, new fz.g() { // from class: ys.c1
                @Override // fz.g
                public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
                    y2.h hVar;
                    y2.h hVar2;
                    l1.s sVar3;
                    a0.r AnimatedContent = (a0.r) obj;
                    CourseTestFinishSummaryUiState targetState = (CourseTestFinishSummaryUiState) obj2;
                    l1.n nVar3 = (l1.n) obj3;
                    ((Integer) obj4).getClass();
                    kotlin.jvm.internal.m.f(AnimatedContent, "$this$AnimatedContent");
                    kotlin.jvm.internal.m.f(targetState, "targetState");
                    if (targetState.equals(CourseTestFinishSummaryUiState.Loading.INSTANCE)) {
                        l1.s sVar4 = (l1.s) nVar3;
                        sVar4.d0(1368501968);
                        tv.a.d(0, 1, sVar4, null);
                        sVar4.p(false);
                    } else {
                        if (!(targetState instanceof CourseTestFinishSummaryUiState.Success)) {
                            throw nv.p.x((l1.s) nVar3, 1368516134, false);
                        }
                        l1.s sVar5 = (l1.s) nVar3;
                        sVar5.d0(-525530886);
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        int iHashCode = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL = sVar5.l();
                        z1.r rVarC = z1.a.c(sVar5, rVar);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        y2.h hVar3 = y2.j.f56917f;
                        l1.t.J(hVar3, q0VarD, sVar5);
                        y2.h hVar4 = y2.j.f56916e;
                        l1.t.J(hVar4, q1VarL, sVar5);
                        y2.h hVar5 = y2.j.f56918g;
                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar5, iHashCode, hVar5);
                        }
                        y2.h hVar6 = y2.j.f56915d;
                        l1.t.J(hVar6, rVarC, sVar5);
                        float f5 = 20;
                        j0.v1 v1VarD = j0.c.d(f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        z1.o oVar = z1.o.f58481a;
                        z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 72, 7);
                        h9 h9Var = settingsUiState;
                        boolean zH2 = sVar5.h(h9Var);
                        fz.a aVar = updateScriptShortcutDisplay;
                        boolean zF2 = zH2 | sVar5.f(aVar) | sVar5.h(targetState);
                        fz.e eVar4 = eVar;
                        boolean zF3 = zF2 | sVar5.f(eVar4);
                        fz.e eVar5 = eVar2;
                        boolean zF4 = zF3 | sVar5.f(eVar5);
                        fz.e eVar6 = eVar3;
                        boolean zF5 = zF4 | sVar5.f(eVar6);
                        fz.f fVar2 = fVar;
                        boolean zF6 = zF5 | sVar5.f(fVar2);
                        av.n nVar4 = nVar2;
                        boolean zH3 = zF6 | sVar5.h(nVar4);
                        Object objQ8 = sVar5.Q();
                        l1.g gVar2 = l1.m.f39353a;
                        if (zH3 || objQ8 == gVar2) {
                            hVar = hVar3;
                            hVar2 = hVar4;
                            gr.q qVar = new gr.q(targetState, eVar4, eVar5, eVar6, fVar2, h9Var, aVar, b1Var3, b1Var, b1Var2, nVar4, b1Var4, b1Var5);
                            sVar3 = sVar5;
                            sVar3.o0(qVar);
                            objQ8 = qVar;
                        } else {
                            sVar3 = sVar5;
                            hVar2 = hVar4;
                            hVar = hVar3;
                        }
                        l1.s sVar6 = sVar3;
                        ue.f.a(rVarE, null, v1VarD, null, null, null, false, null, (fz.c) objQ8, sVar6, 390, 506);
                        z1.r rVarE2 = j0.c.E(j0.r.f35391a.a(oVar, z1.c.H), f5, CropImageView.DEFAULT_ASPECT_RATIO, r12, 16, 2);
                        j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar6, 0);
                        int iHashCode2 = Long.hashCode(sVar6.T);
                        l1.q1 q1VarL2 = sVar6.l();
                        z1.r rVarC2 = z1.a.c(sVar6, rVarE2);
                        sVar6.h0();
                        if (sVar6.S) {
                            sVar6.k(iVar);
                        } else {
                            sVar6.r0();
                        }
                        l1.t.J(hVar, a2VarA, sVar6);
                        l1.t.J(hVar2, q1VarL2, sVar6);
                        if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar5);
                        }
                        l1.t.J(hVar6, rVarC2, sVar6);
                        fz.a aVar2 = onClickContinue;
                        boolean zF7 = sVar6.f(aVar2);
                        Object objQ9 = sVar6.Q();
                        if (zF7 || objQ9 == gVar2) {
                            objQ9 = new xu.r1(25, aVar2);
                            sVar6.o0(objQ9);
                        }
                        iu.k.e((fz.a) objQ9, j0.e2.e(oVar, 1.0f), false, 0L, null, a.f57890j, sVar6, 196656, 28);
                        com.google.android.material.datepicker.d.B(sVar6, true, true, false);
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2), sVar, (i12 & 14) | 1597440, 46);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.c1(summaryUiState, settingsUiState, rVar, updateScriptShortcutDisplay, onClickContinue, eVar, eVar2, eVar3, fVar, i11);
        }
    }

    public static final void b(av.n nVar, l1.b1 b1Var, l1.b1 b1Var2, String str) {
        qh.d dVar = new qh.d(13, b1Var, b1Var2);
        nVar.getClass();
        nVar.f3172c = dVar;
        nVar.h(str);
    }

    public static final void c(final int i11, final String str, final int i12, final long j11, final float f5, final fz.a aVar, l1.n nVar, final int i13) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1854573351);
        int i14 = i13 | (sVar.d(i11) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.d(i12) ? 256 : 128) | (sVar.c(f5) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i14 & 1, (74899 & i14) != 74898)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarH = d0.n.h(j0.e2.e(j0.e2.g(oVar, 42), 1.0f), j11, g2.f0.f28556b);
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new xu.r1(24, aVar);
                sVar.o0(objQ);
            }
            z1.r rVarO = d0.n.o(rVarH, false, null, (fz.a) objQ, 15);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarO);
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
            float f11 = 16;
            d0.n.c(se.k.y(i11, sVar, i14 & 14), null, j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
            ua.b(str, j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, fr.j3.A(14), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, ((i14 >> 3) & 14) | 48, 0, 65532);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.c.g(sVar, new j0.i1(1.0f, true));
            ua.b(String.valueOf(i12), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
            sVar = sVar;
            r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar, 0), null, d2.h.h(j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 10), f5), ((h1.s1) sVar.j(h1.v1.f31180a)).f31034q, sVar, 48, 0);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(i11, str, i12, j11, f5, aVar, i13) { // from class: ys.e1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f57985a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f57986b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f57987c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f57988d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f57989e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ fz.a f57990f;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(199681);
                    p1.c(this.f57985a, this.f57986b, this.f57987c, this.f57988d, this.f57989e, this.f57990f, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void d(h9 h9Var, fz.a aVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1064086698);
        int i13 = i11 | (sVar.f(h9Var) ? 4 : 2) | (sVar.h(aVar) ? 32 : 16);
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            z1.r rVarE = j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 20, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
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
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            ua.b(ub.a.e0(sVar, R.string.summary), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, fr.j3.A(20), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 0, 0, 65534);
            sVar = sVar;
            if (kotlin.jvm.internal.m.a(h9Var, f9.f49754a)) {
                i12 = -1;
            } else {
                if (!(h9Var instanceof g9)) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = ((g9) h9Var).f49787b.f50784c;
            }
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            w4.c.r(1.0f, true, sVar);
            boolean z11 = (i13 & 112) == 32;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new xu.r1(23, aVar);
                sVar.o0(objQ);
            }
            p2.a(i12, 0, (fz.a) objQ, sVar);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new pr.y(h9Var, i11, 25, aVar);
        }
    }

    public static final void e(int i11, fz.a aVar, l1.n nVar, z1.r rVar, boolean z11) {
        fz.a aVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(430428040);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11 | (sVar.f(rVar) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            aVar2 = aVar;
            k7.h(aVar2, j0.e2.n(rVar, 32), false, null, t1.e.d(-1547107931, new at.m(z11, 7), sVar), sVar, ((i12 >> 6) & 14) | 196608, 28);
        } else {
            aVar2 = aVar;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.j(z11, rVar, aVar2, i11);
        }
    }

    public static final long f(WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType) {
        if (wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.CharacterType) {
            return ((WordSentenceCharacterSummaryType.CharacterType) wordSentenceCharacterSummaryType).getCharacter().getCharacterId();
        }
        if (wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.WordType) {
            return ((WordSentenceCharacterSummaryType.WordType) wordSentenceCharacterSummaryType).getWord().getWordId();
        }
        if (wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.SentenceType) {
            return ((WordSentenceCharacterSummaryType.SentenceType) wordSentenceCharacterSummaryType).getSentence().getSentenceId();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String g(long j11, String str, String str2) {
        try {
            String name = new File(str).getName();
            int iHashCode = str2.hashCode();
            if (iHashCode != -988963143) {
                if (iHashCode != 3655434) {
                    if (iHashCode == 1262736995 && str2.equals("sentence")) {
                        Pattern patternCompile = Pattern.compile("^(\\w+)-[mf]-s-(\\d+)\\.mp3$");
                        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                        kotlin.jvm.internal.m.c(name);
                        Matcher matcher = patternCompile.matcher(name);
                        kotlin.jvm.internal.m.e(matcher, "matcher(...)");
                        if (se.k.e(matcher, 0, name) != null) {
                            qy.q qVar = fv.b.f28186a;
                            return fv.b.G(j11, Long.valueOf(j11), null);
                        }
                    }
                } else if (str2.equals("word")) {
                    Pattern patternCompile2 = Pattern.compile("^(\\w+)-[mf]-w-(\\d+)\\.mp3$");
                    kotlin.jvm.internal.m.e(patternCompile2, "compile(...)");
                    kotlin.jvm.internal.m.c(name);
                    Matcher matcher2 = patternCompile2.matcher(name);
                    kotlin.jvm.internal.m.e(matcher2, "matcher(...)");
                    if (se.k.e(matcher2, 0, name) != null) {
                        qy.q qVar2 = fv.b.f28186a;
                        return fv.b.Y(j11, Long.valueOf(j11), null);
                    }
                }
            } else if (str2.equals("phrase")) {
                Pattern patternCompile3 = Pattern.compile("^(\\w+)-[mf]-p-(\\d+)\\.mp3$");
                kotlin.jvm.internal.m.e(patternCompile3, "compile(...)");
                kotlin.jvm.internal.m.c(name);
                Matcher matcher3 = patternCompile3.matcher(name);
                kotlin.jvm.internal.m.e(matcher3, "matcher(...)");
                if (se.k.e(matcher3, 0, name) != null) {
                    qy.q qVar3 = fv.b.f28186a;
                    return fv.b.x(j11, Long.valueOf(j11), null);
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static final l1.b1 h(String str, long j11, fz.e eVar, l1.s sVar) {
        boolean zF = sVar.f(str) | sVar.e(j11) | sVar.f(eVar);
        Object objQ = sVar.Q();
        if (zF || objQ == l1.m.f39353a) {
            objQ = (j11 <= 0 || eVar == null) ? null : (uz.g1) eVar.invoke(str, Long.valueOf(j11));
            sVar.o0(objQ);
        }
        uz.g1 g1Var = (uz.g1) objQ;
        if (g1Var == null) {
            sVar.d0(-2092575898);
            sVar.p(false);
            return null;
        }
        sVar.d0(-760239109);
        l1.b1 b1VarO = l1.t.o(g1Var, sVar);
        sVar.p(false);
        return b1VarO;
    }

    public static final l1.b1 i(String str, long j11, fz.e eVar, l1.s sVar) {
        boolean zF = sVar.f(str) | sVar.e(j11) | sVar.f(eVar);
        Object objQ = sVar.Q();
        if (zF || objQ == l1.m.f39353a) {
            objQ = (j11 <= 0 || eVar == null) ? null : (uz.g1) eVar.invoke(str, Long.valueOf(j11));
            sVar.o0(objQ);
        }
        uz.g1 g1Var = (uz.g1) objQ;
        if (g1Var == null) {
            sVar.d0(1987040938);
            sVar.p(false);
            return null;
        }
        sVar.d0(341192759);
        l1.b1 b1VarO = l1.t.o(g1Var, sVar);
        sVar.p(false);
        return b1VarO;
    }

    public static final long j(WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType, l1.s sVar) {
        int i11 = f1.f57998b[wordSentenceCharacterSummaryType.getStatus().ordinal()];
        if (i11 == 1) {
            sVar.d0(2136844395);
            long jW = ob.f.w((h1.s1) sVar.j(h1.v1.f31180a), sVar);
            sVar.p(false);
            return jW;
        }
        if (i11 == 2) {
            sVar.d0(2136847049);
            long jY = ob.f.y((h1.s1) sVar.j(h1.v1.f31180a), sVar);
            sVar.p(false);
            return jY;
        }
        if (i11 != 3) {
            throw nv.p.x(sVar, 2136841833, false);
        }
        sVar.d0(2136850259);
        long jC = g2.x.c(((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, 0.65f);
        sVar.p(false);
        return jC;
    }

    public static final void k(l0.h courseTestFinishSummarySpeakingPractice, List items, boolean z11, String str, long j11, WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType, WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType2, fz.e eVar, fz.e eVar2, fz.e eVar3, fz.f fVar, fz.c cVar, fz.c cVar2) {
        kotlin.jvm.internal.m.f(courseTestFinishSummarySpeakingPractice, "$this$courseTestFinishSummarySpeakingPractice");
        kotlin.jvm.internal.m.f(items, "items");
        courseTestFinishSummarySpeakingPractice.q(items.size(), null, new qu.m(18, items), new t1.d(new l1(items, str, eVar, eVar2, eVar3, fVar, z11, j11, items, wordSentenceCharacterSummaryType, cVar, wordSentenceCharacterSummaryType2, cVar2), true, 2039820996));
    }

    public static final int l() {
        if (xt.d.u(((fr.o0) xt.b.c()).f27733a.keyLanguage)) {
            return 18;
        }
        return xt.d.z(((fr.o0) xt.b.c()).f27733a.keyLanguage) ? 22 : 20;
    }

    public static final void m(l0.h hVar, List list, boolean z11, String str, long j11, fz.e eVar, fz.e eVar2, fz.e eVar3, fz.f fVar, fz.c cVar) {
        hVar.q(list.size(), null, new qu.m(19, list), new t1.d(new o1(list, str, eVar, eVar2, eVar3, fVar, z11, j11, list, cVar), true, 2039820996));
    }
}
