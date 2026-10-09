package y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements i2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.b f56937a = new i2.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f56938b;

    @Override // i2.d
    public final void D0(long j11, float f5, float f11, long j12, long j13, float f12, i2.e eVar) {
        this.f56937a.D0(j11, f5, f11, j12, j13, f12, eVar);
    }

    @Override // i2.d
    public final void E0(g2.h hVar, long j11, long j12, long j13, float f5, g2.p pVar, int i11) {
        this.f56937a.E0(hVar, j11, j12, j13, f5, pVar, i11);
    }

    @Override // v3.c
    public final long I(int i11) {
        return this.f56937a.I(i11);
    }

    @Override // v3.c
    public final long K(float f5) {
        return this.f56937a.K(f5);
    }

    @Override // v3.c
    public final float Q(int i11) {
        return this.f56937a.Q(i11);
    }

    @Override // v3.c
    public final float T(float f5) {
        return f5 / this.f56937a.getDensity();
    }

    @Override // v3.c
    public final float Z() {
        return this.f56937a.Z();
    }

    public final void a() {
        i2.b bVar = this.f56937a;
        g2.v vVarX = bVar.f34121b.x();
        m mVar = this.f56938b;
        if (mVar == null) {
            throw defpackage.e.t("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        z1.q qVar = (z1.q) mVar;
        z1.q qVarF = qVar.f58482a.f58487f;
        if (qVarF != null && (qVarF.f58485d & 4) != 0) {
            while (true) {
                if (qVarF != null) {
                    int i11 = qVarF.f58484c;
                    if ((i11 & 2) == 0) {
                        if ((i11 & 4) != 0) {
                            break;
                        } else {
                            qVarF = qVarF.f58487f;
                        }
                    }
                }
                qVarF = null;
                break;
            }
        } else {
            qVarF = null;
            break;
        }
        if (qVarF == null) {
            k1 k1VarV = f.v(mVar, 4);
            if (k1VarV.c1() == qVar.f58482a) {
                k1VarV = k1VarV.R;
                kotlin.jvm.internal.m.c(k1VarV);
            }
            k1VarV.r1(vVarX, (j2.c) bVar.f34121b.f56175c);
            return;
        }
        n1.e eVar = null;
        while (qVarF != null) {
            if (qVarF instanceof q) {
                q qVar2 = (q) qVarF;
                j2.c cVar = (j2.c) bVar.f34121b.f56175c;
                k1 k1VarV2 = f.v(qVar2, 4);
                long jP = ff.h.P(k1VarV2.f54503c);
                i0 i0Var = k1VarV2.Q;
                i0Var.getClass();
                l0.a(i0Var).getSharedDrawScope().b(vVarX, jP, k1VarV2, qVar2, cVar);
            } else if ((qVarF.f58484c & 4) != 0 && (qVarF instanceof n)) {
                int i12 = 0;
                for (z1.q qVar3 = ((n) qVarF).R; qVar3 != null; qVar3 = qVar3.f58487f) {
                    if ((qVar3.f58484c & 4) != 0) {
                        i12++;
                        if (i12 == 1) {
                            qVarF = qVar3;
                        } else {
                            if (eVar == null) {
                                eVar = new n1.e(new z1.q[16]);
                            }
                            if (qVarF != null) {
                                eVar.c(qVarF);
                                qVarF = null;
                            }
                            eVar.c(qVar3);
                        }
                    }
                }
                if (i12 == 1) {
                }
            }
            qVarF = f.f(eVar);
        }
    }

    public final void b(g2.v vVar, long j11, k1 k1Var, q qVar, j2.c cVar) {
        q qVar2 = this.f56938b;
        this.f56938b = qVar;
        v3.m mVar = k1Var.Q.f56883c0;
        i2.b bVar = this.f56937a;
        v3.c cVarA = bVar.f34121b.A();
        xq.c cVar2 = bVar.f34121b;
        v3.m mVarE = cVar2.E();
        g2.v vVarX = cVar2.x();
        long jH = cVar2.H();
        j2.c cVar3 = (j2.c) cVar2.f56175c;
        cVar2.R(k1Var);
        cVar2.S(mVar);
        cVar2.Q(vVar);
        cVar2.T(j11);
        cVar2.f56175c = cVar;
        vVar.e();
        try {
            qVar.i(this);
            vVar.p();
            cVar2.R(cVarA);
            cVar2.S(mVarE);
            cVar2.Q(vVarX);
            cVar2.T(jH);
            cVar2.f56175c = cVar3;
            this.f56938b = qVar2;
        } catch (Throwable th2) {
            vVar.p();
            cVar2.R(cVarA);
            cVar2.S(mVarE);
            cVar2.Q(vVarX);
            cVar2.T(jH);
            cVar2.f56175c = cVar3;
            throw th2;
        }
    }

    @Override // i2.d
    public final void b0(g2.p0 p0Var, g2.t tVar, float f5, i2.e eVar, int i11) {
        this.f56937a.b0(p0Var, tVar, f5, eVar, i11);
    }

    @Override // i2.d
    public final long d() {
        return this.f56937a.d();
    }

    @Override // v3.c
    public final float e0(float f5) {
        return this.f56937a.getDensity() * f5;
    }

    @Override // i2.d
    public final void f0(long j11, long j12, long j13, float f5, int i11, g2.l lVar, int i12) {
        this.f56937a.f0(j11, j12, j13, f5, i11, lVar, i12);
    }

    @Override // v3.c
    public final float getDensity() {
        return this.f56937a.getDensity();
    }

    @Override // i2.d
    public final v3.m getLayoutDirection() {
        return this.f56937a.f34120a.f34117b;
    }

    @Override // i2.d
    public final xq.c j0() {
        return this.f56937a.f34121b;
    }

    @Override // v3.c
    public final int k0(long j11) {
        return this.f56937a.k0(j11);
    }

    @Override // v3.c
    public final long n(float f5) {
        return this.f56937a.n(f5);
    }

    @Override // v3.c
    public final int n0(float f5) {
        return this.f56937a.n0(f5);
    }

    @Override // v3.c
    public final long o(long j11) {
        return this.f56937a.o(j11);
    }

    @Override // i2.d
    public final long r0() {
        return this.f56937a.r0();
    }

    @Override // i2.d
    public final void s(g2.p0 p0Var, long j11, float f5, i2.e eVar) {
        this.f56937a.s(p0Var, j11, f5, eVar);
    }

    @Override // i2.d
    public final void u0(g2.t tVar, long j11, long j12, float f5, i2.e eVar, int i11) {
        this.f56937a.u0(tVar, j11, j12, f5, eVar, i11);
    }

    @Override // i2.d
    public final void v(long j11, float f5, long j12, i2.e eVar, int i11) {
        this.f56937a.v(j11, f5, j12, eVar, i11);
    }

    @Override // v3.c
    public final long v0(long j11) {
        return this.f56937a.v0(j11);
    }

    @Override // v3.c
    public final float w(long j11) {
        return this.f56937a.w(j11);
    }

    @Override // i2.d
    public final void w0(long j11, long j12, long j13, long j14, i2.e eVar, float f5) {
        this.f56937a.w0(j11, j12, j13, j14, eVar, f5);
    }

    @Override // v3.c
    public final float y0(long j11) {
        return this.f56937a.y0(j11);
    }

    @Override // i2.d
    public final void z(g2.t tVar, long j11, long j12, long j13, float f5, i2.e eVar) {
        this.f56937a.z(tVar, j11, j12, j13, f5, eVar);
    }

    @Override // i2.d
    public final void z0(long j11, long j12, long j13, float f5, int i11) {
        this.f56937a.z0(j11, j12, j13, f5, i11);
    }
}
