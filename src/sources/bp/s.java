package bp;

import bt.z6;
import com.lingo.story.ui.StoryActivity;
import com.lingodeer.R;
import h1.k7;
import h1.qa;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4799b;

    public /* synthetic */ s(int i11, l1.b1 b1Var) {
        this.f4798a = 11;
        this.f4799b = b1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        k2.b bVarY;
        int i11 = this.f4798a;
        z1.o oVar = z1.o.f58481a;
        l1.g gVar = l1.m.f39353a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f4799b;
        switch (i11) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    Object objQ = sVar.Q();
                    if (objQ == gVar) {
                        objQ = new p(3, b1Var);
                        sVar.o0(objQ);
                    }
                    k7.m((fz.a) objQ, null, false, null, null, null, g1.f4587c, sVar, 805306374, 510);
                }
                break;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    Object objQ2 = sVar2.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new z6(28, b1Var);
                        sVar2.o0(objQ2);
                    }
                    k7.m((fz.a) objQ2, null, false, null, null, null, dt.e.f23756c, sVar2, 805306374, 510);
                }
                break;
            case 2:
                s2.t change = (s2.t) obj;
                f2.b bVar = (f2.b) obj2;
                kotlin.jvm.internal.m.f(change, "change");
                change.a();
                dt.e.x((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.f26570a >> 32)) + Float.intBitsToFloat((int) (dt.e.w(b1Var) >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.f26570a & 4294967295L)) + Float.intBitsToFloat((int) (dt.e.w(b1Var) & 4294967295L)))) & 4294967295L), b1Var);
                break;
            case 3:
                ((Integer) obj).getClass();
                ((Long) obj2).getClass();
                int i12 = StoryActivity.N;
                b1Var.setValue(Boolean.TRUE);
                break;
            case 4:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sVar3.W();
                } else {
                    Object objQ3 = sVar3.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new dt.h2(23, b1Var);
                        sVar3.o0(objQ3);
                    }
                    k7.m((fz.a) objQ3, null, false, null, null, null, jr.a.f36562g, sVar3, 805306374, 510);
                }
                break;
            case 5:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    sVar4.W();
                } else {
                    Object objQ4 = sVar4.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new mt.q(2, b1Var);
                        sVar4.o0(objQ4);
                    }
                    k7.m((fz.a) objQ4, null, false, null, null, null, mt.g.m, sVar4, 805306374, 510);
                }
                break;
            case 6:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (!sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    sVar5.W();
                } else {
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar5, 0);
                    int iHashCode = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL = sVar5.l();
                    z1.r rVarC = z1.a.c(sVar5, oVar);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, sVar5);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar5);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar5);
                    Object objQ5 = sVar5.Q();
                    if (objQ5 == gVar) {
                        objQ5 = new mt.q(6, b1Var);
                        sVar5.o0(objQ5);
                    }
                    k7.m((fz.a) objQ5, null, false, null, null, null, mt.g.D, sVar5, 805306374, 510);
                    sVar5.p(true);
                }
                break;
            case 7:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar6;
                if (!sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    sVar6.W();
                } else {
                    Object objQ6 = sVar6.Q();
                    if (objQ6 == gVar) {
                        objQ6 = new mt.q(14, b1Var);
                        sVar6.o0(objQ6);
                    }
                    k7.m((fz.a) objQ6, null, false, null, null, null, mt.g.G, sVar6, 805306374, 510);
                }
                break;
            case 8:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar7;
                if (!sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    sVar7.W();
                } else {
                    Object objQ7 = sVar7.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new mt.q(13, b1Var);
                        sVar7.o0(objQ7);
                    }
                    k7.m((fz.a) objQ7, null, false, null, null, null, mt.g.A, sVar7, 805306374, 510);
                }
                break;
            case 9:
                l1.n nVar8 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.s sVar8 = (l1.s) nVar8;
                if (!sVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    sVar8.W();
                } else {
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar8, 0);
                    int iHashCode2 = Long.hashCode(sVar8.T);
                    l1.q1 q1VarL2 = sVar8.l();
                    z1.r rVarC2 = z1.a.c(sVar8, oVar);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar8.h0();
                    if (sVar8.S) {
                        sVar8.k(iVar2);
                    } else {
                        sVar8.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar8);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar8);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar8, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar8);
                    int iIntValue9 = ((Number) b1Var.getValue()).intValue();
                    Object objQ8 = sVar8.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new mt.q(9, b1Var);
                        sVar8.o0(objQ8);
                    }
                    mt.g.j(15, iIntValue9, 390, (fz.a) objQ8, sVar8);
                    int iIntValue10 = ((Number) b1Var.getValue()).intValue();
                    Object objQ9 = sVar8.Q();
                    if (objQ9 == gVar) {
                        objQ9 = new mt.q(10, b1Var);
                        sVar8.o0(objQ9);
                    }
                    mt.g.j(25, iIntValue10, 390, (fz.a) objQ9, sVar8);
                    int iIntValue11 = ((Number) b1Var.getValue()).intValue();
                    Object objQ10 = sVar8.Q();
                    if (objQ10 == gVar) {
                        objQ10 = new mt.q(11, b1Var);
                        sVar8.o0(objQ10);
                    }
                    mt.g.j(35, iIntValue11, 390, (fz.a) objQ10, sVar8);
                    int iIntValue12 = ((Number) b1Var.getValue()).intValue();
                    Object objQ11 = sVar8.Q();
                    if (objQ11 == gVar) {
                        objQ11 = new mt.q(12, b1Var);
                        sVar8.o0(objQ11);
                    }
                    mt.g.j(50, iIntValue12, 390, (fz.a) objQ11, sVar8);
                    sVar8.p(true);
                }
                break;
            case 10:
                l1.n nVar9 = (l1.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                l1.s sVar9 = (l1.s) nVar9;
                if (!sVar9.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    sVar9.W();
                } else {
                    Object objQ12 = sVar9.Q();
                    if (objQ12 == gVar) {
                        objQ12 = new mt.w1(17, b1Var);
                        sVar9.o0(objQ12);
                    }
                    k7.m((fz.a) objQ12, null, false, null, null, null, mt.g.f41459v0, sVar9, 805306374, 510);
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                qu.o.a(b1Var, (l1.n) obj, l1.t.M(7));
                break;
            case 12:
                l1.n nVar10 = (l1.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                l1.s sVar10 = (l1.s) nVar10;
                if (!sVar10.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    sVar10.W();
                } else {
                    if (((Boolean) b1Var.getValue()).booleanValue()) {
                        sVar10.d0(1788514313);
                        bVarY = se.k.y(R.drawable.baseline_visibility_24, sVar10, 0);
                        sVar10.p(false);
                    } else {
                        sVar10.d0(1788517453);
                        bVarY = se.k.y(R.drawable.baseline_visibility_off_24, sVar10, 0);
                        sVar10.p(false);
                    }
                    String str = ((Boolean) b1Var.getValue()).booleanValue() ? "Hide password" : "Show password";
                    Object objQ13 = sVar10.Q();
                    if (objQ13 == gVar) {
                        objQ13 = new pr.z(22, b1Var);
                        sVar10.o0(objQ13);
                    }
                    k7.h((fz.a) objQ13, null, false, null, t1.e.d(2070822500, new uu.j(bVarY, str, 1), sVar10), sVar10, 196614, 30);
                }
                break;
            default:
                l1.n nVar11 = (l1.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                l1.s sVar11 = (l1.s) nVar11;
                if (!sVar11.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    sVar11.W();
                } else {
                    String str2 = (String) b1Var.getValue();
                    boolean zF = sVar11.f(b1Var);
                    Object objQ14 = sVar11.Q();
                    if (zF || objQ14 == gVar) {
                        objQ14 = new xu.v(0, b1Var);
                        sVar11.o0(objQ14);
                    }
                    qa.a(str2, (fz.c) objQ14, null, false, j3.y0.a((j3.y0) sVar11.j(ua.f31167a), 0L, fr.j3.A(16), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), null, null, false, null, null, null, false, 0, 0, null, null, sVar11, 0, 0, 8388572);
                }
                break;
        }
        return b0Var;
    }

    public /* synthetic */ s(l1.b1 b1Var, int i11, byte b3) {
        this.f4798a = i11;
        this.f4799b = b1Var;
    }
}
