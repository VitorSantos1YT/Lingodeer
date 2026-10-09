package lx;

import fb.g0;
import mx.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements bx.a, bx.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bx.a f40497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n20.c f40498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bx.d f40499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40501e;

    public a(bx.a aVar) {
        this.f40497a = aVar;
    }

    @Override // bx.c
    public int a(int i11) {
        bx.d dVar = this.f40499c;
        if (dVar == null || (i11 & 4) != 0) {
            return 0;
        }
        int iA = dVar.a(i11);
        if (iA == 0) {
            return iA;
        }
        this.f40501e = iA;
        return iA;
    }

    public final void b(Throwable th2) {
        g0.D(th2);
        this.f40498b.cancel();
        onError(th2);
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (g.e(this.f40498b, cVar)) {
            this.f40498b = cVar;
            if (cVar instanceof bx.d) {
                this.f40499c = (bx.d) cVar;
            }
            this.f40497a.c(this);
        }
    }

    @Override // n20.c
    public final void cancel() {
        this.f40498b.cancel();
    }

    @Override // bx.g
    public final void clear() {
        this.f40499c.clear();
    }

    @Override // bx.g
    public final boolean isEmpty() {
        return this.f40499c.isEmpty();
    }

    @Override // bx.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // n20.b
    public void onComplete() {
        if (this.f40500d) {
            return;
        }
        this.f40500d = true;
        this.f40497a.onComplete();
    }

    @Override // n20.b
    public void onError(Throwable th2) {
        if (this.f40500d) {
            qx.b.B(th2);
        } else {
            this.f40500d = true;
            this.f40497a.onError(th2);
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        this.f40498b.request(j11);
    }
}
