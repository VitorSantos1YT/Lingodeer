package app.rive.runtime.kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import app.rive.runtime.kotlin.controllers.ControllerState;
import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.ContextAssetLoader;
import app.rive.runtime.kotlin.core.Direction;
import app.rive.runtime.kotlin.core.FallbackAssetLoader;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.FileAssetLoader;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.LinearAnimationInstance;
import app.rive.runtime.kotlin.core.Loop;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import app.rive.runtime.kotlin.core.errors.RiveException;
import app.rive.runtime.kotlin.renderers.PointerEvents;
import app.rive.runtime.kotlin.renderers.Renderer;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import app.rive.runtime.kotlin.renderers.RiveArtboardRenderer;
import com.android.volley.VolleyError;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.yalantis.ucrop.view.CropImageView;
import dl.ExOZ.xItStCyvVEZ;
import fz.c;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import ns.o;
import qy.b0;
import ry.l;
import se.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class RiveAnimationView extends RiveTextureView implements Observable<RiveFileController.Listener> {
    public static final String TAG = "RiveAnimationView";
    public static final boolean shouldLoadCDNAssetsDefault = true;
    public static final boolean traceAnimationsDefault = false;
    private final RectF bounds;
    private RiveFileController controller;
    private final boolean defaultAutoplay;
    private Window.OnFrameMetricsAvailableListener frameMetricsListener;
    private LifecycleOwner lifecycleOwner;
    private final RendererAttributes rendererAttributes;
    private boolean touchPassThrough;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int alignmentIndexDefault = Alignment.CENTER.ordinal();
    private static final int fitIndexDefault = Fit.CONTAIN.ordinal();
    private static final int loopIndexDefault = Loop.AUTO.ordinal();
    private static final int rendererIndexDefault = Rive.INSTANCE.getDefaultRendererType().getValue();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
        public static final int $stable = 8;
        private Alignment alignment;
        private String animationName;
        private String artboardName;
        private FileAssetLoader assetLoader;
        private boolean autoBind;
        private Boolean autoplay;
        private final Context context;
        private Fit fit;
        private Loop loop;
        private RendererType rendererType;
        private Object resource;
        private ResourceType resourceType;
        private boolean shouldLoadCDNAssets;
        private String stateMachineName;
        private boolean touchPassThrough;
        private Boolean traceAnimations;

        public Builder(Context context) {
            m.f(context, "context");
            this.context = context;
            this.shouldLoadCDNAssets = true;
        }

        public final RiveAnimationView build() {
            return new RiveAnimationView(this);
        }

        public final Alignment getAlignment$kotlin_release() {
            return this.alignment;
        }

        public final String getAnimationName$kotlin_release() {
            return this.animationName;
        }

        public final String getArtboardName$kotlin_release() {
            return this.artboardName;
        }

        public final FileAssetLoader getAssetLoader$kotlin_release() {
            return this.assetLoader;
        }

        public final boolean getAutoBind$kotlin_release() {
            return this.autoBind;
        }

        public final Boolean getAutoplay$kotlin_release() {
            return this.autoplay;
        }

        public final Context getContext$kotlin_release() {
            return this.context;
        }

        public final Fit getFit$kotlin_release() {
            return this.fit;
        }

        public final Loop getLoop$kotlin_release() {
            return this.loop;
        }

        public final RendererType getRendererType$kotlin_release() {
            return this.rendererType;
        }

        public final Object getResource$kotlin_release() {
            return this.resource;
        }

        public final ResourceType getResourceType$kotlin_release() {
            return this.resourceType;
        }

        public final boolean getShouldLoadCDNAssets$kotlin_release() {
            return this.shouldLoadCDNAssets;
        }

        public final String getStateMachineName$kotlin_release() {
            return this.stateMachineName;
        }

        public final boolean getTouchPassThrough$kotlin_release() {
            return this.touchPassThrough;
        }

        public final Boolean getTraceAnimations$kotlin_release() {
            return this.traceAnimations;
        }

        public final Builder setAlignment(Alignment value) {
            m.f(value, "value");
            this.alignment = value;
            return this;
        }

        public final void setAlignment$kotlin_release(Alignment alignment) {
            this.alignment = alignment;
        }

        public final Builder setAnimationName(String value) {
            m.f(value, "value");
            this.animationName = value;
            return this;
        }

        public final void setAnimationName$kotlin_release(String str) {
            this.animationName = str;
        }

        public final Builder setArtboardName(String value) {
            m.f(value, "value");
            this.artboardName = value;
            return this;
        }

        public final void setArtboardName$kotlin_release(String str) {
            this.artboardName = str;
        }

        public final Builder setAssetLoader(FileAssetLoader value) {
            m.f(value, "value");
            this.assetLoader = value;
            return this;
        }

        public final void setAssetLoader$kotlin_release(FileAssetLoader fileAssetLoader) {
            this.assetLoader = fileAssetLoader;
        }

        public final Builder setAutoBind(boolean z11) {
            this.autoBind = z11;
            return this;
        }

        public final void setAutoBind$kotlin_release(boolean z11) {
            this.autoBind = z11;
        }

        public final Builder setAutoplay(boolean z11) {
            this.autoplay = Boolean.valueOf(z11);
            return this;
        }

        public final void setAutoplay$kotlin_release(Boolean bool) {
            this.autoplay = bool;
        }

        public final Builder setFit(Fit value) {
            m.f(value, "value");
            this.fit = value;
            return this;
        }

        public final void setFit$kotlin_release(Fit fit) {
            this.fit = fit;
        }

        public final Builder setLoop(Loop value) {
            m.f(value, "value");
            this.loop = value;
            return this;
        }

        public final void setLoop$kotlin_release(Loop loop) {
            this.loop = loop;
        }

        public final Builder setRendererType(RendererType value) {
            m.f(value, "value");
            this.rendererType = value;
            return this;
        }

        public final void setRendererType$kotlin_release(RendererType rendererType) {
            this.rendererType = rendererType;
        }

        public final Builder setResource(Object value) {
            m.f(value, "value");
            this.resourceType = ResourceType.Companion.makeMaybeResource(value);
            this.resource = value;
            return this;
        }

        public final void setResource$kotlin_release(Object obj) {
            this.resource = obj;
        }

        public final void setResourceType$kotlin_release(ResourceType resourceType) {
            this.resourceType = resourceType;
        }

        public final Builder setShouldLoadCDNAssets(boolean z11) {
            this.shouldLoadCDNAssets = z11;
            return this;
        }

        public final void setShouldLoadCDNAssets$kotlin_release(boolean z11) {
            this.shouldLoadCDNAssets = z11;
        }

        public final Builder setStateMachineName(String value) {
            m.f(value, "value");
            this.stateMachineName = value;
            return this;
        }

        public final void setStateMachineName$kotlin_release(String str) {
            this.stateMachineName = str;
        }

        public final Builder setTouchPassThrough(boolean z11) {
            this.touchPassThrough = z11;
            return this;
        }

        public final void setTouchPassThrough$kotlin_release(boolean z11) {
            this.touchPassThrough = z11;
        }

        public final Builder setTraceAnimations(boolean z11) {
            this.traceAnimations = Boolean.valueOf(z11);
            return this;
        }

        public final void setTraceAnimations$kotlin_release(Boolean bool) {
            this.traceAnimations = bool;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final int getAlignmentIndexDefault() {
            return RiveAnimationView.alignmentIndexDefault;
        }

        public final int getFitIndexDefault() {
            return RiveAnimationView.fitIndexDefault;
        }

        public final int getLoopIndexDefault() {
            return RiveAnimationView.loopIndexDefault;
        }

        public final int getRendererIndexDefault() {
            return RiveAnimationView.rendererIndexDefault;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$onAttachedToWindow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass1 extends n implements c {
        public AnonymousClass1() {
            super(1);
        }

        @Override // fz.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((File) obj);
            return b0.f48488a;
        }

        public final void invoke(File it) {
            m.f(it, "it");
            RiveAnimationView.this.getController().setFile(it);
            RiveAnimationView.this.getController().setupScene$kotlin_release(RiveAnimationView.this.getRendererAttributes());
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$setRiveBytes$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass2 extends n implements c {
        public AnonymousClass2() {
            super(1);
        }

        @Override // fz.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((File) obj);
            return b0.f48488a;
        }

        public final void invoke(File it) {
            m.f(it, "it");
            RiveAnimationView.this.getController().setFile(it);
            RiveAnimationView.this.getController().setupScene$kotlin_release(RiveAnimationView.this.getRendererAttributes());
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$setRiveResource$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class C00722 extends n implements c {
        public C00722() {
            super(1);
        }

        @Override // fz.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((File) obj);
            return b0.f48488a;
        }

        public final void invoke(File it) {
            m.f(it, "it");
            RiveAnimationView.this.getController().setFile(it);
            RiveAnimationView.this.getController().setupScene$kotlin_release(RiveAnimationView.this.getRendererAttributes());
        }
    }

    public /* synthetic */ RiveAnimationView(Context context, AttributeSet attributeSet, int i11, f fVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    public static /* synthetic */ void getRendererAttributes$annotations() {
    }

    private final void loadFileFromResource(c cVar) {
        ResourceType resource = this.rendererAttributes.getResource();
        if (resource == null) {
            return;
        }
        if (resource instanceof ResourceType.ResourceRiveFile) {
            cVar.invoke(((ResourceType.ResourceRiveFile) resource).getFile());
            return;
        }
        if (resource instanceof ResourceType.ResourceUrl) {
            loadFromNetwork(((ResourceType.ResourceUrl) resource).getUrl(), cVar);
            return;
        }
        if (resource instanceof ResourceType.ResourceBytes) {
            File file = new File(((ResourceType.ResourceBytes) resource).getBytes(), this.rendererAttributes.getRendererType(), this.rendererAttributes.getAssetLoader());
            cVar.invoke(file);
            file.release();
        } else if (resource instanceof ResourceType.ResourceId) {
            InputStream inputStreamOpenRawResource = getResources().openRawResource(((ResourceType.ResourceId) resource).getId());
            try {
                m.c(inputStreamOpenRawResource);
                File file2 = new File(md.a.t(inputStreamOpenRawResource), this.rendererAttributes.getRendererType(), this.rendererAttributes.getAssetLoader());
                cVar.invoke(file2);
                file2.release();
                o.m(inputStreamOpenRawResource, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    o.m(inputStreamOpenRawResource, th2);
                    throw th3;
                }
            }
        }
    }

    private final void loadFromNetwork(String str, c cVar) {
        p.W(getContext().getApplicationContext()).a(new RiveFileRequest(str, this.rendererAttributes.getRendererType(), new a(cVar), new b(str, 0), this.rendererAttributes.getAssetLoader()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadFromNetwork$lambda$4(c onComplete, File file) {
        m.f(onComplete, "$onComplete");
        m.c(file);
        onComplete.invoke(file);
        file.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadFromNetwork$lambda$5(String url, VolleyError volleyError) throws IOException {
        m.f(url, "$url");
        throw new IOException("Unable to download Rive file ".concat(url));
    }

    public static /* synthetic */ void pause$default(RiveAnimationView riveAnimationView, List list, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        riveAnimationView.pause((List<String>) list, z11);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, Loop loop, Direction direction, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i11 & 1) != 0) {
            loop = Loop.AUTO;
        }
        if ((i11 & 2) != 0) {
            direction = Direction.AUTO;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        riveAnimationView.play(loop, direction, z11);
    }

    public static /* synthetic */ void setRiveBytes$default(RiveAnimationView riveAnimationView, byte[] bArr, String str, String str2, String str3, boolean z11, boolean z12, Fit fit, Alignment alignment, Loop loop, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRiveBytes");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        if ((i11 & 16) != 0) {
            z11 = riveAnimationView.controller.getAutoplay();
        }
        if ((i11 & 32) != 0) {
            z12 = false;
        }
        if ((i11 & 64) != 0) {
            fit = Fit.Companion.fromIndex(fitIndexDefault);
        }
        if ((i11 & 128) != 0) {
            alignment = Alignment.Companion.fromIndex(alignmentIndexDefault);
        }
        if ((i11 & 256) != 0) {
            loop = Loop.Companion.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveBytes(bArr, str, str2, str3, z11, z12, fit, alignment, loop);
    }

    public static /* synthetic */ void setRiveFile$default(RiveAnimationView riveAnimationView, File file, String str, String str2, String str3, boolean z11, boolean z12, Fit fit, Alignment alignment, Loop loop, int i11, Object obj) throws RiveException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRiveFile");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        if ((i11 & 16) != 0) {
            z11 = riveAnimationView.controller.getAutoplay();
        }
        if ((i11 & 32) != 0) {
            z12 = false;
        }
        if ((i11 & 64) != 0) {
            fit = Fit.Companion.fromIndex(fitIndexDefault);
        }
        if ((i11 & 128) != 0) {
            alignment = Alignment.Companion.fromIndex(alignmentIndexDefault);
        }
        if ((i11 & 256) != 0) {
            loop = Loop.Companion.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveFile(file, str, str2, str3, z11, z12, fit, alignment, loop);
    }

    public static /* synthetic */ void setRiveResource$default(RiveAnimationView riveAnimationView, int i11, String str, String str2, String str3, boolean z11, boolean z12, Fit fit, Alignment alignment, Loop loop, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRiveResource");
        }
        if ((i12 & 2) != 0) {
            str = null;
        }
        if ((i12 & 4) != 0) {
            str2 = null;
        }
        if ((i12 & 8) != 0) {
            str3 = null;
        }
        if ((i12 & 16) != 0) {
            z11 = riveAnimationView.controller.getAutoplay();
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            fit = Fit.Companion.fromIndex(fitIndexDefault);
        }
        if ((i12 & 128) != 0) {
            alignment = Alignment.Companion.fromIndex(alignmentIndexDefault);
        }
        if ((i12 & 256) != 0) {
            loop = Loop.Companion.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveResource(i11, str, str2, str3, z11, z12, fit, alignment, loop);
    }

    private final void startFrameMetrics() {
        RendererMetrics rendererMetrics = new RendererMetrics(getActivity());
        getActivity().getWindow().addOnFrameMetricsAvailableListener(rendererMetrics, new Handler(Looper.getMainLooper()));
        this.frameMetricsListener = rendererMetrics;
    }

    public static /* synthetic */ void stop$default(RiveAnimationView riveAnimationView, List list, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        riveAnimationView.stop((List<String>) list, z11);
    }

    private final void stopFrameMetrics() {
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.frameMetricsListener;
        if (onFrameMetricsAvailableListener != null) {
            getActivity().getWindow().removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    private final void validateLifecycleOwner() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner == null || lifecycleOwner.equals(this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner2 = this.lifecycleOwner;
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.removeObserver(getLifecycleObserver());
        }
        this.lifecycleOwner = lifecycleOwner;
        Lifecycle lifecycle2 = lifecycleOwner.getLifecycle();
        if (lifecycle2 != null) {
            lifecycle2.addObserver(getLifecycleObserver());
        }
    }

    public final void addEventListener(RiveFileController.RiveEventListener listener) {
        m.f(listener, "listener");
        this.controller.addEventListener(listener);
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView
    public LifecycleObserver createObserver() {
        return new RiveViewLifecycleObserver(ry.m.c1(l.T(new RefCount[]{this.controller, this.rendererAttributes.getAssetLoader()})));
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView
    public Renderer createRenderer() {
        return new RiveArtboardRenderer(this.rendererAttributes.getRiveTraceAnimations(), this.rendererAttributes.getRendererType(), this.controller);
    }

    public final void fireState(String stateMachineName, String inputName) {
        m.f(stateMachineName, "stateMachineName");
        m.f(inputName, "inputName");
        RiveFileController.fireState$default(this.controller, stateMachineName, inputName, null, 4, null);
    }

    public final void fireStateAtPath(String inputName, String path) {
        m.f(inputName, "inputName");
        m.f(path, "path");
        this.controller.fireStateAtPath(inputName, path);
    }

    public final Alignment getAlignment() {
        return this.controller.getAlignment();
    }

    public final List<LinearAnimationInstance> getAnimations() {
        return this.controller.getAnimations();
    }

    public final String getArtboardName() {
        Artboard activeArtboard = this.controller.getActiveArtboard();
        if (activeArtboard != null) {
            return activeArtboard.getName();
        }
        return null;
    }

    public final RiveArtboardRenderer getArtboardRenderer() {
        Renderer renderer = getRenderer();
        if (renderer == null ? true : renderer instanceof RiveArtboardRenderer) {
            return (RiveArtboardRenderer) getRenderer();
        }
        Renderer renderer2 = getRenderer();
        String simpleName = renderer2 != null ? renderer2.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        }
        throw new TypeCastException("Expected RiveArtboardRenderer but got ".concat(simpleName));
    }

    public final boolean getAutoplay() {
        return this.controller.getAutoplay();
    }

    public final RiveFileController getController() {
        return this.controller;
    }

    public boolean getDefaultAutoplay() {
        return this.defaultAutoplay;
    }

    public final File getFile() {
        return this.controller.getFile();
    }

    public final Fit getFit() {
        return this.controller.getFit();
    }

    public final Float getLayoutScaleFactor() {
        return this.controller.getLayoutScaleFactor();
    }

    public final float getLayoutScaleFactorAutomatic() {
        return this.controller.getLayoutScaleFactorAutomatic();
    }

    public final HashSet<LinearAnimationInstance> getPlayingAnimations() {
        return this.controller.getPlayingAnimations();
    }

    public final HashSet<StateMachineInstance> getPlayingStateMachines() {
        return this.controller.getPlayingStateMachines();
    }

    public final RendererAttributes getRendererAttributes() {
        return this.rendererAttributes;
    }

    public final List<StateMachineInstance> getStateMachines() {
        return this.controller.getStateMachines();
    }

    public final String getTextRunValue(String textRunName) {
        m.f(textRunName, "textRunName");
        return this.controller.getTextRunValue(textRunName);
    }

    public boolean getTouchPassThrough() {
        return this.touchPassThrough;
    }

    public final Float getVolume() {
        return this.controller.getVolume();
    }

    public final boolean isPlaying() {
        Renderer renderer = getRenderer();
        return renderer != null && renderer.isPlaying();
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        validateLifecycleOwner();
        if (this.controller.getFile() == null) {
            loadFileFromResource(new AnonymousClass1());
        }
        Renderer renderer = getRenderer();
        m.c(renderer);
        if (renderer.getTrace()) {
            startFrameMetrics();
        }
        this.controller.setActive(true);
        Renderer renderer2 = getRenderer();
        m.c(renderer2);
        renderer2.start();
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.View
    public void onDetachedFromWindow() {
        this.controller.setActive(false);
        stopFrameMetrics();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (getRenderer() == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int iWidth = mode == 0 ? (int) this.controller.getArtboardBounds().width() : View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int iHeight = mode2 == 0 ? (int) this.controller.getArtboardBounds().height() : View.MeasureSpec.getSize(i12);
        this.controller.setLayoutScaleFactorAutomatic$kotlin_release(getResources().getDisplayMetrics().density);
        this.controller.getRequireArtboardResize$kotlin_release().set(true);
        this.bounds.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, iWidth, iHeight);
        RectF rectFCalculateRequiredBounds = Rive.INSTANCE.calculateRequiredBounds(this.controller.getFit(), this.controller.getAlignment(), this.bounds, this.controller.getArtboardBounds(), this.controller.getLayoutScaleFactorActive$kotlin_release());
        if (mode == Integer.MIN_VALUE) {
            iWidth = Math.min((int) rectFCalculateRequiredBounds.width(), iWidth);
        } else if (mode != 1073741824) {
            iWidth = (int) rectFCalculateRequiredBounds.width();
        }
        if (mode2 == Integer.MIN_VALUE) {
            iHeight = Math.min((int) rectFCalculateRequiredBounds.height(), iHeight);
        } else if (mode2 != 1073741824) {
            iHeight = (int) rectFCalculateRequiredBounds.height();
        }
        setMeasuredDimension(iWidth, iHeight);
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
        m.f(surfaceTexture, "surfaceTexture");
        super.onSurfaceTextureAvailable(surfaceTexture, i11, i12);
        this.controller.setTargetBounds(new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, i11, i12));
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i11, int i12) {
        m.f(surface, "surface");
        super.onSurfaceTextureSizeChanged(surface, i11, i12);
        this.controller.setTargetBounds(new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, i11, i12));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        m.f(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.controller.pointerEvent(PointerEvents.POINTER_DOWN, event.getX(), event.getY());
        } else if (action == 1) {
            this.controller.pointerEvent(PointerEvents.POINTER_UP, event.getX(), event.getY());
        } else if (action == 2) {
            this.controller.pointerEvent(PointerEvents.POINTER_MOVE, event.getX(), event.getY());
        } else if (action == 3) {
            this.controller.pointerEvent(PointerEvents.POINTER_UP, event.getX(), event.getY());
        }
        return !getTouchPassThrough();
    }

    public final void pause() {
        RiveArtboardRenderer artboardRenderer = getArtboardRenderer();
        if (artboardRenderer != null) {
            artboardRenderer.stop();
        }
        this.controller.pause();
        stopFrameMetrics();
    }

    public final void play(Loop loop, Direction direction, boolean z11) {
        m.f(loop, "loop");
        m.f(direction, "direction");
        this.rendererAttributes.setLoop(loop);
        this.controller.play(loop, direction, z11);
    }

    public final void removeEventListener(RiveFileController.RiveEventListener listener) {
        m.f(listener, "listener");
        this.controller.removeEventListener(listener);
    }

    public final void reset() {
        RiveArtboardRenderer artboardRenderer = getArtboardRenderer();
        if (artboardRenderer != null) {
            artboardRenderer.reset();
        }
    }

    public final void restoreControllerState(ControllerState state) {
        m.f(state, "state");
        this.controller.restoreControllerState(state);
    }

    public final ControllerState saveControllerState() {
        this.rendererAttributes.setResource(null);
        return this.controller.saveControllerState();
    }

    public final void setAlignment(Alignment value) {
        m.f(value, "value");
        this.controller.setAlignment(value);
    }

    public final void setArtboardName(String str) {
        this.controller.selectArtboard(str);
    }

    public final void setAssetLoader(FileAssetLoader fileAssetLoader) {
        if (m.a(fileAssetLoader, this.rendererAttributes.getAssetLoader())) {
            return;
        }
        FileAssetLoader assetLoader = this.rendererAttributes.getAssetLoader();
        this.rendererAttributes.setAssetLoader(fileAssetLoader);
        if (fileAssetLoader != null) {
            fileAssetLoader.acquire();
        }
        if (assetLoader != null) {
            assetLoader.release();
        }
        LifecycleObserver lifecycleObserver = getLifecycleObserver();
        RiveViewLifecycleObserver riveViewLifecycleObserver = lifecycleObserver instanceof RiveViewLifecycleObserver ? (RiveViewLifecycleObserver) lifecycleObserver : null;
        if (riveViewLifecycleObserver != null) {
            if (assetLoader != null) {
                riveViewLifecycleObserver.remove(assetLoader);
            }
            if (fileAssetLoader != null) {
                riveViewLifecycleObserver.insert(fileAssetLoader);
            }
        }
    }

    public final void setAutoplay(boolean z11) {
        this.controller.setAutoplay(z11);
    }

    public final void setBooleanStateAtPath(String inputName, boolean z11, String path) {
        m.f(inputName, "inputName");
        m.f(path, "path");
        this.controller.setBooleanStateAtPath(inputName, z11, path);
    }

    public final void setController(RiveFileController riveFileController) {
        m.f(riveFileController, "<set-?>");
        this.controller = riveFileController;
    }

    public final void setFit(Fit value) {
        m.f(value, "value");
        this.controller.setFit(value);
    }

    public final void setLayoutScaleFactor(Float f5) {
        this.controller.setLayoutScaleFactor(f5);
    }

    public final void setLayoutScaleFactorAutomatic$kotlin_release(float f5) {
        this.controller.setLayoutScaleFactorAutomatic$kotlin_release(f5);
    }

    public final void setMultipleStates(ChangedInput... inputs) {
        m.f(inputs, "inputs");
        this.controller.queueInputs$kotlin_release((ChangedInput[]) Arrays.copyOf(inputs, inputs.length));
    }

    public final void setNumberState(String stateMachineName, String inputName, float f5) {
        m.f(stateMachineName, "stateMachineName");
        m.f(inputName, "inputName");
        RiveFileController.setNumberState$default(this.controller, stateMachineName, inputName, f5, null, 8, null);
    }

    public final void setNumberStateAtPath(String inputName, float f5, String path) {
        m.f(inputName, "inputName");
        m.f(path, "path");
        this.controller.setNumberStateAtPath(inputName, f5, path);
    }

    public final void setRiveBytes(byte[] bytes, String str, String str2, String str3, boolean z11, boolean z12, Fit fit, Alignment alignment, Loop loop) {
        m.f(bytes, "bytes");
        m.f(fit, "fit");
        m.f(alignment, "alignment");
        m.f(loop, "loop");
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(str);
        rendererAttributes.setAnimationName(str2);
        rendererAttributes.setStateMachineName(str3);
        rendererAttributes.setAutoplay(z11);
        rendererAttributes.setAutoBind(z12);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.Companion.makeMaybeResource(bytes));
        loadFileFromResource(new AnonymousClass2());
    }

    public final void setRiveFile(File file, String str, String str2, String str3, boolean z11, boolean z12, Fit fit, Alignment alignment, Loop loop) throws RiveException {
        m.f(file, "file");
        m.f(fit, "fit");
        m.f(alignment, "alignment");
        m.f(loop, "loop");
        if (file.getRendererType() != this.rendererAttributes.getRendererType()) {
            throw new RiveException("Incompatible Renderer types: file initialized with " + file.getRendererType().name() + " but View is set up for " + this.rendererAttributes.getRendererType().name());
        }
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(str);
        rendererAttributes.setAnimationName(str2);
        rendererAttributes.setStateMachineName(str3);
        rendererAttributes.setAutoplay(z11);
        rendererAttributes.setAutoBind(z12);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.Companion.makeMaybeResource(file));
        this.controller.setFile(file);
        this.controller.setupScene$kotlin_release(this.rendererAttributes);
    }

    public final void setRiveResource(int i11, String str, String str2, String str3, boolean z11, boolean z12, Fit fit, Alignment alignment, Loop loop) {
        m.f(fit, "fit");
        m.f(alignment, "alignment");
        m.f(loop, "loop");
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(str);
        rendererAttributes.setAnimationName(str2);
        rendererAttributes.setStateMachineName(str3);
        rendererAttributes.setAutoplay(z11);
        rendererAttributes.setAutoBind(z12);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.Companion.makeMaybeResource(Integer.valueOf(i11)));
        loadFileFromResource(new C00722());
    }

    public final void setTextRunValue(String str, String textValue) {
        m.f(str, xItStCyvVEZ.bCLpKgawFDBb);
        m.f(textValue, "textValue");
        this.controller.setTextRunValue(str, textValue);
    }

    public void setTouchPassThrough(boolean z11) {
        this.touchPassThrough = z11;
    }

    public final void setVolume(float f5) {
        this.controller.setVolume(f5);
    }

    public final void stop() {
        this.controller.stopAnimations();
        stopFrameMetrics();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveAnimationView(Context context, AttributeSet attributeSet) {
        Lifecycle lifecycle;
        super(context, attributeSet);
        m.f(context, "context");
        this.defaultAutoplay = true;
        this.bounds = new RectF();
        Object context2 = getContext();
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                context2 = null;
                break;
            } else if (context2 instanceof LifecycleOwner) {
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        this.lifecycleOwner = (LifecycleOwner) context2;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.RiveAnimationView, 0, 0);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RiveAnimationView_riveResource, -1);
            Object string = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveUrl);
            ResourceType.Companion companion = ResourceType.Companion;
            if (resourceId != -1) {
                string = Integer.valueOf(resourceId);
            }
            ResourceType resourceTypeMakeMaybeResource = companion.makeMaybeResource(string);
            RendererAttributes.Companion companion2 = RendererAttributes.Companion;
            String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveAssetLoaderClass);
            Context applicationContext = context.getApplicationContext();
            m.e(applicationContext, "getApplicationContext(...)");
            FileAssetLoader fileAssetLoaderAssetLoaderFrom = companion2.assetLoaderFrom(string2, applicationContext);
            boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveShouldLoadCDNAssets, true);
            setTouchPassThrough(typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveTouchPassThrough, false));
            int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveAlignment, alignmentIndexDefault);
            int integer2 = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveFit, fitIndexDefault);
            int integer3 = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveLoop, loopIndexDefault);
            boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveAutoPlay, getDefaultAutoplay());
            boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveAutoBind, false);
            boolean z14 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveTraceAnimations, false);
            String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveArtboard);
            String string4 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveAnimation);
            String string5 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveStateMachine);
            int integer4 = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveRenderer, rendererIndexDefault);
            Context applicationContext2 = context.getApplicationContext();
            m.c(applicationContext2);
            RendererAttributes rendererAttributes = new RendererAttributes(integer, integer2, integer3, integer4, z12, z13, z14, string3, string4, string5, resourceTypeMakeMaybeResource, new FallbackAssetLoader(applicationContext2, z11, fileAssetLoaderAssetLoaderFrom));
            this.rendererAttributes = rendererAttributes;
            this.controller = new RiveFileController(rendererAttributes.getLoop(), rendererAttributes.getAutoplay(), null, null, null, 28, null);
            LifecycleOwner lifecycleOwner = this.lifecycleOwner;
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.addObserver(getLifecycleObserver());
            }
            if (resourceTypeMakeMaybeResource != null) {
                loadFileFromResource(new RiveAnimationView$1$1$1(this));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ void pause$default(RiveAnimationView riveAnimationView, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        riveAnimationView.pause(str, z11);
    }

    public static /* synthetic */ void stop$default(RiveAnimationView riveAnimationView, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        riveAnimationView.stop(str, z11);
    }

    public final String getTextRunValue(String textRunName, String path) {
        m.f(textRunName, "textRunName");
        m.f(path, "path");
        return this.controller.getTextRunValue(textRunName, path);
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void registerListener(RiveFileController.Listener listener) {
        m.f(listener, "listener");
        this.controller.registerListener(listener);
    }

    public final void setBooleanState(String stateMachineName, String str, boolean z11) {
        m.f(stateMachineName, "stateMachineName");
        m.f(str, MzwEyWCkjXL.ooyEuQggkF);
        RiveFileController.setBooleanState$default(this.controller, stateMachineName, str, z11, null, 8, null);
    }

    public final void setTextRunValue(String textRunName, String textValue, String path) {
        m.f(textRunName, "textRunName");
        m.f(textValue, "textValue");
        m.f(path, "path");
        this.controller.setTextRunValue(textRunName, textValue, path);
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void unregisterListener(RiveFileController.Listener listener) {
        m.f(listener, "listener");
        this.controller.unregisterListener(listener);
    }

    public final void stop(List<String> animationNames, boolean z11) {
        m.f(animationNames, "animationNames");
        this.controller.stopAnimations(animationNames, z11);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, List list, Loop loop, Direction direction, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i11 & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i11 & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i11 & 16) != 0) {
            z12 = true;
        }
        riveAnimationView.play((List<String>) list, loop2, direction2, z13, z12);
    }

    public final void pause(List<String> animationNames, boolean z11) {
        m.f(animationNames, "animationNames");
        this.controller.pause(animationNames, z11);
    }

    public final void play(List<String> animationNames, Loop loop, Direction direction, boolean z11, boolean z12) {
        m.f(animationNames, "animationNames");
        m.f(loop, "loop");
        m.f(direction, "direction");
        this.rendererAttributes.setLoop(loop);
        this.controller.play(animationNames, loop, direction, z11, z12);
    }

    public final void stop(String animationName, boolean z11) {
        m.f(animationName, "animationName");
        this.controller.stopAnimations(animationName, z11);
    }

    public final void pause(String animationName, boolean z11) {
        m.f(animationName, "animationName");
        this.controller.pause(animationName, z11);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, String str, Loop loop, Direction direction, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i11 & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i11 & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i11 & 16) != 0) {
            z12 = true;
        }
        riveAnimationView.play(str, loop2, direction2, z13, z12);
    }

    public final void play(String animationName, Loop loop, Direction direction, boolean z11, boolean z12) {
        m.f(animationName, "animationName");
        m.f(loop, "loop");
        m.f(direction, "direction");
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setAnimationName(z11 ? null : animationName);
        rendererAttributes.setStateMachineName(z11 ? animationName : null);
        rendererAttributes.setLoop(loop);
        this.controller.play(animationName, loop, direction, z11, z12);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RendererAttributes {
        private Alignment alignment;
        private String animationName;
        private String artboardName;
        private FileAssetLoader assetLoader;
        private boolean autoBind;
        private boolean autoplay;
        private Fit fit;
        private Loop loop;
        private RendererType rendererType;
        private ResourceType resource;
        private boolean riveTraceAnimations;
        private String stateMachineName;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final FileAssetLoader assetLoaderFrom(String str, Context context) {
                Constructor<?> constructor;
                Constructor<?> constructor2;
                Object objNewInstance;
                Object objNewInstance2;
                m.f(context, "context");
                if (str != null && str.length() != 0) {
                    try {
                        Class<?> cls = Class.forName(str);
                        Constructor<?>[] constructors = cls.getConstructors();
                        m.e(constructors, "getConstructors(...)");
                        int length = constructors.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                constructor = null;
                                break;
                            }
                            constructor = constructors[i12];
                            if (constructor.getParameterTypes().length == 1 && m.a(constructor.getParameterTypes()[0], Context.class)) {
                                break;
                            }
                            i12++;
                        }
                        if (constructor != null && (objNewInstance2 = constructor.newInstance(context.getApplicationContext())) != null && (objNewInstance2 instanceof ContextAssetLoader)) {
                            return (FileAssetLoader) objNewInstance2;
                        }
                        Constructor<?>[] constructors2 = cls.getConstructors();
                        m.e(constructors2, "getConstructors(...)");
                        int length2 = constructors2.length;
                        while (true) {
                            if (i11 >= length2) {
                                constructor2 = null;
                                break;
                            }
                            constructor2 = constructors2[i11];
                            Class<?>[] parameterTypes = constructor2.getParameterTypes();
                            m.e(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0) {
                                break;
                            }
                            i11++;
                        }
                        if (constructor2 != null && (objNewInstance = constructor2.newInstance(null)) != null && (objNewInstance instanceof FileAssetLoader)) {
                            return (FileAssetLoader) objNewInstance;
                        }
                    } catch (Exception unused) {
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        public RendererAttributes(int i11, int i12, int i13, int i14, boolean z11, boolean z12, boolean z13, String str, String str2, String str3, ResourceType resourceType, FileAssetLoader fileAssetLoader) {
            this.autoplay = z11;
            this.autoBind = z12;
            this.riveTraceAnimations = z13;
            this.artboardName = str;
            this.animationName = str2;
            this.stateMachineName = str3;
            this.resource = resourceType;
            this.assetLoader = fileAssetLoader;
            this.alignment = Alignment.Companion.fromIndex(i11);
            this.fit = Fit.Companion.fromIndex(i12);
            this.loop = Loop.Companion.fromIndex(i13);
            this.rendererType = RendererType.Companion.fromIndex(i14);
        }

        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final String getAnimationName() {
            return this.animationName;
        }

        public final String getArtboardName() {
            return this.artboardName;
        }

        public final FileAssetLoader getAssetLoader() {
            return this.assetLoader;
        }

        public final boolean getAutoBind() {
            return this.autoBind;
        }

        public final boolean getAutoplay() {
            return this.autoplay;
        }

        public final Fit getFit() {
            return this.fit;
        }

        public final Loop getLoop() {
            return this.loop;
        }

        public final RendererType getRendererType() {
            return this.rendererType;
        }

        public final ResourceType getResource() {
            return this.resource;
        }

        public final boolean getRiveTraceAnimations() {
            return this.riveTraceAnimations;
        }

        public final String getStateMachineName() {
            return this.stateMachineName;
        }

        public final void setAlignment(Alignment alignment) {
            m.f(alignment, "<set-?>");
            this.alignment = alignment;
        }

        public final void setAnimationName(String str) {
            this.animationName = str;
        }

        public final void setArtboardName(String str) {
            this.artboardName = str;
        }

        public final void setAssetLoader(FileAssetLoader fileAssetLoader) {
            this.assetLoader = fileAssetLoader;
        }

        public final void setAutoBind(boolean z11) {
            this.autoBind = z11;
        }

        public final void setAutoplay(boolean z11) {
            this.autoplay = z11;
        }

        public final void setFit(Fit fit) {
            m.f(fit, "<set-?>");
            this.fit = fit;
        }

        public final void setLoop(Loop loop) {
            m.f(loop, "<set-?>");
            this.loop = loop;
        }

        public final void setRendererType(RendererType rendererType) {
            m.f(rendererType, "<set-?>");
            this.rendererType = rendererType;
        }

        public final void setResource(ResourceType resourceType) {
            this.resource = resourceType;
        }

        public final void setRiveTraceAnimations(boolean z11) {
            this.riveTraceAnimations = z11;
        }

        public final void setStateMachineName(String str) {
            this.stateMachineName = str;
        }

        public /* synthetic */ RendererAttributes(int i11, int i12, int i13, int i14, boolean z11, boolean z12, boolean z13, String str, String str2, String str3, ResourceType resourceType, FileAssetLoader fileAssetLoader, int i15, f fVar) {
            this((i15 & 1) != 0 ? RiveAnimationView.Companion.getAlignmentIndexDefault() : i11, (i15 & 2) != 0 ? RiveAnimationView.Companion.getFitIndexDefault() : i12, (i15 & 4) != 0 ? RiveAnimationView.Companion.getLoopIndexDefault() : i13, (i15 & 8) != 0 ? RiveAnimationView.Companion.getRendererIndexDefault() : i14, z11, (i15 & 32) != 0 ? false : z12, (i15 & 64) != 0 ? false : z13, str, str2, str3, resourceType, (i15 & 2048) != 0 ? null : fileAssetLoader);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RiveAnimationView(Builder builder) {
        this(builder.getContext$kotlin_release(), null, 2, 0 == true ? 1 : 0);
        m.f(builder, "builder");
        if (getArtboardRenderer() == null) {
            RendererAttributes rendererAttributes = this.rendererAttributes;
            RendererType rendererType$kotlin_release = builder.getRendererType$kotlin_release();
            rendererAttributes.setRendererType(rendererType$kotlin_release == null ? RendererType.Companion.fromIndex(rendererIndexDefault) : rendererType$kotlin_release);
            Boolean autoplay$kotlin_release = builder.getAutoplay$kotlin_release();
            rendererAttributes.setAutoplay(autoplay$kotlin_release != null ? autoplay$kotlin_release.booleanValue() : getDefaultAutoplay());
            rendererAttributes.setAutoBind(builder.getAutoBind$kotlin_release());
            Boolean traceAnimations$kotlin_release = builder.getTraceAnimations$kotlin_release();
            rendererAttributes.setRiveTraceAnimations(traceAnimations$kotlin_release != null ? traceAnimations$kotlin_release.booleanValue() : false);
            rendererAttributes.setArtboardName(builder.getArtboardName$kotlin_release());
            rendererAttributes.setAnimationName(builder.getAnimationName$kotlin_release());
            rendererAttributes.setStateMachineName(builder.getStateMachineName$kotlin_release());
            rendererAttributes.setResource(builder.getResourceType$kotlin_release());
            FileAssetLoader assetLoader = rendererAttributes.getAssetLoader();
            m.d(assetLoader, "null cannot be cast to non-null type app.rive.runtime.kotlin.core.FallbackAssetLoader");
            ((FallbackAssetLoader) assetLoader).resetWith$kotlin_release(builder);
            Alignment alignment$kotlin_release = builder.getAlignment$kotlin_release();
            rendererAttributes.setAlignment(alignment$kotlin_release == null ? rendererAttributes.getAlignment() : alignment$kotlin_release);
            Fit fit$kotlin_release = builder.getFit$kotlin_release();
            rendererAttributes.setFit(fit$kotlin_release == null ? rendererAttributes.getFit() : fit$kotlin_release);
            Loop loop$kotlin_release = builder.getLoop$kotlin_release();
            rendererAttributes.setLoop(loop$kotlin_release == null ? rendererAttributes.getLoop() : loop$kotlin_release);
            setTouchPassThrough(builder.getTouchPassThrough$kotlin_release());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
