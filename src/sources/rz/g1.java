package rz;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface g1 extends vy.g {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    nz.l getChildren();

    q0 invokeOnCompletion(fz.c cVar);

    q0 invokeOnCompletion(boolean z11, boolean z12, fz.c cVar);

    boolean isActive();

    boolean isCancelled();

    Object join(vy.d dVar);

    boolean start();
}
