package app.rive.runtime.kotlin;

import android.view.Surface;
import app.rive.runtime.kotlin.core.RefCount;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SharedSurface implements RefCount {
    public static final int $stable = 8;
    private AtomicInteger refs;
    private final Surface surface;

    public SharedSurface(Surface surface) {
        m.f(surface, "surface");
        this.surface = surface;
        this.refs = new AtomicInteger(1);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int acquire() {
        return RefCount.DefaultImpls.acquire(this);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int getRefCount() {
        return RefCount.DefaultImpls.getRefCount(this);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public AtomicInteger getRefs() {
        return this.refs;
    }

    public final Surface getSurface() {
        return this.surface;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int release() {
        int iRelease = RefCount.DefaultImpls.release(this);
        if (iRelease == 0) {
            this.surface.release();
        }
        return iRelease;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public void setRefs(AtomicInteger atomicInteger) {
        m.f(atomicInteger, "<set-?>");
        this.refs = atomicInteger;
    }
}
