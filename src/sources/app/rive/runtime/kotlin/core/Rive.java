package app.rive.runtime.kotlin.core;

import android.content.Context;
import android.graphics.RectF;
import app.rive.runtime.kotlin.fonts.FontHelper;
import app.rive.runtime.kotlin.fonts.Fonts;
import app.rive.runtime.kotlin.fonts.NativeFontHelper;
import bq.f;
import kotlin.jvm.internal.m;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Rive {
    private static final String RIVE_ANDROID = "rive-android";
    public static final Rive INSTANCE = new Rive();
    private static RendererType defaultRendererType = RendererType.Rive;
    public static final int $stable = 8;

    private Rive() {
    }

    public static /* synthetic */ RectF calculateRequiredBounds$default(Rive rive, Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f5, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            f5 = 1.0f;
        }
        return rive.calculateRequiredBounds(fit, alignment, rectF, rectF2, f5);
    }

    private final native void cppCalculateRequiredBounds(Fit fit, Alignment alignment, RectF rectF, RectF rectF2, RectF rectF3, float f5);

    private final native void cppInitialize();

    public static /* synthetic */ void init$default(Rive rive, Context context, RendererType rendererType, int i11, Object obj) throws Throwable {
        if ((i11 & 2) != 0) {
            rendererType = RendererType.Rive;
        }
        rive.init(context, rendererType);
    }

    public static /* synthetic */ boolean setFallbackFont$default(Rive rive, Fonts.FontOpts fontOpts, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fontOpts = null;
        }
        return rive.setFallbackFont(fontOpts);
    }

    public final RectF calculateRequiredBounds(Fit fit, Alignment alignment, RectF availableBounds, RectF artboardBounds, float f5) {
        m.f(fit, "fit");
        m.f(alignment, "alignment");
        m.f(availableBounds, "availableBounds");
        m.f(artboardBounds, "artboardBounds");
        RectF rectF = new RectF();
        cppCalculateRequiredBounds(fit, alignment, availableBounds, artboardBounds, rectF, f5);
        return rectF;
    }

    public final RendererType getDefaultRendererType() {
        return defaultRendererType;
    }

    public final void init(Context context, RendererType defaultRenderer) throws Throwable {
        m.f(context, "context");
        m.f(defaultRenderer, "defaultRenderer");
        f fVar = new f(22, false);
        fVar.f4943a = true;
        fVar.i(context, RIVE_ANDROID);
        defaultRendererType = defaultRenderer;
        initializeCppEnvironment();
    }

    public final void initializeCppEnvironment() {
        cppInitialize();
    }

    @c
    public final boolean setFallbackFont(byte[] byteArray) {
        m.f(byteArray, "byteArray");
        return NativeFontHelper.INSTANCE.cppRegisterFallbackFont(byteArray);
    }

    @c
    public final boolean setFallbackFont(Fonts.FontOpts fontOpts) {
        byte[] fallbackFontBytes = FontHelper.Companion.getFallbackFontBytes(fontOpts);
        if (fallbackFontBytes != null) {
            return NativeFontHelper.INSTANCE.cppRegisterFallbackFont(fallbackFontBytes);
        }
        return false;
    }
}
