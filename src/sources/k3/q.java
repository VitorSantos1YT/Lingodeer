package k3;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f37888a;

    public final Canvas a() {
        Canvas canvas = this.f37888a;
        if (canvas != null) {
            return canvas;
        }
        p3.a.d("Text drawing wrapper is missing a Canvas!");
        throw new KotlinNothingValueException();
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        return e.a(a(), path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        return e.e(a(), rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op2) {
        return a().clipPath(path, op2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op2) {
        return a().clipRect(rectF, op2);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        a().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        f.a(a());
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i11, int i12, int i13, int i14) {
        a().drawARGB(i11, i12, i13, i14);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f5, float f11, boolean z11, Paint paint) {
        a().drawArc(rectF, f5, f11, z11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f5, float f11, Paint paint) {
        a().drawBitmap(bitmap, f5, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i11, int i12, float[] fArr, int i13, int[] iArr, int i14, Paint paint) {
        a().drawBitmapMesh(bitmap, i11, i12, fArr, i13, iArr, i14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f5, float f11, float f12, Paint paint) {
        a().drawCircle(f5, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i11) {
        a().drawColor(i11);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f5, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        f.e(a(), rectF, f5, f11, rectF2, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i11, float[] fArr, int i12, int i13, Font font, Paint paint) {
        h.a(a(), iArr, i11, fArr, i12, i13, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f5, float f11, float f12, float f13, Paint paint) {
        a().drawLine(f5, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i11, int i12, Paint paint) {
        a().drawLines(fArr, i11, i12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        a().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        a().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        h.b(a(), ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        a().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        a().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f5, float f11, Paint paint) {
        a().drawPoint(f5, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i11, int i12, Paint paint) {
        a().drawPoints(fArr, i11, i12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i11, int i12, float[] fArr, Paint paint) {
        a().drawPosText(cArr, i11, i12, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i11, int i12, int i13) {
        a().drawRGB(i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        a().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        f.g(a(), renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f5, float f11, Paint paint) {
        a().drawRoundRect(rectF, f5, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i11, int i12, float f5, float f11, Paint paint) {
        a().drawText(cArr, i11, i12, f5, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i11, int i12, Path path, float f5, float f11, Paint paint) {
        a().drawTextOnPath(cArr, i11, i12, path, f5, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i11, int i12, int i13, int i14, float f5, float f11, boolean z11, Paint paint) {
        a().drawTextRun(cArr, i11, i12, i13, i14, f5, f11, z11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i11, float[] fArr, int i12, float[] fArr2, int i13, int[] iArr, int i14, short[] sArr, int i15, int i16, Paint paint) {
        a().drawVertices(vertexMode, i11, fArr, i12, fArr2, i13, iArr, i14, sArr, i15, i16, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        f.i(a());
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        boolean clipBounds = a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return a().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return a().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return a().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        a().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return a().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return a().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return a().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return a().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return a().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return a().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        a().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i11) {
        a().restoreToCount(i11);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f5) {
        a().rotate(f5);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return a().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i11) {
        return a().saveLayer(rectF, paint, i11);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i11, int i12) {
        return a().saveLayerAlpha(rectF, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f5, float f11) {
        a().scale(f5, f11);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        a().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i11) {
        a().setDensity(i11);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        a().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        a().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f5, float f11) {
        a().skew(f5, f11);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f5, float f11) {
        a().translate(f5, f11);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        return e.d(a(), rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        return a().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op2) {
        return a().clipRect(rect, op2);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f5, float f11, float f12, float f13, float f14, float f15, boolean z11, Paint paint) {
        a().drawArc(f5, f11, f12, f13, f14, f15, z11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        a().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j11) {
        f.c(a(), j11);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        a().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f5, float f11, float f12, float f13, Paint paint) {
        a().drawOval(f5, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        h.c(a(), ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        a().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        a().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        a().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        a().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f5, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        a().drawRoundRect(f5, f11, f12, f13, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f5, float f11, Paint paint) {
        a().drawText(str, f5, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f5, float f11, Paint paint) {
        a().drawTextOnPath(str, path, f5, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        return g.c(a(), rectF);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        return a().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i11) {
        return a().saveLayerAlpha(rectF, i11);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f5, float f11, float f12, float f13) {
        return e.b(a(), f5, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        return a().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        a().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i11, PorterDuff.Mode mode) {
        a().drawColor(i11, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        f.f(a(), rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        a().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f5, float f11, float f12, float f13, Paint paint) {
        a().drawRect(f5, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i11, int i12, float f5, float f11, Paint paint) {
        a().drawText(str, i11, i12, f5, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i11, int i12, int i13, int i14, float f5, float f11, boolean z11, Paint paint) {
        a().drawTextRun(charSequence, i11, i12, i13, i14, f5, f11, z11, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return a().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f5, float f11, float f12, float f13, Paint paint, int i11) {
        return a().saveLayer(f5, f11, f12, f13, paint, i11);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f5, float f11, float f12, float f13, int i11, int i12) {
        return a().saveLayerAlpha(f5, f11, f12, f13, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i11, int i12, int i13, int i14) {
        return e.c(a(), i11, i12, i13, i14);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        return a().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i11, int i12, float f5, float f11, int i13, int i14, boolean z11, Paint paint) {
        a().drawBitmap(iArr, i11, i12, f5, f11, i13, i14, z11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i11, BlendMode blendMode) {
        f.b(a(), i11, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i11, int i12, float f5, float f11, Paint paint) {
        a().drawText(charSequence, i11, i12, f5, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        return g.b(a(), path);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f5, float f11, float f12, float f13, Paint paint) {
        return a().saveLayer(f5, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f5, float f11, float f12, float f13, int i11) {
        return a().saveLayerAlpha(f5, f11, f12, f13, i11);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f5, float f11, float f12, float f13, Region.Op op2) {
        return a().clipRect(f5, f11, f12, f13, op2);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, Paint paint) {
        a().drawBitmap(iArr, i11, i12, i13, i14, i15, i16, z11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j11, BlendMode blendMode) {
        f.d(a(), j11, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i11, int i12, int i13, int i14, float f5, float f11, boolean z11, Paint paint) {
        f.h(a(), measuredText, i11, i12, i13, i14, f5, f11, z11, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f5, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        return a().quickReject(f5, f11, f12, f13, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f5, float f11, float f12, float f13) {
        return a().clipRect(f5, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        a().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f5, float f11, float f12, float f13) {
        return g.a(a(), f5, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i11, int i12, int i13, int i14) {
        return a().clipRect(i11, i12, i13, i14);
    }
}
