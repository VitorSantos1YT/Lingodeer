package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.yalantis.ucrop.view.CropImageView;
import i4.a;
import i4.c;
import j4.t;
import jh.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {
    public Path H;
    public ViewOutlineProvider K;
    public RectF L;
    public final Drawable[] M;
    public LayerDrawable N;
    public boolean O;
    public Drawable P;
    public Drawable Q;
    public float R;
    public float S;
    public float T;
    public float U;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f1300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1302f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f1303t;

    public ImageFilterButton(Context context) {
        super(context);
        this.f1300d = new c();
        this.f1301e = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1302f = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1303t = Float.NaN;
        this.M = new Drawable[2];
        this.O = true;
        this.P = null;
        this.Q = null;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        a(context, null);
    }

    private void setOverlay(boolean z11) {
        this.O = z11;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f36035j);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.P = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 4) {
                    this.f1301e = typedArrayObtainStyledAttributes.getFloat(index, CropImageView.DEFAULT_ASPECT_RATIO);
                } else if (index == 13) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, CropImageView.DEFAULT_ASPECT_RATIO));
                } else if (index == 12) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, CropImageView.DEFAULT_ASPECT_RATIO));
                } else if (index == 3) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, CropImageView.DEFAULT_ASPECT_RATIO));
                } else if (index == 10) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, CropImageView.DEFAULT_ASPECT_RATIO));
                } else if (index == 11) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, CropImageView.DEFAULT_ASPECT_RATIO));
                } else if (index == 9) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.O));
                } else if (index == 5) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.R));
                } else if (index == 6) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.S));
                } else if (index == 7) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.U));
                } else if (index == 8) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.T));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.Q = drawable;
            Drawable drawable2 = this.P;
            Drawable[] drawableArr = this.M;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.Q = drawable3;
                if (drawable3 != null) {
                    Drawable drawableMutate = drawable3.mutate();
                    this.Q = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.Q = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.P.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.N = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f1301e * 255.0f));
            if (!this.O) {
                this.N.getDrawable(0).setAlpha((int) ((1.0f - this.f1301e) * 255.0f));
            }
            super.setImageDrawable(this.N);
        }
    }

    public final void b() {
        if (Float.isNaN(this.R) && Float.isNaN(this.S) && Float.isNaN(this.T) && Float.isNaN(this.U)) {
            return;
        }
        boolean zIsNaN = Float.isNaN(this.R);
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        float f11 = zIsNaN ? 0.0f : this.R;
        float f12 = Float.isNaN(this.S) ? 0.0f : this.S;
        float f13 = Float.isNaN(this.T) ? 1.0f : this.T;
        if (!Float.isNaN(this.U)) {
            f5 = this.U;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f14 = f13 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f14, f14);
        float f15 = intrinsicWidth * f14;
        float f16 = f14 * intrinsicHeight;
        matrix.postTranslate(((((width - f15) * f11) + width) - f15) * 0.5f, ((((height - f16) * f12) + height) - f16) * 0.5f);
        matrix.postRotate(f5, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void c() {
        if (Float.isNaN(this.R) && Float.isNaN(this.S) && Float.isNaN(this.T) && Float.isNaN(this.U)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            b();
        }
    }

    public float getContrast() {
        return this.f1300d.f34141f;
    }

    public float getCrossfade() {
        return this.f1301e;
    }

    public float getImagePanX() {
        return this.R;
    }

    public float getImagePanY() {
        return this.S;
    }

    public float getImageRotate() {
        return this.U;
    }

    public float getImageZoom() {
        return this.T;
    }

    public float getRound() {
        return this.f1303t;
    }

    public float getRoundPercent() {
        return this.f1302f;
    }

    public float getSaturation() {
        return this.f1300d.f34140e;
    }

    public float getWarmth() {
        return this.f1300d.f34142g;
    }

    @Override // android.view.View
    public final void layout(int i11, int i12, int i13, int i14) {
        super.layout(i11, i12, i13, i14);
        b();
    }

    public void setAltImageResource(int i11) {
        Drawable drawableMutate = h.k(getContext(), i11).mutate();
        this.P = drawableMutate;
        Drawable drawable = this.Q;
        Drawable[] drawableArr = this.M;
        drawableArr[0] = drawable;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.N = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f1301e);
    }

    public void setBrightness(float f5) {
        c cVar = this.f1300d;
        cVar.f34139d = f5;
        cVar.a(this);
    }

    public void setContrast(float f5) {
        c cVar = this.f1300d;
        cVar.f34141f = f5;
        cVar.a(this);
    }

    public void setCrossfade(float f5) {
        this.f1301e = f5;
        if (this.M != null) {
            if (!this.O) {
                this.N.getDrawable(0).setAlpha((int) ((1.0f - this.f1301e) * 255.0f));
            }
            this.N.getDrawable(1).setAlpha((int) (this.f1301e * 255.0f));
            super.setImageDrawable(this.N);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.P == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.Q = drawableMutate;
        Drawable[] drawableArr = this.M;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.P;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.N = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f1301e);
    }

    public void setImagePanX(float f5) {
        this.R = f5;
        c();
    }

    public void setImagePanY(float f5) {
        this.S = f5;
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i11) {
        if (this.P == null) {
            super.setImageResource(i11);
            return;
        }
        Drawable drawableMutate = h.k(getContext(), i11).mutate();
        this.Q = drawableMutate;
        Drawable[] drawableArr = this.M;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.P;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.N = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f1301e);
    }

    public void setImageRotate(float f5) {
        this.U = f5;
        c();
    }

    public void setImageZoom(float f5) {
        this.T = f5;
        c();
    }

    public void setRound(float f5) {
        if (Float.isNaN(f5)) {
            this.f1303t = f5;
            float f11 = this.f1302f;
            this.f1302f = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z11 = this.f1303t != f5;
        this.f1303t = f5;
        if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
            if (this.H == null) {
                this.H = new Path();
            }
            if (this.L == null) {
                this.L = new RectF();
            }
            if (this.K == null) {
                a aVar = new a(this, 1);
                this.K = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            this.L.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, getWidth(), getHeight());
            this.H.reset();
            Path path = this.H;
            RectF rectF = this.L;
            float f12 = this.f1303t;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f5) {
        boolean z11 = this.f1302f != f5;
        this.f1302f = f5;
        if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
            if (this.H == null) {
                this.H = new Path();
            }
            if (this.L == null) {
                this.L = new RectF();
            }
            if (this.K == null) {
                a aVar = new a(this, 0);
                this.K = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f1302f) / 2.0f;
            this.L.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, width, height);
            this.H.reset();
            this.H.addRoundRect(this.L, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f5) {
        c cVar = this.f1300d;
        cVar.f34140e = f5;
        cVar.a(this);
    }

    public void setWarmth(float f5) {
        c cVar = this.f1300d;
        cVar.f34142g = f5;
        cVar.a(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1300d = new c();
        this.f1301e = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1302f = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1303t = Float.NaN;
        this.M = new Drawable[2];
        this.O = true;
        this.P = null;
        this.Q = null;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        a(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1300d = new c();
        this.f1301e = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1302f = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1303t = Float.NaN;
        this.M = new Drawable[2];
        this.O = true;
        this.P = null;
        this.Q = null;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        a(context, attributeSet);
    }
}
