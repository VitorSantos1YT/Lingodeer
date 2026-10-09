package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialBottomContainerBackHelper extends MaterialBackAnimationHelper<View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f14802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f14803h;

    public MaterialBottomContainerBackHelper(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f14802g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f14803h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f14791b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i11), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new r6.a(1));
        return animatorSet;
    }

    public final void b(f.a aVar, Animator.AnimatorListener animatorListener) {
        View view = this.f14791b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        objectAnimatorOfFloat.setInterpolator(new r6.a(1));
        objectAnimatorOfFloat.setDuration(AnimationUtils.c(this.f14792c, aVar.f26117c, this.f14793d));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialBottomContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                MaterialBottomContainerBackHelper materialBottomContainerBackHelper = MaterialBottomContainerBackHelper.this;
                materialBottomContainerBackHelper.f14791b.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                materialBottomContainerBackHelper.c(CropImageView.DEFAULT_ASPECT_RATIO);
            }
        });
        objectAnimatorOfFloat.addListener(animatorListener);
        objectAnimatorOfFloat.start();
    }

    public final void c(float f5) {
        float interpolation = this.f14790a.getInterpolation(f5);
        View view = this.f14791b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= CropImageView.DEFAULT_ASPECT_RATIO || height <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        float f11 = this.f14802g / width;
        float f12 = this.f14803h / height;
        float fA = 1.0f - AnimationUtils.a(CropImageView.DEFAULT_ASPECT_RATIO, f11, interpolation);
        float fA2 = 1.0f - AnimationUtils.a(CropImageView.DEFAULT_ASPECT_RATIO, f12, interpolation);
        if (Float.isNaN(fA) || Float.isNaN(fA2)) {
            return;
        }
        view.setScaleX(fA);
        view.setPivotY(height);
        view.setScaleY(fA2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fA2 != CropImageView.DEFAULT_ASPECT_RATIO ? fA / fA2 : 1.0f);
            }
        }
    }
}
