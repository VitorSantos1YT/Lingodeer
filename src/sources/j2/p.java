package j2;

import android.view.RenderNode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(RenderNode renderNode, int i11) {
        renderNode.setAmbientShadowColor(i11);
    }

    public static void d(RenderNode renderNode, int i11) {
        renderNode.setSpotShadowColor(i11);
    }
}
