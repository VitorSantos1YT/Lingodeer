package app.rive.runtime.kotlin.renderers;

import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class RiveArtboardRenderer extends Renderer {
    public static final int $stable = 8;
    private RiveFileController controller;

    public /* synthetic */ RiveArtboardRenderer(boolean z11, RendererType rendererType, RiveFileController riveFileController, int i11, f fVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, riveFileController);
    }

    private final Alignment getAlignment() {
        return this.controller.getAlignment();
    }

    private final Fit getFit() {
        return this.controller.getFit();
    }

    private final float getScaleFactor() {
        return this.controller.getLayoutScaleFactorActive$kotlin_release();
    }

    private final void resizeArtboard() {
        if (getFit() != Fit.LAYOUT) {
            Artboard activeArtboard = this.controller.getActiveArtboard();
            if (activeArtboard != null) {
                activeArtboard.resetArtboardSize();
                return;
            }
            return;
        }
        float width = getWidth() / getScaleFactor();
        float height = getHeight() / getScaleFactor();
        Artboard activeArtboard2 = this.controller.getActiveArtboard();
        if (activeArtboard2 != null) {
            activeArtboard2.setWidth(width);
            activeArtboard2.setHeight(height);
        }
    }

    @Override // app.rive.runtime.kotlin.renderers.Renderer
    public void advance(float f5) {
        if (getHasCppObject()) {
            if (this.controller.isActive()) {
                this.controller.advance(f5);
            }
            synchronized (this.controller.getStartStopLock$kotlin_release()) {
                if (!this.controller.isAdvancing()) {
                    stopThread$kotlin_release();
                }
            }
        }
    }

    @Override // app.rive.runtime.kotlin.renderers.Renderer
    public void disposeDependencies() {
        Object lock;
        File file = this.controller.getFile();
        if (file == null || (lock = file.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            super.disposeDependencies();
        }
    }

    @Override // app.rive.runtime.kotlin.renderers.Renderer
    public void draw() {
        ReentrantLock lock;
        File file = this.controller.getFile();
        synchronized (((file == null || (lock = file.getLock()) == null) ? this : lock)) {
            try {
                if (getHasCppObject() && this.controller.isActive()) {
                    if (this.controller.getRequireArtboardResize$kotlin_release().getAndSet(false)) {
                        resizeArtboard();
                    }
                    Artboard activeArtboard = this.controller.getActiveArtboard();
                    if (activeArtboard != null) {
                        activeArtboard.draw(getCppPointer(), getFit(), getAlignment(), getScaleFactor());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void reset() {
        this.controller.stopAnimations();
        this.controller.reset$kotlin_release();
        stop();
        RiveFileController.selectArtboard$default(this.controller, null, 1, null);
        start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveArtboardRenderer(boolean z11, RendererType rendererType, RiveFileController controller) {
        super(rendererType, z11);
        m.f(rendererType, "rendererType");
        m.f(controller, "controller");
        this.controller = controller;
        controller.setOnStart(new RiveArtboardRenderer$1$1(this));
        controller.acquire();
        getDependencies().add(controller);
    }
}
