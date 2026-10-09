package w2;

import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2.r0 f54554a;

    public o0(y2.r0 r0Var) {
        this.f54554a = r0Var;
    }

    @Override // w2.x
    public final long D(long j11) {
        return f2.b.h(this.f54554a.Q.D(j11), a());
    }

    @Override // w2.x
    public final f2.c E(x xVar, boolean z11) {
        return this.f54554a.Q.E(xVar, z11);
    }

    @Override // w2.x
    public final x H() {
        y2.r0 r0VarA1;
        if (!k()) {
            v2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        y2.k1 k1Var = ((y2.k1) this.f54554a.Q.Q.f56892i0.f50087e).S;
        if (k1Var == null || (r0VarA1 = k1Var.a1()) == null) {
            return null;
        }
        return r0VarA1.T;
    }

    @Override // w2.x
    public final long M(long j11) {
        return f2.b.h(this.f54554a.Q.M(j11), a());
    }

    @Override // w2.x
    public final long P(long j11) {
        return this.f54554a.Q.P(f2.b.h(j11, a()));
    }

    @Override // w2.x
    public final long S(x xVar, long j11) {
        boolean z11 = xVar instanceof o0;
        y2.r0 r0Var = this.f54554a;
        if (!z11) {
            y2.r0 r0VarJ = a0.j(r0Var);
            x xVar2 = r0VarJ.Q;
            long jS = S(r0VarJ.T, j11);
            long j12 = r0VarJ.R;
            long jG = f2.b.g(jS, (4294967295L & ((long) Float.floatToRawIntBits((int) (j12 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j12 >> 32)) << 32));
            x xVarH = xVar2.h();
            if (xVarH != null) {
                xVar2 = xVarH;
            }
            return f2.b.h(jG, ((y2.k1) xVar2).S(xVar, 0L));
        }
        y2.r0 r0Var2 = ((o0) xVar).f54554a;
        y2.k1 k1Var = r0Var2.Q;
        k1Var.l1();
        y2.r0 r0VarA1 = r0Var.Q.Y0(k1Var).a1();
        if (r0VarA1 != null) {
            long jD = v3.j.d(v3.j.e(r0Var2.U0(r0VarA1, false), ew.a.B(j11)), r0Var.U0(r0VarA1, false));
            return (((long) Float.floatToRawIntBits((int) (jD >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jD & 4294967295L))) & 4294967295L);
        }
        y2.r0 r0VarJ2 = a0.j(r0Var2);
        long jE = v3.j.e(v3.j.e(r0Var2.U0(r0VarJ2, false), r0VarJ2.R), ew.a.B(j11));
        y2.r0 r0VarJ3 = a0.j(r0Var);
        long jD2 = v3.j.d(jE, v3.j.e(r0Var.U0(r0VarJ3, false), r0VarJ3.R));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jD2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jD2 & 4294967295L))) & 4294967295L;
        y2.k1 k1Var2 = r0VarJ3.Q.S;
        kotlin.jvm.internal.m.c(k1Var2);
        y2.k1 k1Var3 = r0VarJ2.Q.S;
        kotlin.jvm.internal.m.c(k1Var3);
        return k1Var2.S(k1Var3, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    public final long a() {
        y2.r0 r0Var = this.f54554a;
        y2.r0 r0VarJ = a0.j(r0Var);
        return f2.b.g(S(r0VarJ.T, 0L), r0Var.Q.S(r0VarJ.Q, 0L));
    }

    @Override // w2.x
    public final long c(long j11) {
        return this.f54554a.Q.c(f2.b.h(j11, a()));
    }

    @Override // w2.x
    public final long f(x xVar, long j11) {
        return S(xVar, j11);
    }

    @Override // w2.x
    public final boolean k() {
        return this.f54554a.Q.c1().P;
    }

    @Override // w2.x
    public final void l(float[] fArr) {
        this.f54554a.Q.l(fArr);
    }

    @Override // w2.x
    public final long m() {
        y2.r0 r0Var = this.f54554a;
        return (((long) r0Var.f54501a) << 32) | (((long) r0Var.f54502b) & 4294967295L);
    }

    @Override // w2.x
    public final void u(x xVar, float[] fArr) {
        this.f54554a.Q.u(xVar, fArr);
    }

    @Override // w2.x
    public final long x(long j11) {
        return this.f54554a.Q.x(f2.b.h(0L, a()));
    }

    @Override // w2.x
    public final x h() {
        y2.r0 r0VarA1;
        if (!k()) {
            v2.a.b(gkbGsXmgaxRjJ.JYscZjspWCWUe);
        }
        y2.k1 k1Var = this.f54554a.Q.S;
        if (k1Var != null && (r0VarA1 = k1Var.a1()) != null) {
            return r0VarA1.T;
        }
        return null;
    }
}
