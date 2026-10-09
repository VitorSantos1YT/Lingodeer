package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d9 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f30154d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f30156f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30151a = 600;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f30152b = 30;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f30153c = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f30155e = 6;

    static {
        float f5 = 8;
        f30154d = f5;
        f30156f = f5;
    }

    public static final void a(z1.r rVar, fz.e eVar, fz.e eVar2, g2.w0 w0Var, long j11, long j12, long j13, long j14, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        fz.e eVar3;
        fz.e eVar4;
        g2.w0 w0Var2;
        int i13;
        t1.d dVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1235788955);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            eVar3 = eVar;
            i12 |= sVar.h(eVar3) ? 32 : 16;
        } else {
            eVar3 = eVar;
        }
        if ((i11 & 384) == 0) {
            eVar4 = eVar2;
            i12 |= sVar.h(eVar4) ? 256 : 128;
        } else {
            eVar4 = eVar2;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.g(false) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            w0Var2 = w0Var;
            i12 |= sVar.f(w0Var2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        } else {
            w0Var2 = w0Var;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.e(j11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.e(j12) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar.e(j13) ? 8388608 : 4194304;
        }
        int i14 = i12;
        if ((100663296 & i11) == 0) {
            i13 = i14 | (sVar.e(j14) ? 67108864 : 33554432);
        } else {
            i13 = i14;
        }
        if ((805306368 & i11) == 0) {
            dVar2 = dVar;
            i13 |= sVar.h(dVar2) ? 536870912 : 268435456;
        } else {
            dVar2 = dVar;
        }
        if ((306783379 & i13) == 306783378 && sVar.F()) {
            sVar.W();
        } else {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
            }
            sVar.q();
            float f5 = k1.g0.f37530d;
            t1.d dVarD = t1.e.d(-1829663446, new a9(eVar3, dVar2, eVar4, j13, j14), sVar);
            int i15 = i13 >> 9;
            i9.a(rVar, w0Var2, j11, j12, CropImageView.DEFAULT_ASPECT_RATIO, f5, null, dVarD, sVar, (i13 & 14) | 12779520 | (i15 & 112) | (i15 & 896) | (i15 & 7168), 80);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b9(rVar, eVar, eVar2, w0Var, j11, j12, j13, j14, dVar, i11);
        }
    }

    public static final void b(u8 u8Var, z1.r rVar, g2.w0 w0Var, long j11, long j12, long j13, long j14, long j15, l1.n nVar, int i11) {
        int i12;
        long jD;
        z1.r rVar2;
        g2.w0 w0Var2;
        int i13;
        long j16;
        long j17;
        long j18;
        long j19;
        l1.s sVar;
        z1.r rVar3;
        long j21;
        g2.w0 w0Var3;
        long j22;
        long j23;
        long j24;
        long j25;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(274621471);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(u8Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i14 = i12 | 432;
        if ((i11 & 3072) == 0) {
            i14 = i12 | 1456;
        }
        if ((i11 & 24576) == 0) {
            i14 |= OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i14 |= 65536;
        }
        if ((1572864 & i11) == 0) {
            i14 |= 524288;
        }
        if ((12582912 & i11) == 0) {
            i14 |= 4194304;
        }
        if ((100663296 & i11) == 0) {
            i14 |= 33554432;
        }
        if ((38347923 & i14) == 38347922 && sVar2.F()) {
            sVar2.W();
            rVar3 = rVar;
            w0Var3 = w0Var;
            j22 = j11;
            j23 = j12;
            j21 = j13;
            j24 = j14;
            j25 = j15;
            sVar = sVar2;
        } else {
            sVar2.Y();
            if ((i11 & 1) == 0 || sVar2.C()) {
                g2.w0 w0VarA = y7.a(k1.g0.f37531e, sVar2);
                long jD2 = v1.d(k1.g0.f37529c, sVar2);
                long jD3 = v1.d(k1.g0.f37533g, sVar2);
                k1.c cVar = k1.g0.f37527a;
                jD = v1.d(cVar, sVar2);
                long jD4 = v1.d(cVar, sVar2);
                long jD5 = v1.d(k1.g0.f37532f, sVar2);
                rVar2 = z1.o.f58481a;
                w0Var2 = w0VarA;
                i13 = i14 & (-268434433);
                j16 = jD2;
                j17 = jD3;
                j18 = jD4;
                j19 = jD5;
            } else {
                sVar2.W();
                i13 = i14 & (-268434433);
                rVar2 = rVar;
                w0Var2 = w0Var;
                j16 = j11;
                j17 = j12;
                jD = j13;
                j18 = j14;
                j19 = j15;
            }
            sVar2.q();
            u8Var.f31158a.getClass();
            sVar2.d0(1561344786);
            sVar2.p(false);
            sVar2.d0(1561358724);
            u8Var.f31158a.getClass();
            sVar2.p(false);
            sVar = sVar2;
            a(j0.c.A(rVar2, 12), null, null, w0Var2, j16, j17, j18, j19, t1.e.d(-1266389126, new s8(u8Var, 1), sVar2), sVar, ((i13 << 3) & 7168) | 805306368);
            rVar3 = rVar2;
            j21 = jD;
            w0Var3 = w0Var2;
            j22 = j16;
            j23 = j17;
            j24 = j18;
            j25 = j19;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c9(u8Var, rVar3, w0Var3, j22, j23, j21, j24, j25, i11);
        }
    }

    public static final void c(t1.d dVar, fz.e eVar, fz.e eVar2, j3.y0 y0Var, long j11, long j12, l1.n nVar, int i11) {
        int i12;
        j3.y0 y0Var2;
        int i13;
        long j13;
        fz.e eVar3;
        long j14;
        boolean z11;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-903235475);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(eVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(y0Var) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.e(j11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.e(j12) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((74899 & i12) == 74898 && sVar.F()) {
            sVar.W();
            j13 = j11;
            j14 = j12;
            eVar3 = eVar2;
            y0Var2 = y0Var;
        } else {
            float f5 = eVar2 == null ? f30154d : 0;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = j0.c.E(oVar, f30153c, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 10);
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new g1(4);
                sVar.o0(objQ);
            }
            w2.q0 q0Var = (w2.q0) objQ;
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            int i14 = i12;
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0Var, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            z1.r rVarC2 = j0.c.C(w2.a0.l(oVar, "text"), CropImageView.DEFAULT_ASPECT_RATIO, f30155e, 1);
            z1.j jVar = z1.c.f58463a;
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarC2);
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
            l1.t.J(hVar4, rVarC3, sVar);
            dVar.invoke(sVar, Integer.valueOf(i14 & 14));
            sVar.p(true);
            sVar.d0(-904778058);
            if (eVar != null) {
                z1.r rVarL = w2.a0.l(oVar, "action");
                w2.q0 q0VarD2 = j0.o.d(jVar, false);
                int iHashCode3 = Long.hashCode(sVar.T);
                l1.q1 q1VarL3 = sVar.l();
                z1.r rVarC4 = z1.a.c(sVar, rVarL);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, q0VarD2, sVar);
                l1.t.J(hVar2, q1VarL3, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                }
                l1.t.J(hVar4, rVarC4, sVar);
                i13 = 8;
                j13 = j11;
                y0Var2 = y0Var;
                l1.t.b(new l1.w1[]{h2.f30320a.a(new g2.x(j13)), ua.f31167a.a(y0Var2)}, eVar, sVar, (i14 & 112) | 8);
                sVar.p(true);
            } else {
                y0Var2 = y0Var;
                i13 = 8;
                j13 = j11;
            }
            sVar.p(false);
            sVar.d0(-904766579);
            if (eVar2 != null) {
                z1.r rVarL2 = w2.a0.l(oVar, "dismissAction");
                w2.q0 q0VarD3 = j0.o.d(jVar, false);
                int i15 = i13;
                int iHashCode4 = Long.hashCode(sVar.T);
                l1.q1 q1VarL4 = sVar.l();
                z1.r rVarC5 = z1.a.c(sVar, rVarL2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, q0VarD3, sVar);
                l1.t.J(hVar2, q1VarL4, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                    defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar3);
                }
                l1.t.J(hVar4, rVarC5, sVar);
                j14 = j12;
                eVar3 = eVar2;
                l1.t.a(h2.f30320a.a(new g2.x(j14)), eVar3, sVar, i15 | ((i14 >> 3) & 112));
                z11 = true;
                sVar.p(true);
            } else {
                eVar3 = eVar2;
                j14 = j12;
                z11 = true;
            }
            sVar.p(false);
            sVar.p(z11);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z8(dVar, eVar, eVar3, y0Var2, j13, j14, i11);
        }
    }
}
