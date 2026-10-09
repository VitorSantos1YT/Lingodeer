package rz;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v1 extends vy.a implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f50964a = new v1(z.f50978b);

    @Override // rz.g1
    public final p attachChild(r rVar) {
        return w1.f50967a;
    }

    @Override // rz.g1
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // rz.g1
    public final nz.l getChildren() {
        return nz.h.f44323a;
    }

    @Override // rz.g1
    public final q0 invokeOnCompletion(fz.c cVar) {
        return w1.f50967a;
    }

    @Override // rz.g1
    public final boolean isActive() {
        return true;
    }

    @Override // rz.g1
    public final boolean isCancelled() {
        return false;
    }

    @Override // rz.g1
    public final Object join(vy.d dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // rz.g1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // rz.g1
    public final q0 invokeOnCompletion(boolean z11, boolean z12, fz.c cVar) {
        return w1.f50967a;
    }

    @Override // rz.g1
    public final void cancel(CancellationException cancellationException) {
    }
}
