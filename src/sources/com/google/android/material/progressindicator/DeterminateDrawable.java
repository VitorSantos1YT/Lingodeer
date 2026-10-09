package com.google.android.material.progressindicator;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.b;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import u5.f;
import u5.g;
import v10.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final c f15012a0 = new AnonymousClass1();
    public final DrawingDelegate P;
    public final g Q;
    public final f R;
    public final DrawingDelegate.ActiveIndicator S;
    public float T;
    public boolean U;
    public final ValueAnimator V;
    public ValueAnimator W;
    public TimeInterpolator X;
    public TimeInterpolator Y;
    public TimeInterpolator Z;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.DeterminateDrawable$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass1 extends c {
        @Override // v10.c
        public final void K(Object obj, float f5) {
            DeterminateDrawable determinateDrawable = (DeterminateDrawable) obj;
            c cVar = DeterminateDrawable.f15012a0;
            determinateDrawable.S.f15028b = f5 / 10000.0f;
            determinateDrawable.invalidateSelf();
            int i11 = (int) f5;
            if (determinateDrawable.f15014b.b(true)) {
                Context context = determinateDrawable.f15013a;
                if (determinateDrawable.W == null) {
                    LinearInterpolator linearInterpolator = AnimationUtils.f13768a;
                    determinateDrawable.Y = MotionUtils.d(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                    determinateDrawable.Z = MotionUtils.d(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    determinateDrawable.W = valueAnimator;
                    valueAnimator.setDuration(500L);
                    determinateDrawable.W.setFloatValues(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                    determinateDrawable.W.setInterpolator(null);
                    determinateDrawable.W.addUpdateListener(new com.google.android.material.motion.c(determinateDrawable, 2));
                }
                float f11 = i11;
                float f12 = (f11 < 1000.0f || f11 > 9000.0f) ? CropImageView.DEFAULT_ASPECT_RATIO : 1.0f;
                if (f12 == determinateDrawable.T) {
                    if (determinateDrawable.W.isRunning()) {
                        return;
                    }
                    determinateDrawable.S.f15031e = f12;
                    determinateDrawable.invalidateSelf();
                    return;
                }
                if (determinateDrawable.W.isRunning()) {
                    determinateDrawable.W.cancel();
                }
                determinateDrawable.T = f12;
                if (f12 == 1.0f) {
                    determinateDrawable.X = determinateDrawable.Y;
                    determinateDrawable.W.start();
                } else {
                    determinateDrawable.X = determinateDrawable.Z;
                    determinateDrawable.W.reverse();
                }
            }
        }

        @Override // v10.c
        public final float x(Object obj) {
            return ((DeterminateDrawable) obj).S.f15028b * 10000.0f;
        }
    }

    public DeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, DrawingDelegate drawingDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.U = false;
        this.P = drawingDelegate;
        DrawingDelegate.ActiveIndicator activeIndicator = new DrawingDelegate.ActiveIndicator();
        this.S = activeIndicator;
        activeIndicator.f15034h = true;
        g gVar = new g();
        this.Q = gVar;
        gVar.a(1.0f);
        gVar.b(50.0f);
        f fVar = new f(this, f15012a0);
        this.R = fVar;
        fVar.m = gVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.V = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new b(1, this, baseProgressIndicatorSpec));
        if (baseProgressIndicatorSpec.b(true) && baseProgressIndicatorSpec.m != 0) {
            valueAnimator.start();
        }
        if (this.K != 1.0f) {
            this.K = 1.0f;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final void d() {
        super.g(false, false, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.N)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            boolean zF = super.f();
            boolean zE = super.e();
            DrawingDelegate drawingDelegate = this.P;
            drawingDelegate.f15022a.d();
            drawingDelegate.a(canvas, bounds, fB, zF, zE);
            float fC = c();
            DrawingDelegate.ActiveIndicator activeIndicator = this.S;
            activeIndicator.f15032f = fC;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.L;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f15014b;
            activeIndicator.f15029c = baseProgressIndicatorSpec.f14959e[0];
            int iM = baseProgressIndicatorSpec.f14963i;
            if (iM > 0) {
                if (!(this.P instanceof LinearDrawingDelegate)) {
                    iM = (int) ((ue.f.m(activeIndicator.f15028b, CropImageView.DEFAULT_ASPECT_RATIO, 0.01f) * iM) / 0.01f);
                }
                this.P.d(canvas, paint, activeIndicator.f15028b, 1.0f, baseProgressIndicatorSpec.f14960f, this.M, iM);
            } else {
                this.P.d(canvas, paint, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, baseProgressIndicatorSpec.f14960f, this.M, 0);
            }
            this.P.c(canvas, paint, activeIndicator, this.M);
            this.P.b(baseProgressIndicatorSpec.f14959e[0], this.M, canvas, paint);
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.M;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.P.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.P.f();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final boolean h(boolean z11, boolean z12, boolean z13) {
        boolean zH = super.h(z11, z12, z13);
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.f15015c;
        ContentResolver contentResolver = this.f15013a.getContentResolver();
        animatorDurationScaleProvider.getClass();
        float fA = AnimatorDurationScaleProvider.a(contentResolver);
        if (fA == CropImageView.DEFAULT_ASPECT_RATIO) {
            this.U = true;
            return zH;
        }
        this.U = false;
        this.Q.b(50.0f / fA);
        return zH;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.R.d();
        this.S.f15028b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i11) {
        float f5 = i11;
        float f11 = (f5 < 1000.0f || f5 > 9000.0f) ? CropImageView.DEFAULT_ASPECT_RATIO : 1.0f;
        boolean z11 = this.U;
        DrawingDelegate.ActiveIndicator activeIndicator = this.S;
        f fVar = this.R;
        if (z11) {
            fVar.d();
            activeIndicator.f15028b = f5 / 10000.0f;
            invalidateSelf();
            activeIndicator.f15031e = f11;
            invalidateSelf();
        } else {
            fVar.f52789b = activeIndicator.f15028b * 10000.0f;
            fVar.f52790c = true;
            fVar.a(f5);
        }
        return true;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        return g(z11, z12, true);
    }
}
