package n;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f42898l = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f42899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f42900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f42901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f42902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f42903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f42905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f42906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f42907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f42908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f42909k;

    public b(Context context) {
        Paint paint = new Paint();
        this.f42899a = paint;
        this.f42905g = new Path();
        this.f42909k = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, k.a.f37412o, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, CropImageView.DEFAULT_ASPECT_RATIO);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f42908j = (float) (Math.cos(f42898l) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f42904f != z11) {
            this.f42904f = z11;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, CropImageView.DEFAULT_ASPECT_RATIO));
        if (fRound != this.f42903e) {
            this.f42903e = fRound;
            invalidateSelf();
        }
        this.f42906h = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f42901c = Math.round(typedArrayObtainStyledAttributes.getDimension(2, CropImageView.DEFAULT_ASPECT_RATIO));
        this.f42900b = Math.round(typedArrayObtainStyledAttributes.getDimension(0, CropImageView.DEFAULT_ASPECT_RATIO));
        this.f42902d = typedArrayObtainStyledAttributes.getDimension(1, CropImageView.DEFAULT_ASPECT_RATIO);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f5, float f11, float f12) {
        return p0.a(f11, f5, f12, f5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z11 = false;
        int i11 = this.f42909k;
        if (i11 != 0 && (i11 == 1 || (i11 == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z11 = true;
        }
        float f5 = this.f42900b;
        float fSqrt = (float) Math.sqrt(f5 * f5 * 2.0f);
        float f11 = this.f42907i;
        float f12 = this.f42901c;
        float fA = a(f12, fSqrt, f11);
        float fA2 = a(f12, this.f42902d, this.f42907i);
        float fRound = Math.round(a(CropImageView.DEFAULT_ASPECT_RATIO, this.f42908j, this.f42907i));
        float fA3 = a(CropImageView.DEFAULT_ASPECT_RATIO, f42898l, this.f42907i);
        float fA4 = a(z11 ? 0.0f : -180.0f, z11 ? 180.0f : 0.0f, this.f42907i);
        double d5 = fA;
        double d11 = fA3;
        float fRound2 = Math.round(Math.cos(d11) * d5);
        float fRound3 = Math.round(Math.sin(d11) * d5);
        Path path = this.f42905g;
        path.rewind();
        float f13 = this.f42903e;
        Paint paint = this.f42899a;
        float fA5 = a(f13 + paint.getStrokeWidth(), -this.f42908j, this.f42907i);
        float f14 = (-fA2) / 2.0f;
        path.moveTo(f14 + fRound, CropImageView.DEFAULT_ASPECT_RATIO);
        path.rLineTo(fA2 - (fRound * 2.0f), CropImageView.DEFAULT_ASPECT_RATIO);
        path.moveTo(f14, fA5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f14, -fA5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f15 = this.f42903e;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f15 + ((((int) (fHeight - (f15 * 2.0f))) / 4) * 2));
        if (this.f42904f) {
            canvas.rotate(fA4 * (z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f42906h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f42906h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        Paint paint = this.f42899a;
        if (i11 != paint.getAlpha()) {
            paint.setAlpha(i11);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f42899a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
