package ex;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends AtomicInteger implements uw.g, n20.c {
    private static final long serialVersionUID = 8600231336733376951L;
    public n20.c K;
    public volatile boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f26015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26016b;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yw.c f26021t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f26017c = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ww.a f26018d = new ww.a(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nx.b f26020f = new nx.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f26019e = new AtomicInteger(1);
    public final AtomicReference H = new AtomicReference();

    public h0(n20.b bVar, yw.c cVar, int i11) {
        this.f26015a = bVar;
        this.f26021t = cVar;
        this.f26016b = i11;
    }

    public final void a() {
        jx.b bVar = (jx.b) this.H.get();
        if (bVar != null) {
            bVar.clear();
        }
    }

    public final void b() {
        if (getAndIncrement() == 0) {
            e();
        }
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.e(this.K, cVar)) {
            this.K = cVar;
            this.f26015a.c(this);
            int i11 = this.f26016b;
            if (i11 == Integer.MAX_VALUE) {
                cVar.request(Long.MAX_VALUE);
            } else {
                cVar.request(i11);
            }
        }
    }

    @Override // n20.c
    public final void cancel() {
        this.L = true;
        this.K.cancel();
        this.f26018d.dispose();
    }

    public final void e() {
        n20.b bVar = this.f26015a;
        AtomicInteger atomicInteger = this.f26019e;
        AtomicReference atomicReference = this.H;
        int iAddAndGet = 1;
        do {
            long j11 = this.f26017c.get();
            long j12 = 0;
            while (true) {
                if (j12 == j11) {
                    break;
                }
                if (this.L) {
                    a();
                    return;
                }
                if (((Throwable) this.f26020f.get()) != null) {
                    nx.b bVar2 = this.f26020f;
                    bVar2.getClass();
                    Throwable thB = nx.e.b(bVar2);
                    a();
                    bVar.onError(thB);
                    return;
                }
                boolean z11 = atomicInteger.get() == 0;
                jx.b bVar3 = (jx.b) atomicReference.get();
                Object objPoll = bVar3 != null ? bVar3.poll() : null;
                boolean z12 = objPoll == null;
                if (z11 && z12) {
                    nx.b bVar4 = this.f26020f;
                    bVar4.getClass();
                    Throwable thB2 = nx.e.b(bVar4);
                    if (thB2 != null) {
                        bVar.onError(thB2);
                        return;
                    } else {
                        bVar.onComplete();
                        return;
                    }
                }
                if (z12) {
                    break;
                }
                bVar.onNext(objPoll);
                j12++;
            }
            if (j12 == j11) {
                if (this.L) {
                    a();
                    return;
                }
                if (((Throwable) this.f26020f.get()) != null) {
                    nx.b bVar5 = this.f26020f;
                    bVar5.getClass();
                    Throwable thB3 = nx.e.b(bVar5);
                    a();
                    bVar.onError(thB3);
                    return;
                }
                boolean z13 = atomicInteger.get() == 0;
                jx.b bVar6 = (jx.b) atomicReference.get();
                boolean z14 = bVar6 == null || bVar6.isEmpty();
                if (z13 && z14) {
                    nx.b bVar7 = this.f26020f;
                    bVar7.getClass();
                    Throwable thB4 = nx.e.b(bVar7);
                    if (thB4 != null) {
                        bVar.onError(thB4);
                        return;
                    } else {
                        bVar.onComplete();
                        return;
                    }
                }
            }
            if (j12 != 0) {
                ue.f.A(this.f26017c, j12);
                if (this.f26016b != Integer.MAX_VALUE) {
                    this.K.request(j12);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    public final jx.b f() {
        while (true) {
            AtomicReference atomicReference = this.H;
            jx.b bVar = (jx.b) atomicReference.get();
            if (bVar != null) {
                return bVar;
            }
            jx.b bVar2 = new jx.b(uw.d.f53244a);
            while (!atomicReference.compareAndSet(null, bVar2)) {
                if (atomicReference.get() != null) {
                }
            }
            return bVar2;
        }
    }

    @Override // n20.b
    public final void onComplete() {
        this.f26019e.decrementAndGet();
        b();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        this.f26019e.decrementAndGet();
        nx.b bVar = this.f26020f;
        bVar.getClass();
        if (!nx.e.a(bVar, th2)) {
            qx.b.B(th2);
        } else {
            this.f26018d.dispose();
            b();
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        try {
            Object objApply = this.f26021t.apply(obj);
            ax.d.a(objApply, "The mapper returned a null MaybeSource");
            uw.h hVar = (uw.h) objApply;
            this.f26019e.getAndIncrement();
            g0 g0Var = new g0(this);
            if (this.L || !this.f26018d.a(g0Var)) {
                return;
            }
            hVar.b(g0Var);
        } catch (Throwable th2) {
            fb.g0.D(th2);
            this.K.cancel();
            onError(th2);
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        if (mx.g.c(j11)) {
            ue.f.i(this.f26017c, j11);
            b();
        }
    }
}
