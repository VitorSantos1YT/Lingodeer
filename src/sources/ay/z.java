package ay;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements qx.k, rx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3407a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rx.b f3408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3409c;

    public z(qx.k kVar) {
        this.f3409c = kVar;
    }

    @Override // rx.b
    public final boolean b() {
        switch (this.f3407a) {
            case 0:
                break;
        }
        return this.f3408b.b();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.concurrent.atomic.AtomicReference, qx.c] */
    @Override // qx.k
    public final void c(rx.b bVar) {
        switch (this.f3407a) {
            case 0:
                this.f3408b = bVar;
                ((qx.k) this.f3409c).c(this);
                break;
            default:
                this.f3408b = bVar;
                ((AtomicReference) this.f3409c).c(this);
                break;
        }
    }

    @Override // rx.b
    public final void dispose() {
        switch (this.f3407a) {
            case 0:
                this.f3408b.dispose();
                break;
            default:
                this.f3408b.dispose();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.atomic.AtomicReference, qx.c] */
    @Override // qx.k
    public final void onComplete() {
        switch (this.f3407a) {
            case 0:
                ((qx.k) this.f3409c).onComplete();
                break;
            default:
                ((AtomicReference) this.f3409c).onComplete();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.atomic.AtomicReference, qx.c] */
    @Override // qx.k
    public final void onError(Throwable th2) {
        switch (this.f3407a) {
            case 0:
                ((qx.k) this.f3409c).onError(th2);
                break;
            default:
                ((AtomicReference) this.f3409c).onError(th2);
                break;
        }
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        int i11 = this.f3407a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(qx.c cVar) {
        this.f3409c = (AtomicReference) cVar;
    }

    private final void a(Object obj) {
    }

    private final void d(Object obj) {
    }
}
