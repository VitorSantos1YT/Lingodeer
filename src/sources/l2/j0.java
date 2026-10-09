package l2;

import a0.b2;
import l1.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends k2.b {
    public final e0 H;
    public final k1 K;
    public float L;
    public g2.p M;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f39642f = l1.t.B(new f2.e(0));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k1 f39643t = l1.t.B(Boolean.FALSE);

    public j0(b bVar) {
        e0 e0Var = new e0(bVar);
        e0Var.f39593f = new a0.c0(this, 18);
        this.H = e0Var;
        this.K = new k1(qy.b0.f48488a, l1.g.f39300d);
        this.L = 1.0f;
    }

    @Override // k2.b
    public final boolean b(float f5) {
        this.L = f5;
        return true;
    }

    @Override // k2.b
    public final boolean c(g2.p pVar) {
        this.M = pVar;
        return true;
    }

    @Override // k2.b
    public final long h() {
        return ((f2.e) this.f39642f.getValue()).f26584a;
    }

    @Override // k2.b
    public final void i(i2.d dVar) {
        g2.p pVar = this.M;
        e0 e0Var = this.H;
        if (pVar == null) {
            pVar = (g2.p) e0Var.f39594g.getValue();
        }
        if (((Boolean) this.f39643t.getValue()).booleanValue() && dVar.getLayoutDirection() == v3.m.Rtl) {
            long jR0 = dVar.r0();
            xq.c cVarJ0 = dVar.j0();
            long jH = cVarJ0.H();
            cVarJ0.x().e();
            try {
                ((b2) cVarJ0.f56174b).n(jR0, -1.0f, 1.0f);
                e0Var.e(dVar, this.L, pVar);
                com.google.android.material.datepicker.d.C(cVarJ0, jH);
            } catch (Throwable th2) {
                com.google.android.material.datepicker.d.C(cVarJ0, jH);
                throw th2;
            }
        } else {
            e0Var.e(dVar, this.L, pVar);
        }
        this.K.getValue();
    }
}
