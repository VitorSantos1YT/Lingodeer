package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveRenderImage extends NativeObject {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final native long cppMakeImage(byte[] bArr, int i11);

        public static /* synthetic */ RiveRenderImage make$default(Companion companion, byte[] bArr, RendererType rendererType, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.make(bArr, rendererType);
        }

        public final RiveRenderImage make(byte[] bytes, RendererType rendererType) {
            m.f(bytes, "bytes");
            m.f(rendererType, "rendererType");
            return new RiveRenderImage(cppMakeImage(bytes, rendererType.getValue()));
        }

        private Companion() {
        }
    }

    public RiveRenderImage(long j11) {
        super(j11);
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j11);
}
