package sw;

import lw.l0;
import lw.m0;
import lw.n0;
import lw.q0;
import lw.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends q0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f51845f;

    public e(h hVar) {
        this.f51845f = hVar;
    }

    @Override // lw.q0
    public final void c(q1 q1Var) {
        this.f51845f.f51851g.q(lw.n.TRANSIENT_FAILURE, new l0(m0.a(q1Var)));
    }

    @Override // lw.q0
    public final void d(n0 n0Var) {
        throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
    }

    @Override // lw.q0
    public final void f() {
    }
}
