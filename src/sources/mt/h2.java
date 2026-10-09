package mt;

import bt.g7;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.WeakHashMap;
import rt.f8;
import rt.g8;
import rt.o8;
import rt.x8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h2 implements fz.f {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f41514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f41515f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f41516t;

    public /* synthetic */ h2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i11) {
        this.f41510a = i11;
        this.f41512c = obj;
        this.f41513d = obj2;
        this.f41514e = obj3;
        this.f41511b = obj4;
        this.f41515f = obj5;
        this.f41516t = obj6;
        this.H = obj7;
        this.K = obj8;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x8 x8Var;
        int i11 = this.f41510a;
        z1.o oVar = z1.o.f58481a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.g gVar = l1.m.f39353a;
        Object obj4 = this.H;
        Object obj5 = this.f41516t;
        Object obj6 = this.f41515f;
        Object obj7 = this.f41511b;
        Object obj8 = this.K;
        Object obj9 = this.f41514e;
        Object obj10 = this.f41513d;
        Object obj11 = this.f41512c;
        switch (i11) {
            case 0:
                rt.f2 f2Var = (rt.f2) obj11;
                rt.j2 j2Var = (rt.j2) obj10;
                j9.v vVar = (j9.v) obj9;
                l1.b1 b1Var = (l1.b1) obj7;
                l1.b1 b1Var2 = (l1.b1) obj6;
                l1.b1 b1Var3 = (l1.b1) obj5;
                l1.b1 b1Var4 = (l1.b1) obj4;
                l1.b1 b1Var5 = (l1.b1) obj8;
                j0.v ModalBottomSheet = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    sVar.W();
                } else {
                    boolean z11 = f2Var.f49715f;
                    q2 q2Var = (q2) b1Var.getValue();
                    Object objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = new p(3, b1Var);
                        sVar.o0(objQ);
                    }
                    fz.c cVar = (fz.c) objQ;
                    Object objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new ch.h0(b1Var2, b1Var3, 5);
                        sVar.o0(objQ2);
                    }
                    fz.a aVar = (fz.a) objQ2;
                    boolean zH = sVar.h(j2Var) | sVar.h(vVar);
                    Object objQ3 = sVar.Q();
                    if (zH || objQ3 == gVar) {
                        objQ3 = new g7((Object) j2Var, (Object) vVar, b1Var2, b1Var, b1Var4, b1Var5, 12);
                        sVar.o0(objQ3);
                    }
                    p2.c(z11, q2Var, false, cVar, aVar, (fz.c) objQ3, sVar, 28032, 0);
                }
                break;
            case 1:
                g8 g8Var = (g8) obj11;
                x8 x8Var2 = (x8) obj10;
                fz.c cVar2 = (fz.c) obj9;
                fz.c cVar3 = (fz.c) obj6;
                fz.a aVar2 = (fz.a) obj5;
                fz.c cVar4 = (fz.c) obj4;
                fz.e eVar = (fz.e) obj8;
                l1.b1 b1Var6 = (l1.b1) obj7;
                j0.v ModalBottomSheet2 = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet2, "$this$ModalBottomSheet");
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    sVar2.W();
                } else {
                    o8 o8Var = ((f8) g8Var).f49747f;
                    if (o8Var != null) {
                        sVar2.d0(1492378844);
                        boolean zD = sVar2.d(x8Var2.ordinal()) | sVar2.f(cVar4) | sVar2.f(eVar);
                        Object objQ4 = sVar2.Q();
                        if (zD || objQ4 == gVar) {
                            x8Var = x8Var2;
                            objQ4 = new bp.t((Object) x8Var, (qy.e) cVar4, (Object) eVar, b1Var6, 24);
                            sVar2.o0(objQ4);
                        } else {
                            x8Var = x8Var2;
                        }
                        j6.a(x8Var, o8Var, cVar2, cVar3, aVar2, (fz.e) objQ4, sVar2, 0);
                        sVar2.p(false);
                    } else {
                        sVar2.d0(1492378843);
                        sVar2.p(false);
                    }
                }
                break;
            case 2:
                l1.b3 b3Var = (l1.b3) obj11;
                l1.b1 b1Var7 = (l1.b1) obj7;
                l1.b1 b1Var8 = (l1.b1) obj6;
                t1.d dVar = (t1.d) obj10;
                l1.b1 b1Var9 = (l1.b1) obj5;
                fz.e eVar2 = (fz.e) obj9;
                fz.a aVar3 = (fz.a) obj4;
                fz.a aVar4 = (fz.a) obj8;
                j0.v ModalBottomSheet3 = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet3, "$this$ModalBottomSheet");
                l1.s sVar3 = (l1.s) nVar3;
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    sVar3.W();
                } else {
                    z1.r rVarH = d0.n.h(oVar, ((g2.x) b3Var.getValue()).f28624a, g2.f0.f28556b);
                    WeakHashMap weakHashMap = j0.o2.f35353v;
                    z1.r rVarD = j0.e2.d(z1.a.a(rVarH, new j0.p2(j0.b.e(sVar3).f35359f, 0)), 1.0f);
                    boolean zF = sVar3.f(b1Var7);
                    Object objQ5 = sVar3.Q();
                    if (zF || objQ5 == gVar) {
                        objQ5 = new pr.z(7, b1Var7);
                        sVar3.o0(objQ5);
                    }
                    z1.r rVarQ = iu.k.q(0, 7, (fz.a) objQ5, sVar3, rVarD, false);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar3, 48);
                    int iHashCode = Long.hashCode(sVar3.T);
                    l1.q1 q1VarL = sVar3.l();
                    z1.r rVarC = z1.a.c(sVar3, rVarQ);
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
                    y2.h hVar = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar3);
                    j0.c.g(sVar3, j0.v.a(oVar, 1.0f));
                    boolean zBooleanValue = ((Boolean) b1Var8.getValue()).booleanValue();
                    a0.l1 l1VarA = a0.f1.e(null, 3).a(a0.f1.g(null, 0.8f, 5));
                    Object objQ6 = sVar3.Q();
                    if (objQ6 == gVar) {
                        objQ6 = new st.a(24);
                        sVar3.o0(objQ6);
                    }
                    a0.j0.c(zBooleanValue, null, l1VarA.a(a0.f1.r((fz.c) objQ6, 1)), null, BuildConfig.VERSION_NAME, t1.e.d(-776251035, new br.l(dVar, 6), sVar3), sVar3, 1772550, 10);
                    j0.c.g(sVar3, j0.v.a(oVar, 1.0f));
                    boolean zBooleanValue2 = ((Boolean) b1Var9.getValue()).booleanValue();
                    a0.l1 l1VarE = a0.f1.e(null, 3);
                    Object objQ7 = sVar3.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new b0.k2(29);
                        sVar3.o0(objQ7);
                    }
                    a0.j0.c(zBooleanValue2, null, l1VarE.a(a0.f1.r((fz.c) objQ7, 1)), null, BuildConfig.VERSION_NAME, t1.e.d(1394258140, new br.j(eVar2, b1Var7, aVar3, aVar4, 17), sVar3), sVar3, 1772550, 10);
                    sVar3.p(true);
                }
                break;
            case 3:
                fz.a aVar5 = (fz.a) obj11;
                fz.a aVar6 = (fz.a) obj10;
                fz.a aVar7 = (fz.a) obj9;
                fz.a aVar8 = (fz.a) obj7;
                fz.a aVar9 = (fz.a) obj6;
                fz.a aVar10 = (fz.a) obj5;
                fz.a aVar11 = (fz.a) obj4;
                fz.a aVar12 = (fz.a) obj8;
                j0.v Card = (j0.v) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar4 = (l1.s) nVar4;
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    sVar4.W();
                } else {
                    String strE0 = ub.a.e0(sVar4, R.string.our_blog);
                    boolean zF2 = sVar4.f(aVar5);
                    Object objQ8 = sVar4.Q();
                    if (zF2 || objQ8 == gVar) {
                        objQ8 = new wo.c(3, aVar5);
                        sVar4.o0(objQ8);
                    }
                    float f5 = 16;
                    xu.r.b(R.drawable.about_us_our_blog, strE0, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ8, 15), f5), xu.c.f56338b, sVar4, 3072);
                    String strE1 = ub.a.e0(sVar4, R.string.methodology);
                    boolean zF3 = sVar4.f(aVar6);
                    Object objQ9 = sVar4.Q();
                    if (zF3 || objQ9 == gVar) {
                        objQ9 = new wo.c(4, aVar6);
                        sVar4.o0(objQ9);
                    }
                    xu.r.b(R.drawable.about_us_our_method, strE1, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ9, 15), f5), xu.c.f56340c, sVar4, 3072);
                    boolean zF4 = sVar4.f(aVar7);
                    Object objQ10 = sVar4.Q();
                    if (zF4 || objQ10 == gVar) {
                        objQ10 = new wo.c(5, aVar7);
                        sVar4.o0(objQ10);
                    }
                    xu.r.b(R.drawable.about_us_follow_fb, "Follow us on Facebook", j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ10, 15), f5), xu.c.f56342d, sVar4, 3120);
                    String strE2 = ub.a.e0(sVar4, R.string.follow_us_on_instagram);
                    boolean zF5 = sVar4.f(aVar8);
                    Object objQ11 = sVar4.Q();
                    if (zF5 || objQ11 == gVar) {
                        objQ11 = new wo.c(6, aVar8);
                        sVar4.o0(objQ11);
                    }
                    xu.r.b(R.drawable.about_us_follow_ins, strE2, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ11, 15), f5), xu.c.f56344e, sVar4, 3072);
                    String strE3 = ub.a.e0(sVar4, R.string.follow_us_on_twitter);
                    boolean zF6 = sVar4.f(aVar9);
                    Object objQ12 = sVar4.Q();
                    if (zF6 || objQ12 == gVar) {
                        objQ12 = new wo.c(7, aVar9);
                        sVar4.o0(objQ12);
                    }
                    xu.r.b(R.drawable.about_us_follow_twitter, strE3, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ12, 15), f5), xu.c.f56346f, sVar4, 3072);
                    String strE4 = ub.a.e0(sVar4, R.string.follow_us_on_reddit);
                    boolean zF7 = sVar4.f(aVar10);
                    Object objQ13 = sVar4.Q();
                    if (zF7 || objQ13 == gVar) {
                        objQ13 = new wo.c(8, aVar10);
                        sVar4.o0(objQ13);
                    }
                    xu.r.b(R.drawable.about_us_follow_reddit, strE4, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ13, 15), f5), xu.c.f56348g, sVar4, 3072);
                    String strE5 = ub.a.e0(sVar4, R.string.share_lingodeer);
                    boolean zF8 = sVar4.f(aVar11);
                    Object objQ14 = sVar4.Q();
                    if (zF8 || objQ14 == gVar) {
                        objQ14 = new wo.c(9, aVar11);
                        sVar4.o0(objQ14);
                    }
                    xu.r.b(R.drawable.about_us_share_us, strE5, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ14, 15), f5), xu.c.f56350h, sVar4, 3072);
                    boolean zF9 = sVar4.f(aVar12);
                    Object objQ15 = sVar4.Q();
                    if (zF9 || objQ15 == gVar) {
                        objQ15 = new wo.c(10, aVar12);
                        sVar4.o0(objQ15);
                    }
                    xu.r.b(R.drawable.about_us_policy, "Privacy Policy", j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ15, 15), f5), xu.c.f56352i, sVar4, 3120);
                }
                break;
            default:
                l1.b3 b3Var2 = (l1.b3) obj11;
                ni.m mVar = (ni.m) obj10;
                xg.d dVar2 = (xg.d) obj9;
                String str = (String) obj8;
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                String str2 = (String) ((l1.b1) obj7).getValue();
                long j11 = ((g2.x) ((l1.b1) obj6).getValue()).f28624a;
                long j12 = ((g2.x) ((l1.b1) obj5).getValue()).f28624a;
                long j13 = ((g2.x) ((l1.b1) obj4).getValue()).f28624a;
                float f11 = 36;
                z1.r rVarB = j0.c.B(oVar, f11, f11);
                l1.s sVar5 = (l1.s) ((l1.n) obj2);
                boolean zF10 = sVar5.f(b3Var2) | sVar5.h(mVar) | sVar5.h(dVar2) | sVar5.f(str);
                Object objQ16 = sVar5.Q();
                if (zF10 || objQ16 == gVar) {
                    objQ16 = new yg.j(b3Var2, mVar, dVar2, str, 0);
                    sVar5.o0(objQ16);
                }
                yg.o.c(str2, j11, j12, j13, rVarB, (fz.a) objQ16, sVar5, 24576);
                break;
        }
        return b0Var;
    }

    public /* synthetic */ h2(l1.b3 b3Var, l1.b1 b1Var, l1.b1 b1Var2, t1.d dVar, l1.b1 b1Var3, fz.e eVar, fz.a aVar, fz.a aVar2) {
        this.f41510a = 2;
        this.f41512c = b3Var;
        this.f41511b = b1Var;
        this.f41515f = b1Var2;
        this.f41513d = dVar;
        this.f41516t = b1Var3;
        this.f41514e = eVar;
        this.H = aVar;
        this.K = aVar2;
    }

    public /* synthetic */ h2(l1.b3 b3Var, ni.m mVar, xg.d dVar, String str, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4) {
        this.f41510a = 4;
        this.f41512c = b3Var;
        this.f41513d = mVar;
        this.f41514e = dVar;
        this.K = str;
        this.f41511b = b1Var;
        this.f41515f = b1Var2;
        this.f41516t = b1Var3;
        this.H = b1Var4;
    }

    public /* synthetic */ h2(g8 g8Var, x8 x8Var, fz.c cVar, fz.c cVar2, fz.a aVar, fz.c cVar3, fz.e eVar, l1.b1 b1Var) {
        this.f41510a = 1;
        this.f41512c = g8Var;
        this.f41513d = x8Var;
        this.f41514e = cVar;
        this.f41515f = cVar2;
        this.f41516t = aVar;
        this.H = cVar3;
        this.K = eVar;
        this.f41511b = b1Var;
    }
}
