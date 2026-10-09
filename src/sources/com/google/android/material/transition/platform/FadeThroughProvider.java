package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FadeThroughProvider implements VisibilityAnimatorProvider {

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.FadeThroughProvider$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f15998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f15999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f16000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f16001d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f16002e;

        public AnonymousClass1(View view, float f5, float f11, float f12, float f13) {
            this.f15998a = view;
            this.f15999b = f5;
            this.f16000c = f11;
            this.f16001d = f12;
            this.f16002e = f13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f15998a.setAlpha(TransitionUtils.d(this.f15999b, this.f16000c, this.f16001d, this.f16002e, fFloatValue, false));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.FadeThroughProvider$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f16003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f16004b;

        public AnonymousClass2(View view, float f5) {
            this.f16003a = view;
            this.f16004b = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f16003a.setAlpha(this.f16004b);
        }
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public final Animator a(View view) {
        float alpha = view.getAlpha() == CropImageView.DEFAULT_ASPECT_RATIO ? 1.0f : view.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AnonymousClass1(view, alpha, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0.35f));
        valueAnimatorOfFloat.addListener(new AnonymousClass2(view, alpha));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public final Animator b(View view) {
        float alpha = view.getAlpha() == CropImageView.DEFAULT_ASPECT_RATIO ? 1.0f : view.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AnonymousClass1(view, CropImageView.DEFAULT_ASPECT_RATIO, alpha, 0.35f, 1.0f));
        valueAnimatorOfFloat.addListener(new AnonymousClass2(view, alpha));
        return valueAnimatorOfFloat;
    }
}
