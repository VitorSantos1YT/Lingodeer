package zx;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends AtomicLong implements n20.c, Runnable {
    private static final long serialVersionUID = -2809475196591179431L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f59595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f59596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f59597c = new AtomicReference();

    public f(n20.b bVar) {
        this.f59595a = bVar;
    }

    @Override // n20.c
    public final void cancel() {
        ux.b.a(this.f59597c);
    }

    @Override // n20.c
    public final void request(long j11) {
        if (fy.c.c(j11)) {
            com.bumptech.glide.e.g(this, j11);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f59597c;
        if (atomicReference.get() != ux.b.DISPOSED) {
            long j11 = get();
            n20.b bVar = this.f59595a;
            if (j11 == 0) {
                bVar.onError(new MissingBackpressureException(defpackage.e.i(this.f59596b, " due to lack of requests", new StringBuilder("Could not emit value "))));
                ux.b.a(atomicReference);
            } else {
                long j12 = this.f59596b;
                this.f59596b = j12 + 1;
                bVar.onNext(Long.valueOf(j12));
                com.bumptech.glide.e.z(this, 1L);
            }
        }
    }
}
