package o20;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends CompletableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f44528a;

    public j(b0 b0Var) {
        this.f44528a = b0Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        if (z11) {
            this.f44528a.cancel();
        }
        return super.cancel(z11);
    }
}
