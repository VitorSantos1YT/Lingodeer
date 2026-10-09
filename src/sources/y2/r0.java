package y2;

import com.yalantis.ucrop.view.CropImageView;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 extends q0 implements w2.p0 {
    public final k1 Q;
    public LinkedHashMap S;
    public w2.r0 U;
    public final y.d0 V;
    public long R = 0;
    public final w2.o0 T = new w2.o0(this);

    public r0(k1 k1Var) {
        this.Q = k1Var;
        y.d0 d0Var = y.n0.f56743a;
        this.V = new y.d0();
    }

    public static final void R0(r0 r0Var, w2.r0 r0Var2) {
        LinkedHashMap linkedHashMap;
        if (r0Var2 != null) {
            r0Var.l0((((long) r0Var2.f()) & 4294967295L) | (((long) r0Var2.h()) << 32));
        } else {
            r0Var.l0(0L);
        }
        if (!kotlin.jvm.internal.m.a(r0Var.U, r0Var2) && r0Var2 != null && ((((linkedHashMap = r0Var.S) != null && !linkedHashMap.isEmpty()) || !r0Var2.a().isEmpty()) && !kotlin.jvm.internal.m.a(r0Var2.a(), r0Var.S))) {
            v0 v0Var = r0Var.Q.Q.f56893j0.f56975q;
            kotlin.jvm.internal.m.c(v0Var);
            v0Var.T.f();
            LinkedHashMap linkedHashMap2 = r0Var.S;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                r0Var.S = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(r0Var2.a());
        }
        r0Var.U = r0Var2;
    }

    @Override // w2.g1, w2.p0
    public final Object G() {
        return this.Q.G();
    }

    @Override // y2.q0
    public final q0 G0() {
        k1 k1Var = this.Q.R;
        if (k1Var != null) {
            return k1Var.a1();
        }
        return null;
    }

    @Override // y2.q0
    public final w2.x H0() {
        return this.T;
    }

    @Override // y2.q0
    public final boolean I0() {
        return this.U != null;
    }

    @Override // y2.q0
    public final i0 J0() {
        return this.Q.Q;
    }

    @Override // y2.q0
    public final w2.r0 K0() {
        w2.r0 r0Var = this.U;
        if (r0Var != null) {
            return r0Var;
        }
        throw defpackage.e.t("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // y2.q0
    public final q0 L0() {
        k1 k1Var = this.Q.S;
        if (k1Var != null) {
            return k1Var.a1();
        }
        return null;
    }

    @Override // y2.q0
    public final long M0() {
        return this.R;
    }

    @Override // y2.q0
    public final void Q0() {
        i0(this.R, CropImageView.DEFAULT_ASPECT_RATIO, null);
    }

    public void S0() {
        K0().b();
    }

    public final void T0(long j11) {
        if (!v3.j.c(this.R, j11)) {
            this.R = j11;
            k1 k1Var = this.Q;
            v0 v0Var = k1Var.Q.f56893j0.f56975q;
            if (v0Var != null) {
                v0Var.F0();
            }
            q0.O0(k1Var);
        }
        if (this.M) {
            return;
        }
        F0(K0());
    }

    public final long U0(r0 r0Var, boolean z11) {
        long jE = 0;
        r0 r0VarA1 = this;
        while (!r0VarA1.equals(r0Var)) {
            if (!r0VarA1.K || !z11) {
                jE = v3.j.e(jE, r0VarA1.R);
            }
            k1 k1Var = r0VarA1.Q.S;
            kotlin.jvm.internal.m.c(k1Var);
            r0VarA1 = k1Var.a1();
            kotlin.jvm.internal.m.c(r0VarA1);
        }
        return jE;
    }

    @Override // v3.c
    public final float Z() {
        return this.Q.Z();
    }

    @Override // y2.q0, w2.s
    public final boolean c0() {
        return true;
    }

    @Override // v3.c
    public final float getDensity() {
        return this.Q.getDensity();
    }

    @Override // w2.s
    public final v3.m getLayoutDirection() {
        return this.Q.Q.f56883c0;
    }

    @Override // w2.g1
    public final void i0(long j11, float f5, fz.c cVar) {
        T0(j11);
        if (this.L) {
            return;
        }
        S0();
    }
}
