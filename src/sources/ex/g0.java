package ex;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends AtomicReference implements uw.i, ww.b {
    private static final long serialVersionUID = -502562646270949838L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f26011a;

    public g0(h0 h0Var) {
        this.f26011a = h0Var;
    }

    @Override // uw.i
    public final void b(ww.b bVar) {
        zw.a.f(this, bVar);
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
    }

    @Override // uw.i
    public final void onComplete() {
        h0 h0Var = this.f26011a;
        int i11 = h0Var.f26016b;
        n20.b bVar = h0Var.f26015a;
        AtomicInteger atomicInteger = h0Var.f26019e;
        h0Var.f26018d.b(this);
        if (h0Var.get() == 0) {
            if (h0Var.compareAndSet(0, 1)) {
                boolean z11 = atomicInteger.decrementAndGet() == 0;
                jx.b bVar2 = (jx.b) h0Var.H.get();
                if (!z11 || (bVar2 != null && !bVar2.isEmpty())) {
                    if (i11 != Integer.MAX_VALUE) {
                        h0Var.K.request(1L);
                    }
                    if (h0Var.decrementAndGet() == 0) {
                        return;
                    }
                    h0Var.e();
                    return;
                }
                nx.b bVar3 = h0Var.f26020f;
                bVar3.getClass();
                Throwable thB = nx.e.b(bVar3);
                if (thB != null) {
                    bVar.onError(thB);
                    return;
                } else {
                    bVar.onComplete();
                    return;
                }
            }
        }
        atomicInteger.decrementAndGet();
        if (i11 != Integer.MAX_VALUE) {
            h0Var.K.request(1L);
        }
        h0Var.b();
    }

    @Override // uw.i
    public final void onError(Throwable th2) {
        h0 h0Var = this.f26011a;
        ww.a aVar = h0Var.f26018d;
        aVar.b(this);
        nx.b bVar = h0Var.f26020f;
        bVar.getClass();
        if (!nx.e.a(bVar, th2)) {
            qx.b.B(th2);
            return;
        }
        h0Var.K.cancel();
        aVar.dispose();
        h0Var.f26019e.decrementAndGet();
        h0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // uw.i
    public final void onSuccess(Object obj) {
        jx.b bVarF;
        h0 h0Var = this.f26011a;
        h0Var.f26018d.b(this);
        if (h0Var.get() == 0) {
            if (h0Var.compareAndSet(0, 1)) {
                boolean z11 = h0Var.f26019e.decrementAndGet() == 0;
                if (h0Var.f26017c.get() != 0) {
                    h0Var.f26015a.onNext(obj);
                    jx.b bVar = (jx.b) h0Var.H.get();
                    if (z11 && (bVar == null || bVar.isEmpty())) {
                        nx.b bVar2 = h0Var.f26020f;
                        bVar2.getClass();
                        Throwable thB = nx.e.b(bVar2);
                        if (thB != null) {
                            h0Var.f26015a.onError(thB);
                            return;
                        } else {
                            h0Var.f26015a.onComplete();
                            return;
                        }
                    }
                    ue.f.A(h0Var.f26017c, 1L);
                    if (h0Var.f26016b != Integer.MAX_VALUE) {
                        h0Var.K.request(1L);
                    }
                } else {
                    jx.b bVarF2 = h0Var.f();
                    synchronized (bVarF2) {
                        bVarF2.offer(obj);
                    }
                }
                if (h0Var.decrementAndGet() == 0) {
                    return;
                }
            } else {
                bVarF = h0Var.f();
                synchronized (bVarF) {
                    bVarF.offer(obj);
                }
                h0Var.f26019e.decrementAndGet();
                if (h0Var.getAndIncrement() != 0) {
                    return;
                }
            }
        } else {
            bVarF = h0Var.f();
            synchronized (bVarF) {
                bVarF.offer(obj);
                h0Var.f26019e.decrementAndGet();
                if (h0Var.getAndIncrement() != 0) {
                    return;
                }
            }
        }
        h0Var.e();
    }
}
