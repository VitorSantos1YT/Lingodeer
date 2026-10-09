package rz;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e2 extends wz.q implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f50893e;

    public e2(long j11, xy.c cVar) {
        super(cVar, cVar.getContext());
        this.f50893e = j11;
    }

    @Override // rz.q1
    public final String L() {
        return super.L() + "(timeMillis=" + this.f50893e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0.q(this.f50863c);
        q(new TimeoutCancellationException("Timed out waiting for " + this.f50893e + " ms", this));
    }
}
