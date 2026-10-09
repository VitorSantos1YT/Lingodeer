package lx;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nx.e;
import ue.f;
import uw.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends AtomicInteger implements g, n20.c {
    private static final long serialVersionUID = -4945028590049415624L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f40511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nx.b f40512b = new nx.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f40513c = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f40514d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f40515e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f40516f;

    public d(n20.b bVar) {
        this.f40511a = bVar;
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (!this.f40515e.compareAndSet(false, true)) {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
            return;
        }
        this.f40511a.c(this);
        if (mx.g.b(this.f40514d, cVar)) {
            long andSet = this.f40513c.getAndSet(0L);
            if (andSet != 0) {
                cVar.request(andSet);
            }
        }
    }

    @Override // n20.c
    public final void cancel() {
        if (this.f40516f) {
            return;
        }
        mx.g.a(this.f40514d);
    }

    @Override // n20.b
    public final void onComplete() {
        this.f40516f = true;
        n20.b bVar = this.f40511a;
        nx.b bVar2 = this.f40512b;
        if (getAndIncrement() == 0) {
            bVar2.getClass();
            Throwable thB = e.b(bVar2);
            if (thB != null) {
                bVar.onError(thB);
            } else {
                bVar.onComplete();
            }
        }
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        this.f40516f = true;
        n20.b bVar = this.f40511a;
        nx.b bVar2 = this.f40512b;
        bVar2.getClass();
        if (!e.a(bVar2, th2)) {
            qx.b.B(th2);
        } else if (getAndIncrement() == 0) {
            bVar.onError(e.b(bVar2));
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            n20.b bVar = this.f40511a;
            bVar.onNext(obj);
            if (decrementAndGet() != 0) {
                nx.b bVar2 = this.f40512b;
                bVar2.getClass();
                Throwable thB = e.b(bVar2);
                if (thB != null) {
                    bVar.onError(thB);
                } else {
                    bVar.onComplete();
                }
            }
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        if (j11 <= 0) {
            cancel();
            onError(new IllegalArgumentException(defpackage.e.h(j11, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        AtomicReference atomicReference = this.f40514d;
        n20.c cVar = (n20.c) atomicReference.get();
        if (cVar != null) {
            cVar.request(j11);
            return;
        }
        if (mx.g.c(j11)) {
            AtomicLong atomicLong = this.f40513c;
            f.i(atomicLong, j11);
            n20.c cVar2 = (n20.c) atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }
}
