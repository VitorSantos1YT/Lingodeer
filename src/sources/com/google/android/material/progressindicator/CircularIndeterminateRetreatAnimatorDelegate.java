package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import com.yalantis.ucrop.view.CropImageView;
import com.youth.banner.config.BannerConfig;
import java.util.ArrayList;
import r6.a;
import ra.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class CircularIndeterminateRetreatAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f14993k = AnimationUtils.f13769b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f14994l = {0, AchievementLevelType.KNOWLEDGE_POINT_LV_9, BannerConfig.LOOP_TIME, 4500};
    public static final float[] m = {0.1f, 0.87f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Property f14995n = new AnonymousClass3(Float.class, "animationFraction");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Property f14996o = new AnonymousClass4(Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f14997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f14998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f14999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CircularProgressIndicatorSpec f15000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f15002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f15003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f15004j;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass3 extends Property<CircularIndeterminateRetreatAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate) {
            return Float.valueOf(circularIndeterminateRetreatAnimatorDelegate.f15002h);
        }

        @Override // android.util.Property
        public final void set(CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate, Float f5) {
            CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate2 = circularIndeterminateRetreatAnimatorDelegate;
            float fFloatValue = f5.floatValue();
            circularIndeterminateRetreatAnimatorDelegate2.f15002h = fFloatValue;
            int i11 = (int) (fFloatValue * 6000.0f);
            TimeInterpolator timeInterpolator = circularIndeterminateRetreatAnimatorDelegate2.f14999e;
            ArrayList arrayList = circularIndeterminateRetreatAnimatorDelegate2.f15039b;
            DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) arrayList.get(0);
            float f11 = circularIndeterminateRetreatAnimatorDelegate2.f15002h * 1080.0f;
            int[] iArr = CircularIndeterminateRetreatAnimatorDelegate.f14994l;
            float interpolation = 0.0f;
            for (int i12 : iArr) {
                interpolation += timeInterpolator.getInterpolation(IndeterminateAnimatorDelegate.b(i11, i12, 500)) * 90.0f;
            }
            activeIndicator.f15033g = f11 + interpolation;
            float interpolation2 = timeInterpolator.getInterpolation(IndeterminateAnimatorDelegate.b(i11, 0, BannerConfig.LOOP_TIME)) - timeInterpolator.getInterpolation(IndeterminateAnimatorDelegate.b(i11, BannerConfig.LOOP_TIME, BannerConfig.LOOP_TIME));
            activeIndicator.f15027a = CropImageView.DEFAULT_ASPECT_RATIO;
            float[] fArr = CircularIndeterminateRetreatAnimatorDelegate.m;
            float fC = MathUtils.c(fArr[0], fArr[1], interpolation2);
            activeIndicator.f15028b = fC;
            float f12 = circularIndeterminateRetreatAnimatorDelegate2.f15003i;
            if (f12 > CropImageView.DEFAULT_ASPECT_RATIO) {
                activeIndicator.f15028b = (1.0f - f12) * fC;
            }
            for (int i13 = 0; i13 < iArr.length; i13++) {
                float fB = IndeterminateAnimatorDelegate.b(i11, iArr[i13], 100);
                if (fB >= CropImageView.DEFAULT_ASPECT_RATIO && fB <= 1.0f) {
                    int i14 = i13 + circularIndeterminateRetreatAnimatorDelegate2.f15001g;
                    int[] iArr2 = circularIndeterminateRetreatAnimatorDelegate2.f15000f.f14959e;
                    int length = i14 % iArr2.length;
                    int length2 = (length + 1) % iArr2.length;
                    int i15 = iArr2[length];
                    int i16 = iArr2[length2];
                    float interpolation3 = timeInterpolator.getInterpolation(fB);
                    DrawingDelegate.ActiveIndicator activeIndicator2 = (DrawingDelegate.ActiveIndicator) arrayList.get(0);
                    ArgbEvaluatorCompat argbEvaluatorCompat = ArgbEvaluatorCompat.f13773a;
                    Integer numValueOf = Integer.valueOf(i15);
                    Integer numValueOf2 = Integer.valueOf(i16);
                    argbEvaluatorCompat.getClass();
                    activeIndicator2.f15029c = ArgbEvaluatorCompat.a(interpolation3, numValueOf, numValueOf2).intValue();
                    break;
                }
            }
            circularIndeterminateRetreatAnimatorDelegate2.f15038a.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass4 extends Property<CircularIndeterminateRetreatAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate) {
            return Float.valueOf(circularIndeterminateRetreatAnimatorDelegate.f15003i);
        }

        @Override // android.util.Property
        public final void set(CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate, Float f5) {
            circularIndeterminateRetreatAnimatorDelegate.f15003i = f5.floatValue();
        }
    }

    public CircularIndeterminateRetreatAnimatorDelegate(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f15001g = 0;
        this.f15004j = null;
        this.f15000f = circularProgressIndicatorSpec;
        this.f14999e = MotionUtils.d(context, R.attr.motionEasingStandardInterpolator, f14993k);
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void a() {
        ObjectAnimator objectAnimator = this.f14997c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void c() {
        h();
        ObjectAnimator objectAnimator = this.f14997c;
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = this.f15000f;
        objectAnimator.setDuration((long) (circularProgressIndicatorSpec.f14967n * 6000.0f));
        this.f14998d.setDuration((long) (circularProgressIndicatorSpec.f14967n * 500.0f));
        this.f15001g = 0;
        ((DrawingDelegate.ActiveIndicator) this.f15039b.get(0)).f15029c = circularProgressIndicatorSpec.f14959e[0];
        this.f15003i = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void d(c cVar) {
        this.f15004j = cVar;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void e() {
        ObjectAnimator objectAnimator = this.f14998d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f15038a.isVisible()) {
            this.f14998d.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void f() {
        h();
        this.f15001g = 0;
        ((DrawingDelegate.ActiveIndicator) this.f15039b.get(0)).f15029c = this.f15000f.f14959e[0];
        this.f15003i = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f14997c.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void g() {
        this.f15004j = null;
    }

    public final void h() {
        ObjectAnimator objectAnimator = this.f14997c;
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = this.f15000f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<CircularIndeterminateRetreatAnimatorDelegate, Float>) f14995n, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            this.f14997c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (circularProgressIndicatorSpec.f14967n * 6000.0f));
            this.f14997c.setInterpolator(null);
            this.f14997c.setRepeatCount(-1);
            this.f14997c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate = CircularIndeterminateRetreatAnimatorDelegate.this;
                    circularIndeterminateRetreatAnimatorDelegate.f15001g = (circularIndeterminateRetreatAnimatorDelegate.f15001g + CircularIndeterminateRetreatAnimatorDelegate.f14994l.length) % circularIndeterminateRetreatAnimatorDelegate.f15000f.f14959e.length;
                }
            });
        }
        if (this.f14998d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<CircularIndeterminateRetreatAnimatorDelegate, Float>) f14996o, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            this.f14998d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (circularProgressIndicatorSpec.f14967n * 500.0f));
            this.f14998d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate = CircularIndeterminateRetreatAnimatorDelegate.this;
                    circularIndeterminateRetreatAnimatorDelegate.a();
                    c cVar = circularIndeterminateRetreatAnimatorDelegate.f15004j;
                    if (cVar != null) {
                        cVar.a(circularIndeterminateRetreatAnimatorDelegate.f15038a);
                    }
                }
            });
        }
    }
}
