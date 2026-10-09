package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import o4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ShapeableImageView extends AppCompatImageView implements Shapeable {
    public MaterialShapeDrawable H;
    public ShapeAppearanceModel K;
    public float L;
    public final Path M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public boolean T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShapeAppearancePathProvider f14580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f14581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f14582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f14583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f14584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f14585f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f14586t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class OutlineProvider extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f14587a = new Rect();

        public OutlineProvider() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.K == null) {
                return;
            }
            if (shapeableImageView.H == null) {
                shapeableImageView.H = new MaterialShapeDrawable(shapeableImageView.K);
            }
            RectF rectF = shapeableImageView.f14581b;
            Rect rect = this.f14587a;
            rectF.round(rect);
            shapeableImageView.H.setBounds(rect);
            shapeableImageView.H.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i11, int i12) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i11 - getPaddingRight();
        float paddingBottom = i12 - getPaddingBottom();
        RectF rectF = this.f14581b;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        ShapeAppearanceModel shapeAppearanceModel = this.K;
        ShapeAppearancePathProvider shapeAppearancePathProvider = this.f14580a;
        Path path = this.f14585f;
        shapeAppearancePathProvider.a(shapeAppearanceModel, rectF, path);
        Path path2 = this.M;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f14582c;
        rectF2.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, i11, i12);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.Q;
    }

    public final int getContentPaddingEnd() {
        int i11 = this.S;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        return c() ? this.N : this.P;
    }

    public int getContentPaddingLeft() {
        int i11 = this.S;
        int i12 = this.R;
        if (i12 != Integer.MIN_VALUE || i11 != Integer.MIN_VALUE) {
            if (c() && i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (!c() && i12 != Integer.MIN_VALUE) {
                return i12;
            }
        }
        return this.N;
    }

    public int getContentPaddingRight() {
        int i11 = this.S;
        int i12 = this.R;
        if (i12 != Integer.MIN_VALUE || i11 != Integer.MIN_VALUE) {
            if (c() && i12 != Integer.MIN_VALUE) {
                return i12;
            }
            if (!c() && i11 != Integer.MIN_VALUE) {
                return i11;
            }
        }
        return this.P;
    }

    public final int getContentPaddingStart() {
        int i11 = this.R;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        return c() ? this.P : this.N;
    }

    public int getContentPaddingTop() {
        return this.O;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.K;
    }

    public ColorStateList getStrokeColor() {
        return this.f14586t;
    }

    public float getStrokeWidth() {
        return this.L;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.M, this.f14584e);
        if (this.f14586t == null) {
            return;
        }
        float f5 = this.L;
        Paint paint = this.f14583d;
        paint.setStrokeWidth(f5);
        int colorForState = this.f14586t.getColorForState(getDrawableState(), this.f14586t.getDefaultColor());
        if (this.L <= CropImageView.DEFAULT_ASPECT_RATIO || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f14585f, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (!this.T && isLayoutDirectionResolved()) {
            this.T = true;
            if (!isPaddingRelative() && this.R == Integer.MIN_VALUE && this.S == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        d(i11, i12);
    }

    @Override // android.view.View
    public final void setPadding(int i11, int i12, int i13, int i14) {
        super.setPadding(getContentPaddingLeft() + i11, getContentPaddingTop() + i12, getContentPaddingRight() + i13, getContentPaddingBottom() + i14);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i11, int i12, int i13, int i14) {
        super.setPaddingRelative(getContentPaddingStart() + i11, getContentPaddingTop() + i12, getContentPaddingEnd() + i13, getContentPaddingBottom() + i14);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.K = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.H;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f14586t = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i11) {
        setStrokeColor(c.b(getContext(), i11));
    }

    public void setStrokeWidth(float f5) {
        if (this.L != f5) {
            this.L = f5;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i11) {
        setStrokeWidth(getResources().getDimensionPixelSize(i11));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i11);
        this.f14580a = ShapeAppearancePathProvider.c();
        this.f14585f = new Path();
        this.T = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f14584e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f14581b = new RectF();
        this.f14582c = new RectF();
        this.M = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f13734c0, i11, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f14586t = MaterialResources.a(context2, typedArrayObtainStyledAttributes, 9);
        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.N = dimensionPixelSize;
        this.O = dimensionPixelSize;
        this.P = dimensionPixelSize;
        this.Q = dimensionPixelSize;
        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f14583d = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.K = ShapeAppearanceModel.d(context2, attributeSet, i11, R.style.Widget_MaterialComponents_ShapeableImageView).a();
        setOutlineProvider(new OutlineProvider());
    }
}
