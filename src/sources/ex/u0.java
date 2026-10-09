package ex;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u0 extends mx.a implements uw.g, Runnable {
    private static final long serialVersionUID = -8241002408341274697L;
    public volatile boolean H;
    public Throwable K;
    public int L;
    public long M;
    public boolean N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw.m f26073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f26076d = new AtomicLong();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n20.c f26077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bx.g f26078f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f26079t;

    public u0(uw.m mVar, int i11) {
        this.f26073a = mVar;
        this.f26074b = i11;
        this.f26075c = i11 - (i11 >> 2);
    }

    @Override // bx.c
    public final int a(int i11) {
        this.N = true;
        return 2;
    }

    @Override // n20.c
    public final void cancel() {
        if (this.f26079t) {
            return;
        }
        this.f26079t = true;
        this.f26077e.cancel();
        this.f26073a.dispose();
        if (this.N || getAndIncrement() != 0) {
            return;
        }
        this.f26078f.clear();
    }

    @Override // bx.g
    public final void clear() {
        this.f26078f.clear();
    }

    public final boolean e(boolean z11, boolean z12, n20.b bVar) {
        if (this.f26079t) {
            clear();
            return true;
        }
        if (!z11) {
            return false;
        }
        Throwable th2 = this.K;
        if (th2 != null) {
            this.f26079t = true;
            clear();
            bVar.onError(th2);
            this.f26073a.dispose();
            return true;
        }
        if (!z12) {
            return false;
        }
        this.f26079t = true;
        bVar.onComplete();
        this.f26073a.dispose();
        return true;
    }

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public final void i() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f26073a.b(this);
    }

    @Override // bx.g
    public final boolean isEmpty() {
        return this.f26078f.isEmpty();
    }

    @Override // n20.b
    public final void onComplete() {
        if (this.H) {
            return;
        }
        this.H = true;
        i();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        if (this.H) {
            qx.b.B(th2);
            return;
        }
        this.K = th2;
        this.H = true;
        i();
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.H) {
            return;
        }
        if (this.L == 2) {
            i();
            return;
        }
        if (!this.f26078f.offer(obj)) {
            this.f26077e.cancel();
            this.K = new MissingBackpressureException("Queue is full?!");
            this.H = true;
        }
        i();
    }

    @Override // n20.c
    public final void request(long j11) {
        if (mx.g.c(j11)) {
            ue.f.i(this.f26076d, j11);
            i();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.N) {
            g();
        } else if (this.L == 1) {
            h();
        } else {
            f();
        }
    }
}
