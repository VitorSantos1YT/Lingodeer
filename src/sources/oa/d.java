package oa;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable implements Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f44782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f44783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resources f44784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ValueAnimator f44785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f44786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44787f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final LinearInterpolator f44781t = new LinearInterpolator();
    public static final r6.a H = new r6.a(1);
    public static final int[] K = {-16777216};

    public d(Context context) {
        context.getClass();
        this.f44784c = context.getResources();
        c cVar = new c();
        this.f44782a = cVar;
        cVar.f44769i = K;
        cVar.a(0);
        cVar.f44768h = 2.5f;
        cVar.f44762b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(this, cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f44781t);
        valueAnimatorOfFloat.addListener(new b(this, cVar));
        this.f44785d = valueAnimatorOfFloat;
    }

    public static void d(float f5, c cVar) {
        if (f5 <= 0.75f) {
            cVar.f44780u = cVar.f44769i[cVar.f44770j];
            return;
        }
        float f11 = (f5 - 0.75f) / 0.25f;
        int[] iArr = cVar.f44769i;
        int i11 = cVar.f44770j;
        int i12 = iArr[i11];
        int i13 = iArr[(i11 + 1) % iArr.length];
        int i14 = (i12 >> 24) & 255;
        int i15 = (i12 >> 16) & 255;
        int i16 = (i12 >> 8) & 255;
        int i17 = i12 & 255;
        cVar.f44780u = ((i14 + ((int) ((((i13 >> 24) & 255) - i14) * f11))) << 24) | ((i15 + ((int) ((((i13 >> 16) & 255) - i15) * f11))) << 16) | ((i16 + ((int) ((((i13 >> 8) & 255) - i16) * f11))) << 8) | (i17 + ((int) (f11 * ((i13 & 255) - i17))));
    }

    public final void a(float f5, c cVar, boolean z11) {
        float interpolation;
        float interpolation2;
        if (this.f44787f) {
            d(f5, cVar);
            float fFloor = (float) (Math.floor(cVar.m / 0.8f) + 1.0d);
            float f11 = cVar.f44771k;
            float f12 = cVar.f44772l;
            cVar.f44765e = (((f12 - 0.01f) - f11) * f5) + f11;
            cVar.f44766f = f12;
            float f13 = cVar.m;
            cVar.f44767g = p0.a(fFloor, f13, f5, f13);
            return;
        }
        if (f5 != 1.0f || z11) {
            float f14 = cVar.m;
            r6.a aVar = H;
            if (f5 < 0.5f) {
                interpolation = cVar.f44771k;
                interpolation2 = (aVar.getInterpolation(f5 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f15 = cVar.f44771k + 0.79f;
                interpolation = f15 - (((1.0f - aVar.getInterpolation((f5 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f15;
            }
            float f16 = (0.20999998f * f5) + f14;
            float f17 = (f5 + this.f44786e) * 216.0f;
            cVar.f44765e = interpolation;
            cVar.f44766f = interpolation2;
            cVar.f44767g = f16;
            this.f44783b = f17;
        }
    }

    public final void b(float f5, float f11, float f12, float f13) {
        float f14 = this.f44784c.getDisplayMetrics().density;
        float f15 = f11 * f14;
        c cVar = this.f44782a;
        cVar.f44768h = f15;
        cVar.f44762b.setStrokeWidth(f15);
        cVar.f44776q = f5 * f14;
        cVar.a(0);
        cVar.f44777r = (int) (f12 * f14);
        cVar.f44778s = (int) (f13 * f14);
    }

    public final void c(int i11) {
        if (i11 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f44783b, bounds.exactCenterX(), bounds.exactCenterY());
        c cVar = this.f44782a;
        Paint paint = cVar.f44762b;
        RectF rectF = cVar.f44761a;
        float f5 = cVar.f44776q;
        float fMin = (cVar.f44768h / 2.0f) + f5;
        if (f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((cVar.f44777r * cVar.f44775p) / 2.0f, cVar.f44768h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f11 = cVar.f44765e;
        float f12 = cVar.f44767g;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((cVar.f44766f + f12) * 360.0f) - f13;
        paint.setColor(cVar.f44780u);
        paint.setAlpha(cVar.f44779t);
        float f15 = cVar.f44768h / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, cVar.f44764d);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, paint);
        Paint paint2 = cVar.f44763c;
        if (cVar.f44773n) {
            Path path = cVar.f44774o;
            if (path == null) {
                Path path2 = new Path();
                cVar.f44774o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f17 = (cVar.f44777r * cVar.f44775p) / 2.0f;
            cVar.f44774o.moveTo(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            cVar.f44774o.lineTo(cVar.f44777r * cVar.f44775p, CropImageView.DEFAULT_ASPECT_RATIO);
            Path path3 = cVar.f44774o;
            float f18 = cVar.f44777r;
            float f19 = cVar.f44775p;
            path3.lineTo((f18 * f19) / 2.0f, cVar.f44778s * f19);
            cVar.f44774o.offset((rectF.centerX() + fMin2) - f17, (cVar.f44768h / 2.0f) + rectF.centerY());
            cVar.f44774o.close();
            paint2.setColor(cVar.f44780u);
            paint2.setAlpha(cVar.f44779t);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(cVar.f44774o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f44782a.f44779t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f44785d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f44782a.f44779t = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f44782a.f44762b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f44785d.cancel();
        c cVar = this.f44782a;
        float f5 = cVar.f44765e;
        cVar.f44771k = f5;
        float f11 = cVar.f44766f;
        cVar.f44772l = f11;
        cVar.m = cVar.f44767g;
        if (f11 != f5) {
            this.f44787f = true;
            this.f44785d.setDuration(666L);
            this.f44785d.start();
            return;
        }
        cVar.a(0);
        cVar.f44771k = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar.f44772l = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar.m = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar.f44765e = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar.f44766f = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar.f44767g = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f44785d.setDuration(1332L);
        this.f44785d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f44785d.cancel();
        this.f44783b = CropImageView.DEFAULT_ASPECT_RATIO;
        c cVar = this.f44782a;
        if (cVar.f44773n) {
            cVar.f44773n = false;
        }
        cVar.a(0);
        cVar.f44771k = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar.f44772l = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar.m = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar.f44765e = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar.f44766f = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar.f44767g = CropImageView.DEFAULT_ASPECT_RATIO;
        invalidateSelf();
    }
}
