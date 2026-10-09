package bt;

import android.net.Uri;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.CourseSentence;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w1 implements fz.e {
    public final /* synthetic */ boolean H;
    public final /* synthetic */ ht.o K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ fz.e M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object S;
    public final /* synthetic */ Object T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6137a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f6138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.a1 f6142f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f6143t;

    public /* synthetic */ w1(l1.b1 b1Var, jt.m1 m1Var, boolean z11, rz.b0 b0Var, e2.l lVar, boolean z12, l1.b3 b3Var, l1.a1 a1Var, ht.o oVar, CourseSentence courseSentence, l1.i1 i1Var, boolean z13, l1.b1 b1Var2, fz.a aVar, x1.p pVar, qy.l lVar2, fz.e eVar) {
        this.f6139c = b1Var;
        this.N = m1Var;
        this.f6141e = z11;
        this.f6143t = b0Var;
        this.O = lVar;
        this.H = z12;
        this.f6138b = b3Var;
        this.f6142f = a1Var;
        this.K = oVar;
        this.P = courseSentence;
        this.Q = i1Var;
        this.L = z13;
        this.f6140d = b1Var2;
        this.R = aVar;
        this.S = pVar;
        this.T = lVar2;
        this.M = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:35:0x0115  */
    /* JADX WARN: Code duplicated, block: B:39:0x0148  */
    /* JADX WARN: Code duplicated, block: B:42:0x015c  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:56:0x023d  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z11;
        boolean z12;
        l1.s sVar;
        l1.a1 a1Var;
        y2.h hVar;
        boolean zBooleanValue;
        l1.b1 b1Var;
        l1.a1 a1Var2;
        l1.g gVar;
        boolean zF;
        Object objQ;
        rz.b0 b0Var;
        boolean z13;
        ht.o oVar;
        boolean z14;
        fz.e eVar;
        boolean zF2;
        Object objQ2;
        l1.s sVar2;
        boolean z15;
        int iHashCode;
        boolean zF3;
        Object objQ3;
        Object objQ4;
        l1.b1 b1Var2;
        boolean zF4;
        Object objQ5;
        switch (this.f6137a) {
            case 0:
                jt.m1 m1Var = (jt.m1) this.N;
                e2.l lVar = (e2.l) this.O;
                CourseSentence courseSentence = (CourseSentence) this.P;
                l1.i1 i1Var = (l1.i1) this.Q;
                fz.a aVar = (fz.a) this.R;
                x1.p pVar = (x1.p) this.S;
                qy.l lVar2 = (qy.l) this.T;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar;
                if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l1.b1 b1Var3 = this.f6139c;
                    boolean zBooleanValue2 = ((Boolean) b1Var3.getValue()).booleanValue();
                    z1.o oVar2 = z1.o.f58481a;
                    l1.g gVar2 = l1.m.f39353a;
                    if (zBooleanValue2) {
                        sVar3.d0(-456016950);
                        String str = (String) m1Var.f37062p.getValue();
                        o3.w wVar = (o3.w) m1Var.f37063q.getValue();
                        float fFloatValue = ((Number) this.f6138b.getValue()).floatValue();
                        rz.b0 b0Var2 = this.f6143t;
                        boolean zH = sVar3.h(b0Var2) | sVar3.h(m1Var) | sVar3.f(b1Var3) | sVar3.h(lVar);
                        Object objQ6 = sVar3.Q();
                        if (zH || objQ6 == gVar2) {
                            objQ6 = new h2(b0Var2, b1Var3, lVar, m1Var, 0);
                            m1Var = m1Var;
                            sVar3.o0(objQ6);
                        }
                        fz.a aVar2 = (fz.a) objQ6;
                        boolean zH2 = sVar3.h(m1Var);
                        Object objQ7 = sVar3.Q();
                        if (zH2 || objQ7 == gVar2) {
                            objQ7 = new a3(1, m1Var, jt.m1.class, "onTextChange", "onTextChange(Ljava/lang/String;)V", 0, 0);
                            sVar3.o0(objQ7);
                        }
                        fz.c cVar = (fz.c) ((mz.e) objQ7);
                        boolean zH3 = sVar3.h(m1Var);
                        Object objQ8 = sVar3.Q();
                        if (zH3 || objQ8 == gVar2) {
                            a3 a3Var = new a3(1, m1Var, jt.m1.class, "onTextFieldValueChange", "onTextFieldValueChange(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0, 1);
                            sVar3.o0(a3Var);
                            objQ8 = a3Var;
                        }
                        d3.a(ry.r.f50854a, str, wVar, fFloatValue, this.f6141e, aVar2, cVar, (fz.c) ((mz.e) objQ8), sVar3, 6, 0);
                        ep.a.C(oVar2, this.H ? 0 : 26, sVar3, false);
                    } else {
                        sVar3.d0(-455069869);
                        z1.r rVarI = j0.e2.i(j0.e2.e(oVar2, 1.0f), ((v3.c) sVar3.j(z2.g1.f58547h)).Q(((l1.h1) this.f6142f).l()), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar3, 54);
                        int iHashCode2 = Long.hashCode(sVar3.T);
                        l1.q1 q1VarL = sVar3.l();
                        z1.r rVarC = z1.a.c(sVar3, rVarI);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA, sVar3);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar3);
                        y2.h hVar2 = y2.j.f56918g;
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar3);
                        ht.o oVar3 = this.K;
                        boolean z16 = oVar3.f33762j;
                        fz.e eVar2 = this.M;
                        if (!z16 || ((Boolean) b1Var3.getValue()).booleanValue()) {
                            z11 = true;
                            z12 = false;
                            sVar3.d0(-1112780759);
                            float f5 = 26;
                            j0.c.g(sVar3, j0.e2.g(oVar2, f5));
                            boolean z17 = oVar3.f33763k;
                            boolean zF5 = sVar3.f(oVar3) | sVar3.f(i1Var) | sVar3.f(eVar2);
                            Object objQ9 = sVar3.Q();
                            if (zF5 || objQ9 == gVar2) {
                                objQ9 = new i2(oVar3, i1Var, eVar2, 1);
                                sVar3.o0(objQ9);
                            }
                            dt.d4.a(pVar, null, null, false, false, null, null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, Integer.MAX_VALUE, 0L, z17, lVar2, false, false, false, null, null, (fz.c) objQ9, sVar3, 0, 384, 0, 2043902);
                            sVar = sVar3;
                            ep.a.C(oVar2, f5, sVar, false);
                        } else {
                            sVar3.d0(-1114152788);
                            Uri videoUri = courseSentence.getVideoUri();
                            float f11 = 12;
                            z1.r rVarB = d2.h.b(j0.e2.n(oVar2, AchievementLevelType.DAY_STREAK_LV_8), r0.f.d(f11));
                            long jLongValue = i1Var.getValue().longValue();
                            Long lValueOf = Long.valueOf(oVar3.f33756d);
                            l1.b1 b1Var4 = this.f6140d;
                            boolean zF6 = sVar3.f(b1Var4) | sVar3.f(aVar);
                            Object objQ10 = sVar3.Q();
                            if (zF6 || objQ10 == gVar2) {
                                objQ10 = new b3(0, aVar, b1Var4);
                                sVar3.o0(objQ10);
                            }
                            dt.y4.a(videoUri, rVarB, null, this.L, jLongValue, lValueOf, (fz.c) ((mz.e) objQ10), sVar3, 0, 4);
                            j0.c.g(sVar3, j0.e2.g(oVar2, 4));
                            boolean z18 = oVar3.f33763k;
                            boolean zF7 = sVar3.f(oVar3) | sVar3.f(i1Var) | sVar3.f(eVar2);
                            Object objQ11 = sVar3.Q();
                            if (zF7 || objQ11 == gVar2) {
                                objQ11 = new i2(oVar3, i1Var, eVar2, 0);
                                sVar3.o0(objQ11);
                            }
                            z11 = true;
                            z12 = false;
                            dt.d4.a(pVar, null, null, false, false, null, null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, Integer.MAX_VALUE, 0L, z18, lVar2, false, false, false, null, null, (fz.c) objQ11, sVar3, 0, 384, 0, 2043902);
                            sVar = sVar3;
                            ep.a.C(oVar2, f11, sVar, false);
                        }
                        sVar.p(z11);
                        sVar.p(z12);
                    }
                } else {
                    sVar3.W();
                }
                break;
            default:
                l1.b1 b1Var5 = (l1.b1) this.N;
                l1.b1 b1Var6 = (l1.b1) this.O;
                l1.a1 a1Var3 = (l1.a1) this.P;
                jt.s0 s0Var = (jt.s0) this.Q;
                l1.b1 b1Var7 = (l1.b1) this.R;
                l1.b1 b1Var8 = (l1.b1) this.S;
                l1.a1 a1Var4 = (l1.a1) this.T;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                z1.j jVar = z1.c.f58467e;
                l1.s sVar4 = (l1.s) nVar2;
                if (sVar4.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z1.o oVar4 = z1.o.f58481a;
                    z1.r rVarD = j0.e2.d(oVar4, 1.0f);
                    l1.b3 b3Var = this.f6138b;
                    w2.q0 q0VarD = j0.o.d(((Boolean) b3Var.getValue()).booleanValue() ? z1.c.H : jVar, false);
                    int iHashCode3 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL2 = sVar4.l();
                    z1.r rVarC2 = z1.a.c(sVar4, rVarD);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    y2.h hVar3 = y2.j.f56917f;
                    l1.t.J(hVar3, q0VarD, sVar4);
                    y2.h hVar4 = y2.j.f56916e;
                    l1.t.J(hVar4, q1VarL2, sVar4);
                    y2.h hVar5 = y2.j.f56918g;
                    if (sVar4.S) {
                        a1Var = a1Var4;
                    } else {
                        a1Var = a1Var4;
                        if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                        }
                        hVar = y2.j.f56915d;
                        l1.t.J(hVar, rVarC2, sVar4);
                        zBooleanValue = ((Boolean) b3Var.getValue()).booleanValue();
                        b1Var = this.f6140d;
                        a1Var2 = this.f6142f;
                        gVar = l1.m.f39353a;
                        if (zBooleanValue) {
                            sVar4.d0(1856027504);
                            z1.r rVarD2 = j0.e2.d(oVar4, 1.0f);
                            w2.q0 q0VarD2 = j0.o.d(jVar, false);
                            iHashCode = Long.hashCode(sVar4.T);
                            l1.q1 q1VarL3 = sVar4.l();
                            z1.r rVarC3 = z1.a.c(sVar4, rVarD2);
                            sVar4.h0();
                            if (sVar4.S) {
                                sVar4.k(iVar2);
                            } else {
                                sVar4.r0();
                            }
                            l1.t.J(hVar3, q0VarD2, sVar4);
                            l1.t.J(hVar4, q1VarL3, sVar4);
                            if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                                defpackage.e.A(iHashCode, sVar4, iHashCode, hVar5);
                            }
                            l1.t.J(hVar, rVarC3, sVar4);
                            List list = (List) b1Var.getValue();
                            z1.r rVarA = d2.h.a(oVar4, CropImageView.DEFAULT_ASPECT_RATIO);
                            f2.c cVar2 = (f2.c) b1Var8.getValue();
                            int iL = ((l1.h1) a1Var).l();
                            zF3 = sVar4.f(a1Var2) | sVar4.f(a1Var3);
                            objQ3 = sVar4.Q();
                            if (zF3 || objQ3 == gVar) {
                                objQ3 = new z4(a1Var2, a1Var3, 0);
                                sVar4.o0(objQ3);
                            }
                            fz.e eVar3 = (fz.e) ((mz.e) objQ3);
                            objQ4 = sVar4.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new br.b(13);
                                sVar4.o0(objQ4);
                            }
                            fz.c cVar3 = (fz.c) objQ4;
                            z15 = true;
                            b.y(list, b1Var5, false, rVarA, null, false, cVar2, iL, false, eVar3, cVar3, sVar4, 200064, 6, 272);
                            sVar4.p(true);
                            z1.r rVarE = j0.c.E(oVar4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 7);
                            b1Var2 = this.f6139c;
                            zF4 = sVar4.f(b1Var2);
                            objQ5 = sVar4.Q();
                            if (zF4 || objQ5 == gVar) {
                                objQ5 = new bp.p(17, b1Var2);
                                sVar4.o0(objQ5);
                            }
                            dt.e.L(6, (fz.a) objQ5, sVar4, rVarE);
                            sVar4.p(false);
                            sVar2 = sVar4;
                        } else {
                            sVar4.d0(1857164367);
                            List list2 = (List) b1Var.getValue();
                            f2.c cVar4 = (f2.c) b1Var8.getValue();
                            int iL2 = ((l1.h1) a1Var).l();
                            zF = sVar4.f(a1Var2) | sVar4.f(a1Var3);
                            objQ = sVar4.Q();
                            if (zF || objQ == gVar) {
                                objQ = new z4(a1Var2, a1Var3, 1);
                                sVar4.o0(objQ);
                            }
                            fz.e eVar4 = (fz.e) ((mz.e) objQ);
                            b0Var = this.f6143t;
                            boolean zH4 = sVar4.h(b0Var) | sVar4.h(s0Var);
                            z13 = this.H;
                            boolean zG = zH4 | sVar4.g(z13) | sVar4.f(b1Var7);
                            oVar = this.K;
                            boolean zF8 = zG | sVar4.f(oVar);
                            z14 = this.L;
                            boolean zG2 = zF8 | sVar4.g(z14);
                            eVar = this.M;
                            zF2 = zG2 | sVar4.f(eVar);
                            objQ2 = sVar4.Q();
                            if (zF2 || objQ2 == gVar) {
                                j4 j4Var = new j4(b0Var, s0Var, z13, b1Var7, oVar, z14, eVar, 1);
                                sVar4.o0(j4Var);
                                objQ2 = j4Var;
                            }
                            sVar2 = sVar4;
                            b.y(list2, b1Var5, this.f6141e, null, b1Var6, true, cVar4, iL2, false, eVar4, (fz.c) objQ2, sVar2, 196608, 0, 264);
                            sVar2.p(false);
                            z15 = true;
                        }
                        sVar2.p(z15);
                    }
                    defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                    hVar = y2.j.f56915d;
                    l1.t.J(hVar, rVarC2, sVar4);
                    zBooleanValue = ((Boolean) b3Var.getValue()).booleanValue();
                    b1Var = this.f6140d;
                    a1Var2 = this.f6142f;
                    gVar = l1.m.f39353a;
                    if (zBooleanValue) {
                        sVar4.d0(1856027504);
                        z1.r rVarD3 = j0.e2.d(oVar4, 1.0f);
                        w2.q0 q0VarD3 = j0.o.d(jVar, false);
                        iHashCode = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL4 = sVar4.l();
                        z1.r rVarC4 = z1.a.c(sVar4, rVarD3);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar2);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar3, q0VarD3, sVar4);
                        l1.t.J(hVar4, q1VarL4, sVar4);
                        if (sVar4.S) {
                            defpackage.e.A(iHashCode, sVar4, iHashCode, hVar5);
                        } else {
                            defpackage.e.A(iHashCode, sVar4, iHashCode, hVar5);
                        }
                        l1.t.J(hVar, rVarC4, sVar4);
                        List list3 = (List) b1Var.getValue();
                        z1.r rVarA2 = d2.h.a(oVar4, CropImageView.DEFAULT_ASPECT_RATIO);
                        f2.c cVar5 = (f2.c) b1Var8.getValue();
                        int iL3 = ((l1.h1) a1Var).l();
                        zF3 = sVar4.f(a1Var2) | sVar4.f(a1Var3);
                        objQ3 = sVar4.Q();
                        if (zF3) {
                            objQ3 = new z4(a1Var2, a1Var3, 0);
                            sVar4.o0(objQ3);
                        } else {
                            objQ3 = new z4(a1Var2, a1Var3, 0);
                            sVar4.o0(objQ3);
                        }
                        fz.e eVar5 = (fz.e) ((mz.e) objQ3);
                        objQ4 = sVar4.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new br.b(13);
                            sVar4.o0(objQ4);
                        }
                        fz.c cVar6 = (fz.c) objQ4;
                        z15 = true;
                        b.y(list3, b1Var5, false, rVarA2, null, false, cVar5, iL3, false, eVar5, cVar6, sVar4, 200064, 6, 272);
                        sVar4.p(true);
                        z1.r rVarE2 = j0.c.E(oVar4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 7);
                        b1Var2 = this.f6139c;
                        zF4 = sVar4.f(b1Var2);
                        objQ5 = sVar4.Q();
                        if (zF4) {
                            objQ5 = new bp.p(17, b1Var2);
                            sVar4.o0(objQ5);
                        } else {
                            objQ5 = new bp.p(17, b1Var2);
                            sVar4.o0(objQ5);
                        }
                        dt.e.L(6, (fz.a) objQ5, sVar4, rVarE2);
                        sVar4.p(false);
                        sVar2 = sVar4;
                    } else {
                        sVar4.d0(1857164367);
                        List list4 = (List) b1Var.getValue();
                        f2.c cVar7 = (f2.c) b1Var8.getValue();
                        int iL4 = ((l1.h1) a1Var).l();
                        zF = sVar4.f(a1Var2) | sVar4.f(a1Var3);
                        objQ = sVar4.Q();
                        if (zF) {
                            objQ = new z4(a1Var2, a1Var3, 1);
                            sVar4.o0(objQ);
                        } else {
                            objQ = new z4(a1Var2, a1Var3, 1);
                            sVar4.o0(objQ);
                        }
                        fz.e eVar6 = (fz.e) ((mz.e) objQ);
                        b0Var = this.f6143t;
                        boolean zH5 = sVar4.h(b0Var) | sVar4.h(s0Var);
                        z13 = this.H;
                        boolean zG3 = zH5 | sVar4.g(z13) | sVar4.f(b1Var7);
                        oVar = this.K;
                        boolean zF9 = zG3 | sVar4.f(oVar);
                        z14 = this.L;
                        boolean zG4 = zF9 | sVar4.g(z14);
                        eVar = this.M;
                        zF2 = zG4 | sVar4.f(eVar);
                        objQ2 = sVar4.Q();
                        if (zF2) {
                            j4 j4Var2 = new j4(b0Var, s0Var, z13, b1Var7, oVar, z14, eVar, 1);
                            sVar4.o0(j4Var2);
                            objQ2 = j4Var2;
                        } else {
                            j4 j4Var3 = new j4(b0Var, s0Var, z13, b1Var7, oVar, z14, eVar, 1);
                            sVar4.o0(j4Var3);
                            objQ2 = j4Var3;
                        }
                        sVar2 = sVar4;
                        b.y(list4, b1Var5, this.f6141e, null, b1Var6, true, cVar7, iL4, false, eVar6, (fz.c) objQ2, sVar2, 196608, 0, 264);
                        sVar2.p(false);
                        z15 = true;
                    }
                    sVar2.p(z15);
                } else {
                    sVar4.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ w1(l1.b3 b3Var, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, boolean z11, l1.b1 b1Var4, l1.a1 a1Var, l1.a1 a1Var2, rz.b0 b0Var, jt.s0 s0Var, boolean z12, l1.b1 b1Var5, ht.o oVar, boolean z13, fz.e eVar, l1.b1 b1Var6, l1.a1 a1Var3) {
        this.f6138b = b3Var;
        this.f6139c = b1Var;
        this.f6140d = b1Var2;
        this.N = b1Var3;
        this.f6141e = z11;
        this.O = b1Var4;
        this.f6142f = a1Var;
        this.P = a1Var2;
        this.f6143t = b0Var;
        this.Q = s0Var;
        this.H = z12;
        this.R = b1Var5;
        this.K = oVar;
        this.L = z13;
        this.M = eVar;
        this.S = b1Var6;
        this.T = a1Var3;
    }
}
