package d2;

import a0.b2;
import a0.h0;
import com.yalantis.ucrop.view.CropImageView;
import g2.p;
import ry.s;
import w2.a0;
import w2.g1;
import w2.p0;
import w2.r0;
import w2.s0;
import y2.k0;
import y2.q0;
import y2.z;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends q implements z, y2.q {
    public k2.b Q;
    public boolean R;
    public z1.e S;
    public w2.j T;
    public float U;
    public p V;

    public static boolean U0(long j11) {
        return !f2.e.a(j11, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean V0(long j11) {
        return !f2.e.a(j11, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // y2.z
    public final int E(q0 q0Var, p0 p0Var, int i11) {
        if (!T0()) {
            return p0Var.p(i11);
        }
        long jW0 = W0(v3.b.b(0, i11, 7));
        return Math.max(v3.a.j(jW0), p0Var.p(i11));
    }

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    @Override // y2.z
    public final int L(q0 q0Var, p0 p0Var, int i11) {
        if (!T0()) {
            return p0Var.t(i11);
        }
        long jW0 = W0(v3.b.b(0, i11, 7));
        return Math.max(v3.a.j(jW0), p0Var.t(i11));
    }

    public final boolean T0() {
        return this.R && this.Q.h() != 9205357640488583168L;
    }

    public final long W0(long j11) {
        boolean z11 = false;
        boolean z12 = v3.a.d(j11) && v3.a.c(j11);
        if (v3.a.f(j11) && v3.a.e(j11)) {
            z11 = true;
        }
        if ((!T0() && z12) || z11) {
            return v3.a.a(v3.a.h(j11), 0, v3.a.g(j11), 0, 10, j11);
        }
        long jH = this.Q.h();
        int iRound = V0(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : v3.a.j(j11);
        int iRound2 = U0(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : v3.a.i(j11);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(v3.b.f(iRound2, j11))) & 4294967295L) | (((long) Float.floatToRawIntBits(v3.b.g(iRound, j11))) << 32);
        if (T0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!V0(this.Q.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.Q.h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!U0(this.Q.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.Q.h() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == CropImageView.DEFAULT_ASPECT_RATIO || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == CropImageView.DEFAULT_ASPECT_RATIO) ? 0L : a0.p(jFloatToRawIntBits2, this.T.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return v3.a.a(v3.b.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j11), 0, v3.b.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j11), 0, 10, j11);
    }

    @Override // y2.z
    public final r0 b(s0 s0Var, p0 p0Var, long j11) {
        g1 g1VarB = p0Var.B(W0(j11));
        return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b, s.f50855a, new h0(g1VarB, 4));
    }

    @Override // y2.q
    public final void i(k0 k0Var) {
        i2.b bVar = k0Var.f56937a;
        long jH = this.Q.h();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(V0(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (bVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(U0(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (bVar.d() & 4294967295L)))) & 4294967295L);
        long jP = (Float.intBitsToFloat((int) (bVar.d() >> 32)) == CropImageView.DEFAULT_ASPECT_RATIO || Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) == CropImageView.DEFAULT_ASPECT_RATIO) ? 0L : a0.p(jFloatToRawIntBits, this.T.a(jFloatToRawIntBits, bVar.d()));
        long jA = this.S.a((((long) Math.round(Float.intBitsToFloat((int) (jP >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jP & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (bVar.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)))) & 4294967295L), k0Var.getLayoutDirection());
        float f5 = (int) (jA >> 32);
        float f11 = (int) (jA & 4294967295L);
        ((b2) bVar.f34121b.f56174b).r(f5, f11);
        try {
            this.Q.g(k0Var, jP, this.U, this.V);
            ((b2) bVar.f34121b.f56174b).r(-f5, -f11);
            k0Var.a();
        } catch (Throwable th2) {
            ((b2) bVar.f34121b.f56174b).r(-f5, -f11);
            throw th2;
        }
    }

    @Override // y2.z
    public final int p(q0 q0Var, p0 p0Var, int i11) {
        if (!T0()) {
            return p0Var.W(i11);
        }
        long jW0 = W0(v3.b.b(i11, 0, 13));
        return Math.max(v3.a.i(jW0), p0Var.W(i11));
    }

    @Override // y2.z
    public final int t(q0 q0Var, p0 p0Var, int i11) {
        if (!T0()) {
            return p0Var.b(i11);
        }
        long jW0 = W0(v3.b.b(i11, 0, 13));
        return Math.max(v3.a.i(jW0), p0Var.b(i11));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.Q + ", sizeToIntrinsics=" + this.R + ", alignment=" + this.S + ", alpha=" + this.U + ", colorFilter=" + this.V + ')';
    }
}
