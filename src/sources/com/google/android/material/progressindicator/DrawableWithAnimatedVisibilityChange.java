package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import com.google.android.material.animation.AnimationUtils;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import ra.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable {
    public static final Property O = new AnonymousClass3(Float.class, "growFraction");
    public boolean H;
    public float K;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseProgressIndicatorSpec f15014b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f15016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObjectAnimator f15017e;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f15019t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15018f = -1.0f;
    public final Paint L = new Paint();
    public final Rect N = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AnimatorDurationScaleProvider f15015c = new AnimatorDurationScaleProvider();

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass3 extends Property<DrawableWithAnimatedVisibilityChange, Float> {
        @Override // android.util.Property
        public final Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
            return Float.valueOf(drawableWithAnimatedVisibilityChange.b());
        }

        @Override // android.util.Property
        public final void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f5) {
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = drawableWithAnimatedVisibilityChange;
            float fFloatValue = f5.floatValue();
            if (drawableWithAnimatedVisibilityChange2.K != fFloatValue) {
                drawableWithAnimatedVisibilityChange2.K = fFloatValue;
                drawableWithAnimatedVisibilityChange2.invalidateSelf();
            }
        }
    }

    public DrawableWithAnimatedVisibilityChange(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.f15013a = context;
        this.f15014b = baseProgressIndicatorSpec;
        setAlpha(255);
    }

    public final float b() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f15014b;
        if (baseProgressIndicatorSpec.f14961g == 0 && baseProgressIndicatorSpec.f14962h == 0) {
            return 1.0f;
        }
        return this.K;
    }

    public final float c() {
        float f5 = this.f15018f;
        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
            return f5;
        }
        boolean z11 = this instanceof DeterminateDrawable;
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f15014b;
        if (baseProgressIndicatorSpec.b(z11) && baseProgressIndicatorSpec.m != 0) {
            AnimatorDurationScaleProvider animatorDurationScaleProvider = this.f15015c;
            ContentResolver contentResolver = this.f15013a.getContentResolver();
            animatorDurationScaleProvider.getClass();
            float fA = AnimatorDurationScaleProvider.a(contentResolver);
            if (fA > CropImageView.DEFAULT_ASPECT_RATIO) {
                int i11 = (int) ((((z11 ? baseProgressIndicatorSpec.f14964j : baseProgressIndicatorSpec.f14965k) * 1000.0f) / baseProgressIndicatorSpec.m) * fA);
                float fUptimeMillis = (SystemClock.uptimeMillis() % ((long) i11)) / i11;
                return fUptimeMillis < CropImageView.DEFAULT_ASPECT_RATIO ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public void d() {
        g(false, false, false);
    }

    public boolean e() {
        ObjectAnimator objectAnimator = this.f15017e;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public boolean f() {
        ObjectAnimator objectAnimator = this.f15016d;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public boolean g(boolean z11, boolean z12, boolean z13) {
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.f15015c;
        ContentResolver contentResolver = this.f15013a.getContentResolver();
        animatorDurationScaleProvider.getClass();
        return h(z11, z12, z13 && AnimatorDurationScaleProvider.a(contentResolver) > CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.M;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h(boolean z11, boolean z12, boolean z13) {
        ObjectAnimator objectAnimator = this.f15016d;
        Property property = O;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<DrawableWithAnimatedVisibilityChange, Float>) property, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            this.f15016d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f15016d.setInterpolator(AnimationUtils.f13769b);
            ObjectAnimator objectAnimator2 = this.f15016d;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f15016d = objectAnimator2;
            objectAnimator2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = DrawableWithAnimatedVisibilityChange.this;
                    ArrayList arrayList = drawableWithAnimatedVisibilityChange.f15019t;
                    if (arrayList == null || drawableWithAnimatedVisibilityChange.H) {
                        return;
                    }
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((c) obj).b(drawableWithAnimatedVisibilityChange);
                    }
                }
            });
        }
        if (this.f15017e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<DrawableWithAnimatedVisibilityChange, Float>) property, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
            this.f15017e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f15017e.setInterpolator(AnimationUtils.f13769b);
            ObjectAnimator objectAnimator3 = this.f15017e;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f15017e = objectAnimator3;
            objectAnimator3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = DrawableWithAnimatedVisibilityChange.this;
                    DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                    ArrayList arrayList = drawableWithAnimatedVisibilityChange.f15019t;
                    if (arrayList == null || drawableWithAnimatedVisibilityChange.H) {
                        return;
                    }
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((c) obj).a(drawableWithAnimatedVisibilityChange);
                    }
                }
            });
        }
        if (isVisible() || z11) {
            ObjectAnimator objectAnimator4 = z11 ? this.f15016d : this.f15017e;
            ObjectAnimator objectAnimator5 = z11 ? this.f15017e : this.f15016d;
            if (!z13) {
                if (objectAnimator5.isRunning()) {
                    boolean z14 = this.H;
                    this.H = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.H = z14;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z15 = this.H;
                    this.H = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.H = z15;
                }
                return super.setVisible(z11, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z16 = !z11 || super.setVisible(z11, false);
                BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f15014b;
                if (!z11 ? baseProgressIndicatorSpec.f14962h != 0 : baseProgressIndicatorSpec.f14961g != 0) {
                    boolean z17 = this.H;
                    this.H = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.H = z17;
                    return z16;
                }
                if (z12 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z16;
                }
                objectAnimator4.resume();
                return z16;
            }
        }
        return false;
    }

    public boolean i(c cVar) {
        ArrayList arrayList = this.f15019t;
        if (arrayList == null || !arrayList.contains(cVar)) {
            return false;
        }
        this.f15019t.remove(cVar);
        if (!this.f15019t.isEmpty()) {
            return true;
        }
        this.f15019t = null;
        return true;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return f() || e();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.M = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.L.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        return g(z11, z12, true);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        h(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        h(false, true, false);
    }
}
