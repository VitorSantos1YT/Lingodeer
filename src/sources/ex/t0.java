package ex;

import a0.b2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends lx.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yw.c f26068f;

    public t0(n20.b bVar, b2 b2Var) {
        super(bVar);
        this.f26068f = b2Var;
    }

    @Override // n20.b
    public final void onNext(Object obj) {
        if (this.f40505d) {
            return;
        }
        int i11 = this.f40506e;
        n20.b bVar = this.f40502a;
        if (i11 != 0) {
            bVar.onNext(null);
            return;
        }
        try {
            Object objApply = this.f26068f.apply(obj);
            ax.d.a(objApply, "The mapper function returned a null value.");
            bVar.onNext(objApply);
        } catch (Throwable th2) {
            fb.g0.D(th2);
            this.f40503b.cancel();
            onError(th2);
        }
    }

    @Override // bx.g
    public final Object poll() {
        Object objPoll = this.f40504c.poll();
        if (objPoll == null) {
            return null;
        }
        Object objApply = this.f26068f.apply(objPoll);
        ax.d.a(objApply, "The mapper function returned a null value.");
        return objApply;
    }
}
