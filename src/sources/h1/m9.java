package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.data.model.AchievementLevelType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30695a = AchievementLevelType.DAY_STREAK_LV_7;

    /* JADX WARN: Code duplicated, block: B:41:0x011a  */
    /* JADX WARN: Code duplicated, block: B:42:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0139  */
    /* JADX WARN: Code duplicated, block: B:50:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x0159  */
    /* JADX WARN: Code duplicated, block: B:54:0x0160  */
    /* JADX WARN: Code duplicated, block: B:55:0x0162  */
    /* JADX WARN: Code duplicated, block: B:62:0x0172  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c3  */
    public static final void a(n9 n9Var, z1.r rVar, boolean z11, boolean z12, boolean z13, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        int iHashCode;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objQ;
        z1.r rVar2;
        int iHashCode2;
        t1.d dVar2;
        boolean z17;
        t1.d dVar3 = bp.g1.f4585a;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-402577235);
        int i13 = i11 | (sVar.f(n9Var) ? 4 : 2) | 384 | (sVar.g(z12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | 196608;
        if ((599187 & i13) == 599186 && sVar.F()) {
            sVar.W();
            rVar2 = rVar;
            z17 = z13;
            dVar2 = dVar;
        } else {
            boolean z18 = sVar.j(z2.g1.f58552n) == v3.m.Rtl;
            ob.s sVar2 = n9Var.f30744b;
            f0.h1 h1Var = f0.h1.Horizontal;
            boolean z19 = ((o9) ((l1.k1) sVar2.f44881g).getValue()) == o9.Settled;
            i1.v vVar = (i1.v) sVar2.f44880f;
            boolean z20 = ((l1.k1) sVar2.f44886l).getValue() != null;
            i1.l lVar = new i1.l(sVar2, null);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarA = f0.p0.a(oVar, vVar, h1Var, z19, null, z20, lVar, false, 32);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, true);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
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
            if (sVar.S) {
                i12 = i13;
            } else {
                i12 = i13;
                if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, sVar);
                z1.r rVarB = j0.r.f35391a.b();
                j0.b bVar = j0.i.f35303a;
                z1.i iVar2 = z1.c.L;
                j0.a2 a2VarA = j0.z1.a(bVar, iVar2, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarB);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, a2VarA, sVar);
                l1.t.J(hVar2, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                }
                l1.t.J(hVar4, rVarC2, sVar);
                j0.c2 c2Var = j0.c2.f35266a;
                dVar3.invoke(c2Var, sVar, 54);
                sVar.p(true);
                ob.s sVar3 = n9Var.f30744b;
                boolean zG = sVar.g(z18);
                if ((i12 & 57344) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z21 = zG | z14;
                if ((i12 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z21 | z15;
                objQ = sVar.Q();
                if (z16 || objQ == l1.m.f39353a) {
                    objQ = new k9(n9Var, z11, z18, z12);
                    sVar.o0(objQ);
                }
                rVar2 = oVar;
                z1.r rVarE = i1.p.e(rVar2, sVar3, h1Var, (fz.e) objQ);
                j0.a2 a2VarA2 = j0.z1.a(bVar, iVar2, sVar, 0);
                iHashCode2 = Long.hashCode(sVar.T);
                l1.q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, rVarE);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, a2VarA2, sVar);
                l1.t.J(hVar2, q1VarL3, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC3, sVar);
                dVar2 = dVar;
                dVar2.invoke(c2Var, sVar, 54);
                sVar.p(true);
                sVar.p(true);
                z17 = true;
            }
            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            z1.r rVarB2 = j0.r.f35391a.b();
            j0.b bVar2 = j0.i.f35303a;
            z1.i iVar3 = z1.c.L;
            j0.a2 a2VarA3 = j0.z1.a(bVar2, iVar3, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarB2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA3, sVar);
            l1.t.J(hVar2, q1VarL4, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            l1.t.J(hVar5, rVarC4, sVar);
            j0.c2 c2Var2 = j0.c2.f35266a;
            dVar3.invoke(c2Var2, sVar, 54);
            sVar.p(true);
            ob.s sVar4 = n9Var.f30744b;
            boolean zG2 = sVar.g(z18);
            if ((i12 & 57344) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z22 = zG2 | z14;
            if ((i12 & 14) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z22 | z15;
            objQ = sVar.Q();
            if (z16) {
                objQ = new k9(n9Var, z11, z18, z12);
                sVar.o0(objQ);
            } else {
                objQ = new k9(n9Var, z11, z18, z12);
                sVar.o0(objQ);
            }
            rVar2 = oVar;
            z1.r rVarE2 = i1.p.e(rVar2, sVar4, h1Var, (fz.e) objQ);
            j0.a2 a2VarA4 = j0.z1.a(bVar2, iVar3, sVar, 0);
            iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA4, sVar);
            l1.t.J(hVar2, q1VarL5, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            } else {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar5, rVarC5, sVar);
            dVar2 = dVar;
            dVar2.invoke(c2Var2, sVar, 54);
            sVar.p(true);
            sVar.p(true);
            z17 = true;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new l9(n9Var, rVar2, z11, z12, z17, dVar2, i11);
        }
    }
}
