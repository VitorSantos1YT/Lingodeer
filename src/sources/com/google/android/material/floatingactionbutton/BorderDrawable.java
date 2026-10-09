package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.yalantis.ucrop.view.CropImageView;
import r4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class BorderDrawable extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f14473b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14483l;
    public int m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ShapeAppearanceModel f14485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f14486p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShapeAppearancePathProvider f14472a = ShapeAppearancePathProvider.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f14474c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f14475d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f14476e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f14477f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BorderState f14478g = new BorderState();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14484n = true;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class BorderState extends Drawable.ConstantState {
        public BorderState() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return BorderDrawable.this;
        }
    }

    public BorderDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        this.f14485o = shapeAppearanceModel;
        Paint paint = new Paint(1);
        this.f14473b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z11 = this.f14484n;
        Rect rect = this.f14475d;
        Paint paint = this.f14473b;
        if (z11) {
            copyBounds(rect);
            float fHeight = this.f14479h / rect.height();
            paint.setShader(new LinearGradient(CropImageView.DEFAULT_ASPECT_RATIO, rect.top, CropImageView.DEFAULT_ASPECT_RATIO, rect.bottom, new int[]{c.c(this.f14480i, this.m), c.c(this.f14481j, this.m), c.c(c.e(this.f14481j, 0), this.m), c.c(c.e(this.f14483l, 0), this.m), c.c(this.f14483l, this.m), c.c(this.f14482k, this.m)}, new float[]{CropImageView.DEFAULT_ASPECT_RATIO, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f14484n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f14476e;
        rectF.set(rect);
        CornerSize cornerSize = this.f14485o.f15249e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f14477f;
        rectF2.set(bounds);
        float fMin = Math.min(cornerSize.a(rectF2), rectF.width() / 2.0f);
        ShapeAppearanceModel shapeAppearanceModel = this.f14485o;
        rectF2.set(getBounds());
        if (shapeAppearanceModel.g(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f14478g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f14479h > CropImageView.DEFAULT_ASPECT_RATIO ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ShapeAppearanceModel shapeAppearanceModel = this.f14485o;
        Rect bounds = getBounds();
        RectF rectF = this.f14477f;
        rectF.set(bounds);
        if (shapeAppearanceModel.g(rectF)) {
            CornerSize cornerSize = this.f14485o.f15249e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), cornerSize.a(rectF));
            return;
        }
        Rect rect = this.f14475d;
        copyBounds(rect);
        RectF rectF2 = this.f14476e;
        rectF2.set(rect);
        ShapeAppearancePathProvider shapeAppearancePathProvider = this.f14472a;
        ShapeAppearanceModel shapeAppearanceModel2 = this.f14485o;
        Path path = this.f14474c;
        shapeAppearancePathProvider.a(shapeAppearanceModel2, rectF2, path);
        DrawableUtils.e(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        ShapeAppearanceModel shapeAppearanceModel = this.f14485o;
        Rect bounds = getBounds();
        RectF rectF = this.f14477f;
        rectF.set(bounds);
        if (!shapeAppearanceModel.g(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f14479h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f14486p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f14484n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f14486p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.m)) != this.m) {
            this.f14484n = true;
            this.m = colorForState;
        }
        if (this.f14484n) {
            invalidateSelf();
        }
        return this.f14484n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f14473b.setAlpha(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f14473b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
