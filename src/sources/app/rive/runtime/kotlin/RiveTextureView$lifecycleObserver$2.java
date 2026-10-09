package app.rive.runtime.kotlin;

import androidx.lifecycle.LifecycleObserver;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveTextureView$lifecycleObserver$2 extends n implements fz.a {
    final /* synthetic */ RiveTextureView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveTextureView$lifecycleObserver$2(RiveTextureView riveTextureView) {
        super(0);
        this.this$0 = riveTextureView;
    }

    @Override // fz.a
    public final LifecycleObserver invoke() {
        return this.this$0.createObserver();
    }
}
