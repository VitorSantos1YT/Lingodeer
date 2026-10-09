package fu;

import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import fr.n2;
import fr.p3;
import h1.ua;
import j0.a2;
import j0.c2;
import j0.e2;
import j0.z1;
import j3.y0;
import l1.a1;
import l1.b1;
import l1.b3;
import l1.g1;
import l1.q1;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w implements fz.f {
    public final /* synthetic */ b1 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28165a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f28166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f28167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28170f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b1 f28171t;

    public /* synthetic */ w(b1 b1Var, rz.b0 b0Var, hu.o oVar, fz.a aVar, a1 a1Var, b1 b1Var2, int i11) {
        this.f28166b = b1Var;
        this.f28169e = b0Var;
        this.f28170f = oVar;
        this.f28167c = aVar;
        this.f28171t = a1Var;
        this.H = b1Var2;
        this.f28168d = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f28165a) {
            case 0:
                b3 b3Var = (b3) this.f28169e;
                b3 b3Var2 = (b3) this.f28170f;
                g1 g1Var = (g1) this.f28171t;
                g1 g1Var2 = (g1) this.H;
                j0.v Card = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarG = d0.n.g(e2.d(oVar, 1.0f), p3.A(ns.o.L(b3Var.getValue(), b3Var2.getValue())), null, 6);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarG);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, uVarA, sVar);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar);
                    z1.r rVarG2 = e2.g(oVar, 52);
                    a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, rVarG2);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, a2VarA, sVar);
                    l1.t.J(hVar2, q1VarL2, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar);
                    c2 c2Var = c2.f35266a;
                    j0.c.g(sVar, c2Var.a(oVar, 1.0f));
                    b1 b1Var = this.f28166b;
                    a0.j0.b(c2Var, ((Boolean) b1Var.getValue()).booleanValue(), null, null, null, null, t1.e.d(1966951329, new bp.u(4, this.f28167c), sVar), sVar, 1572870, 30);
                    sVar.p(true);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        objQ = new n(0, g1Var, g1Var2);
                        sVar.o0(objQ);
                    }
                    a.o((fz.e) objQ, sVar, 6);
                    z1.r rVarY = j0.c.y(e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, -20, 1);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode3 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    z1.r rVarC3 = z1.a.c(sVar, rVarY);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, q0VarD, sVar);
                    l1.t.J(hVar2, q1VarL3, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                    }
                    l1.t.J(hVar4, rVarC3, sVar);
                    Boolean bool = (Boolean) b1Var.getValue();
                    bool.getClass();
                    Object objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new n2(9);
                        sVar.o0(objQ2);
                    }
                    final int i11 = this.f28168d;
                    a0.o.b(bool, null, (fz.c) objQ2, null, BuildConfig.VERSION_NAME, null, t1.e.d(1253064878, new fz.g() { // from class: fu.o
                        @Override // fz.g
                        public final Object f(Object obj4, Object obj5, Object obj6, Object obj7) {
                            a0.r AnimatedContent = (a0.r) obj4;
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            ((Integer) obj7).getClass();
                            kotlin.jvm.internal.m.f(AnimatedContent, "$this$AnimatedContent");
                            l1.s sVar2 = (l1.s) ((l1.n) obj6);
                            if (zBooleanValue) {
                                sVar2.d0(-1799896657);
                                z1.o oVar2 = z1.o.f58481a;
                                z1.r rVarD = e2.d(oVar2, 1.0f);
                                j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar2, 48);
                                int iHashCode4 = Long.hashCode(sVar2.T);
                                q1 q1VarL4 = sVar2.l();
                                z1.r rVarC4 = z1.a.c(sVar2, rVarD);
                                y2.k.J.getClass();
                                y2.i iVar2 = y2.j.f56913b;
                                sVar2.h0();
                                if (sVar2.S) {
                                    sVar2.k(iVar2);
                                } else {
                                    sVar2.r0();
                                }
                                l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                                l1.t.J(y2.j.f56916e, q1VarL4, sVar2);
                                y2.h hVar5 = y2.j.f56918g;
                                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                                    defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar5);
                                }
                                l1.t.J(y2.j.f56915d, rVarC4, sVar2);
                                a.q(i11, null, sVar2, 0, 2);
                                ua.b(oz.x.q0(ub.a.e0(sVar2, R.string.s_day_streak), "%s", BuildConfig.VERSION_NAME), j0.c.y(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 12, 1), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), g2.x.f28618e, j3.A(26), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar2, 48, 0, 65532);
                                sVar2.p(true);
                            } else {
                                sVar2.d0(-1812302764);
                            }
                            sVar2.p(false);
                            return qy.b0.f48488a;
                        }
                    }, sVar), sVar, 1597824, 42);
                    sVar.p(true);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                rz.b0 b0Var = (rz.b0) this.f28169e;
                hu.o oVar2 = (hu.o) this.f28170f;
                a1 a1Var = (a1) this.f28171t;
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                l1.s sVar2 = (l1.s) ((l1.n) obj2);
                b1 b1Var2 = this.f28166b;
                boolean zF = sVar2.f(b1Var2) | sVar2.h(b0Var) | sVar2.h(oVar2);
                fz.a aVar = this.f28167c;
                boolean zF2 = zF | sVar2.f(aVar);
                Object objQ3 = sVar2.Q();
                if (zF2 || objQ3 == l1.m.f39353a) {
                    objQ3 = new bt.c2(b0Var, aVar, b1Var2, oVar2, a1Var, this.H);
                    sVar2.o0(objQ3);
                }
                float f5 = 36;
                iu.k.e((fz.a) objQ3, e2.e(j0.c.E(j0.c.C(z1.o.f58481a, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7), 1.0f), false, 0L, null, t1.e.d(1939709109, new b0(this.f28168d, 0), sVar2), sVar2, 196656, 28);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ w(b3 b3Var, b3 b3Var2, b1 b1Var, fz.a aVar, g1 g1Var, g1 g1Var2, int i11) {
        this.f28169e = b3Var;
        this.f28170f = b3Var2;
        this.f28166b = b1Var;
        this.f28167c = aVar;
        this.f28171t = g1Var;
        this.H = g1Var2;
        this.f28168d = i11;
    }
}
