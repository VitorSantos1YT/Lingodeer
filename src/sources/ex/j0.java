package ex;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends mx.a implements uw.g {
    private static final long serialVersionUID = -3096000382929934955L;
    public volatile boolean H;
    public volatile boolean K;
    public Iterator M;
    public int N;
    public int O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f26029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yw.c f26030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26032d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n20.c f26034f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public bx.g f26035t;
    public final AtomicReference L = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f26033e = new AtomicLong();

    public j0(n20.b bVar, p20.c cVar, int i11) {
        this.f26029a = bVar;
        this.f26030b = cVar;
        this.f26031c = i11;
        this.f26032d = i11 - (i11 >> 2);
    }

    @Override // bx.c
    public final int a(int i11) {
        return this.O == 1 ? 1 : 0;
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.e(this.f26034f, cVar)) {
            this.f26034f = cVar;
            if (cVar instanceof bx.d) {
                bx.d dVar = (bx.d) cVar;
                int iA = dVar.a(3);
                if (iA == 1) {
                    this.O = iA;
                    this.f26035t = dVar;
                    this.H = true;
                    this.f26029a.c(this);
                    return;
                }
                if (iA == 2) {
                    this.O = iA;
                    this.f26035t = dVar;
                    this.f26029a.c(this);
                    cVar.request(this.f26031c);
                    return;
                }
            }
            this.f26035t = new jx.a(this.f26031c);
            this.f26029a.c(this);
            cVar.request(this.f26031c);
        }
    }

    @Override // n20.c
    public final void cancel() {
        if (this.K) {
            return;
        }
        this.K = true;
        this.f26034f.cancel();
        if (getAndIncrement() == 0) {
            this.f26035t.clear();
        }
    }

    @Override // bx.g
    public final void clear() {
        this.M = null;
        this.f26035t.clear();
    }

    public final boolean e(boolean z11, boolean z12, n20.b bVar, bx.g gVar) {
        if (this.K) {
            this.M = null;
            gVar.clear();
            return true;
        }
        if (!z11) {
            return false;
        }
        if (((Throwable) this.L.get()) == null) {
            if (!z12) {
                return false;
            }
            bVar.onComplete();
            return true;
        }
        Throwable thB = nx.e.b(this.L);
        this.M = null;
        gVar.clear();
        bVar.onError(thB);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        int i11;
        if (getAndIncrement() != 0) {
            return;
        }
        n20.b bVar = this.f26029a;
        bx.g gVar = this.f26035t;
        boolean z11 = false;
        int i12 = 1;
        Object[] objArr = this.O != 1;
        Iterator it = this.M;
        int iAddAndGet = 1;
        while (true) {
            if (it == null) {
                boolean z12 = this.H;
                try {
                    Object objPoll = gVar.poll();
                    if (e(z12, objPoll == null ? i12 : z11 ? 1 : 0, bVar, gVar)) {
                        return;
                    }
                    if (objPoll != null) {
                        try {
                            it = ((Iterable) this.f26030b.apply(objPoll)).iterator();
                            if (it.hasNext()) {
                                this.M = it;
                            } else {
                                if (objArr != false) {
                                    int i13 = this.N + i12;
                                    if (i13 == this.f26032d) {
                                        this.N = z11 ? 1 : 0;
                                        this.f26034f.request(i13);
                                    } else {
                                        this.N = i13;
                                    }
                                }
                                it = null;
                            }
                        } catch (Throwable th2) {
                            fb.g0.D(th2);
                            this.f26034f.cancel();
                            nx.e.a(this.L, th2);
                            bVar.onError(nx.e.b(this.L));
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    fb.g0.D(th3);
                    this.f26034f.cancel();
                    nx.e.a(this.L, th3);
                    Throwable thB = nx.e.b(this.L);
                    this.M = null;
                    gVar.clear();
                    bVar.onError(thB);
                    return;
                }
            }
            if (it != null) {
                long j11 = this.f26033e.get();
                long j12 = 0;
                while (true) {
                    if (j12 == j11) {
                        i11 = i12;
                        break;
                    }
                    if (e(this.H, z11, bVar, gVar)) {
                        return;
                    }
                    try {
                        Object next = it.next();
                        i11 = i12;
                        ax.d.a(next, "The iterator returned a null value");
                        bVar.onNext(next);
                        if (e(this.H, z11, bVar, gVar)) {
                            return;
                        }
                        j12++;
                        try {
                            if (!it.hasNext()) {
                                if (objArr != false) {
                                    int i14 = this.N + 1;
                                    if (i14 == this.f26032d) {
                                        this.N = z11 ? 1 : 0;
                                        this.f26034f.request(i14);
                                    } else {
                                        this.N = i14;
                                    }
                                }
                                this.M = null;
                                it = null;
                                break;
                            }
                            i12 = i11;
                        } catch (Throwable th4) {
                            fb.g0.D(th4);
                            this.M = null;
                            this.f26034f.cancel();
                            nx.e.a(this.L, th4);
                            bVar.onError(nx.e.b(this.L));
                            return;
                        }
                    } catch (Throwable th5) {
                        fb.g0.D(th5);
                        this.M = null;
                        this.f26034f.cancel();
                        nx.e.a(this.L, th5);
                        bVar.onError(nx.e.b(this.L));
                        return;
                    }
                }
                if (j12 == j11) {
                    if (e(this.H, (gVar.isEmpty() && it == null) ? i11 : 0, bVar, gVar)) {
                        return;
                    }
                }
                if (j12 != 0 && j11 != Long.MAX_VALUE) {
                    this.f26033e.addAndGet(-j12);
                }
                if (it != null) {
                }
                i12 = i11;
                z11 = false;
            } else {
                i11 = i12;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            i12 = i11;
            z11 = false;
        }
    }

    @Override // bx.g
    public final boolean isEmpty() {
        return this.M == null && this.f26035t.isEmpty();
    }

    @Override // n20.b
    public final void onComplete() {
        if (this.H) {
            return;
        }
        this.H = true;
        f();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        if (this.H || !nx.e.a(this.L, th2)) {
            qx.b.B(th2);
        } else {
            this.H = true;
            f();
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.H) {
            return;
        }
        if (this.O != 0 || this.f26035t.offer(obj)) {
            f();
        } else {
            onError(new MissingBackpressureException("Queue is full?!"));
        }
    }

    @Override // bx.g
    public final Object poll() {
        Iterator it = this.M;
        while (it == null) {
            Object objPoll = this.f26035t.poll();
            if (objPoll != null) {
                it = ((Iterable) this.f26030b.apply(objPoll)).iterator();
                if (it.hasNext()) {
                    this.M = it;
                    break;
                }
                it = null;
            } else {
                return null;
            }
        }
        Object next = it.next();
        ax.d.a(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.M = null;
        }
        return next;
    }

    @Override // n20.c
    public final void request(long j11) {
        if (mx.g.c(j11)) {
            ue.f.i(this.f26033e, j11);
            f();
        }
    }
}
