package ay;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements qx.k, iy.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rx.b f3296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public iy.a f3297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tx.d f3300f;

    public f0(qx.k kVar, tx.d dVar) {
        this.f3295a = kVar;
        this.f3300f = dVar;
    }

    @Override // iy.b
    public final int a(int i11) {
        iy.a aVar = this.f3297c;
        if (aVar == null || (i11 & 4) != 0) {
            return 0;
        }
        int iA = aVar.a(i11);
        if (iA != 0) {
            this.f3299e = iA;
        }
        return iA;
    }

    @Override // rx.b
    public final boolean b() {
        return this.f3296b.b();
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        if (ux.b.f(this.f3296b, bVar)) {
            this.f3296b = bVar;
            if (bVar instanceof iy.a) {
                this.f3297c = (iy.a) bVar;
            }
            this.f3295a.c(this);
        }
    }

    @Override // iy.f
    public final void clear() {
        this.f3297c.clear();
    }

    @Override // rx.b
    public final void dispose() {
        this.f3296b.dispose();
    }

    @Override // iy.f
    public final boolean isEmpty() {
        return this.f3297c.isEmpty();
    }

    @Override // iy.f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // qx.k
    public final void onComplete() {
        if (this.f3298d) {
            return;
        }
        this.f3298d = true;
        this.f3295a.onComplete();
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        if (this.f3298d) {
            qx.p.u(th2);
        } else {
            this.f3298d = true;
            this.f3295a.onError(th2);
        }
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        if (this.f3298d) {
            return;
        }
        int i11 = this.f3299e;
        qx.k kVar = this.f3295a;
        if (i11 != 0) {
            kVar.onNext(null);
            return;
        }
        try {
            Object objApply = this.f3300f.apply(obj);
            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
            kVar.onNext(objApply);
        } catch (Throwable th2) {
            ef.e.E(th2);
            this.f3296b.dispose();
            onError(th2);
        }
    }

    @Override // iy.f
    public final Object poll() {
        Object objPoll = this.f3297c.poll();
        if (objPoll == null) {
            return null;
        }
        Object objApply = this.f3300f.apply(objPoll);
        Objects.requireNonNull(objApply, "The mapper function returned a null value.");
        return objApply;
    }
}
