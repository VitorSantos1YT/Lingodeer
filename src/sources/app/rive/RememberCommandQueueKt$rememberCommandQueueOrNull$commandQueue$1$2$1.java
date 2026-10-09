package app.rive;

import fz.a;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RememberCommandQueueKt$rememberCommandQueueOrNull$commandQueue$1$2$1 extends n implements a {
    final /* synthetic */ Throwable $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberCommandQueueKt$rememberCommandQueueOrNull$commandQueue$1$2$1(Throwable th2) {
        super(0);
        this.$it = th2;
    }

    @Override // fz.a
    public final String invoke() {
        return "Failed to create command queue: " + this.$it.getMessage();
    }
}
