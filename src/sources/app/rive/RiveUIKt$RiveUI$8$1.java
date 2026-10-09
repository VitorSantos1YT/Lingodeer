package app.rive;

import android.content.Context;
import android.view.TextureView;
import fz.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveUIKt$RiveUI$8$1 extends n implements c {
    final /* synthetic */ RiveUIKt$RiveUI$surfaceListener$1$1 $surfaceListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveUIKt$RiveUI$8$1(RiveUIKt$RiveUI$surfaceListener$1$1 riveUIKt$RiveUI$surfaceListener$1$1) {
        super(1);
        this.$surfaceListener = riveUIKt$RiveUI$surfaceListener$1$1;
    }

    @Override // fz.c
    public final TextureView invoke(Context context) {
        m.f(context, "context");
        TextureView textureView = new TextureView(context);
        textureView.setSurfaceTextureListener(this.$surfaceListener);
        textureView.setOpaque(false);
        return textureView;
    }
}
