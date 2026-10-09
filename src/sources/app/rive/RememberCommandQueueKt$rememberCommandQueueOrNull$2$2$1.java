package app.rive;

import app.rive.core.CommandQueue;
import fz.a;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RememberCommandQueueKt$rememberCommandQueueOrNull$2$2$1 extends n implements a {
    final /* synthetic */ CommandQueue $commandQueue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberCommandQueueKt$rememberCommandQueueOrNull$2$2$1(CommandQueue commandQueue) {
        super(0);
        this.$commandQueue = commandQueue;
    }

    @Override // fz.a
    public final String invoke() {
        return "Releasing command queue (remaining ref count before release: " + this.$commandQueue.getRefCount$kotlin_release() + ')';
    }
}
