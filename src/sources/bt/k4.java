package bt;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k4 implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5615a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f5619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5620f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5621t;

    public /* synthetic */ k4(l1.b1 b1Var, z1.r rVar, List list, boolean z11, x1.s sVar, boolean z12, boolean z13, l1.b1 b1Var2, fz.c cVar) {
        this.f5620f = b1Var;
        this.H = rVar;
        this.K = list;
        this.f5616b = z11;
        this.L = sVar;
        this.f5617c = z12;
        this.f5618d = z13;
        this.f5621t = b1Var2;
        this.f5619e = cVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5615a) {
            case 0:
                l1.b1 b1Var = (l1.b1) this.f5620f;
                z1.r rVar = (z1.r) this.H;
                final List list = (List) this.K;
                final x1.s sVar = (x1.s) this.L;
                final l1.b1 b1Var2 = (l1.b1) this.f5621t;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z1.r rVarC = j0.c.C(j0.e2.e(rVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 16, 1);
                    final boolean z11 = this.f5616b;
                    final boolean z12 = this.f5617c;
                    final boolean z13 = this.f5618d;
                    final fz.c cVar = this.f5619e;
                    dt.a0.d(b1Var, rVarC, null, null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, t1.e.d(-645906344, new fz.e() { // from class: bt.o4
                        @Override // fz.e
                        public final Object invoke(Object obj3, Object obj4) {
                            l1.g gVar;
                            l1.b3 b3VarA;
                            l1.b3 b3VarA2;
                            z1.r rVarN;
                            z1.r rVarA;
                            l1.n nVar2 = (l1.n) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i11 = 1;
                            boolean z14 = false;
                            int i12 = 2;
                            l1.s sVar3 = (l1.s) nVar2;
                            boolean zT = sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                            qy.b0 b0Var = qy.b0.f48488a;
                            if (!zT) {
                                sVar3.W();
                                return b0Var;
                            }
                            j3.y0 y0Var = (j3.y0) sVar3.j(ua.f31167a);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                CourseWord courseWord = (CourseWord) it.next();
                                Object objQ = sVar3.Q();
                                float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                                l1.g gVar2 = l1.m.f39353a;
                                if (objQ == gVar2) {
                                    objQ = hh.p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar3);
                                }
                                l1.g1 g1Var = (l1.g1) objQ;
                                Object objQ2 = sVar3.Q();
                                if (objQ2 == gVar2) {
                                    objQ2 = hh.p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar3);
                                }
                                l1.g1 g1Var2 = (l1.g1) objQ2;
                                Object objQ3 = sVar3.Q();
                                if (objQ3 == gVar2) {
                                    objQ3 = l1.t.B(null);
                                    sVar3.o0(objQ3);
                                }
                                l1.b1 b1Var3 = (l1.b1) objQ3;
                                OptionItemSelectedState selectedState = courseWord.getSelectedState();
                                OptionItemSelectedState optionItemSelectedState = OptionItemSelectedState.DEFAULT;
                                if (selectedState != optionItemSelectedState) {
                                    sVar3.d0(-741914130);
                                    int i13 = d5.f5317a[courseWord.getSelectedState().ordinal()];
                                    if (i13 == i11) {
                                        gVar = gVar2;
                                        sVar3.d0(-741827113);
                                        b3VarA = a0.t1.a(ob.f.x((h1.s1) sVar3.j(h1.v1.f31180a), sVar3), null, BuildConfig.VERSION_NAME, sVar3, 384, 10);
                                        sVar3.p(z14);
                                    } else if (i13 != i12) {
                                        sVar3.d0(-741256124);
                                        gVar = gVar2;
                                        b3VarA = a0.t1.a(((h1.s1) sVar3.j(h1.v1.f31180a)).A, null, BuildConfig.VERSION_NAME, sVar3, 384, 10);
                                        sVar3.p(z14);
                                    } else {
                                        gVar = gVar2;
                                        sVar3.d0(-741527591);
                                        b3VarA = a0.t1.a(ob.f.z((h1.s1) sVar3.j(h1.v1.f31180a), sVar3), null, BuildConfig.VERSION_NAME, sVar3, 384, 10);
                                        sVar3.p(z14);
                                    }
                                    sVar3.p(z14);
                                } else {
                                    optionItemSelectedState = optionItemSelectedState;
                                    f5 = 0.0f;
                                    gVar = gVar2;
                                    sVar3.d0(-741015068);
                                    b3VarA = a0.t1.a(((h1.s1) sVar3.j(h1.v1.f31180a)).f31033p, null, BuildConfig.VERSION_NAME, sVar3, 384, 10);
                                    sVar3.p(z14);
                                }
                                l1.b3 b3Var = b3VarA;
                                if (courseWord.getSelectedState() != optionItemSelectedState) {
                                    sVar3.d0(-740733526);
                                    int i14 = d5.f5317a[courseWord.getSelectedState().ordinal()];
                                    if (i14 == i11) {
                                        sVar3.d0(-740646571);
                                        b3VarA2 = a0.t1.a(ob.f.t((h1.s1) sVar3.j(h1.v1.f31180a), sVar3), null, BuildConfig.VERSION_NAME, sVar3, 384, 10);
                                        sVar3.p(z14);
                                    } else if (i14 != i12) {
                                        sVar3.d0(-740071676);
                                        b3VarA2 = a0.t1.a(((h1.s1) sVar3.j(h1.v1.f31180a)).A, null, BuildConfig.VERSION_NAME, sVar3, 384, 10);
                                        sVar3.p(z14);
                                    } else {
                                        sVar3.d0(-740345065);
                                        b3VarA2 = a0.t1.a(ob.f.u((h1.s1) sVar3.j(h1.v1.f31180a), sVar3), null, BuildConfig.VERSION_NAME, sVar3, 384, 10);
                                        sVar3.p(z14);
                                    }
                                    sVar3.p(z14);
                                } else {
                                    sVar3.d0(-739830558);
                                    b3VarA2 = a0.t1.a(((h1.s1) sVar3.j(h1.v1.f31180a)).f31034q, null, BuildConfig.VERSION_NAME, sVar3, 384, 10);
                                    sVar3.p(z14);
                                }
                                z1.r rVarN2 = z1.o.f58481a;
                                if (z11) {
                                    sVar3.d0(-739593067);
                                    x1.s sVar4 = sVar;
                                    boolean zF = sVar3.f(sVar4) | sVar3.h(courseWord);
                                    Object objQ4 = sVar3.Q();
                                    if (zF || objQ4 == gVar) {
                                        objQ4 = new au.d1(18, sVar4, courseWord);
                                        sVar3.o0(objQ4);
                                    }
                                    rVarN = w2.a0.n(rVarN2, (fz.c) objQ4);
                                    sVar3.p(z14);
                                } else {
                                    sVar3.d0(-739227174);
                                    sVar3.p(z14);
                                    rVarN = rVarN2;
                                }
                                l1.c3 c3Var = h1.v1.f31180a;
                                float f11 = 10;
                                z1.r rVarI = d0.n.h(rVarN2, ((h1.s1) sVar3.j(c3Var)).A, r0.f.d(f11)).i(rVarN);
                                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, z14);
                                int iHashCode = Long.hashCode(sVar3.T);
                                l1.q1 q1VarL = sVar3.l();
                                z1.r rVarC2 = z1.a.c(sVar3, rVarI);
                                y2.k.J.getClass();
                                y2.i iVar = y2.j.f56913b;
                                sVar3.h0();
                                Iterator it2 = it;
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
                                l1.t.J(y2.j.f56915d, rVarC2, sVar3);
                                OptionItemSelectedState selectedState2 = courseWord.getSelectedState();
                                boolean z15 = z12;
                                boolean z16 = z13;
                                if (selectedState2 == optionItemSelectedState && z15 && z16) {
                                    sVar3.d0(1023136431);
                                    l1.b1 b1Var4 = b1Var2;
                                    boolean zF2 = sVar3.f(b1Var4) | sVar3.h(courseWord);
                                    Object objQ5 = sVar3.Q();
                                    if (zF2 || objQ5 == gVar) {
                                        objQ5 = new t4(b1Var4, courseWord, g1Var, g1Var2, b1Var3);
                                        sVar3.o0(objQ5);
                                    }
                                    rVarA = s2.g0.a(rVarN2, b0Var, (PointerInputEventHandler) objQ5);
                                    sVar3.p(false);
                                } else {
                                    g1Var = g1Var;
                                    g1Var2 = g1Var2;
                                    b1Var3 = b1Var3;
                                    sVar3.d0(1024869362);
                                    sVar3.p(false);
                                    rVarA = rVarN2;
                                }
                                if (z16) {
                                    sVar3.d0(1024996834);
                                    Object objQ6 = sVar3.Q();
                                    if (objQ6 == gVar) {
                                        objQ6 = new bp.h0(6, b1Var3);
                                        sVar3.o0(objQ6);
                                    }
                                    rVarN2 = w2.a0.n(rVarN2, (fz.c) objQ6);
                                    sVar3.p(false);
                                } else {
                                    f11 = f11;
                                    sVar3.d0(1025142906);
                                    sVar3.p(false);
                                }
                                boolean zC = sVar3.c(g1Var.l()) | sVar3.d(courseWord.getSelectedState().ordinal()) | sVar3.g(z16);
                                Object objQ7 = sVar3.Q();
                                if (zC || objQ7 == gVar) {
                                    objQ7 = Float.valueOf(((!z16 || (g1Var.l() == f5 && courseWord.getSelectedState() == optionItemSelectedState)) && courseWord.getSelectedState() != OptionItemSelectedState.SELECTED) ? 1.0f : f5);
                                    sVar3.o0(objQ7);
                                }
                                float fFloatValue = ((Number) objQ7).floatValue();
                                r0.e eVarD = r0.f.d(f11);
                                h1.t0 t0VarP = h1.k7.p(((g2.x) b3Var.getValue()).f28624a, sVar3, 0);
                                l1.g1 g1Var3 = g1Var2;
                                d0.v vVarA = d0.n.a(((h1.s1) sVar3.j(c3Var)).A, 2);
                                z1.r rVarI2 = rVarA.i(rVarN2);
                                Object objQ8 = sVar3.Q();
                                if (objQ8 == gVar) {
                                    objQ8 = new v0(g1Var, g1Var3, 1);
                                    sVar3.o0(objQ8);
                                }
                                z1.r rVarA2 = d2.h.a(g2.f0.q(rVarI2, (fz.c) objQ8), fFloatValue);
                                t1.d dVarD = t1.e.d(1109161534, new w0(z15, courseWord, cVar, y0Var, b3VarA2), sVar3);
                                l1.s sVar5 = sVar3;
                                h1.k7.d(rVarA2, eVarD, t0VarP, null, vVarA, dVarD, sVar5, 196608, 8);
                                sVar3 = sVar5;
                                sVar3.p(true);
                                i11 = 1;
                                b0Var = b0Var;
                                z14 = false;
                                it = it2;
                                i12 = 2;
                            }
                            return b0Var;
                        }
                    }, sVar2), sVar2, 1572864, 60);
                } else {
                    sVar2.W();
                }
                break;
            default:
                final CourseWord courseWord = (CourseWord) this.f5620f;
                final ht.o oVar = (ht.o) this.f5621t;
                final CourseWord courseWord2 = (CourseWord) this.H;
                final ht.l lVar = (ht.l) this.K;
                final fz.c cVar2 = (fz.c) this.L;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar2;
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z1.r rVarD = j0.e2.d(z1.o.f58481a, 1.0f);
                    final boolean z14 = this.f5616b;
                    final boolean z15 = this.f5617c;
                    final boolean z16 = this.f5618d;
                    final fz.c cVar3 = this.f5619e;
                    j0.c.a(rVarD, null, t1.e.d(-275922274, new fz.f() { // from class: bt.j6
                        @Override // fz.f
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            long j11;
                            j0.s BoxWithConstraints = (j0.s) obj3;
                            l1.n nVar3 = (l1.n) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            z1.j jVar = z1.c.f58467e;
                            kotlin.jvm.internal.m.f(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= ((l1.s) nVar3).f(BoxWithConstraints) ? 4 : 2;
                            }
                            l1.s sVar4 = (l1.s) nVar3;
                            if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                float fMin = Math.min(BoxWithConstraints.c(), BoxWithConstraints.b());
                                float f5 = 0.5f * fMin;
                                float f11 = 24;
                                float f12 = fMin - f11;
                                float f13 = 2;
                                float f14 = f12 / f13;
                                float f15 = (-f12) / f13;
                                boolean z17 = z14;
                                l1.b3 b3VarB = b0.h.b(z17 ? 1.0f : 0.0f, b0.e.r(400, 0, null, 6), "textAlpha", sVar4, 3120, 20);
                                l1.b3 b3VarA = b0.h.a(z17 ? f11 : f5, b0.e.r(400, 0, null, 6), "audioSize", sVar4, 432, 8);
                                l1.b3 b3VarA2 = b0.h.a(z17 ? f14 - 8 : 0, b0.e.r(400, 0, null, 6), "audioOffsetX", sVar4, 432, 8);
                                l1.b3 b3VarA3 = b0.h.a(z17 ? f15 + 8 : 0, b0.e.r(400, 0, null, 6), "audioOffsetY", sVar4, 432, 8);
                                float fFloatValue = ((Number) b3VarB.getValue()).floatValue();
                                z1.o oVar2 = z1.o.f58481a;
                                final CourseWord courseWord3 = courseWord;
                                if (fFloatValue > CropImageView.DEFAULT_ASPECT_RATIO) {
                                    sVar4.d0(568803439);
                                    z1.r rVarA = d2.h.a(j0.c.A(j0.e2.d(oVar2, 1.0f), 8), ((Number) b3VarB.getValue()).floatValue());
                                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                                    int iHashCode = Long.hashCode(sVar4.T);
                                    l1.q1 q1VarL = sVar4.l();
                                    z1.r rVarC2 = z1.a.c(sVar4, rVarA);
                                    y2.k.J.getClass();
                                    y2.i iVar = y2.j.f56913b;
                                    sVar4.h0();
                                    if (sVar4.S) {
                                        sVar4.k(iVar);
                                    } else {
                                        sVar4.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, q0VarD, sVar4);
                                    l1.t.J(y2.j.f56916e, q1VarL, sVar4);
                                    y2.h hVar = y2.j.f56918g;
                                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC2, sVar4);
                                    j3.y0 y0VarY = dt.a0.y(courseWord3.getSelectedState(), sVar4);
                                    ht.o oVar3 = oVar;
                                    boolean z18 = oVar3.f33759g;
                                    if (z18 || oVar3.f33760h) {
                                        sVar4.d0(-1357468217);
                                        j11 = ((ct.b) sVar4.j(ct.c.f22476a)).f22470e;
                                        sVar4.p(false);
                                    } else {
                                        sVar4.d0(-1357369141);
                                        j11 = ((ct.b) sVar4.j(ct.c.f22476a)).f22472g;
                                        sVar4.p(false);
                                    }
                                    j0.r rVar2 = j0.r.f35391a;
                                    z1.r rVarA2 = rVar2.a(oVar2, jVar);
                                    String luoMa = BuildConfig.VERSION_NAME;
                                    String zhuYin = z18 ? BuildConfig.VERSION_NAME : courseWord3.getZhuYin();
                                    if (!z18) {
                                        luoMa = courseWord3.getLuoMa();
                                    }
                                    dt.g4.b(CourseWord.copy$default(courseWord3, 0L, null, zhuYin, luoMa, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -13, 63, null), j3.y0.a(y0VarY, 0L, j11, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213), rVarA2, false, null, false, false, false, 0, null, sVar4, 0, 1016);
                                    sVar4 = sVar4;
                                    if (courseWord3.getWordType() == 4 && courseWord2.getWordId() != courseWord3.getWordId() && courseWord3.getChineseToneMetaData().getM0ShowCharacter()) {
                                        sVar4.d0(-1356603689);
                                        ua.b(ub.a.e0(sVar4, R.string.chinese_tone_no_tone_change), rVar2.a(oVar2, z1.c.H), ((h1.s1) sVar4.j(h1.v1.f31180a)).f31036s, fr.j3.A(12), new n3.o(1), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 3072, 0, 131040);
                                        sVar4 = sVar4;
                                    } else {
                                        sVar4.d0(-1372376923);
                                    }
                                    sVar4.p(false);
                                    sVar4.p(true);
                                } else {
                                    sVar4.d0(554465412);
                                }
                                sVar4.p(false);
                                z1.r rVarD2 = j0.e2.d(oVar2, 1.0f);
                                w2.q0 q0VarD2 = j0.o.d(jVar, false);
                                int iHashCode2 = Long.hashCode(sVar4.T);
                                l1.q1 q1VarL2 = sVar4.l();
                                z1.r rVarC3 = z1.a.c(sVar4, rVarD2);
                                y2.k.J.getClass();
                                y2.i iVar2 = y2.j.f56913b;
                                sVar4.h0();
                                if (sVar4.S) {
                                    sVar4.k(iVar2);
                                } else {
                                    sVar4.r0();
                                }
                                l1.t.J(y2.j.f56917f, q0VarD2, sVar4);
                                l1.t.J(y2.j.f56916e, q1VarL2, sVar4);
                                y2.h hVar2 = y2.j.f56918g;
                                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                                    defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar2);
                                }
                                l1.t.J(y2.j.f56915d, rVarC3, sVar4);
                                boolean z19 = lVar.b() == courseWord3.getWordId();
                                long j12 = ((h1.s1) sVar4.j(h1.v1.f31180a)).f31017a;
                                z1.r rVarX = j0.c.x(j0.e2.n(oVar2, ((v3.f) b3VarA.getValue()).f53489a), ((v3.f) b3VarA2.getValue()).f53489a, ((v3.f) b3VarA3.getValue()).f53489a);
                                final boolean z20 = z16;
                                boolean zG = sVar4.g(z20);
                                final fz.c cVar4 = cVar3;
                                boolean zF = zG | sVar4.f(cVar4) | sVar4.h(courseWord3);
                                final boolean z21 = z15;
                                boolean zG2 = zF | sVar4.g(z21);
                                final fz.c cVar5 = cVar2;
                                boolean zF2 = zG2 | sVar4.f(cVar5);
                                Object objQ = sVar4.Q();
                                if (zF2 || objQ == l1.m.f39353a) {
                                    objQ = new fz.a() { // from class: bt.k6
                                        @Override // fz.a
                                        public final Object invoke() {
                                            boolean z22 = z20;
                                            CourseWord courseWord4 = courseWord3;
                                            if (z22) {
                                                cVar4.invoke(courseWord4);
                                            } else if (z21) {
                                                cVar5.invoke(courseWord4);
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar4.o0(objQ);
                                }
                                l1.s sVar5 = sVar4;
                                dt.a0.a(z19, rVarX, j12, (fz.a) objQ, sVar5, 0, 0);
                                sVar5.p(true);
                            } else {
                                sVar4.W();
                            }
                            return qy.b0.f48488a;
                        }
                    }, sVar3), sVar3, 3078, 6);
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ k4(boolean z11, CourseWord courseWord, boolean z12, ht.o oVar, CourseWord courseWord2, ht.l lVar, boolean z13, fz.c cVar, fz.c cVar2) {
        this.f5616b = z11;
        this.f5620f = courseWord;
        this.f5617c = z12;
        this.f5621t = oVar;
        this.H = courseWord2;
        this.K = lVar;
        this.f5618d = z13;
        this.f5619e = cVar;
        this.L = cVar2;
    }
}
