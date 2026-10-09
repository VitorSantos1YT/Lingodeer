package zx;

import dy.w;
import dy.x;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends qx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qx.o f59598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f59599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f59600d;

    public g(long j11, long j12, qx.o oVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f59599c = j11;
        this.f59600d = j12;
        this.f59598b = oVar;
    }

    @Override // qx.d
    public final void e(n20.b bVar) {
        f fVar = new f(bVar);
        bVar.c(fVar);
        qx.o oVar = this.f59598b;
        boolean z11 = oVar instanceof x;
        AtomicReference atomicReference = fVar.f59597c;
        if (!z11) {
            ux.b.e(atomicReference, oVar.d(fVar, this.f59599c, this.f59600d, TimeUnit.MILLISECONDS));
        } else {
            w wVar = new w();
            ux.b.e(atomicReference, wVar);
            wVar.e(fVar, this.f59599c, this.f59600d, TimeUnit.MILLISECONDS);
        }
    }
}
