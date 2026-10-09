package fg;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {
    public static final Rect U = new Rect();
    public static final d V = new d("rotateX", 1);
    public static final d W = new d("rotate", 2);
    public static final d X = new d("rotateY", 3);
    public static final c Y;
    public static final c Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final c f27257a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final c f27258b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final d f27259c0;
    public int H;
    public int K;
    public int L;
    public int M;
    public float N;
    public float O;
    public ValueAnimator P;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f27263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f27264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27265f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f27266t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f27260a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f27261b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f27262c = 1.0f;
    public int Q = 255;
    public Rect R = U;
    public final Camera S = new Camera();
    public final Matrix T = new Matrix();

    static {
        new d("translateX", 4);
        new d("translateY", 5);
        Y = new c("translateXPercentage", 1);
        Z = new c("translateYPercentage", 2);
        new c("scaleX", 3);
        f27257a0 = new c("scaleY", 4);
        f27258b0 = new c("scale", 0);
        f27259c0 = new d("alpha", 0);
    }

    public static Rect a(Rect rect) {
        int iMin = Math.min(rect.width(), rect.height());
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        int i11 = iMin / 2;
        return new Rect(iCenterX - i11, iCenterY - i11, iCenterX + i11, iCenterY + i11);
    }

    public abstract void b(Canvas canvas);

    public abstract int c();

    public abstract ValueAnimator d();

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iWidth = this.K;
        if (iWidth == 0) {
            iWidth = (int) (getBounds().width() * this.N);
        }
        int iHeight = this.L;
        if (iHeight == 0) {
            iHeight = (int) (getBounds().height() * this.O);
        }
        canvas.translate(iWidth, iHeight);
        canvas.scale(this.f27261b, this.f27262c, this.f27263d, this.f27264e);
        canvas.rotate(this.M, this.f27263d, this.f27264e);
        if (this.f27266t != 0 || this.H != 0) {
            Camera camera = this.S;
            camera.save();
            camera.rotateX(this.f27266t);
            camera.rotateY(this.H);
            Matrix matrix = this.T;
            camera.getMatrix(matrix);
            matrix.preTranslate(-this.f27263d, -this.f27264e);
            matrix.postTranslate(this.f27263d, this.f27264e);
            camera.restore();
            canvas.concat(matrix);
        }
        b(canvas);
    }

    public abstract void e(int i11);

    public final void f(int i11, int i12, int i13, int i14) {
        Rect rect = new Rect(i11, i12, i13, i14);
        this.R = rect;
        this.f27263d = rect.centerX();
        this.f27264e = this.R.centerY();
    }

    public final void g(float f5) {
        this.f27260a = f5;
        this.f27261b = f5;
        this.f27262c = f5;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.Q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ValueAnimator valueAnimator = this.P;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.Q = i11;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            if (this.P == null) {
                this.P = d();
            }
            ValueAnimator valueAnimator2 = this.P;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(this);
                this.P.setStartDelay(this.f27265f);
            }
            ValueAnimator valueAnimator3 = this.P;
            this.P = valueAnimator3;
            if (valueAnimator3 == null) {
                return;
            }
            if (!valueAnimator3.isStarted()) {
                valueAnimator3.start();
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.P.removeAllUpdateListeners();
        this.P.end();
        this.f27260a = 1.0f;
        this.f27266t = 0;
        this.H = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = CropImageView.DEFAULT_ASPECT_RATIO;
        this.O = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
    }
}
