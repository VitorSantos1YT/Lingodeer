package jr;

import android.content.res.Resources;
import b0.o1;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.dc;
import h1.f4;
import h1.fc;
import h1.ha;
import h1.la;
import h1.m1;
import h1.qa;
import h1.r7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.t1;
import j0.u0;
import j0.z1;
import j3.y0;
import java.util.List;
import l1.b1;
import l1.c3;
import l1.q1;
import mt.p2;
import mt.q2;
import rt.je;
import s0.r0;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36626a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f36627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f36628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f36629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f36630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f36631f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f36632t;

    public /* synthetic */ h(e2.l lVar, e2.v vVar, String str, fz.c cVar, boolean z11, Resources resources) {
        this.f36630e = lVar;
        this.f36629d = vVar;
        this.f36631f = str;
        this.f36627b = cVar;
        this.f36628c = z11;
        this.f36632t = resources;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x010d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0111  */
    /* JADX WARN: Code duplicated, block: B:29:0x012c  */
    /* JADX WARN: Code duplicated, block: B:33:0x019a  */
    /* JADX WARN: Code duplicated, block: B:36:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x01db  */
    /* JADX WARN: Code duplicated, block: B:47:0x0224  */
    /* JADX WARN: Code duplicated, block: B:49:0x0284  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        int i11;
        boolean z12;
        z1.o oVar;
        z1.o oVar2;
        int iHashCode;
        c3 c3Var;
        boolean zH;
        Object objQ;
        o3.f0 qVar;
        boolean zF;
        Object objQ2;
        int i12;
        boolean z13;
        boolean z14;
        int i13 = this.f36626a;
        l1.g gVar = l1.m.f39353a;
        fz.c cVar = this.f36627b;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj4 = this.f36632t;
        Object obj5 = this.f36631f;
        Object obj6 = this.f36629d;
        Object obj7 = this.f36630e;
        switch (i13) {
            case 0:
                kr.m mVar = (kr.m) obj7;
                fz.a aVar = (fz.a) obj6;
                fz.c cVar2 = (fz.c) obj4;
                fz.a aVar2 = (fz.a) obj5;
                t1 paddingValues = (t1) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(paddingValues, "paddingValues");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).f(paddingValues) ? 4 : 2;
                }
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    sVar.W();
                } else {
                    z1.o oVar3 = z1.o.f58481a;
                    z1.r rVarH = d0.n.h(j0.c.z(oVar3, paddingValues), ((s1) sVar.j(v1.f31180a)).f31033p, g2.f0.f28556b);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarH);
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
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar);
                    boolean zBooleanValue = ((Boolean) sVar.j(ju.f.f37376j)).booleanValue();
                    boolean z15 = this.f36628c;
                    fz.c cVar3 = this.f36627b;
                    if (zBooleanValue) {
                        sVar.d0(1063430183);
                        z1.r rVarD = e2.d(oVar3, 1.0f);
                        a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
                        int iHashCode3 = Long.hashCode(sVar.T);
                        q1 q1VarL2 = sVar.l();
                        z1.r rVarC2 = z1.a.c(sVar, rVarD);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(hVar, a2VarA, sVar);
                        l1.t.J(hVar2, q1VarL2, sVar);
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        }
                        l1.t.J(hVar4, rVarC2, sVar);
                        kr.l lVar = (kr.l) mVar;
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        a.d(lVar, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), sVar, 0, 0);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        a.c(lVar, e2.c(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f), z15, aVar, cVar3, cVar2, aVar2, sVar, 0);
                        sVar.p(true);
                        sVar.p(false);
                        z11 = true;
                    } else {
                        sVar.d0(1064281691);
                        z1.r rVarD2 = e2.d(oVar3, 1.0f);
                        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                        int iHashCode4 = Long.hashCode(sVar.T);
                        q1 q1VarL3 = sVar.l();
                        z1.r rVarC3 = z1.a.c(sVar, rVarD2);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(hVar, uVarA, sVar);
                        l1.t.J(hVar2, q1VarL3, sVar);
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar3);
                        }
                        l1.t.J(hVar4, rVarC3, sVar);
                        kr.l lVar2 = (kr.l) mVar;
                        a.d(lVar2, null, sVar, 0, 2);
                        a.c(lVar2, e2.d(oVar3, 1.0f), z15, aVar, cVar3, cVar2, aVar2, sVar, 48);
                        z11 = true;
                        sVar.p(true);
                        sVar.p(false);
                    }
                    sVar.p(z11);
                }
                break;
            case 1:
                List list = (yy.a) obj7;
                je jeVar = (je) obj5;
                fz.a aVar3 = (fz.a) obj6;
                String str = (String) obj4;
                u0 FlowRow = (u0) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(FlowRow, "$this$FlowRow");
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    sVar2.W();
                } else {
                    sVar2.d0(-45944133);
                    ry.e eVar = (ry.e) list;
                    eVar.getClass();
                    e00.i iVar2 = new e00.i(eVar, 6);
                    while (iVar2.hasNext()) {
                        je jeVar2 = (je) iVar2.next();
                        boolean z16 = jeVar2 == jeVar;
                        float f5 = f4.f30233a;
                        c3 c3Var2 = v1.f31180a;
                        r7 r7VarA = f4.a(g2.x.c(((s1) sVar2.j(c3Var2)).f31017a, 0.16f), ((s1) sVar2.j(c3Var2)).f31017a, sVar2);
                        boolean zF2 = sVar2.f(cVar) | sVar2.d(jeVar2.ordinal()) | sVar2.d(jeVar == null ? -1 : jeVar.ordinal());
                        Object objQ3 = sVar2.Q();
                        if (zF2 || objQ3 == gVar) {
                            objQ3 = new mt.l0(cVar, jeVar2, jeVar, 0);
                            sVar2.o0(objQ3);
                        }
                        m1.a(z16, (fz.a) objQ3, t1.e.d(637470711, new mt.r(jeVar2, 1), sVar2), null, true, null, r7VarA, null, null, sVar2, 384);
                    }
                    sVar2.p(false);
                    float f11 = f4.f30233a;
                    c3 c3Var3 = v1.f31180a;
                    m1.a(this.f36628c, aVar3, t1.e.d(442418905, new bp.e0(str, 19), sVar2), null, true, null, f4.a(g2.x.c(((s1) sVar2.j(c3Var3)).f31017a, 0.16f), ((s1) sVar2.j(c3Var3)).f31017a, sVar2), null, null, sVar2, 384);
                }
                break;
            case 2:
                q2 q2Var = (q2) obj7;
                fz.a aVar4 = (fz.a) obj6;
                fz.c cVar4 = (fz.c) obj4;
                b1 b1Var = (b1) obj5;
                j0.v ModalBottomSheet = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                l1.s sVar3 = (l1.s) nVar3;
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    sVar3.W();
                } else {
                    boolean zF3 = sVar3.f(cVar);
                    Object objQ4 = sVar3.Q();
                    if (zF3 || objQ4 == gVar) {
                        objQ4 = new o1(cVar, 16);
                        sVar3.o0(objQ4);
                    }
                    fz.c cVar5 = (fz.c) objQ4;
                    boolean zF4 = sVar3.f(aVar4);
                    Object objQ5 = sVar3.Q();
                    if (zF4 || objQ5 == gVar) {
                        objQ5 = new fu.e(8, aVar4, b1Var);
                        sVar3.o0(objQ5);
                    }
                    fz.a aVar5 = (fz.a) objQ5;
                    boolean zF5 = sVar3.f(cVar) | sVar3.f(cVar4);
                    Object objQ6 = sVar3.Q();
                    if (zF5 || objQ6 == gVar) {
                        objQ6 = new fu.j0(cVar, cVar4, b1Var, 22);
                        sVar3.o0(objQ6);
                    }
                    p2.c(this.f36628c, q2Var, false, cVar5, aVar5, (fz.c) objQ6, sVar3, 0, 4);
                }
                break;
            case 3:
                e2.l lVar3 = (e2.l) obj7;
                e2.v vVar = (e2.v) obj6;
                String str2 = (String) obj5;
                Resources resources = (Resources) obj4;
                j0.v OutlinedCard = (j0.v) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                l1.s sVar4 = (l1.s) nVar4;
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    sVar4.W();
                } else {
                    z1.o oVar4 = z1.o.f58481a;
                    float f12 = 20;
                    z1.r rVarE = j0.c.E(e2.d(oVar4, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, 11);
                    a2 a2VarA2 = z1.a(j0.i.f35303a, z1.c.M, sVar4, 48);
                    int iHashCode5 = Long.hashCode(sVar4.T);
                    q1 q1VarL4 = sVar4.l();
                    z1.r rVarC4 = z1.a.c(sVar4, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar3);
                    } else {
                        sVar4.r0();
                    }
                    y2.h hVar5 = y2.j.f56917f;
                    l1.t.J(hVar5, a2VarA2, sVar4);
                    y2.h hVar6 = y2.j.f56916e;
                    l1.t.J(hVar6, q1VarL4, sVar4);
                    y2.h hVar7 = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar7);
                    }
                    y2.h hVar8 = y2.j.f56915d;
                    l1.t.J(hVar8, rVarC4, sVar4);
                    d0.n.c(se.k.y(R.drawable.ep_splash_login_icon_email, sVar4, 0), BuildConfig.VERSION_NAME, j0.c.E(oVar4, f12, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, 10), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 432, 120);
                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, 0);
                    int iHashCode6 = Long.hashCode(sVar4.T);
                    q1 q1VarL5 = sVar4.l();
                    z1.r rVarC5 = z1.a.c(sVar4, oVar4);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar3);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar5, uVarA2, sVar4);
                    l1.t.J(hVar6, q1VarL5, sVar4);
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar4, iHashCode6, hVar7);
                    }
                    l1.t.J(hVar8, rVarC5, sVar4);
                    la laVar = la.f30616a;
                    long j11 = g2.x.f28621h;
                    c3 c3Var4 = v1.f31180a;
                    ha haVarC = la.c(((s1) sVar4.j(c3Var4)).f31034q, 0L, 0L, j11, j11, j11, j11, 0L, j11, j11, sVar4, 2147477262);
                    y0 y0VarA = y0.a((y0) sVar4.j(ua.f31167a), 0L, j3.A(18), null, null, null, 0L, null, null, 0, 4, 0L, null, 16711677);
                    r0 r0Var = new r0(6, 7, 115);
                    boolean zH2 = sVar4.h(lVar3);
                    Object objQ7 = sVar4.Q();
                    if (zH2 || objQ7 == gVar) {
                        objQ7 = new uu.i(lVar3, 1);
                        sVar4.o0(objQ7);
                    }
                    s0.q0 q0Var = new s0.q0((fz.c) objQ7, null, 62);
                    z1.r rVarE2 = e2.e(e2.d.j(oVar4, vVar), 1.0f);
                    boolean zF6 = sVar4.f(cVar);
                    Object objQ8 = sVar4.Q();
                    if (zF6 || objQ8 == gVar) {
                        i11 = 5;
                        objQ8 = new uu.b(cVar, 5);
                        sVar4.o0(objQ8);
                    } else {
                        i11 = 5;
                    }
                    fz.c cVar6 = (fz.c) objQ8;
                    t1.d dVarD = t1.e.d(1543553125, new lr.c(resources, 6), sVar4);
                    boolean z17 = this.f36628c;
                    qa.a(str2, cVar6, rVarE2, false, y0VarA, dVarD, t1.e.d(-1744344413, new at.m(z17, i11), sVar4), z17, null, r0Var, q0Var, true, 0, 0, null, haVarC, sVar4, 817889280, 12582912, 3956056);
                    if (z17) {
                        sVar4.d0(1941902556);
                        ua.b(ub.a.e0(sVar4, R.string.the_format_of_email_is_incorrect), j0.c.E(oVar4, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), ((s1) sVar4.j(c3Var4)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar4.j(fc.f30256a)).f30181o, sVar4, 48, 0, 65528);
                        z12 = false;
                    } else {
                        z12 = false;
                        sVar4.d0(1914093944);
                    }
                    sVar4.p(z12);
                    sVar4.p(true);
                    sVar4.p(true);
                }
                break;
            default:
                e2.l lVar4 = (e2.l) obj7;
                String str3 = (String) obj6;
                b1 b1Var2 = (b1) obj5;
                Resources resources2 = (Resources) obj4;
                j0.v OutlinedCard2 = (j0.v) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard2, "$this$OutlinedCard");
                l1.s sVar5 = (l1.s) nVar5;
                if (!sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    sVar5.W();
                } else {
                    z1.o oVar5 = z1.o.f58481a;
                    float f13 = 20;
                    z1.r rVarE3 = j0.c.E(e2.d(oVar5, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, 11);
                    a2 a2VarA3 = z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                    int iHashCode7 = Long.hashCode(sVar5.T);
                    q1 q1VarL6 = sVar5.l();
                    z1.r rVarC6 = z1.a.c(sVar5, rVarE3);
                    y2.k.J.getClass();
                    y2.i iVar4 = y2.j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar4);
                    } else {
                        sVar5.r0();
                    }
                    y2.h hVar9 = y2.j.f56917f;
                    l1.t.J(hVar9, a2VarA3, sVar5);
                    y2.h hVar10 = y2.j.f56916e;
                    l1.t.J(hVar10, q1VarL6, sVar5);
                    y2.h hVar11 = y2.j.f56918g;
                    if (!sVar5.S) {
                        oVar = oVar5;
                        if (!kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode7))) {
                        }
                        y2.h hVar12 = y2.j.f56915d;
                        l1.t.J(hVar12, rVarC6, sVar5);
                        k2.b bVarY = se.k.y(R.drawable.ep_splash_login_icon_password, sVar5, 0);
                        z1.r rVarE4 = j0.c.E(oVar, f13, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                        oVar2 = oVar;
                        d0.n.c(bVarY, BuildConfig.VERSION_NAME, rVarE4, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 432, 120);
                        j0.u uVarA3 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                        iHashCode = Long.hashCode(sVar5.T);
                        q1 q1VarL7 = sVar5.l();
                        z1.r rVarC7 = z1.a.c(sVar5, oVar2);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar4);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar9, uVarA3, sVar5);
                        l1.t.J(hVar10, q1VarL7, sVar5);
                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar5, iHashCode, hVar11);
                        }
                        l1.t.J(hVar12, rVarC7, sVar5);
                        la laVar2 = la.f30616a;
                        long j12 = g2.x.f28621h;
                        c3Var = v1.f31180a;
                        ha haVarC2 = la.c(((s1) sVar5.j(c3Var)).f31034q, 0L, 0L, j12, j12, j12, j12, 0L, j12, j12, sVar5, 2147477262);
                        y0 y0VarA2 = y0.a((y0) sVar5.j(ua.f31167a), 0L, j3.A(18), null, null, null, 0L, null, null, 0, 4, 0L, null, 16711677);
                        r0 r0Var2 = new r0(7, 7, 115);
                        zH = sVar5.h(lVar4);
                        objQ = sVar5.Q();
                        if (zH || objQ == gVar) {
                            objQ = new uu.i(lVar4, 0);
                            sVar5.o0(objQ);
                        }
                        s0.q0 q0Var2 = new s0.q0((fz.c) objQ, null, 62);
                        if (((Boolean) b1Var2.getValue()).booleanValue()) {
                            qVar = o3.e0.f44674a;
                        } else {
                            qVar = new o3.q();
                        }
                        o3.f0 f0Var = qVar;
                        z1.r rVarE5 = e2.e(oVar2, 1.0f);
                        zF = sVar5.f(cVar);
                        objQ2 = sVar5.Q();
                        if (!zF || objQ2 == gVar) {
                            i12 = 4;
                            objQ2 = new uu.b(cVar, 4);
                            sVar5.o0(objQ2);
                        } else {
                            i12 = 4;
                        }
                        fz.c cVar7 = (fz.c) objQ2;
                        t1.d dVarD2 = t1.e.d(-253450860, new lr.c(resources2, 5), sVar5);
                        z13 = this.f36628c;
                        qa.a(str3, cVar7, rVarE5, false, y0VarA2, dVarD2, t1.e.d(-405127982, new dt.g0(z13, b1Var2, i12), sVar5), z13, f0Var, r0Var2, q0Var2, true, 0, 0, null, haVarC2, sVar5, 817889664, 12582912, 3939672);
                        if (z13) {
                            sVar5.d0(1647160195);
                            ua.b(ub.a.e0(sVar5, R.string.the_password_can_not_be_less_than_6_digits), j0.c.E(oVar2, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), ((s1) sVar5.j(c3Var)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar5.j(fc.f30256a)).f30181o, sVar5, 48, 0, 65528);
                            z14 = false;
                        } else {
                            z14 = false;
                            sVar5.d0(1623004809);
                        }
                        sVar5.p(z14);
                        sVar5.p(true);
                        sVar5.p(true);
                    } else {
                        oVar = oVar5;
                    }
                    defpackage.e.A(iHashCode7, sVar5, iHashCode7, hVar11);
                    y2.h hVar13 = y2.j.f56915d;
                    l1.t.J(hVar13, rVarC6, sVar5);
                    k2.b bVarY2 = se.k.y(R.drawable.ep_splash_login_icon_password, sVar5, 0);
                    z1.r rVarE6 = j0.c.E(oVar, f13, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                    oVar2 = oVar;
                    d0.n.c(bVarY2, BuildConfig.VERSION_NAME, rVarE6, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 432, 120);
                    j0.u uVarA4 = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                    iHashCode = Long.hashCode(sVar5.T);
                    q1 q1VarL8 = sVar5.l();
                    z1.r rVarC8 = z1.a.c(sVar5, oVar2);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar4);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar9, uVarA4, sVar5);
                    l1.t.J(hVar10, q1VarL8, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar11);
                    } else {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar11);
                    }
                    l1.t.J(hVar13, rVarC8, sVar5);
                    la laVar3 = la.f30616a;
                    long j13 = g2.x.f28621h;
                    c3Var = v1.f31180a;
                    ha haVarC3 = la.c(((s1) sVar5.j(c3Var)).f31034q, 0L, 0L, j13, j13, j13, j13, 0L, j13, j13, sVar5, 2147477262);
                    y0 y0VarA3 = y0.a((y0) sVar5.j(ua.f31167a), 0L, j3.A(18), null, null, null, 0L, null, null, 0, 4, 0L, null, 16711677);
                    r0 r0Var3 = new r0(7, 7, 115);
                    zH = sVar5.h(lVar4);
                    objQ = sVar5.Q();
                    if (zH) {
                        objQ = new uu.i(lVar4, 0);
                        sVar5.o0(objQ);
                    } else {
                        objQ = new uu.i(lVar4, 0);
                        sVar5.o0(objQ);
                    }
                    s0.q0 q0Var3 = new s0.q0((fz.c) objQ, null, 62);
                    if (((Boolean) b1Var2.getValue()).booleanValue()) {
                        qVar = o3.e0.f44674a;
                    } else {
                        qVar = new o3.q();
                    }
                    o3.f0 f0Var2 = qVar;
                    z1.r rVarE7 = e2.e(oVar2, 1.0f);
                    zF = sVar5.f(cVar);
                    objQ2 = sVar5.Q();
                    if (zF) {
                        i12 = 4;
                        objQ2 = new uu.b(cVar, 4);
                        sVar5.o0(objQ2);
                    } else {
                        i12 = 4;
                        objQ2 = new uu.b(cVar, 4);
                        sVar5.o0(objQ2);
                    }
                    fz.c cVar8 = (fz.c) objQ2;
                    t1.d dVarD3 = t1.e.d(-253450860, new lr.c(resources2, 5), sVar5);
                    z13 = this.f36628c;
                    qa.a(str3, cVar8, rVarE7, false, y0VarA3, dVarD3, t1.e.d(-405127982, new dt.g0(z13, b1Var2, i12), sVar5), z13, f0Var2, r0Var3, q0Var3, true, 0, 0, null, haVarC3, sVar5, 817889664, 12582912, 3939672);
                    if (z13) {
                        sVar5.d0(1647160195);
                        ua.b(ub.a.e0(sVar5, R.string.the_password_can_not_be_less_than_6_digits), j0.c.E(oVar2, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), ((s1) sVar5.j(c3Var)).f31040w, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar5.j(fc.f30256a)).f30181o, sVar5, 48, 0, 65528);
                        z14 = false;
                    } else {
                        z14 = false;
                        sVar5.d0(1623004809);
                    }
                    sVar5.p(z14);
                    sVar5.p(true);
                    sVar5.p(true);
                }
                break;
        }
        return b0Var;
    }

    public /* synthetic */ h(e2.l lVar, String str, fz.c cVar, boolean z11, b1 b1Var, Resources resources) {
        this.f36630e = lVar;
        this.f36629d = str;
        this.f36627b = cVar;
        this.f36628c = z11;
        this.f36631f = b1Var;
        this.f36632t = resources;
    }

    public /* synthetic */ h(kr.m mVar, boolean z11, fz.a aVar, fz.c cVar, fz.c cVar2, fz.a aVar2) {
        this.f36630e = mVar;
        this.f36628c = z11;
        this.f36629d = aVar;
        this.f36627b = cVar;
        this.f36632t = cVar2;
        this.f36631f = aVar2;
    }

    public /* synthetic */ h(yy.a aVar, je jeVar, fz.c cVar, boolean z11, fz.a aVar2, String str) {
        this.f36630e = aVar;
        this.f36631f = jeVar;
        this.f36627b = cVar;
        this.f36628c = z11;
        this.f36629d = aVar2;
        this.f36632t = str;
    }

    public /* synthetic */ h(boolean z11, q2 q2Var, fz.c cVar, fz.a aVar, fz.c cVar2, b1 b1Var) {
        this.f36628c = z11;
        this.f36630e = q2Var;
        this.f36627b = cVar;
        this.f36629d = aVar;
        this.f36632t = cVar2;
        this.f36631f = b1Var;
    }
}
