package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.RiveException;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FileAssetLoader extends NativeObject {
    public static final int $stable = 0;

    public FileAssetLoader() throws RiveException {
        super(0L);
        setCppPointer(constructor());
        getRefs().incrementAndGet();
        getCppPointer();
    }

    private final native void cppSetRendererType(long j11, int i11);

    @Override // app.rive.runtime.kotlin.core.NativeObject, app.rive.runtime.kotlin.core.RefCount
    public int acquire() {
        cppRef(getCppPointer());
        return super.acquire();
    }

    public final native long constructor();

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j11);

    public final native void cppRef(long j11);

    public abstract boolean loadContents(FileAsset fileAsset, byte[] bArr);

    public final void setRendererType(RendererType rendererType) {
        m.f(rendererType, "rendererType");
        cppSetRendererType(getCppPointer(), rendererType.getValue());
    }
}
