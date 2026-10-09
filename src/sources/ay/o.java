package ay;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends AtomicInteger implements qx.k, rx.b {
    private static final long serialVersionUID = 8828587559905699186L;
    public volatile boolean H;
    public volatile boolean K;
    public int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy.a f3357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.q f3358b = vx.b.f54312a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f3359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public iy.f f3361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public rx.b f3362f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f3363t;

    public o(hy.a aVar, int i11) {
        this.f3357a = aVar;
        this.f3360d = i11;
        this.f3359c = new n(aVar, this);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!this.H) {
            if (!this.f3363t) {
                boolean z11 = this.K;
                try {
                    Object objPoll = this.f3361e.poll();
                    boolean z12 = objPoll == null;
                    if (z11 && z12) {
                        this.H = true;
                        this.f3357a.onComplete();
                        return;
                    }
                    if (!z12) {
                        try {
                            this.f3358b.getClass();
                            Objects.requireNonNull(objPoll, "The mapper returned a null ObservableSource");
                            qx.i iVar = (qx.i) objPoll;
                            this.f3363t = true;
                            ((qx.h) iVar).i(this.f3359c);
                        } catch (Throwable th2) {
                            ef.e.E(th2);
                            dispose();
                            this.f3361e.clear();
                            this.f3357a.onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    ef.e.E(th3);
                    dispose();
                    this.f3361e.clear();
                    this.f3357a.onError(th3);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.f3361e.clear();
    }

    @Override // rx.b
    public final boolean b() {
        return this.H;
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        if (ux.b.f(this.f3362f, bVar)) {
            this.f3362f = bVar;
            if (bVar instanceof iy.a) {
                iy.a aVar = (iy.a) bVar;
                int iA = aVar.a(3);
                if (iA == 1) {
                    this.L = iA;
                    this.f3361e = aVar;
                    this.K = true;
                    this.f3357a.c(this);
                    a();
                    return;
                }
                if (iA == 2) {
                    this.L = iA;
                    this.f3361e = aVar;
                    this.f3357a.c(this);
                    return;
                }
            }
            this.f3361e = new iy.h(this.f3360d);
            this.f3357a.c(this);
        }
    }

    @Override // rx.b
    public final void dispose() {
        this.H = true;
        n nVar = this.f3359c;
        nVar.getClass();
        ux.b.a(nVar);
        this.f3362f.dispose();
        if (getAndIncrement() == 0) {
            this.f3361e.clear();
        }
    }

    @Override // qx.k
    public final void onComplete() {
        if (this.K) {
            return;
        }
        this.K = true;
        a();
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        if (this.K) {
            qx.p.u(th2);
            return;
        }
        this.K = true;
        dispose();
        this.f3357a.onError(th2);
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        if (this.K) {
            return;
        }
        if (this.L == 0) {
            this.f3361e.offer(obj);
        }
        a();
    }
}
