package u7;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import se.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Executor f52812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f52813b;

    public a(ExecutorService executorService, n nVar) {
        this.f52812a = executorService;
        this.f52813b = nVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f52812a.execute(runnable);
    }
}
