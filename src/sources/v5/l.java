package v5;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends ob.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ob.f f53536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f53537d;

    public l(ob.f fVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f53536c = fVar;
        this.f53537d = threadPoolExecutor;
    }

    @Override // ob.f
    public final void E(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f53537d;
        try {
            this.f53536c.E(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // ob.f
    public final void F(ob.i iVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f53537d;
        try {
            this.f53536c.F(iVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
