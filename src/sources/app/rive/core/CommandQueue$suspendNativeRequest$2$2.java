package app.rive.core;

import fz.c;
import qy.b0;
import vy.d;
import wy.a;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "app.rive.core.CommandQueue$suspendNativeRequest$2$2", f = "CommandQueue.kt", l = {}, m = "invokeSuspend")
public final class CommandQueue$suspendNativeRequest$2$2 extends i implements fz.e {
    final /* synthetic */ c $nativeFn;
    final /* synthetic */ long $requestID;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandQueue$suspendNativeRequest$2$2(c cVar, long j11, d<? super CommandQueue$suspendNativeRequest$2$2> dVar) {
        super(2, dVar);
        this.$nativeFn = cVar;
        this.$requestID = j11;
    }

    @Override // xy.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new CommandQueue$suspendNativeRequest$2$2(this.$nativeFn, this.$requestID, dVar);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(obj);
        this.$nativeFn.invoke(new Long(this.$requestID));
        return b0.f48488a;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        this.$nativeFn.invoke(Long.valueOf(this.$requestID));
        return b0.f48488a;
    }

    @Override // fz.e
    public final Object invoke(rz.b0 b0Var, d<? super b0> dVar) {
        return ((CommandQueue$suspendNativeRequest$2$2) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
    }
}
