package zb;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.bumptech.glide.d;
import hc.f;
import hz.b;
import java.util.ArrayList;
import nv.p;
import ra.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable implements Drawable.Callback, Animatable {
    public int H;
    public int K;
    public Drawable L;
    public final Drawable M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f59082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f59085d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f59086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f59087f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f59088t;

    public a(Drawable drawable, f fVar, int i11, boolean z11) {
        this.f59082a = fVar;
        this.f59083b = i11;
        this.f59084c = z11;
        this.f59086e = a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null);
        this.f59087f = a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null);
        this.H = 255;
        this.L = null;
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        this.M = drawableMutate;
        if (i11 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable2 = this.L;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        if (drawableMutate != null) {
            drawableMutate.setCallback(this);
        }
    }

    public final int a(Integer num, Integer num2) {
        if ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1)) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }

    public final void b() {
        this.K = 2;
        this.L = null;
        ArrayList arrayList = this.f59085d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((c) arrayList.get(i11)).a(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dJ = d.j(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f59082a);
        double d5 = 2;
        int iP = b.P((((double) iWidth) - (((double) intrinsicWidth) * dJ)) / d5);
        int iP2 = b.P((((double) iHeight) - (dJ * ((double) intrinsicHeight))) / d5);
        drawable.setBounds(rect.left + iP, rect.top + iP2, rect.right - iP, rect.bottom - iP2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        int i11 = this.K;
        if (i11 == 0) {
            Drawable drawable2 = this.L;
            if (drawable2 != null) {
                drawable2.setAlpha(this.H);
                int iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        Drawable drawable3 = this.M;
        if (i11 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.H);
                int iSave2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave2);
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f59088t) / ((double) this.f59083b);
        double dJ = b.j(dUptimeMillis, 0.0d, 1.0d);
        int i12 = this.H;
        int i13 = (int) (dJ * ((double) i12));
        if (this.f59084c) {
            i12 -= i13;
        }
        boolean z11 = dUptimeMillis >= 1.0d;
        if (!z11 && (drawable = this.L) != null) {
            drawable.setAlpha(i12);
            int iSave3 = canvas.save();
            try {
                drawable.draw(canvas);
                canvas.restoreToCount(iSave3);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave3);
                throw th2;
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i13);
            int iSave4 = canvas.save();
            try {
                drawable3.draw(canvas);
                canvas.restoreToCount(iSave4);
            } catch (Throwable th3) {
                canvas.restoreToCount(iSave4);
                throw th3;
            }
        }
        if (z11) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.H;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i11 = this.K;
        if (i11 == 0) {
            Drawable drawable = this.L;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.M;
        if (i11 != 1) {
            if (i11 == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.L;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f59087f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f59086e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.L;
        int i11 = this.K;
        if (i11 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.M;
        if (i11 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.K == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.L;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.M;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i11) {
        Drawable drawable = this.L;
        boolean level = drawable != null ? drawable.setLevel(i11) : false;
        Drawable drawable2 = this.M;
        return level || (drawable2 != null ? drawable2.setLevel(i11) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.L;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.M;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        scheduleSelf(runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        if (i11 < 0 || i11 >= 256) {
            throw new IllegalArgumentException(p.j(i11, "Invalid alpha: ").toString());
        }
        this.H = i11;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.L;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.M;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i11) {
        Drawable drawable = this.L;
        if (drawable != null) {
            drawable.setTint(i11);
        }
        Drawable drawable2 = this.M;
        if (drawable2 != null) {
            drawable2.setTint(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.L;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.M;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.L;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.M;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.L;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.M;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.L;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.M;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.K != 0) {
            return;
        }
        this.K = 1;
        this.f59088t = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f59085d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((c) arrayList.get(i11)).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.L;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.M;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.K != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
