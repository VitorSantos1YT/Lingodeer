package k3;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static void a(Canvas canvas) {
        canvas.disableZ();
    }

    public static void b(Canvas canvas, int i11, BlendMode blendMode) {
        canvas.drawColor(i11, blendMode);
    }

    public static void c(Canvas canvas, long j11) {
        canvas.drawColor(j11);
    }

    public static void d(Canvas canvas, long j11, BlendMode blendMode) {
        canvas.drawColor(j11, blendMode);
    }

    public static void e(Canvas canvas, RectF rectF, float f5, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f5, f11, rectF2, f12, f13, paint);
    }

    public static void f(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void g(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void h(Canvas canvas, MeasuredText measuredText, int i11, int i12, int i13, int i14, float f5, float f11, boolean z11, Paint paint) {
        canvas.drawTextRun(measuredText, i11, i12, i13, i14, f5, f11, z11, paint);
    }

    public static void i(Canvas canvas) {
        canvas.enableZ();
    }

    public static final void j(Paint paint, CharSequence charSequence, int i11, int i12, Rect rect) {
        paint.getTextBounds(charSequence, i11, i12, rect);
    }
}
