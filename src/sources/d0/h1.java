package d0;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bp.r0 f22717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1.d1 f22718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u1 f22719c;

    public h1(bp.r0 r0Var, d1.d1 d1Var, u1 u1Var) {
        this.f22717a = r0Var;
        this.f22718b = d1Var;
        this.f22719c = u1Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // y2.d1
    public final z1.q f() {
        return new j1(this.f22717a, this.f22718b, this.f22719c);
    }

    public final int hashCode() {
        return this.f22719c.hashCode() + ((this.f22718b.hashCode() + defpackage.e.e(defpackage.e.a(defpackage.e.a(defpackage.e.f(9205357640488583168L, defpackage.e.e(defpackage.e.a(this.f22717a.hashCode() * 961, Float.NaN, 31), 31, true), 31), Float.NaN, 31), Float.NaN, 31), 31, true)) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        j1 j1Var = (j1) qVar;
        j1Var.getClass();
        u1 u1Var = j1Var.S;
        View view = j1Var.T;
        v3.c cVar = j1Var.U;
        j1Var.Q = this.f22717a;
        j1Var.R = this.f22718b;
        u1 u1Var2 = this.f22719c;
        j1Var.S = u1Var2;
        View viewZ = y2.f.z(j1Var);
        v3.c cVar2 = y2.f.x(j1Var).f56881b0;
        if (j1Var.V != null) {
            g3.a0 a0Var = k1.f22752a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !u1Var2.a()) || !v3.f.b(Float.NaN, Float.NaN) || !v3.f.b(Float.NaN, Float.NaN) || !u1Var2.equals(u1Var) || !viewZ.equals(view) || !kotlin.jvm.internal.m.a(cVar2, cVar)) {
                j1Var.U0();
            }
        }
        j1Var.V0();
    }
}
