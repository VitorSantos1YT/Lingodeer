package zx;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends AtomicInteger implements qx.e, n20.c {
    private static final long serialVersionUID = -5050301752721603566L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f59585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n20.c f59586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f59587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f59588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f59589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicLong f59590f = new AtomicLong();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicReference f59591t = new AtomicReference();

    public a(n20.b bVar) {
        this.f59585a = bVar;
    }

    public final boolean a(boolean z11, boolean z12, n20.b bVar, AtomicReference atomicReference) {
        if (this.f59589e) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z11) {
            return false;
        }
        Throwable th2 = this.f59588d;
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
        n20.b bVar = this.f59585a;
        AtomicLong atomicLong = this.f59590f;
        AtomicReference atomicReference = this.f59591t;
        int iAddAndGet = 1;
        do {
            long j11 = 0;
            while (true) {
                if (j11 == atomicLong.get()) {
                    break;
                }
                boolean z11 = this.f59587c;
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
                if (a(this.f59587c, atomicReference.get() == null, bVar, atomicReference)) {
                    return;
                }
            }
            if (j11 != 0) {
                com.bumptech.glide.e.z(atomicLong, j11);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (fy.c.e(this.f59586b, cVar)) {
            this.f59586b = cVar;
            this.f59585a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // n20.c
    public final void cancel() {
        if (this.f59589e) {
            return;
        }
        this.f59589e = true;
        this.f59586b.cancel();
        if (getAndIncrement() == 0) {
            this.f59591t.lazySet(null);
        }
    }

    @Override // n20.b
    public final void onComplete() {
        this.f59587c = true;
        b();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        this.f59588d = th2;
        this.f59587c = true;
        b();
    }

    @Override // n20.c
    public final void request(long j11) {
        if (fy.c.c(j11)) {
            com.bumptech.glide.e.g(this.f59590f, j11);
            b();
        }
    }
}
