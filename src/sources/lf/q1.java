package lf;

import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f40104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f40105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g1.k f40106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g1.k f40107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40108f;

    public q1(int i11) {
        Executor executorD = re.s.d();
        this.f40103a = i11;
        this.f40104b = executorD;
        this.f40105c = new ReentrantLock();
    }

    public final void a(g1.k kVar) {
        g1.k kVar2;
        ReentrantLock reentrantLock = this.f40105c;
        reentrantLock.lock();
        if (kVar != null) {
            this.f40107e = kVar.j(this.f40107e);
            this.f40108f--;
        }
        if (this.f40108f < this.f40103a) {
            kVar2 = this.f40106d;
            if (kVar2 != null) {
                this.f40106d = kVar2.j(kVar2);
                this.f40107e = kVar2.a(this.f40107e, false);
                this.f40108f++;
                kVar2.f28528a = true;
            }
        } else {
            kVar2 = null;
        }
        reentrantLock.unlock();
        if (kVar2 != null) {
            this.f40104b.execute(new b2.c(26, kVar2, this));
        }
    }
}
