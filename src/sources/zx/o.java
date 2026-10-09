package zx;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends AtomicLong implements qx.e, n20.c {
    private static final long serialVersionUID = -3176480756392482682L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f59626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n20.c f59627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59628c;

    public o(n20.b bVar) {
        this.f59626a = bVar;
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (fy.c.e(this.f59627b, cVar)) {
            this.f59627b = cVar;
            this.f59626a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // n20.c
    public final void cancel() {
        this.f59627b.cancel();
    }

    @Override // n20.b
    public final void onComplete() {
        if (this.f59628c) {
            return;
        }
        this.f59628c = true;
        this.f59626a.onComplete();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        if (this.f59628c) {
            qx.p.u(th2);
        } else {
            this.f59628c = true;
            this.f59626a.onError(th2);
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.f59628c) {
            return;
        }
        if (get() != 0) {
            this.f59626a.onNext(obj);
            com.bumptech.glide.e.z(this, 1L);
        } else {
            this.f59627b.cancel();
            onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        if (fy.c.c(j11)) {
            com.bumptech.glide.e.g(this, j11);
        }
    }
}
