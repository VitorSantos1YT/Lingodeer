package d0;

import com.yalantis.ucrop.view.CropImageView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends z1.q implements y2.q, y2.o1, y2.b2 {
    public long Q;
    public g2.t R;
    public float S;
    public g2.w0 T;
    public long U;
    public v3.m V;
    public g2.f0 W;
    public g2.w0 X;
    public g2.f0 Y;

    @Override // y2.b2
    public final boolean e() {
        return false;
    }

    @Override // y2.q
    public final void i(y2.k0 k0Var) {
        g2.f0 f0Var;
        g2.t tVar;
        g2.p0 p0Var;
        i2.b bVar = k0Var.f56937a;
        if (this.T == g2.f0.f28556b) {
            if (!g2.x.d(this.Q, g2.x.f28622i)) {
                i2.d.U(k0Var, this.Q, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 126);
            }
            g2.t tVar2 = this.R;
            if (tVar2 != null) {
                i2.d.p0(k0Var, tVar2, 0L, 0L, this.S, null, 118);
            }
        } else {
            if (f2.e.a(bVar.d(), this.U) && k0Var.getLayoutDirection() == this.V && kotlin.jvm.internal.m.a(this.X, this.T)) {
                f0Var = this.W;
                kotlin.jvm.internal.m.c(f0Var);
            } else {
                y2.f.t(this, new at.f(23, this, k0Var));
                f0Var = this.Y;
                this.Y = null;
            }
            this.W = f0Var;
            this.U = bVar.d();
            this.V = k0Var.getLayoutDirection();
            this.X = this.T;
            kotlin.jvm.internal.m.c(f0Var);
            if (!g2.x.d(this.Q, g2.x.f28622i)) {
                g2.f0.n(k0Var, f0Var, this.Q);
            }
            g2.t tVar3 = this.R;
            if (tVar3 != null) {
                float f5 = this.S;
                boolean z11 = f0Var instanceof g2.m0;
                i2.g gVar = i2.g.f34126a;
                if (z11) {
                    f2.c cVar = ((g2.m0) f0Var).f28585f;
                    float f11 = cVar.f26572a;
                    k0Var.u0(tVar3, (4294967295L & ((long) Float.floatToRawIntBits(cVar.f26573b))) | (Float.floatToRawIntBits(f11) << 32), g2.f0.A(cVar), f5, gVar, 3);
                } else {
                    if (f0Var instanceof g2.n0) {
                        g2.n0 n0Var = (g2.n0) f0Var;
                        tVar = tVar3;
                        p0Var = n0Var.f28588g;
                        if (p0Var == null) {
                            f2.d dVar = n0Var.f28587f;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.f26583h >> 32));
                            k0Var.z(tVar, (((long) Float.floatToRawIntBits(dVar.f26576a)) << 32) | (((long) Float.floatToRawIntBits(dVar.f26577b)) & 4294967295L), (((long) Float.floatToRawIntBits(dVar.b())) << 32) | (((long) Float.floatToRawIntBits(dVar.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), f5, gVar);
                        }
                    } else {
                        if (!(f0Var instanceof g2.l0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        g2.p0 p0Var2 = ((g2.l0) f0Var).f28581f;
                        tVar = tVar3;
                        p0Var = p0Var2;
                    }
                    k0Var.b0(p0Var, tVar, f5, gVar, 3);
                }
            }
        }
        k0Var.a();
    }

    @Override // y2.o1
    public final void m0() {
        this.U = 9205357640488583168L;
        this.V = null;
        this.W = null;
        this.X = null;
        y2.f.m(this);
    }

    @Override // y2.b2
    public final void i0(g3.b0 b0Var) {
    }
}
