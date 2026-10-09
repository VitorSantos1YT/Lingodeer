package ex;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b1 extends AtomicInteger implements uw.g, n20.c {
    private static final long serialVersionUID = 163080509307634843L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f25962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n20.c f25963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f25964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f25965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f25966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicLong f25967f = new AtomicLong();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicReference f25968t = new AtomicReference();

    public b1(n20.b bVar) {
        this.f25962a = bVar;
    }

    public final boolean a(boolean z11, boolean z12, n20.b bVar, AtomicReference atomicReference) {
        if (this.f25966e) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z11) {
            return false;
        }
        Throwable th2 = this.f25965d;
        if (th2 != null) {
            atomicReference.lazySet(null);
            bVar.onError(th2);
            return true;
        }
        if (!z12) {
            return false;
        }
        bVar.onComplete();
        return true;
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        n20.b bVar = this.f25962a;
        AtomicLong atomicLong = this.f25967f;
        AtomicReference atomicReference = this.f25968t;
        int iAddAndGet = 1;
        do {
            long j11 = 0;
            while (true) {
                if (j11 == atomicLong.get()) {
                    break;
                }
                boolean z11 = this.f25964c;
                Object andSet = atomicReference.getAndSet(null);
                boolean z12 = andSet == null;
                if (a(z11, z12, bVar, atomicReference)) {
                    return;
                }
                if (z12) {
                    break;
                }
                bVar.onNext(andSet);
                j11++;
            }
            if (j11 == atomicLong.get()) {
                if (a(this.f25964c, atomicReference.get() == null, bVar, atomicReference)) {
                    return;
                }
            }
            if (j11 != 0) {
                ue.f.A(atomicLong, j11);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.e(this.f25963b, cVar)) {
            this.f25963b = cVar;
            this.f25962a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // n20.c
    public final void cancel() {
        if (this.f25966e) {
            return;
        }
        this.f25966e = true;
        this.f25963b.cancel();
        if (getAndIncrement() == 0) {
            this.f25968t.lazySet(null);
        }
    }

    @Override // n20.b
    public final void onComplete() {
        this.f25964c = true;
        b();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        this.f25965d = th2;
        this.f25964c = true;
        b();
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        this.f25968t.lazySet(obj);
        b();
    }

    @Override // n20.c
    public final void request(long j11) {
        if (mx.g.c(j11)) {
            ue.f.i(this.f25967f, j11);
            b();
        }
    }
}
