package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class PathIteratorPreApi34Impl {
    static {
        System.loadLibrary("androidx.graphics.path");
    }

    private final native long createInternalPathIterator(Path path, int i11, float f5);

    private final native void destroyInternalPathIterator(long j11);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j11);

    @FastNative
    private final native int internalPathIteratorNext(long j11, float[] fArr, int i11);

    @FastNative
    private final native int internalPathIteratorPeek(long j11);

    @FastNative
    private final native int internalPathIteratorRawSize(long j11);

    @FastNative
    private final native int internalPathIteratorSize(long j11);

    public final void finalize() {
        destroyInternalPathIterator(0L);
    }
}
