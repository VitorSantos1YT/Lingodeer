package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30507a = 280;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f30508b = 560;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f30509c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f30510d = 12;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j0.v1 f30511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j0.v1 f30512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j0.v1 f30513g;

    static {
        float f5 = 24;
        f30511e = new j0.v1(f5, f5, f5, f5);
        float f11 = 16;
        j0.c.f(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, 7);
        f30512f = j0.c.f(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, 7);
        f30513g = j0.c.f(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7);
    }

    public static final void a(t1.d dVar, z1.r rVar, fz.e eVar, fz.e eVar2, g2.w0 w0Var, long j11, float f5, long j12, long j13, long j14, long j15, l1.n nVar, int i11) {
        z1.r rVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1522575799);
        int i12 = i11 | 48 | (sVar.h(null) ? 256 : 128) | (sVar.h(eVar) ? 2048 : 1024) | (sVar.h(eVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.f(w0Var) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.e(j11) ? 1048576 : 524288) | (sVar.c(f5) ? 8388608 : 4194304) | (sVar.e(j12) ? 67108864 : 33554432) | (sVar.e(j13) ? 536870912 : 268435456);
        int i13 = (sVar.e(j14) ? (char) 4 : (char) 2) | (sVar.e(j15) ? ' ' : (char) 16);
        if ((i12 & 306783379) == 306783378 && (i13 & 19) == 18 && sVar.F()) {
            sVar.W();
            rVar2 = rVar;
        } else {
            t1.d dVarD = t1.e.d(-2126308228, new c(eVar, eVar2, j13, j14, j15, j12, dVar), sVar);
            int i14 = i12 >> 12;
            int i15 = (i14 & 896) | (i14 & 112) | 12582918 | ((i12 >> 9) & 57344);
            z1.o oVar = z1.o.f58481a;
            i9.a(oVar, w0Var, j11, 0L, f5, CropImageView.DEFAULT_ASPECT_RATIO, null, dVarD, sVar, i15, 104);
            rVar2 = oVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(dVar, rVar2, eVar, eVar2, w0Var, j11, f5, j12, j13, j14, j15, i11);
        }
    }

    public static final void b(t1.d dVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(586821353);
        if ((i11 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new g1(3);
                sVar.o0(objQ);
            }
            w2.q0 q0Var = (w2.q0) objQ;
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0Var, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            hh.p0.x(6, dVar, sVar, true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f(dVar, i11);
        }
    }

    public static final void c(fz.a aVar, t1.d dVar, z1.r rVar, fz.e eVar, fz.e eVar2, fz.e eVar3, g2.w0 w0Var, long j11, long j12, long j13, long j14, float f5, z3.r rVar2, l1.n nVar, int i11, int i12) {
        int i13;
        t1.d dVar2;
        fz.e eVar4;
        int i14;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-919826268);
        if ((i11 & 6) == 0) {
            i13 = (sVar.h(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            dVar2 = dVar;
            i13 |= sVar.h(dVar2) ? 32 : 16;
        } else {
            dVar2 = dVar;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar.f(rVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            eVar4 = eVar;
            i13 |= sVar.h(eVar4) ? 2048 : 1024;
        } else {
            eVar4 = eVar;
        }
        if ((i11 & 24576) == 0) {
            i13 |= sVar.h(null) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i13 |= sVar.h(eVar2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= sVar.h(eVar3) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= sVar.f(w0Var) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= sVar.e(j11) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= sVar.e(j12) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (sVar.e(j13) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar.e(j14) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= sVar.c(f5) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= sVar.f(rVar2) ? 2048 : 1024;
        }
        int i15 = i14;
        if ((i13 & 306783379) == 306783378 && (i15 & 1171) == 1170 && sVar.F()) {
            sVar.W();
        } else {
            d(aVar, rVar, rVar2, t1.e.d(-1852840226, new h(eVar2, eVar3, w0Var, j11, f5, j12, j13, j14, eVar4, dVar2), sVar), sVar, (i13 & 14) | 3072 | ((i13 >> 3) & 112) | ((i15 >> 3) & 896), 0);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i(aVar, dVar, rVar, eVar, eVar2, eVar3, w0Var, j11, j12, j13, j14, f5, rVar2, i11, i12, 0);
        }
    }

    public static final void d(fz.a aVar, z1.r rVar, z3.r rVar2, t1.d dVar, l1.n nVar, int i11, int i12) {
        int i13;
        z3.r rVar3;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1922902937);
        if ((i11 & 6) == 0) {
            i13 = (sVar.h(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.f(rVar) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= sVar.f(rVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar.h(dVar) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && sVar.F()) {
            sVar.W();
            rVar3 = rVar2;
        } else {
            if (i14 != 0) {
                rVar = z1.o.f58481a;
            }
            if (i15 != 0) {
                rVar2 = new z3.r(7);
            }
            z3.r rVar4 = rVar2;
            androidx.compose.ui.window.a.a(aVar, rVar4, t1.e.d(905289008, new b2.h(1, rVar, dVar), sVar), sVar, (i13 & 14) | 384 | ((i13 >> 3) & 112), 0);
            rVar3 = rVar4;
        }
        z1.r rVar5 = rVar;
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j(aVar, rVar5, rVar3, dVar, i11, i12, 0);
        }
    }
}
