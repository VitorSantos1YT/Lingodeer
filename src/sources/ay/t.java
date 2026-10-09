package ay;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends AtomicReference implements qx.k {
    private static final long serialVersionUID = -4606175640614850599L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f3382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f3383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile iy.f f3384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3385d;

    public t(u uVar) {
        this.f3382a = uVar;
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        if (ux.b.e(this, bVar) && (bVar instanceof iy.a)) {
            iy.a aVar = (iy.a) bVar;
            int iA = aVar.a(7);
            if (iA == 1) {
                this.f3385d = iA;
                this.f3384c = aVar;
                this.f3383b = true;
                this.f3382a.e();
                return;
            }
            if (iA == 2) {
                this.f3385d = iA;
                this.f3384c = aVar;
            }
        }
    }

    @Override // qx.k
    public final void onComplete() {
        this.f3383b = true;
        this.f3382a.e();
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        if (this.f3382a.f3392t.b(th2)) {
            u uVar = this.f3382a;
            uVar.getClass();
            uVar.d();
            this.f3383b = true;
            this.f3382a.e();
        }
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        if (this.f3385d != 0) {
            this.f3382a.e();
            return;
        }
        u uVar = this.f3382a;
        if (uVar.get() == 0 && uVar.compareAndSet(0, 1)) {
            uVar.f3386a.onNext(obj);
            if (uVar.decrementAndGet() == 0) {
                return;
            }
        } else {
            iy.f hVar = this.f3384c;
            if (hVar == null) {
                hVar = new iy.h(uVar.f3389d);
                this.f3384c = hVar;
            }
            hVar.offer(obj);
            if (uVar.getAndIncrement() != 0) {
                return;
            }
        }
        uVar.f();
    }
}
