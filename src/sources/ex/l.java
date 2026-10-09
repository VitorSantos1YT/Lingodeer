package ex;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends k {
    private static final long serialVersionUID = 2427151001689639875L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jx.b f26039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f26040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f26041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f26042f;

    public l(n20.b bVar, int i11) {
        super(bVar);
        this.f26039c = new jx.b(i11);
        this.f26042f = new AtomicInteger();
    }

    @Override // ex.k
    public final void d() {
        g();
    }

    @Override // ex.k
    public final void e() {
        if (this.f26042f.getAndIncrement() == 0) {
            this.f26039c.clear();
        }
    }

    @Override // ex.k
    public final boolean f(Throwable th2) {
        if (this.f26041e || this.f26037b.a()) {
            return false;
        }
        this.f26040d = th2;
        this.f26041e = true;
        g();
        return true;
    }

    public final void g() {
        if (this.f26042f.getAndIncrement() != 0) {
            return;
        }
        n20.b bVar = this.f26036a;
        jx.b bVar2 = this.f26039c;
        int iAddAndGet = 1;
        do {
            long j11 = get();
            long j12 = 0;
            while (j12 != j11) {
                if (this.f26037b.a()) {
                    bVar2.clear();
                    return;
                }
                boolean z11 = this.f26041e;
                Object objPoll = bVar2.poll();
                boolean z12 = objPoll == null;
                if (z11 && z12) {
                    Throwable th2 = this.f26040d;
                    if (th2 != null) {
                        b(th2);
                        return;
                    } else {
                        a();
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
                if (this.f26037b.a()) {
                    bVar2.clear();
                    return;
                }
                boolean z13 = this.f26041e;
                boolean zIsEmpty = bVar2.isEmpty();
                if (z13 && zIsEmpty) {
                    Throwable th3 = this.f26040d;
                    if (th3 != null) {
                        b(th3);
                        return;
                    } else {
                        a();
                        return;
                    }
                }
            }
            if (j12 != 0) {
                ue.f.A(this, j12);
            }
            iAddAndGet = this.f26042f.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // uw.e
    public final void onNext(Object obj) {
        if (this.f26041e || this.f26037b.a()) {
            return;
        }
        if (obj == null) {
            c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.f26039c.offer(obj);
            g();
        }
    }
}
