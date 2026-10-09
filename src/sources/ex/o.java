package ex;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends k {
    private static final long serialVersionUID = 4023437720691792495L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f26049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f26050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f26051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f26052f;

    public o(n20.b bVar) {
        super(bVar);
        this.f26049c = new AtomicReference();
        this.f26052f = new AtomicInteger();
    }

    @Override // ex.k
    public final void d() {
        g();
    }

    @Override // ex.k
    public final void e() {
        if (this.f26052f.getAndIncrement() == 0) {
            this.f26049c.lazySet(null);
        }
    }

    @Override // ex.k
    public final boolean f(Throwable th2) {
        if (this.f26051e || this.f26037b.a()) {
            return false;
        }
        this.f26050d = th2;
        this.f26051e = true;
        g();
        return true;
    }

    public final void g() {
        if (this.f26052f.getAndIncrement() != 0) {
            return;
        }
        n20.b bVar = this.f26036a;
        AtomicReference atomicReference = this.f26049c;
        int iAddAndGet = 1;
        do {
            long j11 = get();
            long j12 = 0;
            while (true) {
                if (j12 == j11) {
                    break;
                }
                if (this.f26037b.a()) {
                    atomicReference.lazySet(null);
                    return;
                }
                boolean z11 = this.f26051e;
                Object andSet = atomicReference.getAndSet(null);
                boolean z12 = andSet == null;
                if (z11 && z12) {
                    Throwable th2 = this.f26050d;
                    if (th2 != null) {
                        b(th2);
                        return;
                    } else {
                        a();
                        return;
                    }
                }
                if (z12) {
                    break;
                }
                bVar.onNext(andSet);
                j12++;
            }
            if (j12 == j11) {
                if (this.f26037b.a()) {
                    atomicReference.lazySet(null);
                    return;
                }
                boolean z13 = this.f26051e;
                boolean z14 = atomicReference.get() == null;
                if (z13 && z14) {
                    Throwable th3 = this.f26050d;
                    if (th3 != null) {
                        b(th3);
                        return;
                    } else {
                        a();
                        return;
                    }
                }
            }
            if (j12 != 0) {
                ue.f.A(this, j12);
            }
            iAddAndGet = this.f26052f.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // uw.e
    public final void onNext(Object obj) {
        if (this.f26051e || this.f26037b.a()) {
            return;
        }
        if (obj == null) {
            c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.f26049c.set(obj);
            g();
        }
    }
}
