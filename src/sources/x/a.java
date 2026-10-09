package x;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f55556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f55557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f55558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f55559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f55560e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f55563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f55564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f55565j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f55561f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f55562g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f55566k = PorterDuff.Mode.SRC_IN;

    public a(ColorStateList colorStateList, float f5) {
        this.f55556a = f5;
        Paint paint = new Paint(5);
        this.f55557b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f55563h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f55563h.getDefaultColor()));
        this.f55558c = new RectF();
        this.f55559d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f5 = rect.left;
        float f11 = rect.top;
        float f12 = rect.right;
        float f13 = rect.bottom;
        RectF rectF = this.f55558c;
        rectF.set(f5, f11, f12, f13);
        Rect rect2 = this.f55559d;
        rect2.set(rect);
        if (this.f55561f) {
            rect2.inset((int) Math.ceil(b.a(this.f55560e, this.f55556a, this.f55562g)), (int) Math.ceil(b.b(this.f55560e, this.f55556a, this.f55562g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z11;
        PorterDuffColorFilter porterDuffColorFilter = this.f55564i;
        Paint paint = this.f55557b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z11 = false;
        } else {
            paint.setColorFilter(this.f55564i);
            z11 = true;
        }
        RectF rectF = this.f55558c;
        float f5 = this.f55556a;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        if (z11) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f55559d, this.f55556a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f55565j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f55563h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f55563h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f55557b;
        boolean z11 = colorForState != paint.getColor();
        if (z11) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f55565j;
        if (colorStateList2 == null || (mode = this.f55566k) == null) {
            return z11;
        }
        this.f55564i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f55557b.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55557b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f55565j = colorStateList;
        this.f55564i = a(colorStateList, this.f55566k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f55566k = mode;
        this.f55564i = a(this.f55565j, mode);
        invalidateSelf();
    }
}
