package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FadeProvider implements VisibilityAnimatorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f15991a = 1.0f;

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.FadeProvider$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f15992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f15993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f15994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f15995d;

        public AnonymousClass1(View view, float f5, float f11, float f12) {
            this.f15992a = view;
            this.f15993b = f5;
            this.f15994c = f11;
            this.f15995d = f12;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f15992a.setAlpha(TransitionUtils.d(this.f15993b, this.f15994c, CropImageView.DEFAULT_ASPECT_RATIO, this.f15995d, fFloatValue, false));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.FadeProvider$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f15996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f15997b;

        public AnonymousClass2(View view, float f5) {
            this.f15996a = view;
            this.f15997b = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f15996a.setAlpha(this.f15997b);
        }
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public final Animator a(View view) {
        float alpha = view.getAlpha() == CropImageView.DEFAULT_ASPECT_RATIO ? 1.0f : view.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AnonymousClass1(view, alpha, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
        valueAnimatorOfFloat.addListener(new AnonymousClass2(view, alpha));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public final Animator b(View view) {
        float alpha = view.getAlpha() == CropImageView.DEFAULT_ASPECT_RATIO ? 1.0f : view.getAlpha();
        float f5 = this.f15991a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AnonymousClass1(view, CropImageView.DEFAULT_ASPECT_RATIO, alpha, f5));
        valueAnimatorOfFloat.addListener(new AnonymousClass2(view, alpha));
        return valueAnimatorOfFloat;
    }
}
