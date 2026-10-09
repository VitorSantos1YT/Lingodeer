package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1.d0 f30426a = new l1.d0(t1.Q);

    public static final void a(z1.r rVar, g2.w0 w0Var, long j11, long j12, float f5, float f11, d0.v vVar, t1.d dVar, l1.n nVar, int i11, int i12) {
        if ((i12 & 1) != 0) {
            rVar = z1.o.f58481a;
        }
        if ((i12 & 2) != 0) {
            w0Var = g2.f0.f28556b;
        }
        if ((i12 & 4) != 0) {
            j11 = ((s1) ((l1.s) nVar).j(v1.f31180a)).f31033p;
        }
        if ((i12 & 8) != 0) {
            j12 = v1.b(j11, nVar);
        }
        if ((i12 & 16) != 0) {
            f5 = 0;
        }
        if ((i12 & 32) != 0) {
            f11 = 0;
        }
        if ((i12 & 64) != 0) {
            vVar = null;
        }
        l1.s sVar = (l1.s) nVar;
        l1.d0 d0Var = f30426a;
        float f12 = f5 + ((v3.f) sVar.j(d0Var)).f53489a;
        l1.t.b(new l1.w1[]{h2.f30320a.a(new g2.x(j12)), d0Var.a(new v3.f(f12))}, t1.e.d(-70914509, new f9(rVar, w0Var, j11, f12, vVar, f11, dVar), sVar), sVar, 56);
    }

    public static final void b(boolean z11, fz.a aVar, z1.r rVar, boolean z12, g2.w0 w0Var, long j11, long j12, float f5, d0.v vVar, h0.i iVar, t1.d dVar, l1.n nVar, int i11, int i12) {
        boolean z13 = (i12 & 8) != 0 ? true : z12;
        long jB = (i12 & 64) != 0 ? v1.b(j11, nVar) : j12;
        float f11 = 0;
        float f12 = (i12 & 256) != 0 ? 0 : f5;
        d0.v vVar2 = (i12 & 512) != 0 ? null : vVar;
        h0.i iVar2 = (i12 & 1024) != 0 ? null : iVar;
        l1.s sVar = (l1.s) nVar;
        l1.d0 d0Var = f30426a;
        float f13 = ((v3.f) sVar.j(d0Var)).f53489a + f11;
        l1.t.b(new l1.w1[]{h2.f30320a.a(new g2.x(jB)), d0Var.a(new v3.f(f13))}, t1.e.d(-1164547968, new h9(rVar, w0Var, j11, f13, vVar2, z11, iVar2, z13, aVar, f12, dVar), sVar), sVar, 56);
    }

    public static final void c(fz.a aVar, z1.r rVar, boolean z11, g2.w0 w0Var, long j11, long j12, float f5, float f11, d0.v vVar, h0.i iVar, t1.d dVar, l1.n nVar, int i11, int i12) {
        boolean z12 = (i12 & 4) != 0 ? true : z11;
        long jB = (i12 & 32) != 0 ? v1.b(j11, nVar) : j12;
        float f12 = (i12 & 64) != 0 ? 0 : f5;
        float f13 = (i12 & 128) != 0 ? 0 : f11;
        d0.v vVar2 = (i12 & 256) != 0 ? null : vVar;
        h0.i iVar2 = (i12 & 512) != 0 ? null : iVar;
        l1.s sVar = (l1.s) nVar;
        l1.d0 d0Var = f30426a;
        float f14 = ((v3.f) sVar.j(d0Var)).f53489a + f12;
        l1.t.b(new l1.w1[]{h2.f30320a.a(new g2.x(jB)), d0Var.a(new v3.f(f14))}, t1.e.d(1279702876, new g9(rVar, w0Var, j11, f14, vVar2, iVar2, z12, aVar, f13, dVar), sVar), sVar, 56);
    }

    public static final z1.r d(z1.r rVar, g2.w0 w0Var, long j11, d0.v vVar, float f5) {
        g2.w0 w0Var2;
        z1.r rVarR;
        z1.r rVarK = z1.o.f58481a;
        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
            w0Var2 = w0Var;
            rVarR = g2.f0.r(rVarK, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, w0Var2, 124895);
        } else {
            w0Var2 = w0Var;
            rVarR = rVarK;
        }
        z1.r rVarI = rVar.i(rVarR);
        if (vVar != null) {
            rVarK = d0.n.k(vVar.f22811a, vVar.f22812b, w0Var2, rVarK);
        }
        return d2.h.b(d0.n.h(rVarI.i(rVarK), j11, w0Var2), w0Var2);
    }

    public static final long e(long j11, float f5, l1.n nVar) {
        l1.s sVar = (l1.s) nVar;
        s1 s1Var = (s1) sVar.j(v1.f31180a);
        boolean zBooleanValue = ((Boolean) sVar.j(v1.f31181b)).booleanValue();
        long j12 = s1Var.f31033p;
        if (!g2.x.d(j11, j12) || !zBooleanValue) {
            return j11;
        }
        if (v3.f.b(f5, 0)) {
            return j12;
        }
        return g2.f0.l(g2.x.c(s1Var.f31037t, ((((float) Math.log(f5 + 1)) * 4.5f) + 2.0f) / 100.0f), j12);
    }
}
