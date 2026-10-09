package mx;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends AtomicInteger implements bx.d {
    private static final long serialVersionUID = -3830916580126663321L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n20.b f42882b;

    public e(Object obj, n20.b bVar) {
        this.f42882b = bVar;
        this.f42881a = obj;
    }

    @Override // bx.c
    public final int a(int i11) {
        return 1;
    }

    @Override // n20.c
    public final void cancel() {
        lazySet(2);
    }

    @Override // bx.g
    public final void clear() {
        lazySet(1);
    }

    @Override // bx.g
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // bx.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // bx.g
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f42881a;
    }

    @Override // n20.c
    public final void request(long j11) {
        if (g.c(j11) && compareAndSet(0, 1)) {
            Object obj = this.f42881a;
            n20.b bVar = this.f42882b;
            bVar.onNext(obj);
            if (get() != 2) {
                bVar.onComplete();
            }
        }
    }
}
