package mw;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p2 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lf.x0 f42619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f42620b;

    public p2(lf.x0 x0Var) {
        Preconditions.k(x0Var, "executorPool");
        this.f42619a = x0Var;
    }

    public final synchronized void a() {
        Executor executor = this.f42620b;
        if (executor != null) {
            this.f42619a.F(executor);
            this.f42620b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        synchronized (this) {
            try {
                if (this.f42620b == null) {
                    Executor executor2 = (Executor) this.f42619a.B();
                    Preconditions.j(executor2, this.f42620b, "%s.getObject()");
                    this.f42620b = executor2;
                }
                executor = this.f42620b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        executor.execute(runnable);
    }
}
