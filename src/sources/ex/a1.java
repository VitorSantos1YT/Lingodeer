package ex;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends AtomicLong implements uw.g, n20.c {
    private static final long serialVersionUID = -3176480756392482682L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f25957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n20.c f25958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25959c;

    public a1(n20.b bVar) {
        this.f25957a = bVar;
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.e(this.f25958b, cVar)) {
            this.f25958b = cVar;
            this.f25957a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // n20.c
    public final void cancel() {
        this.f25958b.cancel();
    }

    @Override // n20.b
    public final void onComplete() {
        if (this.f25959c) {
            return;
        }
        this.f25959c = true;
        this.f25957a.onComplete();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        if (this.f25959c) {
            qx.b.B(th2);
        } else {
            this.f25959c = true;
            this.f25957a.onError(th2);
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.f25959c) {
            return;
        }
        if (get() != 0) {
            this.f25957a.onNext(obj);
            ue.f.A(this, 1L);
        } else {
            this.f25958b.cancel();
            onError(new MissingBackpressureException("could not emit value due to lack of requests"));
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        if (mx.g.c(j11)) {
            ue.f.i(this, j11);
        }
    }
}
