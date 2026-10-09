package app.rive.runtime.kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.lifecycle.LifecycleObserver;
import app.rive.runtime.kotlin.renderers.Renderer;
import com.bumptech.glide.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qy.h;
import qy.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class RiveTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public static final int $stable = 8;
    private final h activity$delegate;
    private final h lifecycleObserver$delegate;
    private Renderer renderer;
    private SharedSurface sharedSurface;

    public /* synthetic */ RiveTextureView(Context context, AttributeSet attributeSet, int i11, f fVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    public abstract LifecycleObserver createObserver();

    public abstract Renderer createRenderer();

    public final Activity getActivity() {
        return (Activity) this.activity$delegate.getValue();
    }

    public final <T> T getContextAsType() {
        if (!(getContext() instanceof ContextWrapper)) {
            return null;
        }
        m.m();
        throw null;
    }

    public final LifecycleObserver getLifecycleObserver() {
        return (LifecycleObserver) this.lifecycleObserver$delegate.getValue();
    }

    public final Renderer getRenderer() {
        return this.renderer;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
        setOpaque(false);
        Renderer rendererCreateRenderer = createRenderer();
        rendererCreateRenderer.make();
        this.renderer = rendererCreateRenderer;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Renderer renderer = this.renderer;
        m.c(renderer);
        renderer.delete();
        this.renderer = null;
        super.onDetachedFromWindow();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
        m.f(surfaceTexture, "surfaceTexture");
        SharedSurface sharedSurface = this.sharedSurface;
        if (sharedSurface != null) {
            sharedSurface.release();
        }
        Renderer renderer = this.renderer;
        if (renderer != null) {
            renderer.stop();
            SharedSurface sharedSurface2 = new SharedSurface(new Surface(surfaceTexture));
            this.sharedSurface = sharedSurface2;
            renderer.setSurface$kotlin_release(sharedSurface2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        m.f(surface, "surface");
        SharedSurface sharedSurface = this.sharedSurface;
        if (sharedSurface != null) {
            sharedSurface.release();
        }
        this.sharedSurface = null;
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i11, int i12) {
        m.f(surface, "surface");
        onSurfaceTextureAvailable(surface, i11, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
        m.f(surface, "surface");
    }

    @Override // android.view.TextureView, android.view.View
    public void onVisibilityChanged(View changedView, int i11) {
        m.f(changedView, "changedView");
        super.onVisibilityChanged(changedView, i11);
        if (i11 == 0) {
            Renderer renderer = this.renderer;
            if (renderer != null) {
                renderer.start();
                return;
            }
            return;
        }
        Renderer renderer2 = this.renderer;
        if (renderer2 != null) {
            renderer2.stop();
        }
    }

    public final void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
        this.activity$delegate = d.u(j.NONE, new RiveTextureView$activity$2(this));
        this.lifecycleObserver$delegate = d.v(new RiveTextureView$lifecycleObserver$2(this));
    }
}
