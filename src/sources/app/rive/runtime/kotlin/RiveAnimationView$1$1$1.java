package app.rive.runtime.kotlin;

import app.rive.runtime.kotlin.core.File;
import fz.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveAnimationView$1$1$1 extends n implements c {
    final /* synthetic */ RiveAnimationView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveAnimationView$1$1$1(RiveAnimationView riveAnimationView) {
        super(1);
        this.this$0 = riveAnimationView;
    }

    @Override // fz.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((File) obj);
        return b0.f48488a;
    }

    public final void invoke(File it) {
        m.f(it, "it");
        this.this$0.getController().setFile(it);
        this.this$0.getController().setupScene$kotlin_release(this.this$0.getRendererAttributes());
    }
}
