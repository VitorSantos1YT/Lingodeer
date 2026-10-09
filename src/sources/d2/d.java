package d2;

import y2.k0;
import y2.o1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends q implements o1, b, y2.q {
    public final e Q;
    public boolean R;
    public fz.c S;

    public d(e eVar, fz.c cVar) {
        this.Q = eVar;
        this.S = cVar;
        eVar.f23069a = this;
    }

    @Override // y2.q
    public final void N() {
        T0();
    }

    @Override // z1.q
    public final void N0() {
        T0();
    }

    @Override // y2.m
    public final void S() {
        T0();
    }

    public final void T0() {
        this.R = false;
        this.Q.f23070b = null;
        y2.f.m(this);
    }

    @Override // y2.m
    public final void c() {
        T0();
    }

    @Override // d2.b
    public final long d() {
        return ff.h.P(y2.f.v(this, 4).f54503c);
    }

    @Override // d2.b
    public final v3.c getDensity() {
        return y2.f.x(this).f56881b0;
    }

    @Override // d2.b
    public final v3.m getLayoutDirection() {
        return y2.f.x(this).f56883c0;
    }

    @Override // y2.q
    public final void i(k0 k0Var) {
        boolean z11 = this.R;
        e eVar = this.Q;
        if (!z11) {
            eVar.f23070b = null;
            y2.f.t(this, new c(0, this, eVar));
            if (eVar.f23070b == null) {
                throw defpackage.e.t("DrawResult not defined, did you forget to call onDraw?");
            }
            this.R = true;
        }
        a5.f fVar = eVar.f23070b;
        kotlin.jvm.internal.m.c(fVar);
        ((fz.c) fVar.f378b).invoke(k0Var);
    }

    @Override // y2.o1
    public final void m0() {
        T0();
    }

    @Override // z1.q
    public final void M0() {
    }
}
