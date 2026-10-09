package mw;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f42472e = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f42473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw.t1 f42474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y0 f42475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b1.p f42476d;

    public j(n3 n3Var, w2 w2Var, lw.t1 t1Var) {
        this.f42473a = w2Var;
        this.f42474b = t1Var;
    }

    public final void a(aj.i iVar) {
        this.f42474b.d();
        if (this.f42475c == null) {
            this.f42475c = n3.u();
        }
        b1.p pVar = this.f42476d;
        if (pVar != null) {
            lw.s1 s1Var = (lw.s1) pVar.f3800b;
            if (!s1Var.f40467c && !s1Var.f40466b) {
                return;
            }
        }
        long jA = this.f42475c.a();
        this.f42476d = this.f42474b.c(iVar, jA, TimeUnit.NANOSECONDS, this.f42473a);
        f42472e.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
    }
}
