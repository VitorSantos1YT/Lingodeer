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
import androidx.appcompat.widget.AppCompatImageView;
import com.yalantis.ucrop.view.CropImageView;
import i4.b;
import i4.c;
import j4.t;
import jh.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {
    public Path H;
    public ViewOutlineProvider K;
    public RectF L;
    public final Drawable[] M;
    public LayerDrawable N;
    public float O;
    public float P;
    public float Q;
    public float R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f1304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f1306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f1307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1309f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f1310t;

    public ImageFilterView(Context context) {
        super(context);
        this.f1304a = new c();
        this.f1305b = true;
        this.f1306c = null;
        this.f1307d = null;
        this.f1308e = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1309f = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1310t = Float.NaN;
        this.M = new Drawable[2];
        this.O = Float.NaN;
        this.P = Float.NaN;
        this.Q = Float.NaN;
        this.R = Float.NaN;
    }

    private void setOverlay(boolean z11) {
        this.f1305b = z11;
    }

    public final void c(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f36035j);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f1306c = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 4) {
                    this.f1308e = typedArrayObtainStyledAttributes.getFloat(index, CropImageView.DEFAULT_ASPECT_RATIO);
                } else if (index == 13) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, CropImageView.DEFAULT_ASPECT_RATIO));
                } else if (index == 12) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, CropImageView.DEFAULT_ASPECT_RATIO));
                } else if (index == 3) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, CropImageView.DEFAULT_ASPECT_RATIO));
                } else if (index == 2) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, CropImageView.DEFAULT_ASPECT_RATIO));
                } else if (index == 10) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, CropImageView.DEFAULT_ASPECT_RATIO));
                } else if (index == 11) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, CropImageView.DEFAULT_ASPECT_RATIO));
                } else if (index == 9) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f1305b));
                } else if (index == 5) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.O));
                } else if (index == 6) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.P));
                } else if (index == 7) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.R));
                } else if (index == 8) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.Q));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f1307d = drawable;
            Drawable drawable2 = this.f1306c;
            Drawable[] drawableArr = this.M;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.f1307d = drawable3;
                if (drawable3 != null) {
                    Drawable drawableMutate = drawable3.mutate();
                    this.f1307d = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f1307d = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.f1306c.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.N = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f1308e * 255.0f));
            if (!this.f1305b) {
                this.N.getDrawable(0).setAlpha((int) ((1.0f - this.f1308e) * 255.0f));
            }
            super.setImageDrawable(this.N);
        }
    }

    public final void d() {
        if (Float.isNaN(this.O) && Float.isNaN(this.P) && Float.isNaN(this.Q) && Float.isNaN(this.R)) {
            return;
        }
        boolean zIsNaN = Float.isNaN(this.O);
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        float f11 = zIsNaN ? 0.0f : this.O;
        float f12 = Float.isNaN(this.P) ? 0.0f : this.P;
        float f13 = Float.isNaN(this.Q) ? 1.0f : this.Q;
        if (!Float.isNaN(this.R)) {
            f5 = this.R;
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

    public final void e() {
        if (Float.isNaN(this.O) && Float.isNaN(this.P) && Float.isNaN(this.Q) && Float.isNaN(this.R)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            d();
        }
    }

    public float getBrightness() {
        return this.f1304a.f34139d;
    }

    public float getContrast() {
        return this.f1304a.f34141f;
    }

    public float getCrossfade() {
        return this.f1308e;
    }

    public float getImagePanX() {
        return this.O;
    }

    public float getImagePanY() {
        return this.P;
    }

    public float getImageRotate() {
        return this.R;
    }

    public float getImageZoom() {
        return this.Q;
    }

    public float getRound() {
        return this.f1310t;
    }

    public float getRoundPercent() {
        return this.f1309f;
    }

    public float getSaturation() {
        return this.f1304a.f34140e;
    }

    public float getWarmth() {
        return this.f1304a.f34142g;
    }

    @Override // android.view.View
    public final void layout(int i11, int i12, int i13, int i14) {
        super.layout(i11, i12, i13, i14);
        d();
    }

    public void setAltImageDrawable(Drawable drawable) {
        Drawable drawableMutate = drawable.mutate();
        this.f1306c = drawableMutate;
        Drawable drawable2 = this.f1307d;
        Drawable[] drawableArr = this.M;
        drawableArr[0] = drawable2;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.N = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f1308e);
    }

    public void setAltImageResource(int i11) {
        Drawable drawableK = h.k(getContext(), i11);
        this.f1306c = drawableK;
        setAltImageDrawable(drawableK);
    }

    public void setBrightness(float f5) {
        c cVar = this.f1304a;
        cVar.f34139d = f5;
        cVar.a(this);
    }

    public void setContrast(float f5) {
        c cVar = this.f1304a;
        cVar.f34141f = f5;
        cVar.a(this);
    }

    public void setCrossfade(float f5) {
        this.f1308e = f5;
        if (this.M != null) {
            if (!this.f1305b) {
                this.N.getDrawable(0).setAlpha((int) ((1.0f - this.f1308e) * 255.0f));
            }
            this.N.getDrawable(1).setAlpha((int) (this.f1308e * 255.0f));
            super.setImageDrawable(this.N);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f1306c == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f1307d = drawableMutate;
        Drawable[] drawableArr = this.M;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f1306c;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.N = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f1308e);
    }

    public void setImagePanX(float f5) {
        this.O = f5;
        e();
    }

    public void setImagePanY(float f5) {
        this.P = f5;
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        if (this.f1306c == null) {
            super.setImageResource(i11);
            return;
        }
        Drawable drawableMutate = h.k(getContext(), i11).mutate();
        this.f1307d = drawableMutate;
        Drawable[] drawableArr = this.M;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f1306c;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.N = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f1308e);
    }

    public void setImageRotate(float f5) {
        this.R = f5;
        e();
    }

    public void setImageZoom(float f5) {
        this.Q = f5;
        e();
    }

    public void setRound(float f5) {
        if (Float.isNaN(f5)) {
            this.f1310t = f5;
            float f11 = this.f1309f;
            this.f1309f = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z11 = this.f1310t != f5;
        this.f1310t = f5;
        if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
            if (this.H == null) {
                this.H = new Path();
            }
            if (this.L == null) {
                this.L = new RectF();
            }
            if (this.K == null) {
                b bVar = new b(this, 1);
                this.K = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.L.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, getWidth(), getHeight());
            this.H.reset();
            Path path = this.H;
            RectF rectF = this.L;
            float f12 = this.f1310t;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f5) {
        boolean z11 = this.f1309f != f5;
        this.f1309f = f5;
        if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
            if (this.H == null) {
                this.H = new Path();
            }
            if (this.L == null) {
                this.L = new RectF();
            }
            if (this.K == null) {
                b bVar = new b(this, 0);
                this.K = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f1309f) / 2.0f;
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
        c cVar = this.f1304a;
        cVar.f34140e = f5;
        cVar.a(this);
    }

    public void setWarmth(float f5) {
        c cVar = this.f1304a;
        cVar.f34142g = f5;
        cVar.a(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1304a = new c();
        this.f1305b = true;
        this.f1306c = null;
        this.f1307d = null;
        this.f1308e = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1309f = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1310t = Float.NaN;
        this.M = new Drawable[2];
        this.O = Float.NaN;
        this.P = Float.NaN;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        c(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1304a = new c();
        this.f1305b = true;
        this.f1306c = null;
        this.f1307d = null;
        this.f1308e = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1309f = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1310t = Float.NaN;
        this.M = new Drawable[2];
        this.O = Float.NaN;
        this.P = Float.NaN;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        c(context, attributeSet);
    }
}
