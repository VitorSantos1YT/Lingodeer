package mw;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t2 extends n0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lw.r f42691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final lw.e1 f42692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lw.c f42693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f42694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u2 f42695r;

    /* JADX WARN: Illegal instructions before constructor call */
    public t2(u2 u2Var, lw.r rVar, lw.e1 e1Var, lw.c cVar) {
        this.f42695r = u2Var;
        y2 y2Var = u2Var.f42716d;
        Logger logger = y2.f42807c0;
        Executor executor = cVar.f40350b;
        super(executor == null ? y2Var.f42823h : executor, y2Var.f42822g, cVar.f40349a);
        this.f42691n = rVar;
        this.f42692o = e1Var;
        this.f42693p = cVar;
        y2Var.Y.getClass();
        this.f42694q = System.nanoTime();
    }

    public final void u() {
        t tVar;
        lw.r rVarA = this.f42691n.a();
        try {
            lw.c cVar = this.f42693p;
            lp.b bVar = lw.j.f40401a;
            this.f42695r.f42716d.Y.getClass();
            lw.f fVarG = this.f42695r.g(this.f42692o, cVar.c(bVar, Long.valueOf(System.nanoTime() - this.f42694q)));
            this.f42691n.c(rVarA);
            synchronized (this) {
                try {
                    lw.f fVar = this.f42560i;
                    if (fVar != null) {
                        tVar = null;
                    } else {
                        Preconditions.q("realCall already set to %s", fVar == null, fVar);
                        ScheduledFuture scheduledFuture = this.f42555d;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f42560i = fVarG;
                        tVar = new t(this, this.f42557f);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (tVar == null) {
                this.f42695r.f42716d.m.execute(new aj.i(this, 16));
                return;
            }
            y2 y2Var = this.f42695r.f42716d;
            Executor executor = this.f42693p.f40350b;
            if (executor == null) {
                executor = y2Var.f42823h;
            }
            executor.execute(new i0(20, this, tVar));
        } catch (Throwable th3) {
            this.f42691n.c(rVarA);
            throw th3;
        }
    }
}
