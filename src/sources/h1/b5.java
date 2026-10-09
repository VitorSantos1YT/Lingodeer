package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f30034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f30035c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f30036d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f30037e = 112;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f30038f = 280;

    static {
        float f5 = 48;
        f30033a = f5;
        f30034b = f5;
    }

    public static final void a(z1.r rVar, b0.p0 p0Var, l1.b1 b1Var, d0.d2 d2Var, g2.w0 w0Var, long j11, float f5, float f11, t1.d dVar, l1.n nVar, int i11) {
        boolean z11;
        b0.i2 i2VarR;
        boolean z12;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-151448888);
        int i12 = i11 | (sVar2.f(rVar) ? 4 : 2) | (sVar2.f(p0Var) ? 32 : 16) | (sVar2.f(d2Var) ? 2048 : 1024) | (sVar2.f(w0Var) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.e(j11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.c(f5) ? 1048576 : 524288) | (sVar2.c(f11) ? 8388608 : 4194304) | (sVar2.f(null) ? 67108864 : 33554432) | (sVar2.h(dVar) ? 536870912 : 268435456);
        if ((i12 & 306783379) == 306783378 && sVar2.F()) {
            sVar2.W();
            sVar = sVar2;
        } else {
            b0.c2 c2VarD = b0.g2.d(p0Var, "DropDownMenu", sVar2, (((i12 >> 3) & 14) | 48) & 126);
            b0.j2 j2Var = b0.e.f3496j;
            b0.h2 h2Var = c2VarD.f3458a;
            l1.k1 k1Var = c2VarD.f3461d;
            boolean zBooleanValue = ((Boolean) h2Var.Y()).booleanValue();
            sVar2.d0(2139028452);
            float f12 = zBooleanValue ? 1.0f : 0.8f;
            sVar2.p(false);
            Float fValueOf = Float.valueOf(f12);
            boolean zBooleanValue2 = ((Boolean) k1Var.getValue()).booleanValue();
            sVar2.d0(2139028452);
            float f13 = zBooleanValue2 ? 1.0f : 0.8f;
            sVar2.p(false);
            Float fValueOf2 = Float.valueOf(f13);
            b0.w1 w1VarF = c2VarD.f();
            sVar2.d0(1033023423);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (w1VarF.b(bool, bool2)) {
                i2VarR = b0.e.r(120, 0, b0.b0.f3439b, 2);
                z12 = false;
                z11 = true;
            } else {
                z11 = true;
                i2VarR = b0.e.r(1, 74, null, 4);
                z12 = false;
            }
            sVar2.p(z12);
            b0.y1 y1VarC = b0.g2.c(c2VarD, fValueOf, fValueOf2, i2VarR, j2Var, sVar2, 0);
            boolean zBooleanValue3 = ((Boolean) c2VarD.f3458a.Y()).booleanValue();
            sVar2.d0(-249413128);
            float f14 = zBooleanValue3 ? 1.0f : 0.0f;
            sVar2.p(false);
            Float fValueOf3 = Float.valueOf(f14);
            boolean zBooleanValue4 = ((Boolean) k1Var.getValue()).booleanValue();
            sVar2.d0(-249413128);
            float f15 = zBooleanValue4 ? 1.0f : 0.0f;
            sVar2.p(false);
            Float fValueOf4 = Float.valueOf(f15);
            b0.w1 w1VarF2 = c2VarD.f();
            sVar2.d0(-1355418157);
            b0.i2 i2VarR2 = w1VarF2.b(bool, bool2) ? b0.e.r(30, 0, null, 6) : b0.e.r(75, 0, null, 6);
            sVar2.p(false);
            b0.y1 y1VarC2 = b0.g2.c(c2VarD, fValueOf3, fValueOf4, i2VarR2, j2Var, sVar2, 0);
            boolean zBooleanValue5 = ((Boolean) sVar2.j(z2.t1.f58672a)).booleanValue();
            boolean zG = sVar2.g(zBooleanValue5) | sVar2.f(y1VarC) | ((i12 & 112) != 32 ? false : z11) | sVar2.f(y1VarC2);
            Object objQ = sVar2.Q();
            if (zG || objQ == l1.m.f39353a) {
                x4 x4Var = new x4(zBooleanValue5, p0Var, b1Var, y1VarC, y1VarC2);
                sVar2.o0(x4Var);
                objQ = x4Var;
            }
            int i13 = i12 >> 9;
            int i14 = i12 >> 6;
            i9.a(g2.f0.q(z1.o.f58481a, (fz.c) objQ), w0Var, j11, 0L, f5, f11, null, t1.e.d(1573559053, new y4(rVar, d2Var, dVar, 0), sVar2), sVar2, (i13 & 896) | (i13 & 112) | 12582912 | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 8);
            sVar = sVar2;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new o(rVar, p0Var, b1Var, d2Var, w0Var, j11, f5, f11, dVar, i11);
        }
    }

    public static final void b(t1.d dVar, fz.a aVar, z1.r rVar, boolean z11, w4 w4Var, j0.t1 t1Var, l1.n nVar, int i11) {
        int i12;
        boolean z12 = z11;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1564716777);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(rVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(null) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(null) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.g(z12) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.f(w4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar.f(t1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar.f(null) ? 67108864 : 33554432;
        }
        if ((i12 & 38347923) == 38347922 && sVar.F()) {
            sVar.W();
        } else {
            z1.r rVarN = d0.n.n(rVar, null, l7.a(true, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 6, 6), z12, null, aVar, 24);
            z12 = z12;
            z1.r rVarZ = j0.c.z(j0.e2.r(j0.e2.e(rVarN, 1.0f), f30037e, f30034b, f30038f, 8), t1Var);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarZ);
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
            ua.a(((dc) sVar.j(fc.f30256a)).m, t1.e.d(1065051884, new z4(w4Var, z12, dVar), sVar), sVar, 48);
            sVar.p(true);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a5(dVar, aVar, rVar, z12, w4Var, t1Var, i11);
        }
    }
}
