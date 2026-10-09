package app.rive.core;

import qy.b0;
import vy.d;
import wy.a;
import xy.e;
import xy.i;

/* JADX INFO: renamed from: app.rive.core.CommandQueue$loadFile-xVnc2tA$$inlined$suspendNativeRequest$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "app.rive.core.CommandQueue$loadFile-xVnc2tA$$inlined$suspendNativeRequest$1", f = "CommandQueue.kt", l = {}, m = "invokeSuspend")
public final class CommandQueue$loadFilexVnc2tA$$inlined$suspendNativeRequest$1 extends i implements fz.e {
    final /* synthetic */ byte[] $bytes$inlined;
    final /* synthetic */ long $requestID;
    int label;
    final /* synthetic */ CommandQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandQueue$loadFilexVnc2tA$$inlined$suspendNativeRequest$1(long j11, d dVar, CommandQueue commandQueue, byte[] bArr) {
        super(2, dVar);
        this.$requestID = j11;
        this.this$0 = commandQueue;
        this.$bytes$inlined = bArr;
    }

    @Override // xy.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new CommandQueue$loadFilexVnc2tA$$inlined$suspendNativeRequest$1(this.$requestID, dVar, this.this$0, this.$bytes$inlined);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(obj);
        long j11 = this.$requestID;
        CommandQueue commandQueue = this.this$0;
        commandQueue.cppLoadFile(commandQueue.cppPointer, j11, this.$bytes$inlined);
        return b0.f48488a;
    }

    @Override // fz.e
    public final Object invoke(rz.b0 b0Var, d<? super b0> dVar) {
        return ((CommandQueue$loadFilexVnc2tA$$inlined$suspendNativeRequest$1) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
    }
}
