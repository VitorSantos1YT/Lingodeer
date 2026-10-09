package com.lingo.lingoskill.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.lingodeer.R;
import vh.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class QMUIRadiusImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Bitmap.Config f22119a0 = Bitmap.Config.ARGB_8888;
    public int H;
    public boolean K;
    public int L;
    public Paint M;
    public final Paint N;
    public ColorFilter O;
    public ColorFilter P;
    public BitmapShader Q;
    public boolean R;
    public final RectF S;
    public Bitmap T;
    public final Matrix U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22125f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22126t;

    public QMUIRadiusImageView(Context context) {
        this(context, null, R.attr.QMUIRadiusImageViewStyle);
    }

    private Bitmap getBitmap() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            boolean z11 = drawable instanceof ColorDrawable;
            Bitmap.Config config = f22119a0;
            Bitmap bitmapCreateBitmap = z11 ? Bitmap.createBitmap(2, 2, config) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), config);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final void c() {
        if (getBitmap() == this.T) {
            return;
        }
        Bitmap bitmap = getBitmap();
        this.T = bitmap;
        if (bitmap == null) {
            this.Q = null;
            invalidate();
            return;
        }
        this.R = true;
        Bitmap bitmap2 = this.T;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.Q = new BitmapShader(bitmap2, tileMode, tileMode);
        if (this.M == null) {
            Paint paint = new Paint();
            this.M = paint;
            paint.setAntiAlias(true);
        }
        this.M.setShader(this.Q);
        requestLayout();
        invalidate();
    }

    public int getBorderColor() {
        return this.f22124e;
    }

    public int getBorderWidth() {
        return this.f22123d;
    }

    public int getCornerRadius() {
        return this.L;
    }

    public int getSelectedBorderColor() {
        return this.f22126t;
    }

    public int getSelectedBorderWidth() {
        return this.f22125f;
    }

    public int getSelectedMaskColor() {
        return this.H;
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.f22120a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || this.T == null || this.Q == null) {
            return;
        }
        if (this.V != width || this.W != height || this.R) {
            this.V = width;
            this.W = height;
            Matrix matrix = this.U;
            matrix.reset();
            this.R = false;
            if (this.Q != null && (bitmap = this.T) != null) {
                float width2 = bitmap.getWidth();
                float height2 = this.T.getHeight();
                float fMax = Math.max(this.V / width2, this.W / height2);
                matrix.setScale(fMax, fMax);
                matrix.postTranslate((-((width2 * fMax) - this.V)) / 2.0f, (-((fMax * height2) - this.W)) / 2.0f);
                this.Q.setLocalMatrix(matrix);
                this.M.setShader(this.Q);
            }
        }
        int i11 = this.f22120a ? this.f22126t : this.f22124e;
        Paint paint = this.N;
        paint.setColor(i11);
        this.M.setColorFilter(this.f22120a ? this.P : this.O);
        int i12 = this.f22120a ? this.f22125f : this.f22123d;
        float f5 = i12;
        paint.setStrokeWidth(f5);
        float f11 = (f5 * 1.0f) / 2.0f;
        if (this.f22122c) {
            float width3 = getWidth() / 2;
            canvas.drawCircle(width3, width3, width3, this.M);
            if (i12 > 0) {
                canvas.drawCircle(width3, width3, width3 - f11, paint);
                return;
            }
            return;
        }
        RectF rectF = this.S;
        rectF.left = f11;
        rectF.top = f11;
        rectF.right = width - f11;
        rectF.bottom = height - f11;
        if (this.f22121b) {
            canvas.drawOval(rectF, this.M);
            if (i12 > 0) {
                canvas.drawOval(rectF, paint);
                return;
            }
            return;
        }
        float f12 = this.L;
        canvas.drawRoundRect(rectF, f12, f12, this.M);
        if (i12 > 0) {
            float f13 = this.L;
            canvas.drawRoundRect(rectF, f13, f13, paint);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f22122c) {
            int iMin = Math.min(measuredWidth, measuredHeight);
            setMeasuredDimension(iMin, iMin);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        Bitmap bitmap = this.T;
        if (bitmap == null) {
            return;
        }
        if (mode == Integer.MIN_VALUE || mode == 0 || mode2 == Integer.MIN_VALUE || mode2 == 0) {
            float width = bitmap.getWidth();
            float height = this.T.getHeight();
            float f5 = measuredWidth / width;
            float f11 = measuredHeight / height;
            if (f5 == f11) {
                return;
            }
            if (f5 < f11) {
                setMeasuredDimension(measuredWidth, (int) (height * f5));
            } else {
                setMeasuredDimension((int) (width * f11), measuredHeight);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            setSelected(false);
            return super.onTouchEvent(motionEvent);
        }
        if (!this.K) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setSelected(true);
        } else if (action == 1 || action == 3 || action == 4 || action == 8) {
            setSelected(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z11) {
        if (z11) {
            throw new IllegalArgumentException("不支持adjustViewBounds");
        }
    }

    public void setBorderColor(int i11) {
        if (this.f22124e != i11) {
            this.f22124e = i11;
            invalidate();
        }
    }

    public void setBorderWidth(int i11) {
        if (this.f22123d != i11) {
            this.f22123d = i11;
            invalidate();
        }
    }

    public void setCircle(boolean z11) {
        if (this.f22122c != z11) {
            this.f22122c = z11;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.O == colorFilter) {
            return;
        }
        this.O = colorFilter;
        if (this.f22120a) {
            return;
        }
        invalidate();
    }

    public void setCornerRadius(int i11) {
        if (this.L != i11) {
            this.L = i11;
            if (this.f22122c || this.f22121b) {
                return;
            }
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        super.setImageResource(i11);
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        c();
    }

    public void setOval(boolean z11) {
        boolean z12 = false;
        if (z11 && this.f22122c) {
            this.f22122c = false;
            z12 = true;
        }
        if (this.f22121b != z11 || z12) {
            this.f22121b = z11;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            super.setScaleType(scaleType);
        } else {
            throw new IllegalArgumentException("不支持ScaleType " + scaleType);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z11) {
        if (this.f22120a != z11) {
            this.f22120a = z11;
            invalidate();
        }
    }

    public void setSelectedBorderColor(int i11) {
        if (this.f22126t != i11) {
            this.f22126t = i11;
            if (this.f22120a) {
                invalidate();
            }
        }
    }

    public void setSelectedBorderWidth(int i11) {
        if (this.f22125f != i11) {
            this.f22125f = i11;
            if (this.f22120a) {
                invalidate();
            }
        }
    }

    public void setSelectedColorFilter(ColorFilter colorFilter) {
        if (this.P == colorFilter) {
            return;
        }
        this.P = colorFilter;
        if (this.f22120a) {
            invalidate();
        }
    }

    public void setSelectedMaskColor(int i11) {
        if (this.H != i11) {
            this.H = i11;
            if (i11 != 0) {
                this.P = new PorterDuffColorFilter(this.H, PorterDuff.Mode.DARKEN);
            } else {
                this.P = null;
            }
            if (this.f22120a) {
                invalidate();
            }
        }
        this.H = i11;
    }

    public void setTouchSelectModeEnabled(boolean z11) {
        this.K = z11;
    }

    public QMUIRadiusImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.QMUIRadiusImageViewStyle);
    }

    public QMUIRadiusImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f22120a = false;
        this.f22121b = false;
        this.f22122c = false;
        this.K = true;
        this.R = false;
        this.S = new RectF();
        Paint paint = new Paint();
        this.N = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.U = new Matrix();
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f54063d, i11, 0);
        this.f22123d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f22124e = typedArrayObtainStyledAttributes.getColor(0, -7829368);
        this.f22125f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, this.f22123d);
        this.f22126t = typedArrayObtainStyledAttributes.getColor(6, this.f22124e);
        int color = typedArrayObtainStyledAttributes.getColor(8, 0);
        this.H = color;
        if (color != 0) {
            this.P = new PorterDuffColorFilter(this.H, PorterDuff.Mode.DARKEN);
        }
        this.K = typedArrayObtainStyledAttributes.getBoolean(5, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.f22122c = z11;
        if (!z11) {
            this.f22121b = typedArrayObtainStyledAttributes.getBoolean(4, false);
        }
        if (!this.f22121b) {
            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
