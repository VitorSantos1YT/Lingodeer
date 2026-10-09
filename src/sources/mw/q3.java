package mw;

import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q3 implements lw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lw.o f42649a = lw.o.a(lw.n.IDLE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t3 f42650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u3 f42651c;

    public q3(u3 u3Var) {
        this.f42651c = u3Var;
    }

    @Override // lw.p0
    public final void a(lw.o oVar) {
        u3.f42717o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{oVar, this.f42650b.f42696a});
        this.f42649a = oVar;
        u3 u3Var = this.f42651c;
        if (u3Var.f42720h.c() && ((t3) u3Var.f42719g.get(u3Var.f42720h.a())).f42698c == this) {
            u3Var.j(this.f42650b);
        }
    }
}
