package ay;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends AtomicInteger implements qx.k, rx.b {
    private static final long serialVersionUID = -6951100001833242599L;
    public rx.b H;
    public volatile boolean K;
    public volatile boolean L;
    public volatile boolean M;
    public int N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3342a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3344c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f3346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3347f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public iy.f f3348t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.q f3343b = vx.b.f54312a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gy.c f3345d = new gy.c();

    public m(qx.k kVar, int i11, boolean z11) {
        this.f3342a = kVar;
        this.f3344c = i11;
        this.f3347f = z11;
        this.f3346e = new l(kVar, this);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        qx.k kVar = this.f3342a;
        iy.f fVar = this.f3348t;
        gy.c cVar = this.f3345d;
        while (true) {
            if (!this.K) {
                if (this.M) {
                    fVar.clear();
                    return;
                }
                if (!this.f3347f && ((Throwable) cVar.get()) != null) {
                    fVar.clear();
                    this.M = true;
                    cVar.d(kVar);
                    return;
                }
                boolean z11 = this.L;
                try {
                    Object objPoll = fVar.poll();
                    boolean z12 = objPoll == null;
                    if (z11 && z12) {
                        this.M = true;
                        cVar.d(kVar);
                        return;
                    }
                    if (!z12) {
                        try {
                            this.f3343b.getClass();
                            Objects.requireNonNull(objPoll, "The mapper returned a null ObservableSource");
                            qx.i iVar = (qx.i) objPoll;
                            if (iVar instanceof tx.f) {
                                try {
                                    Object obj = ((tx.f) iVar).get();
                                    if (obj != null && !this.M) {
                                        kVar.onNext(obj);
                                    }
                                } catch (Throwable th2) {
                                    ef.e.E(th2);
                                    cVar.b(th2);
                                }
                            } else {
                                this.K = true;
                                ((qx.h) iVar).i(this.f3346e);
                            }
                        } catch (Throwable th3) {
                            ef.e.E(th3);
                            this.M = true;
                            this.H.dispose();
                            fVar.clear();
                            cVar.b(th3);
                            cVar.d(kVar);
                            return;
                        }
                    }
                } catch (Throwable th4) {
                    ef.e.E(th4);
                    this.M = true;
                    this.H.dispose();
                    cVar.b(th4);
                    cVar.d(kVar);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // rx.b
    public final boolean b() {
        return this.M;
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        if (ux.b.f(this.H, bVar)) {
            this.H = bVar;
            if (bVar instanceof iy.a) {
                iy.a aVar = (iy.a) bVar;
                int iA = aVar.a(3);
                if (iA == 1) {
                    this.N = iA;
                    this.f3348t = aVar;
                    this.L = true;
                    this.f3342a.c(this);
                    a();
                    return;
                }
                if (iA == 2) {
                    this.N = iA;
                    this.f3348t = aVar;
                    this.f3342a.c(this);
                    return;
                }
            }
            this.f3348t = new iy.h(this.f3344c);
            this.f3342a.c(this);
        }
    }

    @Override // rx.b
    public final void dispose() {
        this.M = true;
        this.H.dispose();
        l lVar = this.f3346e;
        lVar.getClass();
        ux.b.a(lVar);
        Throwable thA = this.f3345d.a();
        if (thA == null || thA == gy.f.f29893a) {
            return;
        }
        qx.p.u(thA);
    }

    @Override // qx.k
    public final void onComplete() {
        this.L = true;
        a();
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        if (this.f3345d.b(th2)) {
            this.L = true;
            a();
        }
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        if (this.N == 0) {
            this.f3348t.offer(obj);
        }
        a();
    }
}
