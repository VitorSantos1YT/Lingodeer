package hx;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends AtomicReference implements uw.c, ww.b {
    private static final long serialVersionUID = 8606673141535671828L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f33842a;

    public e(f fVar) {
        this.f33842a = fVar;
    }

    @Override // uw.c, uw.p
    public final void b(ww.b bVar) {
        zw.a.f(this, bVar);
    }

    @Override // ww.b
    public final void dispose() {
        zw.a.a(this);
    }

    @Override // uw.c
    public final void onComplete() {
        f fVar = this.f33842a;
        fVar.f33846d.b(this);
        fVar.onComplete();
    }

    @Override // uw.c, uw.p
    public final void onError(Throwable th2) {
        f fVar = this.f33842a;
        fVar.f33846d.b(this);
        fVar.onError(th2);
    }
}
