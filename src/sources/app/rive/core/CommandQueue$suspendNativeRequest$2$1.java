package app.rive.core;

import fz.c;
import kotlin.jvm.internal.n;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class CommandQueue$suspendNativeRequest$2$1 extends n implements c {
    final /* synthetic */ long $requestID;
    final /* synthetic */ CommandQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandQueue$suspendNativeRequest$2$1(CommandQueue commandQueue, long j11) {
        super(1);
        this.this$0 = commandQueue;
        this.$requestID = j11;
    }

    @Override // fz.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return b0.f48488a;
    }

    public final void invoke(Throwable th2) {
        this.this$0.pendingContinuations.remove(Long.valueOf(this.$requestID));
    }
}
