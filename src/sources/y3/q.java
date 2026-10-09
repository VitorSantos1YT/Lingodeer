package y3;

import d0.m0;
import e2.e0;
import kotlin.jvm.internal.y;
import n0.h0;
import y2.o1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends y2.n implements o1, y2.l {
    public final e0 S;
    public h0 T;

    public q() {
        e0 e0Var = new e0(0, 9, new m0(2, this, q.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 13));
        T0(e0Var);
        this.S = e0Var;
    }

    @Override // y2.o1
    public final void m0() {
        y yVar = new y();
        y2.f.t(this, new d2.c(15, yVar, this));
        h0 h0Var = (h0) yVar.f38361a;
        if (this.S.X0().a()) {
            h0 h0Var2 = this.T;
            if (h0Var2 != null) {
                h0Var2.b();
            }
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.T = h0Var;
        }
    }
}
