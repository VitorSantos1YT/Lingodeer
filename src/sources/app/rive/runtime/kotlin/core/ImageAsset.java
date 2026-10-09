package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ImageAsset extends FileAsset {
    public static final int $stable = 0;

    public ImageAsset(long j11, int i11) {
        super(j11, i11, null);
    }

    private final native long cppGetRenderImage(long j11);

    private final native float cppImageAssetHeight(long j11);

    private final native float cppImageAssetWidth(long j11);

    private final native void cppSetRenderImage(long j11, long j12);

    public final float getHeight() {
        return cppImageAssetHeight(getCppPointer());
    }

    public final RiveRenderImage getImage() {
        return new RiveRenderImage(cppGetRenderImage(getCppPointer()));
    }

    public final float getWidth() {
        return cppImageAssetWidth(getCppPointer());
    }

    public final void setImage(RiveRenderImage value) {
        m.f(value, "value");
        cppSetRenderImage(getCppPointer(), value.getCppPointer());
    }
}
