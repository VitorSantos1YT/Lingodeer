package ex;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends mx.a implements uw.g {
    private static final long serialVersionUID = -2514538129242366402L;
    public final AtomicLong H = new AtomicLong();
    public boolean K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f26088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bx.f f26089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yw.a f26090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n20.c f26091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f26092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f26093f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Throwable f26094t;

    public x0(n20.b bVar, int i11, boolean z11, ay.k0 k0Var) {
        this.f26088a = bVar;
        this.f26090c = k0Var;
        this.f26089b = z11 ? new jx.b(i11) : new jx.a(i11);
    }

    @Override // bx.c
    public final int a(int i11) {
        this.K = true;
        return 2;
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.e(this.f26091d, cVar)) {
            this.f26091d = cVar;
            this.f26088a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // n20.c
    public final void cancel() {
        if (this.f26092e) {
            return;
        }
        this.f26092e = true;
        this.f26091d.cancel();
        if (this.K || getAndIncrement() != 0) {
            return;
        }
        this.f26089b.clear();
    }

    @Override // bx.g
    public final void clear() {
        this.f26089b.clear();
    }

    public final boolean e(boolean z11, boolean z12, n20.b bVar) {
        if (this.f26092e) {
            this.f26089b.clear();
            return true;
        }
        if (!z11) {
            return false;
        }
        Throwable th2 = this.f26094t;
        if (th2 != null) {
            this.f26089b.clear();
            bVar.onError(th2);
            return true;
        }
        if (!z12) {
            return false;
        }
        bVar.onComplete();
        return true;
    }

    public final void f() {
        if (getAndIncrement() == 0) {
            bx.f fVar = this.f26089b;
            n20.b bVar = this.f26088a;
            int iAddAndGet = 1;
            while (!e(this.f26093f, fVar.isEmpty(), bVar)) {
                long j11 = this.H.get();
                long j12 = 0;
                while (j12 != j11) {
                    boolean z11 = this.f26093f;
                    Object objPoll = fVar.poll();
                    boolean z12 = objPoll == null;
                    if (e(z11, z12, bVar)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    bVar.onNext(objPoll);
                    j12++;
                }
                if (j12 == j11 && e(this.f26093f, fVar.isEmpty(), bVar)) {
                    return;
                }
                if (j12 != 0 && j11 != Long.MAX_VALUE) {
                    this.H.addAndGet(-j12);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // bx.g
    public final boolean isEmpty() {
        return this.f26089b.isEmpty();
    }

    @Override // n20.b
    public final void onComplete() {
        this.f26093f = true;
        if (this.K) {
            this.f26088a.onComplete();
        } else {
            f();
        }
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        this.f26094t = th2;
        this.f26093f = true;
        if (this.K) {
            this.f26088a.onError(th2);
        } else {
            f();
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.f26089b.offer(obj)) {
            if (this.K) {
                this.f26088a.onNext(null);
                return;
            } else {
                f();
                return;
            }
        }
        this.f26091d.cancel();
        MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
        try {
            this.f26090c.run();
        } catch (Throwable th2) {
            fb.g0.D(th2);
            missingBackpressureException.initCause(th2);
        }
        onError(missingBackpressureException);
    }

    @Override // bx.g
    public final Object poll() {
        return this.f26089b.poll();
    }

    @Override // n20.c
    public final void request(long j11) {
        if (this.K || !mx.g.c(j11)) {
            return;
        }
        ue.f.i(this.H, j11);
        f();
    }
}
