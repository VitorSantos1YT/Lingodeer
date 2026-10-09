package mw;

import com.google.common.base.Preconditions;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q2 extends lw.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ob.i f42647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y2 f42648e;

    public q2(y2 y2Var) {
        this.f42648e = y2Var;
    }

    @Override // lw.f
    public final lw.y b(lw.k0 k0Var) {
        y2 y2Var = this.f42648e;
        y2Var.m.d();
        Preconditions.p("Channel is being terminated", !y2Var.H);
        return new x2(y2Var, k0Var);
    }

    @Override // lw.f
    public final lw.f c() {
        return this.f42648e.N;
    }

    @Override // lw.f
    public final ScheduledExecutorService d() {
        return this.f42648e.f42822g;
    }

    @Override // lw.f
    public final lw.t1 f() {
        return this.f42648e.m;
    }

    @Override // lw.f
    public final void k() {
        lw.t1 t1Var = this.f42648e.m;
        t1Var.d();
        t1Var.execute(new aj.i(this, 14));
    }

    @Override // lw.f
    public final void q(lw.n nVar, lw.o0 o0Var) {
        lw.t1 t1Var = this.f42648e.m;
        t1Var.d();
        Preconditions.k(nVar, "newState");
        Preconditions.k(o0Var, "newPicker");
        t1Var.execute(new com.android.billingclient.api.b0(6, this, o0Var, nVar, false));
    }
}
