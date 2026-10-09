package zx;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends fy.a implements qx.e, Runnable {
    private static final long serialVersionUID = -8241002408341274697L;
    public volatile boolean H;
    public Throwable K;
    public int L;
    public long M;
    public boolean N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.n f59601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f59604d = new AtomicLong();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n20.c f59605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public iy.f f59606f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f59607t;

    public h(qx.n nVar, int i11) {
        this.f59601a = nVar;
        this.f59602b = i11;
        this.f59603c = i11 - (i11 >> 2);
    }

    @Override // iy.b
    public final int a(int i11) {
        this.N = true;
        return 2;
    }

    public final boolean b(boolean z11, boolean z12, n20.b bVar) {
        if (this.f59607t) {
            clear();
            return true;
        }
        if (!z11) {
            return false;
        }
        Throwable th2 = this.K;
        if (th2 != null) {
            this.f59607t = true;
            clear();
            bVar.onError(th2);
            this.f59601a.dispose();
            return true;
        }
        if (!z12) {
            return false;
        }
        this.f59607t = true;
        bVar.onComplete();
        this.f59601a.dispose();
        return true;
    }

    @Override // n20.c
    public final void cancel() {
        if (this.f59607t) {
            return;
        }
        this.f59607t = true;
        this.f59605e.cancel();
        this.f59601a.dispose();
        if (this.N || getAndIncrement() != 0) {
            return;
        }
        this.f59606f.clear();
    }

    @Override // iy.f
    public final void clear() {
        this.f59606f.clear();
    }

    public final void e() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f59601a.d(this);
    }

    @Override // iy.f
    public final boolean isEmpty() {
        return this.f59606f.isEmpty();
    }

    @Override // n20.b
    public final void onComplete() {
        if (this.H) {
            return;
        }
        this.H = true;
        e();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        if (this.H) {
            qx.p.u(th2);
            return;
        }
        this.K = th2;
        this.H = true;
        e();
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.H) {
            return;
        }
        if (this.L == 2) {
            e();
            return;
        }
        if (!this.f59606f.offer(obj)) {
            this.f59605e.cancel();
            this.K = new QueueOverflowException();
            this.H = true;
        }
        e();
    }

    @Override // n20.c
    public final void request(long j11) {
        if (fy.c.c(j11)) {
            com.bumptech.glide.e.g(this.f59604d, j11);
            e();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.N) {
            i iVar = (i) this;
            int iAddAndGet = 1;
            while (!iVar.f59607t) {
                boolean z11 = iVar.H;
                iVar.O.onNext(null);
                if (z11) {
                    iVar.f59607t = true;
                    Throwable th2 = iVar.K;
                    if (th2 != null) {
                        iVar.O.onError(th2);
                    } else {
                        iVar.O.onComplete();
                    }
                    iVar.f59601a.dispose();
                    return;
                }
                iAddAndGet = iVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            return;
        }
        if (this.L == 1) {
            i iVar2 = (i) this;
            n20.b bVar = iVar2.O;
            iy.f fVar = iVar2.f59606f;
            long j11 = iVar2.M;
            int iAddAndGet2 = 1;
            do {
                long j12 = iVar2.f59604d.get();
                while (j11 != j12) {
                    try {
                        Object objPoll = fVar.poll();
                        if (iVar2.f59607t) {
                            return;
                        }
                        if (objPoll == null) {
                            iVar2.f59607t = true;
                            bVar.onComplete();
                            iVar2.f59601a.dispose();
                            return;
                        }
                        bVar.onNext(objPoll);
                        j11++;
                    } catch (Throwable th3) {
                        ef.e.E(th3);
                        iVar2.f59607t = true;
                        iVar2.f59605e.cancel();
                        bVar.onError(th3);
                        iVar2.f59601a.dispose();
                        return;
                    }
                }
                if (iVar2.f59607t) {
                    return;
                }
                if (fVar.isEmpty()) {
                    iVar2.f59607t = true;
                    bVar.onComplete();
                    iVar2.f59601a.dispose();
                    return;
                }
                iVar2.M = j11;
                iAddAndGet2 = iVar2.addAndGet(-iAddAndGet2);
            } while (iAddAndGet2 != 0);
            return;
        }
        i iVar3 = (i) this;
        n20.b bVar2 = iVar3.O;
        iy.f fVar2 = iVar3.f59606f;
        long j13 = iVar3.M;
        int iAddAndGet3 = 1;
        while (true) {
            long jAddAndGet = iVar3.f59604d.get();
            while (j13 != jAddAndGet) {
                boolean z12 = iVar3.H;
                try {
                    Object objPoll2 = fVar2.poll();
                    boolean z13 = objPoll2 == null;
                    if (iVar3.b(z12, z13, bVar2)) {
                        return;
                    }
                    if (z13) {
                        break;
                    }
                    bVar2.onNext(objPoll2);
                    j13++;
                    if (j13 == iVar3.f59603c) {
                        if (jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = iVar3.f59604d.addAndGet(-j13);
                        }
                        iVar3.f59605e.request(j13);
                        j13 = 0;
                    }
                } catch (Throwable th4) {
                    ef.e.E(th4);
                    iVar3.f59607t = true;
                    iVar3.f59605e.cancel();
                    fVar2.clear();
                    bVar2.onError(th4);
                    iVar3.f59601a.dispose();
                    return;
                }
            }
            if (j13 == jAddAndGet && iVar3.b(iVar3.H, fVar2.isEmpty(), bVar2)) {
                return;
            }
            int i11 = iVar3.get();
            if (iAddAndGet3 == i11) {
                iVar3.M = j13;
                iAddAndGet3 = iVar3.addAndGet(-iAddAndGet3);
                if (iAddAndGet3 == 0) {
                    return;
                }
            } else {
                iAddAndGet3 = i11;
            }
        }
    }
}
