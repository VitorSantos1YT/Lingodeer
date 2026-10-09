package mx;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends AtomicInteger implements n20.c {
    private static final long serialVersionUID = -2189523197179400958L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n20.c f42883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f42884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f42885c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f42886d = new AtomicLong();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f42887e = new AtomicLong();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f42888f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f42889t;

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        b();
    }

    public final void b() {
        int iAddAndGet = 1;
        long j11 = 0;
        n20.c cVar = null;
        do {
            n20.c cVar2 = (n20.c) this.f42885c.get();
            if (cVar2 != null) {
                cVar2 = (n20.c) this.f42885c.getAndSet(null);
            }
            long andSet = this.f42886d.get();
            if (andSet != 0) {
                andSet = this.f42886d.getAndSet(0L);
            }
            long andSet2 = this.f42887e.get();
            if (andSet2 != 0) {
                andSet2 = this.f42887e.getAndSet(0L);
            }
            n20.c cVar3 = this.f42883a;
            if (this.f42888f) {
                if (cVar3 != null) {
                    cVar3.cancel();
                    this.f42883a = null;
                }
                if (cVar2 != null) {
                    cVar2.cancel();
                }
            } else {
                long j12 = this.f42884b;
                if (j12 != Long.MAX_VALUE) {
                    j12 = ue.f.j(j12, andSet);
                    if (j12 != Long.MAX_VALUE) {
                        j12 -= andSet2;
                        if (j12 < 0) {
                            qx.b.B(new ProtocolViolationException(defpackage.e.h(j12, "More produced than requested: ")));
                            j12 = 0;
                        }
                    }
                    this.f42884b = j12;
                }
                if (cVar2 != null) {
                    this.f42883a = cVar2;
                    if (j12 != 0) {
                        j11 = ue.f.j(j11, j12);
                        cVar = cVar2;
                    }
                } else if (cVar3 != null && andSet != 0) {
                    j11 = ue.f.j(j11, andSet);
                    cVar = cVar3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (j11 != 0) {
            cVar.request(j11);
        }
    }

    public void c(n20.c cVar) {
        f(cVar);
    }

    @Override // n20.c
    public final void cancel() {
        if (this.f42888f) {
            return;
        }
        this.f42888f = true;
        a();
    }

    public final void e(long j11) {
        if (this.f42889t) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            ue.f.i(this.f42887e, j11);
            a();
            return;
        }
        long j12 = this.f42884b;
        if (j12 != Long.MAX_VALUE) {
            long j13 = j12 - j11;
            if (j13 < 0) {
                qx.b.B(new ProtocolViolationException(defpackage.e.h(j13, "More produced than requested: ")));
                j13 = 0;
            }
            this.f42884b = j13;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        b();
    }

    public final void f(n20.c cVar) {
        if (this.f42888f) {
            cVar.cancel();
            return;
        }
        ax.d.a(cVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            a();
            return;
        }
        this.f42883a = cVar;
        long j11 = this.f42884b;
        if (decrementAndGet() != 0) {
            b();
        }
        if (j11 != 0) {
            cVar.request(j11);
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        if (!g.c(j11) || this.f42889t) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            ue.f.i(this.f42886d, j11);
            a();
            return;
        }
        long j12 = this.f42884b;
        if (j12 != Long.MAX_VALUE) {
            long j13 = ue.f.j(j12, j11);
            this.f42884b = j13;
            if (j13 == Long.MAX_VALUE) {
                this.f42889t = true;
            }
        }
        n20.c cVar = this.f42883a;
        if (decrementAndGet() != 0) {
            b();
        }
        if (cVar != null) {
            cVar.request(j11);
        }
    }
}
