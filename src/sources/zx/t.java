package zx;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends AtomicReference implements n20.c, Runnable {
    private static final long serialVersionUID = -2809475196591179431L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f59638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f59639b;

    public t(n20.b bVar) {
        this.f59638a = bVar;
    }

    @Override // n20.c
    public final void cancel() {
        ux.b.a(this);
    }

    @Override // n20.c
    public final void request(long j11) {
        if (fy.c.c(j11)) {
            this.f59639b = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != ux.b.DISPOSED) {
            if (!this.f59639b) {
                lazySet(ux.c.INSTANCE);
                this.f59638a.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            } else {
                this.f59638a.onNext(0L);
                lazySet(ux.c.INSTANCE);
                this.f59638a.onComplete();
            }
        }
    }
}
