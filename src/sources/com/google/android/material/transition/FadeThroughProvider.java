package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FadeThroughProvider implements VisibilityAnimatorProvider {

    /* JADX INFO: renamed from: com.google.android.material.transition.FadeThroughProvider$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f15899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f15900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f15901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f15902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f15903e;

        public AnonymousClass1(View view, float f5, float f11, float f12, float f13) {
            this.f15899a = view;
            this.f15900b = f5;
            this.f15901c = f11;
            this.f15902d = f12;
            this.f15903e = f13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f15899a.setAlpha(TransitionUtils.d(this.f15900b, this.f15901c, this.f15902d, this.f15903e, fFloatValue, false));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.FadeThroughProvider$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f15904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f15905b;

        public AnonymousClass2(View view, float f5) {
            this.f15904a = view;
            this.f15905b = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f15904a.setAlpha(this.f15905b);
        }
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    public final Animator a(View view) {
        float alpha = view.getAlpha() == CropImageView.DEFAULT_ASPECT_RATIO ? 1.0f : view.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AnonymousClass1(view, alpha, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0.35f));
        valueAnimatorOfFloat.addListener(new AnonymousClass2(view, alpha));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    public final Animator b(View view) {
        float alpha = view.getAlpha() == CropImageView.DEFAULT_ASPECT_RATIO ? 1.0f : view.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AnonymousClass1(view, CropImageView.DEFAULT_ASPECT_RATIO, alpha, 0.35f, 1.0f));
        valueAnimatorOfFloat.addListener(new AnonymousClass2(view, alpha));
        return valueAnimatorOfFloat;
    }
}
