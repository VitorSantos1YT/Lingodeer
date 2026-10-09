package hx;

import com.google.firebase.inappmessaging.internal.w;
import fb.g0;
import java.util.concurrent.atomic.AtomicInteger;
import uw.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends AtomicInteger implements ww.b, k {
    private static final long serialVersionUID = 8443155186132538303L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw.c f33843a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f33845c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ww.b f33847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f33848f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nx.b f33844b = new nx.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ww.a f33846d = new ww.a(0);

    public f(uw.c cVar, w wVar) {
        this.f33843a = cVar;
        this.f33845c = wVar;
        lazySet(1);
    }

    @Override // uw.k
    public final void b(ww.b bVar) {
        if (zw.a.g(this.f33847e, bVar)) {
            this.f33847e = bVar;
            this.f33843a.b(this);
        }
    }

    @Override // ww.b
    public final void dispose() {
        this.f33848f = true;
        this.f33847e.dispose();
        this.f33846d.dispose();
    }

    @Override // uw.k
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            nx.b bVar = this.f33844b;
            bVar.getClass();
            Throwable thB = nx.e.b(bVar);
            uw.c cVar = this.f33843a;
            if (thB != null) {
                cVar.onError(thB);
            } else {
                cVar.onComplete();
            }
        }
    }

    @Override // uw.k
    public final void onError(Throwable th2) {
        nx.b bVar = this.f33844b;
        bVar.getClass();
        if (!nx.e.a(bVar, th2)) {
            qx.b.B(th2);
            return;
        }
        dispose();
        if (getAndSet(0) > 0) {
            this.f33843a.onError(nx.e.b(bVar));
        }
    }

    @Override // uw.k
    public final void onNext(Object obj) {
        try {
            uw.b bVar = (uw.b) this.f33845c.apply(obj);
            getAndIncrement();
            e eVar = new e(this);
            if (this.f33848f || !this.f33846d.a(eVar)) {
                return;
            }
            bVar.c(eVar);
        } catch (Throwable th2) {
            g0.D(th2);
            this.f33847e.dispose();
            onError(th2);
        }
    }
}
