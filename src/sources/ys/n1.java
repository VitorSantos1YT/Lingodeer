package ys;

import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.WordSentenceSourceKt;
import com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.yalantis.ucrop.view.CropImageView;
import dt.d4;
import h1.k7;
import h1.ua;
import java.util.List;
import mt.k4;
import rt.dc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n1 implements fz.f {
    public final /* synthetic */ fz.e H;
    public final /* synthetic */ String K;
    public final /* synthetic */ long L;
    public final /* synthetic */ l1.b3 M;
    public final /* synthetic */ l1.b1 N;
    public final /* synthetic */ fz.f O;
    public final /* synthetic */ boolean P;
    public final /* synthetic */ long Q;
    public final /* synthetic */ String R;
    public final /* synthetic */ String S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f58170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f58172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WordSentenceCharacterSummaryType f58173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f58174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f58175f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f58176t;

    public n1(long j11, int i11, List list, WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType, fz.c cVar, boolean z11, boolean z12, fz.e eVar, String str, long j12, l1.b1 b1Var, l1.b1 b1Var2, fz.f fVar, boolean z13, long j13, String str2, String str3) {
        this.f58170a = j11;
        this.f58171b = i11;
        this.f58172c = list;
        this.f58173d = wordSentenceCharacterSummaryType;
        this.f58174e = cVar;
        this.f58175f = z11;
        this.f58176t = z12;
        this.H = eVar;
        this.K = str;
        this.L = j12;
        this.M = b1Var;
        this.N = b1Var2;
        this.O = fVar;
        this.P = z13;
        this.Q = j13;
        this.R = str2;
        this.S = str3;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11;
        float f5;
        l1.s sVar;
        l1.g gVar;
        l1.b3 b3Var;
        boolean z11;
        long j11;
        boolean z12;
        boolean z13;
        String str;
        Object h1Var;
        a0.k0 AnimatedVisibility = (a0.k0) obj;
        l1.n nVar = (l1.n) obj2;
        ((Number) obj3).intValue();
        z1.j jVar = z1.c.f58465c;
        kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
        List list = this.f58172c;
        int size = list.size() - 1;
        int i12 = this.f58171b;
        z0 z0Var = i12 == size ? z0.BottomItem : z0.MiddleItem;
        float f11 = p1.f58207a;
        k4 k4Var = new k4(z0Var, this.f58170a, 7);
        z1.o oVar = z1.o.f58481a;
        z1.r rVarF = d2.h.f(oVar, k4Var);
        l1.s sVar2 = (l1.s) nVar;
        WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType = this.f58173d;
        boolean zH = sVar2.h(wordSentenceCharacterSummaryType);
        fz.c cVar = this.f58174e;
        boolean zF = zH | sVar2.f(cVar);
        Object objQ = sVar2.Q();
        l1.g gVar2 = l1.m.f39353a;
        if (zF || objQ == gVar2) {
            objQ = new m1(wordSentenceCharacterSummaryType, cVar);
            sVar2.o0(objQ);
        }
        z1.r rVarC = j0.c.C(j0.e2.e(d0.n.o(rVarF, false, null, (fz.a) objQ, 15), 1.0f), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
        int iHashCode = Long.hashCode(sVar2.T);
        l1.q1 q1VarL = sVar2.l();
        z1.r rVarC2 = z1.a.c(sVar2, rVarC);
        y2.k.J.getClass();
        y2.i iVar = y2.j.f56913b;
        sVar2.h0();
        if (sVar2.S) {
            sVar2.k(iVar);
        } else {
            sVar2.r0();
        }
        y2.h hVar = y2.j.f56917f;
        l1.t.J(hVar, q0VarD, sVar2);
        y2.h hVar2 = y2.j.f56916e;
        l1.t.J(hVar2, q1VarL, sVar2);
        y2.h hVar3 = y2.j.f56918g;
        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
        }
        y2.h hVar4 = y2.j.f56915d;
        l1.t.J(hVar4, rVarC2, sVar2);
        z1.r rVarE = j0.e2.e(oVar, 1.0f);
        z1.h hVar5 = z1.c.P;
        j0.d dVar = j0.i.f35305c;
        j0.u uVarA = j0.t.a(dVar, hVar5, sVar2, 48);
        int iHashCode2 = Long.hashCode(sVar2.T);
        l1.q1 q1VarL2 = sVar2.l();
        z1.r rVarC3 = z1.a.c(sVar2, rVarE);
        sVar2.h0();
        if (sVar2.S) {
            sVar2.k(iVar);
        } else {
            sVar2.r0();
        }
        l1.t.J(hVar, uVarA, sVar2);
        l1.t.J(hVar2, q1VarL2, sVar2);
        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
            defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
        }
        l1.t.J(hVar4, rVarC3, sVar2);
        z1.r rVarE2 = j0.e2.e(oVar, 1.0f);
        float f12 = 16;
        boolean z14 = this.f58175f;
        boolean z15 = this.P;
        if (z14 || z15) {
            i11 = 0;
            f5 = p1.f58207a;
        } else {
            i11 = 0;
            f5 = 0;
        }
        z1.r rVarE3 = j0.c.E(rVarE2, f5, f12, (z14 || z15) ? p1.f58207a : i11, CropImageView.DEFAULT_ASPECT_RATIO, 8);
        j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar2, 48);
        int iHashCode3 = Long.hashCode(sVar2.T);
        l1.q1 q1VarL3 = sVar2.l();
        z1.r rVarC4 = z1.a.c(sVar2, rVarE3);
        sVar2.h0();
        if (sVar2.S) {
            sVar2.k(iVar);
        } else {
            sVar2.r0();
        }
        l1.t.J(hVar, uVarA2, sVar2);
        l1.t.J(hVar2, q1VarL3, sVar2);
        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
            defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
        }
        l1.t.J(hVar4, rVarC4, sVar2);
        boolean z16 = wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.SentenceType;
        long j12 = this.Q;
        if (z16) {
            sVar2.d0(-1634319182);
            List<CourseWord> displayCourseWords = ((WordSentenceCharacterSummaryType.SentenceType) wordSentenceCharacterSummaryType).getSentence().getDisplayCourseWords();
            j3.y0 y0VarA = j3.y0.a(ct.c.b(sVar2), j12, fr.j3.A(p1.l()), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744440);
            gVar = gVar2;
            b3Var = null;
            d4.a(displayCourseWords, null, null, false, false, y0VarA, null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar2, 3072, 0, 0, 4194262);
            sVar = sVar2;
            sVar.p(false);
        } else {
            sVar = sVar2;
            gVar = gVar2;
            b3Var = null;
            if (wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.WordType) {
                sVar.d0(-1633682783);
                d4.a(ns.o.K(((WordSentenceCharacterSummaryType.WordType) wordSentenceCharacterSummaryType).getWord()), null, null, false, false, j3.y0.a(ct.c.b(sVar), j12, fr.j3.A(p1.l()), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar, 3072, 0, 0, 4194262);
                sVar.p(false);
            } else {
                if (!(wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.CharacterType)) {
                    throw nv.p.x(sVar, 1748393733, false);
                }
                sVar.d0(-1633055281);
                d4.a(ns.o.K(WordSentenceSourceKt.toWordItem(((WordSentenceCharacterSummaryType.CharacterType) wordSentenceCharacterSummaryType).getCharacter())), null, null, false, false, j3.y0.a(ct.c.b(sVar), j12, fr.j3.A(p1.l()), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar, 3072, 0, 0, 4194262);
                sVar.p(false);
            }
        }
        String str2 = this.R;
        if (str2.length() > 0) {
            sVar.d0(-1632416774);
            j0.c.g(sVar, j0.e2.g(oVar, 4));
            j3.y0 y0Var = (j3.y0) sVar.j(ua.f31167a);
            Env env = ((fr.o0) xt.b.c()).f27733a;
            ua.b(str2, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f12, 7), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, j12, fr.j3.A(14), n3.s.f43178t, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, 48, 0, 65532);
            sVar.p(false);
        } else {
            String str3 = this.S;
            if (str3.length() > 0) {
                sVar.d0(-1631784467);
                j0.c.g(sVar, j0.e2.g(oVar, 4));
                ua.b("[" + str3 + "]", j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f12, 7), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), j12, fr.j3.A(p1.l()), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, 48, 0, 65532);
                sVar.p(false);
            } else {
                sVar.d0(-1631197947);
                j0.c.g(sVar, j0.e2.g(oVar, f12));
                sVar.p(false);
            }
        }
        sVar.p(true);
        if (i12 < list.size() - 1) {
            sVar.d0(208404857);
            k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 0, 7);
            z11 = false;
        } else {
            z11 = false;
            sVar.d0(162001980);
        }
        sVar.p(z11);
        sVar.p(true);
        String str4 = this.K;
        long j13 = this.L;
        j0.r rVar = j0.r.f35391a;
        if (z14) {
            sVar.d0(-988464555);
            z1.r rVarA = rVar.a(oVar, jVar);
            fz.e eVar = this.H;
            boolean zF2 = sVar.f(eVar) | sVar.f(str4) | sVar.e(j13);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                j11 = j13;
                h1Var = new h1(eVar, str4, j11, 1);
                sVar.o0(h1Var);
            } else {
                h1Var = objQ2;
                j11 = j13;
            }
            z12 = false;
            p1.e(0, (fz.a) h1Var, sVar, rVarA, this.f58176t);
        } else {
            j11 = j13;
            str4 = str4;
            z12 = false;
            sVar.d0(-1034996206);
        }
        sVar.p(z12);
        l1.b3 b3Var2 = this.M;
        l1.b3 b3Var3 = (b3Var2 == null || !z15) ? b3Var : b3Var2;
        l1.b1 b1Var = this.N;
        if (b3Var3 == null) {
            sVar.d0(-988054116);
            sVar.p(false);
        } else {
            sVar.d0(-988054115);
            boolean z17 = !oz.q.K0(((dc) b3Var3.getValue()).f49636b);
            boolean zF3 = sVar.f(b1Var);
            Object objQ3 = sVar.Q();
            if (zF3 || objQ3 == gVar) {
                objQ3 = new us.o(8, b1Var);
                sVar.o0(objQ3);
            }
            kt.l.a(0, 0L, (fz.a) objQ3, sVar, j0.e2.n(j0.c.E(rVar.a(oVar, jVar), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, z14 ? 36 : 0, CropImageView.DEFAULT_ASPECT_RATIO, 11), 32), z17);
            sVar.p(false);
        }
        if (!((Boolean) b1Var.getValue()).booleanValue() || b3Var2 == null) {
            z13 = false;
            sVar.d0(-1034996206);
        } else {
            sVar.d0(-987482816);
            WordSentenceCharacterType wordSentenceCharacterTypeA = kt.b.a(wordSentenceCharacterSummaryType);
            String str5 = ((dc) b3Var2.getValue()).f49636b;
            boolean zF4 = sVar.f(b1Var);
            Object objQ4 = sVar.Q();
            if (zF4 || objQ4 == gVar) {
                objQ4 = new us.o(9, b1Var);
                sVar.o0(objQ4);
            }
            fz.a aVar = (fz.a) objQ4;
            fz.f fVar = this.O;
            boolean zF5 = sVar.f(fVar) | sVar.f(str4) | sVar.e(j11);
            Object objQ5 = sVar.Q();
            if (zF5 || objQ5 == gVar) {
                str = str4;
                i1 i1Var = new i1(fVar, str, j11, 1);
                sVar.o0(i1Var);
                objQ5 = i1Var;
            } else {
                str = str4;
            }
            fz.c cVar2 = (fz.c) objQ5;
            boolean zF6 = sVar.f(fVar) | sVar.f(str) | sVar.e(j11);
            Object objQ6 = sVar.Q();
            if (zF6 || objQ6 == gVar) {
                j1 j1Var = new j1(fVar, str, j11, 1);
                sVar.o0(j1Var);
                objQ6 = j1Var;
            }
            kt.l.c(wordSentenceCharacterTypeA, str5, aVar, cVar2, null, 0, (fz.a) objQ6, sVar, 0, 48);
            z13 = false;
        }
        sVar.p(z13);
        sVar.p(true);
        return qy.b0.f48488a;
    }
}
