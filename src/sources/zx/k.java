package zx;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import re.e0;
import re.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends fy.a implements qx.e {
    private static final long serialVersionUID = -2514538129242366402L;
    public Throwable H;
    public final AtomicLong K = new AtomicLong();
    public boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f59610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iy.e f59611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tx.a f59612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tx.c f59613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n20.c f59614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f59615f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f59616t;

    public k(n20.b bVar, int i11, boolean z11, e0 e0Var, g0 g0Var) {
        this.f59610a = bVar;
        this.f59612c = e0Var;
        this.f59613d = g0Var;
        this.f59611b = z11 ? new iy.h(i11) : new iy.g(i11);
    }

    @Override // iy.b
    public final int a(int i11) {
        this.L = true;
        return 2;
    }

    public final boolean b(boolean z11, boolean z12, n20.b bVar) {
        if (this.f59615f) {
            this.f59611b.clear();
            return true;
        }
        if (!z11) {
            return false;
        }
        Throwable th2 = this.H;
        if (th2 != null) {
            this.f59611b.clear();
            bVar.onError(th2);
            return true;
        }
        if (!z12) {
            return false;
        }
        bVar.onComplete();
        return true;
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (fy.c.e(this.f59614e, cVar)) {
            this.f59614e = cVar;
            this.f59610a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // n20.c
    public final void cancel() {
        if (this.f59615f) {
            return;
        }
        this.f59615f = true;
        this.f59614e.cancel();
        if (this.L || getAndIncrement() != 0) {
            return;
        }
        this.f59611b.clear();
    }

    @Override // iy.f
    public final void clear() {
        this.f59611b.clear();
    }

    public final void e() {
        if (getAndIncrement() == 0) {
            iy.e eVar = this.f59611b;
            n20.b bVar = this.f59610a;
            int iAddAndGet = 1;
            while (!b(this.f59616t, eVar.isEmpty(), bVar)) {
                long j11 = this.K.get();
                long j12 = 0;
                while (j12 != j11) {
                    boolean z11 = this.f59616t;
                    Object objPoll = eVar.poll();
                    boolean z12 = objPoll == null;
                    if (b(z11, z12, bVar)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    bVar.onNext(objPoll);
                    j12++;
                }
                if (j12 == j11 && b(this.f59616t, eVar.isEmpty(), bVar)) {
                    return;
                }
                if (j12 != 0 && j11 != Long.MAX_VALUE) {
                    this.K.addAndGet(-j12);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // iy.f
    public final boolean isEmpty() {
        return this.f59611b.isEmpty();
    }

    @Override // n20.b
    public final void onComplete() {
        this.f59616t = true;
        if (this.L) {
            this.f59610a.onComplete();
        } else {
            e();
        }
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        this.H = th2;
        this.f59616t = true;
        if (this.L) {
            this.f59610a.onError(th2);
        } else {
            e();
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.f59611b.offer(obj)) {
            if (this.L) {
                this.f59610a.onNext(null);
                return;
            } else {
                e();
                return;
            }
        }
        this.f59614e.cancel();
        MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
        try {
            this.f59612c.run();
            this.f59613d.accept(obj);
        } catch (Throwable th2) {
            ef.e.E(th2);
            missingBackpressureException.initCause(th2);
        }
        onError(missingBackpressureException);
    }

    @Override // iy.f
    public final Object poll() {
        return this.f59611b.poll();
    }

    @Override // n20.c
    public final void request(long j11) {
        if (this.L || !fy.c.c(j11)) {
            return;
        }
        com.bumptech.glide.e.g(this.K, j11);
        e();
    }
}
