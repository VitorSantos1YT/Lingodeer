package ex;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends AtomicReference implements uw.g, ww.b {
    private static final long serialVersionUID = -4606175640614850599L;
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f25981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f25984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile bx.g f25985f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f25986t;

    public d0(e0 e0Var, long j11) {
        this.f25980a = j11;
        this.f25981b = e0Var;
        int i11 = e0Var.f25993d;
        this.f25983d = i11;
        this.f25982c = i11 >> 2;
    }

    public final void a(long j11) {
        if (this.H != 1) {
            long j12 = this.f25986t + j11;
            if (j12 < this.f25982c) {
                this.f25986t = j12;
            } else {
                this.f25986t = 0L;
                ((n20.c) get()).request(j12);
            }
        }
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.b(this, cVar)) {
            if (cVar instanceof bx.d) {
                bx.d dVar = (bx.d) cVar;
                int iA = dVar.a(7);
                if (iA == 1) {
                    this.H = iA;
                    this.f25985f = dVar;
                    this.f25984e = true;
                    this.f25981b.b();
                    return;
                }
                if (iA == 2) {
                    this.H = iA;
                    this.f25985f = dVar;
                }
            }
            cVar.request(this.f25983d);
        }
    }

    @Override // ww.b
    public final void dispose() {
        mx.g.a(this);
    }

    @Override // n20.b
    public final void onComplete() {
        this.f25984e = true;
        this.f25981b.b();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        lazySet(mx.g.CANCELLED);
        e0 e0Var = this.f25981b;
        nx.b bVar = e0Var.f25996t;
        bVar.getClass();
        if (!nx.e.a(bVar, th2)) {
            qx.b.B(th2);
            return;
        }
        this.f25984e = true;
        e0Var.M.cancel();
        for (d0 d0Var : (d0[]) e0Var.K.getAndSet(e0.T)) {
            d0Var.getClass();
            mx.g.a(d0Var);
        }
        e0Var.b();
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.H == 2) {
            this.f25981b.b();
            return;
        }
        e0 e0Var = this.f25981b;
        if (e0Var.get() == 0 && e0Var.compareAndSet(0, 1)) {
            long j11 = e0Var.L.get();
            bx.g aVar = this.f25985f;
            if (j11 == 0 || !(aVar == null || aVar.isEmpty())) {
                if (aVar == null && (aVar = this.f25985f) == null) {
                    aVar = new jx.a(e0Var.f25993d);
                    this.f25985f = aVar;
                }
                if (!aVar.offer(obj)) {
                    e0Var.onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                }
            } else {
                e0Var.f25990a.onNext(obj);
                if (j11 != Long.MAX_VALUE) {
                    e0Var.L.decrementAndGet();
                }
                a(1L);
            }
            if (e0Var.decrementAndGet() == 0) {
                return;
            }
        } else {
            bx.g aVar2 = this.f25985f;
            if (aVar2 == null) {
                aVar2 = new jx.a(e0Var.f25993d);
                this.f25985f = aVar2;
            }
            if (!aVar2.offer(obj)) {
                e0Var.onError(new MissingBackpressureException("Inner queue full?!"));
                return;
            } else if (e0Var.getAndIncrement() != 0) {
                return;
            }
        }
        e0Var.e();
    }
}
