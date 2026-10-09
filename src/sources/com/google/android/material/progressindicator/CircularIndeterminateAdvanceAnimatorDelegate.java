package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import r6.a;
import ra.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class CircularIndeterminateAdvanceAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f14979k = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f14980l = {667, 2017, 3367, 4717};
    public static final int[] m = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Property f14981n = new AnonymousClass3(Float.class, "animationFraction");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Property f14982o = new AnonymousClass4(Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f14983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f14984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f14985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CircularProgressIndicatorSpec f14986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f14989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f14990j;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass3 extends Property<CircularIndeterminateAdvanceAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate) {
            return Float.valueOf(circularIndeterminateAdvanceAnimatorDelegate.f14988h);
        }

        @Override // android.util.Property
        public final void set(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate, Float f5) {
            CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate2 = circularIndeterminateAdvanceAnimatorDelegate;
            float fFloatValue = f5.floatValue();
            circularIndeterminateAdvanceAnimatorDelegate2.f14988h = fFloatValue;
            int i11 = (int) (fFloatValue * 5400.0f);
            a aVar = circularIndeterminateAdvanceAnimatorDelegate2.f14985e;
            ArrayList arrayList = circularIndeterminateAdvanceAnimatorDelegate2.f15039b;
            DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) arrayList.get(0);
            float f11 = circularIndeterminateAdvanceAnimatorDelegate2.f14988h * 1520.0f;
            activeIndicator.f15027a = (-20.0f) + f11;
            activeIndicator.f15028b = f11;
            for (int i12 = 0; i12 < 4; i12++) {
                activeIndicator.f15028b = (aVar.getInterpolation(IndeterminateAnimatorDelegate.b(i11, CircularIndeterminateAdvanceAnimatorDelegate.f14979k[i12], 667)) * 250.0f) + activeIndicator.f15028b;
                activeIndicator.f15027a = (aVar.getInterpolation(IndeterminateAnimatorDelegate.b(i11, CircularIndeterminateAdvanceAnimatorDelegate.f14980l[i12], 667)) * 250.0f) + activeIndicator.f15027a;
            }
            float f12 = activeIndicator.f15027a;
            float f13 = activeIndicator.f15028b;
            activeIndicator.f15027a = (((f13 - f12) * circularIndeterminateAdvanceAnimatorDelegate2.f14989i) + f12) / 360.0f;
            activeIndicator.f15028b = f13 / 360.0f;
            for (int i13 = 0; i13 < 4; i13++) {
                float fB = IndeterminateAnimatorDelegate.b(i11, CircularIndeterminateAdvanceAnimatorDelegate.m[i13], 333);
                if (fB > CropImageView.DEFAULT_ASPECT_RATIO && fB < 1.0f) {
                    int i14 = i13 + circularIndeterminateAdvanceAnimatorDelegate2.f14987g;
                    int[] iArr = circularIndeterminateAdvanceAnimatorDelegate2.f14986f.f14959e;
                    int length = i14 % iArr.length;
                    int length2 = (length + 1) % iArr.length;
                    int i15 = iArr[length];
                    int i16 = iArr[length2];
                    float interpolation = aVar.getInterpolation(fB);
                    DrawingDelegate.ActiveIndicator activeIndicator2 = (DrawingDelegate.ActiveIndicator) arrayList.get(0);
                    ArgbEvaluatorCompat argbEvaluatorCompat = ArgbEvaluatorCompat.f13773a;
                    Integer numValueOf = Integer.valueOf(i15);
                    Integer numValueOf2 = Integer.valueOf(i16);
                    argbEvaluatorCompat.getClass();
                    activeIndicator2.f15029c = ArgbEvaluatorCompat.a(interpolation, numValueOf, numValueOf2).intValue();
                    break;
                }
            }
            circularIndeterminateAdvanceAnimatorDelegate2.f15038a.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass4 extends Property<CircularIndeterminateAdvanceAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate) {
            return Float.valueOf(circularIndeterminateAdvanceAnimatorDelegate.f14989i);
        }

        @Override // android.util.Property
        public final void set(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate, Float f5) {
            circularIndeterminateAdvanceAnimatorDelegate.f14989i = f5.floatValue();
        }
    }

    public CircularIndeterminateAdvanceAnimatorDelegate(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f14987g = 0;
        this.f14990j = null;
        this.f14986f = circularProgressIndicatorSpec;
        this.f14985e = new a(1);
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void a() {
        ObjectAnimator objectAnimator = this.f14983c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void c() {
        h();
        ObjectAnimator objectAnimator = this.f14983c;
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = this.f14986f;
        objectAnimator.setDuration((long) (circularProgressIndicatorSpec.f14967n * 5400.0f));
        this.f14984d.setDuration((long) (circularProgressIndicatorSpec.f14967n * 333.0f));
        this.f14987g = 0;
        ((DrawingDelegate.ActiveIndicator) this.f15039b.get(0)).f15029c = circularProgressIndicatorSpec.f14959e[0];
        this.f14989i = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void d(c cVar) {
        this.f14990j = cVar;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void e() {
        ObjectAnimator objectAnimator = this.f14984d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f15038a.isVisible()) {
            this.f14984d.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void f() {
        h();
        this.f14987g = 0;
        ((DrawingDelegate.ActiveIndicator) this.f15039b.get(0)).f15029c = this.f14986f.f14959e[0];
        this.f14989i = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f14983c.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void g() {
        this.f14990j = null;
    }

    public final void h() {
        ObjectAnimator objectAnimator = this.f14983c;
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = this.f14986f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<CircularIndeterminateAdvanceAnimatorDelegate, Float>) f14981n, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            this.f14983c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (circularProgressIndicatorSpec.f14967n * 5400.0f));
            this.f14983c.setInterpolator(null);
            this.f14983c.setRepeatCount(-1);
            this.f14983c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate = CircularIndeterminateAdvanceAnimatorDelegate.this;
                    circularIndeterminateAdvanceAnimatorDelegate.f14987g = (circularIndeterminateAdvanceAnimatorDelegate.f14987g + 4) % circularIndeterminateAdvanceAnimatorDelegate.f14986f.f14959e.length;
                }
            });
        }
        if (this.f14984d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<CircularIndeterminateAdvanceAnimatorDelegate, Float>) f14982o, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
            this.f14984d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (circularProgressIndicatorSpec.f14967n * 333.0f));
            this.f14984d.setInterpolator(this.f14985e);
            this.f14984d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate = CircularIndeterminateAdvanceAnimatorDelegate.this;
                    circularIndeterminateAdvanceAnimatorDelegate.a();
                    c cVar = circularIndeterminateAdvanceAnimatorDelegate.f14990j;
                    if (cVar != null) {
                        cVar.a(circularIndeterminateAdvanceAnimatorDelegate.f15038a);
                    }
                }
            });
        }
    }
}
