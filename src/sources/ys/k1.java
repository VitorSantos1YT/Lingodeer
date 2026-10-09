package ys;

import bt.s5;
import com.lingodeer.data.env.Env;
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
public final class k1 implements fz.f {
    public final /* synthetic */ long H;
    public final /* synthetic */ l1.b3 K;
    public final /* synthetic */ WordSentenceCharacterSummaryType L;
    public final /* synthetic */ l1.b1 M;
    public final /* synthetic */ fz.f N;
    public final /* synthetic */ boolean O;
    public final /* synthetic */ List P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ boolean R;
    public final /* synthetic */ WordSentenceCharacterSummaryType S;
    public final /* synthetic */ fz.c T;
    public final /* synthetic */ WordSentenceCharacterSummaryType U;
    public final /* synthetic */ float V;
    public final /* synthetic */ fz.c W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f58105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f58107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f58108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f58109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.e f58110f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f58111t;

    public k1(long j11, int i11, List list, boolean z11, boolean z12, fz.e eVar, String str, long j12, l1.b1 b1Var, WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType, l1.b1 b1Var2, fz.f fVar, boolean z13, List list2, String str2, boolean z14, WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType2, fz.c cVar, WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType3, float f5, fz.c cVar2) {
        this.f58105a = j11;
        this.f58106b = i11;
        this.f58107c = list;
        this.f58108d = z11;
        this.f58109e = z12;
        this.f58110f = eVar;
        this.f58111t = str;
        this.H = j12;
        this.K = b1Var;
        this.L = wordSentenceCharacterSummaryType;
        this.M = b1Var2;
        this.N = fVar;
        this.O = z13;
        this.P = list2;
        this.Q = str2;
        this.R = z14;
        this.S = wordSentenceCharacterSummaryType2;
        this.T = cVar;
        this.U = wordSentenceCharacterSummaryType3;
        this.V = f5;
        this.W = cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v36 */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11;
        float f5;
        z1.r rVarE;
        boolean z11;
        ?? r13;
        l1.s sVar;
        boolean z12;
        l1.s sVar2;
        z1.j jVar;
        boolean z13;
        l1.s sVar3;
        boolean z14;
        l1.s sVar4;
        a0.k0 AnimatedVisibility = (a0.k0) obj;
        l1.n nVar = (l1.n) obj2;
        ((Number) obj3).intValue();
        z1.j jVar2 = z1.c.f58465c;
        kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
        List list = this.f58107c;
        int size = list.size() - 1;
        int i12 = this.f58106b;
        z0 z0Var = i12 == size ? z0.BottomItem : z0.MiddleItem;
        float f11 = p1.f58207a;
        k4 k4Var = new k4(z0Var, this.f58105a, 7);
        z1.o oVar = z1.o.f58481a;
        z1.r rVarF = d2.h.f(oVar, k4Var);
        z1.j jVar3 = z1.c.f58463a;
        w2.q0 q0VarD = j0.o.d(jVar3, false);
        l1.s sVar5 = (l1.s) nVar;
        int iHashCode = Long.hashCode(sVar5.T);
        l1.q1 q1VarL = sVar5.l();
        z1.r rVarC = z1.a.c(sVar5, rVarF);
        y2.k.J.getClass();
        y2.i iVar = y2.j.f56913b;
        sVar5.h0();
        if (sVar5.S) {
            sVar5.k(iVar);
        } else {
            sVar5.r0();
        }
        y2.h hVar = y2.j.f56917f;
        l1.t.J(hVar, q0VarD, sVar5);
        y2.h hVar2 = y2.j.f56916e;
        l1.t.J(hVar2, q1VarL, sVar5);
        y2.h hVar3 = y2.j.f56918g;
        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
            defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
        }
        y2.h hVar4 = y2.j.f56915d;
        l1.t.J(hVar4, rVarC, sVar5);
        float f12 = 12;
        z1.r rVarE2 = j0.c.E(j0.c.C(j0.e2.e(oVar, 1.0f), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 5, 5);
        w2.q0 q0VarD2 = j0.o.d(jVar3, false);
        int iHashCode2 = Long.hashCode(sVar5.T);
        l1.q1 q1VarL2 = sVar5.l();
        z1.r rVarC2 = z1.a.c(sVar5, rVarE2);
        sVar5.h0();
        if (sVar5.S) {
            sVar5.k(iVar);
        } else {
            sVar5.r0();
        }
        l1.t.J(hVar, q0VarD2, sVar5);
        l1.t.J(hVar2, q1VarL2, sVar5);
        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode2))) {
            defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
        }
        l1.t.J(hVar4, rVarC2, sVar5);
        z1.r rVarE3 = j0.e2.e(oVar, 1.0f);
        z1.h hVar5 = z1.c.P;
        j0.d dVar = j0.i.f35305c;
        j0.u uVarA = j0.t.a(dVar, hVar5, sVar5, 48);
        int iHashCode3 = Long.hashCode(sVar5.T);
        l1.q1 q1VarL3 = sVar5.l();
        z1.r rVarC3 = z1.a.c(sVar5, rVarE3);
        sVar5.h0();
        if (sVar5.S) {
            sVar5.k(iVar);
        } else {
            sVar5.r0();
        }
        l1.t.J(hVar, uVarA, sVar5);
        l1.t.J(hVar2, q1VarL3, sVar5);
        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar3);
        }
        l1.t.J(hVar4, rVarC3, sVar5);
        z1.r rVarE4 = j0.e2.e(oVar, 1.0f);
        j0.u uVarA2 = j0.t.a(dVar, hVar5, sVar5, 48);
        int iHashCode4 = Long.hashCode(sVar5.T);
        l1.q1 q1VarL4 = sVar5.l();
        z1.r rVarC4 = z1.a.c(sVar5, rVarE4);
        sVar5.h0();
        if (sVar5.S) {
            sVar5.k(iVar);
        } else {
            sVar5.r0();
        }
        l1.t.J(hVar, uVarA2, sVar5);
        l1.t.J(hVar2, q1VarL4, sVar5);
        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar3);
        }
        l1.t.J(hVar4, rVarC4, sVar5);
        z1.r rVarE5 = j0.e2.e(oVar, 1.0f);
        boolean z15 = this.f58108d;
        boolean z16 = this.O;
        if (z15 || z16) {
            i11 = 0;
            f5 = p1.f58207a;
        } else {
            i11 = 0;
            f5 = 0;
        }
        z1.r rVarE6 = j0.c.E(rVarE5, f5, CropImageView.DEFAULT_ASPECT_RATIO, (z15 || z16) ? p1.f58207a : i11, CropImageView.DEFAULT_ASPECT_RATIO, 10);
        j0.u uVarA3 = j0.t.a(dVar, hVar5, sVar5, 48);
        int iHashCode5 = Long.hashCode(sVar5.T);
        l1.q1 q1VarL5 = sVar5.l();
        z1.r rVarC5 = z1.a.c(sVar5, rVarE6);
        sVar5.h0();
        if (sVar5.S) {
            sVar5.k(iVar);
        } else {
            sVar5.r0();
        }
        l1.t.J(hVar, uVarA3, sVar5);
        l1.t.J(hVar2, q1VarL5, sVar5);
        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode5))) {
            defpackage.e.A(iHashCode5, sVar5, iHashCode5, hVar3);
        }
        l1.t.J(hVar4, rVarC5, sVar5);
        j3.y0 y0VarB = ct.c.b(sVar5);
        long jA = fr.j3.A(p1.l());
        n3.s sVar6 = n3.s.H;
        WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType = this.L;
        d4.a(this.P, null, null, false, false, j3.y0.a(y0VarB, p1.j(wordSentenceCharacterSummaryType, sVar5), jA, sVar6, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar5, 3072, 0, 0, 4194262);
        l1.d0 d0Var = ua.f31167a;
        j3.y0 y0Var = (j3.y0) sVar5.j(d0Var);
        Env env = ((fr.o0) xt.b.c()).f27733a;
        long jA2 = fr.j3.A(14);
        l1.c3 c3Var = h1.v1.f31180a;
        float f13 = 4;
        ua.b(this.Q, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, ((h1.s1) sVar5.j(c3Var)).f31036s, jA2, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar5, 48, 0, 65532);
        sVar5.p(true);
        sVar5.p(true);
        z1.i iVar2 = z1.c.M;
        z1.r rVarE7 = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, f12, 5);
        j0.b bVar = j0.i.f35303a;
        j0.a2 a2VarA = j0.z1.a(bVar, iVar2, sVar5, 48);
        int iHashCode6 = Long.hashCode(sVar5.T);
        l1.q1 q1VarL6 = sVar5.l();
        z1.r rVarC6 = z1.a.c(sVar5, rVarE7);
        sVar5.h0();
        if (sVar5.S) {
            sVar5.k(iVar);
        } else {
            sVar5.r0();
        }
        l1.t.J(hVar, a2VarA, sVar5);
        l1.t.J(hVar2, q1VarL6, sVar5);
        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode6))) {
            defpackage.e.A(iHashCode6, sVar5, iHashCode6, hVar3);
        }
        l1.t.J(hVar4, rVarC6, sVar5);
        boolean z17 = this.R;
        j0.f fVar = z17 ? j0.i.f35304b : j0.i.f35307e;
        if (z17) {
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            rVarE = new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
        } else {
            rVarE = j0.e2.e(oVar, 1.0f);
        }
        j0.a2 a2VarA2 = j0.z1.a(fVar, z1.c.L, sVar5, 0);
        int iHashCode7 = Long.hashCode(sVar5.T);
        l1.q1 q1VarL7 = sVar5.l();
        z1.r rVarC7 = z1.a.c(sVar5, rVarE);
        sVar5.h0();
        if (sVar5.S) {
            sVar5.k(iVar);
        } else {
            sVar5.r0();
        }
        l1.t.J(hVar, a2VarA2, sVar5);
        l1.t.J(hVar2, q1VarL7, sVar5);
        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode7))) {
            defpackage.e.A(iHashCode7, sVar5, iHashCode7, hVar3);
        }
        l1.t.J(hVar4, rVarC7, sVar5);
        boolean zA = kotlin.jvm.internal.m.a(this.S, wordSentenceCharacterSummaryType);
        float f14 = 24;
        z1.r rVarN = j0.e2.n(oVar, f14);
        long j11 = ((h1.s1) sVar5.j(c3Var)).f31017a;
        fz.c cVar = this.T;
        boolean zF = sVar5.f(cVar) | sVar5.h(wordSentenceCharacterSummaryType);
        Object objQ = sVar5.Q();
        Object obj4 = l1.m.f39353a;
        if (zF || objQ == obj4) {
            objQ = new g1(cVar, wordSentenceCharacterSummaryType, 0);
            sVar5.o0(objQ);
        }
        dt.a0.a(zA, rVarN, j11, (fz.a) objQ, sVar5, 48, 0);
        l1.s sVar7 = sVar5;
        sVar7.p(true);
        if (z17) {
            sVar7.d0(2096790179);
            j0.c.g(sVar7, j0.e2.s(oVar, f12));
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var = new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            j0.a2 a2VarA3 = j0.z1.a(bVar, iVar2, sVar7, 54);
            int iHashCode8 = Long.hashCode(sVar7.T);
            l1.q1 q1VarL8 = sVar7.l();
            z1.r rVarC8 = z1.a.c(sVar7, i1Var);
            sVar7.h0();
            if (sVar7.S) {
                sVar7.k(iVar);
            } else {
                sVar7.r0();
            }
            l1.t.J(hVar, a2VarA3, sVar7);
            l1.t.J(hVar2, q1VarL8, sVar7);
            if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode8))) {
                defpackage.e.A(iHashCode8, sVar7, iHashCode8, hVar3);
            }
            l1.t.J(hVar4, rVarC8, sVar7);
            boolean zA2 = kotlin.jvm.internal.m.a(this.U, wordSentenceCharacterSummaryType);
            z1.r rVarN2 = j0.e2.n(oVar, f14);
            float f15 = this.V;
            double d5 = f15;
            long jI = s5.i(d5);
            fz.c cVar2 = this.W;
            boolean zF2 = sVar7.f(cVar2) | sVar7.h(wordSentenceCharacterSummaryType);
            Object objQ2 = sVar7.Q();
            if (zF2 || objQ2 == obj4) {
                objQ2 = new g1(cVar2, wordSentenceCharacterSummaryType, 1);
                sVar7.o0(objQ2);
            }
            dt.a0.c(48, jI, (fz.a) objQ2, sVar7, rVarN2, zA2);
            ua.b(String.valueOf((int) f15), j0.c.E(oVar, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar7.j(d0Var), s5.i(d5), fr.j3.A(13), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar7, 48, 0, 65532);
            l1.s sVar8 = sVar7;
            r13 = 1;
            sVar8.p(true);
            z11 = false;
            sVar = sVar8;
        } else {
            z11 = false;
            r13 = 1;
            sVar7.d0(2062061220);
            sVar = sVar7;
        }
        sVar.p(z11);
        sVar.p(r13);
        if (i12 < list.size() - r13) {
            sVar.d0(-724155819);
            l1.s sVar9 = sVar;
            k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar9, 0, 7);
            sVar2 = sVar9;
            z12 = false;
        } else {
            z12 = false;
            sVar.d0(-760381024);
            sVar2 = sVar;
        }
        sVar2.p(z12);
        sVar2.p(true);
        String str = this.f58111t;
        long j12 = this.H;
        j0.r rVar = j0.r.f35391a;
        if (z15) {
            sVar2.d0(-1694143219);
            jVar = jVar2;
            z1.r rVarA = rVar.a(oVar, jVar);
            fz.e eVar = this.f58110f;
            boolean zF3 = sVar2.f(eVar) | sVar2.f(str) | sVar2.e(j12);
            Object objQ3 = sVar2.Q();
            if (zF3 || objQ3 == obj4) {
                Object h1Var = new h1(eVar, str, j12, 0);
                sVar2.o0(h1Var);
                objQ3 = h1Var;
            }
            z13 = false;
            p1.e(0, (fz.a) objQ3, sVar2, rVarA, this.f58109e);
        } else {
            jVar = jVar2;
            z13 = false;
            sVar2.d0(-1730512822);
        }
        sVar2.p(z13);
        l1.b3 b3Var = null;
        l1.b3 b3Var2 = this.K;
        if (b3Var2 != null && z16) {
            b3Var = b3Var2;
        }
        l1.b1 b1Var = this.M;
        if (b3Var == null) {
            sVar2.d0(-1693696696);
            sVar3 = sVar2;
        } else {
            sVar2.d0(-1693696695);
            boolean z18 = !oz.q.K0(((dc) b3Var.getValue()).f49636b);
            boolean zF4 = sVar2.f(b1Var);
            Object objQ4 = sVar2.Q();
            if (zF4 || objQ4 == obj4) {
                objQ4 = new us.o(6, b1Var);
                sVar2.o0(objQ4);
            }
            l1.s sVar10 = sVar2;
            kt.l.a(0, 0L, (fz.a) objQ4, sVar10, j0.e2.n(j0.c.E(rVar.a(oVar, jVar), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, z15 ? 36 : 0, CropImageView.DEFAULT_ASPECT_RATIO, 11), 32), z18);
            sVar3 = sVar10;
        }
        sVar3.p(false);
        if (!((Boolean) b1Var.getValue()).booleanValue() || b3Var2 == null) {
            z14 = false;
            sVar3.d0(-1730512822);
            sVar4 = sVar3;
        } else {
            sVar3.d0(-1693076757);
            WordSentenceCharacterType wordSentenceCharacterTypeA = kt.b.a(wordSentenceCharacterSummaryType);
            String str2 = ((dc) b3Var2.getValue()).f49636b;
            boolean zF5 = sVar3.f(b1Var);
            Object objQ5 = sVar3.Q();
            if (zF5 || objQ5 == obj4) {
                objQ5 = new us.o(7, b1Var);
                sVar3.o0(objQ5);
            }
            fz.a aVar = (fz.a) objQ5;
            fz.f fVar2 = this.N;
            boolean zF6 = sVar3.f(fVar2) | sVar3.f(str) | sVar3.e(j12);
            Object objQ6 = sVar3.Q();
            if (zF6 || objQ6 == obj4) {
                Object i1Var2 = new i1(fVar2, str, j12, 0);
                sVar3.o0(i1Var2);
                objQ6 = i1Var2;
            }
            fz.c cVar3 = (fz.c) objQ6;
            boolean zF7 = sVar3.f(fVar2) | sVar3.f(str) | sVar3.e(j12);
            Object objQ7 = sVar3.Q();
            if (zF7 || objQ7 == obj4) {
                Object j1Var = new j1(fVar2, str, j12, 0);
                sVar3.o0(j1Var);
                objQ7 = j1Var;
            }
            l1.s sVar11 = sVar3;
            kt.l.c(wordSentenceCharacterTypeA, str2, aVar, cVar3, null, 0, (fz.a) objQ7, sVar11, 0, 48);
            sVar4 = sVar11;
            z14 = false;
        }
        sVar4.p(z14);
        sVar4.p(true);
        sVar4.p(true);
        return qy.b0.f48488a;
    }
}
