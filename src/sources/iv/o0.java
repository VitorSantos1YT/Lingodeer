package iv;

import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.z1;
import l1.c3;
import l1.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34798c;

    public /* synthetic */ o0(String str, String str2, int i11) {
        this.f34796a = i11;
        this.f34797b = str;
        this.f34798c = str2;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f34796a) {
            case 0:
                j0.q PressableCard = (j0.q) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(PressableCard, "$this$PressableCard");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.o oVar = z1.o.f58481a;
                    float f5 = 4;
                    z1.r rVarA = j0.c.A(e2.n(oVar, 70), f5);
                    j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar, 54);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarA);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    l1.d0 d0Var = ua.f31167a;
                    j3.y0 y0Var = (j3.y0) sVar.j(d0Var);
                    long jA = j3.A(20);
                    n3.s sVar2 = n3.s.K;
                    c3 c3Var = v1.f31180a;
                    iu.k.c(this.f34797b, j0.c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, 1), j3.y0.a(y0Var, ((s1) sVar.j(c3Var)).f31034q, jA, sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 1, 0, new s0.g(j3.A(10), j3.A(20), j3.A(1)), sVar, 1572912, 184);
                    iu.k.c(this.f34798c, null, j3.y0.a((j3.y0) sVar.j(d0Var), ((s1) sVar.j(c3Var)).f31036s, j3.A(14), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 1, 0, new s0.g(j3.A(6), j3.A(14), j3.A(1)), sVar, 1572864, 186);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                j0.q PressableCard2 = (j0.q) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(PressableCard2, "$this$PressableCard");
                l1.s sVar3 = (l1.s) nVar2;
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    float f11 = 6;
                    z1.r rVarB = j0.c.B(e2.i(e2.e(z1.o.f58481a, 1.0f), 40, CropImageView.DEFAULT_ASPECT_RATIO, 2), f11, f11);
                    a2 a2VarA = z1.a(j0.i.g(4), z1.c.M, sVar3, 54);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    q1 q1VarL2 = sVar3.l();
                    z1.r rVarC2 = z1.a.c(sVar3, rVarB);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, sVar3);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar3);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar3);
                    l1.d0 d0Var2 = ua.f31167a;
                    j3.y0 y0VarA = j3.y0.a((j3.y0) sVar3.j(d0Var2), ((s1) sVar3.j(v1.f31180a)).f31034q, j3.A(20), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440);
                    s0.g gVar = new s0.g(j3.A(10), j3.A(20), j3.A(1));
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    iu.k.c(this.f34797b, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), y0VarA, 0, false, 1, 0, gVar, sVar3, 1572864, 184);
                    j3.y0 y0VarA2 = j3.y0.a((j3.y0) sVar3.j(d0Var2), g2.f0.e(4287468707L), j3.A(14), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212);
                    s0.g gVar2 = new s0.g(j3.A(6), j3.A(14), j3.A(1));
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    iu.k.c(this.f34798c, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), y0VarA2, 0, false, 2, 0, gVar2, sVar3, 1572864, 184);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                break;
            default:
                j0.q PressableCard3 = (j0.q) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(PressableCard3, "$this$PressableCard");
                l1.s sVar4 = (l1.s) nVar3;
                if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    float f12 = 70;
                    z1.o oVar2 = z1.o.f58481a;
                    float f13 = 4;
                    z1.r rVarA2 = j0.c.A(e2.r(oVar2, f12, f12, CropImageView.DEFAULT_ASPECT_RATIO, 12), f13);
                    j0.u uVarA2 = j0.t.a(j0.i.f35307e, z1.c.P, sVar4, 54);
                    int iHashCode3 = Long.hashCode(sVar4.T);
                    q1 q1VarL3 = sVar4.l();
                    z1.r rVarC3 = z1.a.c(sVar4, rVarA2);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar3);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar4);
                    l1.t.J(y2.j.f56916e, q1VarL3, sVar4);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar3);
                    }
                    l1.t.J(y2.j.f56915d, rVarC3, sVar4);
                    l1.d0 d0Var3 = ua.f31167a;
                    iu.k.c(this.f34797b, j0.c.C(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f13, 1), j3.y0.a((j3.y0) sVar4.j(d0Var3), g2.x.f28615b, j3.A(20), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 1, 0, new s0.g(j3.A(10), j3.A(20), j3.A(1)), sVar4, 1572912, 184);
                    iu.k.c(this.f34798c, null, j3.y0.a((j3.y0) sVar4.j(d0Var3), g2.f0.e(4287468707L), j3.A(14), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), 0, false, 1, 0, new s0.g(j3.A(6), j3.A(14), j3.A(1)), sVar4, 1572864, 186);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
