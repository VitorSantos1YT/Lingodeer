package app.rive.runtime.kotlin.renderers;

import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Surface;
import app.rive.runtime.kotlin.SharedSurface;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.NativeObject;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Iterator;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Renderer extends NativeObject implements Choreographer.FrameCallback {
    public static final int $stable = 8;
    private final Object frameLock;
    private boolean isAttached;
    private boolean isPlaying;
    private SharedSurface sharedSurface;
    private final boolean trace;
    private RendererType type;

    /* JADX WARN: Multi-variable type inference failed */
    public Renderer() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void align$default(Renderer renderer, Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f5, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: align");
        }
        if ((i11 & 16) != 0) {
            f5 = 1.0f;
        }
        renderer.align(fit, alignment, rectF, rectF2, f5);
    }

    private final native long constructor(boolean z11, int i11);

    private final native void cppAlign(long j11, Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f5);

    private final native float cppAvgFps(long j11);

    private final native void cppDestroySurface(long j11);

    private final native void cppDoFrame(long j11);

    private final native int cppHeight(long j11);

    private final native void cppRestore(long j11);

    private final native void cppSave(long j11);

    private final native void cppSetSurface(Surface surface, long j11);

    private final native void cppStart(long j11);

    private final native void cppStop(long j11);

    private final native void cppTransform(long j11, float f5, float f11, float f12, float f13, float f14, float f15);

    private final native int cppWidth(long j11);

    private final void destroySurface() {
        synchronized (this.frameLock) {
            this.isAttached = false;
            stop();
            cppDestroySurface(getCppPointer());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleFrame$lambda$3(Renderer this$0) {
        m.f(this$0, "this$0");
        Choreographer.getInstance().postFrameCallback(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$1(Renderer this$0) {
        m.f(this$0, "this$0");
        Choreographer.getInstance().removeFrameCallback(this$0);
    }

    public abstract void advance(float f5);

    public final void align(Fit fit, Alignment alignment, RectF targetBounds, RectF sourceBounds, float f5) {
        m.f(fit, "fit");
        m.f(alignment, "alignment");
        m.f(targetBounds, "targetBounds");
        m.f(sourceBounds, "sourceBounds");
        cppAlign(getCppPointer(), fit, alignment, targetBounds, sourceBounds, f5);
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j11);

    public void delete() {
        stop();
        synchronized (this.frameLock) {
            destroySurface();
            cppDelete(getCppPointer());
            setCppPointer(0L);
        }
    }

    public void disposeDependencies() {
        synchronized (this.frameLock) {
            try {
                SharedSurface sharedSurface = this.sharedSurface;
                if (sharedSurface != null) {
                    sharedSurface.release();
                }
                this.sharedSurface = null;
                Iterator<T> it = getDependencies().iterator();
                while (it.hasNext()) {
                    ((RefCount) it.next()).release();
                }
                getDependencies().clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j11) {
        if (this.isPlaying) {
            synchronized (this.frameLock) {
                if (getHasCppObject()) {
                    cppDoFrame(getCppPointer());
                }
            }
            if (this.isPlaying) {
                scheduleFrame();
            }
        }
    }

    public abstract void draw();

    public final float getAverageFps() {
        return cppAvgFps(getCppPointer());
    }

    public final Object getFrameLock() {
        return this.frameLock;
    }

    public final float getHeight() {
        return cppHeight(getCppPointer());
    }

    public final boolean getTrace() {
        return this.trace;
    }

    public final RendererType getType() {
        return this.type;
    }

    public final float getWidth() {
        return cppWidth(getCppPointer());
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public void make() {
        if (getHasCppObject()) {
            return;
        }
        setCppPointer(constructor(this.trace, this.type.getValue()));
        getRefs().incrementAndGet();
    }

    public final void restore() {
        cppRestore(getCppPointer());
    }

    public final void save() {
        cppSave(getCppPointer());
    }

    public final void scale(float f5, float f11) {
        transform(f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public void scheduleFrame() {
        new Handler(Looper.getMainLooper()).post(new a(this, 1));
    }

    public final void setAttached(boolean z11) {
        this.isAttached = z11;
    }

    public final void setRendererType(int i11) {
        if (i11 != this.type.getValue()) {
            this.type = RendererType.Companion.fromIndex(i11);
        }
    }

    @c
    public final void setSurface(Surface surface) {
        m.f(surface, "surface");
        setSurface$kotlin_release(new SharedSurface(surface));
    }

    public final void setSurface$kotlin_release(SharedSurface surface) {
        m.f(surface, "surface");
        synchronized (this.frameLock) {
            try {
                SharedSurface sharedSurface = this.sharedSurface;
                if (sharedSurface != null) {
                    sharedSurface.release();
                }
                surface.acquire();
                this.sharedSurface = surface;
                cppSetSurface(surface.getSurface(), getCppPointer());
                this.isAttached = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        start();
    }

    public final void setType(RendererType rendererType) {
        m.f(rendererType, "<set-?>");
        this.type = rendererType;
    }

    public final void start() {
        if (!this.isPlaying && this.isAttached && getHasCppObject()) {
            this.isPlaying = true;
            cppStart(getCppPointer());
            scheduleFrame();
        }
    }

    public final void stop() {
        stopThread$kotlin_release();
        new Handler(Looper.getMainLooper()).post(new a(this, 0));
    }

    public final void stopThread$kotlin_release() {
        if (this.isPlaying && getHasCppObject()) {
            this.isPlaying = false;
            cppStop(getCppPointer());
        }
    }

    public final void transform(float f5, float f11, float f12, float f13, float f14, float f15) {
        cppTransform(getCppPointer(), f5, f11, f12, f13, f14, f15);
    }

    public final void translate(float f5, float f11) {
        transform(1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, f5, f11);
    }

    public /* synthetic */ Renderer(RendererType rendererType, boolean z11, int i11, f fVar) {
        this((i11 & 1) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, (i11 & 2) != 0 ? false : z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Renderer(RendererType type, boolean z11) {
        super(0L);
        m.f(type, "type");
        this.type = type;
        this.trace = z11;
        this.frameLock = new Object();
    }
}
