package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f14812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f14813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f14814i;

    public MaterialSideContainerBackHelper(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f14812g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f14813h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f14814i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a() {
        f.a aVar = this.f14795f;
        this.f14795f = null;
        if (aVar == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f14791b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i11), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f14794e);
        animatorSet.start();
    }

    public final void b(f.a aVar, final int i11, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i12;
        final boolean z11 = aVar.f26118d == 0;
        View view = this.f14791b;
        boolean z12 = (Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 3) == 3;
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i12 = z12 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i12 = 0;
        }
        float f5 = scaleX + i12;
        Property property = View.TRANSLATION_X;
        if (z12) {
            f5 = -f5;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f5);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new r6.a(1));
        objectAnimatorOfFloat.setDuration(AnimationUtils.c(this.f14792c, aVar.f26117c, this.f14793d));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                MaterialSideContainerBackHelper materialSideContainerBackHelper = MaterialSideContainerBackHelper.this;
                materialSideContainerBackHelper.f14791b.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                materialSideContainerBackHelper.c(CropImageView.DEFAULT_ASPECT_RATIO, i11, z11);
            }
        });
        objectAnimatorOfFloat.addListener(animatorListenerAdapter);
        objectAnimatorOfFloat.start();
    }

    public final void c(float f5, int i11, boolean z11) {
        float interpolation = this.f14790a.getInterpolation(f5);
        View view = this.f14791b;
        boolean z12 = (Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 3) == 3;
        boolean z13 = z11 == z12;
        int width = view.getWidth();
        int height = view.getHeight();
        float f11 = width;
        if (f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
            float f12 = height;
            if (f12 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            float f13 = this.f14812g / f11;
            float f14 = this.f14813h / f11;
            float f15 = this.f14814i / f12;
            if (z12) {
                f11 = 0.0f;
            }
            view.setPivotX(f11);
            if (!z13) {
                f14 = -f13;
            }
            float fA = AnimationUtils.a(CropImageView.DEFAULT_ASPECT_RATIO, f14, interpolation);
            float f16 = fA + 1.0f;
            float fA2 = 1.0f - AnimationUtils.a(CropImageView.DEFAULT_ASPECT_RATIO, f15, interpolation);
            if (Float.isNaN(f16) || Float.isNaN(fA2)) {
                return;
            }
            view.setScaleX(f16);
            view.setScaleY(fA2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    childAt.setPivotX(z12 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z13 ? 1.0f - fA : 1.0f;
                    float f18 = fA2 != CropImageView.DEFAULT_ASPECT_RATIO ? (f16 / fA2) * f17 : 1.0f;
                    if (!Float.isNaN(f17) && !Float.isNaN(f18)) {
                        childAt.setScaleX(f17);
                        childAt.setScaleY(f18);
                    }
                }
            }
        }
    }
}
