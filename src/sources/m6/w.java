package m6;

import androidx.glance.session.TimeoutCancellationException;
import java.util.concurrent.atomic.AtomicReference;
import jr.i0;
import rz.b0;
import rz.e0;
import rz.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f40932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f40933b = new AtomicReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2.d f40934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f40935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.e f40936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f40937f;

    public w(b0 b0Var, h2.d dVar, b0 b0Var2, fz.e eVar, AtomicReference atomicReference) {
        this.f40934c = dVar;
        this.f40935d = b0Var2;
        this.f40936e = eVar;
        this.f40937f = atomicReference;
        this.f40932a = b0Var;
    }

    public final long a() {
        Long l9 = (Long) this.f40933b.get();
        if (l9 == null) {
            int i11 = pz.a.f47220d;
            return pz.a.f47218b;
        }
        long jLongValue = l9.longValue();
        this.f40934c.getClass();
        long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
        int i12 = pz.a.f47220d;
        return pz.f.q(jCurrentTimeMillis, pz.c.MILLISECONDS);
    }

    public final void b(long j11) {
        if (pz.a.e(j11) <= 0) {
            e0.i(this.f40935d, new TimeoutCancellationException("Timed out immediately", this.f40936e.hashCode()));
            return;
        }
        if (pz.a.c(a(), j11) < 0) {
            return;
        }
        this.f40934c.getClass();
        this.f40933b.set(Long.valueOf(pz.a.e(j11) + System.currentTimeMillis()));
        h2.d dVar = this.f40934c;
        b0 b0Var = this.f40935d;
        g1 g1Var = (g1) this.f40937f.getAndSet(e0.B(b0Var, null, null, new i0(this, dVar, b0Var, this.f40936e, null, 5), 3));
        if (g1Var != null) {
            g1Var.cancel(null);
        }
    }

    @Override // rz.b0
    public final vy.i getCoroutineContext() {
        return this.f40932a.getCoroutineContext();
    }
}
