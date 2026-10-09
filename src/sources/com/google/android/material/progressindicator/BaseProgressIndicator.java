package com.google.android.material.progressindicator;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import ra.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseProgressIndicator<S extends BaseProgressIndicatorSpec> extends ProgressBar {
    public static final /* synthetic */ int O = 0;
    public boolean H;
    public final Runnable K;
    public final Runnable L;
    public final c M;
    public final c N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseProgressIndicatorSpec f14944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AnimatorDurationScaleProvider f14948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14949f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14950t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface HideAnimationBehavior {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShowAnimationBehavior {
    }

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i11);
        this.f14949f = false;
        this.f14950t = 4;
        this.K = new Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.1
            @Override // java.lang.Runnable
            public final void run() {
                int i13 = BaseProgressIndicator.O;
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                if (baseProgressIndicator.f14947d > 0) {
                    SystemClock.uptimeMillis();
                }
                baseProgressIndicator.setVisibility(0);
            }
        };
        this.L = new Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.2
            @Override // java.lang.Runnable
            public final void run() {
                int i13 = BaseProgressIndicator.O;
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                ((DrawableWithAnimatedVisibilityChange) baseProgressIndicator.getCurrentDrawable()).g(false, false, true);
                if ((baseProgressIndicator.getProgressDrawable() == null || !baseProgressIndicator.getProgressDrawable().isVisible()) && (baseProgressIndicator.getIndeterminateDrawable() == null || !baseProgressIndicator.getIndeterminateDrawable().isVisible())) {
                    baseProgressIndicator.setVisibility(4);
                }
                baseProgressIndicator.getClass();
            }
        };
        this.M = new c() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.3
            @Override // ra.c
            public final void a(Drawable drawable) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setIndeterminate(false);
                baseProgressIndicator.c(baseProgressIndicator.f14945b);
            }
        };
        this.N = new c() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.4
            @Override // ra.c
            public final void a(Drawable drawable) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                if (baseProgressIndicator.f14949f) {
                    return;
                }
                baseProgressIndicator.setVisibility(baseProgressIndicator.f14950t);
            }
        };
        Context context2 = getContext();
        this.f14944a = a(context2, attributeSet);
        ThemeEnforcement.a(context2, attributeSet, i11, i12);
        int[] iArr = com.google.android.material.R.styleable.f13735d;
        ThemeEnforcement.b(context2, attributeSet, iArr, i11, i12, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i11, i12);
        typedArrayObtainStyledAttributes.getInt(7, -1);
        this.f14947d = Math.min(typedArrayObtainStyledAttributes.getInt(5, -1), 1000);
        typedArrayObtainStyledAttributes.recycle();
        this.f14948e = new AnimatorDurationScaleProvider();
        this.f14946c = true;
    }

    private DrawingDelegate<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().P;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().P;
    }

    public abstract BaseProgressIndicatorSpec a(Context context, AttributeSet attributeSet);

    public final void b() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().Q.d(this.M);
    }

    public void c(int i11) {
        if (!isIndeterminate()) {
            super.setProgress(i11);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.f14945b = i11;
            this.f14949f = true;
            if (getIndeterminateDrawable().isVisible()) {
                AnimatorDurationScaleProvider animatorDurationScaleProvider = this.f14948e;
                ContentResolver contentResolver = getContext().getContentResolver();
                animatorDurationScaleProvider.getClass();
                if (AnimatorDurationScaleProvider.a(contentResolver) != CropImageView.DEFAULT_ASPECT_RATIO) {
                    getIndeterminateDrawable().Q.e();
                    return;
                }
            }
            this.M.a(getIndeterminateDrawable());
        }
    }

    public final boolean d() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f14944a.f14962h;
    }

    public int[] getIndicatorColor() {
        return this.f14944a.f14959e;
    }

    public int getIndicatorTrackGapSize() {
        return this.f14944a.f14963i;
    }

    public int getShowAnimationBehavior() {
        return this.f14944a.f14961g;
    }

    public int getTrackColor() {
        return this.f14944a.f14960f;
    }

    public int getTrackCornerRadius() {
        return this.f14944a.f14956b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f14944a.f14957c;
    }

    public int getTrackThickness() {
        return this.f14944a.f14955a;
    }

    public int getWaveAmplitude() {
        return this.f14944a.f14966l;
    }

    public int getWaveSpeed() {
        return this.f14944a.m;
    }

    public int getWavelengthDeterminate() {
        return this.f14944a.f14964j;
    }

    public int getWavelengthIndeterminate() {
        return this.f14944a.f14965k;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        DeterminateDrawable<S> progressDrawable = getProgressDrawable();
        c cVar = this.N;
        if (progressDrawable != null) {
            DeterminateDrawable<S> progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f15019t == null) {
                progressDrawable2.f15019t = new ArrayList();
            }
            if (!progressDrawable2.f15019t.contains(cVar)) {
                progressDrawable2.f15019t.add(cVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            IndeterminateDrawable<S> indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f15019t == null) {
                indeterminateDrawable.f15019t = new ArrayList();
            }
            if (!indeterminateDrawable.f15019t.contains(cVar)) {
                indeterminateDrawable.f15019t.add(cVar);
            }
        }
        if (d()) {
            if (this.f14947d > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.L);
        removeCallbacks(this.K);
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).d();
        IndeterminateDrawable<S> indeterminateDrawable = getIndeterminateDrawable();
        c cVar = this.N;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().i(cVar);
            getIndeterminateDrawable().Q.g();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().i(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i11, int i12) {
        try {
            DrawingDelegate<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i11) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i12) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        boolean z11 = i11 == 0;
        if (this.f14946c) {
            ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).g(d(), false, z11);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        if (this.f14946c) {
            ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).g(d(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.f14948e = animatorDurationScaleProvider;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f15015c = animatorDurationScaleProvider;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f15015c = animatorDurationScaleProvider;
        }
    }

    public void setHideAnimationBehavior(int i11) {
        this.f14944a.f14962h = i11;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z11) {
        try {
            if (z11 == isIndeterminate()) {
                return;
            }
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange != null) {
                drawableWithAnimatedVisibilityChange.d();
            }
            super.setIndeterminate(z11);
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange2 != null) {
                drawableWithAnimatedVisibilityChange2.g(d(), false, false);
            }
            if ((drawableWithAnimatedVisibilityChange2 instanceof IndeterminateDrawable) && d()) {
                ((IndeterminateDrawable) drawableWithAnimatedVisibilityChange2).Q.f();
            }
            this.f14949f = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f5) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (baseProgressIndicatorSpec.f14967n != f5) {
            baseProgressIndicatorSpec.f14967n = f5;
            getIndeterminateDrawable().Q.c();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof IndeterminateDrawable) {
            ((DrawableWithAnimatedVisibilityChange) drawable).d();
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.H) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.b(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f14944a.f14959e = iArr;
        getIndeterminateDrawable().Q.c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (baseProgressIndicatorSpec.f14963i != i11) {
            baseProgressIndicatorSpec.f14963i = i11;
            baseProgressIndicatorSpec.d();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i11) {
        if (isIndeterminate()) {
            return;
        }
        c(i11);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (!(drawable instanceof DeterminateDrawable)) {
            if (this.H) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            DeterminateDrawable determinateDrawable = (DeterminateDrawable) drawable;
            determinateDrawable.g(false, false, false);
            super.setProgressDrawable(determinateDrawable);
            determinateDrawable.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i11) {
        this.f14944a.f14961g = i11;
        invalidate();
    }

    public void setTrackColor(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (baseProgressIndicatorSpec.f14960f != i11) {
            baseProgressIndicatorSpec.f14960f = i11;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (baseProgressIndicatorSpec.f14956b != i11) {
            baseProgressIndicatorSpec.f14956b = Math.min(i11, baseProgressIndicatorSpec.f14955a / 2);
            baseProgressIndicatorSpec.f14958d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f5) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (baseProgressIndicatorSpec.f14957c != f5) {
            baseProgressIndicatorSpec.f14957c = Math.min(f5, 0.5f);
            baseProgressIndicatorSpec.f14958d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (baseProgressIndicatorSpec.f14955a != i11) {
            baseProgressIndicatorSpec.f14955a = i11;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i11) {
        if (i11 != 0 && i11 != 4 && i11 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f14950t = i11;
    }

    public void setWaveAmplitude(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (baseProgressIndicatorSpec.f14966l != i11) {
            baseProgressIndicatorSpec.f14966l = Math.abs(i11);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        baseProgressIndicatorSpec.m = i11;
        DeterminateDrawable<S> progressDrawable = getProgressDrawable();
        boolean z11 = baseProgressIndicatorSpec.m != 0;
        ValueAnimator valueAnimator = progressDrawable.V;
        if (z11 && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z11 || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i11) {
        setWavelengthDeterminate(i11);
        setWavelengthIndeterminate(i11);
    }

    public void setWavelengthDeterminate(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (baseProgressIndicatorSpec.f14964j != i11) {
            baseProgressIndicatorSpec.f14964j = Math.abs(i11);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i11) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f14944a;
        if (baseProgressIndicatorSpec.f14965k != i11) {
            baseProgressIndicatorSpec.f14965k = Math.abs(i11);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public IndeterminateDrawable<S> getIndeterminateDrawable() {
        return (IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public DeterminateDrawable<S> getProgressDrawable() {
        return (DeterminateDrawable) super.getProgressDrawable();
    }
}
