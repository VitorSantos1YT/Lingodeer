package g2;

import w2.g1;
import y2.b2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends z1.q implements y2.z, b2 {
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public long W;
    public w0 X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f28625a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f28626b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public a0.o0 f28627c0;

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        g1 g1VarB = p0Var.B(j11);
        return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new a0.e(2, g1VarB, this));
    }

    @Override // y2.b2
    public final boolean e() {
        return false;
    }

    @Override // y2.b2
    public final void i0(g3.b0 b0Var) {
        if (this.Y) {
            w0 w0Var = this.X;
            mz.j[] jVarArr = g3.z.f28737a;
            g3.a0 a0Var = g3.x.P;
            mz.j jVar = g3.z.f28737a[28];
            b0Var.b(a0Var, w0Var);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.Q);
        sb2.append(", scaleY=");
        sb2.append(this.R);
        sb2.append(", alpha = ");
        sb2.append(this.S);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.T);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.U);
        sb2.append(", cameraDistance=");
        sb2.append(this.V);
        sb2.append(", transformOrigin=");
        sb2.append((Object) z0.d(this.W));
        sb2.append(", shape=");
        sb2.append(this.X);
        sb2.append(", clip=");
        sb2.append(this.Y);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        com.google.android.material.datepicker.d.t(this.Z, ", spotShadowColor=", sb2);
        com.google.android.material.datepicker.d.t(this.f28625a0, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", sb2);
        sb2.append((Object) f0.H(this.f28626b0));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }
}
