package lx;

import uw.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements g, bx.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f40502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n20.c f40503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bx.d f40504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40506e;

    public b(n20.b bVar) {
        this.f40502a = bVar;
    }

    @Override // bx.c
    public int a(int i11) {
        bx.d dVar = this.f40504c;
        if (dVar == null || (i11 & 4) != 0) {
            return 0;
        }
        int iA = dVar.a(i11);
        if (iA == 0) {
            return iA;
        }
        this.f40506e = iA;
        return iA;
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.e(this.f40503b, cVar)) {
            this.f40503b = cVar;
            if (cVar instanceof bx.d) {
                this.f40504c = (bx.d) cVar;
            }
            this.f40502a.c(this);
        }
    }

    @Override // n20.c
    public final void cancel() {
        this.f40503b.cancel();
    }

    @Override // bx.g
    public final void clear() {
        this.f40504c.clear();
    }

    @Override // bx.g
    public final boolean isEmpty() {
        return this.f40504c.isEmpty();
    }

    @Override // bx.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // n20.b
    public void onComplete() {
        if (this.f40505d) {
            return;
        }
        this.f40505d = true;
        this.f40502a.onComplete();
    }

    @Override // n20.b
    public void onError(Throwable th2) {
        if (this.f40505d) {
            qx.b.B(th2);
        } else {
            this.f40505d = true;
            this.f40502a.onError(th2);
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        this.f40503b.request(j11);
    }
}
