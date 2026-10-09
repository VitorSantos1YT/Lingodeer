package ey;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import n20.c;
import qx.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends AtomicInteger implements e, c {
    private static final long serialVersionUID = -4945028590049415624L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f26108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gy.c f26109b = new gy.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f26110c = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f26111d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f26112e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f26113f;

    public b(n20.b bVar) {
        this.f26108a = bVar;
    }

    @Override // n20.b
    public final void c(c cVar) {
        if (!this.f26112e.compareAndSet(false, true)) {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
            return;
        }
        this.f26108a.c(this);
        if (fy.c.b(this.f26111d, cVar)) {
            long andSet = this.f26110c.getAndSet(0L);
            if (andSet != 0) {
                cVar.request(andSet);
            }
        }
    }

    @Override // n20.c
    public final void cancel() {
        if (this.f26113f) {
            return;
        }
        fy.c.a(this.f26111d);
    }

    @Override // n20.b
    public final void onComplete() {
        this.f26113f = true;
        n20.b bVar = this.f26108a;
        gy.c cVar = this.f26109b;
        if (getAndIncrement() == 0) {
            cVar.c(bVar);
        }
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        this.f26113f = true;
        n20.b bVar = this.f26108a;
        gy.c cVar = this.f26109b;
        if (cVar.b(th2) && getAndIncrement() == 0) {
            cVar.c(bVar);
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            n20.b bVar = this.f26108a;
            bVar.onNext(obj);
            if (decrementAndGet() == 0) {
                return;
            }
            this.f26109b.c(bVar);
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        if (j11 <= 0) {
            cancel();
            onError(new IllegalArgumentException(defpackage.e.h(j11, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        AtomicReference atomicReference = this.f26111d;
        c cVar = (c) atomicReference.get();
        if (cVar != null) {
            cVar.request(j11);
            return;
        }
        if (fy.c.c(j11)) {
            AtomicLong atomicLong = this.f26110c;
            com.bumptech.glide.e.g(atomicLong, j11);
            c cVar2 = (c) atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }
}
