package zx;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends AtomicLong implements qx.e, n20.c {
    private static final long serialVersionUID = -6246093802440953054L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f59621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tx.c f59622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n20.c f59623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f59624d;

    public m(n20.b bVar, n nVar) {
        this.f59621a = bVar;
        this.f59622b = nVar;
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (fy.c.e(this.f59623c, cVar)) {
            this.f59623c = cVar;
            this.f59621a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // n20.c
    public final void cancel() {
        this.f59623c.cancel();
    }

    @Override // n20.b
    public final void onComplete() {
        if (this.f59624d) {
            return;
        }
        this.f59624d = true;
        this.f59621a.onComplete();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        if (this.f59624d) {
            qx.p.u(th2);
        } else {
            this.f59624d = true;
            this.f59621a.onError(th2);
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.f59624d) {
            return;
        }
        if (get() != 0) {
            this.f59621a.onNext(obj);
            com.bumptech.glide.e.z(this, 1L);
            return;
        }
        try {
            this.f59622b.accept(obj);
        } catch (Throwable th2) {
            ef.e.E(th2);
            cancel();
            onError(th2);
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        if (fy.c.c(j11)) {
            com.bumptech.glide.e.g(this, j11);
        }
    }
}
