package zx;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends AtomicReference implements qx.e, n20.c, Runnable {
    private static final long serialVersionUID = 8094547886072529208L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f59630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qx.n f59631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f59632c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f59633d = new AtomicLong();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f59634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n20.a f59635f;

    public r(n20.b bVar, qx.n nVar, n20.a aVar, boolean z11) {
        this.f59630a = bVar;
        this.f59631b = nVar;
        this.f59635f = aVar;
        this.f59634e = !z11;
    }

    public final void a(long j11, n20.c cVar) {
        if (this.f59634e || Thread.currentThread() == get()) {
            cVar.request(j11);
        } else {
            this.f59631b.d(new mw.u(cVar, j11, 1));
        }
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (fy.c.b(this.f59632c, cVar)) {
            long andSet = this.f59633d.getAndSet(0L);
            if (andSet != 0) {
                a(andSet, cVar);
            }
        }
    }

    @Override // n20.c
    public final void cancel() {
        fy.c.a(this.f59632c);
        this.f59631b.dispose();
    }

    @Override // n20.b
    public final void onComplete() {
        this.f59630a.onComplete();
        this.f59631b.dispose();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        this.f59630a.onError(th2);
        this.f59631b.dispose();
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        this.f59630a.onNext(obj);
    }

    @Override // n20.c
    public final void request(long j11) {
        if (fy.c.c(j11)) {
            AtomicReference atomicReference = this.f59632c;
            n20.c cVar = (n20.c) atomicReference.get();
            if (cVar != null) {
                a(j11, cVar);
                return;
            }
            AtomicLong atomicLong = this.f59633d;
            com.bumptech.glide.e.g(atomicLong, j11);
            n20.c cVar2 = (n20.c) atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, cVar2);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        lazySet(Thread.currentThread());
        n20.a aVar = this.f59635f;
        this.f59635f = null;
        aVar.a(this);
    }
}
