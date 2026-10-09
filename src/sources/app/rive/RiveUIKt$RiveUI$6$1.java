package app.rive;

import l1.b1;
import qy.b0;
import vy.d;
import wy.a;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "app.rive.RiveUIKt$RiveUI$6$1", f = "RiveUI.kt", l = {}, m = "invokeSuspend")
public final class RiveUIKt$RiveUI$6$1 extends i implements fz.e {
    final /* synthetic */ b1 $isSettled$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveUIKt$RiveUI$6$1(b1 b1Var, d<? super RiveUIKt$RiveUI$6$1> dVar) {
        super(2, dVar);
        this.$isSettled$delegate = b1Var;
    }

    @Override // xy.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new RiveUIKt$RiveUI$6$1(this.$isSettled$delegate, dVar);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(obj);
        RiveUIKt.RiveUI$lambda$4(this.$isSettled$delegate, false);
        return b0.f48488a;
    }

    @Override // fz.e
    public final Object invoke(rz.b0 b0Var, d<? super b0> dVar) {
        return ((RiveUIKt$RiveUI$6$1) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
    }
}
