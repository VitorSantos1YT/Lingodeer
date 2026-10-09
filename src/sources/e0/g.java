package e0;

import ch.o0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import d0.b1;
import d2.o;
import g2.f0;
import g2.g0;
import g2.x;
import j0.a2;
import j0.e1;
import j0.e2;
import j0.i;
import j0.i1;
import j0.t;
import j0.u;
import j0.v;
import j0.z1;
import j3.y0;
import kotlin.jvm.internal.m;
import l1.d0;
import l1.n;
import l1.q1;
import l1.s;
import l1.x1;
import w2.q0;
import y2.h;
import y2.j;
import z1.r;
import z3.a0;
import z3.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f24661a;

    static {
        a0 a0Var = a0.Inherit;
        d0 d0Var = k.f58774a;
        a0 a0Var2 = a0.Inherit;
        a0 a0Var3 = a0.Inherit;
        long j11 = x.f28618e;
        long j12 = x.f28615b;
        f24661a = new c(j11, j12, j12, x.c(j12, 0.38f), x.c(j12, 0.38f));
    }

    public static final void a(c cVar, r rVar, t1.d dVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(621449936);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(cVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            float f5 = f.f24649d;
            r0.e eVarD = r0.f.d(f.f24650e);
            float f11 = 0;
            boolean z11 = v3.f.a(f5, f11) > 0;
            long j11 = g0.f28566a;
            r rVarY = d0.n.y(j0.c.C(j0.c.J(d0.n.h((v3.f.a(f5, f11) > 0 || z11) ? rVar.i(new o(eVarD, z11, j11, j11)) : rVar, cVar.f24636a, f0.f28556b), e1.Max), CropImageView.DEFAULT_ASPECT_RATIO, f.f24654i, 1), d0.n.u(sVar), false, 14);
            int i13 = (i12 << 3) & 7168;
            u uVarA = t.a(i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarY);
            y2.k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(j.f56917f, uVarA, sVar);
            l1.t.J(j.f56916e, q1VarL, sVar);
            h hVar = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(j.f56915d, rVarC, sVar);
            dVar.invoke(v.f35424a, sVar, Integer.valueOf(((i13 >> 6) & 112) | 6));
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(cVar, rVar, dVar, i11, 8);
        }
    }

    public static final void b(r rVar, c cVar, fz.c cVar2, n nVar, int i11, int i12) {
        int i13;
        int i14;
        s sVar = (s) nVar;
        sVar.f0(-1430784946);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else {
            i13 = (sVar.f(rVar) ? 4 : 2) | i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i14 = i13 | 48;
        } else {
            i14 = i13 | (sVar.f(cVar) ? 32 : 16);
        }
        int i17 = i14 | (sVar.h(cVar2) ? 256 : 128);
        if (sVar.T(i17 & 1, (i17 & 147) != 146)) {
            if (i15 != 0) {
                rVar = z1.o.f58481a;
            }
            if (i16 != 0) {
                cVar = f24661a;
            }
            a(cVar, rVar, t1.e.d(860259975, new b1(2, cVar2, cVar), sVar), sVar, ((i17 << 3) & 112) | ((i17 >> 3) & 14) | 384);
        } else {
            sVar.W();
        }
        r rVar2 = rVar;
        c cVar3 = cVar;
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(rVar2, cVar3, cVar2, i11, i12);
        }
    }

    public static final void c(String str, c cVar, r rVar, fz.f fVar, fz.a aVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(-1027365588);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(true) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(cVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(rVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(fVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(aVar) ? 131072 : 65536;
        }
        if (sVar.T(i12 & 1, (74899 & i12) != 74898)) {
            z1.i iVar = f.f24651f;
            j0.b bVar = i.f35303a;
            float f5 = f.f24653h;
            j0.g gVarG = i.g(f5);
            boolean z11 = ((i12 & 112) == 32) | ((458752 & i12) == 131072);
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new o0(23, aVar);
                sVar.o0(objQ);
            }
            r rVarE = e2.e(d0.n.o(rVar, true, str, (fz.a) objQ, 12), 1.0f);
            float f11 = f.f24646a;
            float f12 = f.f24647b;
            float f13 = f.f24648c;
            r rVarC = j0.c.C(e2.q(rVarE, f11, f13, f12, f13), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            a2 a2VarA = z1.a(gVarG, iVar, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC2 = z1.a.c(sVar, rVarC);
            y2.k.J.getClass();
            y2.i iVar2 = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            h hVar = j.f56917f;
            l1.t.J(hVar, a2VarA, sVar);
            h hVar2 = j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            h hVar3 = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            h hVar4 = j.f56915d;
            l1.t.J(hVar4, rVarC2, sVar);
            if (fVar == null) {
                sVar.d0(-1483499797);
                sVar.p(false);
            } else {
                sVar.d0(-1483499796);
                float f14 = f.f24655j;
                r rVarM = e2.m(z1.o.f58481a, f14, CropImageView.DEFAULT_ASPECT_RATIO, f14, f14, 2);
                q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC3 = z1.a.c(sVar, rVarM);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, q0VarD, sVar);
                l1.t.J(hVar2, q1VarL2, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC3, sVar);
                fVar.invoke(new x(cVar.f24638c), sVar, 0);
                sVar.p(true);
                sVar.p(false);
            }
            y0 y0Var = new y0(cVar.f24637b, f.m, f.f24658n, null, f.f24660p, f.f24652g, f.f24659o, 16613240);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            s0.o0.c(str, new i1(1.0f, true), y0Var, null, 0, false, 1, 0, null, null, sVar, (i12 & 14) | 1572864, 952);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.e2(str, cVar, rVar, fVar, aVar, i11, 1);
        }
    }
}
