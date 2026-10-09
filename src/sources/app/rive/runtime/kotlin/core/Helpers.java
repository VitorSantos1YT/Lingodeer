package app.rive.runtime.kotlin.core;

import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Helpers {
    public static final int $stable = 0;
    public static final Helpers INSTANCE = new Helpers();

    private Helpers() {
    }

    public static /* synthetic */ PointF convertToArtboardSpace$default(Helpers helpers, RectF rectF, PointF pointF, Fit fit, Alignment alignment, RectF rectF2, float f5, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            f5 = 1.0f;
        }
        return helpers.convertToArtboardSpace(rectF, pointF, fit, alignment, rectF2, f5);
    }

    private final native PointF cppConvertToArtboardSpace(RectF rectF, PointF pointF, Fit fit, Alignment alignment, RectF rectF2, float f5);

    public final PointF convertToArtboardSpace(RectF touchBounds, PointF touchLocation, Fit fit, Alignment alignment, RectF artboardBounds, float f5) {
        m.f(touchBounds, "touchBounds");
        m.f(touchLocation, "touchLocation");
        m.f(fit, "fit");
        m.f(alignment, "alignment");
        m.f(artboardBounds, "artboardBounds");
        return cppConvertToArtboardSpace(touchBounds, touchLocation, fit, alignment, artboardBounds, f5);
    }
}
