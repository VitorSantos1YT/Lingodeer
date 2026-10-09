package km;

import bt.q3;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.u3;
import fr.j3;
import fr.p3;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l1.c3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b1 {
    public static final z1.r A(z1.r rVar, fz.a aVar) {
        return aVar == null ? rVar : d0.n.o(rVar, false, null, aVar, 15);
    }

    public static final long B(r rVar, l1.n nVar) {
        l1.s sVar = (l1.s) nVar;
        h1.s1 s1Var = (h1.s1) sVar.j(h1.v1.f31180a);
        switch (a1.f38154a[rVar.ordinal()]) {
            case 1:
                sVar.d0(1791932397);
                sVar.p(false);
                return s1Var.f31034q;
            case 2:
                sVar.d0(1791934612);
                sVar.p(false);
                return s1Var.f31036s;
            case 3:
                sVar.d0(1791936747);
                sVar.p(false);
                return s1Var.f31033p;
            case 4:
                sVar.d0(1791938603);
                sVar.p(false);
                return s1Var.f31017a;
            case 5:
                sVar.d0(1791940756);
                sVar.p(false);
                return s1Var.f31021c;
            case 6:
                sVar.d0(1791942858);
                kotlin.jvm.internal.m.f(s1Var, "<this>");
                long j11 = d0.n.t(sVar) ? ju.a.f37299c1 : ju.a.Z;
                sVar.p(false);
                return j11;
            default:
                throw nv.p.x(sVar, 1791930681, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public static final void a(int i11, int i12, long j11, String str, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        int i13;
        boolean z11;
        l1.s sVar;
        long j12;
        l1.x1 x1VarT;
        z1.r rVar3;
        long j13;
        int i14;
        z1.r rVar4;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1417500369);
        int i15 = i11 | (sVar2.f(str) ? 4 : 2);
        int i16 = i12 & 2;
        if (i16 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i15 |= sVar2.f(rVar2) ? 32 : 16;
            }
            i13 = i15 | 128;
            if ((i13 & 147) != 146) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i13 & 1, z11)) {
                sVar2.Y();
                if ((i11 & 1) != 0 || sVar2.C()) {
                    if (i16 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    j13 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s;
                    z1.r rVar5 = rVar3;
                    i14 = i13 & (-897);
                    rVar4 = rVar5;
                } else {
                    sVar2.W();
                    i14 = i13 & (-897);
                    rVar4 = rVar2;
                    j13 = j11;
                }
                sVar2.q();
                int i17 = (i14 & 14) | 3072 | (i14 & 112);
                long j14 = j13;
                sVar = sVar2;
                ua.b(str, rVar4, j14, j3.A(14), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, i17, 0, 131056);
                rVar2 = rVar4;
                j12 = j14;
            } else {
                sVar = sVar2;
                sVar.W();
                j12 = j11;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new at.n(str, rVar2, j12, i11, i12);
            }
        }
        i15 |= 48;
        rVar2 = rVar;
        i13 = i15 | 128;
        if ((i13 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i13 & 1, z11)) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                j13 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s;
                z1.r rVar6 = rVar3;
                i14 = i13 & (-897);
                rVar4 = rVar6;
            } else {
                if (i16 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                j13 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s;
                z1.r rVar7 = rVar3;
                i14 = i13 & (-897);
                rVar4 = rVar7;
            }
            sVar2.q();
            int i18 = (i14 & 14) | 3072 | (i14 & 112);
            long j15 = j13;
            sVar = sVar2;
            ua.b(str, rVar4, j15, j3.A(14), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, i18, 0, 131056);
            rVar2 = rVar4;
            j12 = j15;
        } else {
            sVar = sVar2;
            sVar.W();
            j12 = j11;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.n(str, rVar2, j12, i11, i12);
        }
    }

    public static final void b(t1.d dVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2098768918);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            float f5 = 2;
            z1.r rVarA = j0.c.A(d0.n.j(j0.e2.e(z1.o.f58481a, 1.0f), f5, ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a, g2.f0.f28556b), f5);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
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
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            hh.p0.x(6, dVar, sVar, true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.m(dVar, i11, 9);
        }
    }

    public static final void c(int i11, fz.a aVar, l1.n nVar, z1.r rVar) {
        int i12;
        fz.a aVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1297083586);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            z1.r rVarE = j0.e2.e(rVar, 1.0f);
            w2.q0 q0VarD = j0.o.d(z1.c.H, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarJ = j0.c.j(j0.e2.e(oVar, 1.0f), 2.3987207f);
            c3 c3Var = h1.v1.f31180a;
            j0.c.g(sVar, d0.n.g(rVarJ, p3.A(ns.o.L(new g2.x(g2.x.c(((h1.s1) sVar.j(c3Var)).f31033p, CropImageView.DEFAULT_ASPECT_RATIO)), new g2.x(((h1.s1) sVar.j(c3Var)).f31033p), new g2.x(((h1.s1) sVar.j(c3Var)).f31033p))), null, 6));
            float f5 = 16;
            aVar2 = aVar;
            iu.k.e(aVar2, j0.e2.g(j0.c.B(j0.e2.e(j0.c.v(oVar), 1.0f), f5, f5), 45), false, 0L, null, g.f38192b, sVar, (i12 & 14) | 196608, 28);
            sVar.p(true);
        } else {
            aVar2 = aVar;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.s0(i11, 1, aVar2, rVar);
        }
    }

    public static final void d(o oVar, fz.c cVar, z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar;
        z1.h hVar = z1.c.O;
        z1.i iVar = z1.c.L;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1198966866);
        int i12 = (i11 & 6) == 0 ? (sVar2.h(oVar) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.f(rVar) ? 256 : 128;
        }
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            z1.r rVarE = j0.e2.e(rVar, 1.0f);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarE);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar2);
            } else {
                sVar2.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, a2VarA, sVar2);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar2);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar2);
            float f5 = 2;
            j0.u uVarA = j0.t.a(j0.i.g(f5), hVar, sVar2, 6);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarC2 = z1.a.c(sVar2, oVar2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar2);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, uVarA, sVar2);
            l1.t.J(hVar3, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar2);
            float f11 = 60;
            int i13 = i12;
            g(BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, j0.e2.s(oVar2, f11), 0L, 0L, sVar2, 438, 24);
            sVar2.d0(1422149193);
            ArrayList arrayList = oVar.f38248a;
            int i14 = 0;
            for (int size = arrayList.size(); i14 < size; size = size) {
                p pVar = (p) arrayList.get(i14);
                g(pVar.f38257a, pVar.f38258b, j0.e2.s(oVar2, f11), B(pVar.f38260d, sVar2), B(pVar.f38261e, sVar2), sVar2, 384, 0);
                i14++;
                arrayList = arrayList;
            }
            sVar2.p(false);
            g(BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, j0.e2.s(oVar2, f11), 0L, 0L, sVar2, 438, 24);
            sVar2.p(true);
            j0.c.g(sVar2, j0.e2.s(oVar2, f5));
            double d5 = 1.0f;
            if (d5 <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var = new j0.i1(1.0f, true);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, hVar, sVar2, 0);
            int iHashCode3 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, i1Var);
            y2.k.J.getClass();
            y2.i iVar3 = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar3);
            } else {
                sVar2.r0();
            }
            y2.h hVar6 = y2.j.f56917f;
            l1.t.J(hVar6, uVarA2, sVar2);
            y2.h hVar7 = y2.j.f56916e;
            l1.t.J(hVar7, q1VarL3, sVar2);
            y2.h hVar8 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar8);
            }
            y2.h hVar9 = y2.j.f56915d;
            l1.t.J(hVar9, rVarC3, sVar2);
            j0.a2 a2VarA2 = j0.z1.a(j0.i.g(f5), iVar, sVar2, 6);
            int iHashCode4 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL4 = sVar2.l();
            z1.r rVarC4 = z1.a.c(sVar2, oVar2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar3);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar6, a2VarA2, sVar2);
            l1.t.J(hVar7, q1VarL4, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar8);
            }
            l1.t.J(hVar9, rVarC4, sVar2);
            sVar2.d0(-737180222);
            ArrayList arrayList2 = oVar.f38249b;
            int size2 = arrayList2.size();
            int i15 = 0;
            while (i15 < size2) {
                int i16 = i15 + 1;
                p pVar2 = (p) arrayList2.get(i15);
                int i17 = size2;
                String str = pVar2.f38257a;
                String str2 = pVar2.f38258b;
                if (d5 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                g(str, str2, new j0.i1(1.0f, true), B(pVar2.f38260d, sVar2), B(pVar2.f38261e, sVar2), sVar2, 0, 0);
                i15 = i16;
                size2 = i17;
            }
            sVar2.p(false);
            sVar2.p(true);
            j0.c.g(sVar2, j0.e2.g(oVar2, f5));
            sVar2.d0(1280666975);
            ArrayList arrayListG1 = ry.m.g1(oVar.f38250c, 5, 5);
            int size3 = arrayListG1.size();
            int i18 = 0;
            while (i18 < size3) {
                int i19 = i18 + 1;
                List list = (List) arrayListG1.get(i18);
                j0.a2 a2VarA3 = j0.z1.a(j0.i.g(f5), iVar, sVar2, 6);
                int iHashCode5 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL5 = sVar2.l();
                z1.r rVarC5 = z1.a.c(sVar2, oVar2);
                y2.k.J.getClass();
                y2.i iVar4 = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar4);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA3, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL5, sVar2);
                y2.h hVar10 = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode5))) {
                    defpackage.e.A(iHashCode5, sVar2, iHashCode5, hVar10);
                }
                Iterator itO = com.google.android.material.datepicker.d.o(sVar2, rVarC5, y2.j.f56915d, 894647351, list);
                while (true) {
                    float f12 = Float.MAX_VALUE;
                    if (!itO.hasNext()) {
                        break;
                    }
                    p pVar3 = (p) itO.next();
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    List list2 = list;
                    if (1.0f <= Float.MAX_VALUE) {
                        f12 = 1.0f;
                    }
                    l1.s sVar3 = sVar2;
                    m(pVar3, new j0.i1(f12, true), cVar, CropImageView.DEFAULT_ASPECT_RATIO, sVar3, (i13 << 3) & 896, 8);
                    list = list2;
                    sVar2 = sVar3;
                }
                l1.s sVar4 = sVar2;
                sVar4.p(false);
                sVar4.d0(894656035);
                int size4 = 5 - list.size();
                for (int i21 = 0; i21 < size4; i21++) {
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.c.g(sVar4, new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                }
                sVar4.p(false);
                sVar4.p(true);
                j0.c.g(sVar4, j0.e2.g(oVar2, f5));
                sVar2 = sVar4;
                i18 = i19;
            }
            sVar = sVar2;
            com.google.android.material.datepicker.d.B(sVar, false, true, true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h((Object) oVar, cVar, (Object) rVar, i11, 18);
        }
    }

    public static final void e(String str, String str2, fz.a aVar, l1.n nVar, int i11) {
        y2.i iVar;
        y2.h hVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(662933865);
        int i12 = i11 | (sVar.f(str2) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarQ = iu.k.q(((i12 << 6) & 57344) | 6, 7, aVar, sVar, j0.c.E(j0.e2.e(oVar, 1.0f), 24, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), false);
            z1.i iVar2 = z1.c.M;
            j0.b bVar = j0.i.f35303a;
            j0.a2 a2VarA = j0.z1.a(bVar, iVar2, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarQ);
            y2.k.J.getClass();
            y2.i iVar3 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, a2VarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            z1.r rVarU = j0.e2.u(oVar, 56, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            float f5 = 1;
            c3 c3Var = h1.v1.f31180a;
            float f11 = 12;
            float f12 = 16;
            float f13 = 8;
            z1.r rVarB = j0.c.B(d0.n.j(rVarU, f5, ((h1.s1) sVar.j(c3Var)).f31017a, r0.f.d(f11)), f12, f13);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarB);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD, sVar);
            l1.t.J(hVar3, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar);
            ua.b(str, null, ((h1.s1) sVar.j(c3Var)).f31034q, j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3078, 0, 130546);
            sVar.p(true);
            j0.c.g(sVar, j0.e2.s(oVar, f12));
            j0.a2 a2VarA2 = j0.z1.a(bVar, iVar2, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                iVar = iVar3;
                sVar.k(iVar);
            } else {
                iVar = iVar3;
                sVar.r0();
            }
            l1.t.J(hVar2, a2VarA2, sVar);
            l1.t.J(hVar3, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                hVar = hVar4;
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar);
            } else {
                hVar = hVar4;
            }
            l1.t.J(hVar5, rVarC3, sVar);
            j0.o.a(d0.n.h(j0.e2.n(oVar, 3), ((h1.s1) sVar.j(c3Var)).f31017a, r0.f.a()), sVar, 0);
            j0.c.g(sVar, d0.n.h(j0.e2.g(j0.e2.s(oVar, f12), f5), ((h1.s1) sVar.j(c3Var)).f31017a, g2.f0.f28556b));
            z1.r rVarB2 = j0.c.B(d0.n.h(oVar, ((h1.s1) sVar.j(c3Var)).f31017a, r0.f.d(f11)), f11, f13);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarB2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD2, sVar);
            l1.t.J(hVar3, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar);
            }
            l1.t.J(hVar5, rVarC4, sVar);
            ua.b(str2, null, ((h1.s1) sVar.j(c3Var)).f31019b, j3.A(14), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, (14 & (i12 >> 3)) | 3072, 0, 131058);
            sVar = sVar;
            com.google.android.material.datepicker.d.B(sVar, true, true, true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.f(i11, 1, aVar, str, str2);
        }
    }

    public static final void f(int i11, fz.c cVar, l1.n nVar, z1.r rVar) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1223812);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(cVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            float f5 = 8;
            z1.r rVarA = j0.c.A(d0.n.h(j0.e2.e(rVar, 1.0f), ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b), f5);
            j0.u uVarA = j0.t.a(j0.i.g(f5), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
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
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            String strE0 = ub.a.e0(sVar, R.string.hiragana_table);
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new bt.g(cVar, 28);
                sVar.o0(objQ);
            }
            e("あ", strE0, (fz.a) objQ, sVar, 6);
            String strE1 = ub.a.e0(sVar, R.string.katakana_table);
            boolean z12 = i13 == 4;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new bt.g(cVar, 29);
                sVar.o0(objQ2);
            }
            e("ア", strE1, (fz.a) objQ2, sVar, 6);
            String strE2 = ub.a.e0(sVar, R.string.romaji);
            boolean z13 = i13 == 4;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new x0(cVar, 0);
                sVar.o0(objQ3);
            }
            e("a", strE2, (fz.a) objQ3, sVar, 6);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d0.w(cVar, rVar, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x011f  */
    /* JADX WARN: Code duplicated, block: B:71:0x012d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01df  */
    /* JADX WARN: Code duplicated, block: B:81:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static final void g(final String str, final String str2, final z1.r rVar, long j11, long j12, l1.n nVar, final int i11, final int i12) {
        int i13;
        String str3;
        long j13;
        long j14;
        int i14;
        int i15;
        boolean z11;
        l1.s sVar;
        final long j15;
        final long j16;
        l1.x1 x1VarT;
        long j17;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        int i16;
        long j18;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(915512317);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.f(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            str3 = str2;
            i13 |= sVar2.f(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar2.f(rVar) ? 256 : 128;
        }
        if ((i12 & 8) == 0) {
            j13 = j11;
            int i17 = sVar2.e(j13) ? 2048 : 1024;
            int i18 = i13 | i17;
            if ((i12 & 16) == 0) {
                j14 = j12;
                if (sVar2.e(j14)) {
                    i14 = 16384;
                }
                i15 = i18 | i14;
                if ((i15 & 9363) != 9362) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (sVar2.T(i15 & 1, z11)) {
                    sVar2.Y();
                    if ((i11 & 1) != 0 || sVar2.C()) {
                        if ((i12 & 8) != 0) {
                            j13 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                            i15 &= -7169;
                        }
                        if ((i12 & 16) != 0) {
                            j14 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                            i15 &= -57345;
                        }
                    } else {
                        sVar2.W();
                        if ((i12 & 8) != 0) {
                            i15 &= -7169;
                        }
                        if ((i12 & 16) != 0) {
                            i15 &= -57345;
                        }
                    }
                    j17 = j14;
                    long j19 = j13;
                    sVar2.q();
                    z1.r rVarA = j0.c.A(d0.n.h(j0.e2.g(rVar, 60), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b), 4);
                    j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar2, 54);
                    iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarA);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                    hVar = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar2);
                    i16 = i15 >> 3;
                    ua.b(str, null, j19, j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar2, (i15 & 14) | 3072 | (i16 & 896), 3072, 122354);
                    sVar = sVar2;
                    if (str3.length() > 0) {
                        sVar.d0(-45810608);
                        j0.c.g(sVar, j0.e2.g(z1.o.f58481a, 2));
                        j18 = j17;
                        ua.b(str3, null, j18, j3.A(12), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar, (i16 & 14) | 3072 | ((i15 >> 6) & 896), 3072, 122354);
                        sVar = sVar;
                    } else {
                        j18 = j17;
                        sVar.d0(-83634917);
                    }
                    sVar.p(false);
                    sVar.p(true);
                    j16 = j18;
                    j15 = j19;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    j15 = j13;
                    j16 = j14;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: km.y0
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            b1.g(str, str2, rVar, j15, j16, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            j14 = j12;
            i14 = OSSConstants.DEFAULT_BUFFER_SIZE;
            i15 = i18 | i14;
            if ((i15 & 9363) != 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i15 & 1, z11)) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if ((i12 & 8) != 0) {
                        j13 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                        i15 &= -7169;
                    }
                    if ((i12 & 16) != 0) {
                        j14 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                        i15 &= -57345;
                    }
                } else {
                    if ((i12 & 8) != 0) {
                        j13 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                        i15 &= -7169;
                    }
                    if ((i12 & 16) != 0) {
                        j14 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                        i15 &= -57345;
                    }
                }
                j17 = j14;
                long j110 = j13;
                sVar2.q();
                z1.r rVarA2 = j0.c.A(d0.n.h(j0.e2.g(rVar, 60), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b), 4);
                j0.u uVarA2 = j0.t.a(j0.i.f35307e, z1.c.P, sVar2, 54);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL2 = sVar2.l();
                z1.r rVarC2 = z1.a.c(sVar2, rVarA2);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                i16 = i15 >> 3;
                ua.b(str, null, j110, j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar2, (i15 & 14) | 3072 | (i16 & 896), 3072, 122354);
                sVar = sVar2;
                if (str3.length() > 0) {
                    sVar.d0(-45810608);
                    j0.c.g(sVar, j0.e2.g(z1.o.f58481a, 2));
                    j18 = j17;
                    ua.b(str3, null, j18, j3.A(12), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar, (i16 & 14) | 3072 | ((i15 >> 6) & 896), 3072, 122354);
                    sVar = sVar;
                } else {
                    j18 = j17;
                    sVar.d0(-83634917);
                }
                sVar.p(false);
                sVar.p(true);
                j16 = j18;
                j15 = j110;
            } else {
                sVar = sVar2;
                sVar.W();
                j15 = j13;
                j16 = j14;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: km.y0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b1.g(str, str2, rVar, j15, j16, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        j13 = j11;
        int i19 = i13 | i17;
        if ((i12 & 16) == 0) {
            j14 = j12;
            if (sVar2.e(j14)) {
                i14 = 16384;
            }
            i15 = i19 | i14;
            if ((i15 & 9363) != 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i15 & 1, z11)) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if ((i12 & 8) != 0) {
                        j13 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                        i15 &= -7169;
                    }
                    if ((i12 & 16) != 0) {
                        j14 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                        i15 &= -57345;
                    }
                } else {
                    if ((i12 & 8) != 0) {
                        j13 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                        i15 &= -7169;
                    }
                    if ((i12 & 16) != 0) {
                        j14 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                        i15 &= -57345;
                    }
                }
                j17 = j14;
                long j111 = j13;
                sVar2.q();
                z1.r rVarA3 = j0.c.A(d0.n.h(j0.e2.g(rVar, 60), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b), 4);
                j0.u uVarA3 = j0.t.a(j0.i.f35307e, z1.c.P, sVar2, 54);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL3 = sVar2.l();
                z1.r rVarC3 = z1.a.c(sVar2, rVarA3);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA3, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL3, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC3, sVar2);
                i16 = i15 >> 3;
                ua.b(str, null, j111, j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar2, (i15 & 14) | 3072 | (i16 & 896), 3072, 122354);
                sVar = sVar2;
                if (str3.length() > 0) {
                    sVar.d0(-45810608);
                    j0.c.g(sVar, j0.e2.g(z1.o.f58481a, 2));
                    j18 = j17;
                    ua.b(str3, null, j18, j3.A(12), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar, (i16 & 14) | 3072 | ((i15 >> 6) & 896), 3072, 122354);
                    sVar = sVar;
                } else {
                    j18 = j17;
                    sVar.d0(-83634917);
                }
                sVar.p(false);
                sVar.p(true);
                j16 = j18;
                j15 = j111;
            } else {
                sVar = sVar2;
                sVar.W();
                j15 = j13;
                j16 = j14;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: km.y0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b1.g(str, str2, rVar, j15, j16, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        j14 = j12;
        i14 = OSSConstants.DEFAULT_BUFFER_SIZE;
        i15 = i19 | i14;
        if ((i15 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i15 & 1, z11)) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if ((i12 & 8) != 0) {
                    j13 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                    i15 &= -7169;
                }
                if ((i12 & 16) != 0) {
                    j14 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                    i15 &= -57345;
                }
            } else {
                if ((i12 & 8) != 0) {
                    j13 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                    i15 &= -7169;
                }
                if ((i12 & 16) != 0) {
                    j14 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                    i15 &= -57345;
                }
            }
            j17 = j14;
            long j112 = j13;
            sVar2.q();
            z1.r rVarA4 = j0.c.A(d0.n.h(j0.e2.g(rVar, 60), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b), 4);
            j0.u uVarA4 = j0.t.a(j0.i.f35307e, z1.c.P, sVar2, 54);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL4 = sVar2.l();
            z1.r rVarC4 = z1.a.c(sVar2, rVarA4);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA4, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL4, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC4, sVar2);
            i16 = i15 >> 3;
            ua.b(str, null, j112, j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar2, (i15 & 14) | 3072 | (i16 & 896), 3072, 122354);
            sVar = sVar2;
            if (str3.length() > 0) {
                sVar.d0(-45810608);
                j0.c.g(sVar, j0.e2.g(z1.o.f58481a, 2));
                j18 = j17;
                ua.b(str3, null, j18, j3.A(12), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar, (i16 & 14) | 3072 | ((i15 >> 6) & 896), 3072, 122354);
                sVar = sVar;
            } else {
                j18 = j17;
                sVar.d0(-83634917);
            }
            sVar.p(false);
            sVar.p(true);
            j16 = j18;
            j15 = j112;
        } else {
            sVar = sVar2;
            sVar.W();
            j15 = j13;
            j16 = j14;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: km.y0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b1.g(str, str2, rVar, j15, j16, (l1.n) obj, l1.t.M(i11 | 1), i12);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void h(i iVar, long j11, z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(86481077);
        int i12 = i11 | (sVar2.h(iVar) ? 4 : 2) | (sVar2.e(j11) ? 32 : 16) | (sVar2.f(rVar) ? 256 : 128);
        int i13 = 0;
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            long j12 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
            j3.e eVar = new j3.e();
            String str = iVar.f38210a;
            int i14 = 0;
            while (i13 < str.length()) {
                char cCharAt = str.charAt(i13);
                int i15 = i14 + 1;
                eVar.i(new j3.p0(iVar.f38211b.contains(Integer.valueOf(i14)) ? j12 : j11, 0L, (n3.s) null, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (g2.v0) null, 65534));
                eVar.b(cCharAt);
                eVar.e();
                i13++;
                i14 = i15;
            }
            sVar = sVar2;
            ua.c(eVar.j(), rVar, j11, j3.A(14), null, 0L, null, 0L, 2, false, 1, 0, null, null, null, sVar, ((i12 >> 3) & 112) | 3072 | ((i12 << 3) & 896), 3120, 251888);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v0(iVar, j11, rVar, i11, 0);
        }
    }

    public static final void i(f0 f0Var, fz.c cVar, fz.c cVar2, z1.r rVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(982385637);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(f0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(cVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(rVar) ? 2048 : 1024;
        }
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            float f5 = 16;
            z1.r rVarC = j0.c.C(d0.n.y(rVar, d0.n.u(sVar), false, 14), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarC);
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
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            z1.o oVar = z1.o.f58481a;
            j0.c.g(sVar, j0.e2.g(oVar, f5));
            o(0, 2, ub.a.e0(sVar, R.string.fifty_sounds_goj_on), sVar, null);
            a(0, 6, 0L, ub.a.e0(sVar, R.string.goj_on_fifty_sounds_is_the_foundation_of_japanese_learning_it_is_the_japanese_alphabetical_order_and_its_name_refers_to_the_5_10_grid_in_which_the_characters_are_displayed_by_using_a_goj_on_chart_hiragana_and_katakana_can_be_learned_and_memorized_pretty_fast), sVar, null);
            o oVar2 = f0Var.f38180a;
            z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            int i13 = (i12 & 112) | 384;
            d(oVar2, cVar, rVarE, sVar, i13);
            s(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 6);
            a(0, 6, 0L, ub.a.e0(sVar, R.string._1_a_goj_on_chart_consists_of_five_columns_and_ten_rows_the_first_row_contains_the_five_japanese_vowels_and_they_are_considered_the_most_important_of_all_because_the_hiragana_in_the_other_nine_rows_is_pronounced_based_on_a_combination_of_consonants_and_those_five_vowels), sVar, null);
            a(48, 4, 0L, ub.a.e0(sVar, R.string._2_for_each_row_it_s_named_with_the_first_kana_hiragana_katakana_for_example_the_first_row_is_called_a_row_and_for_each_column_it_is_also_named_with_the_first_kana_hiragana_katakana_for_example_the_first_column_is_a_column), sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            a(48, 4, 0L, ub.a.e0(sVar, R.string._3_in_goj_on_each_kana_is_represented_in_hiragana_katakana_and_romanization_romaji), sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            int i14 = i12 >> 3;
            f((i14 & 14) | 48, cVar, sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            a(48, 4, 0L, ub.a.e0(sVar, R.string._4_romaji_is_japanese_writing_in_roman_letters_for_the_convenience_of_transliteration_for_speakers_of_other_languages_who_don_t_read_any_kana_apart_from_being_broadly_employed_in_signs_or_slogans_aimed_at_international_audiences_romaji_is_also_a_very_common_way_to_input_japanese_into_computers_in_the_beginning_phase_of_learning_japanese_pronunciation_romaji_would_be_greatly_helpful_as_well), sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            a(48, 4, 0L, ub.a.e0(sVar, R.string.there_are_two_romanizations_in_use_today_the_kunrei_shiki_and_the_hepburn_system_they_are_slightly_different_in_marking_the_reading_of_some_kana), sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            u(i13, cVar, f0Var.f38181b, sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            String strE0 = ub.a.e0(sVar, R.string.note_the_hepburn_system_is_in_this_app_adopted_by_default);
            c3 c3Var = h1.v1.f31180a;
            kotlin.jvm.internal.m.f((h1.s1) sVar.j(c3Var), "<this>");
            ua.b(strE0, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), d0.n.t(sVar) ? ju.a.f37299c1 : ju.a.Z, j3.A(14), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3120, 0, 131056);
            a(48, 4, 0L, ub.a.e0(sVar, R.string._5_pay_special_attention_to_the_pronunciation_of_the_kana_in_the_penultimate_row_ra_row_the_japanese_r_is_non_rhotic_though_romanized_as_ra_ri_ru_re_ro_they_should_be_pronounced_like_la_li_lu_le_lo), sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            q(i13, cVar, f0Var.f38182c, sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            a(48, 4, 0L, ub.a.e0(sVar, R.string._6_note_that_the_bracketed_kana_in_the_third_row_to_the_last_ya_row_and_the_last_row_wa_row_are_the_same_as_the_kana_in_the_first_row_a_row), sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            q(i13, cVar, f0Var.f38183d, sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            ua.b(ub.a.e0(sVar, R.string._7_the_last_kana), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((h1.s1) sVar.j(c3Var)).f31034q, j3.A(14), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3120, 0, 131056);
            sVar = sVar;
            q(i13, cVar, f0Var.f38184e, sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            a(48, 4, 0L, ub.a.e0(sVar, R.string.in_goj_on_usually_doesn_t_appear_on_its_own_but_rather_in_combinations_with_other_kana_go_to_hatsuon_for_detailed_reference_while_inputting_on_a_keyboard_double_type_n_for), sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 6);
            o(48, 0, ub.a.e0(sVar, R.string.voiced_consonants), sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            a(0, 6, 0L, ub.a.e0(sVar, R.string.there_are_voiceless_and_voiced_consonants_in_japanese_voiced_consonants_are_created_by_adding_two_dashes_to_the_upper_right_corner_of_their_voiceless_counterparts_as_in_ga_row_with_consonant_g_which_stems_from_the_voiceless_ka_row_with_consonant_k_za_row_with_consonant_z_from_the_voiceless_sa_row_with_consonant_s_da_row_with_consonant_d_from_ta_row_with_consonant_t_and_ba_row_with_consonant_b_pa_row_with_consonant_p_from_ha_row_with_consonant_h_the_following_voiced_consonants_chart_would_be_helpful_for_learning_and_memorization), sVar, null);
            v(i13, cVar, f0Var.f38185f, sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 6);
            o(48, 0, ub.a.e0(sVar, R.string.y_on), sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            a(0, 6, 0L, ub.a.e0(sVar, R.string.y_on_are_represented_in_hiragana_using_any_kana_in_i_row_such_as_ki_combined_with_ya_yu_yo_for_example_kyo_is_written_as_kyo_using_a_much_smaller_version_of_the_yo_kana_as_a_subscript_to_this_format_also_rings_true_for_the_other_two_and), sVar, null);
            z(f0Var.f38186g, cVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, i13);
            n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 6);
            o(48, 0, ub.a.e0(sVar, R.string.hatsuon), sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            a(0, 6, 0L, ub.a.e0(sVar, R.string.n_is_individual_kana_it_is_usually_not_used_on_its_own_but_in_conjunction_with_other_kana_kana_which_is_called_hatsuon_examples_are_as_follows), sVar, null);
            int i15 = (i14 & 112) | 384;
            x(f0Var.f38187h, cVar2, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, i15);
            s(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 6);
            a(0, 6, 0L, ub.a.e0(sVar, R.string.after_pronouncing_the_first_kana_naturally_glide_to_a_en_sound), sVar, null);
            n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 6);
            o(48, 0, ub.a.e0(sVar, R.string.long_vowels), sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            a(0, 6, 0L, ub.a.e0(sVar, R.string.when_kana_is_followed_by_the_same_vowel_it_forms_a_long_vowel_sound_for_example_ka_a_should_be_pronounced_as_ka_the_long_vowel_sound_also_goes_for_the_kana_in_e_column_followed_by_i_and_the_kana_in_o_column_followed_by_u), sVar, null);
            l(f0Var.f38188i, cVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, i13);
            a(48, 4, 0L, ub.a.e0(sVar, R.string.the_following_are_some_examples_of_long_vowels), sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            x(f0Var.f38189j, cVar2, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, i15);
            n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 6);
            o(48, 0, ub.a.e0(sVar, R.string.sokuon), sVar, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
            a(0, 6, 0L, ub.a.e0(sVar, R.string.placed_between_two_kana_marks_sokuon_the_tip_to_pronounce_it_is_to_make_a_short_and_sudden_stop_between_the_two_kana), sVar, null);
            x(f0Var.f38190k, cVar2, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, i15);
            s(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 6);
            a(0, 6, 0L, ub.a.e0(sVar, R.string.notice_the_romaji_writing_rule_for_sokuon_is_to_double_the_consonant_letter_of_the_kana_following_the_sokuon_syllable), sVar, null);
            ep.a.C(oVar, 120, sVar, true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(f0Var, cVar, cVar2, rVar, i11, 6);
        }
    }

    public static final void j(l lVar, fz.c cVar, l1.n nVar, int i11) {
        int i12;
        fz.a aVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(722777246);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.f(lVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            long jB = B(lVar.f38232d, sVar);
            g2.r0 r0Var = g2.f0.f28556b;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarH = d0.n.h(oVar, jB, r0Var);
            String str = lVar.f38231c;
            if (str == null) {
                sVar.d0(1586131808);
                sVar.p(false);
                aVar = null;
            } else {
                sVar.d0(1586131809);
                boolean zF = ((i12 & 112) == 32) | sVar.f(str);
                Object objQ = sVar.Q();
                if (zF || objQ == l1.m.f39353a) {
                    objQ = new in.h(cVar, str, 5);
                    sVar.o0(objQ);
                }
                aVar = (fz.a) objQ;
                sVar.p(false);
            }
            z1.r rVarA = A(rVarH, aVar);
            float f5 = 8;
            z1.r rVarB = j0.c.B(rVarA, f5, 7);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarB);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            float f11 = 36;
            ua.b(lVar.f38229a, j0.e2.s(oVar, f11), B(lVar.f38233e, sVar), j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3120, 0, 130544);
            j0.c.g(sVar, j0.e2.s(oVar, f5));
            ua.b(lVar.f38230b, j0.e2.s(oVar, f11), B(lVar.f38234f, sVar), j3.A(14), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3120, 0, 130544);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.t1(lVar, i11, 11, cVar);
        }
    }

    public static final void k(m mVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1743799989);
        int i12 = i11 | (sVar.f(mVar) ? 4 : 2);
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.r rVarG = j0.e2.g(j0.e2.s(z1.o.f58481a, 140), 60);
            c3 c3Var = h1.v1.f31180a;
            z1.r rVarA = j0.c.A(d0.n.h(rVarG, ((h1.s1) sVar.j(c3Var)).f31033p, g2.f0.f28556b), 8);
            j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
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
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            ua.b(mVar.f38237a, null, ((h1.s1) sVar.j(c3Var)).f31034q, j3.A(14), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3072, 0, 130546);
            ua.b(mVar.f38238b, null, ((h1.s1) sVar.j(c3Var)).f31036s, j3.A(14), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3072, 0, 130546);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.b0(mVar, i11, 22);
        }
    }

    public static final void l(n nVar, fz.c cVar, z1.r rVar, l1.n nVar2, int i11) {
        z1.h hVar = z1.c.O;
        l1.s sVar = (l1.s) nVar2;
        sVar.f0(-1882789005);
        int i12 = (i11 & 6) == 0 ? (sVar.h(nVar) ? 4 : 2) | i11 : i11;
        fz.c cVar2 = cVar;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(rVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.r rVarE = j0.e2.e(rVar, 1.0f);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, a2VarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            float f5 = 2;
            j0.u uVarA = j0.t.a(j0.i.g(f5), hVar, sVar, 6);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.o oVar = z1.o.f58481a;
            int i13 = i12;
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA, sVar);
            l1.t.J(hVar3, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar);
            sVar.d0(-1851112227);
            Iterator it = nVar.f38242a.iterator();
            while (it.hasNext()) {
                k((m) it.next(), sVar, 0);
            }
            sVar.p(false);
            sVar.p(true);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.c.g(sVar, new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            d0.n.c(se.k.y(R.drawable.ic_syllable_to, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 56, 124);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.c.g(sVar, new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            j0.a2 a2VarA2 = j0.z1.a(j0.i.g(f5), z1.c.N, sVar, 54);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA2, sVar);
            l1.t.J(y2.j.f56916e, q1VarL3, sVar);
            y2.h hVar6 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar6);
            }
            l1.t.J(y2.j.f56915d, rVarC3, sVar);
            sVar.d0(-1164018146);
            for (List list : nVar.f38243b) {
                j0.u uVarA2 = j0.t.a(j0.i.g(f5), hVar, sVar, 6);
                int iHashCode4 = Long.hashCode(sVar.T);
                l1.q1 q1VarL4 = sVar.l();
                z1.r rVarC4 = z1.a.c(sVar, oVar);
                y2.k.J.getClass();
                y2.i iVar3 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA2, sVar);
                l1.t.J(y2.j.f56916e, q1VarL4, sVar);
                y2.h hVar7 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                    defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar7);
                }
                Iterator itO = com.google.android.material.datepicker.d.o(sVar, rVarC4, y2.j.f56915d, -2139189781, list);
                while (itO.hasNext()) {
                    p((q) itO.next(), cVar2, 60, 8, sVar, (i13 & 112) | 3456, 0);
                    cVar2 = cVar;
                }
                sVar.p(false);
                sVar.p(true);
                cVar2 = cVar;
            }
            com.google.android.material.datepicker.d.B(sVar, false, true, true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h((Object) nVar, cVar, (Object) rVar, i11, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x011d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:72:0x0203  */
    /* JADX WARN: Code duplicated, block: B:75:0x020e  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void m(p pVar, z1.r rVar, fz.c cVar, float f5, l1.n nVar, int i11, int i12) {
        int i13;
        float f11;
        boolean z11;
        l1.s sVar;
        float f12;
        l1.x1 x1VarT;
        float f13;
        String str;
        boolean z12;
        boolean zF;
        Object objQ;
        fz.a aVar;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        boolean z13;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1884539713);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.f(pVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar2.h(cVar) ? 256 : 128;
        }
        int i14 = i12 & 8;
        if (i14 == 0) {
            if ((i11 & 3072) == 0) {
                f11 = f5;
                i13 |= sVar2.c(f11) ? 2048 : 1024;
            }
            if ((i13 & 1171) != 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i13 & 1, z11)) {
                if (i14 != 0) {
                    f13 = 0;
                } else {
                    f13 = f11;
                }
                str = pVar.f38259c;
                if (str == null) {
                    sVar2.d0(-1489682019);
                    sVar2.p(false);
                    aVar = null;
                } else {
                    sVar2.d0(-1489682018);
                    if ((i13 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zF = z12 | sVar2.f(str);
                    objQ = sVar2.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new in.h(cVar, str, 1);
                        sVar2.o0(objQ);
                    }
                    aVar = (fz.a) objQ;
                    sVar2.p(false);
                }
                z1.r rVarB = j0.c.B(A(d0.n.h(j0.e2.g(rVar, 60), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b), aVar), f13, 4);
                j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar2, 54);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL = sVar2.l();
                z1.r rVarC = z1.a.c(sVar2, rVarB);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar2);
                float f14 = f13;
                ua.b(pVar.f38257a, null, B(pVar.f38260d, sVar2), j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), 0L, 0L, null, null, um.b.f53018a, 0L, null, null, 0, 0, 0L, null, 16777183), sVar2, 3072, 3072, 56818);
                sVar = sVar2;
                if (pVar.f38258b.length() > 0) {
                    sVar.d0(-96192333);
                    j0.c.g(sVar, j0.e2.g(z1.o.f58481a, 2));
                    ua.b(pVar.f38258b, null, B(pVar.f38261e, sVar), j3.A(12), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar, 3072, 3072, 122354);
                    sVar = sVar;
                    z13 = false;
                } else {
                    z13 = false;
                    sVar.d0(-135259401);
                }
                sVar.p(z13);
                sVar.p(true);
                f12 = f14;
            } else {
                sVar = sVar2;
                sVar.W();
                f12 = f11;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new u3(pVar, rVar, cVar, f12, i11, i12);
            }
        }
        i13 |= 3072;
        f11 = f5;
        if ((i13 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i13 & 1, z11)) {
            if (i14 != 0) {
                f13 = 0;
            } else {
                f13 = f11;
            }
            str = pVar.f38259c;
            if (str == null) {
                sVar2.d0(-1489682019);
                sVar2.p(false);
                aVar = null;
            } else {
                sVar2.d0(-1489682018);
                if ((i13 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zF = z12 | sVar2.f(str);
                objQ = sVar2.Q();
                if (zF) {
                    objQ = new in.h(cVar, str, 1);
                    sVar2.o0(objQ);
                } else {
                    objQ = new in.h(cVar, str, 1);
                    sVar2.o0(objQ);
                }
                aVar = (fz.a) objQ;
                sVar2.p(false);
            }
            z1.r rVarB2 = j0.c.B(A(d0.n.h(j0.e2.g(rVar, 60), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b), aVar), f13, 4);
            j0.u uVarA2 = j0.t.a(j0.i.f35307e, z1.c.P, sVar2, 54);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarB2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA2, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar2);
            float f15 = f13;
            ua.b(pVar.f38257a, null, B(pVar.f38260d, sVar2), j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), 0L, 0L, null, null, um.b.f53018a, 0L, null, null, 0, 0, 0L, null, 16777183), sVar2, 3072, 3072, 56818);
            sVar = sVar2;
            if (pVar.f38258b.length() > 0) {
                sVar.d0(-96192333);
                j0.c.g(sVar, j0.e2.g(z1.o.f58481a, 2));
                ua.b(pVar.f38258b, null, B(pVar.f38261e, sVar), j3.A(12), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar, 3072, 3072, 122354);
                sVar = sVar;
                z13 = false;
            } else {
                z13 = false;
                sVar.d0(-135259401);
            }
            sVar.p(z13);
            sVar.p(true);
            f12 = f15;
        } else {
            sVar = sVar2;
            sVar.W();
            f12 = f11;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u3(pVar, rVar, cVar, f12, i11, i12);
        }
    }

    public static final void n(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1363886800);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            k7.g(j0.e2.e(rVar, 1.0f), 1, ((h1.s1) sVar.j(h1.v1.f31180a)).B, sVar, 48, 0);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public static final void o(int i11, int i12, String str, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        boolean z11;
        l1.s sVar;
        l1.x1 x1VarT;
        z1.r rVar3;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1256893090);
        int i13 = i11 | (sVar2.f(str) ? 4 : 2);
        int i14 = i12 & 2;
        if (i14 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar2.f(rVar2) ? 32 : 16;
            }
            if ((i13 & 19) != 18) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i13 & 1, z11)) {
                if (i14 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                int i15 = i13;
                sVar = sVar2;
                ua.b(str, rVar3, ((h1.s1) sVar2.j(h1.v1.f31180a)).f31034q, j3.A(18), null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, (i15 & 14) | 199680 | (i15 & 112), 0, 131024);
                rVar2 = rVar3;
            } else {
                sVar = sVar2;
                sVar.W();
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new bt.z(str, rVar2, i11, i12, 3);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        if ((i13 & 19) != 18) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i13 & 1, z11)) {
            if (i14 != 0) {
                rVar3 = z1.o.f58481a;
            } else {
                rVar3 = rVar2;
            }
            int i16 = i13;
            sVar = sVar2;
            ua.b(str, rVar3, ((h1.s1) sVar2.j(h1.v1.f31180a)).f31034q, j3.A(18), null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, (i16 & 14) | 199680 | (i16 & 112), 0, 131024);
            rVar2 = rVar3;
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.z(str, rVar2, i11, i12, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0175  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void p(final q qVar, final fz.c cVar, float f5, final float f11, l1.n nVar, final int i11, final int i12) {
        int i13;
        float f12;
        boolean z11;
        l1.s sVar;
        final float f13;
        l1.x1 x1VarT;
        float f14;
        String str;
        boolean z12;
        boolean zF;
        Object objQ;
        fz.a aVar;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        int i14;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(735977052);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.f(qVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.h(cVar) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 == 0) {
            if ((i11 & 384) == 0) {
                f12 = f5;
                i13 |= sVar2.c(f12) ? 256 : 128;
            }
            if ((i11 & 3072) == 0) {
                if (sVar2.c(f11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i13 & 1171) != 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i13 & 1, z11)) {
                if (i15 != 0) {
                    f14 = 60;
                } else {
                    f14 = f12;
                }
                z1.r rVarG = j0.e2.g(j0.e2.u(z1.o.f58481a, f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), f14);
                c3 c3Var = h1.v1.f31180a;
                z1.r rVarH = d0.n.h(rVarG, ((h1.s1) sVar2.j(c3Var)).f31033p, g2.f0.f28556b);
                str = qVar.f38264b;
                if (str == null) {
                    sVar2.d0(-315282142);
                    sVar2.p(false);
                    aVar = null;
                } else {
                    sVar2.d0(-315282141);
                    if ((i13 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zF = z12 | sVar2.f(str);
                    objQ = sVar2.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new in.h(cVar, str, 2);
                        sVar2.o0(objQ);
                    }
                    aVar = (fz.a) objQ;
                    sVar2.p(false);
                }
                z1.r rVarC = j0.c.C(A(rVarH, aVar), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL = sVar2.l();
                z1.r rVarC2 = z1.a.c(sVar2, rVarC);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                ua.b(qVar.f38263a, null, ((h1.s1) sVar2.j(c3Var)).f31034q, j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar2, 3072, 0, 130546);
                sVar = sVar2;
                sVar.p(true);
                f13 = f14;
            } else {
                sVar = sVar2;
                sVar.W();
                f13 = f12;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: km.u0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b1.p(qVar, cVar, f13, f11, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 384;
        f12 = f5;
        if ((i11 & 3072) == 0) {
            if (sVar2.c(f11)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i13 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i13 & 1, z11)) {
            if (i15 != 0) {
                f14 = 60;
            } else {
                f14 = f12;
            }
            z1.r rVarG2 = j0.e2.g(j0.e2.u(z1.o.f58481a, f14, CropImageView.DEFAULT_ASPECT_RATIO, 2), f14);
            c3 c3Var2 = h1.v1.f31180a;
            z1.r rVarH2 = d0.n.h(rVarG2, ((h1.s1) sVar2.j(c3Var2)).f31033p, g2.f0.f28556b);
            str = qVar.f38264b;
            if (str == null) {
                sVar2.d0(-315282142);
                sVar2.p(false);
                aVar = null;
            } else {
                sVar2.d0(-315282141);
                if ((i13 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zF = z12 | sVar2.f(str);
                objQ = sVar2.Q();
                if (zF) {
                    objQ = new in.h(cVar, str, 2);
                    sVar2.o0(objQ);
                } else {
                    objQ = new in.h(cVar, str, 2);
                    sVar2.o0(objQ);
                }
                aVar = (fz.a) objQ;
                sVar2.p(false);
            }
            z1.r rVarC3 = j0.c.C(A(rVarH2, aVar), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC4 = z1.a.c(sVar2, rVarC3);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD2, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC4, sVar2);
            ua.b(qVar.f38263a, null, ((h1.s1) sVar2.j(c3Var2)).f31034q, j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar2, 3072, 0, 130546);
            sVar = sVar2;
            sVar.p(true);
            f13 = f14;
        } else {
            sVar = sVar2;
            sVar.W();
            f13 = f12;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: km.u0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b1.p(qVar, cVar, f13, f11, (l1.n) obj, l1.t.M(i11 | 1), i12);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void q(int i11, fz.c cVar, List list, l1.n nVar, z1.r rVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-339132563);
        int i12 = (i11 & 6) == 0 ? (sVar.h(list) ? 4 : 2) | i11 : i11;
        fz.c cVar2 = cVar;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(rVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            float f5 = 1.0f;
            z1.r rVarE = j0.e2.e(rVar, 1.0f);
            float f11 = 2;
            int i13 = 6;
            j0.u uVarA = j0.t.a(j0.i.g(f11), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
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
            sVar.d0(249437320);
            ArrayList arrayListH0 = ry.m.h0(list, 6);
            int size = arrayListH0.size();
            int i14 = 0;
            while (i14 < size) {
                int i15 = i14 + 1;
                List list2 = (List) arrayListH0.get(i14);
                z1.r rVarE2 = j0.e2.e(z1.o.f58481a, f5);
                j0.a2 a2VarA = j0.z1.a(j0.i.g(f11), z1.c.L, sVar, i13);
                int iHashCode2 = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarE2);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar.h0();
                int i16 = i13;
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA, sVar);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                }
                Iterator itO = com.google.android.material.datepicker.d.o(sVar, rVarC2, y2.j.f56915d, 81884165, list2);
                while (itO.hasNext()) {
                    p pVar = (p) itO.next();
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    List list3 = list2;
                    m(pVar, new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), cVar2, CropImageView.DEFAULT_ASPECT_RATIO, sVar, (i12 << 3) & 896, 8);
                    cVar2 = cVar;
                    list2 = list3;
                    size = size;
                }
                int i17 = size;
                sVar.p(false);
                sVar.d0(81891969);
                int size2 = 6 - list2.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.c.g(sVar, new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                }
                sVar.p(false);
                sVar.p(true);
                cVar2 = cVar;
                f5 = 1.0f;
                size = i17;
                i14 = i15;
                i13 = i16;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w0(list, cVar, rVar, i11, 2);
        }
    }

    public static final void r(f0 content, fz.a onBackClick, fz.c onKanaClick, fz.c onWordClick, fz.a onAlphabetChartClick, z1.r rVar, l1.n nVar, int i11) {
        fz.a aVar;
        z1.r rVar2;
        kotlin.jvm.internal.m.f(content, "content");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onKanaClick, "onKanaClick");
        kotlin.jvm.internal.m.f(onWordClick, "onWordClick");
        kotlin.jvm.internal.m.f(onAlphabetChartClick, "onAlphabetChartClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(359742663);
        int i12 = (sVar.h(content) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onBackClick) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onKanaClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onWordClick) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(onAlphabetChartClick) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i13 = i12 | 196608;
        if (sVar.T(i13 & 1, (i13 & 74899) != 74898)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
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
            int i14 = i13 >> 3;
            iu.k.g(onBackClick, null, g.f38191a, null, null, null, null, null, sVar, (i14 & 14) | 384, 250);
            z1.r rVarD = j0.e2.d(oVar, 1.0f);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarD);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            i(content, onKanaClick, onWordClick, j0.e2.d(oVar, 1.0f), sVar, (i13 & 14) | 3072 | (i14 & 112) | (i14 & 896));
            aVar = onAlphabetChartClick;
            c((i13 >> 12) & 14, aVar, sVar, j0.r.f35391a.a(oVar, z1.c.H));
            sVar.p(true);
            sVar.p(true);
            rVar2 = oVar;
        } else {
            aVar = onAlphabetChartClick;
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.d((Object) content, onBackClick, (Object) onKanaClick, (qy.e) onWordClick, (Object) aVar, (Object) rVar2, i11, 5);
        }
    }

    public static final void s(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-519523029);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            String strE0 = ub.a.e0(sVar, R.string.tips);
            j3.y0 y0Var = ((dc) sVar.j(fc.f30256a)).m;
            c3 c3Var = h1.v1.f31180a;
            j3.y0 y0VarA = j3.y0.a(y0Var, ((h1.s1) sVar.j(c3Var)).f31019b, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
            long j11 = ((h1.s1) sVar.j(c3Var)).f31017a;
            float f5 = 6;
            s0.o0.c(strE0, j0.c.B(d0.n.h(rVar, j11, r0.f.f(f5, f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, 8)), 12, 4), y0VarA, null, 0, false, 0, 0, null, null, sVar, 0, 1016);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 11);
        }
    }

    public static final void t(final String str, final float f5, final long j11, fz.a aVar, l1.n nVar, final int i11, final int i12) {
        final fz.a aVar2;
        int i13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-317568697);
        int i14 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.e(j11) ? 256 : 128);
        int i15 = i12 & 8;
        if (i15 != 0) {
            i13 = i14 | 3072;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i13 = i14 | (sVar.h(aVar2) ? 2048 : 1024);
        }
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            fz.a aVar3 = i15 != 0 ? null : aVar2;
            z1.r rVarC = j0.c.C(A(d0.n.h(j0.e2.g(j0.e2.e(z1.o.f58481a, 1.0f), f5), ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b), aVar3), 2, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarC);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            ua.b(str, null, j11, j3.A(16), null, null, null, 0L, new u3.k(3), 0L, 0, false, 2, 0, null, sVar, (i13 & 14) | 3072 | (i13 & 896), 3072, 122354);
            sVar = sVar;
            sVar.p(true);
            aVar2 = aVar3;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(str, f5, j11, aVar2, i11, i12) { // from class: km.z0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f38325a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f38326b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f38327c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ fz.a f38328d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f38329e;

                {
                    this.f38329e = i12;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(49);
                    b1.t(this.f38325a, this.f38326b, this.f38327c, this.f38328d, (l1.n) obj, iM, this.f38329e);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u(int i11, fz.c cVar, List list, l1.n nVar, z1.r rVar) {
        int i12;
        int i13;
        fz.a aVar;
        int i14;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1432970415);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(rVar) ? 256 : 128;
        }
        boolean z11 = true;
        int i15 = 0;
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.r rVarE = j0.e2.e(rVar, 1.0f);
            float f5 = 2;
            j0.a2 a2VarA = j0.z1.a(j0.i.g(f5), z1.c.L, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            fz.a aVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(aVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            Iterator itO = com.google.android.material.datepicker.d.o(sVar, rVarC, y2.j.f56915d, 1318217847, list);
            int i16 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i17 = i16 + 1;
                fz.a aVar3 = null;
                if (i16 < 0) {
                    ns.o.V();
                    throw null;
                }
                y1 y1Var = (y1) next;
                float f11 = i16 == 0 ? 1.5f : 1.0f;
                if (f11 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                if (f11 > Float.MAX_VALUE) {
                    f11 = Float.MAX_VALUE;
                }
                j0.i1 i1Var = new j0.i1(f11, z11);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, i15);
                int iHashCode2 = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, i1Var);
                y2.k.J.getClass();
                fz.a aVar4 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(aVar4);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA, sVar);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar);
                float f12 = f5;
                String str = y1Var.f38319a;
                float f13 = 42;
                l1.v1 v1Var = h1.v1.f31180a;
                t(str, f13, ((h1.s1) sVar.j(v1Var)).f31034q, null, sVar, 48, 8);
                z1.o oVar = z1.o.f58481a;
                j0.c.g(sVar, j0.e2.g(oVar, f12));
                String str2 = y1Var.f38320b;
                long j11 = ((h1.s1) sVar.j(v1Var)).f31034q;
                String str3 = y1Var.f38322d;
                Object obj = l1.m.f39353a;
                if (str3 == null) {
                    sVar.d0(994352160);
                    sVar.p(false);
                    i13 = i12;
                    aVar = null;
                } else {
                    i13 = i12;
                    sVar.d0(994352161);
                    boolean zF = ((i13 & 112) == 32) | sVar.f(str3);
                    Object objQ = sVar.Q();
                    if (zF || objQ == obj) {
                        objQ = new in.h(cVar, str3, 3);
                        sVar.o0(objQ);
                    }
                    aVar = (fz.a) objQ;
                    sVar.p(false);
                }
                t(str2, f13, j11, aVar, sVar, 48, 0);
                j0.c.g(sVar, j0.e2.g(oVar, f12));
                String str4 = y1Var.f38321c;
                long j12 = ((h1.s1) sVar.j(v1Var)).f31034q;
                String str5 = y1Var.f38323e;
                if (str5 == null) {
                    sVar.d0(994684480);
                    sVar.p(false);
                    i14 = 0;
                } else {
                    sVar.d0(994684481);
                    boolean zF2 = sVar.f(str5) | ((i13 & 112) == 32);
                    Object objQ2 = sVar.Q();
                    if (zF2 || objQ2 == obj) {
                        objQ2 = new in.h(cVar, str5, 4);
                        sVar.o0(objQ2);
                    }
                    aVar3 = (fz.a) objQ2;
                    i14 = 0;
                    sVar.p(false);
                }
                t(str4, f13, j12, aVar3, sVar, 48, 0);
                sVar.p(true);
                i15 = i14;
                z11 = true;
                f5 = f12;
                i16 = i17;
                i12 = i13;
            }
            sVar.p(i15);
            sVar.p(z11);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w0(list, cVar, rVar, i11, 1);
        }
    }

    public static final void v(int i11, fz.c cVar, List list, l1.n nVar, z1.r rVar) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1797887797);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(rVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.r rVarE = j0.e2.e(rVar, 1.0f);
            j0.g gVarG = j0.i.g(16);
            z1.h hVar = z1.c.O;
            j0.u uVarA = j0.t.a(gVarG, hVar, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            j0.d dVar = j0.i.f35305c;
            j0.u uVarA2 = j0.t.a(dVar, hVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA2, sVar);
            l1.t.J(hVar3, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar);
            int i13 = i12 & 112;
            w((z1) list.get(0), cVar, sVar, i13);
            b(t1.e.d(717153448, new q3(3, cVar, list), sVar), sVar, 6);
            sVar.p(true);
            j0.u uVarA3 = j0.t.a(dVar, hVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA3, sVar);
            l1.t.J(hVar3, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
            }
            l1.t.J(hVar5, rVarC3, sVar);
            w((z1) list.get(2), cVar, sVar, i13);
            b(t1.e.d(-1123815279, new q3(4, cVar, list), sVar), sVar, 6);
            sVar.p(true);
            j0.u uVarA4 = j0.t.a(dVar, hVar, sVar, 0);
            int iHashCode4 = Long.hashCode(sVar.T);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA4, sVar);
            l1.t.J(hVar3, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar4);
            }
            l1.t.J(hVar5, rVarC4, sVar);
            w((z1) list.get(4), cVar, sVar, i13);
            b(t1.e.d(1130476912, new q3(5, cVar, list), sVar), sVar, 6);
            sVar.p(true);
            j0.u uVarA5 = j0.t.a(dVar, hVar, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            l1.q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA5, sVar);
            l1.t.J(hVar3, q1VarL5, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar4);
            }
            l1.t.J(hVar5, rVarC5, sVar);
            w((z1) list.get(6), cVar, sVar, i13);
            b(t1.e.d(-910198193, new q3(6, cVar, list), sVar), sVar, 6);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w0(list, cVar, rVar, i11, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    public static final void w(z1 z1Var, fz.c cVar, l1.n nVar, int i11) {
        int i12;
        boolean z11;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-542637892);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(z1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = j0.e2.e(oVar, 1.0f);
            float f5 = 2;
            j0.a2 a2VarA = j0.z1.a(j0.i.g(f5), z1.c.M, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, a2VarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarH = d0.n.h(j0.e2.g(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 60), ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarH);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            char c11 = 3;
            float f11 = 1.0f;
            ua.b(z1Var.f38330a, null, B(z1Var.f38331b, sVar), j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3072, 0, 130546);
            if (z1Var.f38332c) {
                sVar.d0(176070407);
                d0.n.c(se.k.y(R.drawable.ic_syllable_btm_arrrow, sVar, 0), null, j0.c.E(j0.r.f35391a.a(oVar, z1.c.H), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 56, 120);
                z11 = false;
            } else {
                z11 = false;
                sVar.d0(145150480);
            }
            sVar.p(z11);
            sVar.p(true);
            sVar.d0(122117263);
            ?? r11 = z1Var.f38333d;
            int size = r11.size();
            ?? r9 = z11;
            while (r9 < size) {
                int i14 = r9 + 1;
                p pVar = (p) r11.get(r9);
                if (f11 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                m(pVar, new j0.i1(f11 > Float.MAX_VALUE ? Float.MAX_VALUE : f11, true), cVar, CropImageView.DEFAULT_ASPECT_RATIO, sVar, (i13 << 3) & 896, 8);
                r9 = i14;
                c11 = c11;
                f11 = f11;
            }
            sVar.p(z11);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.t1(z1Var, i11, 10, cVar);
        }
    }

    public static final void x(ArrayList arrayList, fz.c cVar, z1.r rVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-913190291);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(arrayList) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(rVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.r rVarE = j0.e2.e(rVar, 1.0f);
            j0.u uVarA = j0.t.a(j0.i.g(2), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
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
            sVar.d0(520708730);
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                a2 a2Var = (a2) obj;
                boolean zH = ((i12 & 112) == 32) | sVar.h(a2Var);
                Object objQ = sVar.Q();
                if (zH || objQ == l1.m.f39353a) {
                    objQ = new fp.f(27, cVar, a2Var);
                    sVar.o0(objQ);
                }
                y(a2Var, (fz.a) objQ, sVar, 0);
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h((Object) arrayList, cVar, (Object) rVar, i11, 21);
        }
    }

    public static final void y(a2 a2Var, fz.a aVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1970735977);
        int i12 = (sVar.h(a2Var) ? 4 : 2) | i11 | (sVar.h(aVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = j0.e2.e(oVar, 1.0f);
            c3 c3Var = h1.v1.f31180a;
            z1.r rVarB = j0.c.B(d0.n.o(d0.n.h(rVarE, ((h1.s1) sVar.j(c3Var)).f31033p, g2.f0.f28556b), false, null, aVar, 15), 8, 10);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarB);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            i iVar2 = a2Var.f38155a;
            long j11 = ((h1.s1) sVar.j(c3Var)).f31034q;
            j0.c2 c2Var = j0.c2.f35266a;
            h(iVar2, j11, c2Var.a(oVar, 1.5f), sVar, 0);
            h(a2Var.f38156b, ((h1.s1) sVar.j(c3Var)).f31034q, c2Var.a(oVar, 1.0f), sVar, 0);
            ua.b(a2Var.f38157c, c2Var.a(oVar, 1.0f), ((h1.s1) sVar.j(c3Var)).f31034q, j3.A(14), null, null, null, 0L, null, 0L, 2, false, 1, 0, null, sVar, 3072, 3120, 120816);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k9.p(a2Var, i11, 4, aVar);
        }
    }

    public static final void z(k2 k2Var, fz.c cVar, z1.r rVar, l1.n nVar, int i11) {
        z1.h hVar = z1.c.O;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-569555107);
        int i12 = (i11 & 6) == 0 ? (sVar.h(k2Var) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(rVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.r rVarE = j0.e2.e(rVar, 1.0f);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, a2VarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            float f5 = 2;
            j0.u uVarA = j0.t.a(j0.i.g(f5), hVar, sVar, 6);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            int i13 = i12;
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA, sVar);
            l1.t.J(hVar3, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar);
            sVar.d0(792495543);
            ArrayList arrayList = k2Var.f38226a;
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                j((l) obj, cVar, sVar, i13 & 112);
            }
            sVar.p(false);
            sVar.p(true);
            j0.c2 c2Var = j0.c2.f35266a;
            j0.c.g(sVar, c2Var.a(oVar, 1.0f));
            d0.n.c(se.k.y(R.drawable.ic_syllable_plus, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 56, 124);
            l1.s sVar2 = sVar;
            float f11 = 1.0f;
            j0.c.g(sVar2, c2Var.a(oVar, 1.0f));
            j0.u uVarA2 = j0.t.a(j0.i.g(f5), hVar, sVar2, 6);
            int iHashCode3 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, oVar);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar2);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA2, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL3, sVar2);
            y2.h hVar6 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar6);
            }
            l1.t.J(y2.j.f56915d, rVarC3, sVar2);
            sVar2.d0(533608478);
            for (Iterator it = k2Var.f38227b.iterator(); it.hasNext(); it = it) {
                l1.s sVar3 = sVar2;
                p((q) it.next(), cVar, CropImageView.DEFAULT_ASPECT_RATIO, 16, sVar3, (i13 & 112) | 3072, 4);
                sVar2 = sVar3;
                oVar = oVar;
                c2Var = c2Var;
                f11 = f11;
                f5 = f5;
            }
            l1.s sVar4 = sVar2;
            float f12 = f5;
            float f13 = f11;
            z1.o oVar2 = oVar;
            sVar4.p(false);
            sVar4.p(true);
            j0.c.g(sVar4, c2Var.a(oVar2, f13));
            k2.b bVarY = se.k.y(R.drawable.ic_syllable_to, sVar4, 0);
            boolean z11 = false;
            z1.o oVar3 = oVar2;
            j0.c2 c2Var2 = c2Var;
            int i15 = 16;
            int i16 = 2;
            d0.n.c(bVarY, null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 56, 124);
            l1.s sVar5 = sVar4;
            j0.c.g(sVar5, c2Var2.a(oVar3, f13));
            j0.u uVarA3 = j0.t.a(j0.i.g(f12), hVar, sVar5, 6);
            int iHashCode4 = Long.hashCode(sVar5.T);
            l1.q1 q1VarL4 = sVar5.l();
            z1.r rVarC4 = z1.a.c(sVar5, oVar3);
            y2.k.J.getClass();
            y2.i iVar3 = y2.j.f56913b;
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(iVar3);
            } else {
                sVar5.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA3, sVar5);
            l1.t.J(y2.j.f56916e, q1VarL4, sVar5);
            y2.h hVar7 = y2.j.f56918g;
            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar7);
            }
            l1.t.J(y2.j.f56915d, rVarC4, sVar5);
            sVar5.d0(-506683308);
            Iterator it2 = k2Var.f38228c.iterator();
            while (it2.hasNext()) {
                l1.s sVar6 = sVar5;
                m((p) it2.next(), j0.e2.u(oVar3, 60, CropImageView.DEFAULT_ASPECT_RATIO, i16), cVar, i15, sVar6, ((i13 << 3) & 896) | 3120, 0);
                sVar5 = sVar6;
                oVar3 = oVar3;
                i15 = i15;
                z11 = z11;
                i16 = i16;
            }
            sVar = sVar5;
            com.google.android.material.datepicker.d.B(sVar, z11, true, true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h((Object) k2Var, cVar, (Object) rVar, i11, 19);
        }
    }
}
