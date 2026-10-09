package ex;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends AtomicLong implements uw.g, n20.c {
    private static final long serialVersionUID = -6246093802440953054L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f26100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yw.b f26101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n20.c f26102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26103d;

    public z0(n20.b bVar, c0 c0Var) {
        this.f26100a = bVar;
        this.f26101b = c0Var;
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.e(this.f26102c, cVar)) {
            this.f26102c = cVar;
            this.f26100a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // n20.c
    public final void cancel() {
        this.f26102c.cancel();
    }

    @Override // n20.b
    public final void onComplete() {
        if (this.f26103d) {
            return;
        }
        this.f26103d = true;
        this.f26100a.onComplete();
    }

    @Override // n20.b
    public final void onError(Throwable th2) {
        if (this.f26103d) {
            qx.b.B(th2);
        } else {
            this.f26103d = true;
            this.f26100a.onError(th2);
        }
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.f26103d) {
            return;
        }
        if (get() != 0) {
            this.f26100a.onNext(obj);
            ue.f.A(this, 1L);
            return;
        }
        try {
            this.f26101b.accept(obj);
        } catch (Throwable th2) {
            fb.g0.D(th2);
            cancel();
            onError(th2);
        }
    }

    @Override // n20.c
    public final void request(long j11) {
        if (mx.g.c(j11)) {
            ue.f.i(this, j11);
        }
    }
}
